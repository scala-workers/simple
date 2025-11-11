
    package net.scalax.simple.adt
    package nat
    package support

    object NatNext1 {
      
      trait Support1[
        M[_],
        T1[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,
        HCollection1 <: HLLike1
      ] {
        def current: M[HCollection1]

        def next[U]: Support1[
          M,
          T1,
          HLLike1,
          APRHLLike1,
          APRHLLike1[T1[U], HCollection1]
        ]
      }
    

      trait Support2[
        M[_,_],
        T1[_],T2[_],
        HLLike1,HLLike2,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,
        HCollection1 <: HLLike1,HCollection2 <: HLLike2
      ] {
        def current: M[HCollection1,HCollection2]

        def next[U]: Support2[
          M,
          T1,T2,
          HLLike1,HLLike2,
          APRHLLike1,APRHLLike2,
          APRHLLike1[T1[U], HCollection1],APRHLLike2[T2[U], HCollection2]
        ]
      }
    

      trait Support3[
        M[_,_,_],
        T1[_],T2[_],T3[_],
        HLLike1,HLLike2,HLLike3,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,
        HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3
      ] {
        def current: M[HCollection1,HCollection2,HCollection3]

        def next[U]: Support3[
          M,
          T1,T2,T3,
          HLLike1,HLLike2,HLLike3,
          APRHLLike1,APRHLLike2,APRHLLike3,
          APRHLLike1[T1[U], HCollection1],APRHLLike2[T2[U], HCollection2],APRHLLike3[T3[U], HCollection3]
        ]
      }
    

      trait Support4[
        M[_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],
        HLLike1,HLLike2,HLLike3,HLLike4,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,
        HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4
      ] {
        def current: M[HCollection1,HCollection2,HCollection3,HCollection4]

        def next[U]: Support4[
          M,
          T1,T2,T3,T4,
          HLLike1,HLLike2,HLLike3,HLLike4,
          APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,
          APRHLLike1[T1[U], HCollection1],APRHLLike2[T2[U], HCollection2],APRHLLike3[T3[U], HCollection3],APRHLLike4[T4[U], HCollection4]
        ]
      }
    

      trait Support5[
        M[_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,
        HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5
      ] {
        def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5]

        def next[U]: Support5[
          M,
          T1,T2,T3,T4,T5,
          HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,
          APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,
          APRHLLike1[T1[U], HCollection1],APRHLLike2[T2[U], HCollection2],APRHLLike3[T3[U], HCollection3],APRHLLike4[T4[U], HCollection4],APRHLLike5[T5[U], HCollection5]
        ]
      }
    

      trait Support6[
        M[_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,
        HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6
      ] {
        def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6]

        def next[U]: Support6[
          M,
          T1,T2,T3,T4,T5,T6,
          HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,
          APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,
          APRHLLike1[T1[U], HCollection1],APRHLLike2[T2[U], HCollection2],APRHLLike3[T3[U], HCollection3],APRHLLike4[T4[U], HCollection4],APRHLLike5[T5[U], HCollection5],APRHLLike6[T6[U], HCollection6]
        ]
      }
    

      trait Support7[
        M[_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,
        HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7
      ] {
        def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7]

        def next[U]: Support7[
          M,
          T1,T2,T3,T4,T5,T6,T7,
          HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,
          APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,
          APRHLLike1[T1[U], HCollection1],APRHLLike2[T2[U], HCollection2],APRHLLike3[T3[U], HCollection3],APRHLLike4[T4[U], HCollection4],APRHLLike5[T5[U], HCollection5],APRHLLike6[T6[U], HCollection6],APRHLLike7[T7[U], HCollection7]
        ]
      }
    

      trait Support8[
        M[_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,
        HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8
      ] {
        def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8]

        def next[U]: Support8[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,
          HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,
          APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,
          APRHLLike1[T1[U], HCollection1],APRHLLike2[T2[U], HCollection2],APRHLLike3[T3[U], HCollection3],APRHLLike4[T4[U], HCollection4],APRHLLike5[T5[U], HCollection5],APRHLLike6[T6[U], HCollection6],APRHLLike7[T7[U], HCollection7],APRHLLike8[T8[U], HCollection8]
        ]
      }
    

      trait Support9[
        M[_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,
        HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9
      ] {
        def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9]

        def next[U]: Support9[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,
          HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,
          APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,
          APRHLLike1[T1[U], HCollection1],APRHLLike2[T2[U], HCollection2],APRHLLike3[T3[U], HCollection3],APRHLLike4[T4[U], HCollection4],APRHLLike5[T5[U], HCollection5],APRHLLike6[T6[U], HCollection6],APRHLLike7[T7[U], HCollection7],APRHLLike8[T8[U], HCollection8],APRHLLike9[T9[U], HCollection9]
        ]
      }
    

      trait Support10[
        M[_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,
        HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10
      ] {
        def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10]

        def next[U]: Support10[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,
          HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,
          APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,
          APRHLLike1[T1[U], HCollection1],APRHLLike2[T2[U], HCollection2],APRHLLike3[T3[U], HCollection3],APRHLLike4[T4[U], HCollection4],APRHLLike5[T5[U], HCollection5],APRHLLike6[T6[U], HCollection6],APRHLLike7[T7[U], HCollection7],APRHLLike8[T8[U], HCollection8],APRHLLike9[T9[U], HCollection9],APRHLLike10[T10[U], HCollection10]
        ]
      }
    

      trait Support11[
        M[_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,
        HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11
      ] {
        def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11]

        def next[U]: Support11[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,
          HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,
          APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,
          APRHLLike1[T1[U], HCollection1],APRHLLike2[T2[U], HCollection2],APRHLLike3[T3[U], HCollection3],APRHLLike4[T4[U], HCollection4],APRHLLike5[T5[U], HCollection5],APRHLLike6[T6[U], HCollection6],APRHLLike7[T7[U], HCollection7],APRHLLike8[T8[U], HCollection8],APRHLLike9[T9[U], HCollection9],APRHLLike10[T10[U], HCollection10],APRHLLike11[T11[U], HCollection11]
        ]
      }
    

      trait Support12[
        M[_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,
        HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12
      ] {
        def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12]

        def next[U]: Support12[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,
          HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,
          APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,
          APRHLLike1[T1[U], HCollection1],APRHLLike2[T2[U], HCollection2],APRHLLike3[T3[U], HCollection3],APRHLLike4[T4[U], HCollection4],APRHLLike5[T5[U], HCollection5],APRHLLike6[T6[U], HCollection6],APRHLLike7[T7[U], HCollection7],APRHLLike8[T8[U], HCollection8],APRHLLike9[T9[U], HCollection9],APRHLLike10[T10[U], HCollection10],APRHLLike11[T11[U], HCollection11],APRHLLike12[T12[U], HCollection12]
        ]
      }
    

      trait Support13[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,
        HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13
      ] {
        def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13]

        def next[U]: Support13[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,
          HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,
          APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,
          APRHLLike1[T1[U], HCollection1],APRHLLike2[T2[U], HCollection2],APRHLLike3[T3[U], HCollection3],APRHLLike4[T4[U], HCollection4],APRHLLike5[T5[U], HCollection5],APRHLLike6[T6[U], HCollection6],APRHLLike7[T7[U], HCollection7],APRHLLike8[T8[U], HCollection8],APRHLLike9[T9[U], HCollection9],APRHLLike10[T10[U], HCollection10],APRHLLike11[T11[U], HCollection11],APRHLLike12[T12[U], HCollection12],APRHLLike13[T13[U], HCollection13]
        ]
      }
    

      trait Support14[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,
        HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14
      ] {
        def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14]

        def next[U]: Support14[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,
          HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,
          APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,
          APRHLLike1[T1[U], HCollection1],APRHLLike2[T2[U], HCollection2],APRHLLike3[T3[U], HCollection3],APRHLLike4[T4[U], HCollection4],APRHLLike5[T5[U], HCollection5],APRHLLike6[T6[U], HCollection6],APRHLLike7[T7[U], HCollection7],APRHLLike8[T8[U], HCollection8],APRHLLike9[T9[U], HCollection9],APRHLLike10[T10[U], HCollection10],APRHLLike11[T11[U], HCollection11],APRHLLike12[T12[U], HCollection12],APRHLLike13[T13[U], HCollection13],APRHLLike14[T14[U], HCollection14]
        ]
      }
    

      trait Support15[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,
        HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15
      ] {
        def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15]

        def next[U]: Support15[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,
          HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,
          APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,
          APRHLLike1[T1[U], HCollection1],APRHLLike2[T2[U], HCollection2],APRHLLike3[T3[U], HCollection3],APRHLLike4[T4[U], HCollection4],APRHLLike5[T5[U], HCollection5],APRHLLike6[T6[U], HCollection6],APRHLLike7[T7[U], HCollection7],APRHLLike8[T8[U], HCollection8],APRHLLike9[T9[U], HCollection9],APRHLLike10[T10[U], HCollection10],APRHLLike11[T11[U], HCollection11],APRHLLike12[T12[U], HCollection12],APRHLLike13[T13[U], HCollection13],APRHLLike14[T14[U], HCollection14],APRHLLike15[T15[U], HCollection15]
        ]
      }
    

      trait Support16[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,
        HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16
      ] {
        def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16]

        def next[U]: Support16[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,
          HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,
          APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,
          APRHLLike1[T1[U], HCollection1],APRHLLike2[T2[U], HCollection2],APRHLLike3[T3[U], HCollection3],APRHLLike4[T4[U], HCollection4],APRHLLike5[T5[U], HCollection5],APRHLLike6[T6[U], HCollection6],APRHLLike7[T7[U], HCollection7],APRHLLike8[T8[U], HCollection8],APRHLLike9[T9[U], HCollection9],APRHLLike10[T10[U], HCollection10],APRHLLike11[T11[U], HCollection11],APRHLLike12[T12[U], HCollection12],APRHLLike13[T13[U], HCollection13],APRHLLike14[T14[U], HCollection14],APRHLLike15[T15[U], HCollection15],APRHLLike16[T16[U], HCollection16]
        ]
      }
    

      trait Support17[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,
        HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17
      ] {
        def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17]

        def next[U]: Support17[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,
          HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,
          APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,
          APRHLLike1[T1[U], HCollection1],APRHLLike2[T2[U], HCollection2],APRHLLike3[T3[U], HCollection3],APRHLLike4[T4[U], HCollection4],APRHLLike5[T5[U], HCollection5],APRHLLike6[T6[U], HCollection6],APRHLLike7[T7[U], HCollection7],APRHLLike8[T8[U], HCollection8],APRHLLike9[T9[U], HCollection9],APRHLLike10[T10[U], HCollection10],APRHLLike11[T11[U], HCollection11],APRHLLike12[T12[U], HCollection12],APRHLLike13[T13[U], HCollection13],APRHLLike14[T14[U], HCollection14],APRHLLike15[T15[U], HCollection15],APRHLLike16[T16[U], HCollection16],APRHLLike17[T17[U], HCollection17]
        ]
      }
    

      trait Support18[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],T18[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,
        HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17,HCollection18 <: HLLike18
      ] {
        def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18]

        def next[U]: Support18[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,
          HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,
          APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,
          APRHLLike1[T1[U], HCollection1],APRHLLike2[T2[U], HCollection2],APRHLLike3[T3[U], HCollection3],APRHLLike4[T4[U], HCollection4],APRHLLike5[T5[U], HCollection5],APRHLLike6[T6[U], HCollection6],APRHLLike7[T7[U], HCollection7],APRHLLike8[T8[U], HCollection8],APRHLLike9[T9[U], HCollection9],APRHLLike10[T10[U], HCollection10],APRHLLike11[T11[U], HCollection11],APRHLLike12[T12[U], HCollection12],APRHLLike13[T13[U], HCollection13],APRHLLike14[T14[U], HCollection14],APRHLLike15[T15[U], HCollection15],APRHLLike16[T16[U], HCollection16],APRHLLike17[T17[U], HCollection17],APRHLLike18[T18[U], HCollection18]
        ]
      }
    

      trait Support19[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],T18[_],T19[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19,
        HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17,HCollection18 <: HLLike18,HCollection19 <: HLLike19
      ] {
        def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19]

        def next[U]: Support19[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,
          HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,
          APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,
          APRHLLike1[T1[U], HCollection1],APRHLLike2[T2[U], HCollection2],APRHLLike3[T3[U], HCollection3],APRHLLike4[T4[U], HCollection4],APRHLLike5[T5[U], HCollection5],APRHLLike6[T6[U], HCollection6],APRHLLike7[T7[U], HCollection7],APRHLLike8[T8[U], HCollection8],APRHLLike9[T9[U], HCollection9],APRHLLike10[T10[U], HCollection10],APRHLLike11[T11[U], HCollection11],APRHLLike12[T12[U], HCollection12],APRHLLike13[T13[U], HCollection13],APRHLLike14[T14[U], HCollection14],APRHLLike15[T15[U], HCollection15],APRHLLike16[T16[U], HCollection16],APRHLLike17[T17[U], HCollection17],APRHLLike18[T18[U], HCollection18],APRHLLike19[T19[U], HCollection19]
        ]
      }
    

      trait Support20[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],T18[_],T19[_],T20[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19,APRHLLike20[_, _ <: HLLike20] <: HLLike20,
        HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17,HCollection18 <: HLLike18,HCollection19 <: HLLike19,HCollection20 <: HLLike20
      ] {
        def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20]

        def next[U]: Support20[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,
          HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,
          APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20,
          APRHLLike1[T1[U], HCollection1],APRHLLike2[T2[U], HCollection2],APRHLLike3[T3[U], HCollection3],APRHLLike4[T4[U], HCollection4],APRHLLike5[T5[U], HCollection5],APRHLLike6[T6[U], HCollection6],APRHLLike7[T7[U], HCollection7],APRHLLike8[T8[U], HCollection8],APRHLLike9[T9[U], HCollection9],APRHLLike10[T10[U], HCollection10],APRHLLike11[T11[U], HCollection11],APRHLLike12[T12[U], HCollection12],APRHLLike13[T13[U], HCollection13],APRHLLike14[T14[U], HCollection14],APRHLLike15[T15[U], HCollection15],APRHLLike16[T16[U], HCollection16],APRHLLike17[T17[U], HCollection17],APRHLLike18[T18[U], HCollection18],APRHLLike19[T19[U], HCollection19],APRHLLike20[T20[U], HCollection20]
        ]
      }
    

      trait Support21[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],T18[_],T19[_],T20[_],T21[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19,APRHLLike20[_, _ <: HLLike20] <: HLLike20,APRHLLike21[_, _ <: HLLike21] <: HLLike21,
        HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17,HCollection18 <: HLLike18,HCollection19 <: HLLike19,HCollection20 <: HLLike20,HCollection21 <: HLLike21
      ] {
        def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20,HCollection21]

        def next[U]: Support21[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,
          HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21,
          APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20,APRHLLike21,
          APRHLLike1[T1[U], HCollection1],APRHLLike2[T2[U], HCollection2],APRHLLike3[T3[U], HCollection3],APRHLLike4[T4[U], HCollection4],APRHLLike5[T5[U], HCollection5],APRHLLike6[T6[U], HCollection6],APRHLLike7[T7[U], HCollection7],APRHLLike8[T8[U], HCollection8],APRHLLike9[T9[U], HCollection9],APRHLLike10[T10[U], HCollection10],APRHLLike11[T11[U], HCollection11],APRHLLike12[T12[U], HCollection12],APRHLLike13[T13[U], HCollection13],APRHLLike14[T14[U], HCollection14],APRHLLike15[T15[U], HCollection15],APRHLLike16[T16[U], HCollection16],APRHLLike17[T17[U], HCollection17],APRHLLike18[T18[U], HCollection18],APRHLLike19[T19[U], HCollection19],APRHLLike20[T20[U], HCollection20],APRHLLike21[T21[U], HCollection21]
        ]
      }
    

      trait Support22[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],T18[_],T19[_],T20[_],T21[_],T22[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21,HLLike22,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19,APRHLLike20[_, _ <: HLLike20] <: HLLike20,APRHLLike21[_, _ <: HLLike21] <: HLLike21,APRHLLike22[_, _ <: HLLike22] <: HLLike22,
        HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17,HCollection18 <: HLLike18,HCollection19 <: HLLike19,HCollection20 <: HLLike20,HCollection21 <: HLLike21,HCollection22 <: HLLike22
      ] {
        def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20,HCollection21,HCollection22]

        def next[U]: Support22[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,
          HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21,HLLike22,
          APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20,APRHLLike21,APRHLLike22,
          APRHLLike1[T1[U], HCollection1],APRHLLike2[T2[U], HCollection2],APRHLLike3[T3[U], HCollection3],APRHLLike4[T4[U], HCollection4],APRHLLike5[T5[U], HCollection5],APRHLLike6[T6[U], HCollection6],APRHLLike7[T7[U], HCollection7],APRHLLike8[T8[U], HCollection8],APRHLLike9[T9[U], HCollection9],APRHLLike10[T10[U], HCollection10],APRHLLike11[T11[U], HCollection11],APRHLLike12[T12[U], HCollection12],APRHLLike13[T13[U], HCollection13],APRHLLike14[T14[U], HCollection14],APRHLLike15[T15[U], HCollection15],APRHLLike16[T16[U], HCollection16],APRHLLike17[T17[U], HCollection17],APRHLLike18[T18[U], HCollection18],APRHLLike19[T19[U], HCollection19],APRHLLike20[T20[U], HCollection20],APRHLLike21[T21[U], HCollection21],APRHLLike22[T22[U], HCollection22]
        ]
      }
    
    }
  