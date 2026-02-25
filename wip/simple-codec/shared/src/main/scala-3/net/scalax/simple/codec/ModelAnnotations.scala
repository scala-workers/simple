package net.scalax.simple.codec

import net.scalax.simple.codec.to_list_generic.{BasedInstalledSimpleProduct, PojoInstance}

trait ModelAnnotations[F[_[_]], Ann] {
  def annInstance: F[({ type U11[_] = Option[Ann] })#U11]
}

trait ModelAnnotationsPojo[Model, Ann] extends ModelAnnotations[({ type UA[X1[_]] = PojoInstance[X1, Model] })#UA, Ann]

object ModelAnnotationsPojo {

  trait ModelBuilder[Model, Ann] {
    def derived(using
      sa: shapeless3.deriving.Annotations[Ann, Model],
      simplePro: BasedInstalledSimpleProduct[({ type F1[U[_]] = PojoInstance[U, Model] })#F1]
    ): ModelAnnotationsPojo[Model, Ann] = {
      val fromList: FromListByTheSameTypeGeneric[({ type F1[U[_]] = PojoInstance[U, Model] })#F1] =
        FromListByTheSameTypeGeneric[({ type F1[U[_]] = PojoInstance[U, Model] })#F1].derived(simplePro.basedInstalled.simpleProduct1)

      val annIns: Tuple = sa.apply().asInstanceOf[Tuple]

      val toModel = fromList.fromListByTheSameType[Option[Ann], Tuple](
        takeHead = t => t.asInstanceOf[*:[Option[Ann], Tuple]].head,
        takeTail = t => t.asInstanceOf[*:[Any, Tuple]].tail
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
