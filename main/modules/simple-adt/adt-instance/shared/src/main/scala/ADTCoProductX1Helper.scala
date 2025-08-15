package net.scalax.simple.adt
package instance

import nat.support.{CoProductFunc, FoldCoProductUtilN, HListFunc}

trait ADTCoProductX1Helper[Product1, APProduct1[_, _ <: Product1] <: Product1, ProZero1 <: Product1, CoProduct2, APCoProduct2[
  _,
  _ <: CoProduct2
] <: CoProduct2, CoZero2 <: CoProduct2] { ADTCoProductX1HelperSelf =>

  def hlistModelCompat: HListFunc[Product1, APProduct1]
  def coproductModelCompat: CoProductFunc[CoProduct2, APCoProduct2]

  def util: FoldCoProductUtilN[Product1, APProduct1, CoProduct2, APCoProduct2] =
    new FoldCoProductUtilN[Product1, APProduct1, CoProduct2, APCoProduct2] {
      override def hlistModelCompat: HListFunc[Product1, APProduct1]             = ADTCoProductX1HelperSelf.hlistModelCompat
      override def coproductModelCompat: CoProductFunc[CoProduct2, APCoProduct2] = ADTCoProductX1HelperSelf.coproductModelCompat
    }

  def inputHList0[Target]: ProZero1 => CoZero2 => Option[Target] = ADTCoProductX1Helper.inputHList0Impl

}

object ADTCoProductX1Helper {
  private val inputHList0Impl2: Any => None.type = (b1: Any) => None
  val inputHList0Impl: Any => Any => None.type   = (a1: Any) => inputHList0Impl2
}
