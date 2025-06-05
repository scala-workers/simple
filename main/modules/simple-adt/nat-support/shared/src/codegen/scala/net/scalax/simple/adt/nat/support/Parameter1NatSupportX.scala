package net.scalax.simple.adt
package nat
package support

trait Parameter1NatSupport1[
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
  Parameter1NatSupport1Self =>

  def append[Item, HCollection1 <: HLLike1](p1: M[HCollection1]): M[APRHLLike1[N1[Item], HCollection1]] =
    Parameter1NatSupport1Self.append10[Item, Any, Any, Any, Any, Any, Any, Any, Any, Any, HCollection1](p1)

  override def content: AppenderNatSupport1[M, HLLike1, APRHLLike1]

  override def typeGen: TypeGen1[M, N1]

}

trait Parameter1NatSupport2[
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
  Parameter1NatSupport2Self =>

  def append[Item, HCollection1 <: HLLike1, HCollection2 <: HLLike2](
    p1: M[HCollection1, HCollection2]
  ): M[APRHLLike1[N1[Item], HCollection1], APRHLLike2[N2[Item], HCollection2]] =
    Parameter1NatSupport2Self.append10[Item, Any, Any, Any, Any, Any, Any, Any, Any, Any, HCollection1, HCollection2](p1)

  override def content: AppenderNatSupport2[M, HLLike1, HLLike2, APRHLLike1, APRHLLike2]

  override def typeGen: TypeGen2[M, N1, N2]

}

trait Parameter1NatSupport3[
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
  Parameter1NatSupport3Self =>

  def append[Item, HCollection1 <: HLLike1, HCollection2 <: HLLike2, HCollection3 <: HLLike3](
    p1: M[HCollection1, HCollection2, HCollection3]
  ): M[APRHLLike1[N1[Item], HCollection1], APRHLLike2[N2[Item], HCollection2], APRHLLike3[N3[Item], HCollection3]] =
    Parameter1NatSupport3Self.append10[Item, Any, Any, Any, Any, Any, Any, Any, Any, Any, HCollection1, HCollection2, HCollection3](p1)

  override def content: AppenderNatSupport3[M, HLLike1, HLLike2, HLLike3, APRHLLike1, APRHLLike2, APRHLLike3]

  override def typeGen: TypeGen3[M, N1, N2, N3]

}

trait Parameter1NatSupport4[
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
  Parameter1NatSupport4Self =>

  def append[Item, HCollection1 <: HLLike1, HCollection2 <: HLLike2, HCollection3 <: HLLike3, HCollection4 <: HLLike4](
    p1: M[HCollection1, HCollection2, HCollection3, HCollection4]
  ): M[APRHLLike1[N1[Item], HCollection1], APRHLLike2[N2[Item], HCollection2], APRHLLike3[N3[Item], HCollection3], APRHLLike4[N4[
    Item
  ], HCollection4]] = Parameter1NatSupport4Self
    .append10[Item, Any, Any, Any, Any, Any, Any, Any, Any, Any, HCollection1, HCollection2, HCollection3, HCollection4](p1)

  override def content: AppenderNatSupport4[M, HLLike1, HLLike2, HLLike3, HLLike4, APRHLLike1, APRHLLike2, APRHLLike3, APRHLLike4]

  override def typeGen: TypeGen4[M, N1, N2, N3, N4]

}

trait Parameter1NatSupport5[
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
  Parameter1NatSupport5Self =>

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
  ] = Parameter1NatSupport5Self
    .append10[Item, Any, Any, Any, Any, Any, Any, Any, Any, Any, HCollection1, HCollection2, HCollection3, HCollection4, HCollection5](p1)

  override def content
    : AppenderNatSupport5[M, HLLike1, HLLike2, HLLike3, HLLike4, HLLike5, APRHLLike1, APRHLLike2, APRHLLike3, APRHLLike4, APRHLLike5]

  override def typeGen: TypeGen5[M, N1, N2, N3, N4, N5]

}

trait Parameter1NatSupport6[
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
  Parameter1NatSupport6Self =>

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
  ] = Parameter1NatSupport6Self.append10[
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

  override def content: AppenderNatSupport6[
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

}

trait Parameter1NatSupport7[
  M[_, _, _, _, _, _, _],
  N1[_],
  N2[_],
  N3[_],
  N4[_],
  N5[_],
  N6[_],
  N7[_],
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
] extends Parameter10NatSupport7[
      M,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N1[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N2[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N3[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N4[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N5[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N6[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N7[U1] })#TypeXM,
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
    ] {
  Parameter1NatSupport7Self =>

  def append[
    Item,
    HCollection1 <: HLLike1,
    HCollection2 <: HLLike2,
    HCollection3 <: HLLike3,
    HCollection4 <: HLLike4,
    HCollection5 <: HLLike5,
    HCollection6 <: HLLike6,
    HCollection7 <: HLLike7
  ](p1: M[HCollection1, HCollection2, HCollection3, HCollection4, HCollection5, HCollection6, HCollection7]): M[
    APRHLLike1[N1[Item], HCollection1],
    APRHLLike2[N2[Item], HCollection2],
    APRHLLike3[N3[Item], HCollection3],
    APRHLLike4[N4[Item], HCollection4],
    APRHLLike5[N5[Item], HCollection5],
    APRHLLike6[N6[Item], HCollection6],
    APRHLLike7[N7[Item], HCollection7]
  ] = Parameter1NatSupport7Self.append10[
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
    HCollection6,
    HCollection7
  ](p1)

  override def content: AppenderNatSupport7[
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

  override def typeGen: TypeGen7[M, N1, N2, N3, N4, N5, N6, N7]

}

trait Parameter1NatSupport8[
  M[_, _, _, _, _, _, _, _],
  N1[_],
  N2[_],
  N3[_],
  N4[_],
  N5[_],
  N6[_],
  N7[_],
  N8[_],
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
] extends Parameter10NatSupport8[
      M,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N1[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N2[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N3[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N4[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N5[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N6[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N7[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N8[U1] })#TypeXM,
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
    ] {
  Parameter1NatSupport8Self =>

  def append[
    Item,
    HCollection1 <: HLLike1,
    HCollection2 <: HLLike2,
    HCollection3 <: HLLike3,
    HCollection4 <: HLLike4,
    HCollection5 <: HLLike5,
    HCollection6 <: HLLike6,
    HCollection7 <: HLLike7,
    HCollection8 <: HLLike8
  ](p1: M[HCollection1, HCollection2, HCollection3, HCollection4, HCollection5, HCollection6, HCollection7, HCollection8]): M[
    APRHLLike1[N1[Item], HCollection1],
    APRHLLike2[N2[Item], HCollection2],
    APRHLLike3[N3[Item], HCollection3],
    APRHLLike4[N4[Item], HCollection4],
    APRHLLike5[N5[Item], HCollection5],
    APRHLLike6[N6[Item], HCollection6],
    APRHLLike7[N7[Item], HCollection7],
    APRHLLike8[N8[Item], HCollection8]
  ] = Parameter1NatSupport8Self.append10[
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
    HCollection6,
    HCollection7,
    HCollection8
  ](p1)

  override def content: AppenderNatSupport8[
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

  override def typeGen: TypeGen8[M, N1, N2, N3, N4, N5, N6, N7, N8]

}

trait Parameter1NatSupport9[
  M[_, _, _, _, _, _, _, _, _],
  N1[_],
  N2[_],
  N3[_],
  N4[_],
  N5[_],
  N6[_],
  N7[_],
  N8[_],
  N9[_],
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
] extends Parameter10NatSupport9[
      M,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N1[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N2[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N3[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N4[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N5[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N6[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N7[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N8[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N9[U1] })#TypeXM,
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
    ] {
  Parameter1NatSupport9Self =>

  def append[
    Item,
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
    APRHLLike1[N1[Item], HCollection1],
    APRHLLike2[N2[Item], HCollection2],
    APRHLLike3[N3[Item], HCollection3],
    APRHLLike4[N4[Item], HCollection4],
    APRHLLike5[N5[Item], HCollection5],
    APRHLLike6[N6[Item], HCollection6],
    APRHLLike7[N7[Item], HCollection7],
    APRHLLike8[N8[Item], HCollection8],
    APRHLLike9[N9[Item], HCollection9]
  ] = Parameter1NatSupport9Self.append10[
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
    HCollection6,
    HCollection7,
    HCollection8,
    HCollection9
  ](p1)

  override def content: AppenderNatSupport9[
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

  override def typeGen: TypeGen9[M, N1, N2, N3, N4, N5, N6, N7, N8, N9]

}

trait Parameter1NatSupport10[
  M[_, _, _, _, _, _, _, _, _, _],
  N1[_],
  N2[_],
  N3[_],
  N4[_],
  N5[_],
  N6[_],
  N7[_],
  N8[_],
  N9[_],
  N10[_],
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
] extends Parameter10NatSupport10[
      M,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N1[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N2[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N3[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N4[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N5[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N6[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N7[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N8[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N9[U1] })#TypeXM,
      ({ type TypeXM[U1, _, _, _, _, _, _, _, _, _] = N10[U1] })#TypeXM,
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
    ] {
  Parameter1NatSupport10Self =>

  def append[
    Item,
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
    APRHLLike1[N1[Item], HCollection1],
    APRHLLike2[N2[Item], HCollection2],
    APRHLLike3[N3[Item], HCollection3],
    APRHLLike4[N4[Item], HCollection4],
    APRHLLike5[N5[Item], HCollection5],
    APRHLLike6[N6[Item], HCollection6],
    APRHLLike7[N7[Item], HCollection7],
    APRHLLike8[N8[Item], HCollection8],
    APRHLLike9[N9[Item], HCollection9],
    APRHLLike10[N10[Item], HCollection10]
  ] = Parameter1NatSupport10Self.append10[
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
    HCollection6,
    HCollection7,
    HCollection8,
    HCollection9,
    HCollection10
  ](p1)

  override def content: AppenderNatSupport10[
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

  override def typeGen: TypeGen10[M, N1, N2, N3, N4, N5, N6, N7, N8, N9, N10]

}
