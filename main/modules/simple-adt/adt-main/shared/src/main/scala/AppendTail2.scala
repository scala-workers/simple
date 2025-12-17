package net.scalax.simple.adt
package instance
package support

import nat.support.NatNext1

object AppendTailHelper2 {
  AppendTailSelf =>

  implicit def appendAbs1[XAA, S, CA <: AdtCoProduct, CB <: AdtCoProduct](implicit
    tail: AppendAdt1.AdtSupport[XAA, CA, CB]
  ): AppendAdt1.AdtSupport[XAA, AdtCoProduct.UsePositive[S, CA], AdtCoProduct.UsePositive[S, CB]] =
    tail.next[S, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]

  implicit def zeroAppender[Item1, Zero]
    : AppendAdt1.AdtSupport[Zero, AdtCoProduct.UseOne[Item1], AdtCoProduct.UsePositive[Item1, AdtCoProduct.UseOne[Zero]]] =
    AppendAdt1.adtSupportZero[Zero, Item1]

  def appendByDefault[U, Z1 <: AdtCoProduct, Z2 <: AdtCoProduct](
    input: AdtCoProduct.UsePositive[U, Z1]
  )(implicit u1: AppendAdt1.AdtSupport[U, Z1, Z2]): Z2 = {
    val ei1: Either[U, Z1] = input.fold((u: U) => Left(u), (z1: Z1) => Right(z1))
    u1.current(ei1)
  }

}
