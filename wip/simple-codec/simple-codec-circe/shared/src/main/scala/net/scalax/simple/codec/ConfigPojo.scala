package net.scalax.simple
package codec

import io.circe.generic.extras.JsonKey
import net.scalax.simple.adt.nat.support.{ABCFunc, FromToFunc}
import net.scalax.simple.adt.nat.support.v5.AppenderSupport1
import net.scalax.simple.codec.to_list_generic.BasedInstalledSimpleProduct

trait ConfigPojo[F[_[_]]] { Self =>
  type StrF[_]    = String
  type OptVal[U1] = Option[() => U1]

  def labelledValueFunc: F[StrF] => F[StrF]
  def defaultValue: Option[F[OptVal]]

  def mapLabelled(func: F[StrF] => F[StrF]): ConfigPojo[F] = new ConfigPojo[F] {
    InnerSelf =>
    override def labelledValueFunc: F[StrF] => F[StrF] =
      Self.labelledValueFunc.andThen(func)
    override def defaultValue: Option[F[OptVal]] = Self.defaultValue
  }

  def fillDefaultValue(func: F[OptVal]): ConfigPojo[F] = new ConfigPojo[F] { InnerSelf =>
    override def labelledValueFunc: F[StrF] => F[StrF] = Self.labelledValueFunc
    override def defaultValue: Option[F[OptVal]]       = Some(func)
  }

}

object ConfigPojo {
  type StrF[_] = String

  def fromAnnotation[F[_[_]]](ann: ModelAnnotations[F, JsonKey])(implicit bs: BasedInstalledSimpleProduct[F]): F[StrF] => F[StrF] = {
    type Type2[T]       = Option[JsonKey]
    type MFunc[A, B, C] = (A, B) => C

    val appender = new AppenderSupport1.Simple3.Appender[MFunc, StrF, Type2, StrF] {
      override def append[T, B1, B2, B3, C1, C2, C3](
        abc1: ABCFunc[String, B1, C1],
        abc2: ABCFunc[Option[JsonKey], B2, C2],
        abc3: ABCFunc[String, B3, C3],
        ma: (B1, B2) => B3
      ): (C1, C2) => C3 = (c1: C1, c2: C2) => {
        val str1: String             = abc1.takeHead(c1)
        val b1: B1                   = abc1.takeTail(c1)
        val jsonKey: Option[JsonKey] = abc2.takeHead(c2)
        val b2: B2                   = abc2.takeTail(c2)
        val b3: B3                   = ma(b1, b2)
        val newName: String          = jsonKey.fold[String](str1)(jk => jk.value)

        abc3.append(newName, b3)
      }
    }

    val zero: AppenderSupport1.Simple3.One[MFunc, StrF, Type2, StrF] = new AppenderSupport1.Simple3.One[MFunc, StrF, Type2, StrF] {
      override def one[T, B1, B2, B3](
        func1: FromToFunc[String, B1],
        func2: FromToFunc[Option[JsonKey], B2],
        func3: FromToFunc[String, B3]
      ): (B1, B2) => B3 = (b1, b2) => {
        val stringKey = func2.to(b2).fold(func1.to(b1))(t => t.value)
        func3.from(stringKey)
      }
    }

    val func: (F[StrF], F[Type2]) => F[StrF] =
      bs.simpleRunner.simpleRelease3.append[MFunc, StrF, Type2, StrF](appender = appender, zero = zero)

    (labelled: F[StrF]) => func(labelled, ann.annInstance)
  }

}
