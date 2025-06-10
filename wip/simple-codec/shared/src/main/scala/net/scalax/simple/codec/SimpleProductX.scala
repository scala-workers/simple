package net.scalax.simple.codec
package to_list_generic

import net.scalax.simple.adt.nat.support.{ExtractProductUtil, SimpleProductContextX}

trait SimpleProductX[F[_[_]]] {
  def model: SimpleProductXImpl2.NotHList.Appender[F]
}

object SimpleProductX {
  class Builder[F[_[_]]] {
    def derived(from: GenericAuxFrom[F], to: GenericAuxTo[F], modelSize: ModelSize[F]): SimpleProductContextX[F] =
      ExtractProductUtil.genSimpleProduct[F](
        length = modelSize.modelSize,
        toModel = ((from.fromModel _): Any => F[({ type ToAny[_] = Any })#ToAny])
          .asInstanceOf[shapeless.HList => F[({ type ToAny[_] = Any })#ToAny]],
        fromModel =
          ((to.toModel _): F[({ type ToAny[_] = Any })#ToAny] => Any).asInstanceOf[F[({ type ToAny[_] = Any })#ToAny] => shapeless.HList]
      )
  }

  def apply[F[_[_]]]: Builder[F] = new Builder[F]
}
