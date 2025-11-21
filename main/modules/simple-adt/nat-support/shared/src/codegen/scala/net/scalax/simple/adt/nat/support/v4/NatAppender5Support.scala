
    package net.scalax.simple.adt
    package nat
    package support

    trait NatNext3[HListLike, AppendLike[_, _ <: HListLike] <: HListLike] {
      NatNext3Self =>

      def natNext2Helper: NatNext2Helper[HListLike, AppendLike]

      object Impl1 {
        
      def Support1[
        M[_],
        T1[_],
        HCollection1 <: HListLike
      ](
        current: M[HCollection1],
        simpleAppender: SimpleAppender1Positive[M],
        typeGen: SimpleProduct1.TypeGen[M, T1]
      ): NatNext1.Support1[
        M,
        T1,
        HListLike,
        AppendLike,
        HCollection1
      ] = {
        val current1 = current
        new NatNext1.Support1[
          M,
          T1,
          HListLike,
          AppendLike,
          HCollection1
        ] {
          SupportSelf =>

          override def current: M[HCollection1] = current1

          override def next[U]: NatNext1.Support1[
            M,
            T1,
            HListLike,
            AppendLike,
            AppendLike[T1[U], HCollection1]
          ] = NatNext3Self.Impl1.Support1[
            M,
            T1,
            AppendLike[T1[U], HCollection1]
          ](
            current = NatNext3Self.natNext2Helper.append1[M, T1[U], HCollection1](
              simpleAppender
            )(
              typeGen.gen[U],
              current1
            ),
            simpleAppender = simpleAppender,
            typeGen = typeGen
          )
        }
      }
    

      def Support2[
        M[_,_],
        T1[_],T2[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike
      ](
        current: M[HCollection1,HCollection2],
        simpleAppender: SimpleAppender2Positive[M],
        typeGen: SimpleProduct2.TypeGen[M, T1,T2]
      ): NatNext1.Support2[
        M,
        T1,T2,
        HListLike,HListLike,
        AppendLike,AppendLike,
        HCollection1,HCollection2
      ] = {
        val current1 = current
        new NatNext1.Support2[
          M,
          T1,T2,
          HListLike,HListLike,
          AppendLike,AppendLike,
          HCollection1,HCollection2
        ] {
          SupportSelf =>

          override def current: M[HCollection1,HCollection2] = current1

          override def next[U]: NatNext1.Support2[
            M,
            T1,T2,
            HListLike,HListLike,
            AppendLike,AppendLike,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2]
          ] = NatNext3Self.Impl1.Support2[
            M,
            T1,T2,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2]
          ](
            current = NatNext3Self.natNext2Helper.append2[M, T1[U],T2[U], HCollection1,HCollection2](
              simpleAppender
            )(
              typeGen.gen[U],
              current1
            ),
            simpleAppender = simpleAppender,
            typeGen = typeGen
          )
        }
      }
    

      def Support3[
        M[_,_,_],
        T1[_],T2[_],T3[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike
      ](
        current: M[HCollection1,HCollection2,HCollection3],
        simpleAppender: SimpleAppender3Positive[M],
        typeGen: SimpleProduct3.TypeGen[M, T1,T2,T3]
      ): NatNext1.Support3[
        M,
        T1,T2,T3,
        HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3
      ] = {
        val current1 = current
        new NatNext1.Support3[
          M,
          T1,T2,T3,
          HListLike,HListLike,HListLike,
          AppendLike,AppendLike,AppendLike,
          HCollection1,HCollection2,HCollection3
        ] {
          SupportSelf =>

          override def current: M[HCollection1,HCollection2,HCollection3] = current1

          override def next[U]: NatNext1.Support3[
            M,
            T1,T2,T3,
            HListLike,HListLike,HListLike,
            AppendLike,AppendLike,AppendLike,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3]
          ] = NatNext3Self.Impl1.Support3[
            M,
            T1,T2,T3,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3]
          ](
            current = NatNext3Self.natNext2Helper.append3[M, T1[U],T2[U],T3[U], HCollection1,HCollection2,HCollection3](
              simpleAppender
            )(
              typeGen.gen[U],
              current1
            ),
            simpleAppender = simpleAppender,
            typeGen = typeGen
          )
        }
      }
    

      def Support4[
        M[_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike
      ](
        current: M[HCollection1,HCollection2,HCollection3,HCollection4],
        simpleAppender: SimpleAppender4Positive[M],
        typeGen: SimpleProduct4.TypeGen[M, T1,T2,T3,T4]
      ): NatNext1.Support4[
        M,
        T1,T2,T3,T4,
        HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4
      ] = {
        val current1 = current
        new NatNext1.Support4[
          M,
          T1,T2,T3,T4,
          HListLike,HListLike,HListLike,HListLike,
          AppendLike,AppendLike,AppendLike,AppendLike,
          HCollection1,HCollection2,HCollection3,HCollection4
        ] {
          SupportSelf =>

          override def current: M[HCollection1,HCollection2,HCollection3,HCollection4] = current1

          override def next[U]: NatNext1.Support4[
            M,
            T1,T2,T3,T4,
            HListLike,HListLike,HListLike,HListLike,
            AppendLike,AppendLike,AppendLike,AppendLike,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4]
          ] = NatNext3Self.Impl1.Support4[
            M,
            T1,T2,T3,T4,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4]
          ](
            current = NatNext3Self.natNext2Helper.append4[M, T1[U],T2[U],T3[U],T4[U], HCollection1,HCollection2,HCollection3,HCollection4](
              simpleAppender
            )(
              typeGen.gen[U],
              current1
            ),
            simpleAppender = simpleAppender,
            typeGen = typeGen
          )
        }
      }
    

      def Support5[
        M[_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike
      ](
        current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5],
        simpleAppender: SimpleAppender5Positive[M],
        typeGen: SimpleProduct5.TypeGen[M, T1,T2,T3,T4,T5]
      ): NatNext1.Support5[
        M,
        T1,T2,T3,T4,T5,
        HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5
      ] = {
        val current1 = current
        new NatNext1.Support5[
          M,
          T1,T2,T3,T4,T5,
          HListLike,HListLike,HListLike,HListLike,HListLike,
          AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
          HCollection1,HCollection2,HCollection3,HCollection4,HCollection5
        ] {
          SupportSelf =>

          override def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5] = current1

          override def next[U]: NatNext1.Support5[
            M,
            T1,T2,T3,T4,T5,
            HListLike,HListLike,HListLike,HListLike,HListLike,
            AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5]
          ] = NatNext3Self.Impl1.Support5[
            M,
            T1,T2,T3,T4,T5,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5]
          ](
            current = NatNext3Self.natNext2Helper.append5[M, T1[U],T2[U],T3[U],T4[U],T5[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5](
              simpleAppender
            )(
              typeGen.gen[U],
              current1
            ),
            simpleAppender = simpleAppender,
            typeGen = typeGen
          )
        }
      }
    

      def Support6[
        M[_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike
      ](
        current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6],
        simpleAppender: SimpleAppender6Positive[M],
        typeGen: SimpleProduct6.TypeGen[M, T1,T2,T3,T4,T5,T6]
      ): NatNext1.Support6[
        M,
        T1,T2,T3,T4,T5,T6,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6
      ] = {
        val current1 = current
        new NatNext1.Support6[
          M,
          T1,T2,T3,T4,T5,T6,
          HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
          AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
          HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6
        ] {
          SupportSelf =>

          override def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6] = current1

          override def next[U]: NatNext1.Support6[
            M,
            T1,T2,T3,T4,T5,T6,
            HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
            AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6]
          ] = NatNext3Self.Impl1.Support6[
            M,
            T1,T2,T3,T4,T5,T6,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6]
          ](
            current = NatNext3Self.natNext2Helper.append6[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6](
              simpleAppender
            )(
              typeGen.gen[U],
              current1
            ),
            simpleAppender = simpleAppender,
            typeGen = typeGen
          )
        }
      }
    

      def Support7[
        M[_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike
      ](
        current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7],
        simpleAppender: SimpleAppender7Positive[M],
        typeGen: SimpleProduct7.TypeGen[M, T1,T2,T3,T4,T5,T6,T7]
      ): NatNext1.Support7[
        M,
        T1,T2,T3,T4,T5,T6,T7,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7
      ] = {
        val current1 = current
        new NatNext1.Support7[
          M,
          T1,T2,T3,T4,T5,T6,T7,
          HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
          AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
          HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7
        ] {
          SupportSelf =>

          override def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7] = current1

          override def next[U]: NatNext1.Support7[
            M,
            T1,T2,T3,T4,T5,T6,T7,
            HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
            AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7]
          ] = NatNext3Self.Impl1.Support7[
            M,
            T1,T2,T3,T4,T5,T6,T7,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7]
          ](
            current = NatNext3Self.natNext2Helper.append7[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7](
              simpleAppender
            )(
              typeGen.gen[U],
              current1
            ),
            simpleAppender = simpleAppender,
            typeGen = typeGen
          )
        }
      }
    

      def Support8[
        M[_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike
      ](
        current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8],
        simpleAppender: SimpleAppender8Positive[M],
        typeGen: SimpleProduct8.TypeGen[M, T1,T2,T3,T4,T5,T6,T7,T8]
      ): NatNext1.Support8[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8
      ] = {
        val current1 = current
        new NatNext1.Support8[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,
          HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
          AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
          HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8
        ] {
          SupportSelf =>

          override def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8] = current1

          override def next[U]: NatNext1.Support8[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,
            HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
            AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8]
          ] = NatNext3Self.Impl1.Support8[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8]
          ](
            current = NatNext3Self.natNext2Helper.append8[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8](
              simpleAppender
            )(
              typeGen.gen[U],
              current1
            ),
            simpleAppender = simpleAppender,
            typeGen = typeGen
          )
        }
      }
    

      def Support9[
        M[_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike
      ](
        current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9],
        simpleAppender: SimpleAppender9Positive[M],
        typeGen: SimpleProduct9.TypeGen[M, T1,T2,T3,T4,T5,T6,T7,T8,T9]
      ): NatNext1.Support9[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9
      ] = {
        val current1 = current
        new NatNext1.Support9[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,
          HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
          AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
          HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9
        ] {
          SupportSelf =>

          override def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9] = current1

          override def next[U]: NatNext1.Support9[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,
            HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
            AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9]
          ] = NatNext3Self.Impl1.Support9[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9]
          ](
            current = NatNext3Self.natNext2Helper.append9[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9](
              simpleAppender
            )(
              typeGen.gen[U],
              current1
            ),
            simpleAppender = simpleAppender,
            typeGen = typeGen
          )
        }
      }
    

      def Support10[
        M[_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike
      ](
        current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10],
        simpleAppender: SimpleAppender10Positive[M],
        typeGen: SimpleProduct10.TypeGen[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]
      ): NatNext1.Support10[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10
      ] = {
        val current1 = current
        new NatNext1.Support10[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,
          HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
          AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
          HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10
        ] {
          SupportSelf =>

          override def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10] = current1

          override def next[U]: NatNext1.Support10[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,
            HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
            AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10]
          ] = NatNext3Self.Impl1.Support10[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10]
          ](
            current = NatNext3Self.natNext2Helper.append10[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10](
              simpleAppender
            )(
              typeGen.gen[U],
              current1
            ),
            simpleAppender = simpleAppender,
            typeGen = typeGen
          )
        }
      }
    

      def Support11[
        M[_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike,HCollection11 <: HListLike
      ](
        current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11],
        simpleAppender: SimpleAppender11Positive[M],
        typeGen: SimpleProduct11.TypeGen[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]
      ): NatNext1.Support11[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11
      ] = {
        val current1 = current
        new NatNext1.Support11[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,
          HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
          AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
          HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11
        ] {
          SupportSelf =>

          override def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11] = current1

          override def next[U]: NatNext1.Support11[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,
            HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
            AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11]
          ] = NatNext3Self.Impl1.Support11[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11]
          ](
            current = NatNext3Self.natNext2Helper.append11[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11](
              simpleAppender
            )(
              typeGen.gen[U],
              current1
            ),
            simpleAppender = simpleAppender,
            typeGen = typeGen
          )
        }
      }
    

      def Support12[
        M[_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike,HCollection11 <: HListLike,HCollection12 <: HListLike
      ](
        current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12],
        simpleAppender: SimpleAppender12Positive[M],
        typeGen: SimpleProduct12.TypeGen[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]
      ): NatNext1.Support12[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12
      ] = {
        val current1 = current
        new NatNext1.Support12[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,
          HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
          AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
          HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12
        ] {
          SupportSelf =>

          override def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12] = current1

          override def next[U]: NatNext1.Support12[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,
            HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
            AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12]
          ] = NatNext3Self.Impl1.Support12[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12]
          ](
            current = NatNext3Self.natNext2Helper.append12[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12](
              simpleAppender
            )(
              typeGen.gen[U],
              current1
            ),
            simpleAppender = simpleAppender,
            typeGen = typeGen
          )
        }
      }
    

      def Support13[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike,HCollection11 <: HListLike,HCollection12 <: HListLike,HCollection13 <: HListLike
      ](
        current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13],
        simpleAppender: SimpleAppender13Positive[M],
        typeGen: SimpleProduct13.TypeGen[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]
      ): NatNext1.Support13[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13
      ] = {
        val current1 = current
        new NatNext1.Support13[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,
          HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
          AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
          HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13
        ] {
          SupportSelf =>

          override def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13] = current1

          override def next[U]: NatNext1.Support13[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,
            HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
            AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13]
          ] = NatNext3Self.Impl1.Support13[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13]
          ](
            current = NatNext3Self.natNext2Helper.append13[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13](
              simpleAppender
            )(
              typeGen.gen[U],
              current1
            ),
            simpleAppender = simpleAppender,
            typeGen = typeGen
          )
        }
      }
    

      def Support14[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike,HCollection11 <: HListLike,HCollection12 <: HListLike,HCollection13 <: HListLike,HCollection14 <: HListLike
      ](
        current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14],
        simpleAppender: SimpleAppender14Positive[M],
        typeGen: SimpleProduct14.TypeGen[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]
      ): NatNext1.Support14[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14
      ] = {
        val current1 = current
        new NatNext1.Support14[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,
          HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
          AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
          HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14
        ] {
          SupportSelf =>

          override def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14] = current1

          override def next[U]: NatNext1.Support14[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,
            HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
            AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14]
          ] = NatNext3Self.Impl1.Support14[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14]
          ](
            current = NatNext3Self.natNext2Helper.append14[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14](
              simpleAppender
            )(
              typeGen.gen[U],
              current1
            ),
            simpleAppender = simpleAppender,
            typeGen = typeGen
          )
        }
      }
    

      def Support15[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike,HCollection11 <: HListLike,HCollection12 <: HListLike,HCollection13 <: HListLike,HCollection14 <: HListLike,HCollection15 <: HListLike
      ](
        current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15],
        simpleAppender: SimpleAppender15Positive[M],
        typeGen: SimpleProduct15.TypeGen[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
      ): NatNext1.Support15[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15
      ] = {
        val current1 = current
        new NatNext1.Support15[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,
          HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
          AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
          HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15
        ] {
          SupportSelf =>

          override def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15] = current1

          override def next[U]: NatNext1.Support15[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,
            HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
            AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15]
          ] = NatNext3Self.Impl1.Support15[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15]
          ](
            current = NatNext3Self.natNext2Helper.append15[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U],T15[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15](
              simpleAppender
            )(
              typeGen.gen[U],
              current1
            ),
            simpleAppender = simpleAppender,
            typeGen = typeGen
          )
        }
      }
    

      def Support16[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike,HCollection11 <: HListLike,HCollection12 <: HListLike,HCollection13 <: HListLike,HCollection14 <: HListLike,HCollection15 <: HListLike,HCollection16 <: HListLike
      ](
        current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16],
        simpleAppender: SimpleAppender16Positive[M],
        typeGen: SimpleProduct16.TypeGen[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
      ): NatNext1.Support16[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16
      ] = {
        val current1 = current
        new NatNext1.Support16[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,
          HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
          AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
          HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16
        ] {
          SupportSelf =>

          override def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16] = current1

          override def next[U]: NatNext1.Support16[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,
            HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
            AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16]
          ] = NatNext3Self.Impl1.Support16[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16]
          ](
            current = NatNext3Self.natNext2Helper.append16[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U],T15[U],T16[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16](
              simpleAppender
            )(
              typeGen.gen[U],
              current1
            ),
            simpleAppender = simpleAppender,
            typeGen = typeGen
          )
        }
      }
    

      def Support17[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike,HCollection11 <: HListLike,HCollection12 <: HListLike,HCollection13 <: HListLike,HCollection14 <: HListLike,HCollection15 <: HListLike,HCollection16 <: HListLike,HCollection17 <: HListLike
      ](
        current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17],
        simpleAppender: SimpleAppender17Positive[M],
        typeGen: SimpleProduct17.TypeGen[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
      ): NatNext1.Support17[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17
      ] = {
        val current1 = current
        new NatNext1.Support17[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,
          HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
          AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
          HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17
        ] {
          SupportSelf =>

          override def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17] = current1

          override def next[U]: NatNext1.Support17[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,
            HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
            AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16],AppendLike[T17[U], HCollection17]
          ] = NatNext3Self.Impl1.Support17[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16],AppendLike[T17[U], HCollection17]
          ](
            current = NatNext3Self.natNext2Helper.append17[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U],T15[U],T16[U],T17[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17](
              simpleAppender
            )(
              typeGen.gen[U],
              current1
            ),
            simpleAppender = simpleAppender,
            typeGen = typeGen
          )
        }
      }
    

      def Support18[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],T18[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike,HCollection11 <: HListLike,HCollection12 <: HListLike,HCollection13 <: HListLike,HCollection14 <: HListLike,HCollection15 <: HListLike,HCollection16 <: HListLike,HCollection17 <: HListLike,HCollection18 <: HListLike
      ](
        current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18],
        simpleAppender: SimpleAppender18Positive[M],
        typeGen: SimpleProduct18.TypeGen[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
      ): NatNext1.Support18[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18
      ] = {
        val current1 = current
        new NatNext1.Support18[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,
          HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
          AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
          HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18
        ] {
          SupportSelf =>

          override def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18] = current1

          override def next[U]: NatNext1.Support18[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,
            HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
            AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16],AppendLike[T17[U], HCollection17],AppendLike[T18[U], HCollection18]
          ] = NatNext3Self.Impl1.Support18[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16],AppendLike[T17[U], HCollection17],AppendLike[T18[U], HCollection18]
          ](
            current = NatNext3Self.natNext2Helper.append18[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U],T15[U],T16[U],T17[U],T18[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18](
              simpleAppender
            )(
              typeGen.gen[U],
              current1
            ),
            simpleAppender = simpleAppender,
            typeGen = typeGen
          )
        }
      }
    

      def Support19[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],T18[_],T19[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike,HCollection11 <: HListLike,HCollection12 <: HListLike,HCollection13 <: HListLike,HCollection14 <: HListLike,HCollection15 <: HListLike,HCollection16 <: HListLike,HCollection17 <: HListLike,HCollection18 <: HListLike,HCollection19 <: HListLike
      ](
        current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19],
        simpleAppender: SimpleAppender19Positive[M],
        typeGen: SimpleProduct19.TypeGen[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
      ): NatNext1.Support19[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19
      ] = {
        val current1 = current
        new NatNext1.Support19[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,
          HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
          AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
          HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19
        ] {
          SupportSelf =>

          override def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19] = current1

          override def next[U]: NatNext1.Support19[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,
            HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
            AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16],AppendLike[T17[U], HCollection17],AppendLike[T18[U], HCollection18],AppendLike[T19[U], HCollection19]
          ] = NatNext3Self.Impl1.Support19[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16],AppendLike[T17[U], HCollection17],AppendLike[T18[U], HCollection18],AppendLike[T19[U], HCollection19]
          ](
            current = NatNext3Self.natNext2Helper.append19[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U],T15[U],T16[U],T17[U],T18[U],T19[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19](
              simpleAppender
            )(
              typeGen.gen[U],
              current1
            ),
            simpleAppender = simpleAppender,
            typeGen = typeGen
          )
        }
      }
    

      def Support20[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],T18[_],T19[_],T20[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike,HCollection11 <: HListLike,HCollection12 <: HListLike,HCollection13 <: HListLike,HCollection14 <: HListLike,HCollection15 <: HListLike,HCollection16 <: HListLike,HCollection17 <: HListLike,HCollection18 <: HListLike,HCollection19 <: HListLike,HCollection20 <: HListLike
      ](
        current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20],
        simpleAppender: SimpleAppender20Positive[M],
        typeGen: SimpleProduct20.TypeGen[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
      ): NatNext1.Support20[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20
      ] = {
        val current1 = current
        new NatNext1.Support20[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,
          HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
          AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
          HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20
        ] {
          SupportSelf =>

          override def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20] = current1

          override def next[U]: NatNext1.Support20[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,
            HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
            AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16],AppendLike[T17[U], HCollection17],AppendLike[T18[U], HCollection18],AppendLike[T19[U], HCollection19],AppendLike[T20[U], HCollection20]
          ] = NatNext3Self.Impl1.Support20[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16],AppendLike[T17[U], HCollection17],AppendLike[T18[U], HCollection18],AppendLike[T19[U], HCollection19],AppendLike[T20[U], HCollection20]
          ](
            current = NatNext3Self.natNext2Helper.append20[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U],T15[U],T16[U],T17[U],T18[U],T19[U],T20[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20](
              simpleAppender
            )(
              typeGen.gen[U],
              current1
            ),
            simpleAppender = simpleAppender,
            typeGen = typeGen
          )
        }
      }
    

      def Support21[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],T18[_],T19[_],T20[_],T21[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike,HCollection11 <: HListLike,HCollection12 <: HListLike,HCollection13 <: HListLike,HCollection14 <: HListLike,HCollection15 <: HListLike,HCollection16 <: HListLike,HCollection17 <: HListLike,HCollection18 <: HListLike,HCollection19 <: HListLike,HCollection20 <: HListLike,HCollection21 <: HListLike
      ](
        current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20,HCollection21],
        simpleAppender: SimpleAppender21Positive[M],
        typeGen: SimpleProduct21.TypeGen[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
      ): NatNext1.Support21[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20,HCollection21
      ] = {
        val current1 = current
        new NatNext1.Support21[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,
          HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
          AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
          HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20,HCollection21
        ] {
          SupportSelf =>

          override def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20,HCollection21] = current1

          override def next[U]: NatNext1.Support21[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,
            HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
            AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16],AppendLike[T17[U], HCollection17],AppendLike[T18[U], HCollection18],AppendLike[T19[U], HCollection19],AppendLike[T20[U], HCollection20],AppendLike[T21[U], HCollection21]
          ] = NatNext3Self.Impl1.Support21[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16],AppendLike[T17[U], HCollection17],AppendLike[T18[U], HCollection18],AppendLike[T19[U], HCollection19],AppendLike[T20[U], HCollection20],AppendLike[T21[U], HCollection21]
          ](
            current = NatNext3Self.natNext2Helper.append21[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U],T15[U],T16[U],T17[U],T18[U],T19[U],T20[U],T21[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20,HCollection21](
              simpleAppender
            )(
              typeGen.gen[U],
              current1
            ),
            simpleAppender = simpleAppender,
            typeGen = typeGen
          )
        }
      }
    

      def Support22[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],T18[_],T19[_],T20[_],T21[_],T22[_],
        HCollection1 <: HListLike,HCollection2 <: HListLike,HCollection3 <: HListLike,HCollection4 <: HListLike,HCollection5 <: HListLike,HCollection6 <: HListLike,HCollection7 <: HListLike,HCollection8 <: HListLike,HCollection9 <: HListLike,HCollection10 <: HListLike,HCollection11 <: HListLike,HCollection12 <: HListLike,HCollection13 <: HListLike,HCollection14 <: HListLike,HCollection15 <: HListLike,HCollection16 <: HListLike,HCollection17 <: HListLike,HCollection18 <: HListLike,HCollection19 <: HListLike,HCollection20 <: HListLike,HCollection21 <: HListLike,HCollection22 <: HListLike
      ](
        current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20,HCollection21,HCollection22],
        simpleAppender: SimpleAppender22Positive[M],
        typeGen: SimpleProduct22.TypeGen[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
      ): NatNext1.Support22[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,
        HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
        AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
        HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20,HCollection21,HCollection22
      ] = {
        val current1 = current
        new NatNext1.Support22[
          M,
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,
          HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
          AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
          HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20,HCollection21,HCollection22
        ] {
          SupportSelf =>

          override def current: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20,HCollection21,HCollection22] = current1

          override def next[U]: NatNext1.Support22[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,
            HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,HListLike,
            AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,AppendLike,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16],AppendLike[T17[U], HCollection17],AppendLike[T18[U], HCollection18],AppendLike[T19[U], HCollection19],AppendLike[T20[U], HCollection20],AppendLike[T21[U], HCollection21],AppendLike[T22[U], HCollection22]
          ] = NatNext3Self.Impl1.Support22[
            M,
            T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,
            AppendLike[T1[U], HCollection1],AppendLike[T2[U], HCollection2],AppendLike[T3[U], HCollection3],AppendLike[T4[U], HCollection4],AppendLike[T5[U], HCollection5],AppendLike[T6[U], HCollection6],AppendLike[T7[U], HCollection7],AppendLike[T8[U], HCollection8],AppendLike[T9[U], HCollection9],AppendLike[T10[U], HCollection10],AppendLike[T11[U], HCollection11],AppendLike[T12[U], HCollection12],AppendLike[T13[U], HCollection13],AppendLike[T14[U], HCollection14],AppendLike[T15[U], HCollection15],AppendLike[T16[U], HCollection16],AppendLike[T17[U], HCollection17],AppendLike[T18[U], HCollection18],AppendLike[T19[U], HCollection19],AppendLike[T20[U], HCollection20],AppendLike[T21[U], HCollection21],AppendLike[T22[U], HCollection22]
          ](
            current = NatNext3Self.natNext2Helper.append22[M, T1[U],T2[U],T3[U],T4[U],T5[U],T6[U],T7[U],T8[U],T9[U],T10[U],T11[U],T12[U],T13[U],T14[U],T15[U],T16[U],T17[U],T18[U],T19[U],T20[U],T21[U],T22[U], HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20,HCollection21,HCollection22](
              simpleAppender
            )(
              typeGen.gen[U],
              current1
            ),
            simpleAppender = simpleAppender,
            typeGen = typeGen
          )
        }
      }
    
      }
    }
  