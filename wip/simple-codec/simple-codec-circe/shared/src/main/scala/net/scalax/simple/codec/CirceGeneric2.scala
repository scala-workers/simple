package net.scalax.simple.codec

import cats.Id
import io.circe._
import net.scalax.simple.codec.to_list_generic.{BasedInstalled, ModelLink, PojoInstance}
import net.scalax.simple.codec.utils.ByNameImplicit
import net.scalax.simple.adt.nat.support.{ABCFunc, SimpleProduct3, SimpleProductContextX}

object Circe {

  object Encoder {
    object F {
      def apply[F[_[_]]](implicit g: F[Encoder], g1: ModelLink[F, F[cats.Id]]): EncoderWrap[F, F[cats.Id]] =
        new EncoderWrap[F, F[cats.Id]] {
          override def applyImplFunc: F[Id] => F[Id]                       = identity
          override def simpleProduct3: SimpleProduct3.ProductAdapter[F]    = g1.basedInstalled.simpleProduct3
          override def nameLabelled: F[({ type Named[_] = String })#Named] = g1.labelled.modelLabelled
          override def encoderModel: F[Encoder]                            = g
        }
    }
    object Pojo {
      def apply[Model](implicit
        g1: ModelGetSet[({ type F[X[_]] = PojoInstance[X, Model] })#F, Model],
        basedInstalled: BasedInstalled[({ type F[X[_]] = PojoInstance[X, Model] })#F],
        g: ByNameImplicit[PojoInstance[Encoder, Model]]
      ): EncoderWrap[({ type F[X[_]] = PojoInstance[X, Model] })#F, Model] =
        new EncoderWrap[({ type F[X[_]] = PojoInstance[X, Model] })#F, Model] {
          override def applyImplFunc: Model => PojoInstance[Id, Model] = g1.toIdentity
          override def simpleProduct3: SimpleProduct3.ProductAdapter[({ type F[X[_]] = PojoInstance[X, Model] })#F] =
            basedInstalled.basedInstalled.simpleProduct3
          override def nameLabelled: PojoInstance[({ type Named[_] = String })#Named, Model] = basedInstalled.labelled.modelLabelled
          override def encoderModel: PojoInstance[Encoder, Model]                            = g.value
        }
    }
  }

}

object CirceGeneric2 {
  type Named[_] = String

  implicit def decodeModel[F[_[_]]](implicit g: F[Decoder], g1: ModelLink[F, F[cats.Id]]): Decoder[F[cats.Id]] =
    Decoder.instance[F[cats.Id]] { h =>
      val sp3: SimpleProduct3.ProductAdapter[F] = g1.basedInstalled.simpleProduct3
      val named: F[Named]                       = g1.labelled.modelLabelled

      CirceGeneric.decodeModelImpl[F](h, sp3, named, g)
    }

  implicit def decodePojo[Model](implicit
    g1: ModelGetSet[({ type F[X[_]] = PojoInstance[X, Model] })#F, Model],
    basedInstalled: BasedInstalled[({ type F[X[_]] = PojoInstance[X, Model] })#F],
    g: ByNameImplicit[PojoInstance[Decoder, Model]]
  ): Decoder[Model] = Decoder.instance[Model] { h =>
    val sp3: SimpleProduct3.ProductAdapter[({ type F[X[_]] = PojoInstance[X, Model] })#F] = basedInstalled.basedInstalled.simpleProduct3
    val named: PojoInstance[Named, Model]                                                 = basedInstalled.labelled.modelLabelled

    val r1 = CirceGeneric.decodeModelImpl[({ type F[X[_]] = PojoInstance[X, Model] })#F](h, sp3, named = named, g.value)
    for (m <- r1) yield g1.fromIdentity(m)
  }

}
