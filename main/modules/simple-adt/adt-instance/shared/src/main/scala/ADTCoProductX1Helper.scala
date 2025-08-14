package net.scalax.simple.adt
package instance

import nat.support.{CoProductFunc, FoldCoProductUtilN, HListFunc}

trait ADTCoProductX1Helper[CoLike1, ApCoProduct1[_, _ <: CoLike1] <: CoLike1, CoLike2, ApCoProduct2[_, _ <: CoLike2] <: CoLike2] {
  ADTCoProductX1HelperSelf =>

  def hlistModelCompat: HListFunc[CoLike1, ApCoProduct1]
  def coproductModelCompat: CoProductFunc[CoLike2, ApCoProduct2]

  def util: FoldCoProductUtilN[CoLike1, ApCoProduct1, CoLike2, ApCoProduct2] =
    new FoldCoProductUtilN[CoLike1, ApCoProduct1, CoLike2, ApCoProduct2] {
      override def hlistModelCompat: HListFunc[CoLike1, ApCoProduct1]         = ADTCoProductX1HelperSelf.hlistModelCompat
      override def coproductModelCompat: CoProductFunc[CoLike2, ApCoProduct2] = ADTCoProductX1HelperSelf.coproductModelCompat
    }

}
