
    package net.scalax.simple.adt
    package instance
    package support
    package round

    object Impl2 {

      object CoProduct1 { CoProductSelf =>
        @inline def fold[Target, T1](ins: Impl1.CoProduct1[T1], param1: T1 => Target): Target =
          ins._foldCoProduct[Target](param1, s1 => CoProductSelf.fold[Target, T1](s1, param1))
      }

      
      object CoProduct2 { CoProductSelf =>
        @inline def fold[Target, T1,T2](
          ins: Impl1.CoProduct2[T1,T2],
          param1: T1 => Target,param2: T2 => Target
        ): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => CoProductSelf.fold[Target, T1,T2](s2, param1,param2)))
      }
    

      object CoProduct3 { CoProductSelf =>
        @inline def fold[Target, T1,T2,T3](
          ins: Impl1.CoProduct3[T1,T2,T3],
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target
        ): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => CoProductSelf.fold[Target, T1,T2,T3](s3, param1,param2,param3))))
      }
    

      object CoProduct4 { CoProductSelf =>
        @inline def fold[Target, T1,T2,T3,T4](
          ins: Impl1.CoProduct4[T1,T2,T3,T4],
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target
        ): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => CoProductSelf.fold[Target, T1,T2,T3,T4](s4, param1,param2,param3,param4)))))
      }
    

      object CoProduct5 { CoProductSelf =>
        @inline def fold[Target, T1,T2,T3,T4,T5](
          ins: Impl1.CoProduct5[T1,T2,T3,T4,T5],
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target
        ): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => CoProductSelf.fold[Target, T1,T2,T3,T4,T5](s5, param1,param2,param3,param4,param5))))))
      }
    

      object CoProduct6 { CoProductSelf =>
        @inline def fold[Target, T1,T2,T3,T4,T5,T6](
          ins: Impl1.CoProduct6[T1,T2,T3,T4,T5,T6],
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target
        ): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => CoProductSelf.fold[Target, T1,T2,T3,T4,T5,T6](s6, param1,param2,param3,param4,param5,param6)))))))
      }
    

      object CoProduct7 { CoProductSelf =>
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7](
          ins: Impl1.CoProduct7[T1,T2,T3,T4,T5,T6,T7],
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target
        ): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => CoProductSelf.fold[Target, T1,T2,T3,T4,T5,T6,T7](s7, param1,param2,param3,param4,param5,param6,param7))))))))
      }
    

      object CoProduct8 { CoProductSelf =>
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8](
          ins: Impl1.CoProduct8[T1,T2,T3,T4,T5,T6,T7,T8],
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target
        ): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => CoProductSelf.fold[Target, T1,T2,T3,T4,T5,T6,T7,T8](s8, param1,param2,param3,param4,param5,param6,param7,param8)))))))))
      }
    

      object CoProduct9 { CoProductSelf =>
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9](
          ins: Impl1.CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T9],
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target
        ): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => CoProductSelf.fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9](s9, param1,param2,param3,param4,param5,param6,param7,param8,param9))))))))))
      }
    

      object CoProduct10 { CoProductSelf =>
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](
          ins: Impl1.CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10],
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target
        ): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => CoProductSelf.fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](s10, param1,param2,param3,param4,param5,param6,param7,param8,param9,param10)))))))))))
      }
    

      object CoProduct11 { CoProductSelf =>
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](
          ins: Impl1.CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11],
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target
        ): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => CoProductSelf.fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](s11, param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11))))))))))))
      }
    

      object CoProduct12 { CoProductSelf =>
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](
          ins: Impl1.CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12],
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target
        ): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => CoProductSelf.fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](s12, param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12)))))))))))))
      }
    

      object CoProduct13 { CoProductSelf =>
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](
          ins: Impl1.CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13],
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target
        ): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => CoProductSelf.fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](s13, param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13))))))))))))))
      }
    

      object CoProduct14 { CoProductSelf =>
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](
          ins: Impl1.CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14],
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target
        ): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => CoProductSelf.fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](s14, param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14)))))))))))))))
      }
    

      object CoProduct15 { CoProductSelf =>
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](
          ins: Impl1.CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15],
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target
        ): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => CoProductSelf.fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](s15, param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15))))))))))))))))
      }
    

      object CoProduct16 { CoProductSelf =>
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](
          ins: Impl1.CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16],
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target,param16: T16 => Target
        ): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => s15._foldCoProduct[Target](param16, s16 => CoProductSelf.fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](s16, param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16)))))))))))))))))
      }
    

      object CoProduct17 { CoProductSelf =>
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](
          ins: Impl1.CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17],
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target,param16: T16 => Target,param17: T17 => Target
        ): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => s15._foldCoProduct[Target](param16, s16 => s16._foldCoProduct[Target](param17, s17 => CoProductSelf.fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](s17, param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17))))))))))))))))))
      }
    

      object CoProduct18 { CoProductSelf =>
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](
          ins: Impl1.CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18],
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target,param16: T16 => Target,param17: T17 => Target,param18: T18 => Target
        ): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => s15._foldCoProduct[Target](param16, s16 => s16._foldCoProduct[Target](param17, s17 => s17._foldCoProduct[Target](param18, s18 => CoProductSelf.fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](s18, param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17,param18)))))))))))))))))))
      }
    

      object CoProduct19 { CoProductSelf =>
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](
          ins: Impl1.CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19],
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target,param16: T16 => Target,param17: T17 => Target,param18: T18 => Target,param19: T19 => Target
        ): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => s15._foldCoProduct[Target](param16, s16 => s16._foldCoProduct[Target](param17, s17 => s17._foldCoProduct[Target](param18, s18 => s18._foldCoProduct[Target](param19, s19 => CoProductSelf.fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](s19, param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17,param18,param19))))))))))))))))))))
      }
    

      object CoProduct20 { CoProductSelf =>
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](
          ins: Impl1.CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20],
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target,param16: T16 => Target,param17: T17 => Target,param18: T18 => Target,param19: T19 => Target,param20: T20 => Target
        ): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => s15._foldCoProduct[Target](param16, s16 => s16._foldCoProduct[Target](param17, s17 => s17._foldCoProduct[Target](param18, s18 => s18._foldCoProduct[Target](param19, s19 => s19._foldCoProduct[Target](param20, s20 => CoProductSelf.fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](s20, param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17,param18,param19,param20)))))))))))))))))))))
      }
    

      object CoProduct21 { CoProductSelf =>
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
          ins: Impl1.CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21],
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target,param16: T16 => Target,param17: T17 => Target,param18: T18 => Target,param19: T19 => Target,param20: T20 => Target,param21: T21 => Target
        ): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => s15._foldCoProduct[Target](param16, s16 => s16._foldCoProduct[Target](param17, s17 => s17._foldCoProduct[Target](param18, s18 => s18._foldCoProduct[Target](param19, s19 => s19._foldCoProduct[Target](param20, s20 => s20._foldCoProduct[Target](param21, s21 => CoProductSelf.fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](s21, param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17,param18,param19,param20,param21))))))))))))))))))))))
      }
    

      object CoProduct22 { CoProductSelf =>
        @inline def fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
          ins: Impl1.CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22],
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target,param16: T16 => Target,param17: T17 => Target,param18: T18 => Target,param19: T19 => Target,param20: T20 => Target,param21: T21 => Target,param22: T22 => Target
        ): Target = ins._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => s15._foldCoProduct[Target](param16, s16 => s16._foldCoProduct[Target](param17, s17 => s17._foldCoProduct[Target](param18, s18 => s18._foldCoProduct[Target](param19, s19 => s19._foldCoProduct[Target](param20, s20 => s20._foldCoProduct[Target](param21, s21 => s21._foldCoProduct[Target](param22, s22 => CoProductSelf.fold[Target, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](s22, param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17,param18,param19,param20,param21,param22)))))))))))))))))))))))
      }
    
    }
  