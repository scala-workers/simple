package net.scalax.simple.adt
package instance
package support

import nat.support.AppenderNatSupport2

object AppendTail2 {
  AppendTailSelf =>

  def adtMap1[A1 <: AdtCoProduct, A2 <: AdtCoProduct, C, D](
    a1: AdtCoProduct.UsePositive[C, A1] => A2
  ): AdtCoProduct.UsePositive[C, AdtCoProduct.UsePositive[D, A1]] => AdtCoProduct.UsePositive[D, A2] =
    (param: AdtCoProduct.UsePositive[C, AdtCoProduct.UsePositive[D, A1]]) => {
      val item1: AdtCoProduct.UsePositive[D, AdtCoProduct.UsePositive[C, A1]] =
        param.fold[AdtCoProduct.UsePositive[D, AdtCoProduct.UsePositive[C, A1]]](
          (au: C) => {
            AdtCoProduct.UsePositive.right[D, AdtCoProduct.UsePositive[C, A1]](AdtCoProduct.UsePositive.left[C, A1](au))
          },
          (au: AdtCoProduct.UsePositive[D, A1]) => {
            au.fold[AdtCoProduct.UsePositive[D, AdtCoProduct.UsePositive[C, A1]]](
              (a2: D) => {
                AdtCoProduct.UsePositive.left[D, AdtCoProduct.UsePositive[C, A1]](a2)
              },
              (a2: A1) => {
                AdtCoProduct.UsePositive.right[D, AdtCoProduct.UsePositive[C, A1]](AdtCoProduct.UsePositive.right[C, A1](a2))
              }
            )
          }
        )

      item1.fold[AdtCoProduct.UsePositive[D, A2]](
        (au: D) => AdtCoProduct.UsePositive.left[D, A2](au),
        (au: AdtCoProduct.UsePositive[C, A1]) => AdtCoProduct.UsePositive.right[D, A2](a1(au))
      )
    }

  def adtMapZero[A1, A2, C](
    func: A1 => C
  ): AdtCoProduct.UsePositive[A1, AdtCoProduct.UseOne[A2]] => AdtCoProduct.UsePositive[A2, AdtCoProduct.UseOne[C]] =
    (m1: AdtCoProduct.UsePositive[A1, AdtCoProduct.UseOne[A2]]) => {
      m1.fold[AdtCoProduct.UsePositive[A2, AdtCoProduct.UseOne[C]]](
        (a1: A1) => {
          AdtCoProduct.UsePositive.right[A2, AdtCoProduct.UseOne[C]](new AdtCoProduct.UseOne(func(a1)))
        },
        (a1: AdtCoProduct.UseOne[A2]) => {
          AdtCoProduct.UsePositive.left[A2, AdtCoProduct.UseOne[C]](a1.value)
        }
      )
    }

  def adtMapNum2[A1, A2, A3, C](
    func: A1 => C
  ): AdtCoProduct.UsePositive[A1, AdtCoProduct.UsePositive[A2, AdtCoProduct.UseOne[A3]]] => AdtCoProduct.UsePositive[
    A2,
    AdtCoProduct.UsePositive[A3, AdtCoProduct.UseOne[C]]
  ] = {
    adtMap1[AdtCoProduct.UseOne[A3], AdtCoProduct.UsePositive[A3, AdtCoProduct.UseOne[C]], A1, A2](adtMapZero[A1, A3, C](func))
  }

}
