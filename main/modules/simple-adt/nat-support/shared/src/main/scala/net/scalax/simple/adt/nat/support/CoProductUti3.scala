package net.scalax.simple.adt.nat.support

object FoldCoProductUtilN { FoldCoProductUtilNSelf =>

  def paramSupport[TRU, CoLike1, ApCoProduct1[_, _ <: CoLike1] <: CoLike1, CoLike2, ApCoProduct2[_, _ <: CoLike2] <: CoLike2](
    model1Compat: HListFunc[CoLike1, ApCoProduct1],
    model2Compat: CoProductFunc[CoLike2, ApCoProduct2]
  ): AppenderNatSupport2[
    ({ type Func3[A, B] = A => B => TRU })#Func3,
    CoLike1,
    CoLike2,
    ApCoProduct1,
    ApCoProduct2
  ] = new AppenderNatSupport2[
  ({ type Func3[A, B] = A => B => TRU })#Func3,
    CoLike1,
    CoLike2,
    ApCoProduct1,
    ApCoProduct2
  ] {
    final override def append[A, B, Co1 <: CoLike1, Co2 <: CoLike2](
      p1: A => B => TRU,
      p2: Co1 => Co2 => TRU
    ): ApCoProduct1[A, Co1] => ApCoProduct2[B, Co2] => TRU = (a1: ApCoProduct1[A, Co1]) => {1~
      val valueA: A     = model1Compat.takeHead[A, Co1](a1)
      val valueCo1: Co1 = model1Compat.takeTail[A, Co1](a1)

      model2Compat.fold[B, Co2, TRU]((valueB: B) => p1(valueA)(valueB), (valueCo2: Co2) => p2(valueCo1)(valueCo2))
    }
  }

  /*def next[TRU, A1, CoLike1, ApCoProduct1[_, _ <: CoLike1] <: CoLike1, Co1 <: CoLike1](
    model1Compat: CoProductFunc[CoLike1, ApCoProduct1]
  )(paramTail: A1 => TRU, func: Co1 => TRU): ApCoProduct1[A1, Co1] => TRU = {
    FoldCoProductUtilNSelf
      .paramSupport[TRU, CoLike1, ApCoProduct1](
        model1Compat
      )
      .append[
        A1,
        Co1
      ](paramTail, func)
  }*/

}
