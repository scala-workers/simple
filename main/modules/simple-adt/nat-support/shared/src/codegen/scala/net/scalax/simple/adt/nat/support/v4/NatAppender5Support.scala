
    package net.scalax.simple.adt
    package nat
    package support

    trait NatNext3[HListLike, AppendLike[_, _ <: HListLike] <: HListLike] {
      NatNext3Self =>

      def natNext2Helper: NatNext2Helper[HListLike, AppendLike]

      
      class Support1[
        M[_],
        T1[_],
        HCollection1 <: HListLike
      ](
        override val current: M[HCollection1],
        simpleAppender1: SimpleAppender1Positive[M],
        typeGen1: TypeGen1[M, T1]
      ) extends NatNext1.Support1[
        M,
        T1,
        HListLike,
        AppendLike,
        HCollection1
      ] {
        SupportSelf =>

        override def next[U]: Support1[
          M,
          T1,
          AppendLike[T1[U], HCollection1]
        ] = new Support1[
          M,
          T1,
          AppendLike[T1[U], HCollection1]
        ](
          current = NatNext3Self.natNext2Helper.append1[M, T1[U], HCollection1](
            SupportSelf.simpleAppender1
          )(
            typeGen1.gen[U],
            current
          ),
          simpleAppender1 = simpleAppender1,
          typeGen1 = typeGen1
        )
      }
    

      class Support2[
        M[_,_],
        T1[_],T2[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike
      ](
        override val current: M[HCollection1,HCollection2],
        simpleAppender2: SimpleAppender2Positive[M],
        typeGen2: TypeGen2[M, T1,T2]
      ) extends NatNext1.Support2[
        M,
        T1,T2,
        HListLike,HListLike,
        AppendLike,AppendLike,
        HCollection1,HCollection2
      ] {
        SupportSelf =>

        override def next[U]: Support2[
          M,
          T1,T2,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2]
        ] = new Support2[
          M,
          T1,T2,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2]
        ](
          current = NatNext3Self.natNext2Helper.append2[M, T1[U],T2[U], HCollection1,HCollection2](
            SupportSelf.simpleAppender2
          )(
            typeGen2.gen[U],
            current
          ),
          simpleAppender2 = simpleAppender2,
          typeGen2 = typeGen2
        )
      }
    

      class Support3[
        M[_,_,_],
        T1[_],T2[_],T3[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike
      ](
        override val current: M[HCollection1,HCollection2,HCollection3],
        simpleAppender3: SimpleAppender3Positive[M],
        typeGen3: TypeGen3[M, T1,T2,T3]
      ) extends NatNext1.Support3[
        M,
        T1,T2,T3,
        HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3
      ] {
        SupportSelf =>

        override def next[U]: Support3[
          M,
          T1,T2,T3,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3]
        ] = new Support3[
          M,
          T1,T2,T3,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3]
        ](
          current = NatNext3Self.natNext2Helper.append3[M, T1[U],T2[U],T3[U], HCollection1,HCollection2,HCollection3](
            SupportSelf.simpleAppender3
          )(
            typeGen3.gen[U],
            current
          ),
          simpleAppender3 = simpleAppender3,
          typeGen3 = typeGen3
        )
      }
    

      class Support4[
        M[_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike
      ](
        override val current: M[HCollection1,HCollection2,HCollection3,HCollection4],
        simpleAppender4: SimpleAppender4Positive[M],
        typeGen4: TypeGen4[M, T1,T2,T3,T4]
      ) extends NatNext1.Support4[
        M,
        T1,T2,T3,T4,
        HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4
      ] {
        SupportSelf =>

        override def next[U]: Support4[
          M,
          T1,T2,T3,T4,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4]
        ] = new Support4[
          M,
          T1,T2,T3,T4,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4]
        ](
          current = NatNext3Self.natNext2Helper.append4[M, T1[U],T2[U],T3[U],T4[U], HCollection1,HCollection2,HCollection3,HCollection4](
            SupportSelf.simpleAppender4
          )(
            typeGen4.gen[U],
            current
          ),
          simpleAppender4 = simpleAppender4,
          typeGen4 = typeGen4
        )
      }
    

      class Support5[
        M[_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike
      ](
        override val current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5],
        simpleAppender5: SimpleAppender5Positive[M],
        typeGen5: TypeGen5[M, T1,T2,T3,T4,T5]
      ) extends NatNext1.Support5[
        M,
        T1,T2,T3,T4,T5,
        HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5
      ] {
        SupportSelf =>

        override def next[U]: Support5[
          M,
          T1,T2,T3,T4,T5,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5]
        ] = new Support5[
          M,
          T1,T2,T3,T4,T5,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5]
        ](
          current = NatNext3Self.natNext2Helper.append5[M, T1[U],T2[U],T3[U],T4[U],T5[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5](
            SupportSelf.simpleAppender5
          )(
            typeGen5.gen[U],
            current
          ),
          simpleAppender5 = simpleAppender5,
          typeGen5 = typeGen5
        )
      }
    

      class Support6[
        M[_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike
      ](
        override val current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6],
        simpleAppender6: SimpleAppender6Positive[M],
        typeGen6: TypeGen6[M, T1,T2,T3,T4,T5,T6]
      ) extends NatNext1.Support6[
        M,
        T1,T2,T3,T4,T5,T6,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6
      ] {
        SupportSelf =>

        override def next[U]: Support6[
          M,
          T1,T2,T3,T4,T5,T6,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6]
        ] = new Support6[
          M,
          T1,T2,T3,T4,T5,T6,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6]
        ](
          current = NatNext3Self.natNext2Helper.append6[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6](
            SupportSelf.simpleAppender6
          )(
            typeGen6.gen[U],
            current
          ),
          simpleAppender6 = simpleAppender6,
          typeGen6 = typeGen6
        )
      }
    

      class Support7[
        M[_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike
      ](
        override val current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7],
        simpleAppender7: SimpleAppender7Positive[M],
        typeGen7: TypeGen7[M, T1,T2,T3,T4,T5,T6,T7]
      ) extends NatNext1.Support7[
        M,
        T1,T2,T3,T4,T5,T6,T7,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7
      ] {
        SupportSelf =>

        override def next[U]: Support7[
          M,
          T1,T2,T3,T4,T5,T6,T7,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7]
        ] = new Support7[
          M,
          T1,T2,T3,T4,T5,T6,T7,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7]
        ](
          current = NatNext3Self.natNext2Helper.append7[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7](
            SupportSelf.simpleAppender7
          )(
            typeGen7.gen[U],
            current
          ),
          simpleAppender7 = simpleAppender7,
          typeGen7 = typeGen7
        )
      }
    

      class Support8[
        M[_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike
      ](
        override val current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8],
        simpleAppender8: SimpleAppender8Positive[M],
        typeGen8: TypeGen8[M, T1,T2,T3,T4,T5,T6,T7,T8]
      ) extends NatNext1.Support8[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8
      ] {
        SupportSelf =>

        override def next[U]: Support8[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8]
        ] = new Support8[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8]
        ](
          current = NatNext3Self.natNext2Helper.append8[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8](
            SupportSelf.simpleAppender8
          )(
            typeGen8.gen[U],
            current
          ),
          simpleAppender8 = simpleAppender8,
          typeGen8 = typeGen8
        )
      }
    

      class Support9[
        M[_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike
      ](
        override val current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9],
        simpleAppender9: SimpleAppender9Positive[M],
        typeGen9: TypeGen9[M, T1,T2,T3,T4,T5,T6,T7,T8,T9]
      ) extends NatNext1.Support9[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9
      ] {
        SupportSelf =>

        override def next[U]: Support9[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9]
        ] = new Support9[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9]
        ](
          current = NatNext3Self.natNext2Helper.append9[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9](
            SupportSelf.simpleAppender9
          )(
            typeGen9.gen[U],
            current
          ),
          simpleAppender9 = simpleAppender9,
          typeGen9 = typeGen9
        )
      }
    

      class Support10[
        M[_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike
      ](
        override val current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10],
        simpleAppender10: SimpleAppender10Positive[M],
        typeGen10: TypeGen10[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]
      ) extends NatNext1.Support10[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10
      ] {
        SupportSelf =>

        override def next[U]: Support10[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10]
        ] = new Support10[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10]
        ](
          current = NatNext3Self.natNext2Helper.append10[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10](
            SupportSelf.simpleAppender10
          )(
            typeGen10.gen[U],
            current
          ),
          simpleAppender10 = simpleAppender10,
          typeGen10 = typeGen10
        )
      }
    

      class Support11[
        M[_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike,HCollection11 <: HListLike
      ](
        override val current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11],
        simpleAppender11: SimpleAppender11Positive[M],
        typeGen11: TypeGen11[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]
      ) extends NatNext1.Support11[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11
      ] {
        SupportSelf =>

        override def next[U]: Support11[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11]
        ] = new Support11[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11]
        ](
          current = NatNext3Self.natNext2Helper.append11[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11](
            SupportSelf.simpleAppender11
          )(
            typeGen11.gen[U],
            current
          ),
          simpleAppender11 = simpleAppender11,
          typeGen11 = typeGen11
        )
      }
    

      class Support12[
        M[_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike,HCollection11 <: HListLike,HCollection12 <: HListLike
      ](
        override val current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12],
        simpleAppender12: SimpleAppender12Positive[M],
        typeGen12: TypeGen12[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]
      ) extends NatNext1.Support12[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12
      ] {
        SupportSelf =>

        override def next[U]: Support12[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12]
        ] = new Support12[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12]
        ](
          current = NatNext3Self.natNext2Helper.append12[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12](
            SupportSelf.simpleAppender12
          )(
            typeGen12.gen[U],
            current
          ),
          simpleAppender12 = simpleAppender12,
          typeGen12 = typeGen12
        )
      }
    

      class Support13[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike,HCollection11 <: HListLike,HCollection12 <: HListLike,HCollection13 <: HListLike
      ](
        override val current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13],
        simpleAppender13: SimpleAppender13Positive[M],
        typeGen13: TypeGen13[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]
      ) extends NatNext1.Support13[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13
      ] {
        SupportSelf =>

        override def next[U]: Support13[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13]
        ] = new Support13[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13]
        ](
          current = NatNext3Self.natNext2Helper.append13[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13](
            SupportSelf.simpleAppender13
          )(
            typeGen13.gen[U],
            current
          ),
          simpleAppender13 = simpleAppender13,
          typeGen13 = typeGen13
        )
      }
    

      class Support14[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike,HCollection11 <: HListLike,HCollection12 <: HListLike,HCollection13 <: HListLike,HCollection14 <: HListLike
      ](
        override val current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14],
        simpleAppender14: SimpleAppender14Positive[M],
        typeGen14: TypeGen14[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]
      ) extends NatNext1.Support14[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14
      ] {
        SupportSelf =>

        override def next[U]: Support14[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14]
        ] = new Support14[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14]
        ](
          current = NatNext3Self.natNext2Helper.append14[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14](
            SupportSelf.simpleAppender14
          )(
            typeGen14.gen[U],
            current
          ),
          simpleAppender14 = simpleAppender14,
          typeGen14 = typeGen14
        )
      }
    

      class Support15[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike,HCollection11 <: HListLike,HCollection12 <: HListLike,HCollection13 <: HListLike,HCollection14 <: HListLike,HCollection15 <: HListLike
      ](
        override val current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15],
        simpleAppender15: SimpleAppender15Positive[M],
        typeGen15: TypeGen15[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
      ) extends NatNext1.Support15[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15
      ] {
        SupportSelf =>

        override def next[U]: Support15[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15]
        ] = new Support15[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15]
        ](
          current = NatNext3Self.natNext2Helper.append15[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U],T15[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15](
            SupportSelf.simpleAppender15
          )(
            typeGen15.gen[U],
            current
          ),
          simpleAppender15 = simpleAppender15,
          typeGen15 = typeGen15
        )
      }
    

      class Support16[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike,HCollection11 <: HListLike,HCollection12 <: HListLike,HCollection13 <: HListLike,HCollection14 <: HListLike,HCollection15 <: HListLike,HCollection16 <: HListLike
      ](
        override val current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16],
        simpleAppender16: SimpleAppender16Positive[M],
        typeGen16: TypeGen16[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
      ) extends NatNext1.Support16[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16
      ] {
        SupportSelf =>

        override def next[U]: Support16[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16]
        ] = new Support16[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16]
        ](
          current = NatNext3Self.natNext2Helper.append16[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U],T15[U],T16[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16](
            SupportSelf.simpleAppender16
          )(
            typeGen16.gen[U],
            current
          ),
          simpleAppender16 = simpleAppender16,
          typeGen16 = typeGen16
        )
      }
    

      class Support17[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike,HCollection11 <: HListLike,HCollection12 <: HListLike,HCollection13 <: HListLike,HCollection14 <: HListLike,HCollection15 <: HListLike,HCollection16 <: HListLike,HCollection17 <: HListLike
      ](
        override val current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17],
        simpleAppender17: SimpleAppender17Positive[M],
        typeGen17: TypeGen17[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
      ) extends NatNext1.Support17[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17
      ] {
        SupportSelf =>

        override def next[U]: Support17[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16],AppendLike[T17[U], HCollection17]
        ] = new Support17[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16],AppendLike[T17[U], HCollection17]
        ](
          current = NatNext3Self.natNext2Helper.append17[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U],T15[U],T16[U],T17[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17](
            SupportSelf.simpleAppender17
          )(
            typeGen17.gen[U],
            current
          ),
          simpleAppender17 = simpleAppender17,
          typeGen17 = typeGen17
        )
      }
    

      class Support18[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],T18[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike,HCollection11 <: HListLike,HCollection12 <: HListLike,HCollection13 <: HListLike,HCollection14 <: HListLike,HCollection15 <: HListLike,HCollection16 <: HListLike,HCollection17 <: HListLike,HCollection18 <: HListLike
      ](
        override val current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18],
        simpleAppender18: SimpleAppender18Positive[M],
        typeGen18: TypeGen18[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
      ) extends NatNext1.Support18[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18
      ] {
        SupportSelf =>

        override def next[U]: Support18[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16],AppendLike[T17[U], HCollection17],AppendLike[T18[U], HCollection18]
        ] = new Support18[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16],AppendLike[T17[U], HCollection17],AppendLike[T18[U], HCollection18]
        ](
          current = NatNext3Self.natNext2Helper.append18[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U],T15[U],T16[U],T17[U],T18[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18](
            SupportSelf.simpleAppender18
          )(
            typeGen18.gen[U],
            current
          ),
          simpleAppender18 = simpleAppender18,
          typeGen18 = typeGen18
        )
      }
    

      class Support19[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],T18[_],T19[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike,HCollection11 <: HListLike,HCollection12 <: HListLike,HCollection13 <: HListLike,HCollection14 <: HListLike,HCollection15 <: HListLike,HCollection16 <: HListLike,HCollection17 <: HListLike,HCollection18 <: HListLike,HCollection19 <: HListLike
      ](
        override val current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19],
        simpleAppender19: SimpleAppender19Positive[M],
        typeGen19: TypeGen19[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
      ) extends NatNext1.Support19[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19
      ] {
        SupportSelf =>

        override def next[U]: Support19[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16],AppendLike[T17[U], HCollection17],AppendLike[T18[U], HCollection18],AppendLike[T19[U], HCollection19]
        ] = new Support19[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16],AppendLike[T17[U], HCollection17],AppendLike[T18[U], HCollection18],AppendLike[T19[U], HCollection19]
        ](
          current = NatNext3Self.natNext2Helper.append19[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U],T15[U],T16[U],T17[U],T18[U],T19[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19](
            SupportSelf.simpleAppender19
          )(
            typeGen19.gen[U],
            current
          ),
          simpleAppender19 = simpleAppender19,
          typeGen19 = typeGen19
        )
      }
    

      class Support20[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],T18[_],T19[_],T20[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike,HCollection11 <: HListLike,HCollection12 <: HListLike,HCollection13 <: HListLike,HCollection14 <: HListLike,HCollection15 <: HListLike,HCollection16 <: HListLike,HCollection17 <: HListLike,HCollection18 <: HListLike,HCollection19 <: HListLike,HCollection20 <: HListLike
      ](
        override val current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20],
        simpleAppender20: SimpleAppender20Positive[M],
        typeGen20: TypeGen20[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
      ) extends NatNext1.Support20[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20
      ] {
        SupportSelf =>

        override def next[U]: Support20[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16],AppendLike[T17[U], HCollection17],AppendLike[T18[U], HCollection18],AppendLike[T19[U], HCollection19],AppendLike[T20[U], HCollection20]
        ] = new Support20[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16],AppendLike[T17[U], HCollection17],AppendLike[T18[U], HCollection18],AppendLike[T19[U], HCollection19],AppendLike[T20[U], HCollection20]
        ](
          current = NatNext3Self.natNext2Helper.append20[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U],T15[U],T16[U],T17[U],T18[U],T19[U],T20[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20](
            SupportSelf.simpleAppender20
          )(
            typeGen20.gen[U],
            current
          ),
          simpleAppender20 = simpleAppender20,
          typeGen20 = typeGen20
        )
      }
    

      class Support21[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],T18[_],T19[_],T20[_],T21[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike,HCollection11 <: HListLike,HCollection12 <: HListLike,HCollection13 <: HListLike,HCollection14 <: HListLike,HCollection15 <: HListLike,HCollection16 <: HListLike,HCollection17 <: HListLike,HCollection18 <: HListLike,HCollection19 <: HListLike,HCollection20 <: HListLike,HCollection21 <: HListLike
      ](
        override val current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20,HCollection21],
        simpleAppender21: SimpleAppender21Positive[M],
        typeGen21: TypeGen21[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
      ) extends NatNext1.Support21[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20,HCollection21
      ] {
        SupportSelf =>

        override def next[U]: Support21[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16],AppendLike[T17[U], HCollection17],AppendLike[T18[U], HCollection18],AppendLike[T19[U], HCollection19],AppendLike[T20[U], HCollection20],AppendLike[T21[U], HCollection21]
        ] = new Support21[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,
          AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16],AppendLike[T17[U], HCollection17],AppendLike[T18[U], HCollection18],AppendLike[T19[U], HCollection19],AppendLike[T20[U], HCollection20],AppendLike[T21[U], HCollection21]
        ](
          current = NatNext3Self.natNext2Helper.append21[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U],T15[U],T16[U],T17[U],T18[U],T19[U],T20[U],T21[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20,HCollection21](
            SupportSelf.simpleAppender21
          )(
            typeGen21.gen[U],
            current
          ),
          simpleAppender21 = simpleAppender21,
          typeGen21 = typeGen21
        )
      }
    
    }
  