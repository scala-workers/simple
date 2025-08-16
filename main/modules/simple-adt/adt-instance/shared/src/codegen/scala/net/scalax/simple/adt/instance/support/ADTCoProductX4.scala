
    package net.scalax.simple.adt
    package instance
    package support

    trait ADTCoProductX4[CoProduct1, APCoProduct1[_, _ <: CoProduct1] <: CoProduct1, CoZero1 <: CoProduct1] extends
      ADTCoProductX4Helper[CoProduct1, APCoProduct1, CoZero1] { ADTCoProductX4Self =>

      
      def inputHList1[
        Target,
        T1 <: Target
      ]: APCoProduct1[T1, CoZero1] => Option[Target] = {
        ADTCoProductX4Self.supportX1.inputHList1[Target, T1](ADTCoProductX4Self.supportX3.inputHList1[Target, T1])
      }
    

      def inputHList2[
        Target,
        T1 <: Target,T2 <: Target
      ]: APCoProduct1[T1, APCoProduct1[T2, CoZero1]] => Option[Target] = {
        ADTCoProductX4Self.supportX1.inputHList2[Target, T1,T2](ADTCoProductX4Self.supportX3.inputHList2[Target, T1,T2])
      }
    

      def inputHList3[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target
      ]: APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, CoZero1]]] => Option[Target] = {
        ADTCoProductX4Self.supportX1.inputHList3[Target, T1,T2,T3](ADTCoProductX4Self.supportX3.inputHList3[Target, T1,T2,T3])
      }
    

      def inputHList4[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target
      ]: APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, CoZero1]]]] => Option[Target] = {
        ADTCoProductX4Self.supportX1.inputHList4[Target, T1,T2,T3,T4](ADTCoProductX4Self.supportX3.inputHList4[Target, T1,T2,T3,T4])
      }
    

      def inputHList5[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target
      ]: APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, CoZero1]]]]] => Option[Target] = {
        ADTCoProductX4Self.supportX1.inputHList5[Target, T1,T2,T3,T4,T5](ADTCoProductX4Self.supportX3.inputHList5[Target, T1,T2,T3,T4,T5])
      }
    

      def inputHList6[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target
      ]: APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, CoZero1]]]]]] => Option[Target] = {
        ADTCoProductX4Self.supportX1.inputHList6[Target, T1,T2,T3,T4,T5,T6](ADTCoProductX4Self.supportX3.inputHList6[Target, T1,T2,T3,T4,T5,T6])
      }
    

      def inputHList7[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target
      ]: APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, CoZero1]]]]]]] => Option[Target] = {
        ADTCoProductX4Self.supportX1.inputHList7[Target, T1,T2,T3,T4,T5,T6,T7](ADTCoProductX4Self.supportX3.inputHList7[Target, T1,T2,T3,T4,T5,T6,T7])
      }
    

      def inputHList8[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target
      ]: APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, CoZero1]]]]]]]] => Option[Target] = {
        ADTCoProductX4Self.supportX1.inputHList8[Target, T1,T2,T3,T4,T5,T6,T7,T8](ADTCoProductX4Self.supportX3.inputHList8[Target, T1,T2,T3,T4,T5,T6,T7,T8])
      }
    

      def inputHList9[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target
      ]: APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, CoZero1]]]]]]]]] => Option[Target] = {
        ADTCoProductX4Self.supportX1.inputHList9[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9](ADTCoProductX4Self.supportX3.inputHList9[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9])
      }
    

      def inputHList10[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target
      ]: APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, CoZero1]]]]]]]]]] => Option[Target] = {
        ADTCoProductX4Self.supportX1.inputHList10[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](ADTCoProductX4Self.supportX3.inputHList10[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10])
      }
    

      def inputHList11[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target
      ]: APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, CoZero1]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX4Self.supportX1.inputHList11[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](ADTCoProductX4Self.supportX3.inputHList11[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11])
      }
    

      def inputHList12[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target,T12 <: Target
      ]: APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, CoZero1]]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX4Self.supportX1.inputHList12[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](ADTCoProductX4Self.supportX3.inputHList12[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12])
      }
    

      def inputHList13[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target,T12 <: Target,T13 <: Target
      ]: APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, CoZero1]]]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX4Self.supportX1.inputHList13[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](ADTCoProductX4Self.supportX3.inputHList13[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13])
      }
    

      def inputHList14[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target,T12 <: Target,T13 <: Target,T14 <: Target
      ]: APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, CoZero1]]]]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX4Self.supportX1.inputHList14[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](ADTCoProductX4Self.supportX3.inputHList14[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14])
      }
    

      def inputHList15[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target,T12 <: Target,T13 <: Target,T14 <: Target,T15 <: Target
      ]: APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, CoZero1]]]]]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX4Self.supportX1.inputHList15[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](ADTCoProductX4Self.supportX3.inputHList15[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15])
      }
    

      def inputHList16[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target,T12 <: Target,T13 <: Target,T14 <: Target,T15 <: Target,T16 <: Target
      ]: APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, APCoProduct1[T16, CoZero1]]]]]]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX4Self.supportX1.inputHList16[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](ADTCoProductX4Self.supportX3.inputHList16[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16])
      }
    

      def inputHList17[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target,T12 <: Target,T13 <: Target,T14 <: Target,T15 <: Target,T16 <: Target,T17 <: Target
      ]: APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, APCoProduct1[T16, APCoProduct1[T17, CoZero1]]]]]]]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX4Self.supportX1.inputHList17[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](ADTCoProductX4Self.supportX3.inputHList17[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17])
      }
    

      def inputHList18[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target,T12 <: Target,T13 <: Target,T14 <: Target,T15 <: Target,T16 <: Target,T17 <: Target,T18 <: Target
      ]: APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, APCoProduct1[T16, APCoProduct1[T17, APCoProduct1[T18, CoZero1]]]]]]]]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX4Self.supportX1.inputHList18[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](ADTCoProductX4Self.supportX3.inputHList18[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18])
      }
    

      def inputHList19[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target,T12 <: Target,T13 <: Target,T14 <: Target,T15 <: Target,T16 <: Target,T17 <: Target,T18 <: Target,T19 <: Target
      ]: APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, APCoProduct1[T16, APCoProduct1[T17, APCoProduct1[T18, APCoProduct1[T19, CoZero1]]]]]]]]]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX4Self.supportX1.inputHList19[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](ADTCoProductX4Self.supportX3.inputHList19[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19])
      }
    

      def inputHList20[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target,T12 <: Target,T13 <: Target,T14 <: Target,T15 <: Target,T16 <: Target,T17 <: Target,T18 <: Target,T19 <: Target,T20 <: Target
      ]: APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, APCoProduct1[T16, APCoProduct1[T17, APCoProduct1[T18, APCoProduct1[T19, APCoProduct1[T20, CoZero1]]]]]]]]]]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX4Self.supportX1.inputHList20[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](ADTCoProductX4Self.supportX3.inputHList20[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20])
      }
    

      def inputHList21[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target,T12 <: Target,T13 <: Target,T14 <: Target,T15 <: Target,T16 <: Target,T17 <: Target,T18 <: Target,T19 <: Target,T20 <: Target,T21 <: Target
      ]: APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, APCoProduct1[T16, APCoProduct1[T17, APCoProduct1[T18, APCoProduct1[T19, APCoProduct1[T20, APCoProduct1[T21, CoZero1]]]]]]]]]]]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX4Self.supportX1.inputHList21[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](ADTCoProductX4Self.supportX3.inputHList21[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21])
      }
    

      def inputHList22[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target,T12 <: Target,T13 <: Target,T14 <: Target,T15 <: Target,T16 <: Target,T17 <: Target,T18 <: Target,T19 <: Target,T20 <: Target,T21 <: Target,T22 <: Target
      ]: APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, APCoProduct1[T16, APCoProduct1[T17, APCoProduct1[T18, APCoProduct1[T19, APCoProduct1[T20, APCoProduct1[T21, APCoProduct1[T22, CoZero1]]]]]]]]]]]]]]]]]]]]]] => Option[Target] = {
        ADTCoProductX4Self.supportX1.inputHList22[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](ADTCoProductX4Self.supportX3.inputHList22[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22])
      }
    

    }
  