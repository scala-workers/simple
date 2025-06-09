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

  override def typeGen: TypeGen1[M, N1]

  override def simpleAppender: SimpleAppender1Positive[M]
  def apH: HListFunc[HLLike, APRHLLike]

  override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport1Self.apH
}

trait ParameterSingleNatSupport2[
  M[_, _],
  N1[_],
  N2[_],
  HLLike,
  APRHLLike[_, _ <: HLLike] <: HLLike
] extends ParameterSimpleSupport2[M, N1, N2, HLLike, HLLike, APRHLLike, APRHLLike] {
  ParameterNatSupport2Self =>

  override def typeGen: TypeGen2[M, N1, N2]

  override def simpleAppender: SimpleAppender2Positive[M]
  def apH: HListFunc[HLLike, APRHLLike]

  override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport2Self.apH
  override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport2Self.apH
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

  override def typeGen: TypeGen3[M, N1, N2, N3]

  override def simpleAppender: SimpleAppender3Positive[M]
  def apH: HListFunc[HLLike, APRHLLike]

  override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport3Self.apH
  override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport3Self.apH
  override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport3Self.apH
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

  override def typeGen: TypeGen4[M, N1, N2, N3, N4]

  override def simpleAppender: SimpleAppender4Positive[M]
  def apH: HListFunc[HLLike, APRHLLike]

  override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport4Self.apH
  override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport4Self.apH
  override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport4Self.apH
  override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport4Self.apH
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

  override def typeGen: TypeGen5[M, N1, N2, N3, N4, N5]

  override def simpleAppender: SimpleAppender5Positive[M]
  def apH: HListFunc[HLLike, APRHLLike]

  override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport5Self.apH
  override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport5Self.apH
  override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport5Self.apH
  override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport5Self.apH
  override final def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport5Self.apH
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

  override def typeGen: TypeGen6[M, N1, N2, N3, N4, N5, N6]

  override def simpleAppender: SimpleAppender6Positive[M]
  def apH: HListFunc[HLLike, APRHLLike]

  override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport6Self.apH
  override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport6Self.apH
  override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport6Self.apH
  override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport6Self.apH
  override final def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport6Self.apH
  override final def apH6: HListFunc[HLLike, APRHLLike] = ParameterNatSupport6Self.apH
}

trait ParameterSingleNatSupport7[
  M[_, _, _, _, _, _, _],
  N1[_],
  N2[_],
  N3[_],
  N4[_],
  N5[_],
  N6[_],
  N7[_],
  HLLike,
  APRHLLike[_, _ <: HLLike] <: HLLike
] extends ParameterSimpleSupport7[
      M,
      N1,
      N2,
      N3,
      N4,
      N5,
      N6,
      N7,
      HLLike,
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
      APRHLLike,
      APRHLLike
    ] {
  ParameterNatSupport7Self =>

  override def typeGen: TypeGen7[M, N1, N2, N3, N4, N5, N6, N7]

  override def simpleAppender: SimpleAppender7Positive[M]
  def apH: HListFunc[HLLike, APRHLLike]

  override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport7Self.apH
  override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport7Self.apH
  override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport7Self.apH
  override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport7Self.apH
  override final def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport7Self.apH
  override final def apH6: HListFunc[HLLike, APRHLLike] = ParameterNatSupport7Self.apH
  override final def apH7: HListFunc[HLLike, APRHLLike] = ParameterNatSupport7Self.apH
}

trait ParameterSingleNatSupport8[
  M[_, _, _, _, _, _, _, _],
  N1[_],
  N2[_],
  N3[_],
  N4[_],
  N5[_],
  N6[_],
  N7[_],
  N8[_],
  HLLike,
  APRHLLike[_, _ <: HLLike] <: HLLike
] extends ParameterSimpleSupport8[
      M,
      N1,
      N2,
      N3,
      N4,
      N5,
      N6,
      N7,
      N8,
      HLLike,
      HLLike,
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
      APRHLLike,
      APRHLLike,
      APRHLLike
    ] {
  ParameterNatSupport8Self =>

  override def typeGen: TypeGen8[M, N1, N2, N3, N4, N5, N6, N7, N8]

  override def simpleAppender: SimpleAppender8Positive[M]
  def apH: HListFunc[HLLike, APRHLLike]

  override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport8Self.apH
  override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport8Self.apH
  override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport8Self.apH
  override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport8Self.apH
  override final def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport8Self.apH
  override final def apH6: HListFunc[HLLike, APRHLLike] = ParameterNatSupport8Self.apH
  override final def apH7: HListFunc[HLLike, APRHLLike] = ParameterNatSupport8Self.apH
  override final def apH8: HListFunc[HLLike, APRHLLike] = ParameterNatSupport8Self.apH
}

trait ParameterSingleNatSupport9[
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
  HLLike,
  APRHLLike[_, _ <: HLLike] <: HLLike
] extends ParameterSimpleSupport9[
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
      HLLike,
      HLLike,
      HLLike,
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
      APRHLLike,
      APRHLLike,
      APRHLLike,
      APRHLLike
    ] {
  ParameterNatSupport9Self =>

  override def typeGen: TypeGen9[M, N1, N2, N3, N4, N5, N6, N7, N8, N9]

  override def simpleAppender: SimpleAppender9Positive[M]
  def apH: HListFunc[HLLike, APRHLLike]

  override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport9Self.apH
  override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport9Self.apH
  override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport9Self.apH
  override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport9Self.apH
  override final def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport9Self.apH
  override final def apH6: HListFunc[HLLike, APRHLLike] = ParameterNatSupport9Self.apH
  override final def apH7: HListFunc[HLLike, APRHLLike] = ParameterNatSupport9Self.apH
  override final def apH8: HListFunc[HLLike, APRHLLike] = ParameterNatSupport9Self.apH
  override final def apH9: HListFunc[HLLike, APRHLLike] = ParameterNatSupport9Self.apH
}

trait ParameterSingleNatSupport10[
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
  HLLike,
  APRHLLike[_, _ <: HLLike] <: HLLike
] extends ParameterSimpleSupport10[
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
      HLLike,
      HLLike,
      HLLike,
      HLLike,
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
      APRHLLike,
      APRHLLike,
      APRHLLike,
      APRHLLike,
      APRHLLike
    ] {
  ParameterNatSupport10Self =>

  override def typeGen: TypeGen10[M, N1, N2, N3, N4, N5, N6, N7, N8, N9, N10]

  override def simpleAppender: SimpleAppender10Positive[M]
  def apH: HListFunc[HLLike, APRHLLike]

  override final def apH1: HListFunc[HLLike, APRHLLike]  = ParameterNatSupport10Self.apH
  override final def apH2: HListFunc[HLLike, APRHLLike]  = ParameterNatSupport10Self.apH
  override final def apH3: HListFunc[HLLike, APRHLLike]  = ParameterNatSupport10Self.apH
  override final def apH4: HListFunc[HLLike, APRHLLike]  = ParameterNatSupport10Self.apH
  override final def apH5: HListFunc[HLLike, APRHLLike]  = ParameterNatSupport10Self.apH
  override final def apH6: HListFunc[HLLike, APRHLLike]  = ParameterNatSupport10Self.apH
  override final def apH7: HListFunc[HLLike, APRHLLike]  = ParameterNatSupport10Self.apH
  override final def apH8: HListFunc[HLLike, APRHLLike]  = ParameterNatSupport10Self.apH
  override final def apH9: HListFunc[HLLike, APRHLLike]  = ParameterNatSupport10Self.apH
  override final def apH10: HListFunc[HLLike, APRHLLike] = ParameterNatSupport10Self.apH
}
