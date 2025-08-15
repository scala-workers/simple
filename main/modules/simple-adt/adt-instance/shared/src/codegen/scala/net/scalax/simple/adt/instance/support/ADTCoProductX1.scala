
    package net.scalax.simple.adt
    package instance
    package support

    trait ADTCoProductX1[
      Product1, APProduct1[_, _ <: Product1] <: Product1, ProZero1 <: Product1,
      CoProduct2, APCoProduct2[_, _ <: CoProduct2] <: CoProduct2, CoZero2 <: CoProduct2
    ] extends ADTCoProductX1Helper[
      Product1, APProduct1, ProZero1,
      CoProduct2, APCoProduct2, CoZero2
    ] { ADTCoProductX1Self =>

      
      def inputHList1[
        Target,
        T1
      ]: APProduct1[T1 => Target, ProZero1] => APCoProduct2[T1, CoZero2] => Option[Target] = {
        ADTCoProductX1Self.util.appendSupport[Target, T1, ProZero1, CoZero2](ADTCoProductX1Self.inputHList0[Target])
      }
    

      def inputHList2[
        Target,
        T1,T2
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, ProZero1]] => APCoProduct2[T1, APCoProduct2[T2, CoZero2]] => Option[Target] = {
        ADTCoProductX1Self.util.appendSupport[Target, T1, APProduct1[T2 => Target, ProZero1], APCoProduct2[T2, CoZero2]](ADTCoProductX1Self.inputHList1[Target,T2])
      }
    

      def inputHList3[
        Target,
        T1,T2,T3
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, ProZero1]]] => APCoProduct2[T1, APCoProduct2[T2, APCoProduct2[T3, CoZero2]]] => Option[Target] = {
        ADTCoProductX1Self.util.appendSupport[Target, T1, APProduct1[T2 => Target, APProduct1[T3 => Target, ProZero1]], APCoProduct2[T2, APCoProduct2[T3, CoZero2]]](ADTCoProductX1Self.inputHList2[Target,T2,T3])
      }
    

      def inputHList4[
        Target,
        T1,T2,T3,T4
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, ProZero1]]]] => APCoProduct2[T1, APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, CoZero2]]]] => Option[Target] = {
        ADTCoProductX1Self.util.appendSupport[Target, T1, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, ProZero1]]], APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, CoZero2]]]](ADTCoProductX1Self.inputHList3[Target,T2,T3,T4])
      }
    

      def inputHList5[
        Target,
        T1,T2,T3,T4,T5
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, ProZero1]]]]] => APCoProduct2[T1, APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, CoZero2]]]]] => Option[Target] = {
        ADTCoProductX1Self.util.appendSupport[Target, T1, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, ProZero1]]]], APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, CoZero2]]]]](ADTCoProductX1Self.inputHList4[Target,T2,T3,T4,T5])
      }
    

      def inputHList6[
        Target,
        T1,T2,T3,T4,T5,T6
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, ProZero1]]]]]] => APCoProduct2[T1, APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, CoZero2]]]]]] => Option[Target] = {
        ADTCoProductX1Self.util.appendSupport[Target, T1, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, ProZero1]]]]], APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, CoZero2]]]]]](ADTCoProductX1Self.inputHList5[Target,T2,T3,T4,T5,T6])
      }
    

      def inputHList7[
        Target,
        T1,T2,T3,T4,T5,T6,T7
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, ProZero1]]]]]]] => APCoProduct2[T1, APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, CoZero2]]]]]]] => Option[Target] = {
        ADTCoProductX1Self.util.appendSupport[Target, T1, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, ProZero1]]]]]], APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, CoZero2]]]]]]](ADTCoProductX1Self.inputHList6[Target,T2,T3,T4,T5,T6,T7])
      }
    

      def inputHList8[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, ProZero1]]]]]]]] => APCoProduct2[T1, APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, CoZero2]]]]]]]] => Option[Target] = {
        ADTCoProductX1Self.util.appendSupport[Target, T1, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, ProZero1]]]]]]], APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, CoZero2]]]]]]]](ADTCoProductX1Self.inputHList7[Target,T2,T3,T4,T5,T6,T7,T8])
      }
    

      def inputHList9[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, ProZero1]]]]]]]]] => APCoProduct2[T1, APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, CoZero2]]]]]]]]] => Option[Target] = {
        ADTCoProductX1Self.util.appendSupport[Target, T1, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, ProZero1]]]]]]]], APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, CoZero2]]]]]]]]](ADTCoProductX1Self.inputHList8[Target,T2,T3,T4,T5,T6,T7,T8,T9])
      }
    

      def inputHList10[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, ProZero1]]]]]]]]]] => APCoProduct2[T1, APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, CoZero2]]]]]]]]]] => Option[Target] = {
        ADTCoProductX1Self.util.appendSupport[Target, T1, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, ProZero1]]]]]]]]], APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, CoZero2]]]]]]]]]](ADTCoProductX1Self.inputHList9[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10])
      }
    

      def inputHList11[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, ProZero1]]]]]]]]]]] => APCoProduct2[T1, APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, CoZero2]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX1Self.util.appendSupport[Target, T1, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, ProZero1]]]]]]]]]], APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, CoZero2]]]]]]]]]]](ADTCoProductX1Self.inputHList10[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11])
      }
    

      def inputHList12[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, ProZero1]]]]]]]]]]]] => APCoProduct2[T1, APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, APCoProduct2[T12, CoZero2]]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX1Self.util.appendSupport[Target, T1, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, ProZero1]]]]]]]]]]], APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, APCoProduct2[T12, CoZero2]]]]]]]]]]]](ADTCoProductX1Self.inputHList11[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12])
      }
    

      def inputHList13[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, ProZero1]]]]]]]]]]]]] => APCoProduct2[T1, APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, APCoProduct2[T12, APCoProduct2[T13, CoZero2]]]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX1Self.util.appendSupport[Target, T1, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, ProZero1]]]]]]]]]]]], APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, APCoProduct2[T12, APCoProduct2[T13, CoZero2]]]]]]]]]]]]](ADTCoProductX1Self.inputHList12[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13])
      }
    

      def inputHList14[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, ProZero1]]]]]]]]]]]]]] => APCoProduct2[T1, APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, APCoProduct2[T12, APCoProduct2[T13, APCoProduct2[T14, CoZero2]]]]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX1Self.util.appendSupport[Target, T1, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, ProZero1]]]]]]]]]]]]], APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, APCoProduct2[T12, APCoProduct2[T13, APCoProduct2[T14, CoZero2]]]]]]]]]]]]]](ADTCoProductX1Self.inputHList13[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14])
      }
    

      def inputHList15[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, ProZero1]]]]]]]]]]]]]]] => APCoProduct2[T1, APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, APCoProduct2[T12, APCoProduct2[T13, APCoProduct2[T14, APCoProduct2[T15, CoZero2]]]]]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX1Self.util.appendSupport[Target, T1, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, ProZero1]]]]]]]]]]]]]], APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, APCoProduct2[T12, APCoProduct2[T13, APCoProduct2[T14, APCoProduct2[T15, CoZero2]]]]]]]]]]]]]]](ADTCoProductX1Self.inputHList14[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15])
      }
    

      def inputHList16[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, ProZero1]]]]]]]]]]]]]]]] => APCoProduct2[T1, APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, APCoProduct2[T12, APCoProduct2[T13, APCoProduct2[T14, APCoProduct2[T15, APCoProduct2[T16, CoZero2]]]]]]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX1Self.util.appendSupport[Target, T1, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, ProZero1]]]]]]]]]]]]]]], APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, APCoProduct2[T12, APCoProduct2[T13, APCoProduct2[T14, APCoProduct2[T15, APCoProduct2[T16, CoZero2]]]]]]]]]]]]]]]](ADTCoProductX1Self.inputHList15[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16])
      }
    

      def inputHList17[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, ProZero1]]]]]]]]]]]]]]]]] => APCoProduct2[T1, APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, APCoProduct2[T12, APCoProduct2[T13, APCoProduct2[T14, APCoProduct2[T15, APCoProduct2[T16, APCoProduct2[T17, CoZero2]]]]]]]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX1Self.util.appendSupport[Target, T1, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, ProZero1]]]]]]]]]]]]]]]], APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, APCoProduct2[T12, APCoProduct2[T13, APCoProduct2[T14, APCoProduct2[T15, APCoProduct2[T16, APCoProduct2[T17, CoZero2]]]]]]]]]]]]]]]]](ADTCoProductX1Self.inputHList16[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17])
      }
    

      def inputHList18[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, ProZero1]]]]]]]]]]]]]]]]]] => APCoProduct2[T1, APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, APCoProduct2[T12, APCoProduct2[T13, APCoProduct2[T14, APCoProduct2[T15, APCoProduct2[T16, APCoProduct2[T17, APCoProduct2[T18, CoZero2]]]]]]]]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX1Self.util.appendSupport[Target, T1, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, ProZero1]]]]]]]]]]]]]]]]], APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, APCoProduct2[T12, APCoProduct2[T13, APCoProduct2[T14, APCoProduct2[T15, APCoProduct2[T16, APCoProduct2[T17, APCoProduct2[T18, CoZero2]]]]]]]]]]]]]]]]]](ADTCoProductX1Self.inputHList17[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18])
      }
    

      def inputHList19[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, APProduct1[T19 => Target, ProZero1]]]]]]]]]]]]]]]]]]] => APCoProduct2[T1, APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, APCoProduct2[T12, APCoProduct2[T13, APCoProduct2[T14, APCoProduct2[T15, APCoProduct2[T16, APCoProduct2[T17, APCoProduct2[T18, APCoProduct2[T19, CoZero2]]]]]]]]]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX1Self.util.appendSupport[Target, T1, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, APProduct1[T19 => Target, ProZero1]]]]]]]]]]]]]]]]]], APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, APCoProduct2[T12, APCoProduct2[T13, APCoProduct2[T14, APCoProduct2[T15, APCoProduct2[T16, APCoProduct2[T17, APCoProduct2[T18, APCoProduct2[T19, CoZero2]]]]]]]]]]]]]]]]]]](ADTCoProductX1Self.inputHList18[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19])
      }
    

      def inputHList20[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, APProduct1[T19 => Target, APProduct1[T20 => Target, ProZero1]]]]]]]]]]]]]]]]]]]] => APCoProduct2[T1, APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, APCoProduct2[T12, APCoProduct2[T13, APCoProduct2[T14, APCoProduct2[T15, APCoProduct2[T16, APCoProduct2[T17, APCoProduct2[T18, APCoProduct2[T19, APCoProduct2[T20, CoZero2]]]]]]]]]]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX1Self.util.appendSupport[Target, T1, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, APProduct1[T19 => Target, APProduct1[T20 => Target, ProZero1]]]]]]]]]]]]]]]]]]], APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, APCoProduct2[T12, APCoProduct2[T13, APCoProduct2[T14, APCoProduct2[T15, APCoProduct2[T16, APCoProduct2[T17, APCoProduct2[T18, APCoProduct2[T19, APCoProduct2[T20, CoZero2]]]]]]]]]]]]]]]]]]]](ADTCoProductX1Self.inputHList19[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20])
      }
    

      def inputHList21[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, APProduct1[T19 => Target, APProduct1[T20 => Target, APProduct1[T21 => Target, ProZero1]]]]]]]]]]]]]]]]]]]]] => APCoProduct2[T1, APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, APCoProduct2[T12, APCoProduct2[T13, APCoProduct2[T14, APCoProduct2[T15, APCoProduct2[T16, APCoProduct2[T17, APCoProduct2[T18, APCoProduct2[T19, APCoProduct2[T20, APCoProduct2[T21, CoZero2]]]]]]]]]]]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX1Self.util.appendSupport[Target, T1, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, APProduct1[T19 => Target, APProduct1[T20 => Target, APProduct1[T21 => Target, ProZero1]]]]]]]]]]]]]]]]]]]], APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, APCoProduct2[T12, APCoProduct2[T13, APCoProduct2[T14, APCoProduct2[T15, APCoProduct2[T16, APCoProduct2[T17, APCoProduct2[T18, APCoProduct2[T19, APCoProduct2[T20, APCoProduct2[T21, CoZero2]]]]]]]]]]]]]]]]]]]]](ADTCoProductX1Self.inputHList20[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21])
      }
    

      def inputHList22[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, APProduct1[T19 => Target, APProduct1[T20 => Target, APProduct1[T21 => Target, APProduct1[T22 => Target, ProZero1]]]]]]]]]]]]]]]]]]]]]] => APCoProduct2[T1, APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, APCoProduct2[T12, APCoProduct2[T13, APCoProduct2[T14, APCoProduct2[T15, APCoProduct2[T16, APCoProduct2[T17, APCoProduct2[T18, APCoProduct2[T19, APCoProduct2[T20, APCoProduct2[T21, APCoProduct2[T22, CoZero2]]]]]]]]]]]]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX1Self.util.appendSupport[Target, T1, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, APProduct1[T19 => Target, APProduct1[T20 => Target, APProduct1[T21 => Target, APProduct1[T22 => Target, ProZero1]]]]]]]]]]]]]]]]]]]]], APCoProduct2[T2, APCoProduct2[T3, APCoProduct2[T4, APCoProduct2[T5, APCoProduct2[T6, APCoProduct2[T7, APCoProduct2[T8, APCoProduct2[T9, APCoProduct2[T10, APCoProduct2[T11, APCoProduct2[T12, APCoProduct2[T13, APCoProduct2[T14, APCoProduct2[T15, APCoProduct2[T16, APCoProduct2[T17, APCoProduct2[T18, APCoProduct2[T19, APCoProduct2[T20, APCoProduct2[T21, APCoProduct2[T22, CoZero2]]]]]]]]]]]]]]]]]]]]]](ADTCoProductX1Self.inputHList21[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22])
      }
    

    }
  