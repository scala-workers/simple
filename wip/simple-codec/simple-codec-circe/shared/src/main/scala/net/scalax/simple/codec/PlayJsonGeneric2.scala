package net.scalax.simple
package codec

import play.api.libs.json._
import play.api.libs.json.Reads._
import play.api.libs.functional.syntax._
import net.scalax.simple.adt.nat.support.{ABCFunc, SimpleProduct2 => SP2, SimpleProduct3 => SP3, SimpleProduct4 => SP4}

object PlayJsonGeneric2 {
  type Named[_]  = String
  type IdType[T] = T

  private trait EncodeAction[Name, Enc, Model] {
    def toJson(n: Name, enc: Enc, id: Model, l: List[(String, JsValue)]): List[(String, JsValue)]
  }

  def encodeImpl[F[_[_]]](sp3: SP3.ProductAdapter[F], namedIns: F[Named], encIns: () => F[Writes]): F[IdType] => JsValue = {
    val typeGen: SP3.TypeGen[EncodeAction, Named, Writes, IdType] = new SP3.TypeGen[EncodeAction, Named, Writes, IdType] {
      override def gen[T]: EncodeAction[String, Writes[T], T] = new EncodeAction[String, Writes[T], T] {
        override def toJson(n: String, enc: Writes[T], id: T, l: List[(String, JsValue)]): List[(String, JsValue)] =
          (n, enc.writes(id)) :: l
      }
    }

    val appender: SP3.SimpleAppender[EncodeAction] = new SP3.SimpleAppender[EncodeAction] {
      override def append[A1, A2, A3, B1, B2, B3, C1, C2, C3](f1: ABCFunc[A1, B1, C1], f2: ABCFunc[A2, B2, C2], f3: ABCFunc[A3, B3, C3])(
        a: EncodeAction[A1, A2, A3],
        b: EncodeAction[B1, B2, B3]
      ): EncodeAction[C1, C2, C3] = new EncodeAction[C1, C2, C3] {
        override def toJson(n: C1, enc: C2, id: C3, l: List[(String, JsValue)]): List[(String, JsValue)] = {
          val valueA: List[(String, JsValue)] = b.toJson(f1.takeTail(n), f2.takeTail(enc), f3.takeTail(id), l)
          a.toJson(f1.takeHead(n), f2.takeHead(enc), f3.takeHead(id), valueA)
        }
      }

      override def zero[N1, N2, N3](p1: N1, p2: N2, p3: N3): EncodeAction[N1, N2, N3] = new EncodeAction[N1, N2, N3] {
        override def toJson(n: N1, enc: N2, id: N3, l: List[(String, JsValue)]): List[(String, JsValue)] = l
      }
    }

    val encodeFunc: EncodeAction[F[Named], F[Writes], F[IdType]] =
      sp3.append[EncodeAction, Named, Writes, IdType](typeGen = typeGen, sAppender = appender)

    (model: F[IdType]) => {
      val list: List[(String, JsValue)] = encodeFunc.toJson(namedIns, encIns(), model, List.empty)
      JsObject(list)
    }
  }

  private trait DecodeJson[Name, Dec, Model, DefaultValue] {
    def fromJson(n: Name, enc: Dec, defVal: DefaultValue): JsResult[Model]
  }

  def decodeImpl[F[_[_]]](
    sp2: SP2.ProductAdapter[F],
    sp4: SP4.ProductAdapter[F],
    named: F[Named],
    g: () => F[Reads],
    defaultValue: Option[F[({ type OptF[TU] = Option[() => TU] })#OptF]]
  ): JsObject => JsResult[F[IdType]] = (hCursor: JsObject) => {
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
        override def fromJson(n: C1, enc: C2, de: C4): JsResult[C3] = for {
          t1 <- ma.fromJson(cxF1.takeHead(n), cxF2.takeHead(enc), cxF4.takeHead(de))
          t2 <- mb.fromJson(cxF1.takeTail(n), cxF2.takeTail(enc), cxF4.takeTail(de))
        } yield cxF3.append(t1, t2)
      }
      override def zero[N1, N2, N3, N4](n1: N1, n2: N2, n3: N3, n4: N4): DecodeJson[N1, N2, N3, N4] = new DecodeJson[N1, N2, N3, N4] {
        override def fromJson(n: N1, enc: N2, de: N4): JsResult[N3] = JsSuccess(n3)
      }
    }

    val typeGen: SP4.TypeGen[DecodeJson, Named, Reads, IdType, OptFGet] = new SP4.TypeGen[DecodeJson, Named, Reads, IdType, OptFGet] {
      override def gen[T]: DecodeJson[String, Reads[T], T, F[OptF] => Option[() => T]] =
        new DecodeJson[String, Reads[T], T, F[OptF] => Option[() => T]] {
          override def fromJson(n: String, dec: Reads[T], defVal: F[OptF] => Option[() => T]): JsResult[T] = {
            val jsPath: JsPath = JsPath() \ n
            val value1: JsResult[T] = for {
              v1 <- jsPath.asSingleJsResult(hCursor)
              v2 <- dec.reads(v1)
            } yield v2

            value1.fold[JsResult[T]](
              (err: scala.collection.Seq[(JsPath, scala.collection.Seq[JsonValidationError])]) =>
                defaultValue.fold[JsResult[T]](JsError(err))(r =>
                  defVal(r).fold[JsResult[T]](JsError(err))(rValue1 => JsSuccess(rValue1()))
                ),
              (rV: T) => JsSuccess(rV)
            )
          }
        }
    }

    val decoderFunc: DecodeJson[F[Named], F[Reads], F[IdType], F[OptFGet]] =
      sp4.append[DecodeJson, Named, Reads, IdType, OptFGet](typeGen = typeGen, sAppender = appender)

    decoderFunc.fromJson(named, g(), getField.getFieldModel[OptF])
  }

}
