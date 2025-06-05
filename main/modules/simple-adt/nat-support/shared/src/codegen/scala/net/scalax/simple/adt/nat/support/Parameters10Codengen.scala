package net.scalax.simple.adt
package nat
package support

trait Parameter10NatSupport1[
  M[_],
  N1[_, _, _, _, _, _, _, _, _, _],
  HLLike1,
  APRHLLike1[_, _ <: HLLike1] <: HLLike1
] {
  Parameter10NatSupport1Self =>

  def append10[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10, HCollection1 <: HLLike1](
    p1: M[HCollection1]
  ): M[APRHLLike1[N1[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection1]] =
    Parameter10NatSupport1Self.content
      .append(Parameter10NatSupport1Self.typeGen.gen10[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], p1)

  def content: AppenderNatSupport1[M, HLLike1, APRHLLike1]

  def typeGen: Type10Gen1[M, N1]

}

trait Parameter10NatSupport2[
  M[_, _],
  N1[_, _, _, _, _, _, _, _, _, _],
  N2[_, _, _, _, _, _, _, _, _, _],
  HLLike1,
  HLLike2,
  APRHLLike1[_, _ <: HLLike1] <: HLLike1,
  APRHLLike2[_, _ <: HLLike2] <: HLLike2
] {
  Parameter10NatSupport2Self =>

  def append10[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10, HCollection1 <: HLLike1, HCollection2 <: HLLike2](
    p1: M[HCollection1, HCollection2]
  ): M[
    APRHLLike1[N1[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection1],
    APRHLLike2[N2[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection2]
  ] = Parameter10NatSupport2Self.content
    .append(Parameter10NatSupport2Self.typeGen.gen10[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], p1)

  def content: AppenderNatSupport2[M, HLLike1, HLLike2, APRHLLike1, APRHLLike2]

  def typeGen: Type10Gen2[M, N1, N2]

}

trait Parameter10NatSupport3[
  M[_, _, _],
  N1[_, _, _, _, _, _, _, _, _, _],
  N2[_, _, _, _, _, _, _, _, _, _],
  N3[_, _, _, _, _, _, _, _, _, _],
  HLLike1,
  HLLike2,
  HLLike3,
  APRHLLike1[_, _ <: HLLike1] <: HLLike1,
  APRHLLike2[_, _ <: HLLike2] <: HLLike2,
  APRHLLike3[_, _ <: HLLike3] <: HLLike3
] {
  Parameter10NatSupport3Self =>

  def append10[
    Item1,
    Item2,
    Item3,
    Item4,
    Item5,
    Item6,
    Item7,
    Item8,
    Item9,
    Item10,
    HCollection1 <: HLLike1,
    HCollection2 <: HLLike2,
    HCollection3 <: HLLike3
  ](p1: M[HCollection1, HCollection2, HCollection3]): M[
    APRHLLike1[N1[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection1],
    APRHLLike2[N2[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection2],
    APRHLLike3[N3[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection3]
  ] = Parameter10NatSupport3Self.content
    .append(Parameter10NatSupport3Self.typeGen.gen10[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], p1)

  def content: AppenderNatSupport3[M, HLLike1, HLLike2, HLLike3, APRHLLike1, APRHLLike2, APRHLLike3]

  def typeGen: Type10Gen3[M, N1, N2, N3]

}

trait Parameter10NatSupport4[
  M[_, _, _, _],
  N1[_, _, _, _, _, _, _, _, _, _],
  N2[_, _, _, _, _, _, _, _, _, _],
  N3[_, _, _, _, _, _, _, _, _, _],
  N4[_, _, _, _, _, _, _, _, _, _],
  HLLike1,
  HLLike2,
  HLLike3,
  HLLike4,
  APRHLLike1[_, _ <: HLLike1] <: HLLike1,
  APRHLLike2[_, _ <: HLLike2] <: HLLike2,
  APRHLLike3[_, _ <: HLLike3] <: HLLike3,
  APRHLLike4[_, _ <: HLLike4] <: HLLike4
] {
  Parameter10NatSupport4Self =>

  def append10[
    Item1,
    Item2,
    Item3,
    Item4,
    Item5,
    Item6,
    Item7,
    Item8,
    Item9,
    Item10,
    HCollection1 <: HLLike1,
    HCollection2 <: HLLike2,
    HCollection3 <: HLLike3,
    HCollection4 <: HLLike4
  ](p1: M[HCollection1, HCollection2, HCollection3, HCollection4]): M[
    APRHLLike1[N1[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection1],
    APRHLLike2[N2[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection2],
    APRHLLike3[N3[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection3],
    APRHLLike4[N4[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection4]
  ] = Parameter10NatSupport4Self.content
    .append(Parameter10NatSupport4Self.typeGen.gen10[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], p1)

  def content: AppenderNatSupport4[M, HLLike1, HLLike2, HLLike3, HLLike4, APRHLLike1, APRHLLike2, APRHLLike3, APRHLLike4]

  def typeGen: Type10Gen4[M, N1, N2, N3, N4]

}

trait Parameter10NatSupport5[
  M[_, _, _, _, _],
  N1[_, _, _, _, _, _, _, _, _, _],
  N2[_, _, _, _, _, _, _, _, _, _],
  N3[_, _, _, _, _, _, _, _, _, _],
  N4[_, _, _, _, _, _, _, _, _, _],
  N5[_, _, _, _, _, _, _, _, _, _],
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
] {
  Parameter10NatSupport5Self =>

  def append10[
    Item1,
    Item2,
    Item3,
    Item4,
    Item5,
    Item6,
    Item7,
    Item8,
    Item9,
    Item10,
    HCollection1 <: HLLike1,
    HCollection2 <: HLLike2,
    HCollection3 <: HLLike3,
    HCollection4 <: HLLike4,
    HCollection5 <: HLLike5
  ](p1: M[HCollection1, HCollection2, HCollection3, HCollection4, HCollection5]): M[
    APRHLLike1[N1[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection1],
    APRHLLike2[N2[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection2],
    APRHLLike3[N3[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection3],
    APRHLLike4[N4[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection4],
    APRHLLike5[N5[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection5]
  ] = Parameter10NatSupport5Self.content
    .append(Parameter10NatSupport5Self.typeGen.gen10[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], p1)

  def content
    : AppenderNatSupport5[M, HLLike1, HLLike2, HLLike3, HLLike4, HLLike5, APRHLLike1, APRHLLike2, APRHLLike3, APRHLLike4, APRHLLike5]

  def typeGen: Type10Gen5[M, N1, N2, N3, N4, N5]

}

trait Parameter10NatSupport6[
  M[_, _, _, _, _, _],
  N1[_, _, _, _, _, _, _, _, _, _],
  N2[_, _, _, _, _, _, _, _, _, _],
  N3[_, _, _, _, _, _, _, _, _, _],
  N4[_, _, _, _, _, _, _, _, _, _],
  N5[_, _, _, _, _, _, _, _, _, _],
  N6[_, _, _, _, _, _, _, _, _, _],
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
] {
  Parameter10NatSupport6Self =>

  def append10[
    Item1,
    Item2,
    Item3,
    Item4,
    Item5,
    Item6,
    Item7,
    Item8,
    Item9,
    Item10,
    HCollection1 <: HLLike1,
    HCollection2 <: HLLike2,
    HCollection3 <: HLLike3,
    HCollection4 <: HLLike4,
    HCollection5 <: HLLike5,
    HCollection6 <: HLLike6
  ](p1: M[HCollection1, HCollection2, HCollection3, HCollection4, HCollection5, HCollection6]): M[
    APRHLLike1[N1[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection1],
    APRHLLike2[N2[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection2],
    APRHLLike3[N3[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection3],
    APRHLLike4[N4[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection4],
    APRHLLike5[N5[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection5],
    APRHLLike6[N6[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection6]
  ] = Parameter10NatSupport6Self.content
    .append(Parameter10NatSupport6Self.typeGen.gen10[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], p1)

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

  def typeGen: Type10Gen6[M, N1, N2, N3, N4, N5, N6]

}

trait Parameter10NatSupport7[
  M[_, _, _, _, _, _, _],
  N1[_, _, _, _, _, _, _, _, _, _],
  N2[_, _, _, _, _, _, _, _, _, _],
  N3[_, _, _, _, _, _, _, _, _, _],
  N4[_, _, _, _, _, _, _, _, _, _],
  N5[_, _, _, _, _, _, _, _, _, _],
  N6[_, _, _, _, _, _, _, _, _, _],
  N7[_, _, _, _, _, _, _, _, _, _],
  HLLike1,
  HLLike2,
  HLLike3,
  HLLike4,
  HLLike5,
  HLLike6,
  HLLike7,
  APRHLLike1[_, _ <: HLLike1] <: HLLike1,
  APRHLLike2[_, _ <: HLLike2] <: HLLike2,
  APRHLLike3[_, _ <: HLLike3] <: HLLike3,
  APRHLLike4[_, _ <: HLLike4] <: HLLike4,
  APRHLLike5[_, _ <: HLLike5] <: HLLike5,
  APRHLLike6[_, _ <: HLLike6] <: HLLike6,
  APRHLLike7[_, _ <: HLLike7] <: HLLike7
] {
  Parameter10NatSupport7Self =>

  def append10[
    Item1,
    Item2,
    Item3,
    Item4,
    Item5,
    Item6,
    Item7,
    Item8,
    Item9,
    Item10,
    HCollection1 <: HLLike1,
    HCollection2 <: HLLike2,
    HCollection3 <: HLLike3,
    HCollection4 <: HLLike4,
    HCollection5 <: HLLike5,
    HCollection6 <: HLLike6,
    HCollection7 <: HLLike7
  ](p1: M[HCollection1, HCollection2, HCollection3, HCollection4, HCollection5, HCollection6, HCollection7]): M[
    APRHLLike1[N1[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection1],
    APRHLLike2[N2[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection2],
    APRHLLike3[N3[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection3],
    APRHLLike4[N4[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection4],
    APRHLLike5[N5[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection5],
    APRHLLike6[N6[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection6],
    APRHLLike7[N7[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection7]
  ] = Parameter10NatSupport7Self.content
    .append(Parameter10NatSupport7Self.typeGen.gen10[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], p1)

  def content: AppenderNatSupport7[
    M,
    HLLike1,
    HLLike2,
    HLLike3,
    HLLike4,
    HLLike5,
    HLLike6,
    HLLike7,
    APRHLLike1,
    APRHLLike2,
    APRHLLike3,
    APRHLLike4,
    APRHLLike5,
    APRHLLike6,
    APRHLLike7
  ]

  def typeGen: Type10Gen7[M, N1, N2, N3, N4, N5, N6, N7]

}

trait Parameter10NatSupport8[
  M[_, _, _, _, _, _, _, _],
  N1[_, _, _, _, _, _, _, _, _, _],
  N2[_, _, _, _, _, _, _, _, _, _],
  N3[_, _, _, _, _, _, _, _, _, _],
  N4[_, _, _, _, _, _, _, _, _, _],
  N5[_, _, _, _, _, _, _, _, _, _],
  N6[_, _, _, _, _, _, _, _, _, _],
  N7[_, _, _, _, _, _, _, _, _, _],
  N8[_, _, _, _, _, _, _, _, _, _],
  HLLike1,
  HLLike2,
  HLLike3,
  HLLike4,
  HLLike5,
  HLLike6,
  HLLike7,
  HLLike8,
  APRHLLike1[_, _ <: HLLike1] <: HLLike1,
  APRHLLike2[_, _ <: HLLike2] <: HLLike2,
  APRHLLike3[_, _ <: HLLike3] <: HLLike3,
  APRHLLike4[_, _ <: HLLike4] <: HLLike4,
  APRHLLike5[_, _ <: HLLike5] <: HLLike5,
  APRHLLike6[_, _ <: HLLike6] <: HLLike6,
  APRHLLike7[_, _ <: HLLike7] <: HLLike7,
  APRHLLike8[_, _ <: HLLike8] <: HLLike8
] {
  Parameter10NatSupport8Self =>

  def append10[
    Item1,
    Item2,
    Item3,
    Item4,
    Item5,
    Item6,
    Item7,
    Item8,
    Item9,
    Item10,
    HCollection1 <: HLLike1,
    HCollection2 <: HLLike2,
    HCollection3 <: HLLike3,
    HCollection4 <: HLLike4,
    HCollection5 <: HLLike5,
    HCollection6 <: HLLike6,
    HCollection7 <: HLLike7,
    HCollection8 <: HLLike8
  ](p1: M[HCollection1, HCollection2, HCollection3, HCollection4, HCollection5, HCollection6, HCollection7, HCollection8]): M[
    APRHLLike1[N1[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection1],
    APRHLLike2[N2[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection2],
    APRHLLike3[N3[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection3],
    APRHLLike4[N4[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection4],
    APRHLLike5[N5[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection5],
    APRHLLike6[N6[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection6],
    APRHLLike7[N7[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection7],
    APRHLLike8[N8[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection8]
  ] = Parameter10NatSupport8Self.content
    .append(Parameter10NatSupport8Self.typeGen.gen10[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], p1)

  def content: AppenderNatSupport8[
    M,
    HLLike1,
    HLLike2,
    HLLike3,
    HLLike4,
    HLLike5,
    HLLike6,
    HLLike7,
    HLLike8,
    APRHLLike1,
    APRHLLike2,
    APRHLLike3,
    APRHLLike4,
    APRHLLike5,
    APRHLLike6,
    APRHLLike7,
    APRHLLike8
  ]

  def typeGen: Type10Gen8[M, N1, N2, N3, N4, N5, N6, N7, N8]

}

trait Parameter10NatSupport9[
  M[_, _, _, _, _, _, _, _, _],
  N1[_, _, _, _, _, _, _, _, _, _],
  N2[_, _, _, _, _, _, _, _, _, _],
  N3[_, _, _, _, _, _, _, _, _, _],
  N4[_, _, _, _, _, _, _, _, _, _],
  N5[_, _, _, _, _, _, _, _, _, _],
  N6[_, _, _, _, _, _, _, _, _, _],
  N7[_, _, _, _, _, _, _, _, _, _],
  N8[_, _, _, _, _, _, _, _, _, _],
  N9[_, _, _, _, _, _, _, _, _, _],
  HLLike1,
  HLLike2,
  HLLike3,
  HLLike4,
  HLLike5,
  HLLike6,
  HLLike7,
  HLLike8,
  HLLike9,
  APRHLLike1[_, _ <: HLLike1] <: HLLike1,
  APRHLLike2[_, _ <: HLLike2] <: HLLike2,
  APRHLLike3[_, _ <: HLLike3] <: HLLike3,
  APRHLLike4[_, _ <: HLLike4] <: HLLike4,
  APRHLLike5[_, _ <: HLLike5] <: HLLike5,
  APRHLLike6[_, _ <: HLLike6] <: HLLike6,
  APRHLLike7[_, _ <: HLLike7] <: HLLike7,
  APRHLLike8[_, _ <: HLLike8] <: HLLike8,
  APRHLLike9[_, _ <: HLLike9] <: HLLike9
] {
  Parameter10NatSupport9Self =>

  def append10[
    Item1,
    Item2,
    Item3,
    Item4,
    Item5,
    Item6,
    Item7,
    Item8,
    Item9,
    Item10,
    HCollection1 <: HLLike1,
    HCollection2 <: HLLike2,
    HCollection3 <: HLLike3,
    HCollection4 <: HLLike4,
    HCollection5 <: HLLike5,
    HCollection6 <: HLLike6,
    HCollection7 <: HLLike7,
    HCollection8 <: HLLike8,
    HCollection9 <: HLLike9
  ](p1: M[HCollection1, HCollection2, HCollection3, HCollection4, HCollection5, HCollection6, HCollection7, HCollection8, HCollection9]): M[
    APRHLLike1[N1[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection1],
    APRHLLike2[N2[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection2],
    APRHLLike3[N3[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection3],
    APRHLLike4[N4[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection4],
    APRHLLike5[N5[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection5],
    APRHLLike6[N6[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection6],
    APRHLLike7[N7[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection7],
    APRHLLike8[N8[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection8],
    APRHLLike9[N9[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection9]
  ] = Parameter10NatSupport9Self.content
    .append(Parameter10NatSupport9Self.typeGen.gen10[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], p1)

  def content: AppenderNatSupport9[
    M,
    HLLike1,
    HLLike2,
    HLLike3,
    HLLike4,
    HLLike5,
    HLLike6,
    HLLike7,
    HLLike8,
    HLLike9,
    APRHLLike1,
    APRHLLike2,
    APRHLLike3,
    APRHLLike4,
    APRHLLike5,
    APRHLLike6,
    APRHLLike7,
    APRHLLike8,
    APRHLLike9
  ]

  def typeGen: Type10Gen9[M, N1, N2, N3, N4, N5, N6, N7, N8, N9]

}

trait Parameter10NatSupport10[
  M[_, _, _, _, _, _, _, _, _, _],
  N1[_, _, _, _, _, _, _, _, _, _],
  N2[_, _, _, _, _, _, _, _, _, _],
  N3[_, _, _, _, _, _, _, _, _, _],
  N4[_, _, _, _, _, _, _, _, _, _],
  N5[_, _, _, _, _, _, _, _, _, _],
  N6[_, _, _, _, _, _, _, _, _, _],
  N7[_, _, _, _, _, _, _, _, _, _],
  N8[_, _, _, _, _, _, _, _, _, _],
  N9[_, _, _, _, _, _, _, _, _, _],
  N10[_, _, _, _, _, _, _, _, _, _],
  HLLike1,
  HLLike2,
  HLLike3,
  HLLike4,
  HLLike5,
  HLLike6,
  HLLike7,
  HLLike8,
  HLLike9,
  HLLike10,
  APRHLLike1[_, _ <: HLLike1] <: HLLike1,
  APRHLLike2[_, _ <: HLLike2] <: HLLike2,
  APRHLLike3[_, _ <: HLLike3] <: HLLike3,
  APRHLLike4[_, _ <: HLLike4] <: HLLike4,
  APRHLLike5[_, _ <: HLLike5] <: HLLike5,
  APRHLLike6[_, _ <: HLLike6] <: HLLike6,
  APRHLLike7[_, _ <: HLLike7] <: HLLike7,
  APRHLLike8[_, _ <: HLLike8] <: HLLike8,
  APRHLLike9[_, _ <: HLLike9] <: HLLike9,
  APRHLLike10[_, _ <: HLLike10] <: HLLike10
] {
  Parameter10NatSupport10Self =>

  def append10[
    Item1,
    Item2,
    Item3,
    Item4,
    Item5,
    Item6,
    Item7,
    Item8,
    Item9,
    Item10,
    HCollection1 <: HLLike1,
    HCollection2 <: HLLike2,
    HCollection3 <: HLLike3,
    HCollection4 <: HLLike4,
    HCollection5 <: HLLike5,
    HCollection6 <: HLLike6,
    HCollection7 <: HLLike7,
    HCollection8 <: HLLike8,
    HCollection9 <: HLLike9,
    HCollection10 <: HLLike10
  ](
    p1: M[
      HCollection1,
      HCollection2,
      HCollection3,
      HCollection4,
      HCollection5,
      HCollection6,
      HCollection7,
      HCollection8,
      HCollection9,
      HCollection10
    ]
  ): M[
    APRHLLike1[N1[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection1],
    APRHLLike2[N2[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection2],
    APRHLLike3[N3[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection3],
    APRHLLike4[N4[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection4],
    APRHLLike5[N5[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection5],
    APRHLLike6[N6[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection6],
    APRHLLike7[N7[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection7],
    APRHLLike8[N8[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection8],
    APRHLLike9[N9[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection9],
    APRHLLike10[N10[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection10]
  ] = Parameter10NatSupport10Self.content
    .append(Parameter10NatSupport10Self.typeGen.gen10[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], p1)

  def content: AppenderNatSupport10[
    M,
    HLLike1,
    HLLike2,
    HLLike3,
    HLLike4,
    HLLike5,
    HLLike6,
    HLLike7,
    HLLike8,
    HLLike9,
    HLLike10,
    APRHLLike1,
    APRHLLike2,
    APRHLLike3,
    APRHLLike4,
    APRHLLike5,
    APRHLLike6,
    APRHLLike7,
    APRHLLike8,
    APRHLLike9,
    APRHLLike10
  ]

  def typeGen: Type10Gen10[M, N1, N2, N3, N4, N5, N6, N7, N8, N9, N10]

}
