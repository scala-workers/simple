package net.scalax.simple.adt
package nat
package support

trait ParameterSingleNatSupport1[
  M[_],
  N1[_],
  HLLike,
  APRHLLike[_, _ <: HLLike] <: HLLike
] extends ParameterSimpleSupport1[M, N1, HLLike, APRHLLike] {
  ParameterNatSupport1Self =>

  override def append[Item, HCollection1 <: HLLike](p1: M[HCollection1]): M[APRHLLike[N1[Item], HCollection1]] = super.append(p1)

  override def content: AppenderNatSupport1[M, HLLike, APRHLLike] = super.content

  override def typeGen: TypeGen1[M, N1]

  override def simpleAppender: SimpleAppender1[M]
  def apH: HListFunc[HLLike, APRHLLike]

  override def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport1Self.apH
}

trait ParameterSingleNatSupport2[
  M[_, _],
  N1[_],
  N2[_],
  HLLike,
  APRHLLike[_, _ <: HLLike] <: HLLike
] extends ParameterSimpleSupport2[M, N1, N2, HLLike, HLLike, APRHLLike, APRHLLike] {
  ParameterNatSupport2Self =>

  override def append[Item, HCollection1 <: HLLike, HCollection2 <: HLLike](
    p1: M[HCollection1, HCollection2]
  ): M[APRHLLike[N1[Item], HCollection1], APRHLLike[N2[Item], HCollection2]] = super.append(p1)

  override def content: AppenderNatSupport2[M, HLLike, HLLike, APRHLLike, APRHLLike] = super.content

  override def typeGen: TypeGen2[M, N1, N2]

  override def simpleAppender: SimpleAppender2[M]
  def apH: HListFunc[HLLike, APRHLLike]

  override def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport2Self.apH
  override def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport2Self.apH
}

trait ParameterSingleNatSupport3[
  M[_, _, _],
  N1[_],
  N2[_],
  N3[_],
  HLLike,
  APRHLLike[_, _ <: HLLike] <: HLLike
] extends ParameterSimpleSupport3[M, N1, N2, N3, HLLike, HLLike, HLLike, APRHLLike, APRHLLike, APRHLLike] {
  ParameterNatSupport3Self =>

  override def append[Item, HCollection1 <: HLLike, HCollection2 <: HLLike, HCollection3 <: HLLike](
    p1: M[HCollection1, HCollection2, HCollection3]
  ): M[APRHLLike[N1[Item], HCollection1], APRHLLike[N2[Item], HCollection2], APRHLLike[N3[Item], HCollection3]] = super.append(p1)

  override def content: AppenderNatSupport3[M, HLLike, HLLike, HLLike, APRHLLike, APRHLLike, APRHLLike] = super.content

  override def typeGen: TypeGen3[M, N1, N2, N3]

  override def simpleAppender: SimpleAppender3[M]
  def apH: HListFunc[HLLike, APRHLLike]

  override def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport3Self.apH
  override def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport3Self.apH
  override def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport3Self.apH
}

trait ParameterSingleNatSupport4[
  M[_, _, _, _],
  N1[_],
  N2[_],
  N3[_],
  N4[_],
  HLLike,
  APRHLLike[_, _ <: HLLike] <: HLLike
] extends ParameterSimpleSupport4[M, N1, N2, N3, N4, HLLike, HLLike, HLLike, HLLike, APRHLLike, APRHLLike, APRHLLike, APRHLLike] {
  ParameterNatSupport4Self =>

  override def append[Item, HCollection1 <: HLLike, HCollection2 <: HLLike, HCollection3 <: HLLike, HCollection4 <: HLLike](
    p1: M[HCollection1, HCollection2, HCollection3, HCollection4]
  ): M[APRHLLike[N1[Item], HCollection1], APRHLLike[N2[Item], HCollection2], APRHLLike[N3[Item], HCollection3], APRHLLike[N4[
    Item
  ], HCollection4]] = super.append(p1)

  override def content: AppenderNatSupport4[M, HLLike, HLLike, HLLike, HLLike, APRHLLike, APRHLLike, APRHLLike, APRHLLike] = super.content

  override def typeGen: TypeGen4[M, N1, N2, N3, N4]

  override def simpleAppender: SimpleAppender4[M]
  def apH: HListFunc[HLLike, APRHLLike]

  override def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport4Self.apH
  override def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport4Self.apH
  override def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport4Self.apH
  override def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport4Self.apH
}

trait ParameterSingleNatSupport5[
  M[_, _, _, _, _],
  N1[_],
  N2[_],
  N3[_],
  N4[_],
  N5[_],
  HLLike,
  APRHLLike[_, _ <: HLLike] <: HLLike
] extends ParameterSimpleSupport5[
      M,
      N1,
      N2,
      N3,
      N4,
      N5,
      HLLike,
      HLLike,
      HLLike,
      HLLike,
      HLLike,
      APRHLLike,
      APRHLLike,
      APRHLLike,
      APRHLLike,
      APRHLLike
    ] {
  ParameterNatSupport5Self =>

  override def append[
    Item,
    HCollection1 <: HLLike,
    HCollection2 <: HLLike,
    HCollection3 <: HLLike,
    HCollection4 <: HLLike,
    HCollection5 <: HLLike
  ](p1: M[HCollection1, HCollection2, HCollection3, HCollection4, HCollection5]): M[
    APRHLLike[N1[Item], HCollection1],
    APRHLLike[N2[Item], HCollection2],
    APRHLLike[N3[Item], HCollection3],
    APRHLLike[N4[Item], HCollection4],
    APRHLLike[N5[Item], HCollection5]
  ] = super.append(p1)

  override def content
    : AppenderNatSupport5[M, HLLike, HLLike, HLLike, HLLike, HLLike, APRHLLike, APRHLLike, APRHLLike, APRHLLike, APRHLLike] = super.content

  override def typeGen: TypeGen5[M, N1, N2, N3, N4, N5]

  override def simpleAppender: SimpleAppender5[M]
  def apH: HListFunc[HLLike, APRHLLike]

  override def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport5Self.apH
  override def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport5Self.apH
  override def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport5Self.apH
  override def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport5Self.apH
  override def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport5Self.apH
}

trait ParameterSingleNatSupport6[
  M[_, _, _, _, _, _],
  N1[_],
  N2[_],
  N3[_],
  N4[_],
  N5[_],
  N6[_],
  HLLike,
  APRHLLike[_, _ <: HLLike] <: HLLike
] extends ParameterSimpleSupport6[
      M,
      N1,
      N2,
      N3,
      N4,
      N5,
      N6,
      HLLike,
      HLLike,
      HLLike,
      HLLike,
      HLLike,
      HLLike,
      APRHLLike,
      APRHLLike,
      APRHLLike,
      APRHLLike,
      APRHLLike,
      APRHLLike
    ] {
  ParameterNatSupport6Self =>

  override def append[
    Item,
    HCollection1 <: HLLike,
    HCollection2 <: HLLike,
    HCollection3 <: HLLike,
    HCollection4 <: HLLike,
    HCollection5 <: HLLike,
    HCollection6 <: HLLike
  ](p1: M[HCollection1, HCollection2, HCollection3, HCollection4, HCollection5, HCollection6]): M[
    APRHLLike[N1[Item], HCollection1],
    APRHLLike[N2[Item], HCollection2],
    APRHLLike[N3[Item], HCollection3],
    APRHLLike[N4[Item], HCollection4],
    APRHLLike[N5[Item], HCollection5],
    APRHLLike[N6[Item], HCollection6]
  ] = super.append(p1)

  override def content: AppenderNatSupport6[
    M,
    HLLike,
    HLLike,
    HLLike,
    HLLike,
    HLLike,
    HLLike,
    APRHLLike,
    APRHLLike,
    APRHLLike,
    APRHLLike,
    APRHLLike,
    APRHLLike
  ] = super.content

  override def typeGen: TypeGen6[M, N1, N2, N3, N4, N5, N6]

  override def simpleAppender: SimpleAppender6[M]
  def apH: HListFunc[HLLike, APRHLLike]

  override def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport6Self.apH
  override def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport6Self.apH
  override def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport6Self.apH
  override def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport6Self.apH
  override def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport6Self.apH
  override def apH6: HListFunc[HLLike, APRHLLike] = ParameterNatSupport6Self.apH
}
