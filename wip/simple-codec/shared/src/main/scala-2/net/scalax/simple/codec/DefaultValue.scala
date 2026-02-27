package net.scalax.simple.codec

import net.scalax.simple.adt.nat.support.{ABCFunc, SimpleProduct1, SimpleProductContextX}
import net.scalax.simple.codec.to_list_generic.{BasedInstalledSimpleProduct, PojoInstance}

trait DefaultValue[F[_[_]]] {
  def defaultValueFunction1: F[({ type UA[T1] = Option[() => T1] })#UA]
  def defaultValue: F[Option]
}

trait DefaultValuePojo[Model] extends DefaultValue[({ type T1[U2[_]] = PojoInstance[U2, Model] })#T1]

object DefaultValuePojo { DefaultValuePojoSelf =>

  private val map1: MapGenerc.MapFunction[({ type T1[T111] = Option[T111] })#T1, ({ type T1[UX] = Option[() => UX] })#T1] =
    new MapGenerc.MapFunction[({ type T1[T111] = Option[T111] })#T1, ({ type T1[UX] = Option[() => UX] })#T1] {
      override def map[X1](in: Option[X1]): Option[() => X1] = for (inVal <- in) yield () => inVal
    }

  private val map2: MapGenerc.MapFunction[({ type T1[UX] = Option[() => UX] })#T1, ({ type T1[T111] = Option[T111] })#T1] =
    new MapGenerc.MapFunction[({ type T1[UX] = Option[() => UX] })#T1, ({ type T1[T111] = Option[T111] })#T1] {
      override def map[X1](in: Option[() => X1]): Option[X1] = for (inVal <- in) yield inVal()
    }

  trait Impl[F[_[_]]] extends DefaultValue[F] { ImplSelf =>
    override def defaultValueFunction1: F[({ type UA[T1] = Option[() => T1] })#UA] =
      ImplSelf.mapGenerc.map[Option, ({ type UA[T1] = Option[() => T1] })#UA](DefaultValuePojoSelf.map1)(ImplSelf.defaultValue)
    override def defaultValue: F[Option] =
      ImplSelf.mapGenerc.map[({ type UA[T1] = Option[() => T1] })#UA, Option](DefaultValuePojoSelf.map2)(ImplSelf.defaultValueFunction1)

    def mapGenerc: MapGenerc[F]
  }

  class Builder[ModelType] {
    def derives(implicit
      fModelGet: FModelGet[({ type F1[U[_]] = PojoInstance[U, ModelType] })#F1],
      basedI1: BasedInstalledSimpleProduct[({ type Type1[U1[_]] = PojoInstance[U1, ModelType] })#Type1],
      compatModel: shapeless.Default[ModelType]
    ): DefaultValuePojo[ModelType] = {
      val spx: SimpleProductContextX[({ type Type1[U1[_]] = PojoInstance[U1, ModelType] })#Type1] = basedI1.basedInstalled

      val defaultV: shapeless.HList = compatModel.apply()

      val ins1: PojoInstance[Option, ModelType] = fModelGet.FFromHList[Option](defaultV)

      def mapGenerc1: MapGenerc[({ type Type1[U1[_]] = PojoInstance[U1, ModelType] })#Type1] =
        MapGenerc[({ type Type1[U1[_]] = PojoInstance[U1, ModelType] })#Type1].derived(spx.simpleProduct2)

      new DefaultValuePojo[ModelType] with DefaultValuePojoSelf.Impl[({ type Type1[U1[_]] = PojoInstance[U1, ModelType] })#Type1] {
        override def defaultValue: PojoInstance[Option, ModelType]                                     = ins1
        override def mapGenerc: MapGenerc[({ type Type1[U1[_]] = PojoInstance[U1, ModelType] })#Type1] = mapGenerc1
      }
    }
  }

  def apply[ModelType]: Builder[ModelType] = new Builder[ModelType]

}
