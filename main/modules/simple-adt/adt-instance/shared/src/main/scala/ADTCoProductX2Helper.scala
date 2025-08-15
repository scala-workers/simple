package net.scalax.simple.adt
package instance

import nat.support.HListFunc

trait ADTCoProductX2Helper[Product1, APProduct1[_, _ <: Product1] <: Product1, ProZero1 <: Product1] { ADTCoProductX2HelperSelf =>

  def hlistModelCompat: HListFunc[Product1, APProduct1]

  def inputHList0[Target]: ProZero1

}
