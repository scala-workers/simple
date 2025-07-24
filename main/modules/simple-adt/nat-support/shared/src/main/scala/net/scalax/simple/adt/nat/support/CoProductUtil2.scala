package net.scalax.simple.adt
package nat
package support

trait ItemFunc[M1[_, _], M2[_, _], M3[_, _]] {
  def to[A1, A2](m1: M1[A1, A2], m2: M2[A1, A2]): M3[A1, A2]
}

object CoProductUtilN { CoProductUtil1Self =>

  def paramSupport[M1[_, _], M2[_, _], M3[_, _], CoLike1, ApCoProduct1[_, _ <: CoLike1] <: CoLike1, HLLike, ApHList[
    _,
    _ <: HLLike
  ] <: HLLike, CoLike3, ApCoProduct3[
    _,
    _ <: CoLike3
  ] <: CoLike3](
    compatModelEither: Either[
      (CoProductFunc[CoLike1, ApCoProduct1], CoProductFunc[CoLike3, ApCoProduct3]),
      (HListFunc[CoLike1, ApCoProduct1], HListFunc[CoLike3, ApCoProduct3])
    ],
    compatModelHList: HListFunc[HLLike, ApHList],
    supportFunc: ItemFunc[M1, M2, M3]
  ): Parameter10NatSupport3[
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
  ] = new Parameter10NatSupport3[
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
  ] {
    override val content: AppenderNatSupport3[
      ({
        type Func3[A, B, C] = (A, B) => C
      })#Func3,
      CoLike1,
      HLLike,
      CoLike3,
      ApCoProduct1,
      ApHList,
      ApCoProduct3
    ] =
      new AppenderNatSupport3[
        ({
          type Func3[A, B, C] = (A, B) => C
        })#Func3,
        CoLike1,
        HLLike,
        CoLike3,
        ApCoProduct1,
        ApHList,
        ApCoProduct3
      ] {
        override def append[A, B, C, Co1 <: CoLike1, H1 <: HLLike, Co3 <: CoLike3](
          p1: (A, B) => C,
          p2: (Co1, H1) => Co3
        ): (ApCoProduct1[A, Co1], ApHList[B, H1]) => ApCoProduct3[C, Co3] = (a1: ApCoProduct1[A, Co1], a2: ApHList[B, H1]) => {

          val modelB: B   = compatModelHList.takeHead[B, H1](a2)
          val modelH1: H1 = compatModelHList.takeTail[B, H1](a2)

          compatModelEither.fold(
            (f1: (CoProductFunc[CoLike1, ApCoProduct1], CoProductFunc[CoLike3, ApCoProduct3])) => {
              val f1Func1: CoProductFunc[CoLike1, ApCoProduct1] = f1._1
              val f1Func2: CoProductFunc[CoLike3, ApCoProduct3] = f1._2

              val folder: ApCoProduct1[A, Co1] => ApCoProduct3[C, Co3] = f1Func1.fold[A, Co1, ApCoProduct3[C, Co3]](
                (a: A) => f1Func2.appendLeft[C, Co3](p1(a, modelB)): ApCoProduct3[C, Co3],
                (b: Co1) => f1Func2.appendRight[C, Co3](p2(b, modelH1)): ApCoProduct3[C, Co3]
              )

              folder(a1)
            },
            (f2: (HListFunc[CoLike1, ApCoProduct1], HListFunc[CoLike3, ApCoProduct3])) => {
              val f2Func1: HListFunc[CoLike1, ApCoProduct1] = f2._1
              val f2Func2: HListFunc[CoLike3, ApCoProduct3] = f2._2

              val modelA: A     = f2Func1.takeHead[A, Co1](a1)
              val modelCo1: Co1 = f2Func1.takeTail[A, Co1](a1)

              val modelC: C     = p1(modelA, modelB)
              val modelCo3: Co3 = p2(modelCo1, modelH1)

              f2Func2.append[C, Co3](modelC, modelCo3)
            }
          )
        }
      }

    override val typeGen: Type10Gen3[
      ({
        type Func3[A, B, C] =
          (A, B) => C
      })#Func3,
      ({
        type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = M1[A, B]
      })#FuncXM1,
      ({
        type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = M2[A, B]
      })#FuncXM1,
      ({
        type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20] = M3[A, B]
      })#FuncXM1
    ] = new Type10Gen3[
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
      })#FuncXM1
    ] {
      override def gen10[A, B, X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15, X16, X17, X18, X19, X20]
        : (M1[A, B], M2[A, B]) => M3[A, B] = (a1: M1[A, B], a2: M2[A, B]) => supportFunc.to[A, B](a1, a2)
    }

  }

  def next[A1, A2, M1[_, _], M2[_, _], M3[_, _], CoLike1, ApCoProduct1[_, _ <: CoLike1] <: CoLike1, HLLike, ApHList[
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
    CoProductUtil1Self
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
  }

}
