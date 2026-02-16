package net.scalax.simple.codec

import net.scalax.simple.adt.nat.support.{ABCFunc, SimpleProduct1}
import net.scalax.simple.codec.to_list_generic.{BasedInstalledSimpleProduct, PojoInstance}

trait DefaultValue[ModelType] {
  def defaultValueFunction1: PojoInstance[({ type UA[T1] = Option[() => T1] })#UA, ModelType]
  def defaultValue: PojoInstance[Option, ModelType]
}

object DefaultValue { DefaultValueself =>

  private val map1: MapGenerc.MapFunction[({ type T1[T111] = Option[T111] })#T1, ({ type T1[UX] = Option[() => UX] })#T1] =
    new MapGenerc.MapFunction[({ type T1[T111] = Option[T111] })#T1, ({ type T1[UX] = Option[() => UX] })#T1] {
      override def map[X1](in: Option[X1]): Option[() => X1] = for (inVal <- in) yield () => inVal
    }

  private val map2: MapGenerc.MapFunction[({ type T1[UX] = Option[() => UX] })#T1, ({ type T1[T111] = Option[T111] })#T1] =
    new MapGenerc.MapFunction[({ type T1[UX] = Option[() => UX] })#T1, ({ type T1[T111] = Option[T111] })#T1] {
      override def map[X1](in: Option[() => X1]): Option[X1] = for (inVal <- in) yield inVal()
    }

  trait Impl[ModelType] extends DefaultValue[ModelType] { ImplSelf =>
    override def defaultValueFunction1: PojoInstance[({ type UA[T1] = Option[() => T1] })#UA, ModelType] =
      ImplSelf.mapGenerc.map(DefaultValueself.map1)(ImplSelf.defaultValue)
    override def defaultValue: PojoInstance[Option, ModelType] =
      ImplSelf.mapGenerc.map(DefaultValueself.map2)(ImplSelf.defaultValueFunction1)

    def mapGenerc: MapGenerc[({ type XXA[UB[_]] = PojoInstance[UB, ModelType] })#XXA]
  }

  private def toNamed: SimpleProduct1.TypeGen[({ type T1[U] = shapeless.HList => (shapeless.HList, U) })#T1, Option] =
    new SimpleProduct1.TypeGen[({ type T1[U] = shapeless.HList => (shapeless.HList, U) })#T1, Option] {
      override def gen[U]: shapeless.HList => (shapeless.HList, Option[U]) = (tu: shapeless.HList) => {
        val value1 = tu.asInstanceOf[shapeless.::[Option[U], shapeless.HList]]
        (value1.tail, value1.head)
      }
    }

  private def monadAdd: SimpleProduct1.SimpleAppender[({ type T1[U] = shapeless.HList => (shapeless.HList, U) })#T1] =
    new SimpleProduct1.SimpleAppender[({ type T1[U] = shapeless.HList => (shapeless.HList, U) })#T1] {
      override def append[A1, B1, C1](c: ABCFunc[A1, B1, C1])(
        ma: shapeless.HList => (shapeless.HList, A1),
        mb: shapeless.HList => (shapeless.HList, B1)
      ): shapeless.HList => (shapeless.HList, C1) = { l =>
        val rb = ma(l)
        val ra = mb(rb._1)
        (ra._1, c.append(rb._2, ra._2))
      }

      override def zero[N1](n1: N1): shapeless.HList => (shapeless.HList, N1) = l => (l, n1)
    }

  class Builder[ModelType] {
    def derives(implicit
      basedI: BasedInstalledSimpleProduct[({ type Type1[U1[_]] = PojoInstance[U1, ModelType] })#Type1],
      compatModel: shapeless.Default[ModelType]
    ): DefaultValue[ModelType] = {
      val defaultV: shapeless.HList = compatModel.apply()
      def mapGenerc1: MapGenerc[({ type Type1[U1[_]] = PojoInstance[U1, ModelType] })#Type1] =
        MapGenerc[({ type Type1[U1[_]] = PojoInstance[U1, ModelType] })#Type1].derived(basedI.basedInstalled.simpleProduct2)

      val insValue: (shapeless.HList, PojoInstance[Option, ModelType]) = basedI.basedInstalled.simpleProduct1
        .append[({ type T1[U] = shapeless.HList => (shapeless.HList, U) })#T1, ({ type T1[U1] = Option[U1] })#T1](toNamed, monadAdd)(
          defaultV
        )

      new DefaultValueself.Impl[ModelType] {
        override def defaultValue: PojoInstance[Option, ModelType]                                     = insValue._2
        override def mapGenerc: MapGenerc[({ type Type1[U1[_]] = PojoInstance[U1, ModelType] })#Type1] = mapGenerc1
      }
    }

  }

  def apply[ModelType]: Builder[ModelType] = new Builder[ModelType]

}
