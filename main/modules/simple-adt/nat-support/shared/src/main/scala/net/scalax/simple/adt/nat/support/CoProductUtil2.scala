package net.scalax.simple.adt
package nat
package support

object ItemFunc
    extends Type10Gen3[
      ({ type Func3[A, B, C] = (A, B) => C })#Func3,
      ({ type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = A })#FuncXM1,
      ({ type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = A => B })#FuncXM1,
      ({
        type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = B
      })#FuncXM1
    ] { ItemFuncSelf =>
  final override def gen10[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20]
    : (A, A => B) => B = (a1: A, a2: A => B) => a2(a1)
}

trait AppendSupportUtil[CoLike1, ApCoProduct1[_, _ <: CoLike1] <: CoLike1, HLLike, ApHList[
  _,
  _ <: HLLike
] <: HLLike, CoLike3, ApCoProduct3[_, _ <: CoLike3] <: CoLike3]
    extends AppenderNatSupport3[
      ({ type Func3[A, B, C] = (A, B) => C })#Func3,
      CoLike1,
      HLLike,
      CoLike3,
      ApCoProduct1,
      ApHList,
      ApCoProduct3
    ] {
  override def append[T1, T2, T3, HCollection1 <: CoLike1, HCollection2 <: HLLike, HCollection3 <: CoLike3](
    p1: (T1, T2) => T3,
    p2: (HCollection1, HCollection2) => HCollection3
  ): (ApCoProduct1[T1, HCollection1], ApHList[T2, HCollection2]) => ApCoProduct3[T3, HCollection3]
}

trait CoProductUtilN[CoLike1, ApCoProduct1[_, _ <: CoLike1] <: CoLike1, HLLike, ApHList[
  _,
  _ <: HLLike
] <: HLLike, CoLike3, ApCoProduct3[_, _ <: CoLike3] <: CoLike3]
    extends Parameter10NatSupport3[
      ({
        type Func3[A, B, C] = (A, B) => C
      })#Func3,
      ({
        type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = A
      })#FuncXM1,
      ({
        type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = A => B
      })#FuncXM1,
      ({
        type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = B
      })#FuncXM1,
      CoLike1,
      HLLike,
      CoLike3,
      ApCoProduct1,
      ApHList,
      ApCoProduct3
    ] { ParamSupportUtilSelf =>
  override def content: AppendSupportUtil[CoLike1, ApCoProduct1, HLLike, ApHList, CoLike3, ApCoProduct3]
  override def typeGen: ItemFunc.type = ItemFunc

  def next[A1, A2, Co1 <: CoLike1, Pro2 <: HLLike, Co3 <: CoLike3](
    paramTail: (Co1, Pro2) => Co3
  ): (ApCoProduct1[A1, Co1], ApHList[A1 => A2, Pro2]) => ApCoProduct3[A2, Co3] = {
    ParamSupportUtilSelf
      .append10[A1, A2, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Co1, Pro2, Co3](
        paramTail
      )
  }
}
