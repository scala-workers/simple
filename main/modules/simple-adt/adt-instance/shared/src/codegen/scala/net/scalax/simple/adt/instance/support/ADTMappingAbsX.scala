
    package net.scalax.simple.adt
    package instance
    package support

    trait AdtFunctionSupport[
      M1[_, _],
      M2[_, _],
      M3[_, _],
      CoProduct1, APCoProduct1[_, _ <: CoProduct1] <: CoProduct1,
      Product2, APProduct2[_, _ <: Product2] <: Product2,
      CoProduct3, APCoProduct3[_, _ <: CoProduct3] <: CoProduct3
    ] { AdtFunctionSupportSelf =>

      def inputHList0[Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3](zero: (Co1, Pro2) => Co3): (Co1, Pro2) => Co3

      
      def inputHList1[
        T1, N1, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3
      ](zero: (Co1, Pro2) => Co3): (APCoProduct1[M1[T1, N1], Co1], APProduct2[M2[T1, N1], Pro2]) => APCoProduct3[M3[T1, N1], Co3]
    

      def inputHList2[
        T1,T2, N1,N2, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3
      ](zero: (Co1, Pro2) => Co3): (APCoProduct1[M1[T1, N1], APCoProduct1[M1[T2, N2], Co1]], APProduct2[M2[T1, N1], APProduct2[M2[T2, N2], Pro2]]) => APCoProduct3[M3[T1, N1], APCoProduct3[M3[T2, N2], Co3]]
    

      def inputHList3[
        T1,T2,T3, N1,N2,N3, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3
      ](zero: (Co1, Pro2) => Co3): (APCoProduct1[M1[T1, N1], APCoProduct1[M1[T2, N2], APCoProduct1[M1[T3, N3], Co1]]], APProduct2[M2[T1, N1], APProduct2[M2[T2, N2], APProduct2[M2[T3, N3], Pro2]]]) => APCoProduct3[M3[T1, N1], APCoProduct3[M3[T2, N2], APCoProduct3[M3[T3, N3], Co3]]]
    

      def inputHList4[
        T1,T2,T3,T4, N1,N2,N3,N4, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3
      ](zero: (Co1, Pro2) => Co3): (APCoProduct1[M1[T1, N1], APCoProduct1[M1[T2, N2], APCoProduct1[M1[T3, N3], APCoProduct1[M1[T4, N4], Co1]]]], APProduct2[M2[T1, N1], APProduct2[M2[T2, N2], APProduct2[M2[T3, N3], APProduct2[M2[T4, N4], Pro2]]]]) => APCoProduct3[M3[T1, N1], APCoProduct3[M3[T2, N2], APCoProduct3[M3[T3, N3], APCoProduct3[M3[T4, N4], Co3]]]]
    

      def inputHList5[
        T1,T2,T3,T4,T5, N1,N2,N3,N4,N5, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3
      ](zero: (Co1, Pro2) => Co3): (APCoProduct1[M1[T1, N1], APCoProduct1[M1[T2, N2], APCoProduct1[M1[T3, N3], APCoProduct1[M1[T4, N4], APCoProduct1[M1[T5, N5], Co1]]]]], APProduct2[M2[T1, N1], APProduct2[M2[T2, N2], APProduct2[M2[T3, N3], APProduct2[M2[T4, N4], APProduct2[M2[T5, N5], Pro2]]]]]) => APCoProduct3[M3[T1, N1], APCoProduct3[M3[T2, N2], APCoProduct3[M3[T3, N3], APCoProduct3[M3[T4, N4], APCoProduct3[M3[T5, N5], Co3]]]]]
    

      def inputHList6[
        T1,T2,T3,T4,T5,T6, N1,N2,N3,N4,N5,N6, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3
      ](zero: (Co1, Pro2) => Co3): (APCoProduct1[M1[T1, N1], APCoProduct1[M1[T2, N2], APCoProduct1[M1[T3, N3], APCoProduct1[M1[T4, N4], APCoProduct1[M1[T5, N5], APCoProduct1[M1[T6, N6], Co1]]]]]], APProduct2[M2[T1, N1], APProduct2[M2[T2, N2], APProduct2[M2[T3, N3], APProduct2[M2[T4, N4], APProduct2[M2[T5, N5], APProduct2[M2[T6, N6], Pro2]]]]]]) => APCoProduct3[M3[T1, N1], APCoProduct3[M3[T2, N2], APCoProduct3[M3[T3, N3], APCoProduct3[M3[T4, N4], APCoProduct3[M3[T5, N5], APCoProduct3[M3[T6, N6], Co3]]]]]]
    

      def inputHList7[
        T1,T2,T3,T4,T5,T6,T7, N1,N2,N3,N4,N5,N6,N7, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3
      ](zero: (Co1, Pro2) => Co3): (APCoProduct1[M1[T1, N1], APCoProduct1[M1[T2, N2], APCoProduct1[M1[T3, N3], APCoProduct1[M1[T4, N4], APCoProduct1[M1[T5, N5], APCoProduct1[M1[T6, N6], APCoProduct1[M1[T7, N7], Co1]]]]]]], APProduct2[M2[T1, N1], APProduct2[M2[T2, N2], APProduct2[M2[T3, N3], APProduct2[M2[T4, N4], APProduct2[M2[T5, N5], APProduct2[M2[T6, N6], APProduct2[M2[T7, N7], Pro2]]]]]]]) => APCoProduct3[M3[T1, N1], APCoProduct3[M3[T2, N2], APCoProduct3[M3[T3, N3], APCoProduct3[M3[T4, N4], APCoProduct3[M3[T5, N5], APCoProduct3[M3[T6, N6], APCoProduct3[M3[T7, N7], Co3]]]]]]]
    

      def inputHList8[
        T1,T2,T3,T4,T5,T6,T7,T8, N1,N2,N3,N4,N5,N6,N7,N8, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3
      ](zero: (Co1, Pro2) => Co3): (APCoProduct1[M1[T1, N1], APCoProduct1[M1[T2, N2], APCoProduct1[M1[T3, N3], APCoProduct1[M1[T4, N4], APCoProduct1[M1[T5, N5], APCoProduct1[M1[T6, N6], APCoProduct1[M1[T7, N7], APCoProduct1[M1[T8, N8], Co1]]]]]]]], APProduct2[M2[T1, N1], APProduct2[M2[T2, N2], APProduct2[M2[T3, N3], APProduct2[M2[T4, N4], APProduct2[M2[T5, N5], APProduct2[M2[T6, N6], APProduct2[M2[T7, N7], APProduct2[M2[T8, N8], Pro2]]]]]]]]) => APCoProduct3[M3[T1, N1], APCoProduct3[M3[T2, N2], APCoProduct3[M3[T3, N3], APCoProduct3[M3[T4, N4], APCoProduct3[M3[T5, N5], APCoProduct3[M3[T6, N6], APCoProduct3[M3[T7, N7], APCoProduct3[M3[T8, N8], Co3]]]]]]]]
    

      def inputHList9[
        T1,T2,T3,T4,T5,T6,T7,T8,T9, N1,N2,N3,N4,N5,N6,N7,N8,N9, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3
      ](zero: (Co1, Pro2) => Co3): (APCoProduct1[M1[T1, N1], APCoProduct1[M1[T2, N2], APCoProduct1[M1[T3, N3], APCoProduct1[M1[T4, N4], APCoProduct1[M1[T5, N5], APCoProduct1[M1[T6, N6], APCoProduct1[M1[T7, N7], APCoProduct1[M1[T8, N8], APCoProduct1[M1[T9, N9], Co1]]]]]]]]], APProduct2[M2[T1, N1], APProduct2[M2[T2, N2], APProduct2[M2[T3, N3], APProduct2[M2[T4, N4], APProduct2[M2[T5, N5], APProduct2[M2[T6, N6], APProduct2[M2[T7, N7], APProduct2[M2[T8, N8], APProduct2[M2[T9, N9], Pro2]]]]]]]]]) => APCoProduct3[M3[T1, N1], APCoProduct3[M3[T2, N2], APCoProduct3[M3[T3, N3], APCoProduct3[M3[T4, N4], APCoProduct3[M3[T5, N5], APCoProduct3[M3[T6, N6], APCoProduct3[M3[T7, N7], APCoProduct3[M3[T8, N8], APCoProduct3[M3[T9, N9], Co3]]]]]]]]]
    

      def inputHList10[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3
      ](zero: (Co1, Pro2) => Co3): (APCoProduct1[M1[T1, N1], APCoProduct1[M1[T2, N2], APCoProduct1[M1[T3, N3], APCoProduct1[M1[T4, N4], APCoProduct1[M1[T5, N5], APCoProduct1[M1[T6, N6], APCoProduct1[M1[T7, N7], APCoProduct1[M1[T8, N8], APCoProduct1[M1[T9, N9], APCoProduct1[M1[T10, N10], Co1]]]]]]]]]], APProduct2[M2[T1, N1], APProduct2[M2[T2, N2], APProduct2[M2[T3, N3], APProduct2[M2[T4, N4], APProduct2[M2[T5, N5], APProduct2[M2[T6, N6], APProduct2[M2[T7, N7], APProduct2[M2[T8, N8], APProduct2[M2[T9, N9], APProduct2[M2[T10, N10], Pro2]]]]]]]]]]) => APCoProduct3[M3[T1, N1], APCoProduct3[M3[T2, N2], APCoProduct3[M3[T3, N3], APCoProduct3[M3[T4, N4], APCoProduct3[M3[T5, N5], APCoProduct3[M3[T6, N6], APCoProduct3[M3[T7, N7], APCoProduct3[M3[T8, N8], APCoProduct3[M3[T9, N9], APCoProduct3[M3[T10, N10], Co3]]]]]]]]]]
    

      def inputHList11[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3
      ](zero: (Co1, Pro2) => Co3): (APCoProduct1[M1[T1, N1], APCoProduct1[M1[T2, N2], APCoProduct1[M1[T3, N3], APCoProduct1[M1[T4, N4], APCoProduct1[M1[T5, N5], APCoProduct1[M1[T6, N6], APCoProduct1[M1[T7, N7], APCoProduct1[M1[T8, N8], APCoProduct1[M1[T9, N9], APCoProduct1[M1[T10, N10], APCoProduct1[M1[T11, N11], Co1]]]]]]]]]]], APProduct2[M2[T1, N1], APProduct2[M2[T2, N2], APProduct2[M2[T3, N3], APProduct2[M2[T4, N4], APProduct2[M2[T5, N5], APProduct2[M2[T6, N6], APProduct2[M2[T7, N7], APProduct2[M2[T8, N8], APProduct2[M2[T9, N9], APProduct2[M2[T10, N10], APProduct2[M2[T11, N11], Pro2]]]]]]]]]]]) => APCoProduct3[M3[T1, N1], APCoProduct3[M3[T2, N2], APCoProduct3[M3[T3, N3], APCoProduct3[M3[T4, N4], APCoProduct3[M3[T5, N5], APCoProduct3[M3[T6, N6], APCoProduct3[M3[T7, N7], APCoProduct3[M3[T8, N8], APCoProduct3[M3[T9, N9], APCoProduct3[M3[T10, N10], APCoProduct3[M3[T11, N11], Co3]]]]]]]]]]]
    

      def inputHList12[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3
      ](zero: (Co1, Pro2) => Co3): (APCoProduct1[M1[T1, N1], APCoProduct1[M1[T2, N2], APCoProduct1[M1[T3, N3], APCoProduct1[M1[T4, N4], APCoProduct1[M1[T5, N5], APCoProduct1[M1[T6, N6], APCoProduct1[M1[T7, N7], APCoProduct1[M1[T8, N8], APCoProduct1[M1[T9, N9], APCoProduct1[M1[T10, N10], APCoProduct1[M1[T11, N11], APCoProduct1[M1[T12, N12], Co1]]]]]]]]]]]], APProduct2[M2[T1, N1], APProduct2[M2[T2, N2], APProduct2[M2[T3, N3], APProduct2[M2[T4, N4], APProduct2[M2[T5, N5], APProduct2[M2[T6, N6], APProduct2[M2[T7, N7], APProduct2[M2[T8, N8], APProduct2[M2[T9, N9], APProduct2[M2[T10, N10], APProduct2[M2[T11, N11], APProduct2[M2[T12, N12], Pro2]]]]]]]]]]]]) => APCoProduct3[M3[T1, N1], APCoProduct3[M3[T2, N2], APCoProduct3[M3[T3, N3], APCoProduct3[M3[T4, N4], APCoProduct3[M3[T5, N5], APCoProduct3[M3[T6, N6], APCoProduct3[M3[T7, N7], APCoProduct3[M3[T8, N8], APCoProduct3[M3[T9, N9], APCoProduct3[M3[T10, N10], APCoProduct3[M3[T11, N11], APCoProduct3[M3[T12, N12], Co3]]]]]]]]]]]]
    

      def inputHList13[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3
      ](zero: (Co1, Pro2) => Co3): (APCoProduct1[M1[T1, N1], APCoProduct1[M1[T2, N2], APCoProduct1[M1[T3, N3], APCoProduct1[M1[T4, N4], APCoProduct1[M1[T5, N5], APCoProduct1[M1[T6, N6], APCoProduct1[M1[T7, N7], APCoProduct1[M1[T8, N8], APCoProduct1[M1[T9, N9], APCoProduct1[M1[T10, N10], APCoProduct1[M1[T11, N11], APCoProduct1[M1[T12, N12], APCoProduct1[M1[T13, N13], Co1]]]]]]]]]]]]], APProduct2[M2[T1, N1], APProduct2[M2[T2, N2], APProduct2[M2[T3, N3], APProduct2[M2[T4, N4], APProduct2[M2[T5, N5], APProduct2[M2[T6, N6], APProduct2[M2[T7, N7], APProduct2[M2[T8, N8], APProduct2[M2[T9, N9], APProduct2[M2[T10, N10], APProduct2[M2[T11, N11], APProduct2[M2[T12, N12], APProduct2[M2[T13, N13], Pro2]]]]]]]]]]]]]) => APCoProduct3[M3[T1, N1], APCoProduct3[M3[T2, N2], APCoProduct3[M3[T3, N3], APCoProduct3[M3[T4, N4], APCoProduct3[M3[T5, N5], APCoProduct3[M3[T6, N6], APCoProduct3[M3[T7, N7], APCoProduct3[M3[T8, N8], APCoProduct3[M3[T9, N9], APCoProduct3[M3[T10, N10], APCoProduct3[M3[T11, N11], APCoProduct3[M3[T12, N12], APCoProduct3[M3[T13, N13], Co3]]]]]]]]]]]]]
    

      def inputHList14[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3
      ](zero: (Co1, Pro2) => Co3): (APCoProduct1[M1[T1, N1], APCoProduct1[M1[T2, N2], APCoProduct1[M1[T3, N3], APCoProduct1[M1[T4, N4], APCoProduct1[M1[T5, N5], APCoProduct1[M1[T6, N6], APCoProduct1[M1[T7, N7], APCoProduct1[M1[T8, N8], APCoProduct1[M1[T9, N9], APCoProduct1[M1[T10, N10], APCoProduct1[M1[T11, N11], APCoProduct1[M1[T12, N12], APCoProduct1[M1[T13, N13], APCoProduct1[M1[T14, N14], Co1]]]]]]]]]]]]]], APProduct2[M2[T1, N1], APProduct2[M2[T2, N2], APProduct2[M2[T3, N3], APProduct2[M2[T4, N4], APProduct2[M2[T5, N5], APProduct2[M2[T6, N6], APProduct2[M2[T7, N7], APProduct2[M2[T8, N8], APProduct2[M2[T9, N9], APProduct2[M2[T10, N10], APProduct2[M2[T11, N11], APProduct2[M2[T12, N12], APProduct2[M2[T13, N13], APProduct2[M2[T14, N14], Pro2]]]]]]]]]]]]]]) => APCoProduct3[M3[T1, N1], APCoProduct3[M3[T2, N2], APCoProduct3[M3[T3, N3], APCoProduct3[M3[T4, N4], APCoProduct3[M3[T5, N5], APCoProduct3[M3[T6, N6], APCoProduct3[M3[T7, N7], APCoProduct3[M3[T8, N8], APCoProduct3[M3[T9, N9], APCoProduct3[M3[T10, N10], APCoProduct3[M3[T11, N11], APCoProduct3[M3[T12, N12], APCoProduct3[M3[T13, N13], APCoProduct3[M3[T14, N14], Co3]]]]]]]]]]]]]]
    

      def inputHList15[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3
      ](zero: (Co1, Pro2) => Co3): (APCoProduct1[M1[T1, N1], APCoProduct1[M1[T2, N2], APCoProduct1[M1[T3, N3], APCoProduct1[M1[T4, N4], APCoProduct1[M1[T5, N5], APCoProduct1[M1[T6, N6], APCoProduct1[M1[T7, N7], APCoProduct1[M1[T8, N8], APCoProduct1[M1[T9, N9], APCoProduct1[M1[T10, N10], APCoProduct1[M1[T11, N11], APCoProduct1[M1[T12, N12], APCoProduct1[M1[T13, N13], APCoProduct1[M1[T14, N14], APCoProduct1[M1[T15, N15], Co1]]]]]]]]]]]]]]], APProduct2[M2[T1, N1], APProduct2[M2[T2, N2], APProduct2[M2[T3, N3], APProduct2[M2[T4, N4], APProduct2[M2[T5, N5], APProduct2[M2[T6, N6], APProduct2[M2[T7, N7], APProduct2[M2[T8, N8], APProduct2[M2[T9, N9], APProduct2[M2[T10, N10], APProduct2[M2[T11, N11], APProduct2[M2[T12, N12], APProduct2[M2[T13, N13], APProduct2[M2[T14, N14], APProduct2[M2[T15, N15], Pro2]]]]]]]]]]]]]]]) => APCoProduct3[M3[T1, N1], APCoProduct3[M3[T2, N2], APCoProduct3[M3[T3, N3], APCoProduct3[M3[T4, N4], APCoProduct3[M3[T5, N5], APCoProduct3[M3[T6, N6], APCoProduct3[M3[T7, N7], APCoProduct3[M3[T8, N8], APCoProduct3[M3[T9, N9], APCoProduct3[M3[T10, N10], APCoProduct3[M3[T11, N11], APCoProduct3[M3[T12, N12], APCoProduct3[M3[T13, N13], APCoProduct3[M3[T14, N14], APCoProduct3[M3[T15, N15], Co3]]]]]]]]]]]]]]]
    

      def inputHList16[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3
      ](zero: (Co1, Pro2) => Co3): (APCoProduct1[M1[T1, N1], APCoProduct1[M1[T2, N2], APCoProduct1[M1[T3, N3], APCoProduct1[M1[T4, N4], APCoProduct1[M1[T5, N5], APCoProduct1[M1[T6, N6], APCoProduct1[M1[T7, N7], APCoProduct1[M1[T8, N8], APCoProduct1[M1[T9, N9], APCoProduct1[M1[T10, N10], APCoProduct1[M1[T11, N11], APCoProduct1[M1[T12, N12], APCoProduct1[M1[T13, N13], APCoProduct1[M1[T14, N14], APCoProduct1[M1[T15, N15], APCoProduct1[M1[T16, N16], Co1]]]]]]]]]]]]]]]], APProduct2[M2[T1, N1], APProduct2[M2[T2, N2], APProduct2[M2[T3, N3], APProduct2[M2[T4, N4], APProduct2[M2[T5, N5], APProduct2[M2[T6, N6], APProduct2[M2[T7, N7], APProduct2[M2[T8, N8], APProduct2[M2[T9, N9], APProduct2[M2[T10, N10], APProduct2[M2[T11, N11], APProduct2[M2[T12, N12], APProduct2[M2[T13, N13], APProduct2[M2[T14, N14], APProduct2[M2[T15, N15], APProduct2[M2[T16, N16], Pro2]]]]]]]]]]]]]]]]) => APCoProduct3[M3[T1, N1], APCoProduct3[M3[T2, N2], APCoProduct3[M3[T3, N3], APCoProduct3[M3[T4, N4], APCoProduct3[M3[T5, N5], APCoProduct3[M3[T6, N6], APCoProduct3[M3[T7, N7], APCoProduct3[M3[T8, N8], APCoProduct3[M3[T9, N9], APCoProduct3[M3[T10, N10], APCoProduct3[M3[T11, N11], APCoProduct3[M3[T12, N12], APCoProduct3[M3[T13, N13], APCoProduct3[M3[T14, N14], APCoProduct3[M3[T15, N15], APCoProduct3[M3[T16, N16], Co3]]]]]]]]]]]]]]]]
    

      def inputHList17[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3
      ](zero: (Co1, Pro2) => Co3): (APCoProduct1[M1[T1, N1], APCoProduct1[M1[T2, N2], APCoProduct1[M1[T3, N3], APCoProduct1[M1[T4, N4], APCoProduct1[M1[T5, N5], APCoProduct1[M1[T6, N6], APCoProduct1[M1[T7, N7], APCoProduct1[M1[T8, N8], APCoProduct1[M1[T9, N9], APCoProduct1[M1[T10, N10], APCoProduct1[M1[T11, N11], APCoProduct1[M1[T12, N12], APCoProduct1[M1[T13, N13], APCoProduct1[M1[T14, N14], APCoProduct1[M1[T15, N15], APCoProduct1[M1[T16, N16], APCoProduct1[M1[T17, N17], Co1]]]]]]]]]]]]]]]]], APProduct2[M2[T1, N1], APProduct2[M2[T2, N2], APProduct2[M2[T3, N3], APProduct2[M2[T4, N4], APProduct2[M2[T5, N5], APProduct2[M2[T6, N6], APProduct2[M2[T7, N7], APProduct2[M2[T8, N8], APProduct2[M2[T9, N9], APProduct2[M2[T10, N10], APProduct2[M2[T11, N11], APProduct2[M2[T12, N12], APProduct2[M2[T13, N13], APProduct2[M2[T14, N14], APProduct2[M2[T15, N15], APProduct2[M2[T16, N16], APProduct2[M2[T17, N17], Pro2]]]]]]]]]]]]]]]]]) => APCoProduct3[M3[T1, N1], APCoProduct3[M3[T2, N2], APCoProduct3[M3[T3, N3], APCoProduct3[M3[T4, N4], APCoProduct3[M3[T5, N5], APCoProduct3[M3[T6, N6], APCoProduct3[M3[T7, N7], APCoProduct3[M3[T8, N8], APCoProduct3[M3[T9, N9], APCoProduct3[M3[T10, N10], APCoProduct3[M3[T11, N11], APCoProduct3[M3[T12, N12], APCoProduct3[M3[T13, N13], APCoProduct3[M3[T14, N14], APCoProduct3[M3[T15, N15], APCoProduct3[M3[T16, N16], APCoProduct3[M3[T17, N17], Co3]]]]]]]]]]]]]]]]]
    

      def inputHList18[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3
      ](zero: (Co1, Pro2) => Co3): (APCoProduct1[M1[T1, N1], APCoProduct1[M1[T2, N2], APCoProduct1[M1[T3, N3], APCoProduct1[M1[T4, N4], APCoProduct1[M1[T5, N5], APCoProduct1[M1[T6, N6], APCoProduct1[M1[T7, N7], APCoProduct1[M1[T8, N8], APCoProduct1[M1[T9, N9], APCoProduct1[M1[T10, N10], APCoProduct1[M1[T11, N11], APCoProduct1[M1[T12, N12], APCoProduct1[M1[T13, N13], APCoProduct1[M1[T14, N14], APCoProduct1[M1[T15, N15], APCoProduct1[M1[T16, N16], APCoProduct1[M1[T17, N17], APCoProduct1[M1[T18, N18], Co1]]]]]]]]]]]]]]]]]], APProduct2[M2[T1, N1], APProduct2[M2[T2, N2], APProduct2[M2[T3, N3], APProduct2[M2[T4, N4], APProduct2[M2[T5, N5], APProduct2[M2[T6, N6], APProduct2[M2[T7, N7], APProduct2[M2[T8, N8], APProduct2[M2[T9, N9], APProduct2[M2[T10, N10], APProduct2[M2[T11, N11], APProduct2[M2[T12, N12], APProduct2[M2[T13, N13], APProduct2[M2[T14, N14], APProduct2[M2[T15, N15], APProduct2[M2[T16, N16], APProduct2[M2[T17, N17], APProduct2[M2[T18, N18], Pro2]]]]]]]]]]]]]]]]]]) => APCoProduct3[M3[T1, N1], APCoProduct3[M3[T2, N2], APCoProduct3[M3[T3, N3], APCoProduct3[M3[T4, N4], APCoProduct3[M3[T5, N5], APCoProduct3[M3[T6, N6], APCoProduct3[M3[T7, N7], APCoProduct3[M3[T8, N8], APCoProduct3[M3[T9, N9], APCoProduct3[M3[T10, N10], APCoProduct3[M3[T11, N11], APCoProduct3[M3[T12, N12], APCoProduct3[M3[T13, N13], APCoProduct3[M3[T14, N14], APCoProduct3[M3[T15, N15], APCoProduct3[M3[T16, N16], APCoProduct3[M3[T17, N17], APCoProduct3[M3[T18, N18], Co3]]]]]]]]]]]]]]]]]]
    

      def inputHList19[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3
      ](zero: (Co1, Pro2) => Co3): (APCoProduct1[M1[T1, N1], APCoProduct1[M1[T2, N2], APCoProduct1[M1[T3, N3], APCoProduct1[M1[T4, N4], APCoProduct1[M1[T5, N5], APCoProduct1[M1[T6, N6], APCoProduct1[M1[T7, N7], APCoProduct1[M1[T8, N8], APCoProduct1[M1[T9, N9], APCoProduct1[M1[T10, N10], APCoProduct1[M1[T11, N11], APCoProduct1[M1[T12, N12], APCoProduct1[M1[T13, N13], APCoProduct1[M1[T14, N14], APCoProduct1[M1[T15, N15], APCoProduct1[M1[T16, N16], APCoProduct1[M1[T17, N17], APCoProduct1[M1[T18, N18], APCoProduct1[M1[T19, N19], Co1]]]]]]]]]]]]]]]]]]], APProduct2[M2[T1, N1], APProduct2[M2[T2, N2], APProduct2[M2[T3, N3], APProduct2[M2[T4, N4], APProduct2[M2[T5, N5], APProduct2[M2[T6, N6], APProduct2[M2[T7, N7], APProduct2[M2[T8, N8], APProduct2[M2[T9, N9], APProduct2[M2[T10, N10], APProduct2[M2[T11, N11], APProduct2[M2[T12, N12], APProduct2[M2[T13, N13], APProduct2[M2[T14, N14], APProduct2[M2[T15, N15], APProduct2[M2[T16, N16], APProduct2[M2[T17, N17], APProduct2[M2[T18, N18], APProduct2[M2[T19, N19], Pro2]]]]]]]]]]]]]]]]]]]) => APCoProduct3[M3[T1, N1], APCoProduct3[M3[T2, N2], APCoProduct3[M3[T3, N3], APCoProduct3[M3[T4, N4], APCoProduct3[M3[T5, N5], APCoProduct3[M3[T6, N6], APCoProduct3[M3[T7, N7], APCoProduct3[M3[T8, N8], APCoProduct3[M3[T9, N9], APCoProduct3[M3[T10, N10], APCoProduct3[M3[T11, N11], APCoProduct3[M3[T12, N12], APCoProduct3[M3[T13, N13], APCoProduct3[M3[T14, N14], APCoProduct3[M3[T15, N15], APCoProduct3[M3[T16, N16], APCoProduct3[M3[T17, N17], APCoProduct3[M3[T18, N18], APCoProduct3[M3[T19, N19], Co3]]]]]]]]]]]]]]]]]]]
    

      def inputHList20[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3
      ](zero: (Co1, Pro2) => Co3): (APCoProduct1[M1[T1, N1], APCoProduct1[M1[T2, N2], APCoProduct1[M1[T3, N3], APCoProduct1[M1[T4, N4], APCoProduct1[M1[T5, N5], APCoProduct1[M1[T6, N6], APCoProduct1[M1[T7, N7], APCoProduct1[M1[T8, N8], APCoProduct1[M1[T9, N9], APCoProduct1[M1[T10, N10], APCoProduct1[M1[T11, N11], APCoProduct1[M1[T12, N12], APCoProduct1[M1[T13, N13], APCoProduct1[M1[T14, N14], APCoProduct1[M1[T15, N15], APCoProduct1[M1[T16, N16], APCoProduct1[M1[T17, N17], APCoProduct1[M1[T18, N18], APCoProduct1[M1[T19, N19], APCoProduct1[M1[T20, N20], Co1]]]]]]]]]]]]]]]]]]]], APProduct2[M2[T1, N1], APProduct2[M2[T2, N2], APProduct2[M2[T3, N3], APProduct2[M2[T4, N4], APProduct2[M2[T5, N5], APProduct2[M2[T6, N6], APProduct2[M2[T7, N7], APProduct2[M2[T8, N8], APProduct2[M2[T9, N9], APProduct2[M2[T10, N10], APProduct2[M2[T11, N11], APProduct2[M2[T12, N12], APProduct2[M2[T13, N13], APProduct2[M2[T14, N14], APProduct2[M2[T15, N15], APProduct2[M2[T16, N16], APProduct2[M2[T17, N17], APProduct2[M2[T18, N18], APProduct2[M2[T19, N19], APProduct2[M2[T20, N20], Pro2]]]]]]]]]]]]]]]]]]]]) => APCoProduct3[M3[T1, N1], APCoProduct3[M3[T2, N2], APCoProduct3[M3[T3, N3], APCoProduct3[M3[T4, N4], APCoProduct3[M3[T5, N5], APCoProduct3[M3[T6, N6], APCoProduct3[M3[T7, N7], APCoProduct3[M3[T8, N8], APCoProduct3[M3[T9, N9], APCoProduct3[M3[T10, N10], APCoProduct3[M3[T11, N11], APCoProduct3[M3[T12, N12], APCoProduct3[M3[T13, N13], APCoProduct3[M3[T14, N14], APCoProduct3[M3[T15, N15], APCoProduct3[M3[T16, N16], APCoProduct3[M3[T17, N17], APCoProduct3[M3[T18, N18], APCoProduct3[M3[T19, N19], APCoProduct3[M3[T20, N20], Co3]]]]]]]]]]]]]]]]]]]]
    

      def inputHList21[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3
      ](zero: (Co1, Pro2) => Co3): (APCoProduct1[M1[T1, N1], APCoProduct1[M1[T2, N2], APCoProduct1[M1[T3, N3], APCoProduct1[M1[T4, N4], APCoProduct1[M1[T5, N5], APCoProduct1[M1[T6, N6], APCoProduct1[M1[T7, N7], APCoProduct1[M1[T8, N8], APCoProduct1[M1[T9, N9], APCoProduct1[M1[T10, N10], APCoProduct1[M1[T11, N11], APCoProduct1[M1[T12, N12], APCoProduct1[M1[T13, N13], APCoProduct1[M1[T14, N14], APCoProduct1[M1[T15, N15], APCoProduct1[M1[T16, N16], APCoProduct1[M1[T17, N17], APCoProduct1[M1[T18, N18], APCoProduct1[M1[T19, N19], APCoProduct1[M1[T20, N20], APCoProduct1[M1[T21, N21], Co1]]]]]]]]]]]]]]]]]]]]], APProduct2[M2[T1, N1], APProduct2[M2[T2, N2], APProduct2[M2[T3, N3], APProduct2[M2[T4, N4], APProduct2[M2[T5, N5], APProduct2[M2[T6, N6], APProduct2[M2[T7, N7], APProduct2[M2[T8, N8], APProduct2[M2[T9, N9], APProduct2[M2[T10, N10], APProduct2[M2[T11, N11], APProduct2[M2[T12, N12], APProduct2[M2[T13, N13], APProduct2[M2[T14, N14], APProduct2[M2[T15, N15], APProduct2[M2[T16, N16], APProduct2[M2[T17, N17], APProduct2[M2[T18, N18], APProduct2[M2[T19, N19], APProduct2[M2[T20, N20], APProduct2[M2[T21, N21], Pro2]]]]]]]]]]]]]]]]]]]]]) => APCoProduct3[M3[T1, N1], APCoProduct3[M3[T2, N2], APCoProduct3[M3[T3, N3], APCoProduct3[M3[T4, N4], APCoProduct3[M3[T5, N5], APCoProduct3[M3[T6, N6], APCoProduct3[M3[T7, N7], APCoProduct3[M3[T8, N8], APCoProduct3[M3[T9, N9], APCoProduct3[M3[T10, N10], APCoProduct3[M3[T11, N11], APCoProduct3[M3[T12, N12], APCoProduct3[M3[T13, N13], APCoProduct3[M3[T14, N14], APCoProduct3[M3[T15, N15], APCoProduct3[M3[T16, N16], APCoProduct3[M3[T17, N17], APCoProduct3[M3[T18, N18], APCoProduct3[M3[T19, N19], APCoProduct3[M3[T20, N20], APCoProduct3[M3[T21, N21], Co3]]]]]]]]]]]]]]]]]]]]]
    

      def inputHList22[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21,N22, Co1 <: CoProduct1, Pro2 <: Product2, Co3 <: CoProduct3
      ](zero: (Co1, Pro2) => Co3): (APCoProduct1[M1[T1, N1], APCoProduct1[M1[T2, N2], APCoProduct1[M1[T3, N3], APCoProduct1[M1[T4, N4], APCoProduct1[M1[T5, N5], APCoProduct1[M1[T6, N6], APCoProduct1[M1[T7, N7], APCoProduct1[M1[T8, N8], APCoProduct1[M1[T9, N9], APCoProduct1[M1[T10, N10], APCoProduct1[M1[T11, N11], APCoProduct1[M1[T12, N12], APCoProduct1[M1[T13, N13], APCoProduct1[M1[T14, N14], APCoProduct1[M1[T15, N15], APCoProduct1[M1[T16, N16], APCoProduct1[M1[T17, N17], APCoProduct1[M1[T18, N18], APCoProduct1[M1[T19, N19], APCoProduct1[M1[T20, N20], APCoProduct1[M1[T21, N21], APCoProduct1[M1[T22, N22], Co1]]]]]]]]]]]]]]]]]]]]]], APProduct2[M2[T1, N1], APProduct2[M2[T2, N2], APProduct2[M2[T3, N3], APProduct2[M2[T4, N4], APProduct2[M2[T5, N5], APProduct2[M2[T6, N6], APProduct2[M2[T7, N7], APProduct2[M2[T8, N8], APProduct2[M2[T9, N9], APProduct2[M2[T10, N10], APProduct2[M2[T11, N11], APProduct2[M2[T12, N12], APProduct2[M2[T13, N13], APProduct2[M2[T14, N14], APProduct2[M2[T15, N15], APProduct2[M2[T16, N16], APProduct2[M2[T17, N17], APProduct2[M2[T18, N18], APProduct2[M2[T19, N19], APProduct2[M2[T20, N20], APProduct2[M2[T21, N21], APProduct2[M2[T22, N22], Pro2]]]]]]]]]]]]]]]]]]]]]]) => APCoProduct3[M3[T1, N1], APCoProduct3[M3[T2, N2], APCoProduct3[M3[T3, N3], APCoProduct3[M3[T4, N4], APCoProduct3[M3[T5, N5], APCoProduct3[M3[T6, N6], APCoProduct3[M3[T7, N7], APCoProduct3[M3[T8, N8], APCoProduct3[M3[T9, N9], APCoProduct3[M3[T10, N10], APCoProduct3[M3[T11, N11], APCoProduct3[M3[T12, N12], APCoProduct3[M3[T13, N13], APCoProduct3[M3[T14, N14], APCoProduct3[M3[T15, N15], APCoProduct3[M3[T16, N16], APCoProduct3[M3[T17, N17], APCoProduct3[M3[T18, N18], APCoProduct3[M3[T19, N19], APCoProduct3[M3[T20, N20], APCoProduct3[M3[T21, N21], APCoProduct3[M3[T22, N22], Co3]]]]]]]]]]]]]]]]]]]]]]
    
    }
  