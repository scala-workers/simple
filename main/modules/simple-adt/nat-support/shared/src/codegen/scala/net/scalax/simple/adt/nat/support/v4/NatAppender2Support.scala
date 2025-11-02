
    package net.scalax.simple.adt
    package nat
    package support

    object NatAppender2 {
      
      trait Support1[M[_],
        HLLikeDefalut, APRHLLikeDefault[_, _ <: HLLikeDefalut] <: HLLikeDefalut,
        HLLike1, APRHLLike1[_, _ <: HLLike1] <: HLLike1]
      {
        SupportSelf =>

        def law: NatAppender1.Support2[
          ({ type AUB[A, T1] = A => M[T1] })#AUB,
          HLLikeDefalut, HLLike1, APRHLLikeDefault, APRHLLike1
        ] /* = new NatAppender1.Support2[
          ({ type AUB[A, T1] = A => M[T1] })#AUB,
          HLLikeDefalut, HLLike1, APRHLLikeDefault, APRHLLike1
        ] {
          override def append[IU, T1, HCDefault <: HLLikeDefalut, HCollection1 <: HLLike1](p2: HCDefault => M[HCollection1]): APRHLLikeDefault[IU, HCDefault] => M[APRHLLike1[T1, HCollection1]] = ???
        } */

        def append[HCDefault <: HLLikeDefalut, T1, HCollection1 <: HLLike1](p2: HCDefault => M[HCollection1]): APRHLLikeDefault[M[T1], HCDefault] => M[APRHLLike1[T1, HCollection1]] = SupportSelf.law.append[M[T1], T1, HCDefault, HCollection1](p2)
      }
    

      trait Support2[M[_,_],
        HLLikeDefalut, APRHLLikeDefault[_, _ <: HLLikeDefalut] <: HLLikeDefalut,
        HLLike1,HLLike2, APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2]
      {
        SupportSelf =>

        def law: NatAppender1.Support3[
          ({ type AUB[A, T1,T2] = A => M[T1,T2] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2, APRHLLikeDefault, APRHLLike1,APRHLLike2
        ] /* = new NatAppender1.Support3[
          ({ type AUB[A, T1,T2] = A => M[T1,T2] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2, APRHLLikeDefault, APRHLLike1,APRHLLike2
        ] {
          override def append[IU, T1,T2, HCDefault <: HLLikeDefalut, HCollection1 <: HLLike1,HCollection2 <: HLLike2](p2: HCDefault => M[HCollection1,HCollection2]): APRHLLikeDefault[IU, HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2]] = ???
        } */

        def append[HCDefault <: HLLikeDefalut, T1,T2, HCollection1 <: HLLike1,HCollection2 <: HLLike2](p2: HCDefault => M[HCollection1,HCollection2]): APRHLLikeDefault[M[T1,T2], HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2]] = SupportSelf.law.append[M[T1,T2], T1,T2, HCDefault, HCollection1,HCollection2](p2)
      }
    

      trait Support3[M[_,_,_],
        HLLikeDefalut, APRHLLikeDefault[_, _ <: HLLikeDefalut] <: HLLikeDefalut,
        HLLike1,HLLike2,HLLike3, APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3]
      {
        SupportSelf =>

        def law: NatAppender1.Support4[
          ({ type AUB[A, T1,T2,T3] = A => M[T1,T2,T3] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3
        ] /* = new NatAppender1.Support4[
          ({ type AUB[A, T1,T2,T3] = A => M[T1,T2,T3] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3
        ] {
          override def append[IU, T1,T2,T3, HCDefault <: HLLikeDefalut, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3](p2: HCDefault => M[HCollection1,HCollection2,HCollection3]): APRHLLikeDefault[IU, HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3]] = ???
        } */

        def append[HCDefault <: HLLikeDefalut, T1,T2,T3, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3](p2: HCDefault => M[HCollection1,HCollection2,HCollection3]): APRHLLikeDefault[M[T1,T2,T3], HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3]] = SupportSelf.law.append[M[T1,T2,T3], T1,T2,T3, HCDefault, HCollection1,HCollection2,HCollection3](p2)
      }
    

      trait Support4[M[_,_,_,_],
        HLLikeDefalut, APRHLLikeDefault[_, _ <: HLLikeDefalut] <: HLLikeDefalut,
        HLLike1,HLLike2,HLLike3,HLLike4, APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4]
      {
        SupportSelf =>

        def law: NatAppender1.Support5[
          ({ type AUB[A, T1,T2,T3,T4] = A => M[T1,T2,T3,T4] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4
        ] /* = new NatAppender1.Support5[
          ({ type AUB[A, T1,T2,T3,T4] = A => M[T1,T2,T3,T4] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4
        ] {
          override def append[IU, T1,T2,T3,T4, HCDefault <: HLLikeDefalut, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4]): APRHLLikeDefault[IU, HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4]] = ???
        } */

        def append[HCDefault <: HLLikeDefalut, T1,T2,T3,T4, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4]): APRHLLikeDefault[M[T1,T2,T3,T4], HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4]] = SupportSelf.law.append[M[T1,T2,T3,T4], T1,T2,T3,T4, HCDefault, HCollection1,HCollection2,HCollection3,HCollection4](p2)
      }
    

      trait Support5[M[_,_,_,_,_],
        HLLikeDefalut, APRHLLikeDefault[_, _ <: HLLikeDefalut] <: HLLikeDefalut,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5, APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5]
      {
        SupportSelf =>

        def law: NatAppender1.Support6[
          ({ type AUB[A, T1,T2,T3,T4,T5] = A => M[T1,T2,T3,T4,T5] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5
        ] /* = new NatAppender1.Support6[
          ({ type AUB[A, T1,T2,T3,T4,T5] = A => M[T1,T2,T3,T4,T5] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5
        ] {
          override def append[IU, T1,T2,T3,T4,T5, HCDefault <: HLLikeDefalut, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5]): APRHLLikeDefault[IU, HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5]] = ???
        } */

        def append[HCDefault <: HLLikeDefalut, T1,T2,T3,T4,T5, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5]): APRHLLikeDefault[M[T1,T2,T3,T4,T5], HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5]] = SupportSelf.law.append[M[T1,T2,T3,T4,T5], T1,T2,T3,T4,T5, HCDefault, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5](p2)
      }
    

      trait Support6[M[_,_,_,_,_,_],
        HLLikeDefalut, APRHLLikeDefault[_, _ <: HLLikeDefalut] <: HLLikeDefalut,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6, APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6]
      {
        SupportSelf =>

        def law: NatAppender1.Support7[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6] = A => M[T1,T2,T3,T4,T5,T6] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6
        ] /* = new NatAppender1.Support7[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6] = A => M[T1,T2,T3,T4,T5,T6] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6
        ] {
          override def append[IU, T1,T2,T3,T4,T5,T6, HCDefault <: HLLikeDefalut, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6]): APRHLLikeDefault[IU, HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6]] = ???
        } */

        def append[HCDefault <: HLLikeDefalut, T1,T2,T3,T4,T5,T6, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6]): APRHLLikeDefault[M[T1,T2,T3,T4,T5,T6], HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6]] = SupportSelf.law.append[M[T1,T2,T3,T4,T5,T6], T1,T2,T3,T4,T5,T6, HCDefault, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6](p2)
      }
    

      trait Support7[M[_,_,_,_,_,_,_],
        HLLikeDefalut, APRHLLikeDefault[_, _ <: HLLikeDefalut] <: HLLikeDefalut,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7, APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7]
      {
        SupportSelf =>

        def law: NatAppender1.Support8[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7] = A => M[T1,T2,T3,T4,T5,T6,T7] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7
        ] /* = new NatAppender1.Support8[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7] = A => M[T1,T2,T3,T4,T5,T6,T7] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7
        ] {
          override def append[IU, T1,T2,T3,T4,T5,T6,T7, HCDefault <: HLLikeDefalut, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7]): APRHLLikeDefault[IU, HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7]] = ???
        } */

        def append[HCDefault <: HLLikeDefalut, T1,T2,T3,T4,T5,T6,T7, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7]): APRHLLikeDefault[M[T1,T2,T3,T4,T5,T6,T7], HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7]] = SupportSelf.law.append[M[T1,T2,T3,T4,T5,T6,T7], T1,T2,T3,T4,T5,T6,T7, HCDefault, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7](p2)
      }
    

      trait Support8[M[_,_,_,_,_,_,_,_],
        HLLikeDefalut, APRHLLikeDefault[_, _ <: HLLikeDefalut] <: HLLikeDefalut,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8, APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8]
      {
        SupportSelf =>

        def law: NatAppender1.Support9[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8] = A => M[T1,T2,T3,T4,T5,T6,T7,T8] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8
        ] /* = new NatAppender1.Support9[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8] = A => M[T1,T2,T3,T4,T5,T6,T7,T8] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8
        ] {
          override def append[IU, T1,T2,T3,T4,T5,T6,T7,T8, HCDefault <: HLLikeDefalut, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8]): APRHLLikeDefault[IU, HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8]] = ???
        } */

        def append[HCDefault <: HLLikeDefalut, T1,T2,T3,T4,T5,T6,T7,T8, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8]): APRHLLikeDefault[M[T1,T2,T3,T4,T5,T6,T7,T8], HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8]] = SupportSelf.law.append[M[T1,T2,T3,T4,T5,T6,T7,T8], T1,T2,T3,T4,T5,T6,T7,T8, HCDefault, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8](p2)
      }
    

      trait Support9[M[_,_,_,_,_,_,_,_,_],
        HLLikeDefalut, APRHLLikeDefault[_, _ <: HLLikeDefalut] <: HLLikeDefalut,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9, APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9]
      {
        SupportSelf =>

        def law: NatAppender1.Support10[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9
        ] /* = new NatAppender1.Support10[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9
        ] {
          override def append[IU, T1,T2,T3,T4,T5,T6,T7,T8,T9, HCDefault <: HLLikeDefalut, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9]): APRHLLikeDefault[IU, HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9]] = ???
        } */

        def append[HCDefault <: HLLikeDefalut, T1,T2,T3,T4,T5,T6,T7,T8,T9, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9]): APRHLLikeDefault[M[T1,T2,T3,T4,T5,T6,T7,T8,T9], HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9]] = SupportSelf.law.append[M[T1,T2,T3,T4,T5,T6,T7,T8,T9], T1,T2,T3,T4,T5,T6,T7,T8,T9, HCDefault, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9](p2)
      }
    

      trait Support10[M[_,_,_,_,_,_,_,_,_,_],
        HLLikeDefalut, APRHLLikeDefault[_, _ <: HLLikeDefalut] <: HLLikeDefalut,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10, APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10]
      {
        SupportSelf =>

        def law: NatAppender1.Support11[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10
        ] /* = new NatAppender1.Support11[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10
        ] {
          override def append[IU, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10, HCDefault <: HLLikeDefalut, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10]): APRHLLikeDefault[IU, HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10]] = ???
        } */

        def append[HCDefault <: HLLikeDefalut, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10]): APRHLLikeDefault[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10], HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10]] = SupportSelf.law.append[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10], T1,T2,T3,T4,T5,T6,T7,T8,T9,T10, HCDefault, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10](p2)
      }
    

      trait Support11[M[_,_,_,_,_,_,_,_,_,_,_],
        HLLikeDefalut, APRHLLikeDefault[_, _ <: HLLikeDefalut] <: HLLikeDefalut,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11, APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11]
      {
        SupportSelf =>

        def law: NatAppender1.Support12[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11
        ] /* = new NatAppender1.Support12[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11
        ] {
          override def append[IU, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11, HCDefault <: HLLikeDefalut, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11]): APRHLLikeDefault[IU, HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11]] = ???
        } */

        def append[HCDefault <: HLLikeDefalut, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11]): APRHLLikeDefault[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11], HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11]] = SupportSelf.law.append[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11], T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11, HCDefault, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11](p2)
      }
    

      trait Support12[M[_,_,_,_,_,_,_,_,_,_,_,_],
        HLLikeDefalut, APRHLLikeDefault[_, _ <: HLLikeDefalut] <: HLLikeDefalut,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12, APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12]
      {
        SupportSelf =>

        def law: NatAppender1.Support13[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12
        ] /* = new NatAppender1.Support13[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12
        ] {
          override def append[IU, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12, HCDefault <: HLLikeDefalut, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12]): APRHLLikeDefault[IU, HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12]] = ???
        } */

        def append[HCDefault <: HLLikeDefalut, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12]): APRHLLikeDefault[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12], HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12]] = SupportSelf.law.append[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12], T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12, HCDefault, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12](p2)
      }
    

      trait Support13[M[_,_,_,_,_,_,_,_,_,_,_,_,_],
        HLLikeDefalut, APRHLLikeDefault[_, _ <: HLLikeDefalut] <: HLLikeDefalut,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13, APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13]
      {
        SupportSelf =>

        def law: NatAppender1.Support14[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13
        ] /* = new NatAppender1.Support14[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13
        ] {
          override def append[IU, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13, HCDefault <: HLLikeDefalut, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13]): APRHLLikeDefault[IU, HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13]] = ???
        } */

        def append[HCDefault <: HLLikeDefalut, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13]): APRHLLikeDefault[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13], HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13]] = SupportSelf.law.append[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13], T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13, HCDefault, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13](p2)
      }
    

      trait Support14[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        HLLikeDefalut, APRHLLikeDefault[_, _ <: HLLikeDefalut] <: HLLikeDefalut,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14, APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14]
      {
        SupportSelf =>

        def law: NatAppender1.Support15[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14
        ] /* = new NatAppender1.Support15[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14
        ] {
          override def append[IU, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14, HCDefault <: HLLikeDefalut, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14]): APRHLLikeDefault[IU, HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14]] = ???
        } */

        def append[HCDefault <: HLLikeDefalut, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14]): APRHLLikeDefault[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14], HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14]] = SupportSelf.law.append[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14], T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14, HCDefault, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14](p2)
      }
    

      trait Support15[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        HLLikeDefalut, APRHLLikeDefault[_, _ <: HLLikeDefalut] <: HLLikeDefalut,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15, APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15]
      {
        SupportSelf =>

        def law: NatAppender1.Support16[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15
        ] /* = new NatAppender1.Support16[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15
        ] {
          override def append[IU, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15, HCDefault <: HLLikeDefalut, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15]): APRHLLikeDefault[IU, HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14],APRHLLike15[T15, HCollection15]] = ???
        } */

        def append[HCDefault <: HLLikeDefalut, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15]): APRHLLikeDefault[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15], HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14],APRHLLike15[T15, HCollection15]] = SupportSelf.law.append[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15], T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15, HCDefault, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15](p2)
      }
    

      trait Support16[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        HLLikeDefalut, APRHLLikeDefault[_, _ <: HLLikeDefalut] <: HLLikeDefalut,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16, APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16]
      {
        SupportSelf =>

        def law: NatAppender1.Support17[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16
        ] /* = new NatAppender1.Support17[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16
        ] {
          override def append[IU, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, HCDefault <: HLLikeDefalut, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16]): APRHLLikeDefault[IU, HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14],APRHLLike15[T15, HCollection15],APRHLLike16[T16, HCollection16]] = ???
        } */

        def append[HCDefault <: HLLikeDefalut, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16]): APRHLLikeDefault[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16], HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14],APRHLLike15[T15, HCollection15],APRHLLike16[T16, HCollection16]] = SupportSelf.law.append[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16], T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, HCDefault, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16](p2)
      }
    

      trait Support17[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        HLLikeDefalut, APRHLLikeDefault[_, _ <: HLLikeDefalut] <: HLLikeDefalut,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17, APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17]
      {
        SupportSelf =>

        def law: NatAppender1.Support18[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17
        ] /* = new NatAppender1.Support18[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17
        ] {
          override def append[IU, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17, HCDefault <: HLLikeDefalut, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17]): APRHLLikeDefault[IU, HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14],APRHLLike15[T15, HCollection15],APRHLLike16[T16, HCollection16],APRHLLike17[T17, HCollection17]] = ???
        } */

        def append[HCDefault <: HLLikeDefalut, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17]): APRHLLikeDefault[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17], HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14],APRHLLike15[T15, HCollection15],APRHLLike16[T16, HCollection16],APRHLLike17[T17, HCollection17]] = SupportSelf.law.append[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17], T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17, HCDefault, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17](p2)
      }
    

      trait Support18[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        HLLikeDefalut, APRHLLikeDefault[_, _ <: HLLikeDefalut] <: HLLikeDefalut,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18, APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18]
      {
        SupportSelf =>

        def law: NatAppender1.Support19[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18
        ] /* = new NatAppender1.Support19[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18
        ] {
          override def append[IU, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18, HCDefault <: HLLikeDefalut, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17,HCollection18 <: HLLike18](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18]): APRHLLikeDefault[IU, HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14],APRHLLike15[T15, HCollection15],APRHLLike16[T16, HCollection16],APRHLLike17[T17, HCollection17],APRHLLike18[T18, HCollection18]] = ???
        } */

        def append[HCDefault <: HLLikeDefalut, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17,HCollection18 <: HLLike18](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18]): APRHLLikeDefault[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18], HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14],APRHLLike15[T15, HCollection15],APRHLLike16[T16, HCollection16],APRHLLike17[T17, HCollection17],APRHLLike18[T18, HCollection18]] = SupportSelf.law.append[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18], T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18, HCDefault, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18](p2)
      }
    

      trait Support19[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        HLLikeDefalut, APRHLLikeDefault[_, _ <: HLLikeDefalut] <: HLLikeDefalut,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19, APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19]
      {
        SupportSelf =>

        def law: NatAppender1.Support20[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19
        ] /* = new NatAppender1.Support20[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19
        ] {
          override def append[IU, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19, HCDefault <: HLLikeDefalut, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17,HCollection18 <: HLLike18,HCollection19 <: HLLike19](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19]): APRHLLikeDefault[IU, HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14],APRHLLike15[T15, HCollection15],APRHLLike16[T16, HCollection16],APRHLLike17[T17, HCollection17],APRHLLike18[T18, HCollection18],APRHLLike19[T19, HCollection19]] = ???
        } */

        def append[HCDefault <: HLLikeDefalut, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17,HCollection18 <: HLLike18,HCollection19 <: HLLike19](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19]): APRHLLikeDefault[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19], HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14],APRHLLike15[T15, HCollection15],APRHLLike16[T16, HCollection16],APRHLLike17[T17, HCollection17],APRHLLike18[T18, HCollection18],APRHLLike19[T19, HCollection19]] = SupportSelf.law.append[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19], T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19, HCDefault, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19](p2)
      }
    

      trait Support20[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        HLLikeDefalut, APRHLLikeDefault[_, _ <: HLLikeDefalut] <: HLLikeDefalut,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20, APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19,APRHLLike20[_, _ <: HLLike20] <: HLLike20]
      {
        SupportSelf =>

        def law: NatAppender1.Support21[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20
        ] /* = new NatAppender1.Support21[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20
        ] {
          override def append[IU, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20, HCDefault <: HLLikeDefalut, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17,HCollection18 <: HLLike18,HCollection19 <: HLLike19,HCollection20 <: HLLike20](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20]): APRHLLikeDefault[IU, HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14],APRHLLike15[T15, HCollection15],APRHLLike16[T16, HCollection16],APRHLLike17[T17, HCollection17],APRHLLike18[T18, HCollection18],APRHLLike19[T19, HCollection19],APRHLLike20[T20, HCollection20]] = ???
        } */

        def append[HCDefault <: HLLikeDefalut, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17,HCollection18 <: HLLike18,HCollection19 <: HLLike19,HCollection20 <: HLLike20](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20]): APRHLLikeDefault[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20], HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14],APRHLLike15[T15, HCollection15],APRHLLike16[T16, HCollection16],APRHLLike17[T17, HCollection17],APRHLLike18[T18, HCollection18],APRHLLike19[T19, HCollection19],APRHLLike20[T20, HCollection20]] = SupportSelf.law.append[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20], T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20, HCDefault, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20](p2)
      }
    

      trait Support21[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        HLLikeDefalut, APRHLLikeDefault[_, _ <: HLLikeDefalut] <: HLLikeDefalut,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21, APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19,APRHLLike20[_, _ <: HLLike20] <: HLLike20,APRHLLike21[_, _ <: HLLike21] <: HLLike21]
      {
        SupportSelf =>

        def law: NatAppender1.Support22[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20,APRHLLike21
        ] /* = new NatAppender1.Support22[
          ({ type AUB[A, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = A => M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] })#AUB,
          HLLikeDefalut, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21, APRHLLikeDefault, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20,APRHLLike21
        ] {
          override def append[IU, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21, HCDefault <: HLLikeDefalut, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17,HCollection18 <: HLLike18,HCollection19 <: HLLike19,HCollection20 <: HLLike20,HCollection21 <: HLLike21](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20,HCollection21]): APRHLLikeDefault[IU, HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14],APRHLLike15[T15, HCollection15],APRHLLike16[T16, HCollection16],APRHLLike17[T17, HCollection17],APRHLLike18[T18, HCollection18],APRHLLike19[T19, HCollection19],APRHLLike20[T20, HCollection20],APRHLLike21[T21, HCollection21]] = ???
        } */

        def append[HCDefault <: HLLikeDefalut, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17,HCollection18 <: HLLike18,HCollection19 <: HLLike19,HCollection20 <: HLLike20,HCollection21 <: HLLike21](p2: HCDefault => M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20,HCollection21]): APRHLLikeDefault[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21], HCDefault] => M[APRHLLike1[T1, HCollection1],APRHLLike2[T2, HCollection2],APRHLLike3[T3, HCollection3],APRHLLike4[T4, HCollection4],APRHLLike5[T5, HCollection5],APRHLLike6[T6, HCollection6],APRHLLike7[T7, HCollection7],APRHLLike8[T8, HCollection8],APRHLLike9[T9, HCollection9],APRHLLike10[T10, HCollection10],APRHLLike11[T11, HCollection11],APRHLLike12[T12, HCollection12],APRHLLike13[T13, HCollection13],APRHLLike14[T14, HCollection14],APRHLLike15[T15, HCollection15],APRHLLike16[T16, HCollection16],APRHLLike17[T17, HCollection17],APRHLLike18[T18, HCollection18],APRHLLike19[T19, HCollection19],APRHLLike20[T20, HCollection20],APRHLLike21[T21, HCollection21]] = SupportSelf.law.append[M[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21], T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21, HCDefault, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20,HCollection21](p2)
      }
    
    }
  