package net.scalax.simple.codec

import io.circe._
import net.scalax.simple.codec.to_list_generic.{BasedInstalled, ModelLink, PojoInstance}
import net.scalax.simple.codec.utils.ByNameImplicit
import net.scalax.simple.adt.nat.support.{SimpleProduct3, SimpleProductContextX}

object CirceGen {

  object F {
    implicit def getCirceEncoderF[F[_[_]]](implicit
      g: ByNameImplicit[F[Encoder]],
      g1: BasedInstalled[F],
      sg: SimpleJsonEncodeLabelled[F]
    ): Encoder[F[({ type AnyF[T] = T })#AnyF]] = Encoder.instance[F[({ type IDF[T] = T })#IDF]](
      CirceGeneric.encodeModelImpl[F](g1.basedInstalled.simpleProduct3, sg.jsonEncodeLabelled, () => g.value)
    )
  }

  object Pojo {
    implicit def getCirceEncoderPojo[Model](implicit
      g1: ModelGetSet[({ type F[X[_]] = PojoInstance[X, Model] })#F, Model],
      basedInstalled: BasedInstalled[({ type F[X[_]] = PojoInstance[X, Model] })#F],
      g3: ByNameImplicit[PojoInstance[Encoder, Model]],
      sg: SimpleJsonEncodeLabelled[({ type F[X[_]] = PojoInstance[X, Model] })#F]
    ): Encoder[Model] = {
      val en1: Encoder[PojoInstance[({ type IDF[T] = T })#IDF, Model]] = Encoder.instance[PojoInstance[({ type IDF[T] = T })#IDF, Model]](
        CirceGeneric.encodeModelImpl[({ type F[X[_]] = PojoInstance[X, Model] })#F](
          basedInstalled.basedInstalled.simpleProduct3,
          sg.jsonEncodeLabelled,
          () => g3.value
        )
      )

      en1.contramap[Model](g1.toIdentity)
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
