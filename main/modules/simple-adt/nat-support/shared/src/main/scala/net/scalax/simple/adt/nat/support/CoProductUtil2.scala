package net.scalax.simple.adt
package nat
package support

trait ItemFunc[M1[_, _], M2[_, _], M3[_, _]]
    extends Type10Gen3[
      ({ type Func3[A, B, C] = (A, B) => C })#Func3,
      ({
        type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = M1[A, B]
      })#FuncXM1,
      ({
        type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = M2[A, B]
      })#FuncXM1,
      ({
        type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = M3[A, B]
      })#FuncXM1
    ] { ItemFuncSelf =>
  override def gen10[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20]
    : (M1[A, B], M2[A, B]) => M3[A, B]
}

trait AppendSupportUtil[CoLike1, HLLike, CoLike3, ApCoProduct1[_, _ <: CoLike1] <: CoLike1, ApHList[
  _,
  _ <: HLLike
] <: HLLike, ApCoProduct3[_, _ <: CoLike3] <: CoLike3]
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

trait CoProductUtilN[M1[_, _], M2[_, _], M3[_, _], CoLike1, HLLike, CoLike3, ApCoProduct1[_, _ <: CoLike1] <: CoLike1, ApHList[
  _,
  _ <: HLLike
] <: HLLike, ApCoProduct3[_, _ <: CoLike3] <: CoLike3]
    extends Parameter10NatSupport3[
      ({
        type Func3[A, B, C] = (A, B) => C
      })#Func3,
      ({
        type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = M1[A, B]
      })#FuncXM1,
      ({
        type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = M2[A, B]
      })#FuncXM1,
      ({
        type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = M3[A, B]
      })#FuncXM1,
      CoLike1,
      HLLike,
      CoLike3,
      ApCoProduct1,
      ApHList,
      ApCoProduct3
    ] { ParamSupportUtilSelf =>
  override def content: AppendSupportUtil[CoLike1, HLLike, CoLike3, ApCoProduct1, ApHList, ApCoProduct3]
  override def typeGen: ItemFunc[M1, M2, M3]

  def next[A1, A2, Co1 <: CoLike1, Pro2 <: HLLike, Co3 <: CoLike3](
    paramTail: (Co1, Pro2) => Co3
  ): (ApCoProduct1[M1[A1, A2], Co1], ApHList[M2[A1, A2], Pro2]) => ApCoProduct3[M3[A1, A2], Co3] = {
    ParamSupportUtilSelf
      .append10[A1, A2, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Co1, Pro2, Co3](
        paramTail
      )
  }
}
