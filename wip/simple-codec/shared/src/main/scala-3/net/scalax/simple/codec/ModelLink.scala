package net.scalax.simple.codec
package to_list_generic

import net.scalax.simple.adt.nat.support.SimpleProductContextX

trait ModelLink[F[_[_]], Model] extends BasedInstalled[F] with ModelGetSet[F, Model] {
  override def toIdentity(t: Model): F[({ type U1[X] = X })#U1]
  override def fromIdentity(t: F[({ type U1[X] = X })#U1]): Model

  override def basedInstalled: SimpleProductContextX[F]
  override def labelled: ModelLabelled[F]
  override def size: ModelSize[F]
}

object ModelLink {

  class Builder[F[_[_]], Model] {
    def implicitly(implicit x: ModelLink[F, Model]): ModelLink[F, Model] = x
  }

  def apply[F[_[_]], Model] = new Builder[F, Model]

}
