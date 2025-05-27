package net.scalax.simple.adt
package nat
package support

trait ParameterNatSupport1[M[_], Item1, N1[_], HLLike1, APRHLLike1[T1, _ <: HLLike1] <: HLLike1, HCollection1 <: HLLike1]
    extends AppenderNatSupport2[({ type MU[XU1, XU2] = M[XU1] => M[XU2] })#MU, N1[Item1], N1[
      Item1
    ], HLLike1, HLLike1, APRHLLike1, APRHLLike1, HCollection1, HCollection1] {

  override def append(
    param: M[HCollection1] => M[HCollection1]
  ): M[APRHLLike1[N1[Item1], HCollection1]] => M[APRHLLike1[N1[Item1], HCollection1]]

}

trait ParameterNatSupport2[M[_, _], Item1, Item2, N1[_], N2[_], HLLike1, HLLike2, APRHLLike1[T1, _ <: HLLike1] <: HLLike1, APRHLLike2[
  T2,
  _ <: HLLike2
] <: HLLike2, HCollection1 <: HLLike1, HCollection2 <: HLLike2]
    extends AppenderNatSupport4[
      ({ type MU[XU1, XU2, XU3, XU4] = M[XU1, XU2] => M[XU3, XU4] })#MU,
      N1[Item1],
      N2[Item2],
      N1[Item1],
      N2[Item2],
      HLLike1,
      HLLike2,
      HLLike1,
      HLLike2,
      APRHLLike1,
      APRHLLike2,
      APRHLLike1,
      APRHLLike2,
      HCollection1,
      HCollection2,
      HCollection1,
      HCollection2
    ] {

  override def append(
    param: M[HCollection1, HCollection2] => M[HCollection1, HCollection2]
  ): M[APRHLLike1[N1[Item1], HCollection1], APRHLLike2[N2[Item2], HCollection2]] => M[APRHLLike1[N1[Item1], HCollection1], APRHLLike2[N2[
    Item2
  ], HCollection2]]

}

trait ParameterNatSupport3[
  M[_, _, _],
  Item1,
  Item2,
  Item3,
  N1[_],
  N2[_],
  N3[_],
  HLLike1,
  HLLike2,
  HLLike3,
  APRHLLike1[T1, _ <: HLLike1] <: HLLike1,
  APRHLLike2[T2, _ <: HLLike2] <: HLLike2,
  APRHLLike3[T3, _ <: HLLike3] <: HLLike3,
  HCollection1 <: HLLike1,
  HCollection2 <: HLLike2,
  HCollection3 <: HLLike3
] extends AppenderNatSupport6[
      ({ type MU[XU1, XU2, XU3, XU4, XU5, XU6] = M[XU1, XU2, XU3] => M[XU4, XU5, XU6] })#MU,
      N1[Item1],
      N2[Item2],
      N3[Item3],
      N1[Item1],
      N2[Item2],
      N3[Item3],
      HLLike1,
      HLLike2,
      HLLike3,
      HLLike1,
      HLLike2,
      HLLike3,
      APRHLLike1,
      APRHLLike2,
      APRHLLike3,
      APRHLLike1,
      APRHLLike2,
      APRHLLike3,
      HCollection1,
      HCollection2,
      HCollection3,
      HCollection1,
      HCollection2,
      HCollection3
    ] {

  override def append(
    param: M[HCollection1, HCollection2, HCollection3] => M[HCollection1, HCollection2, HCollection3]
  ): M[APRHLLike1[N1[Item1], HCollection1], APRHLLike2[N2[Item2], HCollection2], APRHLLike3[N3[Item3], HCollection3]] => M[APRHLLike1[N1[
    Item1
  ], HCollection1], APRHLLike2[N2[Item2], HCollection2], APRHLLike3[N3[Item3], HCollection3]]

}

trait ParameterNatSupport4[
  M[_, _, _, _],
  Item1,
  Item2,
  Item3,
  Item4,
  N1[_],
  N2[_],
  N3[_],
  N4[_],
  HLLike1,
  HLLike2,
  HLLike3,
  HLLike4,
  APRHLLike1[T1, _ <: HLLike1] <: HLLike1,
  APRHLLike2[T2, _ <: HLLike2] <: HLLike2,
  APRHLLike3[T3, _ <: HLLike3] <: HLLike3,
  APRHLLike4[T4, _ <: HLLike4] <: HLLike4,
  HCollection1 <: HLLike1,
  HCollection2 <: HLLike2,
  HCollection3 <: HLLike3,
  HCollection4 <: HLLike4
] extends AppenderNatSupport8[
      ({ type MU[XU1, XU2, XU3, XU4, XU5, XU6, XU7, XU8] = M[XU1, XU2, XU3, XU4] => M[XU5, XU6, XU7, XU8] })#MU,
      N1[Item1],
      N2[Item2],
      N3[Item3],
      N4[Item4],
      N1[Item1],
      N2[Item2],
      N3[Item3],
      N4[Item4],
      HLLike1,
      HLLike2,
      HLLike3,
      HLLike4,
      HLLike1,
      HLLike2,
      HLLike3,
      HLLike4,
      APRHLLike1,
      APRHLLike2,
      APRHLLike3,
      APRHLLike4,
      APRHLLike1,
      APRHLLike2,
      APRHLLike3,
      APRHLLike4,
      HCollection1,
      HCollection2,
      HCollection3,
      HCollection4,
      HCollection1,
      HCollection2,
      HCollection3,
      HCollection4
    ] {

  override def append(
    param: M[HCollection1, HCollection2, HCollection3, HCollection4] => M[HCollection1, HCollection2, HCollection3, HCollection4]
  ): M[APRHLLike1[N1[Item1], HCollection1], APRHLLike2[N2[Item2], HCollection2], APRHLLike3[N3[Item3], HCollection3], APRHLLike4[
    N4[Item4],
    HCollection4
  ]] => M[APRHLLike1[N1[Item1], HCollection1], APRHLLike2[N2[Item2], HCollection2], APRHLLike3[N3[Item3], HCollection3], APRHLLike4[N4[
    Item4
  ], HCollection4]]

}

trait ParameterNatSupport5[
  M[_, _, _, _, _],
  Item1,
  Item2,
  Item3,
  Item4,
  Item5,
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
  APRHLLike1[T1, _ <: HLLike1] <: HLLike1,
  APRHLLike2[T2, _ <: HLLike2] <: HLLike2,
  APRHLLike3[T3, _ <: HLLike3] <: HLLike3,
  APRHLLike4[T4, _ <: HLLike4] <: HLLike4,
  APRHLLike5[T5, _ <: HLLike5] <: HLLike5,
  HCollection1 <: HLLike1,
  HCollection2 <: HLLike2,
  HCollection3 <: HLLike3,
  HCollection4 <: HLLike4,
  HCollection5 <: HLLike5
] extends AppenderNatSupport10[
      ({ type MU[XU1, XU2, XU3, XU4, XU5, XU6, XU7, XU8, XU9, XU10] = M[XU1, XU2, XU3, XU4, XU5] => M[XU6, XU7, XU8, XU9, XU10] })#MU,
      N1[Item1],
      N2[Item2],
      N3[Item3],
      N4[Item4],
      N5[Item5],
      N1[Item1],
      N2[Item2],
      N3[Item3],
      N4[Item4],
      N5[Item5],
      HLLike1,
      HLLike2,
      HLLike3,
      HLLike4,
      HLLike5,
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
      APRHLLike1,
      APRHLLike2,
      APRHLLike3,
      APRHLLike4,
      APRHLLike5,
      HCollection1,
      HCollection2,
      HCollection3,
      HCollection4,
      HCollection5,
      HCollection1,
      HCollection2,
      HCollection3,
      HCollection4,
      HCollection5
    ] {

  override def append(
    param: M[HCollection1, HCollection2, HCollection3, HCollection4, HCollection5] => M[
      HCollection1,
      HCollection2,
      HCollection3,
      HCollection4,
      HCollection5
    ]
  ): M[
    APRHLLike1[N1[Item1], HCollection1],
    APRHLLike2[N2[Item2], HCollection2],
    APRHLLike3[N3[Item3], HCollection3],
    APRHLLike4[N4[Item4], HCollection4],
    APRHLLike5[N5[Item5], HCollection5]
  ] => M[
    APRHLLike1[N1[Item1], HCollection1],
    APRHLLike2[N2[Item2], HCollection2],
    APRHLLike3[N3[Item3], HCollection3],
    APRHLLike4[N4[Item4], HCollection4],
    APRHLLike5[N5[Item5], HCollection5]
  ]

}

trait ParameterNatSupport6[
  M[_, _, _, _, _, _],
  Item1,
  Item2,
  Item3,
  Item4,
  Item5,
  Item6,
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
  APRHLLike1[T1, _ <: HLLike1] <: HLLike1,
  APRHLLike2[T2, _ <: HLLike2] <: HLLike2,
  APRHLLike3[T3, _ <: HLLike3] <: HLLike3,
  APRHLLike4[T4, _ <: HLLike4] <: HLLike4,
  APRHLLike5[T5, _ <: HLLike5] <: HLLike5,
  APRHLLike6[T6, _ <: HLLike6] <: HLLike6,
  HCollection1 <: HLLike1,
  HCollection2 <: HLLike2,
  HCollection3 <: HLLike3,
  HCollection4 <: HLLike4,
  HCollection5 <: HLLike5,
  HCollection6 <: HLLike6
] extends AppenderNatSupport12[
      ({
        type MU[XU1, XU2, XU3, XU4, XU5, XU6, XU7, XU8, XU9, XU10, XU11, XU12] =
          M[XU1, XU2, XU3, XU4, XU5, XU6] => M[XU7, XU8, XU9, XU10, XU11, XU12]
      })#MU,
      N1[Item1],
      N2[Item2],
      N3[Item3],
      N4[Item4],
      N5[Item5],
      N6[Item6],
      N1[Item1],
      N2[Item2],
      N3[Item3],
      N4[Item4],
      N5[Item5],
      N6[Item6],
      HLLike1,
      HLLike2,
      HLLike3,
      HLLike4,
      HLLike5,
      HLLike6,
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
      HCollection6,
      HCollection1,
      HCollection2,
      HCollection3,
      HCollection4,
      HCollection5,
      HCollection6
    ] {

  override def append(
    param: M[HCollection1, HCollection2, HCollection3, HCollection4, HCollection5, HCollection6] => M[
      HCollection1,
      HCollection2,
      HCollection3,
      HCollection4,
      HCollection5,
      HCollection6
    ]
  ): M[
    APRHLLike1[N1[Item1], HCollection1],
    APRHLLike2[N2[Item2], HCollection2],
    APRHLLike3[N3[Item3], HCollection3],
    APRHLLike4[N4[Item4], HCollection4],
    APRHLLike5[N5[Item5], HCollection5],
    APRHLLike6[N6[Item6], HCollection6]
  ] => M[
    APRHLLike1[N1[Item1], HCollection1],
    APRHLLike2[N2[Item2], HCollection2],
    APRHLLike3[N3[Item3], HCollection3],
    APRHLLike4[N4[Item4], HCollection4],
    APRHLLike5[N5[Item5], HCollection5],
    APRHLLike6[N6[Item6], HCollection6]
  ]

}
