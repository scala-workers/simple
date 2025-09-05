package net.scalax.simple.adt
package instance
package support
package impl2

import net.scalax.simple.adt.nat.support.AppenderNatSupport2

trait ProductAppendSupportAbs[M2[_, _], CoLike1, ApCoProduct1[
  _,
  _ <: CoLike1
] <: CoLike1, CoLike2, ApCoProduct2[
  _,
  _ <: CoLike2
] <: CoLike2, CoLike3, ApCoProduct3[_, _ <: CoLike3] <: CoLike3, CoLike4, ApCoProduct4[
  _,
  _ <: CoLike4
] <: CoLike4] {
  def supportTypeParameter[CTX]: AppenderNatSupport2[
    ({ type Func3[A, B] = A => M2[B, CTX] })#Func3,
    CoLike1,
    CoLike2,
    ApCoProduct1,
    ApCoProduct2
  ]

  def nextInstance: ProductAppendSupportAbs[
    ({ type NextParam[A, B] = M2[B, A] })#NextParam,
    CoLike2,
    ApCoProduct2,
    CoLike3,
    ApCoProduct3,
    CoLike4,
    ApCoProduct4,
    CoLike1,
    ApCoProduct1
  ]
}

object ProductAppendSupporImpl1
    extends ProductAppendSupportAbs[
      ({ type Func1[A, B] = A => B })#Func1,
      AdtCoProduct,
      AdtCoProduct.UsePositive,
      AdtHList,
      AdtHList.UsePositive,
      AdtHList,
      AdtHList.UsePositive,
      AdtCoProduct,
      AdtCoProduct.UsePositive
    ] {

  override def supportTypeParameter[CTX]: AppenderNatSupport2[
    ({ type Func3[A, B] = A => B => CTX })#Func3,
    AdtCoProduct,
    AdtHList,
    AdtCoProduct.UsePositive,
    AdtHList.UsePositive
  ] = new AppenderNatSupport2[
    ({ type Func3[A, B] = A => B => CTX })#Func3,
    AdtCoProduct,
    AdtHList,
    AdtCoProduct.UsePositive,
    AdtHList.UsePositive
  ] {
    override def append[T1, T2, HCollection1 <: AdtCoProduct, HCollection2 <: AdtHList](
      p1: T1 => T2 => CTX,
      p2: HCollection1 => HCollection2 => CTX
    ): AdtCoProduct.UsePositive[T1, HCollection1] => AdtHList.UsePositive[T2, HCollection2] => CTX =
      (param1: AdtCoProduct.UsePositive[T1, HCollection1]) => { (param2: AdtHList.UsePositive[T2, HCollection2]) =>
        {
          param1.fold[CTX](t1 => p1(t1)(param2.head), h1 => p2(h1)(param2.tail))
        }
      }
  }

  override lazy val nextInstance: ProductAppendSupporImpl2.type = ProductAppendSupporImpl2

}

object ProductAppendSupporImpl2
    extends ProductAppendSupportAbs[
      ({ type Func1[A, B] = B => A })#Func1,
      AdtHList,
      AdtHList.UsePositive,
      AdtHList,
      AdtHList.UsePositive,
      AdtCoProduct,
      AdtCoProduct.UsePositive,
      AdtCoProduct,
      AdtCoProduct.UsePositive
    ] {

  override def supportTypeParameter[CTX]
    : AppenderNatSupport2[({ type Func3[A, B] = A => CTX => B })#Func3, AdtHList, AdtHList, AdtHList.UsePositive, AdtHList.UsePositive] =
    new AppenderNatSupport2[({ type Func3[A, B] = A => CTX => B })#Func3, AdtHList, AdtHList, AdtHList.UsePositive, AdtHList.UsePositive] {
      override def append[T1, T2, HCollection1 <: AdtHList, HCollection2 <: AdtHList](
        p1: T1 => CTX => T2,
        p2: HCollection1 => CTX => HCollection2
      ): AdtHList.UsePositive[T1, HCollection1] => CTX => AdtHList.UsePositive[T2, HCollection2] =
        (param1: AdtHList.UsePositive[T1, HCollection1]) => { (ctx: CTX) =>
          val t2: T2           = p1(param1.head)(ctx)
          val h2: HCollection2 = p2(param1.tail)(ctx)

          AdtHList.UsePositive.append[T2, HCollection2](t2, h2)
        }
    }

  override lazy val nextInstance: ProductAppendSupporImpl3.type = ProductAppendSupporImpl3

}

object ProductAppendSupporImpl3
    extends ProductAppendSupportAbs[
      ({ type Func1[A, B] = A => B })#Func1,
      AdtHList,
      AdtHList.UsePositive,
      AdtCoProduct,
      AdtCoProduct.UsePositive,
      AdtCoProduct,
      AdtCoProduct.UsePositive,
      AdtHList,
      AdtHList.UsePositive
    ] {

  override def supportTypeParameter[CTX]: AppenderNatSupport2[
    ({ type Func3[A, B] = A => B => CTX })#Func3,
    AdtHList,
    AdtCoProduct,
    AdtHList.UsePositive,
    AdtCoProduct.UsePositive
  ] = new AppenderNatSupport2[
    ({ type Func3[A, B] = A => B => CTX })#Func3,
    AdtHList,
    AdtCoProduct,
    AdtHList.UsePositive,
    AdtCoProduct.UsePositive
  ] {
    override def append[T1, T2, HCollection1 <: AdtHList, HCollection2 <: AdtCoProduct](
      p1: T1 => T2 => CTX,
      p2: HCollection1 => HCollection2 => CTX
    ): AdtHList.UsePositive[T1, HCollection1] => AdtCoProduct.UsePositive[T2, HCollection2] => CTX =
      (param1: AdtHList.UsePositive[T1, HCollection1]) => { (param2: AdtCoProduct.UsePositive[T2, HCollection2]) =>
        {
          param2.fold[CTX]((t2: T2) => p1(param1.head)(t2), (h2: HCollection2) => p2(param1.tail)(h2))
        }
      }
  }

  override lazy val nextInstance: ProductAppendSupporImpl4.type = ProductAppendSupporImpl4

}

object ProductAppendSupporImpl4
    extends ProductAppendSupportAbs[
      ({ type Func1[A, B] = B => A })#Func1,
      AdtCoProduct,
      AdtCoProduct.UsePositive,
      AdtCoProduct,
      AdtCoProduct.UsePositive,
      AdtHList,
      AdtHList.UsePositive,
      AdtHList,
      AdtHList.UsePositive
    ] {

  override def supportTypeParameter[CTX]: AppenderNatSupport2[
    ({ type Func3[A, B] = A => CTX => B })#Func3,
    AdtCoProduct,
    AdtCoProduct,
    AdtCoProduct.UsePositive,
    AdtCoProduct.UsePositive
  ] = new AppenderNatSupport2[
    ({ type Func3[A, B] = A => CTX => B })#Func3,
    AdtCoProduct,
    AdtCoProduct,
    AdtCoProduct.UsePositive,
    AdtCoProduct.UsePositive
  ] {
    override def append[T1, T2, HCollection1 <: AdtCoProduct, HCollection2 <: AdtCoProduct](
      p1: T1 => CTX => T2,
      p2: HCollection1 => CTX => HCollection2
    ): AdtCoProduct.UsePositive[T1, HCollection1] => CTX => AdtCoProduct.UsePositive[T2, HCollection2] =
      (param1: AdtCoProduct.UsePositive[T1, HCollection1]) => { (ctx: CTX) =>
        {
          param1.fold[AdtCoProduct.UsePositive[T2, HCollection2]](
            (t1: T1) => AdtCoProduct.UsePositive.left[T2, HCollection2](p1(t1)(ctx)),
            (h1: HCollection1) => AdtCoProduct.UsePositive.right[T2, HCollection2](p2(h1)(ctx))
          )

        }
      }
  }

  override lazy val nextInstance: ProductAppendSupporImpl1.type = ProductAppendSupporImpl1

}
