package net.scalax.simple
package codec

import play.api.libs.json._
import play.api.libs.json.Reads._
import play.api.libs.functional.syntax._
import net.scalax.simple.codec.to_list_generic.{BasedInstalled, ModelLink, PojoInstance}
import net.scalax.simple.codec.utils.ByNameImplicit
import net.scalax.simple.adt.nat.support.{SimpleProduct3, SimpleProductContextX}

object PlayJsonGeneric {
  type Named[_] = String

  object F {
    implicit def encodeModelF[F[_[_]]](implicit
      g: ByNameImplicit[F[Writes]],
      g1: ModelLink[F, F[cats.Id]],
      sjn: SimpleJsonEncodeLabelled[F]
    ): Writes[F[cats.Id]] = {
      val sp3: SimpleProduct3.ProductAdapter[F] = g1.basedInstalled.simpleProduct3
      Writes(PlayJsonGeneric2.writesModelImpl[F](simpleProduct3 = sp3, sjn.jsonEncodeLabelled, () => g.value))
    }
  }

  object Pojo {
    implicit def encodePojo[Model](implicit
      g1: ModelGetSet[({ type F[X[_]] = PojoInstance[X, Model] })#F, Model],
      basedInstalled: BasedInstalled[({ type F[X[_]] = PojoInstance[X, Model] })#F],
      g: ByNameImplicit[PojoInstance[Writes, Model]],
      sjn: SimpleJsonEncodeLabelled[({ type F[X[_]] = PojoInstance[X, Model] })#F]
    ): Writes[Model] = {
      val sp3: SimpleProduct3.ProductAdapter[({ type F[X[_]] = PojoInstance[X, Model] })#F] = basedInstalled.basedInstalled.simpleProduct3

      val w1: Writes[PojoInstance[({ type IDF[T] = T })#IDF, Model]] = Writes(
        PlayJsonGeneric2
          .writesModelImpl[({ type F[X[_]] = PojoInstance[X, Model] })#F](simpleProduct3 = sp3, sjn.jsonEncodeLabelled, () => g.value)
      )

      w1.contramap[Model](g1.toIdentity)
    }
  }

}
