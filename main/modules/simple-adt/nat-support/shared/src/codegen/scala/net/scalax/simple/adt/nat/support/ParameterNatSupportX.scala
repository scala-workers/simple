package net.scalax.simple.adt
package nat
package support

trait ParameterNatSupport1[
  M[_],
  N1[_],
  HLLike1,
  APRHLLike1[_, _ <: HLLike1] <: HLLike1
] extends Parameter10NatSupport1[
      M,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N1[U1] })#TypeXM,
      HLLike1,
      APRHLLike1
    ] {
  ParameterNatSupport1Self =>

  def append[Item, HCollection1 <: HLLike1](p1: M[HCollection1]): M[APRHLLike1[N1[Item], HCollection1]] =
    ParameterNatSupport1Self.append10[Item, Any, Any, Any, Any, Any, Any, Any, Any, Any, HCollection1](p1)

  def content: AppenderNatSupport1[M, HLLike1, APRHLLike1]

  override def typeGen: TypeGen1[M, N1]

  def apH1: HListFunc[HLLike1, APRHLLike1]
}

trait ParameterNatSupport2[
  M[_, _],
  N1[_],
  N2[_],
  HLLike1,
  HLLike2,
  APRHLLike1[_, _ <: HLLike1] <: HLLike1,
  APRHLLike2[_, _ <: HLLike2] <: HLLike2
] extends Parameter10NatSupport2[
      M,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N1[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N2[U1] })#TypeXM,
      HLLike1,
      HLLike2,
      APRHLLike1,
      APRHLLike2
    ] {
  ParameterNatSupport2Self =>

  def append[Item, HCollection1 <: HLLike1, HCollection2 <: HLLike2](
    p1: M[HCollection1, HCollection2]
  ): M[APRHLLike1[N1[Item], HCollection1], APRHLLike2[N2[Item], HCollection2]] =
    ParameterNatSupport2Self.append10[Item, Any, Any, Any, Any, Any, Any, Any, Any, Any, HCollection1, HCollection2](p1)

  def content: AppenderNatSupport2[M, HLLike1, HLLike2, APRHLLike1, APRHLLike2]

  override def typeGen: TypeGen2[M, N1, N2]

  def apH1: HListFunc[HLLike1, APRHLLike1]
  def apH2: HListFunc[HLLike2, APRHLLike2]
}

trait ParameterNatSupport3[
  M[_, _, _],
  N1[_],
  N2[_],
  N3[_],
  HLLike1,
  HLLike2,
  HLLike3,
  APRHLLike1[_, _ <: HLLike1] <: HLLike1,
  APRHLLike2[_, _ <: HLLike2] <: HLLike2,
  APRHLLike3[_, _ <: HLLike3] <: HLLike3
] extends Parameter10NatSupport3[
      M,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N1[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N2[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N3[U1] })#TypeXM,
      HLLike1,
      HLLike2,
      HLLike3,
      APRHLLike1,
      APRHLLike2,
      APRHLLike3
    ] {
  ParameterNatSupport3Self =>

  def append[Item, HCollection1 <: HLLike1, HCollection2 <: HLLike2, HCollection3 <: HLLike3](
    p1: M[HCollection1, HCollection2, HCollection3]
  ): M[APRHLLike1[N1[Item], HCollection1], APRHLLike2[N2[Item], HCollection2], APRHLLike3[N3[Item], HCollection3]] =
    ParameterNatSupport3Self.append10[Item, Any, Any, Any, Any, Any, Any, Any, Any, Any, HCollection1, HCollection2, HCollection3](p1)

  def content: AppenderNatSupport3[M, HLLike1, HLLike2, HLLike3, APRHLLike1, APRHLLike2, APRHLLike3]

  override def typeGen: TypeGen3[M, N1, N2, N3]

  def apH1: HListFunc[HLLike1, APRHLLike1]
  def apH2: HListFunc[HLLike2, APRHLLike2]
  def apH3: HListFunc[HLLike3, APRHLLike3]
}

trait ParameterNatSupport4[
  M[_, _, _, _],
  N1[_],
  N2[_],
  N3[_],
  N4[_],
  HLLike1,
  HLLike2,
  HLLike3,
  HLLike4,
  APRHLLike1[_, _ <: HLLike1] <: HLLike1,
  APRHLLike2[_, _ <: HLLike2] <: HLLike2,
  APRHLLike3[_, _ <: HLLike3] <: HLLike3,
  APRHLLike4[_, _ <: HLLike4] <: HLLike4
] extends Parameter10NatSupport4[
      M,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N1[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N2[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N3[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N4[U1] })#TypeXM,
      HLLike1,
      HLLike2,
      HLLike3,
      HLLike4,
      APRHLLike1,
      APRHLLike2,
      APRHLLike3,
      APRHLLike4
    ] {
  ParameterNatSupport4Self =>

  def append[Item, HCollection1 <: HLLike1, HCollection2 <: HLLike2, HCollection3 <: HLLike3, HCollection4 <: HLLike4](
    p1: M[HCollection1, HCollection2, HCollection3, HCollection4]
  ): M[APRHLLike1[N1[Item], HCollection1], APRHLLike2[N2[Item], HCollection2], APRHLLike3[N3[Item], HCollection3], APRHLLike4[N4[
    Item
  ], HCollection4]] = ParameterNatSupport4Self
    .append10[Item, Any, Any, Any, Any, Any, Any, Any, Any, Any, HCollection1, HCollection2, HCollection3, HCollection4](p1)

  def content: AppenderNatSupport4[M, HLLike1, HLLike2, HLLike3, HLLike4, APRHLLike1, APRHLLike2, APRHLLike3, APRHLLike4]

  override def typeGen: TypeGen4[M, N1, N2, N3, N4]

  def apH1: HListFunc[HLLike1, APRHLLike1]
  def apH2: HListFunc[HLLike2, APRHLLike2]
  def apH3: HListFunc[HLLike3, APRHLLike3]
  def apH4: HListFunc[HLLike4, APRHLLike4]
}

trait ParameterNatSupport5[
  M[_, _, _, _, _],
  N1[_],
  N2[_],
  N3[_],
  N4[_],
  N5[_],
  HLLike1,
  HLLike2,
  HLLike3,
  HLLike4,
  HLLike5,
  APRHLLike1[_, _ <: HLLike1] <: HLLike1,
  APRHLLike2[_, _ <: HLLike2] <: HLLike2,
  APRHLLike3[_, _ <: HLLike3] <: HLLike3,
  APRHLLike4[_, _ <: HLLike4] <: HLLike4,
  APRHLLike5[_, _ <: HLLike5] <: HLLike5
] extends Parameter10NatSupport5[
      M,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N1[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N2[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N3[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N4[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N5[U1] })#TypeXM,
      HLLike1,
      HLLike2,
      HLLike3,
      HLLike4,
      HLLike5,
      APRHLLike1,
      APRHLLike2,
      APRHLLike3,
      APRHLLike4,
      APRHLLike5
    ] {
  ParameterNatSupport5Self =>

  def append[
    Item,
    HCollection1 <: HLLike1,
    HCollection2 <: HLLike2,
    HCollection3 <: HLLike3,
    HCollection4 <: HLLike4,
    HCollection5 <: HLLike5
  ](p1: M[HCollection1, HCollection2, HCollection3, HCollection4, HCollection5]): M[
    APRHLLike1[N1[Item], HCollection1],
    APRHLLike2[N2[Item], HCollection2],
    APRHLLike3[N3[Item], HCollection3],
    APRHLLike4[N4[Item], HCollection4],
    APRHLLike5[N5[Item], HCollection5]
  ] = ParameterNatSupport5Self
    .append10[Item, Any, Any, Any, Any, Any, Any, Any, Any, Any, HCollection1, HCollection2, HCollection3, HCollection4, HCollection5](p1)

  def content
    : AppenderNatSupport5[M, HLLike1, HLLike2, HLLike3, HLLike4, HLLike5, APRHLLike1, APRHLLike2, APRHLLike3, APRHLLike4, APRHLLike5]

  override def typeGen: TypeGen5[M, N1, N2, N3, N4, N5]

  def apH1: HListFunc[HLLike1, APRHLLike1]
  def apH2: HListFunc[HLLike2, APRHLLike2]
  def apH3: HListFunc[HLLike3, APRHLLike3]
  def apH4: HListFunc[HLLike4, APRHLLike4]
  def apH5: HListFunc[HLLike5, APRHLLike5]
}

trait ParameterNatSupport6[
  M[_, _, _, _, _, _],
  N1[_],
  N2[_],
  N3[_],
  N4[_],
  N5[_],
  N6[_],
  HLLike1,
  HLLike2,
  HLLike3,
  HLLike4,
  HLLike5,
  HLLike6,
  APRHLLike1[_, _ <: HLLike1] <: HLLike1,
  APRHLLike2[_, _ <: HLLike2] <: HLLike2,
  APRHLLike3[_, _ <: HLLike3] <: HLLike3,
  APRHLLike4[_, _ <: HLLike4] <: HLLike4,
  APRHLLike5[_, _ <: HLLike5] <: HLLike5,
  APRHLLike6[_, _ <: HLLike6] <: HLLike6
] extends Parameter10NatSupport6[
      M,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N1[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N2[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N3[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N4[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N5[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N6[U1] })#TypeXM,
      HLLike1,
      HLLike2,
      HLLike3,
      HLLike4,
      HLLike5,
      HLLike6,
      APRHLLike1,
      APRHLLike2,
      APRHLLike3,
      APRHLLike4,
      APRHLLike5,
      APRHLLike6
    ] {
  ParameterNatSupport6Self =>

  def append[
    Item,
    HCollection1 <: HLLike1,
    HCollection2 <: HLLike2,
    HCollection3 <: HLLike3,
    HCollection4 <: HLLike4,
    HCollection5 <: HLLike5,
    HCollection6 <: HLLike6
  ](p1: M[HCollection1, HCollection2, HCollection3, HCollection4, HCollection5, HCollection6]): M[
    APRHLLike1[N1[Item], HCollection1],
    APRHLLike2[N2[Item], HCollection2],
    APRHLLike3[N3[Item], HCollection3],
    APRHLLike4[N4[Item], HCollection4],
    APRHLLike5[N5[Item], HCollection5],
    APRHLLike6[N6[Item], HCollection6]
  ] = ParameterNatSupport6Self.append10[
    Item,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    HCollection1,
    HCollection2,
    HCollection3,
    HCollection4,
    HCollection5,
    HCollection6
  ](p1)

  def content: AppenderNatSupport6[
    M,
    HLLike1,
    HLLike2,
    HLLike3,
    HLLike4,
    HLLike5,
    HLLike6,
    APRHLLike1,
    APRHLLike2,
    APRHLLike3,
    APRHLLike4,
    APRHLLike5,
    APRHLLike6
  ]

  override def typeGen: TypeGen6[M, N1, N2, N3, N4, N5, N6]

  def apH1: HListFunc[HLLike1, APRHLLike1]
  def apH2: HListFunc[HLLike2, APRHLLike2]
  def apH3: HListFunc[HLLike3, APRHLLike3]
  def apH4: HListFunc[HLLike4, APRHLLike4]
  def apH5: HListFunc[HLLike5, APRHLLike5]
  def apH6: HListFunc[HLLike6, APRHLLike6]
}
