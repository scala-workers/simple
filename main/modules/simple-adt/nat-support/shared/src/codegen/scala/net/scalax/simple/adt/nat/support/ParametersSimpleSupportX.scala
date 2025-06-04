package net.scalax.simple.adt
package nat
package support

trait ParameterSimpleSupport1[
  M[_],
  N1[_],
  HLLike1,
  APRHLLike1[_, _ <: HLLike1] <: HLLike1
] extends ParameterNatSupport1[M, N1, HLLike1, APRHLLike1] {
  ParameterSimpleSupport1Self =>

  override def append[Item, HCollection1 <: HLLike1](p1: M[HCollection1]): M[APRHLLike1[N1[Item], HCollection1]] = super.append(p1)

  override def content: AppenderNatSupport1[M, HLLike1, APRHLLike1] =
    new AppenderNatSupport1[M, HLLike1, APRHLLike1] {
      override def append[I1, H1 <: HLLike1](p1: M[I1], p2: M[H1]): M[APRHLLike1[I1, H1]] =
        ParameterSimpleSupport1Self.simpleAppender.append(
          new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
            override def takeHead(m: APRHLLike1[I1, H1]): I1      = ParameterSimpleSupport1Self.apH1.takeHead(m)
            override def takeTail(m: APRHLLike1[I1, H1]): H1      = ParameterSimpleSupport1Self.apH1.takeTail(m)
            override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport1Self.apH1.append(h, t)
          }
        )(p1, p2)
    }

  def simpleAppender: SimpleAppender1[M]

  override def typeGen: TypeGen1[M, N1]

  def apH1: HListFunc[HLLike1, APRHLLike1]
}

trait ParameterSimpleSupport2[
  M[_, _],
  N1[_],
  N2[_],
  HLLike1,
  HLLike2,
  APRHLLike1[_, _ <: HLLike1] <: HLLike1,
  APRHLLike2[_, _ <: HLLike2] <: HLLike2
] extends ParameterNatSupport2[M, N1, N2, HLLike1, HLLike2, APRHLLike1, APRHLLike2] {
  ParameterSimpleSupport2Self =>

  override def append[Item, HCollection1 <: HLLike1, HCollection2 <: HLLike2](
    p1: M[HCollection1, HCollection2]
  ): M[APRHLLike1[N1[Item], HCollection1], APRHLLike2[N2[Item], HCollection2]] = super.append(p1)

  override def content: AppenderNatSupport2[M, HLLike1, HLLike2, APRHLLike1, APRHLLike2] =
    new AppenderNatSupport2[M, HLLike1, HLLike2, APRHLLike1, APRHLLike2] {
      override def append[I1, I2, H1 <: HLLike1, H2 <: HLLike2](p1: M[I1, I2], p2: M[H1, H2]): M[APRHLLike1[I1, H1], APRHLLike2[I2, H2]] =
        ParameterSimpleSupport2Self.simpleAppender.append(
          new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
            override def takeHead(m: APRHLLike1[I1, H1]): I1      = ParameterSimpleSupport2Self.apH1.takeHead(m)
            override def takeTail(m: APRHLLike1[I1, H1]): H1      = ParameterSimpleSupport2Self.apH1.takeTail(m)
            override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport2Self.apH1.append(h, t)
          },
          new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
            override def takeHead(m: APRHLLike2[I2, H2]): I2      = ParameterSimpleSupport2Self.apH2.takeHead(m)
            override def takeTail(m: APRHLLike2[I2, H2]): H2      = ParameterSimpleSupport2Self.apH2.takeTail(m)
            override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport2Self.apH2.append(h, t)
          }
        )(p1, p2)
    }

  def simpleAppender: SimpleAppender2[M]

  override def typeGen: TypeGen2[M, N1, N2]

  def apH1: HListFunc[HLLike1, APRHLLike1]
  def apH2: HListFunc[HLLike2, APRHLLike2]
}

trait ParameterSimpleSupport3[
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
] extends ParameterNatSupport3[M, N1, N2, N3, HLLike1, HLLike2, HLLike3, APRHLLike1, APRHLLike2, APRHLLike3] {
  ParameterSimpleSupport3Self =>

  override def append[Item, HCollection1 <: HLLike1, HCollection2 <: HLLike2, HCollection3 <: HLLike3](
    p1: M[HCollection1, HCollection2, HCollection3]
  ): M[APRHLLike1[N1[Item], HCollection1], APRHLLike2[N2[Item], HCollection2], APRHLLike3[N3[Item], HCollection3]] = super.append(p1)

  override def content: AppenderNatSupport3[M, HLLike1, HLLike2, HLLike3, APRHLLike1, APRHLLike2, APRHLLike3] =
    new AppenderNatSupport3[M, HLLike1, HLLike2, HLLike3, APRHLLike1, APRHLLike2, APRHLLike3] {
      override def append[I1, I2, I3, H1 <: HLLike1, H2 <: HLLike2, H3 <: HLLike3](
        p1: M[I1, I2, I3],
        p2: M[H1, H2, H3]
      ): M[APRHLLike1[I1, H1], APRHLLike2[I2, H2], APRHLLike3[I3, H3]] = ParameterSimpleSupport3Self.simpleAppender.append(
        new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
          override def takeHead(m: APRHLLike1[I1, H1]): I1      = ParameterSimpleSupport3Self.apH1.takeHead(m)
          override def takeTail(m: APRHLLike1[I1, H1]): H1      = ParameterSimpleSupport3Self.apH1.takeTail(m)
          override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport3Self.apH1.append(h, t)
        },
        new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
          override def takeHead(m: APRHLLike2[I2, H2]): I2      = ParameterSimpleSupport3Self.apH2.takeHead(m)
          override def takeTail(m: APRHLLike2[I2, H2]): H2      = ParameterSimpleSupport3Self.apH2.takeTail(m)
          override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport3Self.apH2.append(h, t)
        },
        new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
          override def takeHead(m: APRHLLike3[I3, H3]): I3      = ParameterSimpleSupport3Self.apH3.takeHead(m)
          override def takeTail(m: APRHLLike3[I3, H3]): H3      = ParameterSimpleSupport3Self.apH3.takeTail(m)
          override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport3Self.apH3.append(h, t)
        }
      )(p1, p2)
    }

  def simpleAppender: SimpleAppender3[M]

  override def typeGen: TypeGen3[M, N1, N2, N3]

  def apH1: HListFunc[HLLike1, APRHLLike1]
  def apH2: HListFunc[HLLike2, APRHLLike2]
  def apH3: HListFunc[HLLike3, APRHLLike3]
}

trait ParameterSimpleSupport4[
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
] extends ParameterNatSupport4[M, N1, N2, N3, N4, HLLike1, HLLike2, HLLike3, HLLike4, APRHLLike1, APRHLLike2, APRHLLike3, APRHLLike4] {
  ParameterSimpleSupport4Self =>

  override def append[Item, HCollection1 <: HLLike1, HCollection2 <: HLLike2, HCollection3 <: HLLike3, HCollection4 <: HLLike4](
    p1: M[HCollection1, HCollection2, HCollection3, HCollection4]
  ): M[APRHLLike1[N1[Item], HCollection1], APRHLLike2[N2[Item], HCollection2], APRHLLike3[N3[Item], HCollection3], APRHLLike4[N4[
    Item
  ], HCollection4]] = super.append(p1)

  override def content: AppenderNatSupport4[M, HLLike1, HLLike2, HLLike3, HLLike4, APRHLLike1, APRHLLike2, APRHLLike3, APRHLLike4] =
    new AppenderNatSupport4[M, HLLike1, HLLike2, HLLike3, HLLike4, APRHLLike1, APRHLLike2, APRHLLike3, APRHLLike4] {
      override def append[I1, I2, I3, I4, H1 <: HLLike1, H2 <: HLLike2, H3 <: HLLike3, H4 <: HLLike4](
        p1: M[I1, I2, I3, I4],
        p2: M[H1, H2, H3, H4]
      ): M[APRHLLike1[I1, H1], APRHLLike2[I2, H2], APRHLLike3[I3, H3], APRHLLike4[I4, H4]] =
        ParameterSimpleSupport4Self.simpleAppender.append(
          new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
            override def takeHead(m: APRHLLike1[I1, H1]): I1      = ParameterSimpleSupport4Self.apH1.takeHead(m)
            override def takeTail(m: APRHLLike1[I1, H1]): H1      = ParameterSimpleSupport4Self.apH1.takeTail(m)
            override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport4Self.apH1.append(h, t)
          },
          new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
            override def takeHead(m: APRHLLike2[I2, H2]): I2      = ParameterSimpleSupport4Self.apH2.takeHead(m)
            override def takeTail(m: APRHLLike2[I2, H2]): H2      = ParameterSimpleSupport4Self.apH2.takeTail(m)
            override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport4Self.apH2.append(h, t)
          },
          new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
            override def takeHead(m: APRHLLike3[I3, H3]): I3      = ParameterSimpleSupport4Self.apH3.takeHead(m)
            override def takeTail(m: APRHLLike3[I3, H3]): H3      = ParameterSimpleSupport4Self.apH3.takeTail(m)
            override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport4Self.apH3.append(h, t)
          },
          new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
            override def takeHead(m: APRHLLike4[I4, H4]): I4      = ParameterSimpleSupport4Self.apH4.takeHead(m)
            override def takeTail(m: APRHLLike4[I4, H4]): H4      = ParameterSimpleSupport4Self.apH4.takeTail(m)
            override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport4Self.apH4.append(h, t)
          }
        )(p1, p2)
    }

  def simpleAppender: SimpleAppender4[M]

  override def typeGen: TypeGen4[M, N1, N2, N3, N4]

  def apH1: HListFunc[HLLike1, APRHLLike1]
  def apH2: HListFunc[HLLike2, APRHLLike2]
  def apH3: HListFunc[HLLike3, APRHLLike3]
  def apH4: HListFunc[HLLike4, APRHLLike4]
}

trait ParameterSimpleSupport5[
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
] extends ParameterNatSupport5[
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
      APRHLLike5
    ] {
  ParameterSimpleSupport5Self =>

  override def append[
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
  ] = super.append(p1)

  override def content
    : AppenderNatSupport5[M, HLLike1, HLLike2, HLLike3, HLLike4, HLLike5, APRHLLike1, APRHLLike2, APRHLLike3, APRHLLike4, APRHLLike5] =
    new AppenderNatSupport5[M, HLLike1, HLLike2, HLLike3, HLLike4, HLLike5, APRHLLike1, APRHLLike2, APRHLLike3, APRHLLike4, APRHLLike5] {
      override def append[I1, I2, I3, I4, I5, H1 <: HLLike1, H2 <: HLLike2, H3 <: HLLike3, H4 <: HLLike4, H5 <: HLLike5](
        p1: M[I1, I2, I3, I4, I5],
        p2: M[H1, H2, H3, H4, H5]
      ): M[APRHLLike1[I1, H1], APRHLLike2[I2, H2], APRHLLike3[I3, H3], APRHLLike4[I4, H4], APRHLLike5[I5, H5]] =
        ParameterSimpleSupport5Self.simpleAppender.append(
          new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
            override def takeHead(m: APRHLLike1[I1, H1]): I1      = ParameterSimpleSupport5Self.apH1.takeHead(m)
            override def takeTail(m: APRHLLike1[I1, H1]): H1      = ParameterSimpleSupport5Self.apH1.takeTail(m)
            override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport5Self.apH1.append(h, t)
          },
          new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
            override def takeHead(m: APRHLLike2[I2, H2]): I2      = ParameterSimpleSupport5Self.apH2.takeHead(m)
            override def takeTail(m: APRHLLike2[I2, H2]): H2      = ParameterSimpleSupport5Self.apH2.takeTail(m)
            override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport5Self.apH2.append(h, t)
          },
          new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
            override def takeHead(m: APRHLLike3[I3, H3]): I3      = ParameterSimpleSupport5Self.apH3.takeHead(m)
            override def takeTail(m: APRHLLike3[I3, H3]): H3      = ParameterSimpleSupport5Self.apH3.takeTail(m)
            override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport5Self.apH3.append(h, t)
          },
          new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
            override def takeHead(m: APRHLLike4[I4, H4]): I4      = ParameterSimpleSupport5Self.apH4.takeHead(m)
            override def takeTail(m: APRHLLike4[I4, H4]): H4      = ParameterSimpleSupport5Self.apH4.takeTail(m)
            override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport5Self.apH4.append(h, t)
          },
          new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
            override def takeHead(m: APRHLLike5[I5, H5]): I5      = ParameterSimpleSupport5Self.apH5.takeHead(m)
            override def takeTail(m: APRHLLike5[I5, H5]): H5      = ParameterSimpleSupport5Self.apH5.takeTail(m)
            override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport5Self.apH5.append(h, t)
          }
        )(p1, p2)
    }

  def simpleAppender: SimpleAppender5[M]

  override def typeGen: TypeGen5[M, N1, N2, N3, N4, N5]

  def apH1: HListFunc[HLLike1, APRHLLike1]
  def apH2: HListFunc[HLLike2, APRHLLike2]
  def apH3: HListFunc[HLLike3, APRHLLike3]
  def apH4: HListFunc[HLLike4, APRHLLike4]
  def apH5: HListFunc[HLLike5, APRHLLike5]
}

trait ParameterSimpleSupport6[
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
] extends ParameterNatSupport6[
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
      APRHLLike6
    ] {
  ParameterSimpleSupport6Self =>

  override def append[
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
  ] = super.append(p1)

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
  ] =
    new AppenderNatSupport6[
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
    ] {
      override def append[I1, I2, I3, I4, I5, I6, H1 <: HLLike1, H2 <: HLLike2, H3 <: HLLike3, H4 <: HLLike4, H5 <: HLLike5, H6 <: HLLike6](
        p1: M[I1, I2, I3, I4, I5, I6],
        p2: M[H1, H2, H3, H4, H5, H6]
      ): M[APRHLLike1[I1, H1], APRHLLike2[I2, H2], APRHLLike3[I3, H3], APRHLLike4[I4, H4], APRHLLike5[I5, H5], APRHLLike6[I6, H6]] =
        ParameterSimpleSupport6Self.simpleAppender.append(
          new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
            override def takeHead(m: APRHLLike1[I1, H1]): I1      = ParameterSimpleSupport6Self.apH1.takeHead(m)
            override def takeTail(m: APRHLLike1[I1, H1]): H1      = ParameterSimpleSupport6Self.apH1.takeTail(m)
            override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport6Self.apH1.append(h, t)
          },
          new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
            override def takeHead(m: APRHLLike2[I2, H2]): I2      = ParameterSimpleSupport6Self.apH2.takeHead(m)
            override def takeTail(m: APRHLLike2[I2, H2]): H2      = ParameterSimpleSupport6Self.apH2.takeTail(m)
            override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport6Self.apH2.append(h, t)
          },
          new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
            override def takeHead(m: APRHLLike3[I3, H3]): I3      = ParameterSimpleSupport6Self.apH3.takeHead(m)
            override def takeTail(m: APRHLLike3[I3, H3]): H3      = ParameterSimpleSupport6Self.apH3.takeTail(m)
            override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport6Self.apH3.append(h, t)
          },
          new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
            override def takeHead(m: APRHLLike4[I4, H4]): I4      = ParameterSimpleSupport6Self.apH4.takeHead(m)
            override def takeTail(m: APRHLLike4[I4, H4]): H4      = ParameterSimpleSupport6Self.apH4.takeTail(m)
            override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport6Self.apH4.append(h, t)
          },
          new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
            override def takeHead(m: APRHLLike5[I5, H5]): I5      = ParameterSimpleSupport6Self.apH5.takeHead(m)
            override def takeTail(m: APRHLLike5[I5, H5]): H5      = ParameterSimpleSupport6Self.apH5.takeTail(m)
            override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport6Self.apH5.append(h, t)
          },
          new ABCFunc[I6, H6, APRHLLike6[I6, H6]] {
            override def takeHead(m: APRHLLike6[I6, H6]): I6      = ParameterSimpleSupport6Self.apH6.takeHead(m)
            override def takeTail(m: APRHLLike6[I6, H6]): H6      = ParameterSimpleSupport6Self.apH6.takeTail(m)
            override def append(h: I6, t: H6): APRHLLike6[I6, H6] = ParameterSimpleSupport6Self.apH6.append(h, t)
          }
        )(p1, p2)
    }

  def simpleAppender: SimpleAppender6[M]

  override def typeGen: TypeGen6[M, N1, N2, N3, N4, N5, N6]

  def apH1: HListFunc[HLLike1, APRHLLike1]
  def apH2: HListFunc[HLLike2, APRHLLike2]
  def apH3: HListFunc[HLLike3, APRHLLike3]
  def apH4: HListFunc[HLLike4, APRHLLike4]
  def apH5: HListFunc[HLLike5, APRHLLike5]
  def apH6: HListFunc[HLLike6, APRHLLike6]
}
