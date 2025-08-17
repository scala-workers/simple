package net.scalax.simple.adt
package instance

trait ADTCoProductX4Helper[CoProduct1, APCoProduct1[_, _ <: CoProduct1] <: CoProduct1, CoZero1 <: CoProduct1] { ADTCoProductX4HelperSelf =>

  def supportX3: support.ADTCoProductX3[Product1, APProduct1, ProZero1]
  def supportX1: support.ADTCoProductX1[Product1, APProduct1, ProZero1, CoProduct1, APCoProduct1, CoZero1]

  type Product1
  type APProduct1[_, _ <: Product1] <: Product1
  type ProZero1 <: Product1

  private def inputHList0Impl1[Target]: CoZero1 => Option[Target] =
    ADTCoProductX4HelperSelf.supportX1.inputHList0[Target](ADTCoProductX4HelperSelf.supportX3.inputHList0[Target])

  private lazy val inputHList0Imp2: CoZero1 => Option[Nothing] = inputHList0Impl1[Nothing]

  def inputHList0[Target]: CoZero1 => Option[Target] = inputHList0Imp2

}
