
    package net.scalax.simple.adt
    package instance
    package support

    trait ADTCoProductX3[Product1, APProduct1[_, _ <: Product1] <: Product1, ProZero1 <: Product1] extends
      ADTCoProductX3Helper[Product1, APProduct1, ProZero1] { ADTCoProductX3Self =>

      
      def inputHList1[
        Target,
        T1 <: Target
      ]: APProduct1[T1 => Target, ProZero1] = {
        ADTCoProductX3Self.supportX2.inputHList1[Target, T1]
      }
    

      def inputHList2[
        Target,
        T1 <: Target,T2 <: Target
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, ProZero1]] = {
        ADTCoProductX3Self.supportX2.inputHList2[Target, T1,T2]
      }
    

      def inputHList3[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, ProZero1]]] = {
        ADTCoProductX3Self.supportX2.inputHList3[Target, T1,T2,T3]
      }
    

      def inputHList4[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, ProZero1]]]] = {
        ADTCoProductX3Self.supportX2.inputHList4[Target, T1,T2,T3,T4]
      }
    

      def inputHList5[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, ProZero1]]]]] = {
        ADTCoProductX3Self.supportX2.inputHList5[Target, T1,T2,T3,T4,T5]
      }
    

      def inputHList6[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, ProZero1]]]]]] = {
        ADTCoProductX3Self.supportX2.inputHList6[Target, T1,T2,T3,T4,T5,T6]
      }
    

      def inputHList7[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, ProZero1]]]]]]] = {
        ADTCoProductX3Self.supportX2.inputHList7[Target, T1,T2,T3,T4,T5,T6,T7]
      }
    

      def inputHList8[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, ProZero1]]]]]]]] = {
        ADTCoProductX3Self.supportX2.inputHList8[Target, T1,T2,T3,T4,T5,T6,T7,T8]
      }
    

      def inputHList9[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, ProZero1]]]]]]]]] = {
        ADTCoProductX3Self.supportX2.inputHList9[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9]
      }
    

      def inputHList10[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, ProZero1]]]]]]]]]] = {
        ADTCoProductX3Self.supportX2.inputHList10[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]
      }
    

      def inputHList11[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, ProZero1]]]]]]]]]]] = {
        ADTCoProductX3Self.supportX2.inputHList11[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]
      }
    

      def inputHList12[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target,T12 <: Target
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, ProZero1]]]]]]]]]]]] = {
        ADTCoProductX3Self.supportX2.inputHList12[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]
      }
    

      def inputHList13[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target,T12 <: Target,T13 <: Target
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, ProZero1]]]]]]]]]]]]] = {
        ADTCoProductX3Self.supportX2.inputHList13[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]
      }
    

      def inputHList14[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target,T12 <: Target,T13 <: Target,T14 <: Target
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, ProZero1]]]]]]]]]]]]]] = {
        ADTCoProductX3Self.supportX2.inputHList14[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]
      }
    

      def inputHList15[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target,T12 <: Target,T13 <: Target,T14 <: Target,T15 <: Target
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, ProZero1]]]]]]]]]]]]]]] = {
        ADTCoProductX3Self.supportX2.inputHList15[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
      }
    

      def inputHList16[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target,T12 <: Target,T13 <: Target,T14 <: Target,T15 <: Target,T16 <: Target
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, ProZero1]]]]]]]]]]]]]]]] = {
        ADTCoProductX3Self.supportX2.inputHList16[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
      }
    

      def inputHList17[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target,T12 <: Target,T13 <: Target,T14 <: Target,T15 <: Target,T16 <: Target,T17 <: Target
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, ProZero1]]]]]]]]]]]]]]]]] = {
        ADTCoProductX3Self.supportX2.inputHList17[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
      }
    

      def inputHList18[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target,T12 <: Target,T13 <: Target,T14 <: Target,T15 <: Target,T16 <: Target,T17 <: Target,T18 <: Target
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, ProZero1]]]]]]]]]]]]]]]]]] = {
        ADTCoProductX3Self.supportX2.inputHList18[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
      }
    

      def inputHList19[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target,T12 <: Target,T13 <: Target,T14 <: Target,T15 <: Target,T16 <: Target,T17 <: Target,T18 <: Target,T19 <: Target
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, APProduct1[T19 => Target, ProZero1]]]]]]]]]]]]]]]]]]] = {
        ADTCoProductX3Self.supportX2.inputHList19[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
      }
    

      def inputHList20[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target,T12 <: Target,T13 <: Target,T14 <: Target,T15 <: Target,T16 <: Target,T17 <: Target,T18 <: Target,T19 <: Target,T20 <: Target
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, APProduct1[T19 => Target, APProduct1[T20 => Target, ProZero1]]]]]]]]]]]]]]]]]]]] = {
        ADTCoProductX3Self.supportX2.inputHList20[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
      }
    

      def inputHList21[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target,T12 <: Target,T13 <: Target,T14 <: Target,T15 <: Target,T16 <: Target,T17 <: Target,T18 <: Target,T19 <: Target,T20 <: Target,T21 <: Target
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, APProduct1[T19 => Target, APProduct1[T20 => Target, APProduct1[T21 => Target, ProZero1]]]]]]]]]]]]]]]]]]]]] = {
        ADTCoProductX3Self.supportX2.inputHList21[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
      }
    

      def inputHList22[
        Target,
        T1 <: Target,T2 <: Target,T3 <: Target,T4 <: Target,T5 <: Target,T6 <: Target,T7 <: Target,T8 <: Target,T9 <: Target,T10 <: Target,T11 <: Target,T12 <: Target,T13 <: Target,T14 <: Target,T15 <: Target,T16 <: Target,T17 <: Target,T18 <: Target,T19 <: Target,T20 <: Target,T21 <: Target,T22 <: Target
      ]: APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, APProduct1[T19 => Target, APProduct1[T20 => Target, APProduct1[T21 => Target, APProduct1[T22 => Target, ProZero1]]]]]]]]]]]]]]]]]]]]]] = {
        ADTCoProductX3Self.supportX2.inputHList22[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
      }
    

    }
  