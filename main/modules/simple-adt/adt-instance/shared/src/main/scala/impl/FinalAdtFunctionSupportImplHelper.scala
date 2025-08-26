package net.scalax.simple.adt
package instance
package support

import net.scalax.simple.adt.nat.support.{AppendSupportUtil, CoProductUtilN, CoProductUtilNPre1, ItemFunc, ReverseAbstraction}

trait FinalCoProductUtilN[M1[_, _], M2[_, _], M3[_, _], CoProduct1, APCoProduct1[
  _,
  _ <: CoProduct1
] <: CoProduct1, Product2, APProduct2[
  _,
  _ <: Product2
] <: Product2, CoProduct3, APCoProduct3[_, _ <: CoProduct3] <: CoProduct3]
    extends CoProductUtilN[M1, M2, M3, CoProduct1, Product2, CoProduct3, APCoProduct1, APProduct2, APCoProduct3] {
  FinalCoProductUtilNSelf =>

  override def content: AppendSupportUtil[CoProduct1, Product2, CoProduct3, APCoProduct1, APProduct2, APCoProduct3]
  override def typeGen: ItemFunc[M1, M2, M3]

  private lazy val instant1: CoProductUtilN[M2, M1, M3, CoProduct1, Product2, CoProduct3, APCoProduct1, APProduct2, APCoProduct3] =
    super.reverse

  override object reverse extends CoProductUtilN[M2, M1, M3, CoProduct1, Product2, CoProduct3, APCoProduct1, APProduct2, APCoProduct3] {

    override val content: AppendSupportUtil[CoProduct1, Product2, CoProduct3, APCoProduct1, APProduct2, APCoProduct3] = instant1.content
    override val typeGen: ItemFunc[M2, M1, M3]                                                                        = instant1.typeGen
    override lazy val reverse: FinalCoProductUtilN[
      M1,
      M2,
      M3,
      CoProduct1,
      APCoProduct1,
      Product2,
      APProduct2,
      CoProduct3,
      APCoProduct3
    ] = FinalCoProductUtilNSelf

  }
}

trait FinalAdtFunctionSupportImplHelper2[M1[_, _], M2[_, _], M3[_, _], CoProduct1, APCoProduct1[
  _,
  _ <: CoProduct1
] <: CoProduct1, CoZero1 <: CoProduct1, Product2, APProduct2[
  _,
  _ <: Product2
] <: Product2, ProZero2 <: Product2, CoProduct3, APCoProduct3[_, _ <: CoProduct3] <: CoProduct3, CoZero3 <: CoProduct3]
    extends AdtFunctionSupportImplHelper2[
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
  FinalAdtFunctionSupportImplHelper2Self =>

  override def inputHList0: (CoZero1, ProZero2) => CoZero3
  override def coProductFunc: FinalCoProductUtilN[M1, M2, M3, CoProduct1, APCoProduct1, Product2, APProduct2, CoProduct3, APCoProduct3]

  private lazy val instant1: AdtFunctionSupportImplHelper2[
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
  ] = super.reverse

  override object reverse
      extends AdtFunctionSupportImplHelper2[
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
    override final lazy val inputHList0: (CoZero1, ProZero2) => CoZero3 = instant1.inputHList0
    override final lazy val coProductFunc
      : CoProductUtilN[M2, M1, M3, CoProduct1, Product2, CoProduct3, APCoProduct1, APProduct2, APCoProduct3] = instant1.coProductFunc
    override final lazy val reverse: AdtFunctionSupportImplHelper2[
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
    ] = FinalAdtFunctionSupportImplHelper2Self
  }

}
