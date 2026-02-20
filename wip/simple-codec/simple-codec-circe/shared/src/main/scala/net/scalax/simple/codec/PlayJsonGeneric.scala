package net.scalax.simple
package codec

import net.scalax.simple.adt.nat.support.SimpleProductContextX
import net.scalax.simple.codec.to_list_generic.{BasedInstalledLabelled, BasedInstalledSimpleProduct, PojoInstance}
import net.scalax.simple.codec.utils.ByNameImplicit
import play.api.libs.json._

object PlayJsonGeneric {

  object F {
    implicit def encodeModelF[F[_[_]]](implicit
      g: ByNameImplicit[F[Writes]],
      g1: BasedInstalledSimpleProduct[F],
      lb: BasedInstalledLabelled[F],
      sjn: SimpleJsonLabelled[F]
    ): Writes[F[({ type IDF[T] = T })#IDF]] = {
      val bsInsatnall: SimpleProductContextX[F] = g1.basedInstalled

      val labelledIns: F[({ type Str1[_] = String })#Str1] = sjn.labelledValueFunc(lb.labelled.stringLabelled)

      Writes(PlayJsonGeneric2.encodeImpl[F](sp3 = bsInsatnall.simpleProduct3, labelledIns, () => g.value))
    }
  }

  object Pojo {
    implicit def encodeModelPojo[Model](implicit
      g1: ModelGet[({ type F[X[_]] = PojoInstance[X, Model] })#F, Model],
      basedInstalled: BasedInstalledSimpleProduct[({ type F[X[_]] = PojoInstance[X, Model] })#F],
      lb: BasedInstalledLabelled[({ type F[X[_]] = PojoInstance[X, Model] })#F],
      g: ByNameImplicit[PojoInstance[Writes, Model]],
      sjn: SimpleJsonLabelled[({ type F[X[_]] = PojoInstance[X, Model] })#F]
    ): Writes[Model] = {
      val w1: Writes[PojoInstance[({ type IDF[T] = T })#IDF, Model]] = F.encodeModelF[({ type F[X[_]] = PojoInstance[X, Model] })#F]
      w1.contramap[Model](g1.toIdentity)
    }
  }

}
