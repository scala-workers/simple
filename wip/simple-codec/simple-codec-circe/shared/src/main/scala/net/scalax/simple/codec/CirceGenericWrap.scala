package net.scalax.simple.codec.circe

import io.circe.Decoder.Result
import io.circe._
import io.circe.syntax._
import net.scalax.simple.adt.nat.support.{ABCFunc, SimpleProduct3 => SP3}

object EncodeHelperUtils {
  type Named[_]  = String
  type IdType[T] = T

  private trait EncodeAction[Name, Enc, Model] {
    def toJson(n: Name, enc: Enc, id: Model, l: List[(String, Json)]): List[(String, Json)]
  }

  def encodeImpl[F[_[_]]](sp3: SP3.ProductAdapter[F], namedIns: F[Named], encIns: () => F[Encoder]): F[IdType] => Json = {
    val typeGen: SP3.TypeGen[EncodeAction, Named, Encoder, IdType] = new SP3.TypeGen[EncodeAction, Named, Encoder, IdType] {
      override def gen[T]: EncodeAction[String, Encoder[T], T] = new EncodeAction[String, Encoder[T], T] {
        override def toJson(n: String, enc: Encoder[T], id: T, l: List[(String, Json)]): List[(String, Json)] = (n, enc(id)) :: l
      }
    }

    val appender: SP3.SimpleAppender[EncodeAction] = new SP3.SimpleAppender[EncodeAction] {
      override def append[A1, A2, A3, B1, B2, B3, C1, C2, C3](f1: ABCFunc[A1, B1, C1], f2: ABCFunc[A2, B2, C2], f3: ABCFunc[A3, B3, C3])(
        a: EncodeAction[A1, A2, A3],
        b: EncodeAction[B1, B2, B3]
      ): EncodeAction[C1, C2, C3] = new EncodeAction[C1, C2, C3] {
        override def toJson(n: C1, enc: C2, id: C3, l: List[(String, Json)]): List[(String, Json)] = {
          val valueA: List[(String, Json)] = a.toJson(f1.takeHead(n), f2.takeHead(enc), f3.takeHead(id), l)
          b.toJson(f1.takeTail(n), f2.takeTail(enc), f3.takeTail(id), valueA)
        }
      }

      override def zero[N1, N2, N3](p1: N1, p2: N2, p3: N3): EncodeAction[N1, N2, N3] = new EncodeAction[N1, N2, N3] {
        override def toJson(n: N1, reader: N2, source: N3, temp: List[(String, Json)]): List[(String, Json)] = temp
      }
    }

    val encodeFunc: EncodeAction[F[Named], F[Encoder], F[IdType]] =
      sp3.append[EncodeAction, Named, Encoder, IdType](typeGen = typeGen, sAppender = appender)

    (model: F[IdType]) => {
      val list: List[(String, Json)] = encodeFunc.toJson(namedIns, encIns(), model, List.empty)
      Json.fromJsonObject(JsonObject.fromIterable(list))
    }
  }

  private trait DecodeJson[Name, Dec, Model] {
    def fromJson(n: Name, enc: Dec): Decoder.Result[Model]
  }

  def decodeModelImpl[F[_[_]]](
    sp3: SP3.ProductAdapter[F],
    named: F[Named],
    g: () => F[Decoder]
  ): HCursor => Decoder.Result[F[cats.Id]] = (hCursor: HCursor) => {
    val appender: SP3.SimpleAppender[DecodeJson] = new SP3.SimpleAppender[DecodeJson] {
      override def append[A1, A2, A3, B1, B2, B3, C1, C2, C3](
        cxF1: ABCFunc[A1, B1, C1],
        cxF2: ABCFunc[A2, B2, C2],
        cxF3: ABCFunc[A3, B3, C3]
      )(
        ma: DecodeJson[A1, A2, A3],
        mb: DecodeJson[B1, B2, B3]
      ): DecodeJson[C1, C2, C3] = new DecodeJson[C1, C2, C3] {
        override def fromJson(n: C1, enc: C2): Result[C3] = for {
          t1 <- ma.fromJson(cxF1.takeHead(n), cxF2.takeHead(enc))
          t2 <- mb.fromJson(cxF1.takeTail(n), cxF2.takeTail(enc))
        } yield cxF3.append(t1, t2)
      }
      override def zero[N1, N2, N3](n1: N1, n2: N2, n3: N3): DecodeJson[N1, N2, N3] = new DecodeJson[N1, N2, N3] {
        override def fromJson(n: N1, enc: N2): Result[N3] = Right(n3)
      }
    }

    val typeGen: SP3.TypeGen[DecodeJson, Named, Decoder, cats.Id] = new SP3.TypeGen[DecodeJson, Named, Decoder, cats.Id] {
      override def gen[T]: DecodeJson[String, Decoder[T], T] = new DecodeJson[String, Decoder[T], T] {
        override def fromJson(n: String, dec: Decoder[T]): Decoder.Result[T] = hCursor.downField(n).as(dec)
      }
    }

    val decoderFunc: DecodeJson[F[Named], F[Decoder], F[cats.Id]] = sp3.append(typeGen = typeGen, sAppender = appender)

    decoderFunc.fromJson(named, g())
  }

}
