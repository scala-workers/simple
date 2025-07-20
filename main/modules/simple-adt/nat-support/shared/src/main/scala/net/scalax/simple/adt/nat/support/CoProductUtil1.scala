package net.scalax.simple.adt
package nat
package support

trait CoProductUtil1[CoLike1, ApCoProduct1[_, _ <: CoLike1] <: CoLike1, HLLike, ApHList[_, _ <: HLLike] <: HLLike, CoLike3, ApCoProduct3[
  _,
  _ <: CoLike3
] <: CoLike3] {
  CoProductUtil1Self =>

  private object FuncApp
      extends Parameter10NatSupport3[
        ({ type Func3[A, B, C] = (A, B) => C })#Func3,
        ({ type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8] = A })#FuncXM1,
        ({ type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8] = A => B })#FuncXM1,
        ({ type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8] = B })#FuncXM1,
        CoLike1,
        HLLike,
        CoLike3,
        ApCoProduct1,
        ApHList,
        ApCoProduct3
      ] {
    override val content
      : AppenderNatSupport3[({ type Func3[A, B, C] = (A, B) => C })#Func3, CoLike1, HLLike, CoLike3, ApCoProduct1, ApHList, ApCoProduct3] =
      new AppenderNatSupport3[
        ({ type Func3[A, B, C] = (A, B) => C })#Func3,
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
          val b: B   = CoProductUtil1Self.apH2.takeHead(a2)
          val h1: H1 = CoProductUtil1Self.apH2.takeTail(a2)

          val forInput = CoProductUtil1Self.apCoH1.fold[A, Co1, ApCoProduct3[C, Co3]](
            (x1: A) => CoProductUtil1Self.apCoH3.appendLeft(p1(x1, b)),
            (co1: Co1) => CoProductUtil1Self.apCoH3.appendRight(p2(co1, h1))
          )

          forInput(a1)
        }
      }

    override val typeGen: Type10Gen3[
      ({ type Func3[A, B, C] = (A, B) => C })#Func3,
      ({ type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8] = A })#FuncXM1,
      ({ type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8] = A => B })#FuncXM1,
      ({ type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8] = B })#FuncXM1
    ] = new Type10Gen3[
      ({ type Func3[A, B, C] = (A, B) => C })#Func3,
      ({ type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8] = A })#FuncXM1,
      ({ type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8] = A => B })#FuncXM1,
      ({ type FuncXM1[A, B, X1, X2, X3, X4, X5, X6, X7, X8] = B })#FuncXM1
    ] {
      override def gen10[A, B, C1, C2, C3, C4, C5, C6, C7, C8]: (A, A => B) => B = (a: A, aToB: A => B) => aToB(a)
    }

  }

  def apH2: HListFunc[HLLike, ApHList]
  def apCoH1: CoProductFunc[CoLike1, ApCoProduct1]
  def apCoH3: CoProductFunc[CoLike3, ApCoProduct3]

  def next[A1, A2, Co1 <: CoLike1, H1 <: HLLike, Co2 <: CoLike3](
    paramTail: (Co1, H1) => Co2
  ): (ApCoProduct1[A1, Co1], ApHList[A1 => A2, H1]) => ApCoProduct3[A2, Co2] =
    FuncApp.append10[A1, A2, Any, Any, Any, Any, Any, Any, Any, Any, Co1, H1, Co2](paramTail)

}

trait AppendSimpleAdt[CoLike, ApCoProduct[_, _ <: CoLike] <: CoLike, HLLike, ApHList[_, _ <: HLLike] <: HLLike] {
  def next[A1, A2, Co1 <: CoLike, H1 <: HLLike, Co2 <: CoLike](
    paramTail: (Co1, H1) => Co2
  ): (ApCoProduct[A1, Co1], ApHList[A1 => A2, H1]) => ApCoProduct[A2, Co2]
}

class CoProductUtil2[CoLike, ApCoProduct[_, _ <: CoLike] <: CoLike, HLLike, ApHList[_, _ <: HLLike] <: HLLike](
  override val apCoH1: CoProductFunc[CoLike, ApCoProduct],
  override val apH2: HListFunc[HLLike, ApHList]
) extends CoProductUtil1[CoLike, ApCoProduct, HLLike, ApHList, CoLike, ApCoProduct]
    with AppendSimpleAdt[CoLike, ApCoProduct, HLLike, ApHList] {
  CoProductUtil2Self =>

  override val apCoH3: CoProductFunc[CoLike, ApCoProduct] = apCoH1

}
