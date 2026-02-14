package net.scalax.simple.codec

import net.scalax.simple.adt.nat.support.ExtractProductUtil

/*trait CompatLabelled[F[_[_]]] {
  def compatLabelled: Any
}*/

object CompatLabelled {
  private val proAbs = ExtractProductUtil.extraAbstraction.scalaVersionCompat

  class Builder[F[_[_]]] {
    /*def instance(t: Any): CompatLabelled[F] = new CompatLabelled[F] {
      override val compatLabelled: Any = t
    }

    def toLabelled(fromListGeneric: FromListByTheSameTypeGeneric[F], compatModel: CompatLabelled[F]): F[({ type M1[_] = String })#M1] = {
      val fromList = fromListGeneric.fromListByTheSameType[String, Any](
        takeHead = h => proAbs.labelledItemToString(proAbs.hListFunc.takeHead(h): Any),
        takeTail = h => proAbs.hListFunc.takeTail(h): Any
      )

      fromList(compatModel.compatLabelled)
    }*/

    def toLabelledWithScalaVersion(
      fromListGeneric: FromListByTheSameTypeGeneric[F],
      mapGenerc: MapGenerc[F],
      compatModel: Any
    ): CompatLabelled2[F] = {
      val mapGeneric1: MapGenerc[F] = mapGenerc

      new CompatLabelled2.Impl[F] {
        override def symbolLabelled: F[({ type T1[_] = Symbol })#T1] = {
          val fromList: shapeless.HList => F[({ type T1[_] = Symbol })#T1] = fromListGeneric.fromListByTheSameType[Symbol, shapeless.HList](
            takeHead = h => h.asInstanceOf[shapeless.::[Symbol, shapeless.HList]].head,
            takeTail = h => h.asInstanceOf[shapeless.::[Any, shapeless.HList]].tail
          )

          fromList(compatModel.asInstanceOf[shapeless.HList])
        }

        override def mapGenerc: MapGenerc[F] = mapGeneric1
      }
    }
    def toLobelledSizeWithScalaVersion(compat: Any): Int = proAbs.runtimeCountSize(compat)

    // def toLobelledSize(compat: CompatLabelled[F]): Int = proAbs.runtimeCountSize(compat.compatLabelled)
  }

  def apply[F[_[_]]]: Builder[F] = new Builder[F]

}
