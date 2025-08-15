package net.scalax.simple.adt
package instance

import nat.support.HListFunc

trait ADTCoProductX3Helper[Product1, APProduct1[_, _ <: Product1] <: Product1, ProZero1 <: Product1] { ADTCoProductX3HelperSelf =>

  def supportX2: support.ADTCoProductX2[Product1, APProduct1, ProZero1]

  def inputHList0[Target]: ProZero1 = ADTCoProductX3HelperSelf.supportX2.inputHList0[Target]

}
