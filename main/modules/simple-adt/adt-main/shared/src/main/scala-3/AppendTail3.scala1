package net.scalax.simple.adt
package instance
package support

import nat.support.AppenderNatSupport2

object AppendTail3 {
  AppendTailSelf =>

  trait IOInput[-I, +O] {
    def input(i: I): O
  }

  def adtMap1[A1 <: AdtCoProduct, A2 <: AdtCoProduct, C, D](
    a1: AdtCoProduct.UsePositive[C, A1] => A2
  ): AdtCoProduct.UsePositive[C, AdtCoProduct.UsePositive[D, A1]] => AdtCoProduct.UsePositive[D, A2] = ???

  trait ContextC[C] {
    type matchAppend[item, ei <: Either[C, ? <: AdtCoProduct]] = ei match {
      case Either[a, b] => Either[a, AdtCoProduct.UsePositive[item, b]]
    }

    def support2: AppenderNatSupport2[
      IOInput,
      Either[C, ? <: AdtCoProduct],
      AdtCoProduct,
      matchAppend,
      AdtCoProduct.UsePositive
    ] = new AppenderNatSupport2[
      IOInput,
      Either[C, ? <: AdtCoProduct],
      AdtCoProduct,
      matchAppend,
      AdtCoProduct.UsePositive
    ] {
      override def append[T1, T2, HCollection1 <: Either[C, ? <: AdtCoProduct], HCollection2 <: AdtCoProduct](
        p1: IOInput[T1, T2],
        p2: IOInput[HCollection1, HCollection2]
      ): IOInput[matchAppend[T1, HCollection1], AdtCoProduct.UsePositive[T2, HCollection2]] = {

        def input1Impl[IB <: AdtCoProduct](
          mu2: IOInput[Either[C, IB], HCollection2]
        ): IOInput[Either[C, AdtCoProduct.UsePositive[T1, IB]], AdtCoProduct.UsePositive[T2, HCollection2]] =
          new IOInput[Either[C, AdtCoProduct.UsePositive[T1, IB]], AdtCoProduct.UsePositive[T2, HCollection2]] {
            override def input(i: Either[C, AdtCoProduct.UsePositive[T1, IB]]): AdtCoProduct.UsePositive[T2, HCollection2] = {
              val item1: Either[T1, Either[C, IB]] = i.fold[Either[T1, Either[C, IB]]](
                (a1: C) => Right(Left(a1)),
                (a1: AdtCoProduct.UsePositive[T1, IB]) =>
                  a1.fold[Either[T1, Either[C, IB]]]((a2: T1) => Left(a2), (a2: IB) => Right(Right(a2)))
              )

              item1.fold[AdtCoProduct.UsePositive[T2, HCollection2]](
                (a1: T1) => AdtCoProduct.UsePositive.left[T2, HCollection2](p1.input(a1)),
                (a1: Either[C, IB]) => AdtCoProduct.UsePositive.right[T2, HCollection2](mu2.input(a1))
              )
            }
          }

        def input2Impl[IB <: AdtCoProduct](
          mu2: IOInput[Either[C, IB], HCollection2]
        ): IOInput[matchAppend[T1, Either[C, IB]], AdtCoProduct.UsePositive[T2, HCollection2]] = input1Impl[IB](mu2)

        def input3Impl[HC <: Either[C, ? <: AdtCoProduct]](
          mu2: IOInput[HC, HCollection2]
        ): IOInput[matchAppend[T1, HC], AdtCoProduct.UsePositive[T2, HCollection2]] =
          new IOInput[matchAppend[T1, HC], AdtCoProduct.UsePositive[T2, HCollection2]] {
            override def input(i1: matchAppend[T1, HC]): AdtCoProduct.UsePositive[T2, HCollection2] = ???
          }

        (param: matchAppend[T1, HCollection1]) => {
          ??? : AdtCoProduct.UsePositive[T2, HCollection2]
        }
      }
      /*(either1: Either[C, AdtCoProduct.UsePositive[T1, HCollection1]]) => {
          val item1: Either[T1, Either[C, HCollection1]] = either1.fold(
            (l: C) => Right(Left(l)),
            (r: AdtCoProduct.UsePositive[T1, HCollection1]) => r.fold(c1 => Left(c1), c1 => Right(Right(c1)))
          )

          val item2: Either[T1, HCollection2] = for (u1 <- item1) yield p2(u1)

          ??? : AdtCoProduct.UsePositive[T2, HCollection2]
        }*/
    }

    /*def zero[A1]: Either[C, AdtCoProduct.UseOne[A1]] => AdtCoProduct.UsePositive[A1, AdtCoProduct.UseOne[C]] =
      (param: Either[C, AdtCoProduct.UseOne[A1]]) => {
        param.fold[AdtCoProduct.UsePositive[A1, AdtCoProduct.UseOne[C]]](
          a => AdtCoProduct.UsePositive.right[A1, AdtCoProduct.UseOne[C]](new AdtCoProduct.UseOne(a)),
          b => AdtCoProduct.UsePositive.left[A1, AdtCoProduct.UseOne[C]](b.value)
        )
      }

    def num1[A2, A1](
      u: C => A2
    ): Either[C, AdtCoProduct.UsePositive[A2, AdtCoProduct.UseOne[A1]]] => AdtCoProduct.UsePositive[
      A2,
      AdtCoProduct.UsePositive[A1, AdtCoProduct.UseOne[C]]
    ] =
      support2.append[A2, A2, AdtCoProduct.UseOne[A1], AdtCoProduct.UsePositive[A1, AdtCoProduct.UseOne[C]]](
        (e1: Either[C, A2]) => e1.fold(u, identity[A2]),
        zero[A1]
      )*/
  }

}
