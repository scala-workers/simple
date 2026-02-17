package net.scalax.simple.codec.pureconfig

import com.typesafe.config.ConfigValue
import net.scalax.simple.codec.to_list_generic.BasedInstalledSimpleProduct
import pureconfig._

object EncodeHelperUtils {

  trait EncodeHelper[A, B, T] {
    def fromSource(name: A, reader: B, identityValue: T, temp: List[(String, ConfigValue)]): List[(String, ConfigValue)]
  }

  def scalaM[F[_[_]]](
    name: F[({ type NamedF[_] = String })#NamedF],
    readers: () => F[ConfigWriter],
    sp: BasedInstalledSimpleProduct[F]
  ): ConfigWriter[F[({ type IdF[U] = U })#IdF]] = {
    import net.scalax.simple.adt.nat.support.{SimpleProduct3 => SP3, ABCFunc}
    val typeGen: SP3.TypeGen[EncodeHelper, ({ type NamedF[_] = String })#NamedF, ConfigWriter, ({ type IdF[U] = U })#IdF] =
      new SP3.TypeGen[EncodeHelper, ({ type NamedF[_] = String })#NamedF, ConfigWriter, ({ type IdF[U] = U })#IdF] {
        override def gen[Item]: EncodeHelper[String, ConfigWriter[Item], Item] = new EncodeHelper[String, ConfigWriter[Item], Item] {
          override def fromSource(
            name: String,
            configReader: ConfigWriter[Item],
            source: Item,
            temp: List[(String, ConfigValue)]
          ): List[(String, ConfigValue)] = (name, configReader.to(source)) +: temp
        }
      }

    val proApp: SP3.SimpleAppender[EncodeHelper] = new SP3.SimpleAppender[EncodeHelper] {
      override def append[A1, A2, A3, B1, B2, B3, C1, C2, C3](f1: ABCFunc[A1, B1, C1], f2: ABCFunc[A2, B2, C2], f3: ABCFunc[A3, B3, C3])(
        a: EncodeHelper[A1, A2, A3],
        b: EncodeHelper[B1, B2, B3]
      ): EncodeHelper[C1, C2, C3] = new EncodeHelper[C1, C2, C3] {
        override def fromSource(name: C1, reader: C2, source: C3, temp: List[(String, ConfigValue)]): List[(String, ConfigValue)] = {
          val a1: A1 = f1.takeHead(name)
          val b1: B1 = f1.takeTail(name)
          val a2: A2 = f2.takeHead(reader)
          val b2: B2 = f2.takeTail(reader)
          val a3: A3 = f3.takeHead(source)
          val b3: B3 = f3.takeTail(source)

          val valueA: List[(String, ConfigValue)] = a.fromSource(a1, a2, a3, temp)
          val valueB: List[(String, ConfigValue)] = b.fromSource(b1, b2, b3, valueA)

          valueB
        }
      }

      override def zero[N1, N2, N3](p1: N1, p2: N2, p3: N3): EncodeHelper[N1, N2, N3] = new EncodeHelper[N1, N2, N3] {
        override def fromSource(name: N1, reader: N2, source: N3, temp: List[(String, ConfigValue)]): List[(String, ConfigValue)] = temp
      }
    }

    val appender =
      sp.basedInstalled.simpleProduct3.append[EncodeHelper, ({ type NamedF[_] = String })#NamedF, ConfigWriter, ({ type IdF[U] = U })#IdF](
        typeGen = typeGen,
        sAppender = proApp
      )

    val confW = implicitly[ConfigWriter[Map[String, ConfigValue]]]

    ConfigWriter.fromFunction[F[({ type IDF[T1] = T1 })#IDF]]((u: F[({ type IDF[T1] = T1 })#IDF]) => {
      val configMap = appender.fromSource(name, readers(), u, List.empty[(String, ConfigValue)])
      confW.to(Map.from(configMap))
    })
  }

}
