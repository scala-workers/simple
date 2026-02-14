package net.scalax.simple.codec

object CompatLabelled {

  class Builder[F[_[_]]] {
    def toLabelledWithScalaVersion(
      fromListGeneric: FromListByTheSameTypeGeneric[F],
      mapGenerc: MapGenerc[F],
      compatModel: Any
    ): CompatLabelled2[F] = {
      val mapGeneric1: MapGenerc[F] = mapGenerc

      new CompatLabelled2.Impl[F] {
        override def stringLabelled: F[({ type T1[_] = String })#T1] = {
          val fromList: Tuple => F[({ type T1[_] = String })#T1] = fromListGeneric.fromListByTheSameType[String, Tuple](
            takeHead = h => h.asInstanceOf[*:[String, Tuple]].head,
            takeTail = h => h.asInstanceOf[*:[Any, Tuple]].tail
          )

          fromList(compatModel.asInstanceOf[Tuple])
        }

        override def mapGenerc: MapGenerc[F] = mapGeneric1
      }
    }

    def toLobelledSizeWithScalaVersion(compat: Any): Int = compat.asInstanceOf[Product].productArity
  }

  def apply[F[_[_]]]: Builder[F] = new Builder[F]

}
