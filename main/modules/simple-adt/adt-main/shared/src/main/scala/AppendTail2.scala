package net.scalax.simple.adt
package instance
package support

import nat.support.NatNext1

object AppendTailHelper2 {
  AppendTailSelf =>

  implicit def appendAbs1[XAA, S, CA <: AdtCoProduct, CB <: AdtCoProduct](implicit
    tail: NatNext1.Support2[
      ({ type M2[A, B] = Either[XAA, A] => B })#M2,
      ({ type Id[T] = T })#Id,
      ({ type Id[T] = T })#Id,
      AdtCoProduct,
      AdtCoProduct,
      AdtCoProduct.UsePositive,
      AdtCoProduct.UsePositive,
      CA,
      CB
    ]
  ): NatNext1.Support2[
    ({ type M2[A, B] = Either[XAA, A] => B })#M2,
    ({ type Id[T] = T })#Id,
    ({ type Id[T] = T })#Id,
    AdtCoProduct,
    AdtCoProduct,
    AdtCoProduct.UsePositive,
    AdtCoProduct.UsePositive,
    AdtCoProduct.UsePositive[S, CA],
    AdtCoProduct.UsePositive[S, CB]
  ] = tail.next[S]

  implicit def zeroAppender[Item1, Zero]: NatNext1.Support2[
    ({ type M2[A, B] = Either[Zero, A] => B })#M2,
    ({ type Id[T] = T })#Id,
    ({ type Id[T] = T })#Id,
    AdtCoProduct,
    AdtCoProduct,
    AdtCoProduct.UsePositive,
    AdtCoProduct.UsePositive,
    AdtCoProduct.UseOne[Item1],
    AdtCoProduct.UsePositive[Item1, AdtCoProduct.UseOne[Zero]]
  ] = AppendTail5.adtSupportZero[Zero, Item1]

  def appendByDefault[U, Z1 <: AdtCoProduct, Z2 <: AdtCoProduct](input: AdtCoProduct.UsePositive[U, Z1])(implicit
    u1: NatNext1.Support2[
      ({ type M2[A, B] = Either[U, A] => B })#M2,
      ({ type Id[T] = T })#Id,
      ({ type Id[T] = T })#Id,
      AdtCoProduct,
      AdtCoProduct,
      AdtCoProduct.UsePositive,
      AdtCoProduct.UsePositive,
      Z1,
      Z2
    ]
  ): Z2 = {
    val ei1: Either[U, Z1] = input.fold((u: U) => Left(u), (z1: Z1) => Right(z1))

    u1.current(ei1)
  }

}
