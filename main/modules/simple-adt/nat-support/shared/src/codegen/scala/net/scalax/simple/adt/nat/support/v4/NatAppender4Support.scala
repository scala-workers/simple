
    package net.scalax.simple.adt
    package nat
    package support

    object NatAppender4 {
      
      trait Support1[
        M[_],
        T1,
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender3.Support1[
        M,
        T1,
        HLLike1,
        APRHLLike1
      ] {
        SupportSelf =>

        
        def headPlus: M[T1]
      }
    

      trait Support2[
        M[_,_],
        T1,T2,
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender3.Support2[
        M,
        T1,T2,
        HLLike1,HLLike1,
        APRHLLike1,APRHLLike1
      ] {
        SupportSelf =>

        override def hlistFunnc2: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
        def headPlus: M[T1,T2]
      }
    

      trait Support3[
        M[_,_,_],
        T1,T2,T3,
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender3.Support3[
        M,
        T1,T2,T3,
        HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1
      ] {
        SupportSelf =>

        override def hlistFunnc2: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc3: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
        def headPlus: M[T1,T2,T3]
      }
    

      trait Support4[
        M[_,_,_,_],
        T1,T2,T3,T4,
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender3.Support4[
        M,
        T1,T2,T3,T4,
        HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] {
        SupportSelf =>

        override def hlistFunnc2: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc3: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc4: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
        def headPlus: M[T1,T2,T3,T4]
      }
    

      trait Support5[
        M[_,_,_,_,_],
        T1,T2,T3,T4,T5,
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender3.Support5[
        M,
        T1,T2,T3,T4,T5,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] {
        SupportSelf =>

        override def hlistFunnc2: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc3: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc4: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc5: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
        def headPlus: M[T1,T2,T3,T4,T5]
      }
    

      trait Support6[
        M[_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender3.Support6[
        M,
        T1,T2,T3,T4,T5,T6,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] {
        SupportSelf =>

        override def hlistFunnc2: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc3: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc4: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc5: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc6: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
        def headPlus: M[T1,T2,T3,T4,T5,T6]
      }
    

      trait Support7[
        M[_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender3.Support7[
        M,
        T1,T2,T3,T4,T5,T6,T7,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] {
        SupportSelf =>

        override def hlistFunnc2: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc3: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc4: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc5: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc6: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc7: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7]
      }
    

      trait Support8[
        M[_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender3.Support8[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] {
        SupportSelf =>

        override def hlistFunnc2: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc3: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc4: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc5: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc6: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc7: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc8: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8]
      }
    

      trait Support9[
        M[_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender3.Support9[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] {
        SupportSelf =>

        override def hlistFunnc2: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc3: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc4: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc5: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc6: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc7: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc8: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc9: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9]
      }
    

      trait Support10[
        M[_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender3.Support10[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] {
        SupportSelf =>

        override def hlistFunnc2: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc3: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc4: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc5: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc6: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc7: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc8: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc9: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc10: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]
      }
    

      trait Support11[
        M[_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender3.Support11[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] {
        SupportSelf =>

        override def hlistFunnc2: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc3: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc4: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc5: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc6: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc7: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc8: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc9: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc10: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc11: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]
      }
    

      trait Support12[
        M[_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender3.Support12[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] {
        SupportSelf =>

        override def hlistFunnc2: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc3: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc4: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc5: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc6: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc7: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc8: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc9: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc10: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc11: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc12: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]
      }
    

      trait Support13[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender3.Support13[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] {
        SupportSelf =>

        override def hlistFunnc2: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc3: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc4: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc5: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc6: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc7: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc8: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc9: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc10: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc11: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc12: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc13: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]
      }
    

      trait Support14[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender3.Support14[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] {
        SupportSelf =>

        override def hlistFunnc2: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc3: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc4: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc5: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc6: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc7: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc8: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc9: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc10: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc11: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc12: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc13: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc14: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]
      }
    

      trait Support15[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender3.Support15[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] {
        SupportSelf =>

        override def hlistFunnc2: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc3: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc4: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc5: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc6: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc7: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc8: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc9: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc10: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc11: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc12: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc13: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc14: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc15: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
      }
    

      trait Support16[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender3.Support16[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] {
        SupportSelf =>

        override def hlistFunnc2: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc3: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc4: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc5: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc6: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc7: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc8: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc9: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc10: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc11: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc12: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc13: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc14: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc15: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc16: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
      }
    

      trait Support17[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender3.Support17[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] {
        SupportSelf =>

        override def hlistFunnc2: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc3: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc4: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc5: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc6: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc7: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc8: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc9: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc10: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc11: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc12: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc13: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc14: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc15: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc16: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc17: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
      }
    

      trait Support18[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender3.Support18[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] {
        SupportSelf =>

        override def hlistFunnc2: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc3: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc4: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc5: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc6: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc7: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc8: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc9: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc10: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc11: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc12: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc13: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc14: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc15: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc16: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc17: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc18: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
      }
    

      trait Support19[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender3.Support19[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] {
        SupportSelf =>

        override def hlistFunnc2: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc3: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc4: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc5: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc6: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc7: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc8: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc9: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc10: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc11: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc12: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc13: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc14: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc15: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc16: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc17: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc18: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc19: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
      }
    

      trait Support20[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender3.Support20[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] {
        SupportSelf =>

        override def hlistFunnc2: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc3: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc4: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc5: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc6: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc7: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc8: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc9: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc10: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc11: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc12: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc13: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc14: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc15: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc16: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc17: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc18: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc19: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc20: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
      }
    

      trait Support21[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender3.Support21[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] {
        SupportSelf =>

        override def hlistFunnc2: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc3: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc4: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc5: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc6: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc7: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc8: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc9: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc10: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc11: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc12: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc13: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc14: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc15: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc16: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc17: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc18: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc19: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc20: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
override def hlistFunnc21: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
      }
    
    }
  