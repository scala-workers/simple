package net.scalax.simple.codec
package to_list_generic

import net.scalax.simple.adt.nat.support.SimpleProductContextX

trait BasedInstalled[F[_[_]]] {
  def basedInstalled: SimpleProductContextX[F]
  def labelled: ModelLabelled[F]
  def size: ModelSize[F]

}
