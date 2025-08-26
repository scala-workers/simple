package net.scalax.simple.adt
package instance
package support

import net.scalax.simple.adt.nat.support.{AppendSupportUtil, CoProductUtilN, CoProductUtilNPre1, ItemFunc, ReverseAbstraction}

object InstanceItemFuncImpl1
    extends ItemFunc[({ type Func2[A, B] = A })#Func2, ({ type Func2[A, B] = A => B })#Func2, ({ type Func2[A, B] = B })#Func2] {
  override final def gen10[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20]
    : (A, A => B) => B = (a: A, aToB: A => B) => aToB(a)

  override object reverse
      extends ItemFunc[({ type Func2[A, B] = A => B })#Func2, ({ type Func2[A, B] = A })#Func2, ({ type Func2[A, B] = B })#Func2] {
    override final def gen10[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20]
      : (A => B, A) => B = (aToB: A => B, a: A) => aToB(a)

    override final lazy val reverse: InstanceItemFuncImpl1.type = InstanceItemFuncImpl1
  }
}

trait InstanceCoProductUtilN[CoProduct1, APCoProduct1[
  _,
  _ <: CoProduct1
] <: CoProduct1, Product2, APProduct2[
  _,
  _ <: Product2
] <: Product2, CoProduct3, APCoProduct3[_, _ <: CoProduct3] <: CoProduct3]
    extends FinalCoProductUtilN[
      ({ type Func2[A, B] = A })#Func2,
      ({ type Func2[A, B] = A => B })#Func2,
      ({ type Func2[A, B] = B })#Func2,
      CoProduct1,
      APCoProduct1,
      Product2,
      APProduct2,
      CoProduct3,
      APCoProduct3
    ] {
  FinalCoProductUtilNSelf =>

  override def content: AppendSupportUtil[CoProduct1, Product2, CoProduct3, APCoProduct1, APProduct2, APCoProduct3]
  override lazy val typeGen
    : ItemFunc[({ type Func2[A, B] = A })#Func2, ({ type Func2[A, B] = A => B })#Func2, ({ type Func2[A, B] = B })#Func2] =
    InstanceItemFuncImpl1

}

trait InstanceAdtFunctionSupportImplHelper2[CoProduct1, APCoProduct1[
  _,
  _ <: CoProduct1
] <: CoProduct1, CoZero1 <: CoProduct1, Product2, APProduct2[
  _,
  _ <: Product2
] <: Product2, ProZero2 <: Product2, CoProduct3, APCoProduct3[_, _ <: CoProduct3] <: CoProduct3, CoZero3 <: CoProduct3]
    extends FinalAdtFunctionSupportImplHelper2[
      ({ type Func2[A, B] = A })#Func2,
      ({ type Func2[A, B] = A => B })#Func2,
      ({ type Func2[A, B] = B })#Func2,
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
  override def inputHList0: (CoZero1, ProZero2) => CoZero3
  override def coProductFunc: InstanceCoProductUtilN[CoProduct1, APCoProduct1, Product2, APProduct2, CoProduct3, APCoProduct3]
}
