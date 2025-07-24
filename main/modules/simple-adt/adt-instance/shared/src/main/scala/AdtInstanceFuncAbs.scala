package net.scalax.simple.adt
package instance

import net.scalax.simple.adt.instance.support.{AdtFunctionSupport, AdtFunctionSupportImpl}
import net.scalax.simple.adt.nat.support.{CoProductFunc, CoProductUtilN, HListFunc, ItemFunc}

trait AdtInstanceFuncAbs[M1[_, _], M2[_, _], M3[_, _], CoProduct1, APCoProduct1[_, _ <: CoProduct1] <: CoProduct1, Product2, APProduct2[
  _,
  _ <: Product2
] <: Product2, CoProduct3, APCoProduct3[_, _ <: CoProduct3] <: CoProduct3] { AdtInstanceFuncAbsSelf =>

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

trait AdtInstanceFuncAbs2[M1[_, _], M2[_, _], M3[_, _], CoProduct1, APCoProduct1[_, _ <: CoProduct1] <: CoProduct1, Product2, APProduct2[
  _,
  _ <: Product2
] <: Product2, CoProduct3, APCoProduct3[_, _ <: CoProduct3] <: CoProduct3]
    extends AdtInstanceFuncAbs[M1, M2, M3, CoProduct1, APCoProduct1, Product2, APProduct2, CoProduct3, APCoProduct3]
    with AdtFunctionSupport[M1, M2, M3, CoProduct1, APCoProduct1, Product2, APProduct2, CoProduct3, APCoProduct3] {
  AdtInstanceFuncAbs2Self =>

  override def inputHList0[Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3](zero: (Co1, Pro2) => Co3): (Co1, Pro2) => Co3 = zero

  override def inputHList1[T1, N1, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3](
    zero: (Co1, Pro2) => Co3
  ): (APCoProduct1[M1[T1, N1], Co1], APProduct2[M2[T1, N1], Pro2]) => APCoProduct3[M3[T1, N1], Co3] =
    AdtInstanceFuncAbs2Self.appendSimpleAdt[T1, N1, Co1, Pro2, Co3](AdtInstanceFuncAbs2Self.inputHList0[Co1, Pro2, Co3](zero))

}

object AdtFunctionSupportBuilder {

  def build[M1[_, _], M2[_, _], M3[_, _], CoProduct1, APCoProduct1[_, _ <: CoProduct1] <: CoProduct1, Product2, APProduct2[
    _,
    _ <: Product2
  ] <: Product2, CoProduct3, APCoProduct3[_, _ <: CoProduct3] <: CoProduct3](
    coProductFunc: Either[
      (CoProductFunc[CoProduct1, APCoProduct1], CoProductFunc[CoProduct3, APCoProduct3]),
      (HListFunc[CoProduct1, APCoProduct1], HListFunc[CoProduct3, APCoProduct3])
    ],
    hlistFunc: HListFunc[Product2, APProduct2],
    itemFunc: ItemFunc[M1, M2, M3]
  ): AdtFunctionSupport[M1, M2, M3, CoProduct1, APCoProduct1, Product2, APProduct2, CoProduct3, APCoProduct3] = {
    val coProductFunc1 = coProductFunc
    val hlistFunc1     = hlistFunc
    val itemFunc1      = itemFunc

    new AdtFunctionSupportImpl[M1, M2, M3, CoProduct1, APCoProduct1, Product2, APProduct2, CoProduct3, APCoProduct3] {
      override def coProductFunc: Either[
        (CoProductFunc[CoProduct1, APCoProduct1], CoProductFunc[CoProduct3, APCoProduct3]),
        (HListFunc[CoProduct1, APCoProduct1], HListFunc[CoProduct3, APCoProduct3])
      ] = coProductFunc1
      override def hlistFunc: HListFunc[Product2, APProduct2] = hlistFunc1
      override def itemFunc: ItemFunc[M1, M2, M3]             = itemFunc1
    }
  }

}
