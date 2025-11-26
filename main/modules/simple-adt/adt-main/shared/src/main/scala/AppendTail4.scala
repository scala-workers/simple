package net.scalax.simple.adt
package instance
package support

import nat.support.NatNext1

object AppendTail5 {
  AppendTailSelf =>

  def adtSupport[Zero, Pos1 <: AdtCoProduct, Pos2 <: AdtCoProduct](
    current: Either[Zero, Pos1] => Pos2
  ): NatNext1.Support2[
    ({ type M2[A, B] = Either[Zero, A] => B })#M2,
    AdtCoProduct,
    AdtCoProduct,
    AdtCoProduct.UsePositive,
    AdtCoProduct.UsePositive,
    Pos1,
    Pos2
  ] = {
    val current1: Either[Zero, Pos1] => Pos2 = current
    def current2[UA]: Either[Zero, AdtCoProduct.UsePositive[UA, Pos1]] => AdtCoProduct.UsePositive[UA, Pos2] =
      (param: Either[Zero, AdtCoProduct.UsePositive[UA, Pos1]]) => {
        val value1: AdtCoProduct.UsePositive[UA, AdtCoProduct.UsePositive[Zero, Pos1]] =
          param.fold(
            (zero: Zero) =>
              AdtCoProduct.UsePositive.right[UA, AdtCoProduct.UsePositive[Zero, Pos1]](AdtCoProduct.UsePositive.left[Zero, Pos1](zero)),
            (rightAdt: AdtCoProduct.UsePositive[UA, Pos1]) =>
              rightAdt.fold(
                (ua: UA) => AdtCoProduct.UsePositive.left[UA, AdtCoProduct.UsePositive[Zero, Pos1]](ua),
                (pos1: Pos1) =>
                  AdtCoProduct.UsePositive.right[UA, AdtCoProduct.UsePositive[Zero, Pos1]](AdtCoProduct.UsePositive.right[Zero, Pos1](pos1))
              )
          )

        def toEither(i: AdtCoProduct.UsePositive[Zero, Pos1]): Either[Zero, Pos1] =
          i.fold((zero: Zero) => Left(zero), (pos1: Pos1) => Right(pos1))

        value1.fold(
          (ua: UA) => AdtCoProduct.UsePositive.left[UA, Pos2](ua),
          (r1: AdtCoProduct.UsePositive[Zero, Pos1]) => AdtCoProduct.UsePositive.right[UA, Pos2](current1(toEither(r1)))
        )
      }

    new NatNext1.Support2[
      ({ type M2[A, B] = Either[Zero, A] => B })#M2,
      AdtCoProduct,
      AdtCoProduct,
      AdtCoProduct.UsePositive,
      AdtCoProduct.UsePositive,
      Pos1,
      Pos2
    ] {
      override def current: Either[Zero, Pos1] => Pos2 = current1
      override def next[XUU]: NatNext1.Support2[
        ({ type M2[A, B] = Either[Zero, A] => B })#M2,
        AdtCoProduct,
        AdtCoProduct,
        AdtCoProduct.UsePositive,
        AdtCoProduct.UsePositive,
        AdtCoProduct.UsePositive[XUU, Pos1],
        AdtCoProduct.UsePositive[XUU, Pos2]
      ] = adtSupport[Zero, AdtCoProduct.UsePositive[XUU, Pos1], AdtCoProduct.UsePositive[XUU, Pos2]](current2[XUU])
    }
  }

  def adtSupportZero[Zero, OneValue]: NatNext1.Support2[
    ({ type M2[A, B] = Either[Zero, A] => B })#M2,
    AdtCoProduct,
    AdtCoProduct,
    AdtCoProduct.UsePositive,
    AdtCoProduct.UsePositive,
    AdtCoProduct.UseOne[OneValue],
    AdtCoProduct.UsePositive[OneValue, AdtCoProduct.UseOne[Zero]]
  ] = {
    val func: Either[Zero, AdtCoProduct.UseOne[OneValue]] => AdtCoProduct.UsePositive[OneValue, AdtCoProduct.UseOne[Zero]] =
      (zeroEither: Either[Zero, AdtCoProduct.UseOne[OneValue]]) => {
        zeroEither.fold(
          (zero: Zero) =>
            AdtCoProduct.UsePositive.right[OneValue, AdtCoProduct.UseOne[Zero]](new AdtCoProduct.UseOne[Zero] {
              override val value: Zero = zero
            }),
          (oneValue: AdtCoProduct.UseOne[OneValue]) => AdtCoProduct.UsePositive.left[OneValue, AdtCoProduct.UseOne[Zero]](oneValue.value)
        )
      }

    adtSupport[Zero, AdtCoProduct.UseOne[OneValue], AdtCoProduct.UsePositive[OneValue, AdtCoProduct.UseOne[Zero]]](func)
  }

}
