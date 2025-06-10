package net.scalax.simple
package codec

import play.api.libs.json._
import play.api.libs.json.Reads._
import play.api.libs.functional.syntax._
import net.scalax.simple.codec.to_list_generic.{BasedInstalled, ModelLink, PojoInstance}
import net.scalax.simple.codec.utils.ByNameImplicit
import net.scalax.simple.adt.nat.support.{ABCFunc, SimpleProduct3, SimpleProductContextX}

object PlayJsonGeneric {
  type Named[_] = String

  implicit def encodeModel[F[_[_]]](implicit g: F[Writes], g1: ModelLink[F, F[cats.Id]]): Writes[F[cats.Id]] = Writes[F[cats.Id]] { m =>
    val sp3: SimpleProduct3.ProductAdapter[F] = g1.basedInstalled.simpleProduct3
    val named: F[Named]                       = g1.labelled.modelLabelled

    PlayJsonGeneric2.writesModelImpl[F](m, simpleProduct3 = sp3, named, g)
  }

  implicit def encodePojo[Model](implicit
    g1: ModelGetSet[({ type F[X[_]] = PojoInstance[X, Model] })#F, Model],
    basedInstalled: BasedInstalled[({ type F[X[_]] = PojoInstance[X, Model] })#F],
    g: ByNameImplicit[PojoInstance[Writes, Model]]
  ): Writes[Model] = Writes[Model] { m =>
    val sp3: SimpleProduct3.ProductAdapter[({ type F[X[_]] = PojoInstance[X, Model] })#F] = basedInstalled.basedInstalled.simpleProduct3
    val named: PojoInstance[Named, Model]                                                 = basedInstalled.labelled.modelLabelled

    PlayJsonGeneric2.writesModelImpl[({ type F[X[_]] = PojoInstance[X, Model] })#F](g1.toIdentity(m), simpleProduct3 = sp3, named, g.value)
  }

}
