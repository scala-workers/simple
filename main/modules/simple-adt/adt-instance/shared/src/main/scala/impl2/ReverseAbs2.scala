package net.scalax.simple.adt
package instance
package support
package impl2

import net.scalax.simple.adt.nat.support.Type10Gen2

trait TypeParameterSupportAbs[M2[_, _]] {
  def supportTypeParameter[CTX]: Type10Gen2[
    ({ type Func3[A, B] = A => M2[B, CTX] })#Func3,
    ({
      type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = M2[A, CTX]
    })#FuncXM1,
    ({
      type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = A
    })#FuncXM1
  ]

  def nextInstance: TypeParameterSupportAbs[({ type NextParam[A, B] = M2[B, A] })#NextParam]
}

object TypeParameterSupportImpl1 extends TypeParameterSupportAbs[({ type Func1[A, B] = A => B })#Func1] {

  override def supportTypeParameter[CTX]: Type10Gen2[
    ({ type Func3[A, B] = A => B => CTX })#Func3,
    ({
      type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = A => CTX
    })#FuncXM1,
    ({
      type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = A
    })#FuncXM1
  ] = new Type10Gen2[
    ({ type Func3[A, B] = A => B => CTX })#Func3,
    ({
      type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = A => CTX
    })#FuncXM1,
    ({
      type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = A
    })#FuncXM1
  ] {
    override def gen10[
      Item1,
      Item2,
      Item3,
      Item4,
      Item5,
      Item6,
      Item7,
      Item8,
      Item9,
      Item10,
      Item11,
      Item12,
      Item13,
      Item14,
      Item15,
      Item16,
      Item17,
      Item18,
      Item19,
      Item20,
      Item21,
      Item22
    ]: (Item1 => CTX) => Item1 => CTX = identity[Item1 => CTX]
  }

  override lazy val nextInstance: TypeParameterSupportImpl2.type = TypeParameterSupportImpl2

}

object TypeParameterSupportImpl2 extends TypeParameterSupportAbs[({ type Func1[A, B] = B => A })#Func1] {

  override def supportTypeParameter[CTX]: Type10Gen2[
    ({ type Func3[A, B] = A => CTX => B })#Func3,
    ({
      type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = CTX => A
    })#FuncXM1,
    ({
      type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = A
    })#FuncXM1
  ] = new Type10Gen2[
    ({ type Func3[A, B] = A => CTX => B })#Func3,
    ({
      type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = CTX => A
    })#FuncXM1,
    ({
      type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = A
    })#FuncXM1
  ] {
    override def gen10[
      Item1,
      Item2,
      Item3,
      Item4,
      Item5,
      Item6,
      Item7,
      Item8,
      Item9,
      Item10,
      Item11,
      Item12,
      Item13,
      Item14,
      Item15,
      Item16,
      Item17,
      Item18,
      Item19,
      Item20,
      Item21,
      Item22
    ]: (CTX => Item1) => CTX => Item1 = identity[CTX => Item1]
  }

  override lazy val nextInstance: TypeParameterSupportImpl1.type = TypeParameterSupportImpl1

}
