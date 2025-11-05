
    package net.scalax.simple.adt
    package nat
    package support

    object NatAppender7 {
      
      trait Support1[
        M[_],
        U,
        T1[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender6.Support1[
        M,
        U,
        T1,
        HLLike1,
        APRHLLike1
      ] with NatAppender4.Support1[
        M,
        T1[U],
        HLLike1,
        APRHLLike1
      ]
    

      trait Support2[
        M[_,_],
        U,
        T1[_],T2[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender6.Support2[
        M,
        U,
        T1,T2,
        HLLike1,HLLike1,
        APRHLLike1,APRHLLike1
      ] with NatAppender4.Support2[
        M,
        T1[U],T2[U],
        HLLike1,
        APRHLLike1
      ]
    

      trait Support3[
        M[_,_,_],
        U,
        T1[_],T2[_],T3[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender6.Support3[
        M,
        U,
        T1,T2,T3,
        HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1
      ] with NatAppender4.Support3[
        M,
        T1[U],T2[U],T3[U],
        HLLike1,
        APRHLLike1
      ]
    

      trait Support4[
        M[_,_,_,_],
        U,
        T1[_],T2[_],T3[_],T4[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender6.Support4[
        M,
        U,
        T1,T2,T3,T4,
        HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] with NatAppender4.Support4[
        M,
        T1[U],T2[U],T3[U],T4[U],
        HLLike1,
        APRHLLike1
      ]
    

      trait Support5[
        M[_,_,_,_,_],
        U,
        T1[_],T2[_],T3[_],T4[_],T5[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender6.Support5[
        M,
        U,
        T1,T2,T3,T4,T5,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] with NatAppender4.Support5[
        M,
        T1[U],T2[U],T3[U],T4[U],T5[U],
        HLLike1,
        APRHLLike1
      ]
    

      trait Support6[
        M[_,_,_,_,_,_],
        U,
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender6.Support6[
        M,
        U,
        T1,T2,T3,T4,T5,T6,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] with NatAppender4.Support6[
        M,
        T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],
        HLLike1,
        APRHLLike1
      ]
    

      trait Support7[
        M[_,_,_,_,_,_,_],
        U,
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender6.Support7[
        M,
        U,
        T1,T2,T3,T4,T5,T6,T7,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] with NatAppender4.Support7[
        M,
        T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],
        HLLike1,
        APRHLLike1
      ]
    

      trait Support8[
        M[_,_,_,_,_,_,_,_],
        U,
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender6.Support8[
        M,
        U,
        T1,T2,T3,T4,T5,T6,T7,T8,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] with NatAppender4.Support8[
        M,
        T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],
        HLLike1,
        APRHLLike1
      ]
    

      trait Support9[
        M[_,_,_,_,_,_,_,_,_],
        U,
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender6.Support9[
        M,
        U,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] with NatAppender4.Support9[
        M,
        T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],
        HLLike1,
        APRHLLike1
      ]
    

      trait Support10[
        M[_,_,_,_,_,_,_,_,_,_],
        U,
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender6.Support10[
        M,
        U,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] with NatAppender4.Support10[
        M,
        T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],
        HLLike1,
        APRHLLike1
      ]
    

      trait Support11[
        M[_,_,_,_,_,_,_,_,_,_,_],
        U,
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender6.Support11[
        M,
        U,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] with NatAppender4.Support11[
        M,
        T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],
        HLLike1,
        APRHLLike1
      ]
    

      trait Support12[
        M[_,_,_,_,_,_,_,_,_,_,_,_],
        U,
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender6.Support12[
        M,
        U,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] with NatAppender4.Support12[
        M,
        T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],
        HLLike1,
        APRHLLike1
      ]
    

      trait Support13[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_],
        U,
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender6.Support13[
        M,
        U,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] with NatAppender4.Support13[
        M,
        T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],
        HLLike1,
        APRHLLike1
      ]
    

      trait Support14[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        U,
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender6.Support14[
        M,
        U,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] with NatAppender4.Support14[
        M,
        T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U],
        HLLike1,
        APRHLLike1
      ]
    

      trait Support15[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        U,
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender6.Support15[
        M,
        U,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] with NatAppender4.Support15[
        M,
        T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U],T15[U],
        HLLike1,
        APRHLLike1
      ]
    

      trait Support16[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        U,
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender6.Support16[
        M,
        U,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] with NatAppender4.Support16[
        M,
        T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U],T15[U],T16[U],
        HLLike1,
        APRHLLike1
      ]
    

      trait Support17[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        U,
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender6.Support17[
        M,
        U,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] with NatAppender4.Support17[
        M,
        T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U],T15[U],T16[U],T17[U],
        HLLike1,
        APRHLLike1
      ]
    

      trait Support18[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        U,
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],T18[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender6.Support18[
        M,
        U,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] with NatAppender4.Support18[
        M,
        T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U],T15[U],T16[U],T17[U],T18[U],
        HLLike1,
        APRHLLike1
      ]
    

      trait Support19[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        U,
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],T18[_],T19[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender6.Support19[
        M,
        U,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] with NatAppender4.Support19[
        M,
        T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U],T15[U],T16[U],T17[U],T18[U],T19[U],
        HLLike1,
        APRHLLike1
      ]
    

      trait Support20[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        U,
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],T18[_],T19[_],T20[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender6.Support20[
        M,
        U,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] with NatAppender4.Support20[
        M,
        T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U],T15[U],T16[U],T17[U],T18[U],T19[U],T20[U],
        HLLike1,
        APRHLLike1
      ]
    

      trait Support21[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        U,
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],T18[_],T19[_],T20[_],T21[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender6.Support21[
        M,
        U,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,
        HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,HLLike1,
        APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1,APRHLLike1
      ] with NatAppender4.Support21[
        M,
        T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U],T15[U],T16[U],T17[U],T18[U],T19[U],T20[U],T21[U],
        HLLike1,
        APRHLLike1
      ]
    
    }
  