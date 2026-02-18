package net.scalax.simple.codec.pureconfig

import com.typesafe.config.ConfigValue
import net.scalax.simple.adt.nat.support.{ABCFunc, SimpleProduct3 => SP3}

import pureconfig._

object EncodeHelperUtils {
  type Named[_]  = String
  type IdType[T] = T

  private trait EncodeAction[Name, Enc, Model] {
    def toJson(n: Name, enc: Enc, id: Model, l: List[(String, ConfigValue)]): List[(String, ConfigValue)]
  }

  def encodeImpl[F[_[_]]](sp3: SP3.ProductAdapter[F], namedIns: F[Named], encIns: () => F[ConfigWriter]): F[IdType] => ConfigValue = {
    val typeGen: SP3.TypeGen[EncodeAction, Named, ConfigWriter, IdType] = new SP3.TypeGen[EncodeAction, Named, ConfigWriter, IdType] {
      override def gen[Item]: EncodeAction[String, ConfigWriter[Item], Item] = new EncodeAction[String, ConfigWriter[Item], Item] {
        override def toJson(n: String, enc: ConfigWriter[Item], id: Item, l: List[(String, ConfigValue)]): List[(String, ConfigValue)] =
          (n, enc.to(id)) :: l
      }
    }

    val appender: SP3.SimpleAppender[EncodeAction] = new SP3.SimpleAppender[EncodeAction] {
      override def append[A1, A2, A3, B1, B2, B3, C1, C2, C3](f1: ABCFunc[A1, B1, C1], f2: ABCFunc[A2, B2, C2], f3: ABCFunc[A3, B3, C3])(
        a: EncodeAction[A1, A2, A3],
        b: EncodeAction[B1, B2, B3]
      ): EncodeAction[C1, C2, C3] = new EncodeAction[C1, C2, C3] {
        override def toJson(n: C1, enc: C2, id: C3, l: List[(String, ConfigValue)]): List[(String, ConfigValue)] = {
          val valueA: List[(String, ConfigValue)] = a.toJson(f1.takeHead(n), f2.takeHead(enc), f3.takeHead(id), l)
          b.toJson(f1.takeTail(n), f2.takeTail(enc), f3.takeTail(id), valueA)
        }
      }

      override def zero[N1, N2, N3](p1: N1, p2: N2, p3: N3): EncodeAction[N1, N2, N3] = new EncodeAction[N1, N2, N3] {
        override def toJson(n: N1, enc: N2, id: N3, l: List[(String, ConfigValue)]): List[(String, ConfigValue)] = l
      }
    }

    val encodeFunc: EncodeAction[F[Named], F[ConfigWriter], F[IdType]] =
      sp3.append[EncodeAction, Named, ConfigWriter, IdType](typeGen = typeGen, sAppender = appender)

    (u: F[IdType]) => {
      val list = encodeFunc.toJson(namedIns, encIns(), u, List.empty[(String, ConfigValue)])
      ConfigWriter[Map[String, ConfigValue]].to(Map.from(list))
    }
  }

}
