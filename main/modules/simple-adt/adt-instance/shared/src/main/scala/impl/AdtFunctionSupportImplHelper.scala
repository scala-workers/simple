package net.scalax.simple.adt
package instance
package support

import net.scalax.simple.adt.nat.support.{AppendSupportUtil, CoProductUtilN, CoProductUtilNPre1, ItemFunc, ReverseAbstraction}

trait AdtFunctionSupportWithReverse[
  M1[_, _],
  M2[_, _],
  M3[_, _],
  CoProduct1,
  APCoProduct1[
    _,
    _ <: CoProduct1
  ] <: CoProduct1,
  CoZero1 <: CoProduct1,
  Product2,
  APProduct2[
    _,
    _ <: Product2
  ] <: Product2,
  ProZero2 <: Product2,
  CoProduct3,
  APCoProduct3[_, _ <: CoProduct3] <: CoProduct3,
  CoZero3 <: CoProduct3
] extends AdtFunctionSupport[
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
    ]
    with ReverseAbstraction[M1, M2] {
  override def reverse: AdtFunctionSupportWithReverse[
    M2,
    M1,
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
  ]
}

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

  def coProductFunc: CoProductUtilNPre1[M1, M2, M3, CoProduct1, Product2, CoProduct3, APCoProduct1, APProduct2, APCoProduct3]

  override def inputHList0: (CoZero1, ProZero2) => CoZero3

  override def inputHList1[T1, N1]
    : (APCoProduct1[M1[T1, N1], CoZero1], APProduct2[M2[T1, N1], ProZero2]) => APCoProduct3[M3[T1, N1], CoZero3] =
    AdtInstanceFuncAbsSelf.coProductFunc.next[T1, N1, CoZero1, ProZero2, CoZero3](AdtInstanceFuncAbsSelf.inputHList0)

}

trait AdtFunctionSupportImplHelper2[M1[_, _], M2[_, _], M3[_, _], CoProduct1, APCoProduct1[
  _,
  _ <: CoProduct1
] <: CoProduct1, CoZero1 <: CoProduct1, Product2, APProduct2[
  _,
  _ <: Product2
] <: Product2, ProZero2 <: Product2, CoProduct3, APCoProduct3[_, _ <: CoProduct3] <: CoProduct3, CoZero3 <: CoProduct3]
    extends AdtFunctionSupportImpl[
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
    ]
    with AdtFunctionSupport[
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
    ]
    with AdtFunctionSupportWithReverse[
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
    ]
    with ReverseAbstraction[M1, M2] {
  AdtFunctionSupportImplHelper2Self =>

  override def reverse: AdtFunctionSupportImplHelper2[
    M2,
    M1,
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
  ] = new AdtFunctionSupportImplHelper2[
    M2,
    M1,
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
    override final def inputHList0: (CoZero1, ProZero2) => CoZero3 = AdtFunctionSupportImplHelper2Self.inputHList0
    override final def coProductFunc: CoProductUtilN[M2, M1, M3, CoProduct1, Product2, CoProduct3, APCoProduct1, APProduct2, APCoProduct3] =
      AdtFunctionSupportImplHelper2Self.coProductFunc.reverse
  }

  override def coProductFunc: CoProductUtilN[M1, M2, M3, CoProduct1, Product2, CoProduct3, APCoProduct1, APProduct2, APCoProduct3]

}
