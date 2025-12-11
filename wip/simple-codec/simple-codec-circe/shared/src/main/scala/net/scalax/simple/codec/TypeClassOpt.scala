package net.scalax.simple
package codec

import io.circe.Encoder
import io.circe.syntax._
import net.scalax.simple.adt.nat.support.{ABCFunc, SimpleProduct2}
import net.scalax.simple.codec.to_list_generic.{BasedInstalledLabelled, BasedInstalledSimpleProduct, PojoInstance}
import net.scalax.simple.codec.utils.ByNameImplicit

case class TypeClassOpt[T, En[_]](info: FieldsInfo)

object TypeClassOpt {
  TypeClassOptSelf =>
  implicit def codecJson[T, En[_]]: io.circe.Codec[TypeClassOpt[T, En]] = io.circe.generic.semiauto.deriveCodec

  trait Builder[F[_[_]], En[_], Model] {
    def derived(implicit
      ins: F[({ type U1[T2] = EncoderGetter[En[T2]] })#U1],
      labelled: BasedInstalledLabelled[F],
      simpleProduct: BasedInstalledSimpleProduct[F]
    ): TypeClassOpt[Model, En] = {
      val pro2 = simpleProduct.basedInstalled.simpleProduct2

      val appender2 = new SimpleProduct2.SimpleAppender[({ type U1[Str, Enc] = (Str, Enc) => TypeClassOpt[Model, En] })#U1] {
        override def append[A1, A2, B1, B2, C1, C2](f1: ABCFunc[A1, B1, C1], f2: ABCFunc[A2, B2, C2])(
          a: (A1, A2) => TypeClassOpt[Model, En],
          b: (B1, B2) => TypeClassOpt[Model, En]
        ): (C1, C2) => TypeClassOpt[Model, En] = (c1: C1, c2: C2) => {
          val a1Info = a(f1.takeHead(c1), f2.takeHead(c2))
          val a2Info = b(f1.takeTail(c1), f2.takeTail(c2))
          val fieldInfo: FieldsInfo =
            FieldsInfo(succeed = a1Info.info.succeed ::: a2Info.info.succeed, failed = a1Info.info.failed ::: a2Info.info.failed)

          TypeClassOpt[Model, En](info = fieldInfo)
        }

        override def zero[N1, N2](p1: N1, p2: N2): (N1, N2) => TypeClassOpt[Model, En] = (n1, n2) => {
          TypeClassOpt[Model, En](FieldsInfo(succeed = List.empty, failed = List.empty))
        }
      }

      val typeGen = new SimpleProduct2.TypeGen[
        ({ type U1[Str, Enc] = (Str, Enc) => TypeClassOpt[Model, En] })#U1,
        ({ type U1[_] = String })#U1,
        ({ type U1[T1] = EncoderGetter[En[T1]] })#U1
      ] {
        override def gen[Item1]: (String, EncoderGetter[En[Item1]]) => TypeClassOpt[Model, En] =
          (s1: String, s2: EncoderGetter[En[Item1]]) => {
            val opt = s2.value.fold(ifEmpty = FieldsInfo(succeed = List.empty, failed = List(s1)))(t =>
              FieldsInfo(succeed = List(s1), failed = List.empty)
            )

            TypeClassOpt[Model, En](opt)
          }
      }

      pro2.append[
        ({ type U1[Str, Enc] = (Str, Enc) => TypeClassOpt[Model, En] })#U1,
        ({ type U1[_] = String })#U1,
        ({ type U1[T1] = EncoderGetter[En[T1]] })#U1
      ](typeGen, appender2)(labelled.labelled.modelLabelled, ins)
    }
  }

  def Pojo[Model, En[_]]: Builder[({ type X1[U1[_]] = PojoInstance[U1, Model] })#X1, En, Model] =
    new Builder[({ type X1[U1[_]] = PojoInstance[U1, Model] })#X1, En, Model] {
      //
    }

  def F[F[_[_]], En[_]]: Builder[F, En, F[({ type Id[T] = T })#Id]] = new Builder[F, En, F[({ type Id[T] = T })#Id]] {
    //
  }
}

case class EncoderGetter[T](value: Option[T])

object EncoderGetter extends EncoderGetterPoly {
  implicit def implicitImpl1[T](implicit nn: T): EncoderGetter[T] = EncoderGetter(Some(nn))
}

trait EncoderGetterPoly {
  implicit def implicitImpl2[T]: EncoderGetter[T] = EncoderGetter(None)
}

case class FieldsInfo(succeed: List[String], failed: List[String])
object FieldsInfo {
  implicit def codecJson: io.circe.Codec[FieldsInfo] = io.circe.generic.semiauto.deriveCodec
}

object TypeClassOptHelper {
  def toEncoder[Model](p: TypeClassOpt[Model, Encoder]): Encoder[Model] = Encoder.instance(nullObj => p.asJson)
}
