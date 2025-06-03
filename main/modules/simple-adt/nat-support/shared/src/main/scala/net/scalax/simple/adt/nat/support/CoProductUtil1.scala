package net.scalax.simple.adt
package nat
package support

trait CoProductUtil1[HLLike, ApHList[_, _ <: HLLike] <: HLLike, CoLike, ApCoProduct[_, _ <: CoLike] <: CoLike] {
  CoProductUtil1Self =>

  trait FuncApp[Co1 <: CoLike, H1 <: HLLike, Co2 <: CoLike]
      extends AppenderNatSupport3[
        ({ type Func3[A, B, C] = (A, B) => C })#Func3,
        CoLike,
        HLLike,
        CoLike,
        ApCoProduct,
        ApHList,
        ApCoProduct,
        Co1,
        H1,
        Co2
      ] {
    override def current: (Co1, H1) => Co2
    override def next[T1, T2, T3](f_1: (T1, T2) => T3): FuncApp[ApCoProduct[T1, Co1], ApHList[T2, H1], ApCoProduct[T3, Co2]]
  }

  object FuncApp {
    case class FuncAppImpl[Co1 <: CoLike, H1 <: HLLike, Co2 <: CoLike](override val current: (Co1, H1) => Co2)
        extends FuncApp[Co1, H1, Co2] {
      FuncAppSelf =>

      override def next[T1, T2, T3](f_1: (T1, T2) => T3): FuncAppImpl[ApCoProduct[T1, Co1], ApHList[T2, H1], ApCoProduct[T3, Co2]] = {

        val f1 = (a: ApCoProduct[T1, Co1], b: ApHList[T2, H1]) => {
          val t2: T2 = CoProductUtil1Self.apH.takeHead[T2, H1](b)
          val h1: H1 = CoProductUtil1Self.apH.takeTail[T2, H1](b)
          apCoH.fold[T1, Co1, ApCoProduct[T3, Co2]](
            h = (t1_1: T1) => CoProductUtil1Self.apCoH.appendLeft(f_1(t1_1, t2)),
            t = (co1_1: Co1) => CoProductUtil1Self.apCoH.appendRight(FuncAppSelf.current(co1_1, h1))
          )(a)
        }

        FuncAppImpl(current = f1)

      }
    }

    def apply[Co1 <: CoLike, H1 <: HLLike, Co2 <: CoLike](cFunc: (Co1, H1) => Co2): FuncApp[Co1, H1, Co2] = FuncAppImpl(cFunc)
  }

  def apH: HListFunc[HLLike, ApHList]
  def apCoH: CoProductFunc[CoLike, ApCoProduct]

  trait CoProductFolderAppender[Co1 <: CoLike, H1 <: HLLike, Co2 <: CoLike] {

    def inputFunction: (Co1, H1) => Co2
    def next[A1, A2](
      paramTail: (Co1, H1) => Co2
    ): CoProductFolderAppender[ApCoProduct[A1, Co1], ApHList[A1 => A2, H1], ApCoProduct[A2, Co2]]

  }

  object CoProductFolderAppender {
    case class CoProductFolderAppenderImpl[Co1 <: CoLike, H1 <: HLLike, Co2 <: CoLike](override val inputFunction: (Co1, H1) => Co2)
        extends CoProductFolderAppender[Co1, H1, Co2] {

      override def next[A1, A2](
        paramTail: (Co1, H1) => Co2
      ): CoProductFolderAppenderImpl[ApCoProduct[A1, Co1], ApHList[A1 => A2, H1], ApCoProduct[A2, Co2]] = {

        val fApp: FuncApp[Co1, H1, Co2] = FuncApp[Co1, H1, Co2](paramTail)
        val nextInputFunction           = fApp.next[A1, A1 => A2, A2]((u1: A1, u2: A1 => A2) => u2(u1))
        CoProductFolderAppenderImpl(nextInputFunction.current)

      }

    }

    def apply[Co1 <: CoLike, H1 <: HLLike, Co2 <: CoLike](inFunc: (Co1, H1) => Co2): CoProductFolderAppender[Co1, H1, Co2] =
      CoProductFolderAppenderImpl(inFunc)

  }

}
