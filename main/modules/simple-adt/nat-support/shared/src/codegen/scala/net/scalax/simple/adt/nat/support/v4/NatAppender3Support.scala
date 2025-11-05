
    package net.scalax.simple.adt
    package nat
    package support

    object NatAppender3 {
      
      trait Support1[
        M[_],
        T1,
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender2.Support1[
        M,
        T1,
        HLLike1,
        APRHLLike1
      ] {
        
          override def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]] =
            HListFunc.toABCFunc[T1, HC1, HLLike1, APRHLLike1](hlistFunnc1)
        
        def hlistFunnc1: HListFunc[HLLike1, APRHLLike1]
        def headPlus: M[T1]
      }
    

      trait Support2[
        M[_,_],
        T1,T2,
        HLLike1,HLLike2,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2
      ] extends NatAppender2.Support2[
        M,
        T1,T2,
        HLLike1,HLLike2,
        APRHLLike1,APRHLLike2
      ] {
        
          override def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]] =
            HListFunc.toABCFunc[T1, HC1, HLLike1, APRHLLike1](hlistFunnc1)
        

          override def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]] =
            HListFunc.toABCFunc[T2, HC2, HLLike2, APRHLLike2](hlistFunnc2)
        
        def hlistFunnc1: HListFunc[HLLike1, APRHLLike1]
def hlistFunnc2: HListFunc[HLLike2, APRHLLike2]
        def headPlus: M[T1,T2]
      }
    

      trait Support3[
        M[_,_,_],
        T1,T2,T3,
        HLLike1,HLLike2,HLLike3,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3
      ] extends NatAppender2.Support3[
        M,
        T1,T2,T3,
        HLLike1,HLLike2,HLLike3,
        APRHLLike1,APRHLLike2,APRHLLike3
      ] {
        
          override def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]] =
            HListFunc.toABCFunc[T1, HC1, HLLike1, APRHLLike1](hlistFunnc1)
        

          override def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]] =
            HListFunc.toABCFunc[T2, HC2, HLLike2, APRHLLike2](hlistFunnc2)
        

          override def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]] =
            HListFunc.toABCFunc[T3, HC3, HLLike3, APRHLLike3](hlistFunnc3)
        
        def hlistFunnc1: HListFunc[HLLike1, APRHLLike1]
def hlistFunnc2: HListFunc[HLLike2, APRHLLike2]
def hlistFunnc3: HListFunc[HLLike3, APRHLLike3]
        def headPlus: M[T1,T2,T3]
      }
    

      trait Support4[
        M[_,_,_,_],
        T1,T2,T3,T4,
        HLLike1,HLLike2,HLLike3,HLLike4,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4
      ] extends NatAppender2.Support4[
        M,
        T1,T2,T3,T4,
        HLLike1,HLLike2,HLLike3,HLLike4,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4
      ] {
        
          override def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]] =
            HListFunc.toABCFunc[T1, HC1, HLLike1, APRHLLike1](hlistFunnc1)
        

          override def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]] =
            HListFunc.toABCFunc[T2, HC2, HLLike2, APRHLLike2](hlistFunnc2)
        

          override def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]] =
            HListFunc.toABCFunc[T3, HC3, HLLike3, APRHLLike3](hlistFunnc3)
        

          override def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]] =
            HListFunc.toABCFunc[T4, HC4, HLLike4, APRHLLike4](hlistFunnc4)
        
        def hlistFunnc1: HListFunc[HLLike1, APRHLLike1]
def hlistFunnc2: HListFunc[HLLike2, APRHLLike2]
def hlistFunnc3: HListFunc[HLLike3, APRHLLike3]
def hlistFunnc4: HListFunc[HLLike4, APRHLLike4]
        def headPlus: M[T1,T2,T3,T4]
      }
    

      trait Support5[
        M[_,_,_,_,_],
        T1,T2,T3,T4,T5,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5
      ] extends NatAppender2.Support5[
        M,
        T1,T2,T3,T4,T5,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5
      ] {
        
          override def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]] =
            HListFunc.toABCFunc[T1, HC1, HLLike1, APRHLLike1](hlistFunnc1)
        

          override def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]] =
            HListFunc.toABCFunc[T2, HC2, HLLike2, APRHLLike2](hlistFunnc2)
        

          override def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]] =
            HListFunc.toABCFunc[T3, HC3, HLLike3, APRHLLike3](hlistFunnc3)
        

          override def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]] =
            HListFunc.toABCFunc[T4, HC4, HLLike4, APRHLLike4](hlistFunnc4)
        

          override def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]] =
            HListFunc.toABCFunc[T5, HC5, HLLike5, APRHLLike5](hlistFunnc5)
        
        def hlistFunnc1: HListFunc[HLLike1, APRHLLike1]
def hlistFunnc2: HListFunc[HLLike2, APRHLLike2]
def hlistFunnc3: HListFunc[HLLike3, APRHLLike3]
def hlistFunnc4: HListFunc[HLLike4, APRHLLike4]
def hlistFunnc5: HListFunc[HLLike5, APRHLLike5]
        def headPlus: M[T1,T2,T3,T4,T5]
      }
    

      trait Support6[
        M[_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6
      ] extends NatAppender2.Support6[
        M,
        T1,T2,T3,T4,T5,T6,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6
      ] {
        
          override def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]] =
            HListFunc.toABCFunc[T1, HC1, HLLike1, APRHLLike1](hlistFunnc1)
        

          override def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]] =
            HListFunc.toABCFunc[T2, HC2, HLLike2, APRHLLike2](hlistFunnc2)
        

          override def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]] =
            HListFunc.toABCFunc[T3, HC3, HLLike3, APRHLLike3](hlistFunnc3)
        

          override def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]] =
            HListFunc.toABCFunc[T4, HC4, HLLike4, APRHLLike4](hlistFunnc4)
        

          override def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]] =
            HListFunc.toABCFunc[T5, HC5, HLLike5, APRHLLike5](hlistFunnc5)
        

          override def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]] =
            HListFunc.toABCFunc[T6, HC6, HLLike6, APRHLLike6](hlistFunnc6)
        
        def hlistFunnc1: HListFunc[HLLike1, APRHLLike1]
def hlistFunnc2: HListFunc[HLLike2, APRHLLike2]
def hlistFunnc3: HListFunc[HLLike3, APRHLLike3]
def hlistFunnc4: HListFunc[HLLike4, APRHLLike4]
def hlistFunnc5: HListFunc[HLLike5, APRHLLike5]
def hlistFunnc6: HListFunc[HLLike6, APRHLLike6]
        def headPlus: M[T1,T2,T3,T4,T5,T6]
      }
    

      trait Support7[
        M[_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7
      ] extends NatAppender2.Support7[
        M,
        T1,T2,T3,T4,T5,T6,T7,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7
      ] {
        
          override def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]] =
            HListFunc.toABCFunc[T1, HC1, HLLike1, APRHLLike1](hlistFunnc1)
        

          override def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]] =
            HListFunc.toABCFunc[T2, HC2, HLLike2, APRHLLike2](hlistFunnc2)
        

          override def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]] =
            HListFunc.toABCFunc[T3, HC3, HLLike3, APRHLLike3](hlistFunnc3)
        

          override def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]] =
            HListFunc.toABCFunc[T4, HC4, HLLike4, APRHLLike4](hlistFunnc4)
        

          override def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]] =
            HListFunc.toABCFunc[T5, HC5, HLLike5, APRHLLike5](hlistFunnc5)
        

          override def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]] =
            HListFunc.toABCFunc[T6, HC6, HLLike6, APRHLLike6](hlistFunnc6)
        

          override def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]] =
            HListFunc.toABCFunc[T7, HC7, HLLike7, APRHLLike7](hlistFunnc7)
        
        def hlistFunnc1: HListFunc[HLLike1, APRHLLike1]
def hlistFunnc2: HListFunc[HLLike2, APRHLLike2]
def hlistFunnc3: HListFunc[HLLike3, APRHLLike3]
def hlistFunnc4: HListFunc[HLLike4, APRHLLike4]
def hlistFunnc5: HListFunc[HLLike5, APRHLLike5]
def hlistFunnc6: HListFunc[HLLike6, APRHLLike6]
def hlistFunnc7: HListFunc[HLLike7, APRHLLike7]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7]
      }
    

      trait Support8[
        M[_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8
      ] extends NatAppender2.Support8[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8
      ] {
        
          override def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]] =
            HListFunc.toABCFunc[T1, HC1, HLLike1, APRHLLike1](hlistFunnc1)
        

          override def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]] =
            HListFunc.toABCFunc[T2, HC2, HLLike2, APRHLLike2](hlistFunnc2)
        

          override def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]] =
            HListFunc.toABCFunc[T3, HC3, HLLike3, APRHLLike3](hlistFunnc3)
        

          override def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]] =
            HListFunc.toABCFunc[T4, HC4, HLLike4, APRHLLike4](hlistFunnc4)
        

          override def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]] =
            HListFunc.toABCFunc[T5, HC5, HLLike5, APRHLLike5](hlistFunnc5)
        

          override def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]] =
            HListFunc.toABCFunc[T6, HC6, HLLike6, APRHLLike6](hlistFunnc6)
        

          override def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]] =
            HListFunc.toABCFunc[T7, HC7, HLLike7, APRHLLike7](hlistFunnc7)
        

          override def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]] =
            HListFunc.toABCFunc[T8, HC8, HLLike8, APRHLLike8](hlistFunnc8)
        
        def hlistFunnc1: HListFunc[HLLike1, APRHLLike1]
def hlistFunnc2: HListFunc[HLLike2, APRHLLike2]
def hlistFunnc3: HListFunc[HLLike3, APRHLLike3]
def hlistFunnc4: HListFunc[HLLike4, APRHLLike4]
def hlistFunnc5: HListFunc[HLLike5, APRHLLike5]
def hlistFunnc6: HListFunc[HLLike6, APRHLLike6]
def hlistFunnc7: HListFunc[HLLike7, APRHLLike7]
def hlistFunnc8: HListFunc[HLLike8, APRHLLike8]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8]
      }
    

      trait Support9[
        M[_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9
      ] extends NatAppender2.Support9[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9
      ] {
        
          override def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]] =
            HListFunc.toABCFunc[T1, HC1, HLLike1, APRHLLike1](hlistFunnc1)
        

          override def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]] =
            HListFunc.toABCFunc[T2, HC2, HLLike2, APRHLLike2](hlistFunnc2)
        

          override def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]] =
            HListFunc.toABCFunc[T3, HC3, HLLike3, APRHLLike3](hlistFunnc3)
        

          override def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]] =
            HListFunc.toABCFunc[T4, HC4, HLLike4, APRHLLike4](hlistFunnc4)
        

          override def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]] =
            HListFunc.toABCFunc[T5, HC5, HLLike5, APRHLLike5](hlistFunnc5)
        

          override def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]] =
            HListFunc.toABCFunc[T6, HC6, HLLike6, APRHLLike6](hlistFunnc6)
        

          override def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]] =
            HListFunc.toABCFunc[T7, HC7, HLLike7, APRHLLike7](hlistFunnc7)
        

          override def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]] =
            HListFunc.toABCFunc[T8, HC8, HLLike8, APRHLLike8](hlistFunnc8)
        

          override def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]] =
            HListFunc.toABCFunc[T9, HC9, HLLike9, APRHLLike9](hlistFunnc9)
        
        def hlistFunnc1: HListFunc[HLLike1, APRHLLike1]
def hlistFunnc2: HListFunc[HLLike2, APRHLLike2]
def hlistFunnc3: HListFunc[HLLike3, APRHLLike3]
def hlistFunnc4: HListFunc[HLLike4, APRHLLike4]
def hlistFunnc5: HListFunc[HLLike5, APRHLLike5]
def hlistFunnc6: HListFunc[HLLike6, APRHLLike6]
def hlistFunnc7: HListFunc[HLLike7, APRHLLike7]
def hlistFunnc8: HListFunc[HLLike8, APRHLLike8]
def hlistFunnc9: HListFunc[HLLike9, APRHLLike9]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9]
      }
    

      trait Support10[
        M[_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10
      ] extends NatAppender2.Support10[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10
      ] {
        
          override def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]] =
            HListFunc.toABCFunc[T1, HC1, HLLike1, APRHLLike1](hlistFunnc1)
        

          override def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]] =
            HListFunc.toABCFunc[T2, HC2, HLLike2, APRHLLike2](hlistFunnc2)
        

          override def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]] =
            HListFunc.toABCFunc[T3, HC3, HLLike3, APRHLLike3](hlistFunnc3)
        

          override def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]] =
            HListFunc.toABCFunc[T4, HC4, HLLike4, APRHLLike4](hlistFunnc4)
        

          override def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]] =
            HListFunc.toABCFunc[T5, HC5, HLLike5, APRHLLike5](hlistFunnc5)
        

          override def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]] =
            HListFunc.toABCFunc[T6, HC6, HLLike6, APRHLLike6](hlistFunnc6)
        

          override def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]] =
            HListFunc.toABCFunc[T7, HC7, HLLike7, APRHLLike7](hlistFunnc7)
        

          override def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]] =
            HListFunc.toABCFunc[T8, HC8, HLLike8, APRHLLike8](hlistFunnc8)
        

          override def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]] =
            HListFunc.toABCFunc[T9, HC9, HLLike9, APRHLLike9](hlistFunnc9)
        

          override def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]] =
            HListFunc.toABCFunc[T10, HC10, HLLike10, APRHLLike10](hlistFunnc10)
        
        def hlistFunnc1: HListFunc[HLLike1, APRHLLike1]
def hlistFunnc2: HListFunc[HLLike2, APRHLLike2]
def hlistFunnc3: HListFunc[HLLike3, APRHLLike3]
def hlistFunnc4: HListFunc[HLLike4, APRHLLike4]
def hlistFunnc5: HListFunc[HLLike5, APRHLLike5]
def hlistFunnc6: HListFunc[HLLike6, APRHLLike6]
def hlistFunnc7: HListFunc[HLLike7, APRHLLike7]
def hlistFunnc8: HListFunc[HLLike8, APRHLLike8]
def hlistFunnc9: HListFunc[HLLike9, APRHLLike9]
def hlistFunnc10: HListFunc[HLLike10, APRHLLike10]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]
      }
    

      trait Support11[
        M[_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11
      ] extends NatAppender2.Support11[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11
      ] {
        
          override def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]] =
            HListFunc.toABCFunc[T1, HC1, HLLike1, APRHLLike1](hlistFunnc1)
        

          override def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]] =
            HListFunc.toABCFunc[T2, HC2, HLLike2, APRHLLike2](hlistFunnc2)
        

          override def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]] =
            HListFunc.toABCFunc[T3, HC3, HLLike3, APRHLLike3](hlistFunnc3)
        

          override def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]] =
            HListFunc.toABCFunc[T4, HC4, HLLike4, APRHLLike4](hlistFunnc4)
        

          override def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]] =
            HListFunc.toABCFunc[T5, HC5, HLLike5, APRHLLike5](hlistFunnc5)
        

          override def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]] =
            HListFunc.toABCFunc[T6, HC6, HLLike6, APRHLLike6](hlistFunnc6)
        

          override def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]] =
            HListFunc.toABCFunc[T7, HC7, HLLike7, APRHLLike7](hlistFunnc7)
        

          override def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]] =
            HListFunc.toABCFunc[T8, HC8, HLLike8, APRHLLike8](hlistFunnc8)
        

          override def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]] =
            HListFunc.toABCFunc[T9, HC9, HLLike9, APRHLLike9](hlistFunnc9)
        

          override def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]] =
            HListFunc.toABCFunc[T10, HC10, HLLike10, APRHLLike10](hlistFunnc10)
        

          override def abcFunc11[HC11 <: HLLike11]: ABCFunc[T11, HC11, APRHLLike11[T11, HC11]] =
            HListFunc.toABCFunc[T11, HC11, HLLike11, APRHLLike11](hlistFunnc11)
        
        def hlistFunnc1: HListFunc[HLLike1, APRHLLike1]
def hlistFunnc2: HListFunc[HLLike2, APRHLLike2]
def hlistFunnc3: HListFunc[HLLike3, APRHLLike3]
def hlistFunnc4: HListFunc[HLLike4, APRHLLike4]
def hlistFunnc5: HListFunc[HLLike5, APRHLLike5]
def hlistFunnc6: HListFunc[HLLike6, APRHLLike6]
def hlistFunnc7: HListFunc[HLLike7, APRHLLike7]
def hlistFunnc8: HListFunc[HLLike8, APRHLLike8]
def hlistFunnc9: HListFunc[HLLike9, APRHLLike9]
def hlistFunnc10: HListFunc[HLLike10, APRHLLike10]
def hlistFunnc11: HListFunc[HLLike11, APRHLLike11]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]
      }
    

      trait Support12[
        M[_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12
      ] extends NatAppender2.Support12[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12
      ] {
        
          override def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]] =
            HListFunc.toABCFunc[T1, HC1, HLLike1, APRHLLike1](hlistFunnc1)
        

          override def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]] =
            HListFunc.toABCFunc[T2, HC2, HLLike2, APRHLLike2](hlistFunnc2)
        

          override def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]] =
            HListFunc.toABCFunc[T3, HC3, HLLike3, APRHLLike3](hlistFunnc3)
        

          override def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]] =
            HListFunc.toABCFunc[T4, HC4, HLLike4, APRHLLike4](hlistFunnc4)
        

          override def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]] =
            HListFunc.toABCFunc[T5, HC5, HLLike5, APRHLLike5](hlistFunnc5)
        

          override def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]] =
            HListFunc.toABCFunc[T6, HC6, HLLike6, APRHLLike6](hlistFunnc6)
        

          override def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]] =
            HListFunc.toABCFunc[T7, HC7, HLLike7, APRHLLike7](hlistFunnc7)
        

          override def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]] =
            HListFunc.toABCFunc[T8, HC8, HLLike8, APRHLLike8](hlistFunnc8)
        

          override def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]] =
            HListFunc.toABCFunc[T9, HC9, HLLike9, APRHLLike9](hlistFunnc9)
        

          override def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]] =
            HListFunc.toABCFunc[T10, HC10, HLLike10, APRHLLike10](hlistFunnc10)
        

          override def abcFunc11[HC11 <: HLLike11]: ABCFunc[T11, HC11, APRHLLike11[T11, HC11]] =
            HListFunc.toABCFunc[T11, HC11, HLLike11, APRHLLike11](hlistFunnc11)
        

          override def abcFunc12[HC12 <: HLLike12]: ABCFunc[T12, HC12, APRHLLike12[T12, HC12]] =
            HListFunc.toABCFunc[T12, HC12, HLLike12, APRHLLike12](hlistFunnc12)
        
        def hlistFunnc1: HListFunc[HLLike1, APRHLLike1]
def hlistFunnc2: HListFunc[HLLike2, APRHLLike2]
def hlistFunnc3: HListFunc[HLLike3, APRHLLike3]
def hlistFunnc4: HListFunc[HLLike4, APRHLLike4]
def hlistFunnc5: HListFunc[HLLike5, APRHLLike5]
def hlistFunnc6: HListFunc[HLLike6, APRHLLike6]
def hlistFunnc7: HListFunc[HLLike7, APRHLLike7]
def hlistFunnc8: HListFunc[HLLike8, APRHLLike8]
def hlistFunnc9: HListFunc[HLLike9, APRHLLike9]
def hlistFunnc10: HListFunc[HLLike10, APRHLLike10]
def hlistFunnc11: HListFunc[HLLike11, APRHLLike11]
def hlistFunnc12: HListFunc[HLLike12, APRHLLike12]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]
      }
    

      trait Support13[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13
      ] extends NatAppender2.Support13[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13
      ] {
        
          override def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]] =
            HListFunc.toABCFunc[T1, HC1, HLLike1, APRHLLike1](hlistFunnc1)
        

          override def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]] =
            HListFunc.toABCFunc[T2, HC2, HLLike2, APRHLLike2](hlistFunnc2)
        

          override def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]] =
            HListFunc.toABCFunc[T3, HC3, HLLike3, APRHLLike3](hlistFunnc3)
        

          override def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]] =
            HListFunc.toABCFunc[T4, HC4, HLLike4, APRHLLike4](hlistFunnc4)
        

          override def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]] =
            HListFunc.toABCFunc[T5, HC5, HLLike5, APRHLLike5](hlistFunnc5)
        

          override def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]] =
            HListFunc.toABCFunc[T6, HC6, HLLike6, APRHLLike6](hlistFunnc6)
        

          override def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]] =
            HListFunc.toABCFunc[T7, HC7, HLLike7, APRHLLike7](hlistFunnc7)
        

          override def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]] =
            HListFunc.toABCFunc[T8, HC8, HLLike8, APRHLLike8](hlistFunnc8)
        

          override def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]] =
            HListFunc.toABCFunc[T9, HC9, HLLike9, APRHLLike9](hlistFunnc9)
        

          override def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]] =
            HListFunc.toABCFunc[T10, HC10, HLLike10, APRHLLike10](hlistFunnc10)
        

          override def abcFunc11[HC11 <: HLLike11]: ABCFunc[T11, HC11, APRHLLike11[T11, HC11]] =
            HListFunc.toABCFunc[T11, HC11, HLLike11, APRHLLike11](hlistFunnc11)
        

          override def abcFunc12[HC12 <: HLLike12]: ABCFunc[T12, HC12, APRHLLike12[T12, HC12]] =
            HListFunc.toABCFunc[T12, HC12, HLLike12, APRHLLike12](hlistFunnc12)
        

          override def abcFunc13[HC13 <: HLLike13]: ABCFunc[T13, HC13, APRHLLike13[T13, HC13]] =
            HListFunc.toABCFunc[T13, HC13, HLLike13, APRHLLike13](hlistFunnc13)
        
        def hlistFunnc1: HListFunc[HLLike1, APRHLLike1]
def hlistFunnc2: HListFunc[HLLike2, APRHLLike2]
def hlistFunnc3: HListFunc[HLLike3, APRHLLike3]
def hlistFunnc4: HListFunc[HLLike4, APRHLLike4]
def hlistFunnc5: HListFunc[HLLike5, APRHLLike5]
def hlistFunnc6: HListFunc[HLLike6, APRHLLike6]
def hlistFunnc7: HListFunc[HLLike7, APRHLLike7]
def hlistFunnc8: HListFunc[HLLike8, APRHLLike8]
def hlistFunnc9: HListFunc[HLLike9, APRHLLike9]
def hlistFunnc10: HListFunc[HLLike10, APRHLLike10]
def hlistFunnc11: HListFunc[HLLike11, APRHLLike11]
def hlistFunnc12: HListFunc[HLLike12, APRHLLike12]
def hlistFunnc13: HListFunc[HLLike13, APRHLLike13]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]
      }
    

      trait Support14[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14
      ] extends NatAppender2.Support14[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14
      ] {
        
          override def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]] =
            HListFunc.toABCFunc[T1, HC1, HLLike1, APRHLLike1](hlistFunnc1)
        

          override def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]] =
            HListFunc.toABCFunc[T2, HC2, HLLike2, APRHLLike2](hlistFunnc2)
        

          override def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]] =
            HListFunc.toABCFunc[T3, HC3, HLLike3, APRHLLike3](hlistFunnc3)
        

          override def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]] =
            HListFunc.toABCFunc[T4, HC4, HLLike4, APRHLLike4](hlistFunnc4)
        

          override def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]] =
            HListFunc.toABCFunc[T5, HC5, HLLike5, APRHLLike5](hlistFunnc5)
        

          override def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]] =
            HListFunc.toABCFunc[T6, HC6, HLLike6, APRHLLike6](hlistFunnc6)
        

          override def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]] =
            HListFunc.toABCFunc[T7, HC7, HLLike7, APRHLLike7](hlistFunnc7)
        

          override def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]] =
            HListFunc.toABCFunc[T8, HC8, HLLike8, APRHLLike8](hlistFunnc8)
        

          override def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]] =
            HListFunc.toABCFunc[T9, HC9, HLLike9, APRHLLike9](hlistFunnc9)
        

          override def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]] =
            HListFunc.toABCFunc[T10, HC10, HLLike10, APRHLLike10](hlistFunnc10)
        

          override def abcFunc11[HC11 <: HLLike11]: ABCFunc[T11, HC11, APRHLLike11[T11, HC11]] =
            HListFunc.toABCFunc[T11, HC11, HLLike11, APRHLLike11](hlistFunnc11)
        

          override def abcFunc12[HC12 <: HLLike12]: ABCFunc[T12, HC12, APRHLLike12[T12, HC12]] =
            HListFunc.toABCFunc[T12, HC12, HLLike12, APRHLLike12](hlistFunnc12)
        

          override def abcFunc13[HC13 <: HLLike13]: ABCFunc[T13, HC13, APRHLLike13[T13, HC13]] =
            HListFunc.toABCFunc[T13, HC13, HLLike13, APRHLLike13](hlistFunnc13)
        

          override def abcFunc14[HC14 <: HLLike14]: ABCFunc[T14, HC14, APRHLLike14[T14, HC14]] =
            HListFunc.toABCFunc[T14, HC14, HLLike14, APRHLLike14](hlistFunnc14)
        
        def hlistFunnc1: HListFunc[HLLike1, APRHLLike1]
def hlistFunnc2: HListFunc[HLLike2, APRHLLike2]
def hlistFunnc3: HListFunc[HLLike3, APRHLLike3]
def hlistFunnc4: HListFunc[HLLike4, APRHLLike4]
def hlistFunnc5: HListFunc[HLLike5, APRHLLike5]
def hlistFunnc6: HListFunc[HLLike6, APRHLLike6]
def hlistFunnc7: HListFunc[HLLike7, APRHLLike7]
def hlistFunnc8: HListFunc[HLLike8, APRHLLike8]
def hlistFunnc9: HListFunc[HLLike9, APRHLLike9]
def hlistFunnc10: HListFunc[HLLike10, APRHLLike10]
def hlistFunnc11: HListFunc[HLLike11, APRHLLike11]
def hlistFunnc12: HListFunc[HLLike12, APRHLLike12]
def hlistFunnc13: HListFunc[HLLike13, APRHLLike13]
def hlistFunnc14: HListFunc[HLLike14, APRHLLike14]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]
      }
    

      trait Support15[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15
      ] extends NatAppender2.Support15[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15
      ] {
        
          override def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]] =
            HListFunc.toABCFunc[T1, HC1, HLLike1, APRHLLike1](hlistFunnc1)
        

          override def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]] =
            HListFunc.toABCFunc[T2, HC2, HLLike2, APRHLLike2](hlistFunnc2)
        

          override def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]] =
            HListFunc.toABCFunc[T3, HC3, HLLike3, APRHLLike3](hlistFunnc3)
        

          override def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]] =
            HListFunc.toABCFunc[T4, HC4, HLLike4, APRHLLike4](hlistFunnc4)
        

          override def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]] =
            HListFunc.toABCFunc[T5, HC5, HLLike5, APRHLLike5](hlistFunnc5)
        

          override def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]] =
            HListFunc.toABCFunc[T6, HC6, HLLike6, APRHLLike6](hlistFunnc6)
        

          override def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]] =
            HListFunc.toABCFunc[T7, HC7, HLLike7, APRHLLike7](hlistFunnc7)
        

          override def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]] =
            HListFunc.toABCFunc[T8, HC8, HLLike8, APRHLLike8](hlistFunnc8)
        

          override def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]] =
            HListFunc.toABCFunc[T9, HC9, HLLike9, APRHLLike9](hlistFunnc9)
        

          override def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]] =
            HListFunc.toABCFunc[T10, HC10, HLLike10, APRHLLike10](hlistFunnc10)
        

          override def abcFunc11[HC11 <: HLLike11]: ABCFunc[T11, HC11, APRHLLike11[T11, HC11]] =
            HListFunc.toABCFunc[T11, HC11, HLLike11, APRHLLike11](hlistFunnc11)
        

          override def abcFunc12[HC12 <: HLLike12]: ABCFunc[T12, HC12, APRHLLike12[T12, HC12]] =
            HListFunc.toABCFunc[T12, HC12, HLLike12, APRHLLike12](hlistFunnc12)
        

          override def abcFunc13[HC13 <: HLLike13]: ABCFunc[T13, HC13, APRHLLike13[T13, HC13]] =
            HListFunc.toABCFunc[T13, HC13, HLLike13, APRHLLike13](hlistFunnc13)
        

          override def abcFunc14[HC14 <: HLLike14]: ABCFunc[T14, HC14, APRHLLike14[T14, HC14]] =
            HListFunc.toABCFunc[T14, HC14, HLLike14, APRHLLike14](hlistFunnc14)
        

          override def abcFunc15[HC15 <: HLLike15]: ABCFunc[T15, HC15, APRHLLike15[T15, HC15]] =
            HListFunc.toABCFunc[T15, HC15, HLLike15, APRHLLike15](hlistFunnc15)
        
        def hlistFunnc1: HListFunc[HLLike1, APRHLLike1]
def hlistFunnc2: HListFunc[HLLike2, APRHLLike2]
def hlistFunnc3: HListFunc[HLLike3, APRHLLike3]
def hlistFunnc4: HListFunc[HLLike4, APRHLLike4]
def hlistFunnc5: HListFunc[HLLike5, APRHLLike5]
def hlistFunnc6: HListFunc[HLLike6, APRHLLike6]
def hlistFunnc7: HListFunc[HLLike7, APRHLLike7]
def hlistFunnc8: HListFunc[HLLike8, APRHLLike8]
def hlistFunnc9: HListFunc[HLLike9, APRHLLike9]
def hlistFunnc10: HListFunc[HLLike10, APRHLLike10]
def hlistFunnc11: HListFunc[HLLike11, APRHLLike11]
def hlistFunnc12: HListFunc[HLLike12, APRHLLike12]
def hlistFunnc13: HListFunc[HLLike13, APRHLLike13]
def hlistFunnc14: HListFunc[HLLike14, APRHLLike14]
def hlistFunnc15: HListFunc[HLLike15, APRHLLike15]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
      }
    

      trait Support16[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16
      ] extends NatAppender2.Support16[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16
      ] {
        
          override def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]] =
            HListFunc.toABCFunc[T1, HC1, HLLike1, APRHLLike1](hlistFunnc1)
        

          override def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]] =
            HListFunc.toABCFunc[T2, HC2, HLLike2, APRHLLike2](hlistFunnc2)
        

          override def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]] =
            HListFunc.toABCFunc[T3, HC3, HLLike3, APRHLLike3](hlistFunnc3)
        

          override def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]] =
            HListFunc.toABCFunc[T4, HC4, HLLike4, APRHLLike4](hlistFunnc4)
        

          override def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]] =
            HListFunc.toABCFunc[T5, HC5, HLLike5, APRHLLike5](hlistFunnc5)
        

          override def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]] =
            HListFunc.toABCFunc[T6, HC6, HLLike6, APRHLLike6](hlistFunnc6)
        

          override def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]] =
            HListFunc.toABCFunc[T7, HC7, HLLike7, APRHLLike7](hlistFunnc7)
        

          override def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]] =
            HListFunc.toABCFunc[T8, HC8, HLLike8, APRHLLike8](hlistFunnc8)
        

          override def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]] =
            HListFunc.toABCFunc[T9, HC9, HLLike9, APRHLLike9](hlistFunnc9)
        

          override def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]] =
            HListFunc.toABCFunc[T10, HC10, HLLike10, APRHLLike10](hlistFunnc10)
        

          override def abcFunc11[HC11 <: HLLike11]: ABCFunc[T11, HC11, APRHLLike11[T11, HC11]] =
            HListFunc.toABCFunc[T11, HC11, HLLike11, APRHLLike11](hlistFunnc11)
        

          override def abcFunc12[HC12 <: HLLike12]: ABCFunc[T12, HC12, APRHLLike12[T12, HC12]] =
            HListFunc.toABCFunc[T12, HC12, HLLike12, APRHLLike12](hlistFunnc12)
        

          override def abcFunc13[HC13 <: HLLike13]: ABCFunc[T13, HC13, APRHLLike13[T13, HC13]] =
            HListFunc.toABCFunc[T13, HC13, HLLike13, APRHLLike13](hlistFunnc13)
        

          override def abcFunc14[HC14 <: HLLike14]: ABCFunc[T14, HC14, APRHLLike14[T14, HC14]] =
            HListFunc.toABCFunc[T14, HC14, HLLike14, APRHLLike14](hlistFunnc14)
        

          override def abcFunc15[HC15 <: HLLike15]: ABCFunc[T15, HC15, APRHLLike15[T15, HC15]] =
            HListFunc.toABCFunc[T15, HC15, HLLike15, APRHLLike15](hlistFunnc15)
        

          override def abcFunc16[HC16 <: HLLike16]: ABCFunc[T16, HC16, APRHLLike16[T16, HC16]] =
            HListFunc.toABCFunc[T16, HC16, HLLike16, APRHLLike16](hlistFunnc16)
        
        def hlistFunnc1: HListFunc[HLLike1, APRHLLike1]
def hlistFunnc2: HListFunc[HLLike2, APRHLLike2]
def hlistFunnc3: HListFunc[HLLike3, APRHLLike3]
def hlistFunnc4: HListFunc[HLLike4, APRHLLike4]
def hlistFunnc5: HListFunc[HLLike5, APRHLLike5]
def hlistFunnc6: HListFunc[HLLike6, APRHLLike6]
def hlistFunnc7: HListFunc[HLLike7, APRHLLike7]
def hlistFunnc8: HListFunc[HLLike8, APRHLLike8]
def hlistFunnc9: HListFunc[HLLike9, APRHLLike9]
def hlistFunnc10: HListFunc[HLLike10, APRHLLike10]
def hlistFunnc11: HListFunc[HLLike11, APRHLLike11]
def hlistFunnc12: HListFunc[HLLike12, APRHLLike12]
def hlistFunnc13: HListFunc[HLLike13, APRHLLike13]
def hlistFunnc14: HListFunc[HLLike14, APRHLLike14]
def hlistFunnc15: HListFunc[HLLike15, APRHLLike15]
def hlistFunnc16: HListFunc[HLLike16, APRHLLike16]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
      }
    

      trait Support17[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17
      ] extends NatAppender2.Support17[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17
      ] {
        
          override def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]] =
            HListFunc.toABCFunc[T1, HC1, HLLike1, APRHLLike1](hlistFunnc1)
        

          override def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]] =
            HListFunc.toABCFunc[T2, HC2, HLLike2, APRHLLike2](hlistFunnc2)
        

          override def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]] =
            HListFunc.toABCFunc[T3, HC3, HLLike3, APRHLLike3](hlistFunnc3)
        

          override def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]] =
            HListFunc.toABCFunc[T4, HC4, HLLike4, APRHLLike4](hlistFunnc4)
        

          override def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]] =
            HListFunc.toABCFunc[T5, HC5, HLLike5, APRHLLike5](hlistFunnc5)
        

          override def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]] =
            HListFunc.toABCFunc[T6, HC6, HLLike6, APRHLLike6](hlistFunnc6)
        

          override def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]] =
            HListFunc.toABCFunc[T7, HC7, HLLike7, APRHLLike7](hlistFunnc7)
        

          override def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]] =
            HListFunc.toABCFunc[T8, HC8, HLLike8, APRHLLike8](hlistFunnc8)
        

          override def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]] =
            HListFunc.toABCFunc[T9, HC9, HLLike9, APRHLLike9](hlistFunnc9)
        

          override def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]] =
            HListFunc.toABCFunc[T10, HC10, HLLike10, APRHLLike10](hlistFunnc10)
        

          override def abcFunc11[HC11 <: HLLike11]: ABCFunc[T11, HC11, APRHLLike11[T11, HC11]] =
            HListFunc.toABCFunc[T11, HC11, HLLike11, APRHLLike11](hlistFunnc11)
        

          override def abcFunc12[HC12 <: HLLike12]: ABCFunc[T12, HC12, APRHLLike12[T12, HC12]] =
            HListFunc.toABCFunc[T12, HC12, HLLike12, APRHLLike12](hlistFunnc12)
        

          override def abcFunc13[HC13 <: HLLike13]: ABCFunc[T13, HC13, APRHLLike13[T13, HC13]] =
            HListFunc.toABCFunc[T13, HC13, HLLike13, APRHLLike13](hlistFunnc13)
        

          override def abcFunc14[HC14 <: HLLike14]: ABCFunc[T14, HC14, APRHLLike14[T14, HC14]] =
            HListFunc.toABCFunc[T14, HC14, HLLike14, APRHLLike14](hlistFunnc14)
        

          override def abcFunc15[HC15 <: HLLike15]: ABCFunc[T15, HC15, APRHLLike15[T15, HC15]] =
            HListFunc.toABCFunc[T15, HC15, HLLike15, APRHLLike15](hlistFunnc15)
        

          override def abcFunc16[HC16 <: HLLike16]: ABCFunc[T16, HC16, APRHLLike16[T16, HC16]] =
            HListFunc.toABCFunc[T16, HC16, HLLike16, APRHLLike16](hlistFunnc16)
        

          override def abcFunc17[HC17 <: HLLike17]: ABCFunc[T17, HC17, APRHLLike17[T17, HC17]] =
            HListFunc.toABCFunc[T17, HC17, HLLike17, APRHLLike17](hlistFunnc17)
        
        def hlistFunnc1: HListFunc[HLLike1, APRHLLike1]
def hlistFunnc2: HListFunc[HLLike2, APRHLLike2]
def hlistFunnc3: HListFunc[HLLike3, APRHLLike3]
def hlistFunnc4: HListFunc[HLLike4, APRHLLike4]
def hlistFunnc5: HListFunc[HLLike5, APRHLLike5]
def hlistFunnc6: HListFunc[HLLike6, APRHLLike6]
def hlistFunnc7: HListFunc[HLLike7, APRHLLike7]
def hlistFunnc8: HListFunc[HLLike8, APRHLLike8]
def hlistFunnc9: HListFunc[HLLike9, APRHLLike9]
def hlistFunnc10: HListFunc[HLLike10, APRHLLike10]
def hlistFunnc11: HListFunc[HLLike11, APRHLLike11]
def hlistFunnc12: HListFunc[HLLike12, APRHLLike12]
def hlistFunnc13: HListFunc[HLLike13, APRHLLike13]
def hlistFunnc14: HListFunc[HLLike14, APRHLLike14]
def hlistFunnc15: HListFunc[HLLike15, APRHLLike15]
def hlistFunnc16: HListFunc[HLLike16, APRHLLike16]
def hlistFunnc17: HListFunc[HLLike17, APRHLLike17]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
      }
    

      trait Support18[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18
      ] extends NatAppender2.Support18[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18
      ] {
        
          override def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]] =
            HListFunc.toABCFunc[T1, HC1, HLLike1, APRHLLike1](hlistFunnc1)
        

          override def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]] =
            HListFunc.toABCFunc[T2, HC2, HLLike2, APRHLLike2](hlistFunnc2)
        

          override def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]] =
            HListFunc.toABCFunc[T3, HC3, HLLike3, APRHLLike3](hlistFunnc3)
        

          override def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]] =
            HListFunc.toABCFunc[T4, HC4, HLLike4, APRHLLike4](hlistFunnc4)
        

          override def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]] =
            HListFunc.toABCFunc[T5, HC5, HLLike5, APRHLLike5](hlistFunnc5)
        

          override def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]] =
            HListFunc.toABCFunc[T6, HC6, HLLike6, APRHLLike6](hlistFunnc6)
        

          override def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]] =
            HListFunc.toABCFunc[T7, HC7, HLLike7, APRHLLike7](hlistFunnc7)
        

          override def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]] =
            HListFunc.toABCFunc[T8, HC8, HLLike8, APRHLLike8](hlistFunnc8)
        

          override def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]] =
            HListFunc.toABCFunc[T9, HC9, HLLike9, APRHLLike9](hlistFunnc9)
        

          override def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]] =
            HListFunc.toABCFunc[T10, HC10, HLLike10, APRHLLike10](hlistFunnc10)
        

          override def abcFunc11[HC11 <: HLLike11]: ABCFunc[T11, HC11, APRHLLike11[T11, HC11]] =
            HListFunc.toABCFunc[T11, HC11, HLLike11, APRHLLike11](hlistFunnc11)
        

          override def abcFunc12[HC12 <: HLLike12]: ABCFunc[T12, HC12, APRHLLike12[T12, HC12]] =
            HListFunc.toABCFunc[T12, HC12, HLLike12, APRHLLike12](hlistFunnc12)
        

          override def abcFunc13[HC13 <: HLLike13]: ABCFunc[T13, HC13, APRHLLike13[T13, HC13]] =
            HListFunc.toABCFunc[T13, HC13, HLLike13, APRHLLike13](hlistFunnc13)
        

          override def abcFunc14[HC14 <: HLLike14]: ABCFunc[T14, HC14, APRHLLike14[T14, HC14]] =
            HListFunc.toABCFunc[T14, HC14, HLLike14, APRHLLike14](hlistFunnc14)
        

          override def abcFunc15[HC15 <: HLLike15]: ABCFunc[T15, HC15, APRHLLike15[T15, HC15]] =
            HListFunc.toABCFunc[T15, HC15, HLLike15, APRHLLike15](hlistFunnc15)
        

          override def abcFunc16[HC16 <: HLLike16]: ABCFunc[T16, HC16, APRHLLike16[T16, HC16]] =
            HListFunc.toABCFunc[T16, HC16, HLLike16, APRHLLike16](hlistFunnc16)
        

          override def abcFunc17[HC17 <: HLLike17]: ABCFunc[T17, HC17, APRHLLike17[T17, HC17]] =
            HListFunc.toABCFunc[T17, HC17, HLLike17, APRHLLike17](hlistFunnc17)
        

          override def abcFunc18[HC18 <: HLLike18]: ABCFunc[T18, HC18, APRHLLike18[T18, HC18]] =
            HListFunc.toABCFunc[T18, HC18, HLLike18, APRHLLike18](hlistFunnc18)
        
        def hlistFunnc1: HListFunc[HLLike1, APRHLLike1]
def hlistFunnc2: HListFunc[HLLike2, APRHLLike2]
def hlistFunnc3: HListFunc[HLLike3, APRHLLike3]
def hlistFunnc4: HListFunc[HLLike4, APRHLLike4]
def hlistFunnc5: HListFunc[HLLike5, APRHLLike5]
def hlistFunnc6: HListFunc[HLLike6, APRHLLike6]
def hlistFunnc7: HListFunc[HLLike7, APRHLLike7]
def hlistFunnc8: HListFunc[HLLike8, APRHLLike8]
def hlistFunnc9: HListFunc[HLLike9, APRHLLike9]
def hlistFunnc10: HListFunc[HLLike10, APRHLLike10]
def hlistFunnc11: HListFunc[HLLike11, APRHLLike11]
def hlistFunnc12: HListFunc[HLLike12, APRHLLike12]
def hlistFunnc13: HListFunc[HLLike13, APRHLLike13]
def hlistFunnc14: HListFunc[HLLike14, APRHLLike14]
def hlistFunnc15: HListFunc[HLLike15, APRHLLike15]
def hlistFunnc16: HListFunc[HLLike16, APRHLLike16]
def hlistFunnc17: HListFunc[HLLike17, APRHLLike17]
def hlistFunnc18: HListFunc[HLLike18, APRHLLike18]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
      }
    

      trait Support19[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19
      ] extends NatAppender2.Support19[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19
      ] {
        
          override def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]] =
            HListFunc.toABCFunc[T1, HC1, HLLike1, APRHLLike1](hlistFunnc1)
        

          override def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]] =
            HListFunc.toABCFunc[T2, HC2, HLLike2, APRHLLike2](hlistFunnc2)
        

          override def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]] =
            HListFunc.toABCFunc[T3, HC3, HLLike3, APRHLLike3](hlistFunnc3)
        

          override def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]] =
            HListFunc.toABCFunc[T4, HC4, HLLike4, APRHLLike4](hlistFunnc4)
        

          override def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]] =
            HListFunc.toABCFunc[T5, HC5, HLLike5, APRHLLike5](hlistFunnc5)
        

          override def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]] =
            HListFunc.toABCFunc[T6, HC6, HLLike6, APRHLLike6](hlistFunnc6)
        

          override def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]] =
            HListFunc.toABCFunc[T7, HC7, HLLike7, APRHLLike7](hlistFunnc7)
        

          override def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]] =
            HListFunc.toABCFunc[T8, HC8, HLLike8, APRHLLike8](hlistFunnc8)
        

          override def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]] =
            HListFunc.toABCFunc[T9, HC9, HLLike9, APRHLLike9](hlistFunnc9)
        

          override def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]] =
            HListFunc.toABCFunc[T10, HC10, HLLike10, APRHLLike10](hlistFunnc10)
        

          override def abcFunc11[HC11 <: HLLike11]: ABCFunc[T11, HC11, APRHLLike11[T11, HC11]] =
            HListFunc.toABCFunc[T11, HC11, HLLike11, APRHLLike11](hlistFunnc11)
        

          override def abcFunc12[HC12 <: HLLike12]: ABCFunc[T12, HC12, APRHLLike12[T12, HC12]] =
            HListFunc.toABCFunc[T12, HC12, HLLike12, APRHLLike12](hlistFunnc12)
        

          override def abcFunc13[HC13 <: HLLike13]: ABCFunc[T13, HC13, APRHLLike13[T13, HC13]] =
            HListFunc.toABCFunc[T13, HC13, HLLike13, APRHLLike13](hlistFunnc13)
        

          override def abcFunc14[HC14 <: HLLike14]: ABCFunc[T14, HC14, APRHLLike14[T14, HC14]] =
            HListFunc.toABCFunc[T14, HC14, HLLike14, APRHLLike14](hlistFunnc14)
        

          override def abcFunc15[HC15 <: HLLike15]: ABCFunc[T15, HC15, APRHLLike15[T15, HC15]] =
            HListFunc.toABCFunc[T15, HC15, HLLike15, APRHLLike15](hlistFunnc15)
        

          override def abcFunc16[HC16 <: HLLike16]: ABCFunc[T16, HC16, APRHLLike16[T16, HC16]] =
            HListFunc.toABCFunc[T16, HC16, HLLike16, APRHLLike16](hlistFunnc16)
        

          override def abcFunc17[HC17 <: HLLike17]: ABCFunc[T17, HC17, APRHLLike17[T17, HC17]] =
            HListFunc.toABCFunc[T17, HC17, HLLike17, APRHLLike17](hlistFunnc17)
        

          override def abcFunc18[HC18 <: HLLike18]: ABCFunc[T18, HC18, APRHLLike18[T18, HC18]] =
            HListFunc.toABCFunc[T18, HC18, HLLike18, APRHLLike18](hlistFunnc18)
        

          override def abcFunc19[HC19 <: HLLike19]: ABCFunc[T19, HC19, APRHLLike19[T19, HC19]] =
            HListFunc.toABCFunc[T19, HC19, HLLike19, APRHLLike19](hlistFunnc19)
        
        def hlistFunnc1: HListFunc[HLLike1, APRHLLike1]
def hlistFunnc2: HListFunc[HLLike2, APRHLLike2]
def hlistFunnc3: HListFunc[HLLike3, APRHLLike3]
def hlistFunnc4: HListFunc[HLLike4, APRHLLike4]
def hlistFunnc5: HListFunc[HLLike5, APRHLLike5]
def hlistFunnc6: HListFunc[HLLike6, APRHLLike6]
def hlistFunnc7: HListFunc[HLLike7, APRHLLike7]
def hlistFunnc8: HListFunc[HLLike8, APRHLLike8]
def hlistFunnc9: HListFunc[HLLike9, APRHLLike9]
def hlistFunnc10: HListFunc[HLLike10, APRHLLike10]
def hlistFunnc11: HListFunc[HLLike11, APRHLLike11]
def hlistFunnc12: HListFunc[HLLike12, APRHLLike12]
def hlistFunnc13: HListFunc[HLLike13, APRHLLike13]
def hlistFunnc14: HListFunc[HLLike14, APRHLLike14]
def hlistFunnc15: HListFunc[HLLike15, APRHLLike15]
def hlistFunnc16: HListFunc[HLLike16, APRHLLike16]
def hlistFunnc17: HListFunc[HLLike17, APRHLLike17]
def hlistFunnc18: HListFunc[HLLike18, APRHLLike18]
def hlistFunnc19: HListFunc[HLLike19, APRHLLike19]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
      }
    

      trait Support20[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19,APRHLLike20[_, _ <: HLLike20] <: HLLike20
      ] extends NatAppender2.Support20[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20
      ] {
        
          override def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]] =
            HListFunc.toABCFunc[T1, HC1, HLLike1, APRHLLike1](hlistFunnc1)
        

          override def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]] =
            HListFunc.toABCFunc[T2, HC2, HLLike2, APRHLLike2](hlistFunnc2)
        

          override def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]] =
            HListFunc.toABCFunc[T3, HC3, HLLike3, APRHLLike3](hlistFunnc3)
        

          override def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]] =
            HListFunc.toABCFunc[T4, HC4, HLLike4, APRHLLike4](hlistFunnc4)
        

          override def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]] =
            HListFunc.toABCFunc[T5, HC5, HLLike5, APRHLLike5](hlistFunnc5)
        

          override def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]] =
            HListFunc.toABCFunc[T6, HC6, HLLike6, APRHLLike6](hlistFunnc6)
        

          override def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]] =
            HListFunc.toABCFunc[T7, HC7, HLLike7, APRHLLike7](hlistFunnc7)
        

          override def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]] =
            HListFunc.toABCFunc[T8, HC8, HLLike8, APRHLLike8](hlistFunnc8)
        

          override def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]] =
            HListFunc.toABCFunc[T9, HC9, HLLike9, APRHLLike9](hlistFunnc9)
        

          override def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]] =
            HListFunc.toABCFunc[T10, HC10, HLLike10, APRHLLike10](hlistFunnc10)
        

          override def abcFunc11[HC11 <: HLLike11]: ABCFunc[T11, HC11, APRHLLike11[T11, HC11]] =
            HListFunc.toABCFunc[T11, HC11, HLLike11, APRHLLike11](hlistFunnc11)
        

          override def abcFunc12[HC12 <: HLLike12]: ABCFunc[T12, HC12, APRHLLike12[T12, HC12]] =
            HListFunc.toABCFunc[T12, HC12, HLLike12, APRHLLike12](hlistFunnc12)
        

          override def abcFunc13[HC13 <: HLLike13]: ABCFunc[T13, HC13, APRHLLike13[T13, HC13]] =
            HListFunc.toABCFunc[T13, HC13, HLLike13, APRHLLike13](hlistFunnc13)
        

          override def abcFunc14[HC14 <: HLLike14]: ABCFunc[T14, HC14, APRHLLike14[T14, HC14]] =
            HListFunc.toABCFunc[T14, HC14, HLLike14, APRHLLike14](hlistFunnc14)
        

          override def abcFunc15[HC15 <: HLLike15]: ABCFunc[T15, HC15, APRHLLike15[T15, HC15]] =
            HListFunc.toABCFunc[T15, HC15, HLLike15, APRHLLike15](hlistFunnc15)
        

          override def abcFunc16[HC16 <: HLLike16]: ABCFunc[T16, HC16, APRHLLike16[T16, HC16]] =
            HListFunc.toABCFunc[T16, HC16, HLLike16, APRHLLike16](hlistFunnc16)
        

          override def abcFunc17[HC17 <: HLLike17]: ABCFunc[T17, HC17, APRHLLike17[T17, HC17]] =
            HListFunc.toABCFunc[T17, HC17, HLLike17, APRHLLike17](hlistFunnc17)
        

          override def abcFunc18[HC18 <: HLLike18]: ABCFunc[T18, HC18, APRHLLike18[T18, HC18]] =
            HListFunc.toABCFunc[T18, HC18, HLLike18, APRHLLike18](hlistFunnc18)
        

          override def abcFunc19[HC19 <: HLLike19]: ABCFunc[T19, HC19, APRHLLike19[T19, HC19]] =
            HListFunc.toABCFunc[T19, HC19, HLLike19, APRHLLike19](hlistFunnc19)
        

          override def abcFunc20[HC20 <: HLLike20]: ABCFunc[T20, HC20, APRHLLike20[T20, HC20]] =
            HListFunc.toABCFunc[T20, HC20, HLLike20, APRHLLike20](hlistFunnc20)
        
        def hlistFunnc1: HListFunc[HLLike1, APRHLLike1]
def hlistFunnc2: HListFunc[HLLike2, APRHLLike2]
def hlistFunnc3: HListFunc[HLLike3, APRHLLike3]
def hlistFunnc4: HListFunc[HLLike4, APRHLLike4]
def hlistFunnc5: HListFunc[HLLike5, APRHLLike5]
def hlistFunnc6: HListFunc[HLLike6, APRHLLike6]
def hlistFunnc7: HListFunc[HLLike7, APRHLLike7]
def hlistFunnc8: HListFunc[HLLike8, APRHLLike8]
def hlistFunnc9: HListFunc[HLLike9, APRHLLike9]
def hlistFunnc10: HListFunc[HLLike10, APRHLLike10]
def hlistFunnc11: HListFunc[HLLike11, APRHLLike11]
def hlistFunnc12: HListFunc[HLLike12, APRHLLike12]
def hlistFunnc13: HListFunc[HLLike13, APRHLLike13]
def hlistFunnc14: HListFunc[HLLike14, APRHLLike14]
def hlistFunnc15: HListFunc[HLLike15, APRHLLike15]
def hlistFunnc16: HListFunc[HLLike16, APRHLLike16]
def hlistFunnc17: HListFunc[HLLike17, APRHLLike17]
def hlistFunnc18: HListFunc[HLLike18, APRHLLike18]
def hlistFunnc19: HListFunc[HLLike19, APRHLLike19]
def hlistFunnc20: HListFunc[HLLike20, APRHLLike20]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
      }
    

      trait Support21[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19,APRHLLike20[_, _ <: HLLike20] <: HLLike20,APRHLLike21[_, _ <: HLLike21] <: HLLike21
      ] extends NatAppender2.Support21[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20,APRHLLike21
      ] {
        
          override def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]] =
            HListFunc.toABCFunc[T1, HC1, HLLike1, APRHLLike1](hlistFunnc1)
        

          override def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]] =
            HListFunc.toABCFunc[T2, HC2, HLLike2, APRHLLike2](hlistFunnc2)
        

          override def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]] =
            HListFunc.toABCFunc[T3, HC3, HLLike3, APRHLLike3](hlistFunnc3)
        

          override def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]] =
            HListFunc.toABCFunc[T4, HC4, HLLike4, APRHLLike4](hlistFunnc4)
        

          override def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]] =
            HListFunc.toABCFunc[T5, HC5, HLLike5, APRHLLike5](hlistFunnc5)
        

          override def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]] =
            HListFunc.toABCFunc[T6, HC6, HLLike6, APRHLLike6](hlistFunnc6)
        

          override def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]] =
            HListFunc.toABCFunc[T7, HC7, HLLike7, APRHLLike7](hlistFunnc7)
        

          override def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]] =
            HListFunc.toABCFunc[T8, HC8, HLLike8, APRHLLike8](hlistFunnc8)
        

          override def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]] =
            HListFunc.toABCFunc[T9, HC9, HLLike9, APRHLLike9](hlistFunnc9)
        

          override def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]] =
            HListFunc.toABCFunc[T10, HC10, HLLike10, APRHLLike10](hlistFunnc10)
        

          override def abcFunc11[HC11 <: HLLike11]: ABCFunc[T11, HC11, APRHLLike11[T11, HC11]] =
            HListFunc.toABCFunc[T11, HC11, HLLike11, APRHLLike11](hlistFunnc11)
        

          override def abcFunc12[HC12 <: HLLike12]: ABCFunc[T12, HC12, APRHLLike12[T12, HC12]] =
            HListFunc.toABCFunc[T12, HC12, HLLike12, APRHLLike12](hlistFunnc12)
        

          override def abcFunc13[HC13 <: HLLike13]: ABCFunc[T13, HC13, APRHLLike13[T13, HC13]] =
            HListFunc.toABCFunc[T13, HC13, HLLike13, APRHLLike13](hlistFunnc13)
        

          override def abcFunc14[HC14 <: HLLike14]: ABCFunc[T14, HC14, APRHLLike14[T14, HC14]] =
            HListFunc.toABCFunc[T14, HC14, HLLike14, APRHLLike14](hlistFunnc14)
        

          override def abcFunc15[HC15 <: HLLike15]: ABCFunc[T15, HC15, APRHLLike15[T15, HC15]] =
            HListFunc.toABCFunc[T15, HC15, HLLike15, APRHLLike15](hlistFunnc15)
        

          override def abcFunc16[HC16 <: HLLike16]: ABCFunc[T16, HC16, APRHLLike16[T16, HC16]] =
            HListFunc.toABCFunc[T16, HC16, HLLike16, APRHLLike16](hlistFunnc16)
        

          override def abcFunc17[HC17 <: HLLike17]: ABCFunc[T17, HC17, APRHLLike17[T17, HC17]] =
            HListFunc.toABCFunc[T17, HC17, HLLike17, APRHLLike17](hlistFunnc17)
        

          override def abcFunc18[HC18 <: HLLike18]: ABCFunc[T18, HC18, APRHLLike18[T18, HC18]] =
            HListFunc.toABCFunc[T18, HC18, HLLike18, APRHLLike18](hlistFunnc18)
        

          override def abcFunc19[HC19 <: HLLike19]: ABCFunc[T19, HC19, APRHLLike19[T19, HC19]] =
            HListFunc.toABCFunc[T19, HC19, HLLike19, APRHLLike19](hlistFunnc19)
        

          override def abcFunc20[HC20 <: HLLike20]: ABCFunc[T20, HC20, APRHLLike20[T20, HC20]] =
            HListFunc.toABCFunc[T20, HC20, HLLike20, APRHLLike20](hlistFunnc20)
        

          override def abcFunc21[HC21 <: HLLike21]: ABCFunc[T21, HC21, APRHLLike21[T21, HC21]] =
            HListFunc.toABCFunc[T21, HC21, HLLike21, APRHLLike21](hlistFunnc21)
        
        def hlistFunnc1: HListFunc[HLLike1, APRHLLike1]
def hlistFunnc2: HListFunc[HLLike2, APRHLLike2]
def hlistFunnc3: HListFunc[HLLike3, APRHLLike3]
def hlistFunnc4: HListFunc[HLLike4, APRHLLike4]
def hlistFunnc5: HListFunc[HLLike5, APRHLLike5]
def hlistFunnc6: HListFunc[HLLike6, APRHLLike6]
def hlistFunnc7: HListFunc[HLLike7, APRHLLike7]
def hlistFunnc8: HListFunc[HLLike8, APRHLLike8]
def hlistFunnc9: HListFunc[HLLike9, APRHLLike9]
def hlistFunnc10: HListFunc[HLLike10, APRHLLike10]
def hlistFunnc11: HListFunc[HLLike11, APRHLLike11]
def hlistFunnc12: HListFunc[HLLike12, APRHLLike12]
def hlistFunnc13: HListFunc[HLLike13, APRHLLike13]
def hlistFunnc14: HListFunc[HLLike14, APRHLLike14]
def hlistFunnc15: HListFunc[HLLike15, APRHLLike15]
def hlistFunnc16: HListFunc[HLLike16, APRHLLike16]
def hlistFunnc17: HListFunc[HLLike17, APRHLLike17]
def hlistFunnc18: HListFunc[HLLike18, APRHLLike18]
def hlistFunnc19: HListFunc[HLLike19, APRHLLike19]
def hlistFunnc20: HListFunc[HLLike20, APRHLLike20]
def hlistFunnc21: HListFunc[HLLike21, APRHLLike21]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
      }
    
    }
  