package net.scalax.simple.adt
package nat
package support

trait ParameterNatSupport1[
  M[_],
  N1[_],
  HLLike1,
  APRHLLike1[_, _ <: HLLike1] <: HLLike1,
  HCollection1 <: HLLike1
] {
  ParameterNatSupport1Self =>

  def now: M[HCollection1] = content.current

  def append[Item](p: M[N1[Item]]): ParameterNatSupport1[M, N1, HLLike1, APRHLLike1, APRHLLike1[N1[Item], HCollection1]] =
    new ParameterNatSupport1[M, N1, HLLike1, APRHLLike1, APRHLLike1[N1[Item], HCollection1]] {
      override def content: AppenderNatSupport1[M, HLLike1, APRHLLike1, APRHLLike1[N1[Item], HCollection1]] =
        ParameterNatSupport1Self.content.next[N1[Item]](p)
      override def apH1: HListFunc[HLLike1, APRHLLike1] = ParameterNatSupport1Self.apH1
    }

  def content: AppenderNatSupport1[M, HLLike1, APRHLLike1, HCollection1]

  def apH1: HListFunc[HLLike1, APRHLLike1]
}

trait ParameterNatSupport2[
  M[_, _],
  N1[_],
  N2[_],
  HLLike1,
  HLLike2,
  APRHLLike1[_, _ <: HLLike1] <: HLLike1,
  APRHLLike2[_, _ <: HLLike2] <: HLLike2,
  HCollection1 <: HLLike1,
  HCollection2 <: HLLike2
] {
  ParameterNatSupport2Self =>

  def now: M[HCollection1, HCollection2] = content.current

  def append[Item](p: M[N1[Item], N2[Item]]): ParameterNatSupport2[M, N1, N2, HLLike1, HLLike2, APRHLLike1, APRHLLike2, APRHLLike1[N1[
    Item
  ], HCollection1], APRHLLike2[N2[Item], HCollection2]] =
    new ParameterNatSupport2[M, N1, N2, HLLike1, HLLike2, APRHLLike1, APRHLLike2, APRHLLike1[N1[Item], HCollection1], APRHLLike2[N2[
      Item
    ], HCollection2]] {
      override def content
        : AppenderNatSupport2[M, HLLike1, HLLike2, APRHLLike1, APRHLLike2, APRHLLike1[N1[Item], HCollection1], APRHLLike2[N2[
          Item
        ], HCollection2]] = ParameterNatSupport2Self.content.next[N1[Item], N2[Item]](p)
      override def apH1: HListFunc[HLLike1, APRHLLike1] = ParameterNatSupport2Self.apH1
      override def apH2: HListFunc[HLLike2, APRHLLike2] = ParameterNatSupport2Self.apH2
    }

  def content: AppenderNatSupport2[M, HLLike1, HLLike2, APRHLLike1, APRHLLike2, HCollection1, HCollection2]

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
  APRHLLike3[_, _ <: HLLike3] <: HLLike3,
  HCollection1 <: HLLike1,
  HCollection2 <: HLLike2,
  HCollection3 <: HLLike3
] {
  ParameterNatSupport3Self =>

  def now: M[HCollection1, HCollection2, HCollection3] = content.current

  def append[Item](p: M[N1[Item], N2[Item], N3[Item]]): ParameterNatSupport3[
    M,
    N1,
    N2,
    N3,
    HLLike1,
    HLLike2,
    HLLike3,
    APRHLLike1,
    APRHLLike2,
    APRHLLike3,
    APRHLLike1[N1[Item], HCollection1],
    APRHLLike2[N2[Item], HCollection2],
    APRHLLike3[N3[Item], HCollection3]
  ] = new ParameterNatSupport3[
    M,
    N1,
    N2,
    N3,
    HLLike1,
    HLLike2,
    HLLike3,
    APRHLLike1,
    APRHLLike2,
    APRHLLike3,
    APRHLLike1[N1[Item], HCollection1],
    APRHLLike2[N2[Item], HCollection2],
    APRHLLike3[N3[Item], HCollection3]
  ] {
    override def content: AppenderNatSupport3[
      M,
      HLLike1,
      HLLike2,
      HLLike3,
      APRHLLike1,
      APRHLLike2,
      APRHLLike3,
      APRHLLike1[N1[Item], HCollection1],
      APRHLLike2[N2[Item], HCollection2],
      APRHLLike3[N3[Item], HCollection3]
    ] = ParameterNatSupport3Self.content.next[N1[Item], N2[Item], N3[Item]](p)
    override def apH1: HListFunc[HLLike1, APRHLLike1] = ParameterNatSupport3Self.apH1
    override def apH2: HListFunc[HLLike2, APRHLLike2] = ParameterNatSupport3Self.apH2
    override def apH3: HListFunc[HLLike3, APRHLLike3] = ParameterNatSupport3Self.apH3
  }

  def content
    : AppenderNatSupport3[M, HLLike1, HLLike2, HLLike3, APRHLLike1, APRHLLike2, APRHLLike3, HCollection1, HCollection2, HCollection3]

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
  APRHLLike4[_, _ <: HLLike4] <: HLLike4,
  HCollection1 <: HLLike1,
  HCollection2 <: HLLike2,
  HCollection3 <: HLLike3,
  HCollection4 <: HLLike4
] {
  ParameterNatSupport4Self =>

  def now: M[HCollection1, HCollection2, HCollection3, HCollection4] = content.current

  def append[Item](p: M[N1[Item], N2[Item], N3[Item], N4[Item]]): ParameterNatSupport4[
    M,
    N1,
    N2,
    N3,
    N4,
    HLLike1,
    HLLike2,
    HLLike3,
    HLLike4,
    APRHLLike1,
    APRHLLike2,
    APRHLLike3,
    APRHLLike4,
    APRHLLike1[N1[Item], HCollection1],
    APRHLLike2[N2[Item], HCollection2],
    APRHLLike3[N3[Item], HCollection3],
    APRHLLike4[N4[Item], HCollection4]
  ] = new ParameterNatSupport4[
    M,
    N1,
    N2,
    N3,
    N4,
    HLLike1,
    HLLike2,
    HLLike3,
    HLLike4,
    APRHLLike1,
    APRHLLike2,
    APRHLLike3,
    APRHLLike4,
    APRHLLike1[N1[Item], HCollection1],
    APRHLLike2[N2[Item], HCollection2],
    APRHLLike3[N3[Item], HCollection3],
    APRHLLike4[N4[Item], HCollection4]
  ] {
    override def content: AppenderNatSupport4[
      M,
      HLLike1,
      HLLike2,
      HLLike3,
      HLLike4,
      APRHLLike1,
      APRHLLike2,
      APRHLLike3,
      APRHLLike4,
      APRHLLike1[N1[Item], HCollection1],
      APRHLLike2[N2[Item], HCollection2],
      APRHLLike3[N3[Item], HCollection3],
      APRHLLike4[N4[Item], HCollection4]
    ] = ParameterNatSupport4Self.content.next[N1[Item], N2[Item], N3[Item], N4[Item]](p)
    override def apH1: HListFunc[HLLike1, APRHLLike1] = ParameterNatSupport4Self.apH1
    override def apH2: HListFunc[HLLike2, APRHLLike2] = ParameterNatSupport4Self.apH2
    override def apH3: HListFunc[HLLike3, APRHLLike3] = ParameterNatSupport4Self.apH3
    override def apH4: HListFunc[HLLike4, APRHLLike4] = ParameterNatSupport4Self.apH4
  }

  def content: AppenderNatSupport4[
    M,
    HLLike1,
    HLLike2,
    HLLike3,
    HLLike4,
    APRHLLike1,
    APRHLLike2,
    APRHLLike3,
    APRHLLike4,
    HCollection1,
    HCollection2,
    HCollection3,
    HCollection4
  ]

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
  APRHLLike5[_, _ <: HLLike5] <: HLLike5,
  HCollection1 <: HLLike1,
  HCollection2 <: HLLike2,
  HCollection3 <: HLLike3,
  HCollection4 <: HLLike4,
  HCollection5 <: HLLike5
] {
  ParameterNatSupport5Self =>

  def now: M[HCollection1, HCollection2, HCollection3, HCollection4, HCollection5] = content.current

  def append[Item](p: M[N1[Item], N2[Item], N3[Item], N4[Item], N5[Item]]): ParameterNatSupport5[
    M,
    N1,
    N2,
    N3,
    N4,
    N5,
    HLLike1,
    HLLike2,
    HLLike3,
    HLLike4,
    HLLike5,
    APRHLLike1,
    APRHLLike2,
    APRHLLike3,
    APRHLLike4,
    APRHLLike5,
    APRHLLike1[N1[Item], HCollection1],
    APRHLLike2[N2[Item], HCollection2],
    APRHLLike3[N3[Item], HCollection3],
    APRHLLike4[N4[Item], HCollection4],
    APRHLLike5[N5[Item], HCollection5]
  ] = new ParameterNatSupport5[
    M,
    N1,
    N2,
    N3,
    N4,
    N5,
    HLLike1,
    HLLike2,
    HLLike3,
    HLLike4,
    HLLike5,
    APRHLLike1,
    APRHLLike2,
    APRHLLike3,
    APRHLLike4,
    APRHLLike5,
    APRHLLike1[N1[Item], HCollection1],
    APRHLLike2[N2[Item], HCollection2],
    APRHLLike3[N3[Item], HCollection3],
    APRHLLike4[N4[Item], HCollection4],
    APRHLLike5[N5[Item], HCollection5]
  ] {
    override def content: AppenderNatSupport5[
      M,
      HLLike1,
      HLLike2,
      HLLike3,
      HLLike4,
      HLLike5,
      APRHLLike1,
      APRHLLike2,
      APRHLLike3,
      APRHLLike4,
      APRHLLike5,
      APRHLLike1[N1[Item], HCollection1],
      APRHLLike2[N2[Item], HCollection2],
      APRHLLike3[N3[Item], HCollection3],
      APRHLLike4[N4[Item], HCollection4],
      APRHLLike5[N5[Item], HCollection5]
    ] = ParameterNatSupport5Self.content.next[N1[Item], N2[Item], N3[Item], N4[Item], N5[Item]](p)
    override def apH1: HListFunc[HLLike1, APRHLLike1] = ParameterNatSupport5Self.apH1
    override def apH2: HListFunc[HLLike2, APRHLLike2] = ParameterNatSupport5Self.apH2
    override def apH3: HListFunc[HLLike3, APRHLLike3] = ParameterNatSupport5Self.apH3
    override def apH4: HListFunc[HLLike4, APRHLLike4] = ParameterNatSupport5Self.apH4
    override def apH5: HListFunc[HLLike5, APRHLLike5] = ParameterNatSupport5Self.apH5
  }

  def content: AppenderNatSupport5[
    M,
    HLLike1,
    HLLike2,
    HLLike3,
    HLLike4,
    HLLike5,
    APRHLLike1,
    APRHLLike2,
    APRHLLike3,
    APRHLLike4,
    APRHLLike5,
    HCollection1,
    HCollection2,
    HCollection3,
    HCollection4,
    HCollection5
  ]

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
  APRHLLike6[_, _ <: HLLike6] <: HLLike6,
  HCollection1 <: HLLike1,
  HCollection2 <: HLLike2,
  HCollection3 <: HLLike3,
  HCollection4 <: HLLike4,
  HCollection5 <: HLLike5,
  HCollection6 <: HLLike6
] {
  ParameterNatSupport6Self =>

  def now: M[HCollection1, HCollection2, HCollection3, HCollection4, HCollection5, HCollection6] = content.current

  def append[Item](p: M[N1[Item], N2[Item], N3[Item], N4[Item], N5[Item], N6[Item]]): ParameterNatSupport6[
    M,
    N1,
    N2,
    N3,
    N4,
    N5,
    N6,
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
    APRHLLike6,
    APRHLLike1[N1[Item], HCollection1],
    APRHLLike2[N2[Item], HCollection2],
    APRHLLike3[N3[Item], HCollection3],
    APRHLLike4[N4[Item], HCollection4],
    APRHLLike5[N5[Item], HCollection5],
    APRHLLike6[N6[Item], HCollection6]
  ] = new ParameterNatSupport6[
    M,
    N1,
    N2,
    N3,
    N4,
    N5,
    N6,
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
    APRHLLike6,
    APRHLLike1[N1[Item], HCollection1],
    APRHLLike2[N2[Item], HCollection2],
    APRHLLike3[N3[Item], HCollection3],
    APRHLLike4[N4[Item], HCollection4],
    APRHLLike5[N5[Item], HCollection5],
    APRHLLike6[N6[Item], HCollection6]
  ] {
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
      APRHLLike6,
      APRHLLike1[N1[Item], HCollection1],
      APRHLLike2[N2[Item], HCollection2],
      APRHLLike3[N3[Item], HCollection3],
      APRHLLike4[N4[Item], HCollection4],
      APRHLLike5[N5[Item], HCollection5],
      APRHLLike6[N6[Item], HCollection6]
    ] = ParameterNatSupport6Self.content.next[N1[Item], N2[Item], N3[Item], N4[Item], N5[Item], N6[Item]](p)
    override def apH1: HListFunc[HLLike1, APRHLLike1] = ParameterNatSupport6Self.apH1
    override def apH2: HListFunc[HLLike2, APRHLLike2] = ParameterNatSupport6Self.apH2
    override def apH3: HListFunc[HLLike3, APRHLLike3] = ParameterNatSupport6Self.apH3
    override def apH4: HListFunc[HLLike4, APRHLLike4] = ParameterNatSupport6Self.apH4
    override def apH5: HListFunc[HLLike5, APRHLLike5] = ParameterNatSupport6Self.apH5
    override def apH6: HListFunc[HLLike6, APRHLLike6] = ParameterNatSupport6Self.apH6
  }

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
    APRHLLike6,
    HCollection1,
    HCollection2,
    HCollection3,
    HCollection4,
    HCollection5,
    HCollection6
  ]

  def apH1: HListFunc[HLLike1, APRHLLike1]
  def apH2: HListFunc[HLLike2, APRHLLike2]
  def apH3: HListFunc[HLLike3, APRHLLike3]
  def apH4: HListFunc[HLLike4, APRHLLike4]
  def apH5: HListFunc[HLLike5, APRHLLike5]
  def apH6: HListFunc[HLLike6, APRHLLike6]
}
