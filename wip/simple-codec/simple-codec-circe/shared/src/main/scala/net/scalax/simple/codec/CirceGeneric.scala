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

    implicit def decodeModel[F[_[_]]](implicit
      g: ByNameImplicit[F[Decoder]],
      g1: BasedInstalled[F],
      sg: SimpleJsonEncodeLabelled[F]
    ): Decoder[F[cats.Id]] = Decoder.instance[F[cats.Id]](
      CirceGeneric.decodeModelImpl[F](g1.basedInstalled.simpleProduct3, sg.jsonEncodeLabelled, () => g.value)
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

    implicit def getCirceDecoderPojo[Model](implicit
      g1: ModelGetSet[({ type F[X[_]] = PojoInstance[X, Model] })#F, Model],
      basedInstalled: BasedInstalled[({ type F[X[_]] = PojoInstance[X, Model] })#F],
      g3: ByNameImplicit[PojoInstance[Decoder, Model]],
      sg: SimpleJsonEncodeLabelled[({ type F[X[_]] = PojoInstance[X, Model] })#F]
    ): Decoder[Model] = {
      val de1: Decoder[PojoInstance[({ type IDF[T] = T })#IDF, Model]] = Decoder.instance[PojoInstance[({ type IDF[T] = T })#IDF, Model]](
        CirceGeneric.decodeModelImpl[({ type F[X[_]] = PojoInstance[X, Model] })#F](
          basedInstalled.basedInstalled.simpleProduct3,
          sg.jsonEncodeLabelled,
          () => g3.value
        )
      )

      de1.map[Model](g1.fromIdentity)
    }
  }

}
