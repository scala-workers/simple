package net.scalax.simple.adt
package instance
package support

import net.scalax.simple.adt.nat.support.{AppendSupportUtil, CoProductUtilN, ItemFunc}

trait AdtFunctionSupportImplHelper[M1[_, _], M2[_, _], M3[_, _], CoProduct1, APCoProduct1[
  _,
  _ <: CoProduct1
] <: CoProduct1, CoZero1 <: CoProduct1, Product2, APProduct2[
  _,
  _ <: Product2
] <: Product2, ProZero2 <: Product2, CoProduct3, APCoProduct3[_, _ <: CoProduct3] <: CoProduct3, CoZero3 <: CoProduct3]
    extends AdtFunctionSupport[
      M1,
      M2,
      M3,
      CoProduct1,
      APCoProduct1,
      CoZero1,
      Product2,
      APProduct2,
      ProZero2,
      CoProduct3,
      APCoProduct3,
      CoZero3
    ] {
  AdtInstanceFuncAbsSelf =>

  def coProductFunc: CoProductUtilN[M1, M2, M3, CoProduct1, Product2, CoProduct3, APCoProduct1, APProduct2, APCoProduct3]

  override def inputHList0: (CoZero1, ProZero2) => CoZero3

  override def inputHList1[T1, N1]
    : (APCoProduct1[M1[T1, N1], CoZero1], APProduct2[M2[T1, N1], ProZero2]) => APCoProduct3[M3[T1, N1], CoZero3] =
    AdtInstanceFuncAbsSelf.coProductFunc.next[T1, N1, CoZero1, ProZero2, CoZero3](AdtInstanceFuncAbsSelf.inputHList0)

}

trait AdtFunctionSupportImplHelper2[CoProduct1, APCoProduct1[
  _,
  _ <: CoProduct1
] <: CoProduct1, CoZero1 <: CoProduct1, Product2, APProduct2[
  _,
  _ <: Product2
] <: Product2, ProZero2 <: Product2, CoProduct3, APCoProduct3[_, _ <: CoProduct3] <: CoProduct3, CoZero3 <: CoProduct3]
    extends AdtFunctionSupportImpl[
      ({ type Func2[A, B] = A })#Func2,
      ({ type Func2[A, B] = A => B })#Func2,
      ({ type Func2[A, B] = B })#Func2,
      CoProduct1,
      APCoProduct1,
      CoZero1,
      Product2,
      APProduct2,
      Product2,
      CoProduct3,
      APCoProduct3,
      CoProduct3
    ]
    with AdtFunctionSupport[
      ({ type Func2[A, B] = A })#Func2,
      ({ type Func2[A, B] = A => B })#Func2,
      ({ type Func2[A, B] = B })#Func2,
      CoProduct1,
      APCoProduct1,
      CoZero1,
      Product2,
      APProduct2,
      Product2,
      CoProduct3,
      APCoProduct3,
      CoProduct3
    ] {
  AdtFunctionSupportImplHelper2Self =>

  override def coProductFunc: CoProductUtilNImpl1[CoProduct1, Product2, CoProduct3, APCoProduct1, APProduct2, APCoProduct3]

}

trait CoProductUtilNImpl1[CoProduct1, Product2, CoProduct3, APCoProduct1[
  _,
  _ <: CoProduct1
] <: CoProduct1, APProduct2[
  _,
  _ <: Product2
] <: Product2, APCoProduct3[_, _ <: CoProduct3] <: CoProduct3]
    extends CoProductUtilN[
      ({ type Func2[A, B] = A })#Func2,
      ({ type Func2[A, B] = A => B })#Func2,
      ({ type Func2[A, B] = B })#Func2,
      CoProduct1,
      Product2,
      CoProduct3,
      APCoProduct1,
      APProduct2,
      APCoProduct3
    ] {
  override def content: AppendSupportUtil[CoProduct1, Product2, CoProduct3, APCoProduct1, APProduct2, APCoProduct3]
  override def typeGen: ItemFuncImpl1.type = ItemFuncImpl1
}

object ItemFuncImpl1
    extends ItemFunc[({ type Func2[A, B] = A })#Func2, ({ type Func2[A, B] = A => B })#Func2, ({ type Func2[A, B] = B })#Func2] {
  ItemFuncSelf =>
  override def gen10[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20]: (A, A => B) => B =
    (a: A, aToB: A => B) => aToB(a)
}
