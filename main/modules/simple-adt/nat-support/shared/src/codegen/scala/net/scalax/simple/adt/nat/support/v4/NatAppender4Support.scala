
    package net.scalax.simple.adt
    package nat
    package support

    trait NatNext4[HListLike, AppendLike[_, _ <: HListLike] <: HListLike, ZeroLike <: HListLike] extends NatNext3[HListLike, AppendLike] {
      NatNext4Self =>

      def zeroInstance: ZeroLike

      object Impl2 {
        
      class Support1[
        M[_],
        T1[_]
      ](
        simpleAppender1: SimpleAppender1[M],
        typeGen1: TypeGen1[M, T1]
      ) extends NatNext4Self.Impl1.Support1[
        M,
        T1,
        ZeroLike
      ](
        current = simpleAppender1.zero[ZeroLike](NatNext4Self.zeroInstance),
        simpleAppender1 = simpleAppender1,
        typeGen1 = typeGen1
      )
    

      class Support2[
        M[_,_],
        T1[_],T2[_]
      ](
        simpleAppender2: SimpleAppender2[M],
        typeGen2: TypeGen2[M, T1,T2]
      ) extends NatNext4Self.Impl1.Support2[
        M,
        T1,T2,
        ZeroLike,ZeroLike
      ](
        current = simpleAppender2.zero[ZeroLike,ZeroLike](NatNext4Self.zeroInstance,NatNext4Self.zeroInstance),
        simpleAppender2 = simpleAppender2,
        typeGen2 = typeGen2
      )
    

      class Support3[
        M[_,_,_],
        T1[_],T2[_],T3[_]
      ](
        simpleAppender3: SimpleAppender3[M],
        typeGen3: TypeGen3[M, T1,T2,T3]
      ) extends NatNext4Self.Impl1.Support3[
        M,
        T1,T2,T3,
        ZeroLike,ZeroLike,ZeroLike
      ](
        current = simpleAppender3.zero[ZeroLike,ZeroLike,ZeroLike](NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance),
        simpleAppender3 = simpleAppender3,
        typeGen3 = typeGen3
      )
    

      class Support4[
        M[_,_,_,_],
        T1[_],T2[_],T3[_],T4[_]
      ](
        simpleAppender4: SimpleAppender4[M],
        typeGen4: TypeGen4[M, T1,T2,T3,T4]
      ) extends NatNext4Self.Impl1.Support4[
        M,
        T1,T2,T3,T4,
        ZeroLike,ZeroLike,ZeroLike,ZeroLike
      ](
        current = simpleAppender4.zero[ZeroLike,ZeroLike,ZeroLike,ZeroLike](NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance),
        simpleAppender4 = simpleAppender4,
        typeGen4 = typeGen4
      )
    

      class Support5[
        M[_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_]
      ](
        simpleAppender5: SimpleAppender5[M],
        typeGen5: TypeGen5[M, T1,T2,T3,T4,T5]
      ) extends NatNext4Self.Impl1.Support5[
        M,
        T1,T2,T3,T4,T5,
        ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike
      ](
        current = simpleAppender5.zero[ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike](NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance),
        simpleAppender5 = simpleAppender5,
        typeGen5 = typeGen5
      )
    

      class Support6[
        M[_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_]
      ](
        simpleAppender6: SimpleAppender6[M],
        typeGen6: TypeGen6[M, T1,T2,T3,T4,T5,T6]
      ) extends NatNext4Self.Impl1.Support6[
        M,
        T1,T2,T3,T4,T5,T6,
        ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike
      ](
        current = simpleAppender6.zero[ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike](NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance),
        simpleAppender6 = simpleAppender6,
        typeGen6 = typeGen6
      )
    

      class Support7[
        M[_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_]
      ](
        simpleAppender7: SimpleAppender7[M],
        typeGen7: TypeGen7[M, T1,T2,T3,T4,T5,T6,T7]
      ) extends NatNext4Self.Impl1.Support7[
        M,
        T1,T2,T3,T4,T5,T6,T7,
        ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike
      ](
        current = simpleAppender7.zero[ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike](NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance),
        simpleAppender7 = simpleAppender7,
        typeGen7 = typeGen7
      )
    

      class Support8[
        M[_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_]
      ](
        simpleAppender8: SimpleAppender8[M],
        typeGen8: TypeGen8[M, T1,T2,T3,T4,T5,T6,T7,T8]
      ) extends NatNext4Self.Impl1.Support8[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,
        ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike
      ](
        current = simpleAppender8.zero[ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike](NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance),
        simpleAppender8 = simpleAppender8,
        typeGen8 = typeGen8
      )
    

      class Support9[
        M[_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_]
      ](
        simpleAppender9: SimpleAppender9[M],
        typeGen9: TypeGen9[M, T1,T2,T3,T4,T5,T6,T7,T8,T9]
      ) extends NatNext4Self.Impl1.Support9[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,
        ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike
      ](
        current = simpleAppender9.zero[ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike](NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance),
        simpleAppender9 = simpleAppender9,
        typeGen9 = typeGen9
      )
    

      class Support10[
        M[_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_]
      ](
        simpleAppender10: SimpleAppender10[M],
        typeGen10: TypeGen10[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]
      ) extends NatNext4Self.Impl1.Support10[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,
        ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike
      ](
        current = simpleAppender10.zero[ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike](NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance),
        simpleAppender10 = simpleAppender10,
        typeGen10 = typeGen10
      )
    

      class Support11[
        M[_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_]
      ](
        simpleAppender11: SimpleAppender11[M],
        typeGen11: TypeGen11[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]
      ) extends NatNext4Self.Impl1.Support11[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,
        ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike
      ](
        current = simpleAppender11.zero[ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike](NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance),
        simpleAppender11 = simpleAppender11,
        typeGen11 = typeGen11
      )
    

      class Support12[
        M[_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_]
      ](
        simpleAppender12: SimpleAppender12[M],
        typeGen12: TypeGen12[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]
      ) extends NatNext4Self.Impl1.Support12[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,
        ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike
      ](
        current = simpleAppender12.zero[ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike](NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance),
        simpleAppender12 = simpleAppender12,
        typeGen12 = typeGen12
      )
    

      class Support13[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_]
      ](
        simpleAppender13: SimpleAppender13[M],
        typeGen13: TypeGen13[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]
      ) extends NatNext4Self.Impl1.Support13[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,
        ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike
      ](
        current = simpleAppender13.zero[ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike](NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance),
        simpleAppender13 = simpleAppender13,
        typeGen13 = typeGen13
      )
    

      class Support14[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_]
      ](
        simpleAppender14: SimpleAppender14[M],
        typeGen14: TypeGen14[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]
      ) extends NatNext4Self.Impl1.Support14[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,
        ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike
      ](
        current = simpleAppender14.zero[ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike](NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance),
        simpleAppender14 = simpleAppender14,
        typeGen14 = typeGen14
      )
    

      class Support15[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_]
      ](
        simpleAppender15: SimpleAppender15[M],
        typeGen15: TypeGen15[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
      ) extends NatNext4Self.Impl1.Support15[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,
        ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike
      ](
        current = simpleAppender15.zero[ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike](NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance),
        simpleAppender15 = simpleAppender15,
        typeGen15 = typeGen15
      )
    

      class Support16[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_]
      ](
        simpleAppender16: SimpleAppender16[M],
        typeGen16: TypeGen16[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
      ) extends NatNext4Self.Impl1.Support16[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,
        ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike
      ](
        current = simpleAppender16.zero[ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike](NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance),
        simpleAppender16 = simpleAppender16,
        typeGen16 = typeGen16
      )
    

      class Support17[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_]
      ](
        simpleAppender17: SimpleAppender17[M],
        typeGen17: TypeGen17[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
      ) extends NatNext4Self.Impl1.Support17[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,
        ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike
      ](
        current = simpleAppender17.zero[ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike](NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance),
        simpleAppender17 = simpleAppender17,
        typeGen17 = typeGen17
      )
    

      class Support18[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],T18[_]
      ](
        simpleAppender18: SimpleAppender18[M],
        typeGen18: TypeGen18[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
      ) extends NatNext4Self.Impl1.Support18[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,
        ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike
      ](
        current = simpleAppender18.zero[ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike](NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance),
        simpleAppender18 = simpleAppender18,
        typeGen18 = typeGen18
      )
    

      class Support19[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],T18[_],T19[_]
      ](
        simpleAppender19: SimpleAppender19[M],
        typeGen19: TypeGen19[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
      ) extends NatNext4Self.Impl1.Support19[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,
        ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike
      ](
        current = simpleAppender19.zero[ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike](NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance),
        simpleAppender19 = simpleAppender19,
        typeGen19 = typeGen19
      )
    

      class Support20[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],T18[_],T19[_],T20[_]
      ](
        simpleAppender20: SimpleAppender20[M],
        typeGen20: TypeGen20[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
      ) extends NatNext4Self.Impl1.Support20[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,
        ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike
      ](
        current = simpleAppender20.zero[ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike](NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance),
        simpleAppender20 = simpleAppender20,
        typeGen20 = typeGen20
      )
    

      class Support21[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        T1[_],T2[_],T3[_],T4[_],T5[_],T6[_],T7[_],T8[_],T9[_],T10[_],T11[_],T12[_],T13[_],T14[_],T15[_],T16[_],T17[_],T18[_],T19[_],T20[_],T21[_]
      ](
        simpleAppender21: SimpleAppender21[M],
        typeGen21: TypeGen21[M, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
      ) extends NatNext4Self.Impl1.Support21[
        M,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,
        ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike
      ](
        current = simpleAppender21.zero[ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike,ZeroLike](NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance,NatNext4Self.zeroInstance),
        simpleAppender21 = simpleAppender21,
        typeGen21 = typeGen21
      )
    
      }
    }
  