package net.scalax.simple.adt
package nat
package support

trait CoProductUtil1[CoLike1, ApCoProduct1[_, _ <: CoLike1] <: CoLike1, HLLike, ApHList[_, _ <: HLLike] <: HLLike, CoLike3, ApCoProduct3[
  _,
  _ <: CoLike3
] <: CoLike3] {
  CoProductUtil1Self =>

  private object FuncApp
      extends AppenderNatSupport3[
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

  private def nextImpl[A1, A2, Co1 <: CoLike1, H1 <: HLLike, Co2 <: CoLike3](
    paramHead: (A1, A1 => A2) => A2,
    paramTail: (Co1, H1) => Co2
  ): (ApCoProduct1[A1, Co1], ApHList[A1 => A2, H1]) => ApCoProduct3[A2, Co2] =
    FuncApp.append[A1, A1 => A2, A2, Co1, H1, Co2](paramHead, paramTail)

  def apH2: HListFunc[HLLike, ApHList]
  def apCoH1: CoProductFunc[CoLike1, ApCoProduct1]
  def apCoH3: CoProductFunc[CoLike3, ApCoProduct3]

  def next[A1, A2, Co1 <: CoLike1, H1 <: HLLike, Co2 <: CoLike3](
    paramTail: (Co1, H1) => Co2
  ): (ApCoProduct1[A1, Co1], ApHList[A1 => A2, H1]) => ApCoProduct3[A2, Co2] = nextImpl((x: A1, y: A1 => A2) => y(x), paramTail)

}

trait CoProductUtil2[CoLike, ApCoProduct[_, _ <: CoLike] <: CoLike, HLLike, ApHList[_, _ <: HLLike] <: HLLike]
    extends CoProductUtil1[CoLike, ApCoProduct, HLLike, ApHList, CoLike, ApCoProduct] {

  override def apCoH1: CoProductFunc[CoLike, ApCoProduct]
  override def apH2: HListFunc[HLLike, ApHList]

  override def apCoH3: CoProductFunc[CoLike, ApCoProduct] = apCoH1

  override def next[A1, A2, Co1 <: CoLike, H1 <: HLLike, Co2 <: CoLike](
    paramTail: (Co1, H1) => Co2
  ): (ApCoProduct[A1, Co1], ApHList[A1 => A2, H1]) => ApCoProduct[A2, Co2] = super.next[A1, A2, Co1, H1, Co2](paramTail)

}
