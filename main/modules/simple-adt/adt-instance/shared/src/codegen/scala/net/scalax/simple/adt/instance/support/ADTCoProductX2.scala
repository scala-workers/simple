
    package net.scalax.simple.adt
    package instance
    package support

    trait ADTCoProductX2[Product1, APProduct1[_, _ <: Product1] <: Product1, ProZero1 <: Product1] extends
      ADTCoProductX2Helper[Product1, APProduct1, ProZero1] { ADTCoProductX2Self =>

      
      def inputHList1[
        Target,
        T1
      ](implicit cv1: T1 <:< Target): APProduct1[T1 => Target, ProZero1] = {
        ADTCoProductX2Self.hlistModelCompat.append[T1 => Target, ProZero1](cv1, ADTCoProductX2Self.inputHList0[Target])
      }
    

      def inputHList2[
        Target,
        T1,T2
      ](implicit cv1: T1 <:< Target,cv2: T2 <:< Target): APProduct1[T1 => Target, APProduct1[T2 => Target, ProZero1]] = {
        ADTCoProductX2Self.hlistModelCompat.append[T1 => Target, APProduct1[T2 => Target, ProZero1]](cv1, ADTCoProductX2Self.inputHList1[Target,T2])
      }
    

      def inputHList3[
        Target,
        T1,T2,T3
      ](implicit cv1: T1 <:< Target,cv2: T2 <:< Target,cv3: T3 <:< Target): APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, ProZero1]]] = {
        ADTCoProductX2Self.hlistModelCompat.append[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, ProZero1]]](cv1, ADTCoProductX2Self.inputHList2[Target,T2,T3])
      }
    

      def inputHList4[
        Target,
        T1,T2,T3,T4
      ](implicit cv1: T1 <:< Target,cv2: T2 <:< Target,cv3: T3 <:< Target,cv4: T4 <:< Target): APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, ProZero1]]]] = {
        ADTCoProductX2Self.hlistModelCompat.append[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, ProZero1]]]](cv1, ADTCoProductX2Self.inputHList3[Target,T2,T3,T4])
      }
    

      def inputHList5[
        Target,
        T1,T2,T3,T4,T5
      ](implicit cv1: T1 <:< Target,cv2: T2 <:< Target,cv3: T3 <:< Target,cv4: T4 <:< Target,cv5: T5 <:< Target): APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, ProZero1]]]]] = {
        ADTCoProductX2Self.hlistModelCompat.append[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, ProZero1]]]]](cv1, ADTCoProductX2Self.inputHList4[Target,T2,T3,T4,T5])
      }
    

      def inputHList6[
        Target,
        T1,T2,T3,T4,T5,T6
      ](implicit cv1: T1 <:< Target,cv2: T2 <:< Target,cv3: T3 <:< Target,cv4: T4 <:< Target,cv5: T5 <:< Target,cv6: T6 <:< Target): APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, ProZero1]]]]]] = {
        ADTCoProductX2Self.hlistModelCompat.append[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, ProZero1]]]]]](cv1, ADTCoProductX2Self.inputHList5[Target,T2,T3,T4,T5,T6])
      }
    

      def inputHList7[
        Target,
        T1,T2,T3,T4,T5,T6,T7
      ](implicit cv1: T1 <:< Target,cv2: T2 <:< Target,cv3: T3 <:< Target,cv4: T4 <:< Target,cv5: T5 <:< Target,cv6: T6 <:< Target,cv7: T7 <:< Target): APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, ProZero1]]]]]]] = {
        ADTCoProductX2Self.hlistModelCompat.append[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, ProZero1]]]]]]](cv1, ADTCoProductX2Self.inputHList6[Target,T2,T3,T4,T5,T6,T7])
      }
    

      def inputHList8[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8
      ](implicit cv1: T1 <:< Target,cv2: T2 <:< Target,cv3: T3 <:< Target,cv4: T4 <:< Target,cv5: T5 <:< Target,cv6: T6 <:< Target,cv7: T7 <:< Target,cv8: T8 <:< Target): APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, ProZero1]]]]]]]] = {
        ADTCoProductX2Self.hlistModelCompat.append[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, ProZero1]]]]]]]](cv1, ADTCoProductX2Self.inputHList7[Target,T2,T3,T4,T5,T6,T7,T8])
      }
    

      def inputHList9[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9
      ](implicit cv1: T1 <:< Target,cv2: T2 <:< Target,cv3: T3 <:< Target,cv4: T4 <:< Target,cv5: T5 <:< Target,cv6: T6 <:< Target,cv7: T7 <:< Target,cv8: T8 <:< Target,cv9: T9 <:< Target): APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, ProZero1]]]]]]]]] = {
        ADTCoProductX2Self.hlistModelCompat.append[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, ProZero1]]]]]]]]](cv1, ADTCoProductX2Self.inputHList8[Target,T2,T3,T4,T5,T6,T7,T8,T9])
      }
    

      def inputHList10[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10
      ](implicit cv1: T1 <:< Target,cv2: T2 <:< Target,cv3: T3 <:< Target,cv4: T4 <:< Target,cv5: T5 <:< Target,cv6: T6 <:< Target,cv7: T7 <:< Target,cv8: T8 <:< Target,cv9: T9 <:< Target,cv10: T10 <:< Target): APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, ProZero1]]]]]]]]]] = {
        ADTCoProductX2Self.hlistModelCompat.append[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, ProZero1]]]]]]]]]](cv1, ADTCoProductX2Self.inputHList9[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10])
      }
    

      def inputHList11[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11
      ](implicit cv1: T1 <:< Target,cv2: T2 <:< Target,cv3: T3 <:< Target,cv4: T4 <:< Target,cv5: T5 <:< Target,cv6: T6 <:< Target,cv7: T7 <:< Target,cv8: T8 <:< Target,cv9: T9 <:< Target,cv10: T10 <:< Target,cv11: T11 <:< Target): APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, ProZero1]]]]]]]]]]] = {
        ADTCoProductX2Self.hlistModelCompat.append[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, ProZero1]]]]]]]]]]](cv1, ADTCoProductX2Self.inputHList10[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11])
      }
    

      def inputHList12[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12
      ](implicit cv1: T1 <:< Target,cv2: T2 <:< Target,cv3: T3 <:< Target,cv4: T4 <:< Target,cv5: T5 <:< Target,cv6: T6 <:< Target,cv7: T7 <:< Target,cv8: T8 <:< Target,cv9: T9 <:< Target,cv10: T10 <:< Target,cv11: T11 <:< Target,cv12: T12 <:< Target): APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, ProZero1]]]]]]]]]]]] = {
        ADTCoProductX2Self.hlistModelCompat.append[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, ProZero1]]]]]]]]]]]](cv1, ADTCoProductX2Self.inputHList11[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12])
      }
    

      def inputHList13[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13
      ](implicit cv1: T1 <:< Target,cv2: T2 <:< Target,cv3: T3 <:< Target,cv4: T4 <:< Target,cv5: T5 <:< Target,cv6: T6 <:< Target,cv7: T7 <:< Target,cv8: T8 <:< Target,cv9: T9 <:< Target,cv10: T10 <:< Target,cv11: T11 <:< Target,cv12: T12 <:< Target,cv13: T13 <:< Target): APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, ProZero1]]]]]]]]]]]]] = {
        ADTCoProductX2Self.hlistModelCompat.append[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, ProZero1]]]]]]]]]]]]](cv1, ADTCoProductX2Self.inputHList12[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13])
      }
    

      def inputHList14[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14
      ](implicit cv1: T1 <:< Target,cv2: T2 <:< Target,cv3: T3 <:< Target,cv4: T4 <:< Target,cv5: T5 <:< Target,cv6: T6 <:< Target,cv7: T7 <:< Target,cv8: T8 <:< Target,cv9: T9 <:< Target,cv10: T10 <:< Target,cv11: T11 <:< Target,cv12: T12 <:< Target,cv13: T13 <:< Target,cv14: T14 <:< Target): APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, ProZero1]]]]]]]]]]]]]] = {
        ADTCoProductX2Self.hlistModelCompat.append[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, ProZero1]]]]]]]]]]]]]](cv1, ADTCoProductX2Self.inputHList13[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14])
      }
    

      def inputHList15[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15
      ](implicit cv1: T1 <:< Target,cv2: T2 <:< Target,cv3: T3 <:< Target,cv4: T4 <:< Target,cv5: T5 <:< Target,cv6: T6 <:< Target,cv7: T7 <:< Target,cv8: T8 <:< Target,cv9: T9 <:< Target,cv10: T10 <:< Target,cv11: T11 <:< Target,cv12: T12 <:< Target,cv13: T13 <:< Target,cv14: T14 <:< Target,cv15: T15 <:< Target): APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, ProZero1]]]]]]]]]]]]]]] = {
        ADTCoProductX2Self.hlistModelCompat.append[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, ProZero1]]]]]]]]]]]]]]](cv1, ADTCoProductX2Self.inputHList14[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15])
      }
    

      def inputHList16[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16
      ](implicit cv1: T1 <:< Target,cv2: T2 <:< Target,cv3: T3 <:< Target,cv4: T4 <:< Target,cv5: T5 <:< Target,cv6: T6 <:< Target,cv7: T7 <:< Target,cv8: T8 <:< Target,cv9: T9 <:< Target,cv10: T10 <:< Target,cv11: T11 <:< Target,cv12: T12 <:< Target,cv13: T13 <:< Target,cv14: T14 <:< Target,cv15: T15 <:< Target,cv16: T16 <:< Target): APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, ProZero1]]]]]]]]]]]]]]]] = {
        ADTCoProductX2Self.hlistModelCompat.append[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, ProZero1]]]]]]]]]]]]]]]](cv1, ADTCoProductX2Self.inputHList15[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16])
      }
    

      def inputHList17[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17
      ](implicit cv1: T1 <:< Target,cv2: T2 <:< Target,cv3: T3 <:< Target,cv4: T4 <:< Target,cv5: T5 <:< Target,cv6: T6 <:< Target,cv7: T7 <:< Target,cv8: T8 <:< Target,cv9: T9 <:< Target,cv10: T10 <:< Target,cv11: T11 <:< Target,cv12: T12 <:< Target,cv13: T13 <:< Target,cv14: T14 <:< Target,cv15: T15 <:< Target,cv16: T16 <:< Target,cv17: T17 <:< Target): APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, ProZero1]]]]]]]]]]]]]]]]] = {
        ADTCoProductX2Self.hlistModelCompat.append[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, ProZero1]]]]]]]]]]]]]]]]](cv1, ADTCoProductX2Self.inputHList16[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17])
      }
    

      def inputHList18[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18
      ](implicit cv1: T1 <:< Target,cv2: T2 <:< Target,cv3: T3 <:< Target,cv4: T4 <:< Target,cv5: T5 <:< Target,cv6: T6 <:< Target,cv7: T7 <:< Target,cv8: T8 <:< Target,cv9: T9 <:< Target,cv10: T10 <:< Target,cv11: T11 <:< Target,cv12: T12 <:< Target,cv13: T13 <:< Target,cv14: T14 <:< Target,cv15: T15 <:< Target,cv16: T16 <:< Target,cv17: T17 <:< Target,cv18: T18 <:< Target): APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, ProZero1]]]]]]]]]]]]]]]]]] = {
        ADTCoProductX2Self.hlistModelCompat.append[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, ProZero1]]]]]]]]]]]]]]]]]](cv1, ADTCoProductX2Self.inputHList17[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18])
      }
    

      def inputHList19[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19
      ](implicit cv1: T1 <:< Target,cv2: T2 <:< Target,cv3: T3 <:< Target,cv4: T4 <:< Target,cv5: T5 <:< Target,cv6: T6 <:< Target,cv7: T7 <:< Target,cv8: T8 <:< Target,cv9: T9 <:< Target,cv10: T10 <:< Target,cv11: T11 <:< Target,cv12: T12 <:< Target,cv13: T13 <:< Target,cv14: T14 <:< Target,cv15: T15 <:< Target,cv16: T16 <:< Target,cv17: T17 <:< Target,cv18: T18 <:< Target,cv19: T19 <:< Target): APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, APProduct1[T19 => Target, ProZero1]]]]]]]]]]]]]]]]]]] = {
        ADTCoProductX2Self.hlistModelCompat.append[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, APProduct1[T19 => Target, ProZero1]]]]]]]]]]]]]]]]]]](cv1, ADTCoProductX2Self.inputHList18[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19])
      }
    

      def inputHList20[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20
      ](implicit cv1: T1 <:< Target,cv2: T2 <:< Target,cv3: T3 <:< Target,cv4: T4 <:< Target,cv5: T5 <:< Target,cv6: T6 <:< Target,cv7: T7 <:< Target,cv8: T8 <:< Target,cv9: T9 <:< Target,cv10: T10 <:< Target,cv11: T11 <:< Target,cv12: T12 <:< Target,cv13: T13 <:< Target,cv14: T14 <:< Target,cv15: T15 <:< Target,cv16: T16 <:< Target,cv17: T17 <:< Target,cv18: T18 <:< Target,cv19: T19 <:< Target,cv20: T20 <:< Target): APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, APProduct1[T19 => Target, APProduct1[T20 => Target, ProZero1]]]]]]]]]]]]]]]]]]]] = {
        ADTCoProductX2Self.hlistModelCompat.append[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, APProduct1[T19 => Target, APProduct1[T20 => Target, ProZero1]]]]]]]]]]]]]]]]]]]](cv1, ADTCoProductX2Self.inputHList19[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20])
      }
    

      def inputHList21[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21
      ](implicit cv1: T1 <:< Target,cv2: T2 <:< Target,cv3: T3 <:< Target,cv4: T4 <:< Target,cv5: T5 <:< Target,cv6: T6 <:< Target,cv7: T7 <:< Target,cv8: T8 <:< Target,cv9: T9 <:< Target,cv10: T10 <:< Target,cv11: T11 <:< Target,cv12: T12 <:< Target,cv13: T13 <:< Target,cv14: T14 <:< Target,cv15: T15 <:< Target,cv16: T16 <:< Target,cv17: T17 <:< Target,cv18: T18 <:< Target,cv19: T19 <:< Target,cv20: T20 <:< Target,cv21: T21 <:< Target): APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, APProduct1[T19 => Target, APProduct1[T20 => Target, APProduct1[T21 => Target, ProZero1]]]]]]]]]]]]]]]]]]]]] = {
        ADTCoProductX2Self.hlistModelCompat.append[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, APProduct1[T19 => Target, APProduct1[T20 => Target, APProduct1[T21 => Target, ProZero1]]]]]]]]]]]]]]]]]]]]](cv1, ADTCoProductX2Self.inputHList20[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21])
      }
    

      def inputHList22[
        Target,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22
      ](implicit cv1: T1 <:< Target,cv2: T2 <:< Target,cv3: T3 <:< Target,cv4: T4 <:< Target,cv5: T5 <:< Target,cv6: T6 <:< Target,cv7: T7 <:< Target,cv8: T8 <:< Target,cv9: T9 <:< Target,cv10: T10 <:< Target,cv11: T11 <:< Target,cv12: T12 <:< Target,cv13: T13 <:< Target,cv14: T14 <:< Target,cv15: T15 <:< Target,cv16: T16 <:< Target,cv17: T17 <:< Target,cv18: T18 <:< Target,cv19: T19 <:< Target,cv20: T20 <:< Target,cv21: T21 <:< Target,cv22: T22 <:< Target): APProduct1[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, APProduct1[T19 => Target, APProduct1[T20 => Target, APProduct1[T21 => Target, APProduct1[T22 => Target, ProZero1]]]]]]]]]]]]]]]]]]]]]] = {
        ADTCoProductX2Self.hlistModelCompat.append[T1 => Target, APProduct1[T2 => Target, APProduct1[T3 => Target, APProduct1[T4 => Target, APProduct1[T5 => Target, APProduct1[T6 => Target, APProduct1[T7 => Target, APProduct1[T8 => Target, APProduct1[T9 => Target, APProduct1[T10 => Target, APProduct1[T11 => Target, APProduct1[T12 => Target, APProduct1[T13 => Target, APProduct1[T14 => Target, APProduct1[T15 => Target, APProduct1[T16 => Target, APProduct1[T17 => Target, APProduct1[T18 => Target, APProduct1[T19 => Target, APProduct1[T20 => Target, APProduct1[T21 => Target, APProduct1[T22 => Target, ProZero1]]]]]]]]]]]]]]]]]]]]]](cv1, ADTCoProductX2Self.inputHList21[Target,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22])
      }
    

    }
  