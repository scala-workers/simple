package net.scalax.simple.adt
package instance
package support
package impl2

import net.scalax.simple.adt.nat.support.TypeGen2

trait TypeParameterSupportAbs[M2[_, _]] {
  def supportTypeParameter[CTX]: TypeGen2[
    ({ type Func3[A, B] = A => M2[B, CTX] })#Func3,
    ({ type FuncXM1[A] = M2[A, CTX] })#FuncXM1,
    ({ type FuncXM1[A] = A })#FuncXM1
  ]

  def nextInstance: TypeParameterSupportAbs[({ type NextParam[A, B] = M2[B, A] })#NextParam]
}

object TypeParameterSupportImpl1 extends TypeParameterSupportAbs[({ type Func1[A, B] = A => B })#Func1] {

  override def supportTypeParameter[CTX]
    : TypeGen2[({ type Func3[A, B] = A => B => CTX })#Func3, ({ type FuncXM1[A] = A => CTX })#FuncXM1, ({ type FuncXM1[A] = A })#FuncXM1] =
    new TypeGen2[
      ({ type Func3[A, B] = A => B => CTX })#Func3,
      ({ type FuncXM1[A] = A => CTX })#FuncXM1,
      ({ type FuncXM1[A] = A })#FuncXM1
    ] {
      override def gen[Item1]: (Item1 => CTX) => Item1 => CTX = identity[Item1 => CTX]
    }

  override lazy val nextInstance: TypeParameterSupportImpl2.type = TypeParameterSupportImpl2

}

object TypeParameterSupportImpl2 extends TypeParameterSupportAbs[({ type Func1[A, B] = B => A })#Func1] {

  override def supportTypeParameter[CTX]
    : TypeGen2[({ type Func3[A, B] = A => CTX => B })#Func3, ({ type FuncXM1[A] = CTX => A })#FuncXM1, ({ type FuncXM1[A] = A })#FuncXM1] =
    new TypeGen2[
      ({ type Func3[A, B] = A => CTX => B })#Func3,
      ({ type FuncXM1[A] = CTX => A })#FuncXM1,
      ({ type FuncXM1[A] = A })#FuncXM1
    ] {
      override def gen[Item1]: (CTX => Item1) => CTX => Item1 = identity[CTX => Item1]
    }

  override lazy val nextInstance: TypeParameterSupportImpl1.type = TypeParameterSupportImpl1

}
