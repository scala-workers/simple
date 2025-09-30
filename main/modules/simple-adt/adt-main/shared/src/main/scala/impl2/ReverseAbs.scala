package net.scalax.simple.adt
package instance
package support
package impl2



trait FunctionM2Abs[M2[_, _], Nat1, Nat1Positive[_, _ <: Nat1] <: Nat1, Nat2, Nat2Positive[
  _,
  _ <: Nat2
] <: Nat2, Nat3, Nat3Positive[_, _ <: Nat3] <: Nat3, Nat4, Nat4Positive[_, _ <: Nat4] <: Nat4] {

  def functionM2[Item, N1 <: Nat1, N2 <: Nat2, CTX](
    param: N1 => M2[N2, CTX]
  ): Nat1Positive[M2[Item, CTX], N1] => M2[Nat2Positive[Item, N2], CTX]

  def nextInstance: FunctionM2Abs[
    ({ type NextParam[A, B] = M2[B, A] })#NextParam,
    Nat2,
    Nat2Positive,
    Nat3,
    Nat3Positive,
    Nat4,
    Nat4Positive,
    Nat1,
    Nat1Positive
  ]

}

trait FunctionM2Abs2[M2[_, _], Nat1, Nat1Positive[_, _ <: Nat1] <: Nat1, Nat2, Nat2Positive[
  _,
  _ <: Nat2
] <: Nat2, Nat3, Nat3Positive[_, _ <: Nat3] <: Nat3, Nat4, Nat4Positive[_, _ <: Nat4] <: Nat4]
    extends FunctionM2Abs[
      M2,
      Nat1,
      Nat1Positive,
      Nat2,
      Nat2Positive,
      Nat3,
      Nat3Positive,
      Nat4,
      Nat4Positive
    ]
    with AppendSupportAbs[
      M2,
      Nat1,
      Nat1Positive,
      Nat2,
      Nat2Positive,
      Nat3,
      Nat3Positive,
      Nat4,
      Nat4Positive
    ] { FunctionM2Abs2Self =>

  override def functionM2[Item, N1 <: Nat1, N2 <: Nat2, CTX](
    param: N1 => M2[N2, CTX]
  ): Nat1Positive[M2[Item, CTX], N1] => M2[Nat2Positive[Item, N2], CTX] = {
    FunctionM2Abs2Self
      .contextModel[CTX]
      .append10[Item, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, N1, N2](
        param
      )
  }

  override def nextInstance: FunctionM2Abs2[
    ({ type NextParam[A, B] = M2[B, A] })#NextParam,
    Nat2,
    Nat2Positive,
    Nat3,
    Nat3Positive,
    Nat4,
    Nat4Positive,
    Nat1,
    Nat1Positive
  ]

}

object FunctionAbs {
  lazy val out: FunctionM2Abs[
    ({ type Func1[A, B] = A => B })#Func1,
    AdtCoProduct,
    AdtCoProduct.UsePositive,
    AdtHList,
    AdtHList.UsePositive,
    AdtHList,
    AdtHList.UsePositive,
    AdtCoProduct,
    AdtCoProduct.UsePositive
  ] = private_package.FunctionM2Impl1
}

private object private_package {

  object FunctionM2Impl1
      extends FunctionM2Abs2[
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

    override lazy val typeParameterSupport: TypeParameterSupportImpl1.type = TypeParameterSupportImpl1
    override lazy val productAppendSupport: ProductAppendSupporImpl1.type  = ProductAppendSupporImpl1

    override def functionM2[Item, N1 <: AdtCoProduct, N2 <: AdtHList, CTX](
      param: N1 => N2 => CTX
    ): AdtCoProduct.UsePositive[Item => CTX, N1] => AdtHList.UsePositive[Item, N2] => CTX = super.functionM2[Item, N1, N2, CTX](param)

    override lazy val nextInstance: FunctionM2Impl2.type = FunctionM2Impl2

  }

  object FunctionM2Impl2
      extends FunctionM2Abs2[
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

    override lazy val typeParameterSupport: TypeParameterSupportImpl2.type =
      nextInstance.nextInstance.nextInstance.typeParameterSupport.nextInstance
    override lazy val productAppendSupport: ProductAppendSupporImpl2.type =
      nextInstance.nextInstance.nextInstance.productAppendSupport.nextInstance

    override def functionM2[Item, N1 <: AdtHList, N2 <: AdtHList, CTX](
      param: N1 => CTX => N2
    ): AdtHList.UsePositive[CTX => Item, N1] => CTX => AdtHList.UsePositive[Item, N2] = super.functionM2[Item, N1, N2, CTX](param)

    override lazy val nextInstance: FunctionM2Impl3.type = FunctionM2Impl3

  }

  object FunctionM2Impl3
      extends FunctionM2Abs2[
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

    override lazy val typeParameterSupport: TypeParameterSupportImpl1.type =
      nextInstance.nextInstance.nextInstance.typeParameterSupport.nextInstance
    override lazy val productAppendSupport: ProductAppendSupporImpl3.type =
      nextInstance.nextInstance.nextInstance.productAppendSupport.nextInstance

    override def functionM2[Item, N1 <: AdtHList, N2 <: AdtCoProduct, CTX](
      param: N1 => N2 => CTX
    ): AdtHList.UsePositive[Item => CTX, N1] => AdtCoProduct.UsePositive[Item, N2] => CTX = super.functionM2[Item, N1, N2, CTX](param)

    override lazy val nextInstance: FunctionM2Impl4.type = FunctionM2Impl4

  }

  object FunctionM2Impl4
      extends FunctionM2Abs2[
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

    override lazy val typeParameterSupport: TypeParameterSupportImpl2.type =
      nextInstance.nextInstance.nextInstance.typeParameterSupport.nextInstance
    override lazy val productAppendSupport: ProductAppendSupporImpl4.type =
      nextInstance.nextInstance.nextInstance.productAppendSupport.nextInstance

    override def functionM2[Item, N1 <: AdtCoProduct, N2 <: AdtCoProduct, CTX](
      param: N1 => CTX => N2
    ): AdtCoProduct.UsePositive[CTX => Item, N1] => CTX => AdtCoProduct.UsePositive[Item, N2] = super.functionM2[Item, N1, N2, CTX](param)

    override lazy val nextInstance: FunctionM2Impl1.type = FunctionM2Impl1

  }

}
