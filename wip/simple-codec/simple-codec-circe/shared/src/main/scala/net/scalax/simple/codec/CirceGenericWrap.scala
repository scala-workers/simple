package net.scalax.simple.codec.circe

import io.circe._
import net.scalax.simple.adt.nat.support.v5.AppenderSupport1
import net.scalax.simple.adt.nat.support.{ABCFunc, SimpleProduct2 => SP2}
import net.scalax.simple.codec.GetFieldModel

object EncodeHelperUtils {
  type Named[_]  = String
  type IdType[T] = T

  type EncodeAction[Name, Enc, Model] = (Name, Enc, Model) => List[(String, Json)]

  def encodeImpl[F[_[_]]](sp3: AppenderSupport1.Simple3.Runner[F], namedIns: F[Named], encIns: () => F[Encoder]): F[IdType] => Json = {
    val zero3: AppenderSupport1.Simple3.Zero[EncodeAction] = new AppenderSupport1.Simple3.Zero[EncodeAction] {
      override def zero[B1, B2, B3](b1: B1, b2: B2, b3: B3): EncodeAction[B1, B2, B3] = (n: B1, enc: B2, id: B3) =>
        List.empty[(String, Json)]
    }

    val mapper: AppenderSupport1.Simple3.Mapper[EncodeAction, Named, Encoder, IdType] =
      new AppenderSupport1.Simple3.Mapper[EncodeAction, Named, Encoder, IdType] {
        override def map[T, B1, B2, B3](
          func1To: String => B1,
          func1From: B1 => String,
          func2To: Encoder[T] => B2,
          func2From: B2 => Encoder[T],
          func3To: T => B3,
          func3From: B3 => T
        ): (B1, B2, B3) => List[(String, Json)] = (b1: B1, b2: B2, b3: B3) => {
          val nameStr: String = func1From(b1)
          val en: Encoder[T]  = func2From(b2)
          val t: T            = func3From(b3)

          List((nameStr, en(t)))
        }
      }

    val appender3: AppenderSupport1.Simple3.Appender[EncodeAction, Named, Encoder, IdType] =
      new AppenderSupport1.Simple3.Appender[EncodeAction, Named, Encoder, IdType] {
        override def append[T, B1, B2, B3, C1, C2, C3](
          abc1: ABCFunc[String, B1, C1],
          abc2: ABCFunc[Encoder[T], B2, C2],
          abc3: ABCFunc[T, B3, C3],
          ma: EncodeAction[B1, B2, B3]
        ): EncodeAction[C1, C2, C3] = (n: C1, enc: C2, id: C3) => {
          val str: String                  = abc1.takeHead(n)
          val b1: B1                       = abc1.takeTail(n)
          val encoderT: Encoder[T]         = abc2.takeHead(enc)
          val b2: B2                       = abc2.takeTail(enc)
          val t: T                         = abc3.takeHead(id)
          val b3: B3                       = abc3.takeTail(id)
          val maJson: List[(String, Json)] = ma(b1, b2, b3)
          val jPro: Json                   = encoderT(t)
          (str, jPro) :: maJson
        }

      }

    val action = sp3.append[EncodeAction, Named, Encoder, IdType](appender3, zero3)

    (model: F[IdType]) => Json.fromJsonObject(JsonObject.fromIterable(action(namedIns, encIns(), model)))
  }

  type DecodeJson[Name, Dec, Model, DefaultValue] = (Name, Dec, DefaultValue) => Decoder.Result[Model]

  def decodeImpl[F[_[_]]](
    sp2: AppenderSupport1.Simple2.Runner[F],
    sp4: AppenderSupport1.Simple4.Runner[F],
    named: F[Named],
    g: () => F[Decoder],
    defaultValue: Option[F[({ type OptF[TU] = Option[() => TU] })#OptF]]
  ): HCursor => Decoder.Result[F[IdType]] = (hCursor: HCursor) => {
    type OptF[TU]    = Option[() => TU]
    type OptFGet[TU] = F[OptF] => OptF[TU]

    val getField: GetFieldModel[F] = GetFieldModel[F].derived(sp2)

    val zero4: AppenderSupport1.Simple4.Zero[DecodeJson] = new AppenderSupport1.Simple4.Zero[DecodeJson] {
      override def zero[B1, B2, B3, B4](b1: B1, b2: B2, b3: B3, b4: B4): DecodeJson[B1, B2, B3, B4] = (n: B1, enc: B2, defVal: B4) =>
        Right(b3)
    }

    val appender4: AppenderSupport1.Simple4.Appender[DecodeJson, Named, Decoder, IdType, OptFGet] =
      new AppenderSupport1.Simple4.Appender[DecodeJson, Named, Decoder, IdType, OptFGet] {
        override def append[T, B1, B2, B3, B4, C1, C2, C3, C4](
          abc1: ABCFunc[String, B1, C1],
          abc2: ABCFunc[Decoder[T], B2, C2],
          abc3: ABCFunc[T, B3, C3],
          abc4: ABCFunc[F[OptF] => Option[() => T], B4, C4],
          ma: DecodeJson[B1, B2, B3, B4]
        ): DecodeJson[C1, C2, C3, C4] = (n: C1, dec: C2, defVal: C4) => {
          val nameStr: String                    = abc1.takeHead(n)
          val b1: B1                             = abc1.takeTail(n)
          val decoderT: Decoder[T]               = abc2.takeHead(dec)
          val b2: B2                             = abc2.takeTail(dec)
          val optGet: F[OptF] => Option[() => T] = abc4.takeHead(defVal)
          val b4: B4                             = abc4.takeTail(defVal)
          val b3Result: Decoder.Result[B3]       = ma(b1, b2, b4)
          val value1: Decoder.Result[T]          = hCursor.downField(nameStr).as(decoderT)
          val value2: Decoder.Result[T] = if (value1.isLeft) {
            val optIns = defaultValue.flatMap(optGet)
            optIns.fold[Decoder.Result[T]](value1)(rValue1 => Right(rValue1()))
          } else value1

          for {
            v1 <- value2
            v2 <- b3Result
          } yield abc3.append(v1, v2)
        }
      }

    val decoderFunc: DecodeJson[F[Named], F[Decoder], F[IdType], F[OptFGet]] =
      sp4.append[DecodeJson, Named, Decoder, IdType, OptFGet](appender4, zero4)

    decoderFunc(named, g(), getField.getFieldModel[OptF])
  }

}
