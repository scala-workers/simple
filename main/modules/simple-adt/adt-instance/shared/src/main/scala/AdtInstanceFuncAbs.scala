package net.scalax.simple.adt
package instance

import net.scalax.simple.adt.instance.support.{AdtFunctionSupport, AdtFunctionSupportImpl}
import net.scalax.simple.adt.nat.support.{CoProductFunc, CoProductUtilN, HListFunc, ItemFunc}

trait AdtInstanceFuncAbs[M1[_, _], M2[_, _], M3[_, _], CoProduct1, APCoProduct1[
  _,
  _ <: CoProduct1
] <: CoProduct1, Product2, APProduct2[
  _,
  _ <: Product2
] <: Product2, CoProduct3, APCoProduct3[_, _ <: CoProduct3] <: CoProduct3] {
  AdtInstanceFuncAbsSelf =>

  def coProductFunc: Either[
    (CoProductFunc[CoProduct1, APCoProduct1], CoProductFunc[CoProduct3, APCoProduct3]),
    (HListFunc[CoProduct1, APCoProduct1], HListFunc[CoProduct3, APCoProduct3])
  ]

  def hlistFunc: HListFunc[Product2, APProduct2]

  def itemFunc: ItemFunc[M1, M2, M3]

  def appendSimpleAdt[A1, A2, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3](
    param: (Co1, Pro2) => Co3
  ): (APCoProduct1[M1[A1, A2], Co1], APProduct2[M2[A1, A2], Pro2]) => APCoProduct3[M3[A1, A2], Co3] = {
    CoProductUtilN.next[A1, A2, M1, M2, M3, CoProduct1, APCoProduct1, Product2, APProduct2, CoProduct3, APCoProduct3, Co1, Pro2, Co3](
      AdtInstanceFuncAbsSelf.coProductFunc,
      AdtInstanceFuncAbsSelf.hlistFunc,
      AdtInstanceFuncAbsSelf.itemFunc
    )(param)
  }

}

trait AdtInstanceFuncAbs2[M1[_, _], M2[_, _], M3[_, _], CoProduct1, APCoProduct1[
  _,
  _ <: CoProduct1
] <: CoProduct1, CoZero1 <: CoProduct1, Product2, APProduct2[
  _,
  _ <: Product2
] <: Product2, ProZero2 <: Product2, CoProduct3, APCoProduct3[_, _ <: CoProduct3] <: CoProduct3, CoZero3 <: CoProduct3]
    extends AdtInstanceFuncAbs[M1, M2, M3, CoProduct1, APCoProduct1, Product2, APProduct2, CoProduct3, APCoProduct3]
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
    ] {
  AdtInstanceFuncAbs2Self =>

  override def inputHList0: (CoZero1, ProZero2) => CoZero3

  override def inputHList1[T1, N1]
    : (APCoProduct1[M1[T1, N1], CoZero1], APProduct2[M2[T1, N1], ProZero2]) => APCoProduct3[M3[T1, N1], CoZero3] =
    AdtInstanceFuncAbs2Self.appendSimpleAdt[T1, N1, CoZero1, ProZero2, CoZero3](AdtInstanceFuncAbs2Self.inputHList0)

}

trait AdtFunctionSupportBuilder[M1[_, _], M2[_, _], M3[_, _], CoProduct1, APCoProduct1[
  _,
  _ <: CoProduct1
] <: CoProduct1, CoZero1 <: CoProduct1, Product2, APProduct2[
  _,
  _ <: Product2
] <: Product2, ProZero2 <: Product2, CoProduct3, APCoProduct3[_, _ <: CoProduct3] <: CoProduct3, CoZero3 <: CoProduct3]
    extends AdtInstanceFuncAbs2[
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
    with AdtFunctionSupportImpl[
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
  override def coProductFunc: Either[
    (CoProductFunc[CoProduct1, APCoProduct1], CoProductFunc[CoProduct3, APCoProduct3]),
    (HListFunc[CoProduct1, APCoProduct1], HListFunc[CoProduct3, APCoProduct3])
  ]
  override def hlistFunc: HListFunc[Product2, APProduct2]
  override def itemFunc: ItemFunc[M1, M2, M3]
  override def inputHList0: (CoZero1, ProZero2) => CoZero3
}

trait SameTypeAdtFunctionSupport[M1[_, _], M2[_, _], M3[_, _], CoProduct1, APCoProduct1[
  _,
  _ <: CoProduct1
] <: CoProduct1, CoZero1 <: CoProduct1, Product2, APProduct2[_, _ <: Product2] <: Product2, ProZero2 <: Product2]
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
      CoProduct1,
      APCoProduct1,
      CoZero1
    ] {
  override def inputHList0: (CoZero1, ProZero2) => CoZero1 = (a, b) => a
}

trait CoProductAdtFunctionSupportBuilder2[M1[_, _], M2[_, _], M3[_, _], CoProduct1, APCoProduct1[
  _,
  _ <: CoProduct1
] <: CoProduct1, CoZero1 <: CoProduct1, Product2, APProduct2[
  _,
  _ <: Product2
] <: Product2, ProZero2 <: Product2, CoProduct3, APCoProduct3[_, _ <: CoProduct3] <: CoProduct3, CoZero3 <: CoProduct3]
    extends AdtFunctionSupportBuilder[
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
  override def coProductFunc: Either[
    (CoProductFunc[CoProduct1, APCoProduct1], CoProductFunc[CoProduct3, APCoProduct3]),
    (HListFunc[CoProduct1, APCoProduct1], HListFunc[CoProduct3, APCoProduct3])
  ] = Left(coProductFuncInstance)

  def coProductFuncInstance: (CoProductFunc[CoProduct1, APCoProduct1], CoProductFunc[CoProduct3, APCoProduct3])
  override def hlistFunc: HListFunc[Product2, APProduct2]
  override def itemFunc: ItemFunc[M1, M2, M3]
  override def inputHList0: (CoZero1, ProZero2) => CoZero3
}

trait ProductAdtFunctionSupportBuilder2[M1[_, _], M2[_, _], M3[_, _], CoProduct1, APCoProduct1[
  _,
  _ <: CoProduct1
] <: CoProduct1, CoZero1 <: CoProduct1, Product2, APProduct2[
  _,
  _ <: Product2
] <: Product2, ProZero2 <: Product2, CoProduct3, APCoProduct3[_, _ <: CoProduct3] <: CoProduct3, CoZero3 <: CoProduct3]
    extends AdtFunctionSupportBuilder[
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
  override def coProductFunc: Either[
    (CoProductFunc[CoProduct1, APCoProduct1], CoProductFunc[CoProduct3, APCoProduct3]),
    (HListFunc[CoProduct1, APCoProduct1], HListFunc[CoProduct3, APCoProduct3])
  ] = Right(coProductFuncInstance)

  def coProductFuncInstance: (HListFunc[CoProduct1, APCoProduct1], HListFunc[CoProduct3, APCoProduct3])
  override def hlistFunc: HListFunc[Product2, APProduct2]
  override def itemFunc: ItemFunc[M1, M2, M3]
  override def inputHList0: (CoZero1, ProZero2) => CoZero3
}

trait SameTypeAdtFunctionSupportBuilder2[M1[_, _], M2[_, _], M3[_, _], CoProduct1, APCoProduct1[
  _,
  _ <: CoProduct1
] <: CoProduct1, CoZero1 <: CoProduct1, Product2, APProduct2[
  _,
  _ <: Product2
] <: Product2, ProZero2 <: Product2]
    extends AdtFunctionSupportBuilder[
      M1,
      M2,
      M3,
      CoProduct1,
      APCoProduct1,
      CoZero1,
      Product2,
      APProduct2,
      ProZero2,
      CoProduct1,
      APCoProduct1,
      CoZero1
    ] { SameTypeAdtFunctionSupportBuilder2Self =>
  override def coProductFunc: Either[
    (CoProductFunc[CoProduct1, APCoProduct1], CoProductFunc[CoProduct1, APCoProduct1]),
    (HListFunc[CoProduct1, APCoProduct1], HListFunc[CoProduct1, APCoProduct1])
  ] = SameTypeAdtFunctionSupportBuilder2Self.coProductFuncInstance.fold(s => Left((s, s)), s => Right((s, s)))

  def coProductFuncInstance: Either[CoProductFunc[CoProduct1, APCoProduct1], HListFunc[CoProduct1, APCoProduct1]]
  override def hlistFunc: HListFunc[Product2, APProduct2]
  override def itemFunc: ItemFunc[M1, M2, M3]
  override def inputHList0: (CoZero1, ProZero2) => CoZero1
}

trait SameTypeCoProductAdtFunctionSupportBuilder2[M1[_, _], M2[_, _], M3[_, _], CoProduct1, APCoProduct1[
  _,
  _ <: CoProduct1
] <: CoProduct1, CoZero1 <: CoProduct1, Product2, APProduct2[
  _,
  _ <: Product2
] <: Product2, ProZero2 <: Product2]
    extends SameTypeAdtFunctionSupportBuilder2[
      M1,
      M2,
      M3,
      CoProduct1,
      APCoProduct1,
      CoZero1,
      Product2,
      APProduct2,
      ProZero2
    ] { SameTypeCoProductAdtFunctionSupportBuilder2 =>
  override def coProductFuncInstance: Either[CoProductFunc[CoProduct1, APCoProduct1], HListFunc[CoProduct1, APCoProduct1]] = Left(
    SameTypeCoProductAdtFunctionSupportBuilder2.coProductInput
  )

  def coProductInput: CoProductFunc[CoProduct1, APCoProduct1]
  override def hlistFunc: HListFunc[Product2, APProduct2]
  override def itemFunc: ItemFunc[M1, M2, M3]
  override def inputHList0: (CoZero1, ProZero2) => CoZero1
}

trait SameTypeProductAdtFunctionSupportBuilder2[M1[_, _], M2[_, _], M3[_, _], CoProduct1, APCoProduct1[
  _,
  _ <: CoProduct1
] <: CoProduct1, CoZero1 <: CoProduct1, Product2, APProduct2[
  _,
  _ <: Product2
] <: Product2, ProZero2 <: Product2]
    extends SameTypeAdtFunctionSupportBuilder2[
      M1,
      M2,
      M3,
      CoProduct1,
      APCoProduct1,
      CoZero1,
      Product2,
      APProduct2,
      ProZero2
    ] { SameTypeProductAdtFunctionSupportBuilder2 =>
  override def coProductFuncInstance: Either[CoProductFunc[CoProduct1, APCoProduct1], HListFunc[CoProduct1, APCoProduct1]] = Right(
    SameTypeProductAdtFunctionSupportBuilder2.productInput
  )

  def productInput: HListFunc[CoProduct1, APCoProduct1]
  override def hlistFunc: HListFunc[Product2, APProduct2]
  override def itemFunc: ItemFunc[M1, M2, M3]
  override def inputHList0: (CoZero1, ProZero2) => CoZero1
}

class SameTypeCoProductAdtFunctionSupportBuilderImpl[M1[_, _], M2[_, _], M3[_, _], CoProduct1, APCoProduct1[
  _,
  _ <: CoProduct1
] <: CoProduct1, CoZero1 <: CoProduct1, Product2, APProduct2[
  _,
  _ <: Product2
] <: Product2, ProZero2 <: Product2](
  override val coProductInput: CoProductFunc[CoProduct1, APCoProduct1],
  override val hlistFunc: HListFunc[Product2, APProduct2],
  override val itemFunc: ItemFunc[M1, M2, M3]
) extends SameTypeCoProductAdtFunctionSupportBuilder2[
      M1,
      M2,
      M3,
      CoProduct1,
      APCoProduct1,
      CoZero1,
      Product2,
      APProduct2,
      ProZero2
    ]
    with SameTypeAdtFunctionSupport[M1, M2, M3, CoProduct1, APCoProduct1, CoZero1, Product2, APProduct2, ProZero2]
