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

  override final def content: AppenderNatSupport1[M, HLLike1, APRHLLike1] =
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

  def simpleAppender: SimpleAppender1Positive[M]

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

  override final def content: AppenderNatSupport2[M, HLLike1, HLLike2, APRHLLike1, APRHLLike2] =
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

  def simpleAppender: SimpleAppender2Positive[M]

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

  override final def content: AppenderNatSupport3[M, HLLike1, HLLike2, HLLike3, APRHLLike1, APRHLLike2, APRHLLike3] =
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

  def simpleAppender: SimpleAppender3Positive[M]

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

  override final def content: AppenderNatSupport4[M, HLLike1, HLLike2, HLLike3, HLLike4, APRHLLike1, APRHLLike2, APRHLLike3, APRHLLike4] =
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

  def simpleAppender: SimpleAppender4Positive[M]

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

  override final def content
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

  def simpleAppender: SimpleAppender5Positive[M]

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

  override final def content: AppenderNatSupport6[
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

  def simpleAppender: SimpleAppender6Positive[M]

  override def typeGen: TypeGen6[M, N1, N2, N3, N4, N5, N6]

  def apH1: HListFunc[HLLike1, APRHLLike1]
  def apH2: HListFunc[HLLike2, APRHLLike2]
  def apH3: HListFunc[HLLike3, APRHLLike3]
  def apH4: HListFunc[HLLike4, APRHLLike4]
  def apH5: HListFunc[HLLike5, APRHLLike5]
  def apH6: HListFunc[HLLike6, APRHLLike6]
}

trait ParameterSimpleSupport7[
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
] extends ParameterNatSupport7[
      M,
      N1,
      N2,
      N3,
      N4,
      N5,
      N6,
      N7,
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
  ParameterSimpleSupport7Self =>

  override final def content: AppenderNatSupport7[
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
  ] =
    new AppenderNatSupport7[
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
    ] {
      override def append[
        I1,
        I2,
        I3,
        I4,
        I5,
        I6,
        I7,
        H1 <: HLLike1,
        H2 <: HLLike2,
        H3 <: HLLike3,
        H4 <: HLLike4,
        H5 <: HLLike5,
        H6 <: HLLike6,
        H7 <: HLLike7
      ](p1: M[I1, I2, I3, I4, I5, I6, I7], p2: M[H1, H2, H3, H4, H5, H6, H7]): M[APRHLLike1[I1, H1], APRHLLike2[I2, H2], APRHLLike3[
        I3,
        H3
      ], APRHLLike4[I4, H4], APRHLLike5[I5, H5], APRHLLike6[I6, H6], APRHLLike7[I7, H7]] =
        ParameterSimpleSupport7Self.simpleAppender.append(
          new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
            override def takeHead(m: APRHLLike1[I1, H1]): I1      = ParameterSimpleSupport7Self.apH1.takeHead(m)
            override def takeTail(m: APRHLLike1[I1, H1]): H1      = ParameterSimpleSupport7Self.apH1.takeTail(m)
            override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport7Self.apH1.append(h, t)
          },
          new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
            override def takeHead(m: APRHLLike2[I2, H2]): I2      = ParameterSimpleSupport7Self.apH2.takeHead(m)
            override def takeTail(m: APRHLLike2[I2, H2]): H2      = ParameterSimpleSupport7Self.apH2.takeTail(m)
            override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport7Self.apH2.append(h, t)
          },
          new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
            override def takeHead(m: APRHLLike3[I3, H3]): I3      = ParameterSimpleSupport7Self.apH3.takeHead(m)
            override def takeTail(m: APRHLLike3[I3, H3]): H3      = ParameterSimpleSupport7Self.apH3.takeTail(m)
            override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport7Self.apH3.append(h, t)
          },
          new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
            override def takeHead(m: APRHLLike4[I4, H4]): I4      = ParameterSimpleSupport7Self.apH4.takeHead(m)
            override def takeTail(m: APRHLLike4[I4, H4]): H4      = ParameterSimpleSupport7Self.apH4.takeTail(m)
            override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport7Self.apH4.append(h, t)
          },
          new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
            override def takeHead(m: APRHLLike5[I5, H5]): I5      = ParameterSimpleSupport7Self.apH5.takeHead(m)
            override def takeTail(m: APRHLLike5[I5, H5]): H5      = ParameterSimpleSupport7Self.apH5.takeTail(m)
            override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport7Self.apH5.append(h, t)
          },
          new ABCFunc[I6, H6, APRHLLike6[I6, H6]] {
            override def takeHead(m: APRHLLike6[I6, H6]): I6      = ParameterSimpleSupport7Self.apH6.takeHead(m)
            override def takeTail(m: APRHLLike6[I6, H6]): H6      = ParameterSimpleSupport7Self.apH6.takeTail(m)
            override def append(h: I6, t: H6): APRHLLike6[I6, H6] = ParameterSimpleSupport7Self.apH6.append(h, t)
          },
          new ABCFunc[I7, H7, APRHLLike7[I7, H7]] {
            override def takeHead(m: APRHLLike7[I7, H7]): I7      = ParameterSimpleSupport7Self.apH7.takeHead(m)
            override def takeTail(m: APRHLLike7[I7, H7]): H7      = ParameterSimpleSupport7Self.apH7.takeTail(m)
            override def append(h: I7, t: H7): APRHLLike7[I7, H7] = ParameterSimpleSupport7Self.apH7.append(h, t)
          }
        )(p1, p2)
    }

  def simpleAppender: SimpleAppender7Positive[M]

  override def typeGen: TypeGen7[M, N1, N2, N3, N4, N5, N6, N7]

  def apH1: HListFunc[HLLike1, APRHLLike1]
  def apH2: HListFunc[HLLike2, APRHLLike2]
  def apH3: HListFunc[HLLike3, APRHLLike3]
  def apH4: HListFunc[HLLike4, APRHLLike4]
  def apH5: HListFunc[HLLike5, APRHLLike5]
  def apH6: HListFunc[HLLike6, APRHLLike6]
  def apH7: HListFunc[HLLike7, APRHLLike7]
}

trait ParameterSimpleSupport8[
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
] extends ParameterNatSupport8[
      M,
      N1,
      N2,
      N3,
      N4,
      N5,
      N6,
      N7,
      N8,
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
  ParameterSimpleSupport8Self =>

  override final def content: AppenderNatSupport8[
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
  ] =
    new AppenderNatSupport8[
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
    ] {
      override def append[
        I1,
        I2,
        I3,
        I4,
        I5,
        I6,
        I7,
        I8,
        H1 <: HLLike1,
        H2 <: HLLike2,
        H3 <: HLLike3,
        H4 <: HLLike4,
        H5 <: HLLike5,
        H6 <: HLLike6,
        H7 <: HLLike7,
        H8 <: HLLike8
      ](p1: M[I1, I2, I3, I4, I5, I6, I7, I8], p2: M[H1, H2, H3, H4, H5, H6, H7, H8]): M[APRHLLike1[I1, H1], APRHLLike2[I2, H2], APRHLLike3[
        I3,
        H3
      ], APRHLLike4[I4, H4], APRHLLike5[I5, H5], APRHLLike6[I6, H6], APRHLLike7[I7, H7], APRHLLike8[I8, H8]] =
        ParameterSimpleSupport8Self.simpleAppender.append(
          new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
            override def takeHead(m: APRHLLike1[I1, H1]): I1      = ParameterSimpleSupport8Self.apH1.takeHead(m)
            override def takeTail(m: APRHLLike1[I1, H1]): H1      = ParameterSimpleSupport8Self.apH1.takeTail(m)
            override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport8Self.apH1.append(h, t)
          },
          new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
            override def takeHead(m: APRHLLike2[I2, H2]): I2      = ParameterSimpleSupport8Self.apH2.takeHead(m)
            override def takeTail(m: APRHLLike2[I2, H2]): H2      = ParameterSimpleSupport8Self.apH2.takeTail(m)
            override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport8Self.apH2.append(h, t)
          },
          new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
            override def takeHead(m: APRHLLike3[I3, H3]): I3      = ParameterSimpleSupport8Self.apH3.takeHead(m)
            override def takeTail(m: APRHLLike3[I3, H3]): H3      = ParameterSimpleSupport8Self.apH3.takeTail(m)
            override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport8Self.apH3.append(h, t)
          },
          new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
            override def takeHead(m: APRHLLike4[I4, H4]): I4      = ParameterSimpleSupport8Self.apH4.takeHead(m)
            override def takeTail(m: APRHLLike4[I4, H4]): H4      = ParameterSimpleSupport8Self.apH4.takeTail(m)
            override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport8Self.apH4.append(h, t)
          },
          new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
            override def takeHead(m: APRHLLike5[I5, H5]): I5      = ParameterSimpleSupport8Self.apH5.takeHead(m)
            override def takeTail(m: APRHLLike5[I5, H5]): H5      = ParameterSimpleSupport8Self.apH5.takeTail(m)
            override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport8Self.apH5.append(h, t)
          },
          new ABCFunc[I6, H6, APRHLLike6[I6, H6]] {
            override def takeHead(m: APRHLLike6[I6, H6]): I6      = ParameterSimpleSupport8Self.apH6.takeHead(m)
            override def takeTail(m: APRHLLike6[I6, H6]): H6      = ParameterSimpleSupport8Self.apH6.takeTail(m)
            override def append(h: I6, t: H6): APRHLLike6[I6, H6] = ParameterSimpleSupport8Self.apH6.append(h, t)
          },
          new ABCFunc[I7, H7, APRHLLike7[I7, H7]] {
            override def takeHead(m: APRHLLike7[I7, H7]): I7      = ParameterSimpleSupport8Self.apH7.takeHead(m)
            override def takeTail(m: APRHLLike7[I7, H7]): H7      = ParameterSimpleSupport8Self.apH7.takeTail(m)
            override def append(h: I7, t: H7): APRHLLike7[I7, H7] = ParameterSimpleSupport8Self.apH7.append(h, t)
          },
          new ABCFunc[I8, H8, APRHLLike8[I8, H8]] {
            override def takeHead(m: APRHLLike8[I8, H8]): I8      = ParameterSimpleSupport8Self.apH8.takeHead(m)
            override def takeTail(m: APRHLLike8[I8, H8]): H8      = ParameterSimpleSupport8Self.apH8.takeTail(m)
            override def append(h: I8, t: H8): APRHLLike8[I8, H8] = ParameterSimpleSupport8Self.apH8.append(h, t)
          }
        )(p1, p2)
    }

  def simpleAppender: SimpleAppender8Positive[M]

  override def typeGen: TypeGen8[M, N1, N2, N3, N4, N5, N6, N7, N8]

  def apH1: HListFunc[HLLike1, APRHLLike1]
  def apH2: HListFunc[HLLike2, APRHLLike2]
  def apH3: HListFunc[HLLike3, APRHLLike3]
  def apH4: HListFunc[HLLike4, APRHLLike4]
  def apH5: HListFunc[HLLike5, APRHLLike5]
  def apH6: HListFunc[HLLike6, APRHLLike6]
  def apH7: HListFunc[HLLike7, APRHLLike7]
  def apH8: HListFunc[HLLike8, APRHLLike8]
}

trait ParameterSimpleSupport9[
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
] extends ParameterNatSupport9[
      M,
      N1,
      N2,
      N3,
      N4,
      N5,
      N6,
      N7,
      N8,
      N9,
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
  ParameterSimpleSupport9Self =>

  override final def content: AppenderNatSupport9[
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
  ] =
    new AppenderNatSupport9[
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
    ] {
      override def append[
        I1,
        I2,
        I3,
        I4,
        I5,
        I6,
        I7,
        I8,
        I9,
        H1 <: HLLike1,
        H2 <: HLLike2,
        H3 <: HLLike3,
        H4 <: HLLike4,
        H5 <: HLLike5,
        H6 <: HLLike6,
        H7 <: HLLike7,
        H8 <: HLLike8,
        H9 <: HLLike9
      ](p1: M[I1, I2, I3, I4, I5, I6, I7, I8, I9], p2: M[H1, H2, H3, H4, H5, H6, H7, H8, H9]): M[
        APRHLLike1[I1, H1],
        APRHLLike2[I2, H2],
        APRHLLike3[I3, H3],
        APRHLLike4[I4, H4],
        APRHLLike5[I5, H5],
        APRHLLike6[I6, H6],
        APRHLLike7[I7, H7],
        APRHLLike8[I8, H8],
        APRHLLike9[I9, H9]
      ] = ParameterSimpleSupport9Self.simpleAppender.append(
        new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
          override def takeHead(m: APRHLLike1[I1, H1]): I1      = ParameterSimpleSupport9Self.apH1.takeHead(m)
          override def takeTail(m: APRHLLike1[I1, H1]): H1      = ParameterSimpleSupport9Self.apH1.takeTail(m)
          override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport9Self.apH1.append(h, t)
        },
        new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
          override def takeHead(m: APRHLLike2[I2, H2]): I2      = ParameterSimpleSupport9Self.apH2.takeHead(m)
          override def takeTail(m: APRHLLike2[I2, H2]): H2      = ParameterSimpleSupport9Self.apH2.takeTail(m)
          override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport9Self.apH2.append(h, t)
        },
        new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
          override def takeHead(m: APRHLLike3[I3, H3]): I3      = ParameterSimpleSupport9Self.apH3.takeHead(m)
          override def takeTail(m: APRHLLike3[I3, H3]): H3      = ParameterSimpleSupport9Self.apH3.takeTail(m)
          override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport9Self.apH3.append(h, t)
        },
        new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
          override def takeHead(m: APRHLLike4[I4, H4]): I4      = ParameterSimpleSupport9Self.apH4.takeHead(m)
          override def takeTail(m: APRHLLike4[I4, H4]): H4      = ParameterSimpleSupport9Self.apH4.takeTail(m)
          override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport9Self.apH4.append(h, t)
        },
        new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
          override def takeHead(m: APRHLLike5[I5, H5]): I5      = ParameterSimpleSupport9Self.apH5.takeHead(m)
          override def takeTail(m: APRHLLike5[I5, H5]): H5      = ParameterSimpleSupport9Self.apH5.takeTail(m)
          override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport9Self.apH5.append(h, t)
        },
        new ABCFunc[I6, H6, APRHLLike6[I6, H6]] {
          override def takeHead(m: APRHLLike6[I6, H6]): I6      = ParameterSimpleSupport9Self.apH6.takeHead(m)
          override def takeTail(m: APRHLLike6[I6, H6]): H6      = ParameterSimpleSupport9Self.apH6.takeTail(m)
          override def append(h: I6, t: H6): APRHLLike6[I6, H6] = ParameterSimpleSupport9Self.apH6.append(h, t)
        },
        new ABCFunc[I7, H7, APRHLLike7[I7, H7]] {
          override def takeHead(m: APRHLLike7[I7, H7]): I7      = ParameterSimpleSupport9Self.apH7.takeHead(m)
          override def takeTail(m: APRHLLike7[I7, H7]): H7      = ParameterSimpleSupport9Self.apH7.takeTail(m)
          override def append(h: I7, t: H7): APRHLLike7[I7, H7] = ParameterSimpleSupport9Self.apH7.append(h, t)
        },
        new ABCFunc[I8, H8, APRHLLike8[I8, H8]] {
          override def takeHead(m: APRHLLike8[I8, H8]): I8      = ParameterSimpleSupport9Self.apH8.takeHead(m)
          override def takeTail(m: APRHLLike8[I8, H8]): H8      = ParameterSimpleSupport9Self.apH8.takeTail(m)
          override def append(h: I8, t: H8): APRHLLike8[I8, H8] = ParameterSimpleSupport9Self.apH8.append(h, t)
        },
        new ABCFunc[I9, H9, APRHLLike9[I9, H9]] {
          override def takeHead(m: APRHLLike9[I9, H9]): I9      = ParameterSimpleSupport9Self.apH9.takeHead(m)
          override def takeTail(m: APRHLLike9[I9, H9]): H9      = ParameterSimpleSupport9Self.apH9.takeTail(m)
          override def append(h: I9, t: H9): APRHLLike9[I9, H9] = ParameterSimpleSupport9Self.apH9.append(h, t)
        }
      )(p1, p2)
    }

  def simpleAppender: SimpleAppender9Positive[M]

  override def typeGen: TypeGen9[M, N1, N2, N3, N4, N5, N6, N7, N8, N9]

  def apH1: HListFunc[HLLike1, APRHLLike1]
  def apH2: HListFunc[HLLike2, APRHLLike2]
  def apH3: HListFunc[HLLike3, APRHLLike3]
  def apH4: HListFunc[HLLike4, APRHLLike4]
  def apH5: HListFunc[HLLike5, APRHLLike5]
  def apH6: HListFunc[HLLike6, APRHLLike6]
  def apH7: HListFunc[HLLike7, APRHLLike7]
  def apH8: HListFunc[HLLike8, APRHLLike8]
  def apH9: HListFunc[HLLike9, APRHLLike9]
}

trait ParameterSimpleSupport10[
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
] extends ParameterNatSupport10[
      M,
      N1,
      N2,
      N3,
      N4,
      N5,
      N6,
      N7,
      N8,
      N9,
      N10,
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
  ParameterSimpleSupport10Self =>

  override final def content: AppenderNatSupport10[
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
  ] =
    new AppenderNatSupport10[
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
    ] {
      override def append[
        I1,
        I2,
        I3,
        I4,
        I5,
        I6,
        I7,
        I8,
        I9,
        I10,
        H1 <: HLLike1,
        H2 <: HLLike2,
        H3 <: HLLike3,
        H4 <: HLLike4,
        H5 <: HLLike5,
        H6 <: HLLike6,
        H7 <: HLLike7,
        H8 <: HLLike8,
        H9 <: HLLike9,
        H10 <: HLLike10
      ](p1: M[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10], p2: M[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10]): M[
        APRHLLike1[I1, H1],
        APRHLLike2[I2, H2],
        APRHLLike3[I3, H3],
        APRHLLike4[I4, H4],
        APRHLLike5[I5, H5],
        APRHLLike6[I6, H6],
        APRHLLike7[I7, H7],
        APRHLLike8[I8, H8],
        APRHLLike9[I9, H9],
        APRHLLike10[I10, H10]
      ] = ParameterSimpleSupport10Self.simpleAppender.append(
        new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
          override def takeHead(m: APRHLLike1[I1, H1]): I1      = ParameterSimpleSupport10Self.apH1.takeHead(m)
          override def takeTail(m: APRHLLike1[I1, H1]): H1      = ParameterSimpleSupport10Self.apH1.takeTail(m)
          override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport10Self.apH1.append(h, t)
        },
        new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
          override def takeHead(m: APRHLLike2[I2, H2]): I2      = ParameterSimpleSupport10Self.apH2.takeHead(m)
          override def takeTail(m: APRHLLike2[I2, H2]): H2      = ParameterSimpleSupport10Self.apH2.takeTail(m)
          override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport10Self.apH2.append(h, t)
        },
        new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
          override def takeHead(m: APRHLLike3[I3, H3]): I3      = ParameterSimpleSupport10Self.apH3.takeHead(m)
          override def takeTail(m: APRHLLike3[I3, H3]): H3      = ParameterSimpleSupport10Self.apH3.takeTail(m)
          override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport10Self.apH3.append(h, t)
        },
        new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
          override def takeHead(m: APRHLLike4[I4, H4]): I4      = ParameterSimpleSupport10Self.apH4.takeHead(m)
          override def takeTail(m: APRHLLike4[I4, H4]): H4      = ParameterSimpleSupport10Self.apH4.takeTail(m)
          override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport10Self.apH4.append(h, t)
        },
        new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
          override def takeHead(m: APRHLLike5[I5, H5]): I5      = ParameterSimpleSupport10Self.apH5.takeHead(m)
          override def takeTail(m: APRHLLike5[I5, H5]): H5      = ParameterSimpleSupport10Self.apH5.takeTail(m)
          override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport10Self.apH5.append(h, t)
        },
        new ABCFunc[I6, H6, APRHLLike6[I6, H6]] {
          override def takeHead(m: APRHLLike6[I6, H6]): I6      = ParameterSimpleSupport10Self.apH6.takeHead(m)
          override def takeTail(m: APRHLLike6[I6, H6]): H6      = ParameterSimpleSupport10Self.apH6.takeTail(m)
          override def append(h: I6, t: H6): APRHLLike6[I6, H6] = ParameterSimpleSupport10Self.apH6.append(h, t)
        },
        new ABCFunc[I7, H7, APRHLLike7[I7, H7]] {
          override def takeHead(m: APRHLLike7[I7, H7]): I7      = ParameterSimpleSupport10Self.apH7.takeHead(m)
          override def takeTail(m: APRHLLike7[I7, H7]): H7      = ParameterSimpleSupport10Self.apH7.takeTail(m)
          override def append(h: I7, t: H7): APRHLLike7[I7, H7] = ParameterSimpleSupport10Self.apH7.append(h, t)
        },
        new ABCFunc[I8, H8, APRHLLike8[I8, H8]] {
          override def takeHead(m: APRHLLike8[I8, H8]): I8      = ParameterSimpleSupport10Self.apH8.takeHead(m)
          override def takeTail(m: APRHLLike8[I8, H8]): H8      = ParameterSimpleSupport10Self.apH8.takeTail(m)
          override def append(h: I8, t: H8): APRHLLike8[I8, H8] = ParameterSimpleSupport10Self.apH8.append(h, t)
        },
        new ABCFunc[I9, H9, APRHLLike9[I9, H9]] {
          override def takeHead(m: APRHLLike9[I9, H9]): I9      = ParameterSimpleSupport10Self.apH9.takeHead(m)
          override def takeTail(m: APRHLLike9[I9, H9]): H9      = ParameterSimpleSupport10Self.apH9.takeTail(m)
          override def append(h: I9, t: H9): APRHLLike9[I9, H9] = ParameterSimpleSupport10Self.apH9.append(h, t)
        },
        new ABCFunc[I10, H10, APRHLLike10[I10, H10]] {
          override def takeHead(m: APRHLLike10[I10, H10]): I10       = ParameterSimpleSupport10Self.apH10.takeHead(m)
          override def takeTail(m: APRHLLike10[I10, H10]): H10       = ParameterSimpleSupport10Self.apH10.takeTail(m)
          override def append(h: I10, t: H10): APRHLLike10[I10, H10] = ParameterSimpleSupport10Self.apH10.append(h, t)
        }
      )(p1, p2)
    }

  def simpleAppender: SimpleAppender10Positive[M]

  override def typeGen: TypeGen10[M, N1, N2, N3, N4, N5, N6, N7, N8, N9, N10]

  def apH1: HListFunc[HLLike1, APRHLLike1]
  def apH2: HListFunc[HLLike2, APRHLLike2]
  def apH3: HListFunc[HLLike3, APRHLLike3]
  def apH4: HListFunc[HLLike4, APRHLLike4]
  def apH5: HListFunc[HLLike5, APRHLLike5]
  def apH6: HListFunc[HLLike6, APRHLLike6]
  def apH7: HListFunc[HLLike7, APRHLLike7]
  def apH8: HListFunc[HLLike8, APRHLLike8]
  def apH9: HListFunc[HLLike9, APRHLLike9]
  def apH10: HListFunc[HLLike10, APRHLLike10]
}
