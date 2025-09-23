package net.scalax.simple.adt
package instance
package support
package impl2

import net.scalax.simple.adt.nat.support.{AppenderNatSupport2, Parameter1NatSupport2, TypeGen2}

trait AppendSupportAbs[M2[_, _], CoLike1, ApCoProduct1[_, _ <: CoLike1] <: CoLike1, CoLike2, ApCoProduct2[
  _,
  _ <: CoLike2
] <: CoLike2, CoLike3, ApCoProduct3[_, _ <: CoLike3] <: CoLike3, CoLike4, ApCoProduct4[
  _,
  _ <: CoLike4
] <: CoLike4] { AppendSupportAbsSelf =>
  def typeParameterSupport: TypeParameterSupportAbs[M2]
  def productAppendSupport
    : ProductAppendSupportAbs[M2, CoLike1, ApCoProduct1, CoLike2, ApCoProduct2, CoLike3, ApCoProduct3, CoLike4, ApCoProduct4]

  def contextModel[CTX]: Parameter1NatSupport2[
    ({ type Func3[A, B] = A => M2[B, CTX] })#Func3,
    ({ type FuncXM1[A] = M2[A, CTX] })#FuncXM1,
    ({ type FuncXM1[A] = A })#FuncXM1,
    CoLike1,
    CoLike2,
    ApCoProduct1,
    ApCoProduct2
  ] = new Parameter1NatSupport2[
    ({ type Func3[A, B] = A => M2[B, CTX] })#Func3,
    ({ type FuncXM1[A] = M2[A, CTX] })#FuncXM1,
    ({ type FuncXM1[A] = A })#FuncXM1,
    CoLike1,
    CoLike2,
    ApCoProduct1,
    ApCoProduct2
  ] {
    override def content
      : AppenderNatSupport2[({ type Func3[A, B] = A => M2[B, CTX] })#Func3, CoLike1, CoLike2, ApCoProduct1, ApCoProduct2] =
      AppendSupportAbsSelf.productAppendSupport.supportTypeParameter[CTX]

    override def typeGen: TypeGen2[
      ({ type Func3[A, B] = A => M2[B, CTX] })#Func3,
      ({ type FuncXM1[A] = M2[A, CTX] })#FuncXM1,
      ({ type FuncXM1[A] = A })#FuncXM1
    ] = AppendSupportAbsSelf.typeParameterSupport.supportTypeParameter[CTX]
  }

  def nextInstance: AppendSupportAbs[
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
