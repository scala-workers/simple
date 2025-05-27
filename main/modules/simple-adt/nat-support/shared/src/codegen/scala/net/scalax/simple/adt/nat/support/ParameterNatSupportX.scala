package net.scalax.simple.adt
package nat
package support

trait ParameterNatSupport1[
  M[_],
  Item1,
  N1[_],
  HLLike,
  APRHLLike[_, _ <: HLLike] <: HLLike,
  HCollection1 <: HLLike
] extends AppenderNatSupport2[({ type MU[XU1, XU2] = M[XU1] => M[XU2] })#MU, N1[Item1], N1[
      Item1
    ], HLLike, HLLike, APRHLLike, APRHLLike, HCollection1, HCollection1] {

  override def append(
    param: M[HCollection1] => M[HCollection1]
  ): M[APRHLLike[N1[Item1], HCollection1]] => M[APRHLLike[N1[Item1], HCollection1]]

}

trait ParameterNatSupport2[
  M[_, _],
  Item1,
  Item2,
  N1[_],
  N2[_],
  HLLike,
  APRHLLike[_, _ <: HLLike] <: HLLike,
  HCollection1 <: HLLike,
  HCollection2 <: HLLike
] extends AppenderNatSupport4[
      ({ type MU[XU1, XU2, XU3, XU4] = M[XU1, XU2] => M[XU3, XU4] })#MU,
      N1[Item1],
      N2[Item2],
      N1[Item1],
      N2[Item2],
      HLLike,
      HLLike,
      HLLike,
      HLLike,
      APRHLLike,
      APRHLLike,
      APRHLLike,
      APRHLLike,
      HCollection1,
      HCollection2,
      HCollection1,
      HCollection2
    ] {

  override def append(
    param: M[HCollection1, HCollection2] => M[HCollection1, HCollection2]
  ): M[APRHLLike[N1[Item1], HCollection1], APRHLLike[N2[Item2], HCollection2]] => M[APRHLLike[N1[Item1], HCollection1], APRHLLike[N2[
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
  HLLike,
  APRHLLike[_, _ <: HLLike] <: HLLike,
  HCollection1 <: HLLike,
  HCollection2 <: HLLike,
  HCollection3 <: HLLike
] extends AppenderNatSupport6[
      ({ type MU[XU1, XU2, XU3, XU4, XU5, XU6] = M[XU1, XU2, XU3] => M[XU4, XU5, XU6] })#MU,
      N1[Item1],
      N2[Item2],
      N3[Item3],
      N1[Item1],
      N2[Item2],
      N3[Item3],
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
      HCollection1,
      HCollection2,
      HCollection3,
      HCollection1,
      HCollection2,
      HCollection3
    ] {

  override def append(
    param: M[HCollection1, HCollection2, HCollection3] => M[HCollection1, HCollection2, HCollection3]
  ): M[APRHLLike[N1[Item1], HCollection1], APRHLLike[N2[Item2], HCollection2], APRHLLike[N3[Item3], HCollection3]] => M[APRHLLike[N1[
    Item1
  ], HCollection1], APRHLLike[N2[Item2], HCollection2], APRHLLike[N3[Item3], HCollection3]]

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
  HLLike,
  APRHLLike[_, _ <: HLLike] <: HLLike,
  HCollection1 <: HLLike,
  HCollection2 <: HLLike,
  HCollection3 <: HLLike,
  HCollection4 <: HLLike
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
  ): M[APRHLLike[N1[Item1], HCollection1], APRHLLike[N2[Item2], HCollection2], APRHLLike[N3[Item3], HCollection3], APRHLLike[
    N4[Item4],
    HCollection4
  ]] => M[APRHLLike[N1[Item1], HCollection1], APRHLLike[N2[Item2], HCollection2], APRHLLike[N3[Item3], HCollection3], APRHLLike[N4[
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
  HLLike,
  APRHLLike[_, _ <: HLLike] <: HLLike,
  HCollection1 <: HLLike,
  HCollection2 <: HLLike,
  HCollection3 <: HLLike,
  HCollection4 <: HLLike,
  HCollection5 <: HLLike
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
      APRHLLike,
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
    APRHLLike[N1[Item1], HCollection1],
    APRHLLike[N2[Item2], HCollection2],
    APRHLLike[N3[Item3], HCollection3],
    APRHLLike[N4[Item4], HCollection4],
    APRHLLike[N5[Item5], HCollection5]
  ] => M[
    APRHLLike[N1[Item1], HCollection1],
    APRHLLike[N2[Item2], HCollection2],
    APRHLLike[N3[Item3], HCollection3],
    APRHLLike[N4[Item4], HCollection4],
    APRHLLike[N5[Item5], HCollection5]
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
  HLLike,
  APRHLLike[_, _ <: HLLike] <: HLLike,
  HCollection1 <: HLLike,
  HCollection2 <: HLLike,
  HCollection3 <: HLLike,
  HCollection4 <: HLLike,
  HCollection5 <: HLLike,
  HCollection6 <: HLLike
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
      APRHLLike,
      APRHLLike,
      APRHLLike,
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
    APRHLLike[N1[Item1], HCollection1],
    APRHLLike[N2[Item2], HCollection2],
    APRHLLike[N3[Item3], HCollection3],
    APRHLLike[N4[Item4], HCollection4],
    APRHLLike[N5[Item5], HCollection5],
    APRHLLike[N6[Item6], HCollection6]
  ] => M[
    APRHLLike[N1[Item1], HCollection1],
    APRHLLike[N2[Item2], HCollection2],
    APRHLLike[N3[Item3], HCollection3],
    APRHLLike[N4[Item4], HCollection4],
    APRHLLike[N5[Item5], HCollection5],
    APRHLLike[N6[Item6], HCollection6]
  ]

}
