package net.scalax.simple.adt
package instance

import net.scalax.simple.adt.instance.support.impl2.FunctionM2Impl1

object ADTFuncBuilderHelper {

  def inputHList[X1 <: AdtCoProduct, X2 <: AdtCoProduct, Target](n: X1, target: Target)(implicit h: ToOptionHelper[X1, Target, X2]): X2 =
    h.inputCoProduct(n, target)

  trait ToOptionHelper[InputCoProduct <: AdtCoProduct, Target, OutCoProduct <: AdtCoProduct] {
    def inputCoProduct(i: InputCoProduct, t: Target): OutCoProduct
  }

  object ToOptionHelper {

    implicit def implicit1[I1, InputCoProduct <: AdtCoProduct, Target, OutCoProduct <: AdtCoProduct](implicit
      c: ToOptionHelper[InputCoProduct, Target, OutCoProduct]
    ): ToOptionHelper[
      AdtCoProduct.UsePositive[AdtFunction[Target, I1], InputCoProduct],
      Target,
      AdtCoProduct.UsePositive[I1, OutCoProduct]
    ] = new ToOptionHelper[
      AdtCoProduct.UsePositive[AdtFunction[Target, I1], InputCoProduct],
      Target,
      AdtCoProduct.UsePositive[I1, OutCoProduct]
    ] {
      override def inputCoProduct(
        i: AdtCoProduct.UsePositive[AdtFunction[Target, I1], InputCoProduct],
        t: Target
      ): AdtCoProduct.UsePositive[I1, OutCoProduct] = {
        val funcApply = FunctionM2Impl1.nextInstance.nextInstance.nextInstance.functionM2[I1, InputCoProduct, OutCoProduct, Target](
          (n1: InputCoProduct) => (n2: Target) => c.inputCoProduct(n1, n2)
        )

        val newCoProduct: AdtCoProduct.UsePositive[Target => I1, InputCoProduct] =
          i.fold[AdtCoProduct.UsePositive[Target => I1, InputCoProduct]](
            (f: AdtFunction[Target, I1]) =>
              AdtCoProduct.UsePositive.left[Target => I1, InputCoProduct]((xt: Target) => f.adtFunctionApply(xt)),
            (it: InputCoProduct) => AdtCoProduct.UsePositive.right[Target => I1, InputCoProduct](it)
          )

        funcApply(newCoProduct)(t)
      }
    }

    implicit def implicit2[Item1, Target]
      : ToOptionHelper[AdtCoProduct.UseOne[AdtFunction[Target, Item1]], Target, AdtCoProduct.UseOne[Item1]] =
      new ToOptionHelper[AdtCoProduct.UseOne[AdtFunction[Target, Item1]], Target, AdtCoProduct.UseOne[Item1]] {
        override def inputCoProduct(
          i: AdtCoProduct.UseOne[AdtFunction[Target, Item1]],
          t: Target
        ): AdtCoProduct.UseOne[Item1] = new AdtCoProduct.UseOne[Item1](i.value.adtFunctionApply(t))
      }

  }

}
