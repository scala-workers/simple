package net.scalax.simple.adt.nat.support

trait FoldFunc[TRU]
    extends Type10Gen1[
      ({ type Func3[A] = A })#Func3,
      ({
        type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = A
      })#FuncXM1
    ] { ItemFuncSelf =>
  final override def gen10[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20]: A =
    ItemFuncSelf.to[A]

  def to[A1]: A1
}

object FoldCoProductUtilN { FoldCoProductUtilNSelf =>

  def paramSupport[TRU, CoLike1, ApCoProduct1[_, _ <: CoLike1] <: CoLike1](
    compatModelEither: CoProductFunc[CoLike1, ApCoProduct1]
  ): Parameter10NatSupport1[
    ({ type Func3[A] = A => TRU })#Func3,
    ({
      type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = A
    })#FuncXM1,
    CoLike1,
    ApCoProduct1
  ] = new Parameter10NatSupport1[
    ({ type Func3[A] = A => TRU })#Func3,
    ({
      type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = A
    })#FuncXM1,
    CoLike1,
    ApCoProduct1
  ] {

    final override val content: AppenderNatSupport1[
      ({ type Func3[A] = A => TRU })#Func3,
      CoLike1,
      ApCoProduct1
    ] = new AppenderNatSupport1[
      ({ type Func3[A] = A => TRU })#Func3,
      CoLike1,
      ApCoProduct1
    ] {
      final override def append[A, Co1 <: CoLike1](
        p1: A => TRU,
        p2: Co1 => TRU
      ): ApCoProduct1[A, Co1] => TRU = {
        compatModelEither.fold[A, Co1, TRU](p1, p2)
      }
    }

    final override val typeGen: Type10Gen1[
      ({ type Func3[A] = A => TRU })#Func3,
      ({
        type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = A
      })#FuncXM1
    ] = ???

  }

  /*def next[A1, A2, M1[_, _], M2[_, _], M3[_, _], CoLike1, ApCoProduct1[_, _ <: CoLike1] <: CoLike1, HLLike, ApHList[
    _,
    _ <: HLLike
  ] <: HLLike, CoLike3, ApCoProduct3[
    _,
    _ <: CoLike3
  ] <: CoLike3, Co1 <: CoLike1, Pro2 <: HLLike, Co3 <: CoLike3](
    compatModelEither: Either[
      (CoProductFunc[CoLike1, ApCoProduct1], CoProductFunc[CoLike3, ApCoProduct3]),
      (HListFunc[CoLike1, ApCoProduct1], HListFunc[CoLike3, ApCoProduct3])
    ],
    compatModelHList: HListFunc[HLLike, ApHList],
    itemFunc: ItemFunc[M1, M2, M3]
  )(
    paramTail: (Co1, Pro2) => Co3
  ): (ApCoProduct1[M1[A1, A2], Co1], ApHList[M2[A1, A2], Pro2]) => ApCoProduct3[M3[A1, A2], Co3] = {
    FoldCoProductUtilNSelf
      .paramSupport[M1, M2, M3, CoLike1, ApCoProduct1, HLLike, ApHList, CoLike3, ApCoProduct3](
        compatModelEither,
        compatModelHList,
        itemFunc
      )
      .append10[
        A1,
        A2,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Co1,
        Pro2,
        Co3
      ](
        paramTail
      )
  }*/

}
