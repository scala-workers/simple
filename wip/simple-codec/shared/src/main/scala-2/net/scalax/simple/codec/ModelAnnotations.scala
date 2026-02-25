package net.scalax.simple.codec

import net.scalax.simple.codec.to_list_generic.{BasedInstalledSimpleProduct, PojoInstance}
import shapeless.HList

trait ModelAnnotations[F[_[_]], Ann] {
  def annInstance: F[({ type U11[_] = Option[Ann] })#U11]
}

trait ModelAnnotationsPojo[Model, Ann] extends ModelAnnotations[({ type UA[X1[_]] = PojoInstance[X1, Model] })#UA, Ann]

object ModelAnnotationsPojo {

  trait ModelBuilder[Model, Ann] {
    def derived[Out <: shapeless.HList](implicit
      sa: shapeless.Annotations.Aux[Ann, Model, Out],
      simplePro: BasedInstalledSimpleProduct[({ type F1[U[_]] = PojoInstance[U, Model] })#F1]
    ): ModelAnnotationsPojo[Model, Ann] = {
      val fromList: FromListByTheSameTypeGeneric[({ type F1[U[_]] = PojoInstance[U, Model] })#F1] =
        FromListByTheSameTypeGeneric[({ type F1[U[_]] = PojoInstance[U, Model] })#F1].derived(simplePro.basedInstalled.simpleProduct1)

      val annIns: shapeless.HList = sa.apply().asInstanceOf[shapeless.HList]

      val toModel = fromList.fromListByTheSameType[Option[Ann], shapeless.HList](
        takeHead = t => t.asInstanceOf[shapeless.::[Option[Ann], HList]].head,
        takeTail = t => t.asInstanceOf[shapeless.::[Any, HList]].tail
      )

      new ModelAnnotationsPojo[Model, Ann] {
        override val annInstance: PojoInstance[({ type U11[_] = Option[Ann] })#U11, Model] = toModel(annIns)
      }
    }
  }

  def apply[Model, Ann]: ModelBuilder[Model, Ann] = new ModelBuilder[Model, Ann] {
    //
  }

}
