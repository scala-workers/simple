package net.scalax.simple.adt
package nat
package support

trait AppenderNatSupport1[M[_], T1, HLLike1, APRHLLike1[_, _ <: HLLike1] <: HLLike1, HCollection1 <: HLLike1] {
  def append(param: M[HCollection1]): M[APRHLLike1[T1, HCollection1]]
}
trait AppenderNatSupport2[M[_, _], T1, T2, HLLike1, HLLike2, APRHLLike1[_, _ <: HLLike1] <: HLLike1, APRHLLike2[
  _,
  _ <: HLLike2
] <: HLLike2, HCollection1 <: HLLike1, HCollection2 <: HLLike2] {
  def append(param: M[HCollection1, HCollection2]): M[APRHLLike1[T1, HCollection1], APRHLLike2[T2, HCollection2]]
}
trait AppenderNatSupport3[M[_, _, _], T1, T2, T3, HLLike1, HLLike2, HLLike3, APRHLLike1[_, _ <: HLLike1] <: HLLike1, APRHLLike2[
  _,
  _ <: HLLike2
] <: HLLike2, APRHLLike3[_, _ <: HLLike3] <: HLLike3, HCollection1 <: HLLike1, HCollection2 <: HLLike2, HCollection3 <: HLLike3] {
  def append(
    param: M[HCollection1, HCollection2, HCollection3]
  ): M[APRHLLike1[T1, HCollection1], APRHLLike2[T2, HCollection2], APRHLLike3[T3, HCollection3]]
}
trait AppenderNatSupport4[
  M[_, _, _, _],
  T1,
  T2,
  T3,
  T4,
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
  def append(
    param: M[HCollection1, HCollection2, HCollection3, HCollection4]
  ): M[APRHLLike1[T1, HCollection1], APRHLLike2[T2, HCollection2], APRHLLike3[T3, HCollection3], APRHLLike4[T4, HCollection4]]
}
trait AppenderNatSupport5[
  M[_, _, _, _, _],
  T1,
  T2,
  T3,
  T4,
  T5,
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
  def append(param: M[HCollection1, HCollection2, HCollection3, HCollection4, HCollection5]): M[APRHLLike1[T1, HCollection1], APRHLLike2[
    T2,
    HCollection2
  ], APRHLLike3[T3, HCollection3], APRHLLike4[T4, HCollection4], APRHLLike5[T5, HCollection5]]
}
trait AppenderNatSupport6[
  M[_, _, _, _, _, _],
  T1,
  T2,
  T3,
  T4,
  T5,
  T6,
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
  def append(param: M[HCollection1, HCollection2, HCollection3, HCollection4, HCollection5, HCollection6]): M[
    APRHLLike1[T1, HCollection1],
    APRHLLike2[T2, HCollection2],
    APRHLLike3[T3, HCollection3],
    APRHLLike4[T4, HCollection4],
    APRHLLike5[T5, HCollection5],
    APRHLLike6[T6, HCollection6]
  ]
}
trait AppenderNatSupport7[
  M[_, _, _, _, _, _, _],
  T1,
  T2,
  T3,
  T4,
  T5,
  T6,
  T7,
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
  APRHLLike7[_, _ <: HLLike7] <: HLLike7,
  HCollection1 <: HLLike1,
  HCollection2 <: HLLike2,
  HCollection3 <: HLLike3,
  HCollection4 <: HLLike4,
  HCollection5 <: HLLike5,
  HCollection6 <: HLLike6,
  HCollection7 <: HLLike7
] {
  def append(param: M[HCollection1, HCollection2, HCollection3, HCollection4, HCollection5, HCollection6, HCollection7]): M[
    APRHLLike1[T1, HCollection1],
    APRHLLike2[T2, HCollection2],
    APRHLLike3[T3, HCollection3],
    APRHLLike4[T4, HCollection4],
    APRHLLike5[T5, HCollection5],
    APRHLLike6[T6, HCollection6],
    APRHLLike7[T7, HCollection7]
  ]
}
trait AppenderNatSupport8[
  M[_, _, _, _, _, _, _, _],
  T1,
  T2,
  T3,
  T4,
  T5,
  T6,
  T7,
  T8,
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
  APRHLLike8[_, _ <: HLLike8] <: HLLike8,
  HCollection1 <: HLLike1,
  HCollection2 <: HLLike2,
  HCollection3 <: HLLike3,
  HCollection4 <: HLLike4,
  HCollection5 <: HLLike5,
  HCollection6 <: HLLike6,
  HCollection7 <: HLLike7,
  HCollection8 <: HLLike8
] {
  def append(param: M[HCollection1, HCollection2, HCollection3, HCollection4, HCollection5, HCollection6, HCollection7, HCollection8]): M[
    APRHLLike1[T1, HCollection1],
    APRHLLike2[T2, HCollection2],
    APRHLLike3[T3, HCollection3],
    APRHLLike4[T4, HCollection4],
    APRHLLike5[T5, HCollection5],
    APRHLLike6[T6, HCollection6],
    APRHLLike7[T7, HCollection7],
    APRHLLike8[T8, HCollection8]
  ]
}
trait AppenderNatSupport9[
  M[_, _, _, _, _, _, _, _, _],
  T1,
  T2,
  T3,
  T4,
  T5,
  T6,
  T7,
  T8,
  T9,
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
  APRHLLike9[_, _ <: HLLike9] <: HLLike9,
  HCollection1 <: HLLike1,
  HCollection2 <: HLLike2,
  HCollection3 <: HLLike3,
  HCollection4 <: HLLike4,
  HCollection5 <: HLLike5,
  HCollection6 <: HLLike6,
  HCollection7 <: HLLike7,
  HCollection8 <: HLLike8,
  HCollection9 <: HLLike9
] {
  def append(
    param: M[HCollection1, HCollection2, HCollection3, HCollection4, HCollection5, HCollection6, HCollection7, HCollection8, HCollection9]
  ): M[
    APRHLLike1[T1, HCollection1],
    APRHLLike2[T2, HCollection2],
    APRHLLike3[T3, HCollection3],
    APRHLLike4[T4, HCollection4],
    APRHLLike5[T5, HCollection5],
    APRHLLike6[T6, HCollection6],
    APRHLLike7[T7, HCollection7],
    APRHLLike8[T8, HCollection8],
    APRHLLike9[T9, HCollection9]
  ]
}
trait AppenderNatSupport10[
  M[_, _, _, _, _, _, _, _, _, _],
  T1,
  T2,
  T3,
  T4,
  T5,
  T6,
  T7,
  T8,
  T9,
  T10,
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
  APRHLLike10[_, _ <: HLLike10] <: HLLike10,
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
] {
  def append(
    param: M[
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
    APRHLLike1[T1, HCollection1],
    APRHLLike2[T2, HCollection2],
    APRHLLike3[T3, HCollection3],
    APRHLLike4[T4, HCollection4],
    APRHLLike5[T5, HCollection5],
    APRHLLike6[T6, HCollection6],
    APRHLLike7[T7, HCollection7],
    APRHLLike8[T8, HCollection8],
    APRHLLike9[T9, HCollection9],
    APRHLLike10[T10, HCollection10]
  ]
}
trait AppenderNatSupport11[
  M[_, _, _, _, _, _, _, _, _, _, _],
  T1,
  T2,
  T3,
  T4,
  T5,
  T6,
  T7,
  T8,
  T9,
  T10,
  T11,
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
  HLLike11,
  APRHLLike1[_, _ <: HLLike1] <: HLLike1,
  APRHLLike2[_, _ <: HLLike2] <: HLLike2,
  APRHLLike3[_, _ <: HLLike3] <: HLLike3,
  APRHLLike4[_, _ <: HLLike4] <: HLLike4,
  APRHLLike5[_, _ <: HLLike5] <: HLLike5,
  APRHLLike6[_, _ <: HLLike6] <: HLLike6,
  APRHLLike7[_, _ <: HLLike7] <: HLLike7,
  APRHLLike8[_, _ <: HLLike8] <: HLLike8,
  APRHLLike9[_, _ <: HLLike9] <: HLLike9,
  APRHLLike10[_, _ <: HLLike10] <: HLLike10,
  APRHLLike11[_, _ <: HLLike11] <: HLLike11,
  HCollection1 <: HLLike1,
  HCollection2 <: HLLike2,
  HCollection3 <: HLLike3,
  HCollection4 <: HLLike4,
  HCollection5 <: HLLike5,
  HCollection6 <: HLLike6,
  HCollection7 <: HLLike7,
  HCollection8 <: HLLike8,
  HCollection9 <: HLLike9,
  HCollection10 <: HLLike10,
  HCollection11 <: HLLike11
] {
  def append(
    param: M[
      HCollection1,
      HCollection2,
      HCollection3,
      HCollection4,
      HCollection5,
      HCollection6,
      HCollection7,
      HCollection8,
      HCollection9,
      HCollection10,
      HCollection11
    ]
  ): M[
    APRHLLike1[T1, HCollection1],
    APRHLLike2[T2, HCollection2],
    APRHLLike3[T3, HCollection3],
    APRHLLike4[T4, HCollection4],
    APRHLLike5[T5, HCollection5],
    APRHLLike6[T6, HCollection6],
    APRHLLike7[T7, HCollection7],
    APRHLLike8[T8, HCollection8],
    APRHLLike9[T9, HCollection9],
    APRHLLike10[T10, HCollection10],
    APRHLLike11[T11, HCollection11]
  ]
}
trait AppenderNatSupport12[
  M[_, _, _, _, _, _, _, _, _, _, _, _],
  T1,
  T2,
  T3,
  T4,
  T5,
  T6,
  T7,
  T8,
  T9,
  T10,
  T11,
  T12,
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
  HLLike11,
  HLLike12,
  APRHLLike1[_, _ <: HLLike1] <: HLLike1,
  APRHLLike2[_, _ <: HLLike2] <: HLLike2,
  APRHLLike3[_, _ <: HLLike3] <: HLLike3,
  APRHLLike4[_, _ <: HLLike4] <: HLLike4,
  APRHLLike5[_, _ <: HLLike5] <: HLLike5,
  APRHLLike6[_, _ <: HLLike6] <: HLLike6,
  APRHLLike7[_, _ <: HLLike7] <: HLLike7,
  APRHLLike8[_, _ <: HLLike8] <: HLLike8,
  APRHLLike9[_, _ <: HLLike9] <: HLLike9,
  APRHLLike10[_, _ <: HLLike10] <: HLLike10,
  APRHLLike11[_, _ <: HLLike11] <: HLLike11,
  APRHLLike12[_, _ <: HLLike12] <: HLLike12,
  HCollection1 <: HLLike1,
  HCollection2 <: HLLike2,
  HCollection3 <: HLLike3,
  HCollection4 <: HLLike4,
  HCollection5 <: HLLike5,
  HCollection6 <: HLLike6,
  HCollection7 <: HLLike7,
  HCollection8 <: HLLike8,
  HCollection9 <: HLLike9,
  HCollection10 <: HLLike10,
  HCollection11 <: HLLike11,
  HCollection12 <: HLLike12
] {
  def append(
    param: M[
      HCollection1,
      HCollection2,
      HCollection3,
      HCollection4,
      HCollection5,
      HCollection6,
      HCollection7,
      HCollection8,
      HCollection9,
      HCollection10,
      HCollection11,
      HCollection12
    ]
  ): M[
    APRHLLike1[T1, HCollection1],
    APRHLLike2[T2, HCollection2],
    APRHLLike3[T3, HCollection3],
    APRHLLike4[T4, HCollection4],
    APRHLLike5[T5, HCollection5],
    APRHLLike6[T6, HCollection6],
    APRHLLike7[T7, HCollection7],
    APRHLLike8[T8, HCollection8],
    APRHLLike9[T9, HCollection9],
    APRHLLike10[T10, HCollection10],
    APRHLLike11[T11, HCollection11],
    APRHLLike12[T12, HCollection12]
  ]
}
