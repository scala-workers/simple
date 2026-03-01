package net.scalax.simple.codec.pureconfig

import net.scalax.simple.codec.to_list_generic.BasedInstalledSimpleProduct
import pureconfig.ConfigReader.Result
import pureconfig._
import net.scalax.simple.adt.nat.support.{ABCFunc, SimpleProduct2 => SP2, SimpleProduct4 => SP4, SimpleProductContextX}
import net.scalax.simple.codec.GetFieldModel
import pureconfig.error.ConfigReaderFailures

object DecodeHelperUtils {

  type Named[_]  = String
  type IdType[T] = T

  private trait DecodeJson[Name, Dec, Model, DefaultValue] {
    def fromJson(n: Name, enc: Dec, defVal: DefaultValue): ConfigReader.Result[Model]
  }

  def decodeImpl[F[_[_]]](
    sp2: SP2.ProductAdapter[F],
    sp4: SP4.ProductAdapter[F],
    named: F[Named],
    g: () => F[ConfigReader],
    defaultValue: Option[F[({ type OptF[TU] = Option[() => TU] })#OptF]]
  ): ConfigObjectCursor => ConfigReader.Result[F[IdType]] = (hCursor: ConfigObjectCursor) => {
    type OptF[TU]    = Option[() => TU]
    type OptFGet[TU] = F[OptF] => OptF[TU]

    val getField: GetFieldModel[F] = GetFieldModel[F].derived(sp2)

    val appender: SP4.SimpleAppender[DecodeJson] = new SP4.SimpleAppender[DecodeJson] {
      override def append[A1, A2, A3, A4, B1, B2, B3, B4, C1, C2, C3, C4](
        cxF1: ABCFunc[A1, B1, C1],
        cxF2: ABCFunc[A2, B2, C2],
        cxF3: ABCFunc[A3, B3, C3],
        cxF4: ABCFunc[A4, B4, C4]
      )(
        ma: DecodeJson[A1, A2, A3, A4],
        mb: DecodeJson[B1, B2, B3, B4]
      ): DecodeJson[C1, C2, C3, C4] = new DecodeJson[C1, C2, C3, C4] {
        override def fromJson(n: C1, enc: C2, de: C4): Result[C3] = for {
          t1 <- ma.fromJson(cxF1.takeHead(n), cxF2.takeHead(enc), cxF4.takeHead(de))
          t2 <- mb.fromJson(cxF1.takeTail(n), cxF2.takeTail(enc), cxF4.takeTail(de))
        } yield cxF3.append(t1, t2)
      }
      override def zero[N1, N2, N3, N4](n1: N1, n2: N2, n3: N3, n4: N4): DecodeJson[N1, N2, N3, N4] = new DecodeJson[N1, N2, N3, N4] {
        override def fromJson(n: N1, enc: N2, de: N4): Result[N3] = Right(n3)
      }
    }

    val typeGen: SP4.TypeGen[DecodeJson, Named, ConfigReader, IdType, OptFGet] =
      new SP4.TypeGen[DecodeJson, Named, ConfigReader, IdType, OptFGet] {
        override def gen[T]: DecodeJson[String, ConfigReader[T], T, F[OptF] => Option[() => T]] =
          new DecodeJson[String, ConfigReader[T], T, F[OptF] => Option[() => T]] {
            override def fromJson(n: String, dec: ConfigReader[T], defVal: F[OptF] => Option[() => T]): ConfigReader.Result[T] = {
              val value1: ConfigReader.Result[T] = for {
                v1 <- hCursor.atKey(n)
                v2 <- dec.from(v1)
              } yield v2

              value1.fold[ConfigReader.Result[T]](
                (err: ConfigReaderFailures) =>
                  defaultValue.fold[ConfigReader.Result[T]](Left(err))(r =>
                    defVal(r).fold[ConfigReader.Result[T]](Left(err))(rValue1 => Right(rValue1()))
                  ),
                rV => Right(rV)
              )
            }
          }
      }

    val decoderFunc: DecodeJson[F[Named], F[ConfigReader], F[IdType], F[OptFGet]] =
      sp4.append[DecodeJson, Named, ConfigReader, IdType, OptFGet](typeGen = typeGen, sAppender = appender)

    decoderFunc.fromJson(named, g(), getField.getFieldModel[OptF])
  }

}
