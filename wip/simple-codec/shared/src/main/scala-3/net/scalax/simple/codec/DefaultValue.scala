package net.scalax.simple.codec

import net.scalax.simple.adt.nat.support.{ABCFunc, SimpleProduct1}
import net.scalax.simple.codec.to_list_generic.{BasedInstalledSimpleProduct, PojoInstance}

trait DefaultValue[F[_[_]]] {
  def defaultValueFunction1: F[({ type UA[T1] = Option[() => T1] })#UA]
  def defaultValue: F[Option]
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

  trait Impl[F[_[_]]] extends DefaultValue[F] { ImplSelf =>
    override def defaultValueFunction1: F[({ type UA[T1] = Option[() => T1] })#UA] =
      ImplSelf.mapGenerc.map[Option, ({ type UA[T1] = Option[() => T1] })#UA](DefaultValueself.map1)(ImplSelf.defaultValue)
    override def defaultValue: F[Option] =
      ImplSelf.mapGenerc.map[({ type UA[T1] = Option[() => T1] })#UA, Option](DefaultValueself.map2)(ImplSelf.defaultValueFunction1)

    def mapGenerc: MapGenerc[F]
  }

  type ListType = List[(String, Option[() => Any])]

  private def toNamed: SimpleProduct1.TypeGen[({ type T1[U] = ListType => (ListType, U) })#T1, ({ type UA[T1] = Option[() => T1] })#UA] =
    new SimpleProduct1.TypeGen[({ type T1[U] = ListType => (ListType, U) })#T1, ({ type UA[T1] = Option[() => T1] })#UA] {
      override def gen[U]: ListType => (ListType, Option[() => U]) = (tu: ListType) => {
        val value1 = tu.head._2.asInstanceOf[Option[() => U]]
        (tu.tail, value1)
      }
    }

  private def monadAdd: SimpleProduct1.SimpleAppender[({ type T1[U] = ListType => (ListType, U) })#T1] =
    new SimpleProduct1.SimpleAppender[({ type T1[U] = ListType => (ListType, U) })#T1] {
      override def append[A1, B1, C1](c: ABCFunc[A1, B1, C1])(
        ma: ListType => (ListType, A1),
        mb: ListType => (ListType, B1)
      ): ListType => (ListType, C1) = { l =>
        val rb = ma(l)
        val ra = mb(rb._1)
        (ra._1, c.append(rb._2, ra._2))
      }

      override def zero[N1](n1: N1): ListType => (ListType, N1) = l => (l, n1)
    }

  class Builder[ModelType] {
    inline def derives(using
      basedI: BasedInstalledSimpleProduct[({ type Type1[U1[_]] = PojoInstance[U1, ModelType] })#Type1]
    ): DefaultValue[({ type Type1[U1[_]] = PojoInstance[U1, ModelType] })#Type1] = {
      val defaultV: ListType = magnolia1.Macro.defaultValue[ModelType]
      def mapGenerc1: MapGenerc[({ type Type1[U1[_]] = PojoInstance[U1, ModelType] })#Type1] =
        MapGenerc[({ type Type1[U1[_]] = PojoInstance[U1, ModelType] })#Type1].derived(basedI.basedInstalled.simpleProduct2)

      val insValue: (ListType, PojoInstance[({ type UA[T1] = Option[() => T1] })#UA, ModelType]) = basedI.basedInstalled.simpleProduct1
        .append[({ type T1[U] = ListType => (ListType, U) })#T1, ({ type UA[T1] = Option[() => T1] })#UA](toNamed, monadAdd)(defaultV)

      new DefaultValueself.Impl[({ type Type1[U1[_]] = PojoInstance[U1, ModelType] })#Type1] {
        override def defaultValueFunction1: PojoInstance[({ type UA[T1] = Option[() => T1] })#UA, ModelType] = insValue._2
        override def mapGenerc: MapGenerc[({ type Type1[U1[_]] = PojoInstance[U1, ModelType] })#Type1]       = mapGenerc1
      }
    }
  }

  def pojo[ModelType]: Builder[ModelType] = new Builder[ModelType]
  type Pojo[ModelType] = DefaultValue[({ type Type1[U1[_]] = PojoInstance[U1, ModelType] })#Type1]

}
