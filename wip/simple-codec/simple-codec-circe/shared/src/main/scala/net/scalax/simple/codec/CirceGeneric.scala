package net.scalax.simple.codec

import io.circe._
import net.scalax.simple.codec.to_list_generic.{BasedInstalled, PojoInstance}
import net.scalax.simple.codec.utils.ByNameImplicit
import net.scalax.simple.adt.nat.support.{SimpleProduct3, SimpleProductContextX}

object CirceGen {

  object F {

    implicit def getCirceEncoderF[F[_[_]]](implicit
      g: ByNameImplicit[F[Encoder]],
      g1: BasedInstalled[F],
      sg: SimpleJsonEncodeLabelled[F]
    ): Encoder[F[({ type IDF[T] = T })#IDF]] = Encoder.instance[F[({ type IDF[T] = T })#IDF]](
      CirceGeneric.encodeModelImpl[F](g1.basedInstalled.simpleProduct3, sg.jsonEncodeLabelled, () => g.value)
    )

    implicit def getCirceDecoderF[F[_[_]]](implicit
      g: ByNameImplicit[F[Decoder]],
      g1: BasedInstalled[F],
      sg: SimpleJsonEncodeLabelled[F]
    ): Decoder[F[({ type IDF[T] = T })#IDF]] = Decoder.instance[F[({ type IDF[T] = T })#IDF]](
      CirceGeneric.decodeModelImpl[F](g1.basedInstalled.simpleProduct3, sg.jsonEncodeLabelled, () => g.value)
    )

  }

  object Pojo {

    implicit def getCirceEncoderPojo[Model](implicit
      g1: ModelGet[({ type F[X[_]] = PojoInstance[X, Model] })#F, Model],
      basedInstalled: BasedInstalled[({ type F[X[_]] = PojoInstance[X, Model] })#F],
      g3: ByNameImplicit[PojoInstance[Encoder, Model]],
      sg: SimpleJsonEncodeLabelled[({ type F[X[_]] = PojoInstance[X, Model] })#F]
    ): Encoder[Model] = {
      val en1: Encoder[PojoInstance[({ type IDF[T] = T })#IDF, Model]] = F.getCirceEncoderF[({ type F[X[_]] = PojoInstance[X, Model] })#F]
      en1.contramap[Model](g1.toIdentity)
    }

    implicit def getCirceDecoderPojo[Model](implicit
      g1: ModelSet[({ type F[X[_]] = PojoInstance[X, Model] })#F, Model],
      basedInstalled: BasedInstalled[({ type F[X[_]] = PojoInstance[X, Model] })#F],
      g3: ByNameImplicit[PojoInstance[Decoder, Model]],
      sg: SimpleJsonEncodeLabelled[({ type F[X[_]] = PojoInstance[X, Model] })#F]
    ): Decoder[Model] = {
      val de1: Decoder[PojoInstance[({ type IDF[T] = T })#IDF, Model]] = F.getCirceDecoderF[({ type F[X[_]] = PojoInstance[X, Model] })#F]
      for (model <- de1) yield g1.fromIdentity(model)
    }

  }

}
