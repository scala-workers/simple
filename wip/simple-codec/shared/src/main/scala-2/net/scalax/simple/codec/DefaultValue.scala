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
      basedI1: BasedInstalledSimpleProduct[({ type Type1[U1[_]] = PojoInstance[U1, ModelType] })#Type1],
      compatModel: shapeless.Default[ModelType]
    ): DefaultValuePojo[ModelType] = {
      val spx: SimpleProductContextX[({ type Type1[U1[_]] = PojoInstance[U1, ModelType] })#Type1] = basedI1.basedInstalled

      val defaultV: shapeless.HList = compatModel.apply()

      def mapGenerc1: MapGenerc[({ type Type1[U1[_]] = PojoInstance[U1, ModelType] })#Type1] =
        MapGenerc[({ type Type1[U1[_]] = PojoInstance[U1, ModelType] })#Type1].derived(spx.simpleProduct2)

      val insValue: (shapeless.HList, PojoInstance[Option, ModelType]) = spx.simpleProduct1
        .append[({ type T1[U] = shapeless.HList => (shapeless.HList, U) })#T1, ({ type T1[U1] = Option[U1] })#T1](toNamed, monadAdd)(
          defaultV
        )

      new DefaultValuePojo[ModelType] with DefaultValuePojoSelf.Impl[({ type Type1[U1[_]] = PojoInstance[U1, ModelType] })#Type1] {
        override def defaultValue: PojoInstance[Option, ModelType]                                     = insValue._2
        override def mapGenerc: MapGenerc[({ type Type1[U1[_]] = PojoInstance[U1, ModelType] })#Type1] = mapGenerc1
      }
    }
  }

  def apply[ModelType]: Builder[ModelType] = new Builder[ModelType]

}
