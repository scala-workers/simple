package net.scalax.simple.adt
package instance
package support

object AppendAdt1 {

  trait AdtSupport[Zero, Pos1 <: AdtCoProduct.UsePositive[_, _], Pos2 <: AdtCoProduct.UsePositive[_, _]]
      extends SimpleAppenderAlias.AppenderAlias[
        ({
          type M22[
            T1,
            T2
          ] = Either[Zero, T1] => T2
        })#M22,
        AdtCoProduct.UsePositive[_, _],
        AdtCoProduct.UsePositive[_, _],
        AdtCoProduct.UsePositive,
        AdtCoProduct.UsePositive,
        Pos1,
        Pos2
      ] {
    AdtSupportSelf =>

    override def next[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
      : AdtSupport[Zero, AdtCoProduct.UsePositive[T1, Pos1], AdtCoProduct.UsePositive[T1, Pos2]] =
      new AdtSupport[Zero, AdtCoProduct.UsePositive[T1, Pos1], AdtCoProduct.UsePositive[T1, Pos2]] {
        override def current: Either[Zero, AdtCoProduct.UsePositive[T1, Pos1]] => AdtCoProduct.UsePositive[T1, Pos2] =
          (param: Either[Zero, AdtCoProduct.UsePositive[T1, Pos1]]) => {
            val value1: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[Zero, Pos1]] =
              param.fold(
                (zero: Zero) =>
                  AdtCoProduct.UsePositive.right[T1, AdtCoProduct.UsePositive[Zero, Pos1]](AdtCoProduct.UsePositive.left[Zero, Pos1](zero)),
                (rightAdt: AdtCoProduct.UsePositive[T1, Pos1]) =>
                  rightAdt._foldCoProduct(
                    (ua: T1) => AdtCoProduct.UsePositive.left[T1, AdtCoProduct.UsePositive[Zero, Pos1]](ua),
                    (pos1: Pos1) =>
                      AdtCoProduct.UsePositive.right[T1, AdtCoProduct.UsePositive[Zero, Pos1]](
                        AdtCoProduct.UsePositive.right[Zero, Pos1](pos1)
                      )
                  )
              )

            def toEither(i: AdtCoProduct.UsePositive[Zero, Pos1]): Either[Zero, Pos1] =
              i._foldCoProduct((zero: Zero) => Left(zero), (pos1: Pos1) => Right(pos1))

            value1._foldCoProduct(
              (ua: T1) => AdtCoProduct.UsePositive.left[T1, Pos2](ua),
              (r1: AdtCoProduct.UsePositive[Zero, Pos1]) => AdtCoProduct.UsePositive.right[T1, Pos2](AdtSupportSelf.current(toEither(r1)))
            )
          }
      }
  }

  def adtSupportZero[Zero, OneValue]
    : AdtSupport[Zero, AdtCoProduct.UseOne[OneValue], AdtCoProduct.UsePositive[OneValue, AdtCoProduct.UseOne[Zero]]] = {
    val func: Either[Zero, AdtCoProduct.UseOne[OneValue]] => AdtCoProduct.UsePositive[OneValue, AdtCoProduct.UseOne[Zero]] =
      (zeroEither: Either[Zero, AdtCoProduct.UseOne[OneValue]]) => {
        zeroEither.fold(
          (zero: Zero) => AdtCoProduct.UsePositive.right[OneValue, AdtCoProduct.UseOne[Zero]](AdtCoProduct.UseOne.left[Zero](zero)),
          (oneValue: AdtCoProduct.UseOne[OneValue]) =>
            AdtCoProduct.UsePositive.left[OneValue, AdtCoProduct.UseOne[Zero]](AdtCoProduct.UseOne.unapply(oneValue).value)
        )
      }

    new AdtSupport[Zero, AdtCoProduct.UseOne[OneValue], AdtCoProduct.UsePositive[OneValue, AdtCoProduct.UseOne[Zero]]] {
      override val current: Either[Zero, AdtCoProduct.UseOne[OneValue]] => AdtCoProduct.UsePositive[OneValue, AdtCoProduct.UseOne[Zero]] =
        func
    }
  }

}
