
    package net.scalax.simple.adt
    package instance
    package support

    trait AdtFunctionSupport[
      CoProduct1, APCoProduct1[_, _ <: CoProduct1] <: CoProduct1,
      Product2, APProduct2[_, _ <: Product2] <: Product2,
      CoProduct3, APCoProduct3[_, _ <: CoProduct3] <: CoProduct3
    ] extends AdtFunctionSupportAbs[CoProduct1, APCoProduct1, Product2, APProduct2, CoProduct3, APCoProduct3] {
      AdtFunctionSupportSelf =>

      
      def inputHList2[T1,T2, N1,N2]: (APCoProduct1[T1, APCoProduct1[T2, CoProduct1]], APProduct2[T1 => N1, APProduct2[T2 => N2, Product2]]) => APCoProduct3[N1, APCoProduct3[N2, CoProduct3]] = {
        
      AdtFunctionSupportSelf.appendSimpleAdt.next[T1, N1, APCoProduct1[T2, CoProduct1], APProduct2[T2 => N2, Product2], APCoProduct3[N2, CoProduct3]](
        AdtFunctionSupportSelf.inputHList1[T2, N2]
      )
    
      }
    

      def inputHList3[T1,T2,T3, N1,N2,N3]: (APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, CoProduct1]]], APProduct2[T1 => N1, APProduct2[T2 => N2, APProduct2[T3 => N3, Product2]]]) => APCoProduct3[N1, APCoProduct3[N2, APCoProduct3[N3, CoProduct3]]] = {
        
      AdtFunctionSupportSelf.appendSimpleAdt.next[T1, N1, APCoProduct1[T2, APCoProduct1[T3, CoProduct1]], APProduct2[T2 => N2, APProduct2[T3 => N3, Product2]], APCoProduct3[N2, APCoProduct3[N3, CoProduct3]]](
        AdtFunctionSupportSelf.inputHList2[T2,T3, N2,N3]
      )
    
      }
    

      def inputHList4[T1,T2,T3,T4, N1,N2,N3,N4]: (APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, CoProduct1]]]], APProduct2[T1 => N1, APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, Product2]]]]) => APCoProduct3[N1, APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, CoProduct3]]]] = {
        
      AdtFunctionSupportSelf.appendSimpleAdt.next[T1, N1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, CoProduct1]]], APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, Product2]]], APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, CoProduct3]]]](
        AdtFunctionSupportSelf.inputHList3[T2,T3,T4, N2,N3,N4]
      )
    
      }
    

      def inputHList5[T1,T2,T3,T4,T5, N1,N2,N3,N4,N5]: (APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, CoProduct1]]]]], APProduct2[T1 => N1, APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, Product2]]]]]) => APCoProduct3[N1, APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, CoProduct3]]]]] = {
        
      AdtFunctionSupportSelf.appendSimpleAdt.next[T1, N1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, CoProduct1]]]], APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, Product2]]]], APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, CoProduct3]]]]](
        AdtFunctionSupportSelf.inputHList4[T2,T3,T4,T5, N2,N3,N4,N5]
      )
    
      }
    

      def inputHList6[T1,T2,T3,T4,T5,T6, N1,N2,N3,N4,N5,N6]: (APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, CoProduct1]]]]]], APProduct2[T1 => N1, APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, Product2]]]]]]) => APCoProduct3[N1, APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, CoProduct3]]]]]] = {
        
      AdtFunctionSupportSelf.appendSimpleAdt.next[T1, N1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, CoProduct1]]]]], APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, Product2]]]]], APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, CoProduct3]]]]]](
        AdtFunctionSupportSelf.inputHList5[T2,T3,T4,T5,T6, N2,N3,N4,N5,N6]
      )
    
      }
    

      def inputHList7[T1,T2,T3,T4,T5,T6,T7, N1,N2,N3,N4,N5,N6,N7]: (APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, CoProduct1]]]]]]], APProduct2[T1 => N1, APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, Product2]]]]]]]) => APCoProduct3[N1, APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, CoProduct3]]]]]]] = {
        
      AdtFunctionSupportSelf.appendSimpleAdt.next[T1, N1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, CoProduct1]]]]]], APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, Product2]]]]]], APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, CoProduct3]]]]]]](
        AdtFunctionSupportSelf.inputHList6[T2,T3,T4,T5,T6,T7, N2,N3,N4,N5,N6,N7]
      )
    
      }
    

      def inputHList8[T1,T2,T3,T4,T5,T6,T7,T8, N1,N2,N3,N4,N5,N6,N7,N8]: (APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, CoProduct1]]]]]]]], APProduct2[T1 => N1, APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, Product2]]]]]]]]) => APCoProduct3[N1, APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, CoProduct3]]]]]]]] = {
        
      AdtFunctionSupportSelf.appendSimpleAdt.next[T1, N1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, CoProduct1]]]]]]], APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, Product2]]]]]]], APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, CoProduct3]]]]]]]](
        AdtFunctionSupportSelf.inputHList7[T2,T3,T4,T5,T6,T7,T8, N2,N3,N4,N5,N6,N7,N8]
      )
    
      }
    

      def inputHList9[T1,T2,T3,T4,T5,T6,T7,T8,T9, N1,N2,N3,N4,N5,N6,N7,N8,N9]: (APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, CoProduct1]]]]]]]]], APProduct2[T1 => N1, APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, Product2]]]]]]]]]) => APCoProduct3[N1, APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, CoProduct3]]]]]]]]] = {
        
      AdtFunctionSupportSelf.appendSimpleAdt.next[T1, N1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, CoProduct1]]]]]]]], APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, Product2]]]]]]]], APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, CoProduct3]]]]]]]]](
        AdtFunctionSupportSelf.inputHList8[T2,T3,T4,T5,T6,T7,T8,T9, N2,N3,N4,N5,N6,N7,N8,N9]
      )
    
      }
    

      def inputHList10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10]: (APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, CoProduct1]]]]]]]]]], APProduct2[T1 => N1, APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, Product2]]]]]]]]]]) => APCoProduct3[N1, APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, CoProduct3]]]]]]]]]] = {
        
      AdtFunctionSupportSelf.appendSimpleAdt.next[T1, N1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, CoProduct1]]]]]]]]], APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, Product2]]]]]]]]], APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, CoProduct3]]]]]]]]]](
        AdtFunctionSupportSelf.inputHList9[T2,T3,T4,T5,T6,T7,T8,T9,T10, N2,N3,N4,N5,N6,N7,N8,N9,N10]
      )
    
      }
    

      def inputHList11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11]: (APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, CoProduct1]]]]]]]]]]], APProduct2[T1 => N1, APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, Product2]]]]]]]]]]]) => APCoProduct3[N1, APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, CoProduct3]]]]]]]]]]] = {
        
      AdtFunctionSupportSelf.appendSimpleAdt.next[T1, N1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, CoProduct1]]]]]]]]]], APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, Product2]]]]]]]]]], APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, CoProduct3]]]]]]]]]]](
        AdtFunctionSupportSelf.inputHList10[T2,T3,T4,T5,T6,T7,T8,T9,T10,T11, N2,N3,N4,N5,N6,N7,N8,N9,N10,N11]
      )
    
      }
    

      def inputHList12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12]: (APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, CoProduct1]]]]]]]]]]]], APProduct2[T1 => N1, APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, APProduct2[T12 => N12, Product2]]]]]]]]]]]]) => APCoProduct3[N1, APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, APCoProduct3[N12, CoProduct3]]]]]]]]]]]] = {
        
      AdtFunctionSupportSelf.appendSimpleAdt.next[T1, N1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, CoProduct1]]]]]]]]]]], APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, APProduct2[T12 => N12, Product2]]]]]]]]]]], APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, APCoProduct3[N12, CoProduct3]]]]]]]]]]]](
        AdtFunctionSupportSelf.inputHList11[T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12, N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12]
      )
    
      }
    

      def inputHList13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13]: (APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, CoProduct1]]]]]]]]]]]]], APProduct2[T1 => N1, APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, APProduct2[T12 => N12, APProduct2[T13 => N13, Product2]]]]]]]]]]]]]) => APCoProduct3[N1, APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, APCoProduct3[N12, APCoProduct3[N13, CoProduct3]]]]]]]]]]]]] = {
        
      AdtFunctionSupportSelf.appendSimpleAdt.next[T1, N1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, CoProduct1]]]]]]]]]]]], APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, APProduct2[T12 => N12, APProduct2[T13 => N13, Product2]]]]]]]]]]]], APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, APCoProduct3[N12, APCoProduct3[N13, CoProduct3]]]]]]]]]]]]](
        AdtFunctionSupportSelf.inputHList12[T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13, N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13]
      )
    
      }
    

      def inputHList14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14]: (APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, CoProduct1]]]]]]]]]]]]]], APProduct2[T1 => N1, APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, APProduct2[T12 => N12, APProduct2[T13 => N13, APProduct2[T14 => N14, Product2]]]]]]]]]]]]]]) => APCoProduct3[N1, APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, APCoProduct3[N12, APCoProduct3[N13, APCoProduct3[N14, CoProduct3]]]]]]]]]]]]]] = {
        
      AdtFunctionSupportSelf.appendSimpleAdt.next[T1, N1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, CoProduct1]]]]]]]]]]]]], APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, APProduct2[T12 => N12, APProduct2[T13 => N13, APProduct2[T14 => N14, Product2]]]]]]]]]]]]], APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, APCoProduct3[N12, APCoProduct3[N13, APCoProduct3[N14, CoProduct3]]]]]]]]]]]]]](
        AdtFunctionSupportSelf.inputHList13[T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14, N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14]
      )
    
      }
    

      def inputHList15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15]: (APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, CoProduct1]]]]]]]]]]]]]]], APProduct2[T1 => N1, APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, APProduct2[T12 => N12, APProduct2[T13 => N13, APProduct2[T14 => N14, APProduct2[T15 => N15, Product2]]]]]]]]]]]]]]]) => APCoProduct3[N1, APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, APCoProduct3[N12, APCoProduct3[N13, APCoProduct3[N14, APCoProduct3[N15, CoProduct3]]]]]]]]]]]]]]] = {
        
      AdtFunctionSupportSelf.appendSimpleAdt.next[T1, N1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, CoProduct1]]]]]]]]]]]]]], APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, APProduct2[T12 => N12, APProduct2[T13 => N13, APProduct2[T14 => N14, APProduct2[T15 => N15, Product2]]]]]]]]]]]]]], APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, APCoProduct3[N12, APCoProduct3[N13, APCoProduct3[N14, APCoProduct3[N15, CoProduct3]]]]]]]]]]]]]]](
        AdtFunctionSupportSelf.inputHList14[T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15, N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15]
      )
    
      }
    

      def inputHList16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16]: (APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, APCoProduct1[T16, CoProduct1]]]]]]]]]]]]]]]], APProduct2[T1 => N1, APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, APProduct2[T12 => N12, APProduct2[T13 => N13, APProduct2[T14 => N14, APProduct2[T15 => N15, APProduct2[T16 => N16, Product2]]]]]]]]]]]]]]]]) => APCoProduct3[N1, APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, APCoProduct3[N12, APCoProduct3[N13, APCoProduct3[N14, APCoProduct3[N15, APCoProduct3[N16, CoProduct3]]]]]]]]]]]]]]]] = {
        
      AdtFunctionSupportSelf.appendSimpleAdt.next[T1, N1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, APCoProduct1[T16, CoProduct1]]]]]]]]]]]]]]], APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, APProduct2[T12 => N12, APProduct2[T13 => N13, APProduct2[T14 => N14, APProduct2[T15 => N15, APProduct2[T16 => N16, Product2]]]]]]]]]]]]]]], APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, APCoProduct3[N12, APCoProduct3[N13, APCoProduct3[N14, APCoProduct3[N15, APCoProduct3[N16, CoProduct3]]]]]]]]]]]]]]]](
        AdtFunctionSupportSelf.inputHList15[T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16]
      )
    
      }
    

      def inputHList17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17]: (APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, APCoProduct1[T16, APCoProduct1[T17, CoProduct1]]]]]]]]]]]]]]]]], APProduct2[T1 => N1, APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, APProduct2[T12 => N12, APProduct2[T13 => N13, APProduct2[T14 => N14, APProduct2[T15 => N15, APProduct2[T16 => N16, APProduct2[T17 => N17, Product2]]]]]]]]]]]]]]]]]) => APCoProduct3[N1, APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, APCoProduct3[N12, APCoProduct3[N13, APCoProduct3[N14, APCoProduct3[N15, APCoProduct3[N16, APCoProduct3[N17, CoProduct3]]]]]]]]]]]]]]]]] = {
        
      AdtFunctionSupportSelf.appendSimpleAdt.next[T1, N1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, APCoProduct1[T16, APCoProduct1[T17, CoProduct1]]]]]]]]]]]]]]]], APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, APProduct2[T12 => N12, APProduct2[T13 => N13, APProduct2[T14 => N14, APProduct2[T15 => N15, APProduct2[T16 => N16, APProduct2[T17 => N17, Product2]]]]]]]]]]]]]]]], APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, APCoProduct3[N12, APCoProduct3[N13, APCoProduct3[N14, APCoProduct3[N15, APCoProduct3[N16, APCoProduct3[N17, CoProduct3]]]]]]]]]]]]]]]]](
        AdtFunctionSupportSelf.inputHList16[T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17, N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17]
      )
    
      }
    

      def inputHList18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18]: (APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, APCoProduct1[T16, APCoProduct1[T17, APCoProduct1[T18, CoProduct1]]]]]]]]]]]]]]]]]], APProduct2[T1 => N1, APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, APProduct2[T12 => N12, APProduct2[T13 => N13, APProduct2[T14 => N14, APProduct2[T15 => N15, APProduct2[T16 => N16, APProduct2[T17 => N17, APProduct2[T18 => N18, Product2]]]]]]]]]]]]]]]]]]) => APCoProduct3[N1, APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, APCoProduct3[N12, APCoProduct3[N13, APCoProduct3[N14, APCoProduct3[N15, APCoProduct3[N16, APCoProduct3[N17, APCoProduct3[N18, CoProduct3]]]]]]]]]]]]]]]]]] = {
        
      AdtFunctionSupportSelf.appendSimpleAdt.next[T1, N1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, APCoProduct1[T16, APCoProduct1[T17, APCoProduct1[T18, CoProduct1]]]]]]]]]]]]]]]]], APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, APProduct2[T12 => N12, APProduct2[T13 => N13, APProduct2[T14 => N14, APProduct2[T15 => N15, APProduct2[T16 => N16, APProduct2[T17 => N17, APProduct2[T18 => N18, Product2]]]]]]]]]]]]]]]]], APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, APCoProduct3[N12, APCoProduct3[N13, APCoProduct3[N14, APCoProduct3[N15, APCoProduct3[N16, APCoProduct3[N17, APCoProduct3[N18, CoProduct3]]]]]]]]]]]]]]]]]](
        AdtFunctionSupportSelf.inputHList17[T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18, N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18]
      )
    
      }
    

      def inputHList19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19]: (APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, APCoProduct1[T16, APCoProduct1[T17, APCoProduct1[T18, APCoProduct1[T19, CoProduct1]]]]]]]]]]]]]]]]]]], APProduct2[T1 => N1, APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, APProduct2[T12 => N12, APProduct2[T13 => N13, APProduct2[T14 => N14, APProduct2[T15 => N15, APProduct2[T16 => N16, APProduct2[T17 => N17, APProduct2[T18 => N18, APProduct2[T19 => N19, Product2]]]]]]]]]]]]]]]]]]]) => APCoProduct3[N1, APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, APCoProduct3[N12, APCoProduct3[N13, APCoProduct3[N14, APCoProduct3[N15, APCoProduct3[N16, APCoProduct3[N17, APCoProduct3[N18, APCoProduct3[N19, CoProduct3]]]]]]]]]]]]]]]]]]] = {
        
      AdtFunctionSupportSelf.appendSimpleAdt.next[T1, N1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, APCoProduct1[T16, APCoProduct1[T17, APCoProduct1[T18, APCoProduct1[T19, CoProduct1]]]]]]]]]]]]]]]]]], APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, APProduct2[T12 => N12, APProduct2[T13 => N13, APProduct2[T14 => N14, APProduct2[T15 => N15, APProduct2[T16 => N16, APProduct2[T17 => N17, APProduct2[T18 => N18, APProduct2[T19 => N19, Product2]]]]]]]]]]]]]]]]]], APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, APCoProduct3[N12, APCoProduct3[N13, APCoProduct3[N14, APCoProduct3[N15, APCoProduct3[N16, APCoProduct3[N17, APCoProduct3[N18, APCoProduct3[N19, CoProduct3]]]]]]]]]]]]]]]]]]](
        AdtFunctionSupportSelf.inputHList18[T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19, N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19]
      )
    
      }
    

      def inputHList20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20]: (APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, APCoProduct1[T16, APCoProduct1[T17, APCoProduct1[T18, APCoProduct1[T19, APCoProduct1[T20, CoProduct1]]]]]]]]]]]]]]]]]]]], APProduct2[T1 => N1, APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, APProduct2[T12 => N12, APProduct2[T13 => N13, APProduct2[T14 => N14, APProduct2[T15 => N15, APProduct2[T16 => N16, APProduct2[T17 => N17, APProduct2[T18 => N18, APProduct2[T19 => N19, APProduct2[T20 => N20, Product2]]]]]]]]]]]]]]]]]]]]) => APCoProduct3[N1, APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, APCoProduct3[N12, APCoProduct3[N13, APCoProduct3[N14, APCoProduct3[N15, APCoProduct3[N16, APCoProduct3[N17, APCoProduct3[N18, APCoProduct3[N19, APCoProduct3[N20, CoProduct3]]]]]]]]]]]]]]]]]]]] = {
        
      AdtFunctionSupportSelf.appendSimpleAdt.next[T1, N1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, APCoProduct1[T16, APCoProduct1[T17, APCoProduct1[T18, APCoProduct1[T19, APCoProduct1[T20, CoProduct1]]]]]]]]]]]]]]]]]]], APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, APProduct2[T12 => N12, APProduct2[T13 => N13, APProduct2[T14 => N14, APProduct2[T15 => N15, APProduct2[T16 => N16, APProduct2[T17 => N17, APProduct2[T18 => N18, APProduct2[T19 => N19, APProduct2[T20 => N20, Product2]]]]]]]]]]]]]]]]]]], APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, APCoProduct3[N12, APCoProduct3[N13, APCoProduct3[N14, APCoProduct3[N15, APCoProduct3[N16, APCoProduct3[N17, APCoProduct3[N18, APCoProduct3[N19, APCoProduct3[N20, CoProduct3]]]]]]]]]]]]]]]]]]]](
        AdtFunctionSupportSelf.inputHList19[T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20, N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20]
      )
    
      }
    

      def inputHList21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21]: (APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, APCoProduct1[T16, APCoProduct1[T17, APCoProduct1[T18, APCoProduct1[T19, APCoProduct1[T20, APCoProduct1[T21, CoProduct1]]]]]]]]]]]]]]]]]]]]], APProduct2[T1 => N1, APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, APProduct2[T12 => N12, APProduct2[T13 => N13, APProduct2[T14 => N14, APProduct2[T15 => N15, APProduct2[T16 => N16, APProduct2[T17 => N17, APProduct2[T18 => N18, APProduct2[T19 => N19, APProduct2[T20 => N20, APProduct2[T21 => N21, Product2]]]]]]]]]]]]]]]]]]]]]) => APCoProduct3[N1, APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, APCoProduct3[N12, APCoProduct3[N13, APCoProduct3[N14, APCoProduct3[N15, APCoProduct3[N16, APCoProduct3[N17, APCoProduct3[N18, APCoProduct3[N19, APCoProduct3[N20, APCoProduct3[N21, CoProduct3]]]]]]]]]]]]]]]]]]]]] = {
        
      AdtFunctionSupportSelf.appendSimpleAdt.next[T1, N1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, APCoProduct1[T16, APCoProduct1[T17, APCoProduct1[T18, APCoProduct1[T19, APCoProduct1[T20, APCoProduct1[T21, CoProduct1]]]]]]]]]]]]]]]]]]]], APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, APProduct2[T12 => N12, APProduct2[T13 => N13, APProduct2[T14 => N14, APProduct2[T15 => N15, APProduct2[T16 => N16, APProduct2[T17 => N17, APProduct2[T18 => N18, APProduct2[T19 => N19, APProduct2[T20 => N20, APProduct2[T21 => N21, Product2]]]]]]]]]]]]]]]]]]]], APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, APCoProduct3[N12, APCoProduct3[N13, APCoProduct3[N14, APCoProduct3[N15, APCoProduct3[N16, APCoProduct3[N17, APCoProduct3[N18, APCoProduct3[N19, APCoProduct3[N20, APCoProduct3[N21, CoProduct3]]]]]]]]]]]]]]]]]]]]](
        AdtFunctionSupportSelf.inputHList20[T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21, N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21]
      )
    
      }
    

      def inputHList22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21,N22]: (APCoProduct1[T1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, APCoProduct1[T16, APCoProduct1[T17, APCoProduct1[T18, APCoProduct1[T19, APCoProduct1[T20, APCoProduct1[T21, APCoProduct1[T22, CoProduct1]]]]]]]]]]]]]]]]]]]]]], APProduct2[T1 => N1, APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, APProduct2[T12 => N12, APProduct2[T13 => N13, APProduct2[T14 => N14, APProduct2[T15 => N15, APProduct2[T16 => N16, APProduct2[T17 => N17, APProduct2[T18 => N18, APProduct2[T19 => N19, APProduct2[T20 => N20, APProduct2[T21 => N21, APProduct2[T22 => N22, Product2]]]]]]]]]]]]]]]]]]]]]]) => APCoProduct3[N1, APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, APCoProduct3[N12, APCoProduct3[N13, APCoProduct3[N14, APCoProduct3[N15, APCoProduct3[N16, APCoProduct3[N17, APCoProduct3[N18, APCoProduct3[N19, APCoProduct3[N20, APCoProduct3[N21, APCoProduct3[N22, CoProduct3]]]]]]]]]]]]]]]]]]]]]] = {
        
      AdtFunctionSupportSelf.appendSimpleAdt.next[T1, N1, APCoProduct1[T2, APCoProduct1[T3, APCoProduct1[T4, APCoProduct1[T5, APCoProduct1[T6, APCoProduct1[T7, APCoProduct1[T8, APCoProduct1[T9, APCoProduct1[T10, APCoProduct1[T11, APCoProduct1[T12, APCoProduct1[T13, APCoProduct1[T14, APCoProduct1[T15, APCoProduct1[T16, APCoProduct1[T17, APCoProduct1[T18, APCoProduct1[T19, APCoProduct1[T20, APCoProduct1[T21, APCoProduct1[T22, CoProduct1]]]]]]]]]]]]]]]]]]]]], APProduct2[T2 => N2, APProduct2[T3 => N3, APProduct2[T4 => N4, APProduct2[T5 => N5, APProduct2[T6 => N6, APProduct2[T7 => N7, APProduct2[T8 => N8, APProduct2[T9 => N9, APProduct2[T10 => N10, APProduct2[T11 => N11, APProduct2[T12 => N12, APProduct2[T13 => N13, APProduct2[T14 => N14, APProduct2[T15 => N15, APProduct2[T16 => N16, APProduct2[T17 => N17, APProduct2[T18 => N18, APProduct2[T19 => N19, APProduct2[T20 => N20, APProduct2[T21 => N21, APProduct2[T22 => N22, Product2]]]]]]]]]]]]]]]]]]]]], APCoProduct3[N2, APCoProduct3[N3, APCoProduct3[N4, APCoProduct3[N5, APCoProduct3[N6, APCoProduct3[N7, APCoProduct3[N8, APCoProduct3[N9, APCoProduct3[N10, APCoProduct3[N11, APCoProduct3[N12, APCoProduct3[N13, APCoProduct3[N14, APCoProduct3[N15, APCoProduct3[N16, APCoProduct3[N17, APCoProduct3[N18, APCoProduct3[N19, APCoProduct3[N20, APCoProduct3[N21, APCoProduct3[N22, CoProduct3]]]]]]]]]]]]]]]]]]]]]](
        AdtFunctionSupportSelf.inputHList21[T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22, N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21,N22]
      )
    
      }
    

    }
  