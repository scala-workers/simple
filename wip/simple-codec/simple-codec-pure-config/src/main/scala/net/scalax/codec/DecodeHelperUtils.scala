package net.scalax.simple.codec.pureconfig

import net.scalax.simple.codec.to_list_generic.BasedInstalledSimpleProduct
import pureconfig.ConfigReader.Result
import pureconfig._
import net.scalax.simple.adt.nat.support.{ABCFunc, SimpleProduct2 => SP2, SimpleProduct4 => SP4, SimpleProductContextX}
import net.scalax.simple.codec.GetFieldModel
import pureconfig.error.ConfigReaderFailures

object DecodeHelperUtils {

  /*trait DecodeHelper[A, B, T, DefaultValue] {
    def fromSource(name: A, reader: B, source: ConfigObjectCursor, defInit: DefaultValue): ConfigReader.Result[T]
  }

  def scalaM[F[_[_]]](
    sp: SimpleProductContextX[F],
    name: F[({ type NamedF[_] = String })#NamedF],
    readers: () => F[ConfigReader],
    defaultValue: Option[F[({ type OptF[TU] = Option[() => TU] })#OptF]]
  ): ConfigReader[F[({ type IdF[U] = U })#IdF]] = {
    type OptF[TU]    = Option[() => TU]
    type OptFGet[TU] = F[OptF] => OptF[TU]

    val getField: GetFieldModel[F] = GetFieldModel[F].derived(sp.simpleProduct2)

    val typeGen: SP4.TypeGen[DecodeHelper, ({ type NamedF[_] = String })#NamedF, ConfigReader, ({ type IdF[U] = U })#IdF, OptFGet] =
      new SP4.TypeGen[DecodeHelper, ({ type NamedF[_] = String })#NamedF, ConfigReader, ({ type IdF[U] = U })#IdF, OptFGet] {
        override def gen[Item]: DecodeHelper[String, ConfigReader[Item], Item, F[OptF] => Option[() => Item]] =
          new DecodeHelper[String, ConfigReader[Item], Item, F[OptF] => Option[() => Item]] {
            override def fromSource(
              name: String,
              configReader: ConfigReader[Item],
              source: ConfigObjectCursor,
              defInit: F[OptF] => Option[() => Item]
            ): Result[Item] = {
              val initValue: Result[Item] =
                for {
                  value1 <- source.atKey(name)
                  value2 <- configReader.from(value1)
                } yield value2

              initValue.fold[Result[Item]](
                (err: ConfigReaderFailures) => {
                  defaultValue.fold[Result[Item]](Left(err))(haveDe =>
                    defInit(haveDe).fold[Result[Item]](Left(err))((defaultValueInstance: () => Item) => Right(defaultValueInstance()))
                  )
                },
                (item: Item) => Right(item)
              )
            }
          }
      }

    val proApp: SP4.SimpleAppender[DecodeHelper] = new SP4.SimpleAppender[DecodeHelper] {
      override def append[A1, A2, A3, A4, B1, B2, B3, B4, C1, C2, C3, C4](
        f1: ABCFunc[A1, B1, C1],
        f2: ABCFunc[A2, B2, C2],
        f3: ABCFunc[A3, B3, C3],
        f4: ABCFunc[A4, B4, C4]
      )(
        a: DecodeHelper[A1, A2, A3, A4],
        b: DecodeHelper[B1, B2, B3, B4]
      ): DecodeHelper[C1, C2, C3, C4] = new DecodeHelper[C1, C2, C3, C4] {
        override def fromSource(name: C1, reader: C2, source: ConfigObjectCursor, de: C4): ConfigReader.Result[C3] = {
          val a1: A1 = f1.takeHead(name)
          val b1: B1 = f1.takeTail(name)
          val a2: A2 = f2.takeHead(reader)
          val b2: B2 = f2.takeTail(reader)
          val a4: A4 = f4.takeHead(de)
          val b4: B4 = f4.takeTail(de)

          for {
            valueA <- a.fromSource(a1, a2, source, a4)
            valueB <- b.fromSource(b1, b2, source, b4)
          } yield f3.append(valueA, valueB)
        }
      }

      override def zero[N1, N2, N3, N4](p1: N1, p2: N2, p3: N3, p4: N4): DecodeHelper[N1, N2, N3, N4] = new DecodeHelper[N1, N2, N3, N4] {
        override def fromSource(name: N1, reader: N2, source: ConfigObjectCursor, de: N4): Result[N3] = Right(p3)
      }
    }

    val appender =
      sp.simpleProduct4.append[
        DecodeHelper,
        ({ type NamedF[_] = String })#NamedF,
        ConfigReader,
        ({ type IdF[U] = U })#IdF,
        OptFGet
      ](
        typeGen = typeGen,
        sAppender = proApp
      )

    ConfigReader.fromCursor(fromF =>
      for {
        valueA <- fromF.asObjectCursor
        valueB <- appender.fromSource(name, readers(), valueA, getField.getFieldModel[OptF])
      } yield valueB
    )
  }*/

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
