package net.scalax.simple.codec

trait CompatLabelledCompatHelper {

  class Builder[F[_[_]]] {
    /*def toLabelledWithScalaVersion(
      fromListGeneric: FromListByTheSameTypeGeneric[F],
      mapGenerc: MapGenerc[F],
      compatModel: Any
    ): CompatLabelled[F] = {
      val mapGeneric1: MapGenerc[F] = mapGenerc

      new CompatLabelledImplHelper.Impl[F] {
        override def stringLabelled: F[({ type T1[_] = String })#T1] = {
          val fromList: Tuple => F[({ type T1[_] = String })#T1] = fromListGeneric.fromListByTheSameType[String, Tuple](
            takeHead = h => h.asInstanceOf[*:[String, Tuple]].head,
            takeTail = h => h.asInstanceOf[*:[Any, Tuple]].tail
          )

          fromList(compatModel.asInstanceOf[Tuple])
        }

        override def mapGenerc: MapGenerc[F] = mapGeneric1
      }
    }*/

    def toLobelledSizeWithScalaVersion(compat: Any): Int = compat.asInstanceOf[Product].productArity
  }

  def apply[F[_[_]]]: Builder[F] = new Builder[F]

}
