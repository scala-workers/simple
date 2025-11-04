
    package net.scalax.simple.adt
    package nat
    package support

    object NatAppender2 {
      
      trait Support1[
        M[_],
        T1,
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender1.Support1[
        M,
        T1,
        HLLike1,
        APRHLLike1
      ] {
        def sAppender: SimpleAppender1Positive[M]
        def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]]
        def headPlus: M[T1]

        override def append[HCollection1 <: HLLike1](
          parameter: M[HCollection1]
        ): M[APRHLLike1[T1, HCollection1]] =
          sAppender.append(abcFunc1[HCollection1])(headPlus, parameter)
      }
    

      trait Support2[
        M[_,_],
        T1,T2,
        HLLike1,HLLike2,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2
      ] extends NatAppender1.Support2[
        M,
        T1,T2,
        HLLike1,HLLike2,
        APRHLLike1,APRHLLike2
      ] {
        def sAppender: SimpleAppender2Positive[M]
        def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]]
def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]]
        def headPlus: M[T1,T2]

        override def append[HCollection1 <: HLLike1,HCollection2 <: HLLike2](
          parameter: M[HCollection1,HCollection2]
        ): M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2]] =
          sAppender.append(abcFunc1[HCollection1],abcFunc2[HCollection2])(headPlus, parameter)
      }
    

      trait Support3[
        M[_,_,_],
        T1,T2,T3,
        HLLike1,HLLike2,HLLike3,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3
      ] extends NatAppender1.Support3[
        M,
        T1,T2,T3,
        HLLike1,HLLike2,HLLike3,
        APRHLLike1,APRHLLike2,APRHLLike3
      ] {
        def sAppender: SimpleAppender3Positive[M]
        def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]]
def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]]
def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]]
        def headPlus: M[T1,T2,T3]

        override def append[HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3](
          parameter: M[HCollection1,HCollection2,HCollection3]
        ): M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3]] =
          sAppender.append(abcFunc1[HCollection1],abcFunc2[HCollection2],abcFunc3[HCollection3])(headPlus, parameter)
      }
    

      trait Support4[
        M[_,_,_,_],
        T1,T2,T3,T4,
        HLLike1,HLLike2,HLLike3,HLLike4,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4
      ] extends NatAppender1.Support4[
        M,
        T1,T2,T3,T4,
        HLLike1,HLLike2,HLLike3,HLLike4,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4
      ] {
        def sAppender: SimpleAppender4Positive[M]
        def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]]
def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]]
def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]]
def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]]
        def headPlus: M[T1,T2,T3,T4]

        override def append[HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4](
          parameter: M[HCollection1,HCollection2,HCollection3,HCollection4]
        ): M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4]] =
          sAppender.append(abcFunc1[HCollection1],abcFunc2[HCollection2],abcFunc3[HCollection3],abcFunc4[HCollection4])(headPlus, parameter)
      }
    

      trait Support5[
        M[_,_,_,_,_],
        T1,T2,T3,T4,T5,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5
      ] extends NatAppender1.Support5[
        M,
        T1,T2,T3,T4,T5,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5
      ] {
        def sAppender: SimpleAppender5Positive[M]
        def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]]
def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]]
def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]]
def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]]
def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]]
        def headPlus: M[T1,T2,T3,T4,T5]

        override def append[HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5](
          parameter: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5]
        ): M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5]] =
          sAppender.append(abcFunc1[HCollection1],abcFunc2[HCollection2],abcFunc3[HCollection3],abcFunc4[HCollection4],abcFunc5[HCollection5])(headPlus, parameter)
      }
    

      trait Support6[
        M[_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6
      ] extends NatAppender1.Support6[
        M,
        T1,T2,T3,T4,T5,T6,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6
      ] {
        def sAppender: SimpleAppender6Positive[M]
        def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]]
def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]]
def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]]
def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]]
def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]]
def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]]
        def headPlus: M[T1,T2,T3,T4,T5,T6]

        override def append[HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6](
          parameter: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6]
        ): M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6]] =
          sAppender.append(abcFunc1[HCollection1],abcFunc2[HCollection2],abcFunc3[HCollection3],abcFunc4[HCollection4],abcFunc5[HCollection5],abcFunc6[HCollection6])(headPlus, parameter)
      }
    

      trait Support7[
        M[_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7
      ] extends NatAppender1.Support7[
        M,
        T1,T2,T3,T4,T5,T6,T7,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7
      ] {
        def sAppender: SimpleAppender7Positive[M]
        def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]]
def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]]
def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]]
def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]]
def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]]
def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]]
def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7]

        override def append[HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7](
          parameter: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7]
        ): M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7]] =
          sAppender.append(abcFunc1[HCollection1],abcFunc2[HCollection2],abcFunc3[HCollection3],abcFunc4[HCollection4],abcFunc5[HCollection5],abcFunc6[HCollection6],abcFunc7[HCollection7])(headPlus, parameter)
      }
    

      trait Support8[
        M[_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8
      ] extends NatAppender1.Support8[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8
      ] {
        def sAppender: SimpleAppender8Positive[M]
        def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]]
def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]]
def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]]
def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]]
def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]]
def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]]
def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]]
def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8]

        override def append[HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8](
          parameter: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8]
        ): M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8]] =
          sAppender.append(abcFunc1[HCollection1],abcFunc2[HCollection2],abcFunc3[HCollection3],abcFunc4[HCollection4],abcFunc5[HCollection5],abcFunc6[HCollection6],abcFunc7[HCollection7],abcFunc8[HCollection8])(headPlus, parameter)
      }
    

      trait Support9[
        M[_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9
      ] extends NatAppender1.Support9[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9
      ] {
        def sAppender: SimpleAppender9Positive[M]
        def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]]
def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]]
def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]]
def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]]
def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]]
def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]]
def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]]
def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]]
def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9]

        override def append[HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9](
          parameter: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9]
        ): M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9]] =
          sAppender.append(abcFunc1[HCollection1],abcFunc2[HCollection2],abcFunc3[HCollection3],abcFunc4[HCollection4],abcFunc5[HCollection5],abcFunc6[HCollection6],abcFunc7[HCollection7],abcFunc8[HCollection8],abcFunc9[HCollection9])(headPlus, parameter)
      }
    

      trait Support10[
        M[_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10
      ] extends NatAppender1.Support10[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10
      ] {
        def sAppender: SimpleAppender10Positive[M]
        def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]]
def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]]
def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]]
def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]]
def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]]
def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]]
def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]]
def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]]
def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]]
def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]

        override def append[HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10](
          parameter: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10]
        ): M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10]] =
          sAppender.append(abcFunc1[HCollection1],abcFunc2[HCollection2],abcFunc3[HCollection3],abcFunc4[HCollection4],abcFunc5[HCollection5],abcFunc6[HCollection6],abcFunc7[HCollection7],abcFunc8[HCollection8],abcFunc9[HCollection9],abcFunc10[HCollection10])(headPlus, parameter)
      }
    

      trait Support11[
        M[_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11
      ] extends NatAppender1.Support11[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11
      ] {
        def sAppender: SimpleAppender11Positive[M]
        def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]]
def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]]
def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]]
def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]]
def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]]
def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]]
def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]]
def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]]
def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]]
def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]]
def abcFunc11[HC11 <: HLLike11]: ABCFunc[T11, HC11, APRHLLike11[T11, HC11]]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]

        override def append[HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11](
          parameter: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11]
        ): M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11]] =
          sAppender.append(abcFunc1[HCollection1],abcFunc2[HCollection2],abcFunc3[HCollection3],abcFunc4[HCollection4],abcFunc5[HCollection5],abcFunc6[HCollection6],abcFunc7[HCollection7],abcFunc8[HCollection8],abcFunc9[HCollection9],abcFunc10[HCollection10],abcFunc11[HCollection11])(headPlus, parameter)
      }
    

      trait Support12[
        M[_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12
      ] extends NatAppender1.Support12[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12
      ] {
        def sAppender: SimpleAppender12Positive[M]
        def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]]
def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]]
def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]]
def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]]
def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]]
def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]]
def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]]
def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]]
def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]]
def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]]
def abcFunc11[HC11 <: HLLike11]: ABCFunc[T11, HC11, APRHLLike11[T11, HC11]]
def abcFunc12[HC12 <: HLLike12]: ABCFunc[T12, HC12, APRHLLike12[T12, HC12]]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]

        override def append[HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12](
          parameter: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12]
        ): M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12]] =
          sAppender.append(abcFunc1[HCollection1],abcFunc2[HCollection2],abcFunc3[HCollection3],abcFunc4[HCollection4],abcFunc5[HCollection5],abcFunc6[HCollection6],abcFunc7[HCollection7],abcFunc8[HCollection8],abcFunc9[HCollection9],abcFunc10[HCollection10],abcFunc11[HCollection11],abcFunc12[HCollection12])(headPlus, parameter)
      }
    

      trait Support13[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13
      ] extends NatAppender1.Support13[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13
      ] {
        def sAppender: SimpleAppender13Positive[M]
        def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]]
def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]]
def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]]
def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]]
def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]]
def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]]
def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]]
def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]]
def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]]
def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]]
def abcFunc11[HC11 <: HLLike11]: ABCFunc[T11, HC11, APRHLLike11[T11, HC11]]
def abcFunc12[HC12 <: HLLike12]: ABCFunc[T12, HC12, APRHLLike12[T12, HC12]]
def abcFunc13[HC13 <: HLLike13]: ABCFunc[T13, HC13, APRHLLike13[T13, HC13]]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]

        override def append[HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13](
          parameter: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13]
        ): M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13]] =
          sAppender.append(abcFunc1[HCollection1],abcFunc2[HCollection2],abcFunc3[HCollection3],abcFunc4[HCollection4],abcFunc5[HCollection5],abcFunc6[HCollection6],abcFunc7[HCollection7],abcFunc8[HCollection8],abcFunc9[HCollection9],abcFunc10[HCollection10],abcFunc11[HCollection11],abcFunc12[HCollection12],abcFunc13[HCollection13])(headPlus, parameter)
      }
    

      trait Support14[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14
      ] extends NatAppender1.Support14[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14
      ] {
        def sAppender: SimpleAppender14Positive[M]
        def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]]
def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]]
def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]]
def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]]
def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]]
def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]]
def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]]
def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]]
def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]]
def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]]
def abcFunc11[HC11 <: HLLike11]: ABCFunc[T11, HC11, APRHLLike11[T11, HC11]]
def abcFunc12[HC12 <: HLLike12]: ABCFunc[T12, HC12, APRHLLike12[T12, HC12]]
def abcFunc13[HC13 <: HLLike13]: ABCFunc[T13, HC13, APRHLLike13[T13, HC13]]
def abcFunc14[HC14 <: HLLike14]: ABCFunc[T14, HC14, APRHLLike14[T14, HC14]]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]

        override def append[HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14](
          parameter: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14]
        ): M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14]] =
          sAppender.append(abcFunc1[HCollection1],abcFunc2[HCollection2],abcFunc3[HCollection3],abcFunc4[HCollection4],abcFunc5[HCollection5],abcFunc6[HCollection6],abcFunc7[HCollection7],abcFunc8[HCollection8],abcFunc9[HCollection9],abcFunc10[HCollection10],abcFunc11[HCollection11],abcFunc12[HCollection12],abcFunc13[HCollection13],abcFunc14[HCollection14])(headPlus, parameter)
      }
    

      trait Support15[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15
      ] extends NatAppender1.Support15[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15
      ] {
        def sAppender: SimpleAppender15Positive[M]
        def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]]
def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]]
def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]]
def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]]
def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]]
def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]]
def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]]
def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]]
def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]]
def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]]
def abcFunc11[HC11 <: HLLike11]: ABCFunc[T11, HC11, APRHLLike11[T11, HC11]]
def abcFunc12[HC12 <: HLLike12]: ABCFunc[T12, HC12, APRHLLike12[T12, HC12]]
def abcFunc13[HC13 <: HLLike13]: ABCFunc[T13, HC13, APRHLLike13[T13, HC13]]
def abcFunc14[HC14 <: HLLike14]: ABCFunc[T14, HC14, APRHLLike14[T14, HC14]]
def abcFunc15[HC15 <: HLLike15]: ABCFunc[T15, HC15, APRHLLike15[T15, HC15]]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]

        override def append[HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15](
          parameter: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15]
        ): M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14],APRHLLike15[T15, HCollection15]] =
          sAppender.append(abcFunc1[HCollection1],abcFunc2[HCollection2],abcFunc3[HCollection3],abcFunc4[HCollection4],abcFunc5[HCollection5],abcFunc6[HCollection6],abcFunc7[HCollection7],abcFunc8[HCollection8],abcFunc9[HCollection9],abcFunc10[HCollection10],abcFunc11[HCollection11],abcFunc12[HCollection12],abcFunc13[HCollection13],abcFunc14[HCollection14],abcFunc15[HCollection15])(headPlus, parameter)
      }
    

      trait Support16[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16
      ] extends NatAppender1.Support16[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16
      ] {
        def sAppender: SimpleAppender16Positive[M]
        def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]]
def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]]
def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]]
def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]]
def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]]
def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]]
def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]]
def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]]
def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]]
def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]]
def abcFunc11[HC11 <: HLLike11]: ABCFunc[T11, HC11, APRHLLike11[T11, HC11]]
def abcFunc12[HC12 <: HLLike12]: ABCFunc[T12, HC12, APRHLLike12[T12, HC12]]
def abcFunc13[HC13 <: HLLike13]: ABCFunc[T13, HC13, APRHLLike13[T13, HC13]]
def abcFunc14[HC14 <: HLLike14]: ABCFunc[T14, HC14, APRHLLike14[T14, HC14]]
def abcFunc15[HC15 <: HLLike15]: ABCFunc[T15, HC15, APRHLLike15[T15, HC15]]
def abcFunc16[HC16 <: HLLike16]: ABCFunc[T16, HC16, APRHLLike16[T16, HC16]]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]

        override def append[HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16](
          parameter: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16]
        ): M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14],APRHLLike15[T15, HCollection15],APRHLLike16[T16, HCollection16]] =
          sAppender.append(abcFunc1[HCollection1],abcFunc2[HCollection2],abcFunc3[HCollection3],abcFunc4[HCollection4],abcFunc5[HCollection5],abcFunc6[HCollection6],abcFunc7[HCollection7],abcFunc8[HCollection8],abcFunc9[HCollection9],abcFunc10[HCollection10],abcFunc11[HCollection11],abcFunc12[HCollection12],abcFunc13[HCollection13],abcFunc14[HCollection14],abcFunc15[HCollection15],abcFunc16[HCollection16])(headPlus, parameter)
      }
    

      trait Support17[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17
      ] extends NatAppender1.Support17[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17
      ] {
        def sAppender: SimpleAppender17Positive[M]
        def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]]
def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]]
def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]]
def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]]
def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]]
def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]]
def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]]
def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]]
def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]]
def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]]
def abcFunc11[HC11 <: HLLike11]: ABCFunc[T11, HC11, APRHLLike11[T11, HC11]]
def abcFunc12[HC12 <: HLLike12]: ABCFunc[T12, HC12, APRHLLike12[T12, HC12]]
def abcFunc13[HC13 <: HLLike13]: ABCFunc[T13, HC13, APRHLLike13[T13, HC13]]
def abcFunc14[HC14 <: HLLike14]: ABCFunc[T14, HC14, APRHLLike14[T14, HC14]]
def abcFunc15[HC15 <: HLLike15]: ABCFunc[T15, HC15, APRHLLike15[T15, HC15]]
def abcFunc16[HC16 <: HLLike16]: ABCFunc[T16, HC16, APRHLLike16[T16, HC16]]
def abcFunc17[HC17 <: HLLike17]: ABCFunc[T17, HC17, APRHLLike17[T17, HC17]]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]

        override def append[HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17](
          parameter: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17]
        ): M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14],APRHLLike15[T15, HCollection15],APRHLLike16[T16, HCollection16],APRHLLike17[T17, HCollection17]] =
          sAppender.append(abcFunc1[HCollection1],abcFunc2[HCollection2],abcFunc3[HCollection3],abcFunc4[HCollection4],abcFunc5[HCollection5],abcFunc6[HCollection6],abcFunc7[HCollection7],abcFunc8[HCollection8],abcFunc9[HCollection9],abcFunc10[HCollection10],abcFunc11[HCollection11],abcFunc12[HCollection12],abcFunc13[HCollection13],abcFunc14[HCollection14],abcFunc15[HCollection15],abcFunc16[HCollection16],abcFunc17[HCollection17])(headPlus, parameter)
      }
    

      trait Support18[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18
      ] extends NatAppender1.Support18[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18
      ] {
        def sAppender: SimpleAppender18Positive[M]
        def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]]
def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]]
def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]]
def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]]
def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]]
def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]]
def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]]
def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]]
def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]]
def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]]
def abcFunc11[HC11 <: HLLike11]: ABCFunc[T11, HC11, APRHLLike11[T11, HC11]]
def abcFunc12[HC12 <: HLLike12]: ABCFunc[T12, HC12, APRHLLike12[T12, HC12]]
def abcFunc13[HC13 <: HLLike13]: ABCFunc[T13, HC13, APRHLLike13[T13, HC13]]
def abcFunc14[HC14 <: HLLike14]: ABCFunc[T14, HC14, APRHLLike14[T14, HC14]]
def abcFunc15[HC15 <: HLLike15]: ABCFunc[T15, HC15, APRHLLike15[T15, HC15]]
def abcFunc16[HC16 <: HLLike16]: ABCFunc[T16, HC16, APRHLLike16[T16, HC16]]
def abcFunc17[HC17 <: HLLike17]: ABCFunc[T17, HC17, APRHLLike17[T17, HC17]]
def abcFunc18[HC18 <: HLLike18]: ABCFunc[T18, HC18, APRHLLike18[T18, HC18]]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]

        override def append[HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17,HCollection18 <: HLLike18](
          parameter: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18]
        ): M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14],APRHLLike15[T15, HCollection15],APRHLLike16[T16, HCollection16],APRHLLike17[T17, HCollection17],APRHLLike18[T18, HCollection18]] =
          sAppender.append(abcFunc1[HCollection1],abcFunc2[HCollection2],abcFunc3[HCollection3],abcFunc4[HCollection4],abcFunc5[HCollection5],abcFunc6[HCollection6],abcFunc7[HCollection7],abcFunc8[HCollection8],abcFunc9[HCollection9],abcFunc10[HCollection10],abcFunc11[HCollection11],abcFunc12[HCollection12],abcFunc13[HCollection13],abcFunc14[HCollection14],abcFunc15[HCollection15],abcFunc16[HCollection16],abcFunc17[HCollection17],abcFunc18[HCollection18])(headPlus, parameter)
      }
    

      trait Support19[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19
      ] extends NatAppender1.Support19[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19
      ] {
        def sAppender: SimpleAppender19Positive[M]
        def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]]
def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]]
def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]]
def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]]
def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]]
def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]]
def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]]
def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]]
def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]]
def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]]
def abcFunc11[HC11 <: HLLike11]: ABCFunc[T11, HC11, APRHLLike11[T11, HC11]]
def abcFunc12[HC12 <: HLLike12]: ABCFunc[T12, HC12, APRHLLike12[T12, HC12]]
def abcFunc13[HC13 <: HLLike13]: ABCFunc[T13, HC13, APRHLLike13[T13, HC13]]
def abcFunc14[HC14 <: HLLike14]: ABCFunc[T14, HC14, APRHLLike14[T14, HC14]]
def abcFunc15[HC15 <: HLLike15]: ABCFunc[T15, HC15, APRHLLike15[T15, HC15]]
def abcFunc16[HC16 <: HLLike16]: ABCFunc[T16, HC16, APRHLLike16[T16, HC16]]
def abcFunc17[HC17 <: HLLike17]: ABCFunc[T17, HC17, APRHLLike17[T17, HC17]]
def abcFunc18[HC18 <: HLLike18]: ABCFunc[T18, HC18, APRHLLike18[T18, HC18]]
def abcFunc19[HC19 <: HLLike19]: ABCFunc[T19, HC19, APRHLLike19[T19, HC19]]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]

        override def append[HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17,HCollection18 <: HLLike18,HCollection19 <: HLLike19](
          parameter: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19]
        ): M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14],APRHLLike15[T15, HCollection15],APRHLLike16[T16, HCollection16],APRHLLike17[T17, HCollection17],APRHLLike18[T18, HCollection18],APRHLLike19[T19, HCollection19]] =
          sAppender.append(abcFunc1[HCollection1],abcFunc2[HCollection2],abcFunc3[HCollection3],abcFunc4[HCollection4],abcFunc5[HCollection5],abcFunc6[HCollection6],abcFunc7[HCollection7],abcFunc8[HCollection8],abcFunc9[HCollection9],abcFunc10[HCollection10],abcFunc11[HCollection11],abcFunc12[HCollection12],abcFunc13[HCollection13],abcFunc14[HCollection14],abcFunc15[HCollection15],abcFunc16[HCollection16],abcFunc17[HCollection17],abcFunc18[HCollection18],abcFunc19[HCollection19])(headPlus, parameter)
      }
    

      trait Support20[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19,APRHLLike20[_, _ <: HLLike20] <: HLLike20
      ] extends NatAppender1.Support20[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20
      ] {
        def sAppender: SimpleAppender20Positive[M]
        def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]]
def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]]
def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]]
def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]]
def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]]
def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]]
def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]]
def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]]
def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]]
def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]]
def abcFunc11[HC11 <: HLLike11]: ABCFunc[T11, HC11, APRHLLike11[T11, HC11]]
def abcFunc12[HC12 <: HLLike12]: ABCFunc[T12, HC12, APRHLLike12[T12, HC12]]
def abcFunc13[HC13 <: HLLike13]: ABCFunc[T13, HC13, APRHLLike13[T13, HC13]]
def abcFunc14[HC14 <: HLLike14]: ABCFunc[T14, HC14, APRHLLike14[T14, HC14]]
def abcFunc15[HC15 <: HLLike15]: ABCFunc[T15, HC15, APRHLLike15[T15, HC15]]
def abcFunc16[HC16 <: HLLike16]: ABCFunc[T16, HC16, APRHLLike16[T16, HC16]]
def abcFunc17[HC17 <: HLLike17]: ABCFunc[T17, HC17, APRHLLike17[T17, HC17]]
def abcFunc18[HC18 <: HLLike18]: ABCFunc[T18, HC18, APRHLLike18[T18, HC18]]
def abcFunc19[HC19 <: HLLike19]: ABCFunc[T19, HC19, APRHLLike19[T19, HC19]]
def abcFunc20[HC20 <: HLLike20]: ABCFunc[T20, HC20, APRHLLike20[T20, HC20]]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]

        override def append[HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17,HCollection18 <: HLLike18,HCollection19 <: HLLike19,HCollection20 <: HLLike20](
          parameter: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20]
        ): M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14],APRHLLike15[T15, HCollection15],APRHLLike16[T16, HCollection16],APRHLLike17[T17, HCollection17],APRHLLike18[T18, HCollection18],APRHLLike19[T19, HCollection19],APRHLLike20[T20, HCollection20]] =
          sAppender.append(abcFunc1[HCollection1],abcFunc2[HCollection2],abcFunc3[HCollection3],abcFunc4[HCollection4],abcFunc5[HCollection5],abcFunc6[HCollection6],abcFunc7[HCollection7],abcFunc8[HCollection8],abcFunc9[HCollection9],abcFunc10[HCollection10],abcFunc11[HCollection11],abcFunc12[HCollection12],abcFunc13[HCollection13],abcFunc14[HCollection14],abcFunc15[HCollection15],abcFunc16[HCollection16],abcFunc17[HCollection17],abcFunc18[HCollection18],abcFunc19[HCollection19],abcFunc20[HCollection20])(headPlus, parameter)
      }
    

      trait Support21[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19,APRHLLike20[_, _ <: HLLike20] <: HLLike20,APRHLLike21[_, _ <: HLLike21] <: HLLike21
      ] extends NatAppender1.Support21[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20,APRHLLike21
      ] {
        def sAppender: SimpleAppender21Positive[M]
        def abcFunc1[HC1 <: HLLike1]: ABCFunc[T1, HC1, APRHLLike1[T1, HC1]]
def abcFunc2[HC2 <: HLLike2]: ABCFunc[T2, HC2, APRHLLike2[T2, HC2]]
def abcFunc3[HC3 <: HLLike3]: ABCFunc[T3, HC3, APRHLLike3[T3, HC3]]
def abcFunc4[HC4 <: HLLike4]: ABCFunc[T4, HC4, APRHLLike4[T4, HC4]]
def abcFunc5[HC5 <: HLLike5]: ABCFunc[T5, HC5, APRHLLike5[T5, HC5]]
def abcFunc6[HC6 <: HLLike6]: ABCFunc[T6, HC6, APRHLLike6[T6, HC6]]
def abcFunc7[HC7 <: HLLike7]: ABCFunc[T7, HC7, APRHLLike7[T7, HC7]]
def abcFunc8[HC8 <: HLLike8]: ABCFunc[T8, HC8, APRHLLike8[T8, HC8]]
def abcFunc9[HC9 <: HLLike9]: ABCFunc[T9, HC9, APRHLLike9[T9, HC9]]
def abcFunc10[HC10 <: HLLike10]: ABCFunc[T10, HC10, APRHLLike10[T10, HC10]]
def abcFunc11[HC11 <: HLLike11]: ABCFunc[T11, HC11, APRHLLike11[T11, HC11]]
def abcFunc12[HC12 <: HLLike12]: ABCFunc[T12, HC12, APRHLLike12[T12, HC12]]
def abcFunc13[HC13 <: HLLike13]: ABCFunc[T13, HC13, APRHLLike13[T13, HC13]]
def abcFunc14[HC14 <: HLLike14]: ABCFunc[T14, HC14, APRHLLike14[T14, HC14]]
def abcFunc15[HC15 <: HLLike15]: ABCFunc[T15, HC15, APRHLLike15[T15, HC15]]
def abcFunc16[HC16 <: HLLike16]: ABCFunc[T16, HC16, APRHLLike16[T16, HC16]]
def abcFunc17[HC17 <: HLLike17]: ABCFunc[T17, HC17, APRHLLike17[T17, HC17]]
def abcFunc18[HC18 <: HLLike18]: ABCFunc[T18, HC18, APRHLLike18[T18, HC18]]
def abcFunc19[HC19 <: HLLike19]: ABCFunc[T19, HC19, APRHLLike19[T19, HC19]]
def abcFunc20[HC20 <: HLLike20]: ABCFunc[T20, HC20, APRHLLike20[T20, HC20]]
def abcFunc21[HC21 <: HLLike21]: ABCFunc[T21, HC21, APRHLLike21[T21, HC21]]
        def headPlus: M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]

        override def append[HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17,HCollection18 <: HLLike18,HCollection19 <: HLLike19,HCollection20 <: HLLike20,HCollection21 <: HLLike21](
          parameter: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20,HCollection21]
        ): M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14],APRHLLike15[T15, HCollection15],APRHLLike16[T16, HCollection16],APRHLLike17[T17, HCollection17],APRHLLike18[T18, HCollection18],APRHLLike19[T19, HCollection19],APRHLLike20[T20, HCollection20],APRHLLike21[T21, HCollection21]] =
          sAppender.append(abcFunc1[HCollection1],abcFunc2[HCollection2],abcFunc3[HCollection3],abcFunc4[HCollection4],abcFunc5[HCollection5],abcFunc6[HCollection6],abcFunc7[HCollection7],abcFunc8[HCollection8],abcFunc9[HCollection9],abcFunc10[HCollection10],abcFunc11[HCollection11],abcFunc12[HCollection12],abcFunc13[HCollection13],abcFunc14[HCollection14],abcFunc15[HCollection15],abcFunc16[HCollection16],abcFunc17[HCollection17],abcFunc18[HCollection18],abcFunc19[HCollection19],abcFunc20[HCollection20],abcFunc21[HCollection21])(headPlus, parameter)
      }
    
    }
  