
    package net.scalax.simple.adt
    package instance
    package support
    package round

    object Impl2 {

      object CoProduct1 {
        @inline def fold[Target, T1](param1: T1 => Target): Impl1.CoProduct1[T1] => Target =
          new Function1[Impl1.CoProduct1[T1], Target] { Function1Self =>
            override def apply(t: Impl1.CoProduct1[T1]): Target =
              t._foldCoProduct[Target](param1, t1 => Function1Self(t1))
          }
      }

      
      object CoProduct2 {
        @inline def fold[Target, T1,T2](
          param1: T1 => Target,param2: T2 => Target
        ): Impl1.CoProduct2[T1,T2] => Target =
          new Function1[Impl1.CoProduct2[T1,T2], Target] { Function1Self =>
            override def apply(ins: Impl1.CoProduct2[T1,T2]): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => Function1Self(s2)))
          }
      }
    

      object CoProduct3 {
        @inline def fold[Target, T1,T2,T3](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target
        ): Impl1.CoProduct3[T1,T2,T3] => Target =
          new Function1[Impl1.CoProduct3[T1,T2,T3], Target] { Function1Self =>
            override def apply(ins: Impl1.CoProduct3[T1,T2,T3]): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => Function1Self(s3))))
          }
      }
    

      object CoProduct4 {
        @inline def fold[Target, T1,T2,T3,T4](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target
        ): Impl1.CoProduct4[T1,T2,T3,T4] => Target =
          new Function1[Impl1.CoProduct4[T1,T2,T3,T4], Target] { Function1Self =>
            override def apply(ins: Impl1.CoProduct4[T1,T2,T3,T4]): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => Function1Self(s4)))))
          }
      }
    

      object CoProduct5 {
        @inline def fold[Target, T1,T2,T3,T4,T5](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target
        ): Impl1.CoProduct5[T1,T2,T3,T4,T5] => Target =
          new Function1[Impl1.CoProduct5[T1,T2,T3,T4,T5], Target] { Function1Self =>
            override def apply(ins: Impl1.CoProduct5[T1,T2,T3,T4,T5]): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => Function1Self(s5))))))
          }
      }
    

      object CoProduct6 {
        @inline def fold[Target, T1,T2,T3,T4,T5,T6](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target
        ): Impl1.CoProduct6[T1,T2,T3,T4,T5,T6] => Target =
          new Function1[Impl1.CoProduct6[T1,T2,T3,T4,T5,T6], Target] { Function1Self =>
            override def apply(ins: Impl1.CoProduct6[T1,T2,T3,T4,T5,T6]): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => Function1Self(s6)))))))
          }
      }
    

      object CoProduct7 {
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target
        ): Impl1.CoProduct7[T1,T2,T3,T4,T5,T6,T7] => Target =
          new Function1[Impl1.CoProduct7[T1,T2,T3,T4,T5,T6,T7], Target] { Function1Self =>
            override def apply(ins: Impl1.CoProduct7[T1,T2,T3,T4,T5,T6,T7]): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => Function1Self(s7))))))))
          }
      }
    

      object CoProduct8 {
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target
        ): Impl1.CoProduct8[T1,T2,T3,T4,T5,T6,T7,T8] => Target =
          new Function1[Impl1.CoProduct8[T1,T2,T3,T4,T5,T6,T7,T8], Target] { Function1Self =>
            override def apply(ins: Impl1.CoProduct8[T1,T2,T3,T4,T5,T6,T7,T8]): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => Function1Self(s8)))))))))
          }
      }
    

      object CoProduct9 {
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target
        ): Impl1.CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T9] => Target =
          new Function1[Impl1.CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T9], Target] { Function1Self =>
            override def apply(ins: Impl1.CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T9]): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => Function1Self(s9))))))))))
          }
      }
    

      object CoProduct10 {
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target
        ): Impl1.CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] => Target =
          new Function1[Impl1.CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10], Target] { Function1Self =>
            override def apply(ins: Impl1.CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => Function1Self(s10)))))))))))
          }
      }
    

      object CoProduct11 {
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target
        ): Impl1.CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] => Target =
          new Function1[Impl1.CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11], Target] { Function1Self =>
            override def apply(ins: Impl1.CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => Function1Self(s11))))))))))))
          }
      }
    

      object CoProduct12 {
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target
        ): Impl1.CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] => Target =
          new Function1[Impl1.CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12], Target] { Function1Self =>
            override def apply(ins: Impl1.CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => Function1Self(s12)))))))))))))
          }
      }
    

      object CoProduct13 {
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target
        ): Impl1.CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] => Target =
          new Function1[Impl1.CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13], Target] { Function1Self =>
            override def apply(ins: Impl1.CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => Function1Self(s13))))))))))))))
          }
      }
    

      object CoProduct14 {
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target
        ): Impl1.CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] => Target =
          new Function1[Impl1.CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14], Target] { Function1Self =>
            override def apply(ins: Impl1.CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => Function1Self(s14)))))))))))))))
          }
      }
    

      object CoProduct15 {
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target
        ): Impl1.CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] => Target =
          new Function1[Impl1.CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15], Target] { Function1Self =>
            override def apply(ins: Impl1.CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => Function1Self(s15))))))))))))))))
          }
      }
    

      object CoProduct16 {
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target,param16: T16 => Target
        ): Impl1.CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] => Target =
          new Function1[Impl1.CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16], Target] { Function1Self =>
            override def apply(ins: Impl1.CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => s15._foldCoProduct[Target](param16, s16 => Function1Self(s16)))))))))))))))))
          }
      }
    

      object CoProduct17 {
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target,param16: T16 => Target,param17: T17 => Target
        ): Impl1.CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] => Target =
          new Function1[Impl1.CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17], Target] { Function1Self =>
            override def apply(ins: Impl1.CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => s15._foldCoProduct[Target](param16, s16 => s16._foldCoProduct[Target](param17, s17 => Function1Self(s17))))))))))))))))))
          }
      }
    

      object CoProduct18 {
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target,param16: T16 => Target,param17: T17 => Target,param18: T18 => Target
        ): Impl1.CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] => Target =
          new Function1[Impl1.CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18], Target] { Function1Self =>
            override def apply(ins: Impl1.CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => s15._foldCoProduct[Target](param16, s16 => s16._foldCoProduct[Target](param17, s17 => s17._foldCoProduct[Target](param18, s18 => Function1Self(s18)))))))))))))))))))
          }
      }
    

      object CoProduct19 {
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target,param16: T16 => Target,param17: T17 => Target,param18: T18 => Target,param19: T19 => Target
        ): Impl1.CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] => Target =
          new Function1[Impl1.CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19], Target] { Function1Self =>
            override def apply(ins: Impl1.CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => s15._foldCoProduct[Target](param16, s16 => s16._foldCoProduct[Target](param17, s17 => s17._foldCoProduct[Target](param18, s18 => s18._foldCoProduct[Target](param19, s19 => Function1Self(s19))))))))))))))))))))
          }
      }
    

      object CoProduct20 {
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target,param16: T16 => Target,param17: T17 => Target,param18: T18 => Target,param19: T19 => Target,param20: T20 => Target
        ): Impl1.CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] => Target =
          new Function1[Impl1.CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20], Target] { Function1Self =>
            override def apply(ins: Impl1.CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => s15._foldCoProduct[Target](param16, s16 => s16._foldCoProduct[Target](param17, s17 => s17._foldCoProduct[Target](param18, s18 => s18._foldCoProduct[Target](param19, s19 => s19._foldCoProduct[Target](param20, s20 => Function1Self(s20)))))))))))))))))))))
          }
      }
    

      object CoProduct21 {
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target,param16: T16 => Target,param17: T17 => Target,param18: T18 => Target,param19: T19 => Target,param20: T20 => Target,param21: T21 => Target
        ): Impl1.CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] => Target =
          new Function1[Impl1.CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21], Target] { Function1Self =>
            override def apply(ins: Impl1.CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => s15._foldCoProduct[Target](param16, s16 => s16._foldCoProduct[Target](param17, s17 => s17._foldCoProduct[Target](param18, s18 => s18._foldCoProduct[Target](param19, s19 => s19._foldCoProduct[Target](param20, s20 => s20._foldCoProduct[Target](param21, s21 => Function1Self(s21))))))))))))))))))))))
          }
      }
    

      object CoProduct22 {
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target,param16: T16 => Target,param17: T17 => Target,param18: T18 => Target,param19: T19 => Target,param20: T20 => Target,param21: T21 => Target,param22: T22 => Target
        ): Impl1.CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] => Target =
          new Function1[Impl1.CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22], Target] { Function1Self =>
            override def apply(ins: Impl1.CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => s15._foldCoProduct[Target](param16, s16 => s16._foldCoProduct[Target](param17, s17 => s17._foldCoProduct[Target](param18, s18 => s18._foldCoProduct[Target](param19, s19 => s19._foldCoProduct[Target](param20, s20 => s20._foldCoProduct[Target](param21, s21 => s21._foldCoProduct[Target](param22, s22 => Function1Self(s22)))))))))))))))))))))))
          }
      }
    
    }
  