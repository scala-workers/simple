package net.scalax.simple.codec.pureconfig

import com.typesafe.config.{ConfigFactory, ConfigObject, ConfigValue}
import net.scalax.simple.adt.nat.support.v5.AppenderSupport1
import net.scalax.simple.adt.nat.support.{ABCFunc, SimpleProduct3 => SP3}
import pureconfig._

import scala.jdk.CollectionConverters._

object EncodeHelperUtils {
  type Named[_]  = String
  type IdType[T] = T

  type EncodeAction[Name, Enc, Model] = (Name, Enc, Model) => ConfigObject

  def encodeImpl[F[_[_]]](
    sp3: AppenderSupport1.Simple3.Runner[F],
    namedIns: F[Named],
    encIns: () => F[ConfigWriter]
  ): F[IdType] => ConfigValue = {
    val appender: AppenderSupport1.Simple3.Appender[EncodeAction, Named, ConfigWriter, IdType] =
      new AppenderSupport1.Simple3.Appender[EncodeAction, Named, ConfigWriter, IdType] {
        override def append[T, B1, B2, B3, C1, C2, C3](
          abc1: ABCFunc[String, B1, C1],
          abc2: ABCFunc[ConfigWriter[T], B2, C2],
          abc3: ABCFunc[T, B3, C3],
          ma: EncodeAction[B1, B2, B3]
        ): EncodeAction[C1, C2, C3] = (c1: C1, c2: C2, c3: C3) => {
          val nameStr: String        = abc1.takeHead(c1)
          val b1: B1                 = abc1.takeTail(c1)
          val conWT: ConfigWriter[T] = abc2.takeHead(c2)
          val b2: B2                 = abc2.takeTail(c2)
          val t: T                   = abc3.takeHead(c3)
          val b3: B3                 = abc3.takeTail(c3)
          val confObj: ConfigObject  = ma(b1, b2, b3)
          confObj.withValue(nameStr, conWT.to(t))
        }
      }

    val zero: AppenderSupport1.Simple3.Zero[EncodeAction] = new AppenderSupport1.Simple3.Zero[EncodeAction] {
      override def zero[B1, B2, B3](b1: B1, b2: B2, b3: B3): EncodeAction[B1, B2, B3] = (b1: B1, b2: B2, b3: B3) => {
        ConfigFactory.parseMap(Map.empty[String, ConfigValue].asJava).root()
      }
    }

    val encodeFunc: EncodeAction[F[Named], F[ConfigWriter], F[IdType]] =
      sp3.append[EncodeAction, Named, ConfigWriter, IdType](appender = appender, zero = zero)

    (u: F[IdType]) => encodeFunc(namedIns, encIns(), u)
  }

}
