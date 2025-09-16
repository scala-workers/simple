
    package net.scalax.simple.adt
    package instance
    package support

    trait CoProduct0[Target0] {
      FoldApplySelf =>
      def value: Target0
    }

    import net.scalax.simple.adt.instance.support.{CoProduct0 => ADTFoldApplyImpl0}

    
      trait ADTFoldApplyImpl1[
        Target0,
        T1
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0](param1: T1 => Target1): Target1 = FoldApplySelf.apply(param1).value

        def apply[TargetOther0 >: Target0](param1: T1 => TargetOther0): ADTFoldApplyImpl0[TargetOther0] = 
        new ADTFoldApplyImpl0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1)
        }
      
      }

      class CoProduct1[T1](val fold: ADTFoldApplyImpl1[Nothing, T1])
    

      trait ADTFoldApplyImpl2[
        Target0,
        T1,T2
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1](param1: T1 => Target1,param2: T2 => Target2): Target2 = FoldApplySelf.apply(param1).apply(param2).value

        def apply[TargetOther1 >: Target0](param1: T1 => TargetOther1): ADTFoldApplyImpl1[TargetOther1,T2] = 
        new ADTFoldApplyImpl1[TargetOther1,T2] {
          override def apply[TargetOther0 >: TargetOther1](param2: T2 => TargetOther0): ADTFoldApplyImpl0[TargetOther0] = 
        new ADTFoldApplyImpl0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2)
        }
      
        }
      
      }

      class CoProduct2[T1,T2](val fold: ADTFoldApplyImpl2[Nothing, T1,T2])
    

      trait ADTFoldApplyImpl3[
        Target0,
        T1,T2,T3
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3): Target3 = FoldApplySelf.apply(param1).apply(param2).apply(param3).value

        def apply[TargetOther2 >: Target0](param1: T1 => TargetOther2): ADTFoldApplyImpl2[TargetOther2,T2,T3] = 
        new ADTFoldApplyImpl2[TargetOther2,T2,T3] {
          override def apply[TargetOther1 >: TargetOther2](param2: T2 => TargetOther1): ADTFoldApplyImpl1[TargetOther1,T3] = 
        new ADTFoldApplyImpl1[TargetOther1,T3] {
          override def apply[TargetOther0 >: TargetOther1](param3: T3 => TargetOther0): ADTFoldApplyImpl0[TargetOther0] = 
        new ADTFoldApplyImpl0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3)
        }
      
        }
      
        }
      
      }

      class CoProduct3[T1,T2,T3](val fold: ADTFoldApplyImpl3[Nothing, T1,T2,T3])
    

      trait ADTFoldApplyImpl4[
        Target0,
        T1,T2,T3,T4
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4): Target4 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).value

        def apply[TargetOther3 >: Target0](param1: T1 => TargetOther3): ADTFoldApplyImpl3[TargetOther3,T2,T3,T4] = 
        new ADTFoldApplyImpl3[TargetOther3,T2,T3,T4] {
          override def apply[TargetOther2 >: TargetOther3](param2: T2 => TargetOther2): ADTFoldApplyImpl2[TargetOther2,T3,T4] = 
        new ADTFoldApplyImpl2[TargetOther2,T3,T4] {
          override def apply[TargetOther1 >: TargetOther2](param3: T3 => TargetOther1): ADTFoldApplyImpl1[TargetOther1,T4] = 
        new ADTFoldApplyImpl1[TargetOther1,T4] {
          override def apply[TargetOther0 >: TargetOther1](param4: T4 => TargetOther0): ADTFoldApplyImpl0[TargetOther0] = 
        new ADTFoldApplyImpl0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3,param4)
        }
      
        }
      
        }
      
        }
      
      }

      class CoProduct4[T1,T2,T3,T4](val fold: ADTFoldApplyImpl4[Nothing, T1,T2,T3,T4])
    

      trait ADTFoldApplyImpl5[
        Target0,
        T1,T2,T3,T4,T5
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5): Target5 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).value

        def apply[TargetOther4 >: Target0](param1: T1 => TargetOther4): ADTFoldApplyImpl4[TargetOther4,T2,T3,T4,T5] = 
        new ADTFoldApplyImpl4[TargetOther4,T2,T3,T4,T5] {
          override def apply[TargetOther3 >: TargetOther4](param2: T2 => TargetOther3): ADTFoldApplyImpl3[TargetOther3,T3,T4,T5] = 
        new ADTFoldApplyImpl3[TargetOther3,T3,T4,T5] {
          override def apply[TargetOther2 >: TargetOther3](param3: T3 => TargetOther2): ADTFoldApplyImpl2[TargetOther2,T4,T5] = 
        new ADTFoldApplyImpl2[TargetOther2,T4,T5] {
          override def apply[TargetOther1 >: TargetOther2](param4: T4 => TargetOther1): ADTFoldApplyImpl1[TargetOther1,T5] = 
        new ADTFoldApplyImpl1[TargetOther1,T5] {
          override def apply[TargetOther0 >: TargetOther1](param5: T5 => TargetOther0): ADTFoldApplyImpl0[TargetOther0] = 
        new ADTFoldApplyImpl0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3,param4,param5)
        }
      
        }
      
        }
      
        }
      
        }
      
      }

      class CoProduct5[T1,T2,T3,T4,T5](val fold: ADTFoldApplyImpl5[Nothing, T1,T2,T3,T4,T5])
    

      trait ADTFoldApplyImpl6[
        Target0,
        T1,T2,T3,T4,T5,T6
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6): Target6 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).value

        def apply[TargetOther5 >: Target0](param1: T1 => TargetOther5): ADTFoldApplyImpl5[TargetOther5,T2,T3,T4,T5,T6] = 
        new ADTFoldApplyImpl5[TargetOther5,T2,T3,T4,T5,T6] {
          override def apply[TargetOther4 >: TargetOther5](param2: T2 => TargetOther4): ADTFoldApplyImpl4[TargetOther4,T3,T4,T5,T6] = 
        new ADTFoldApplyImpl4[TargetOther4,T3,T4,T5,T6] {
          override def apply[TargetOther3 >: TargetOther4](param3: T3 => TargetOther3): ADTFoldApplyImpl3[TargetOther3,T4,T5,T6] = 
        new ADTFoldApplyImpl3[TargetOther3,T4,T5,T6] {
          override def apply[TargetOther2 >: TargetOther3](param4: T4 => TargetOther2): ADTFoldApplyImpl2[TargetOther2,T5,T6] = 
        new ADTFoldApplyImpl2[TargetOther2,T5,T6] {
          override def apply[TargetOther1 >: TargetOther2](param5: T5 => TargetOther1): ADTFoldApplyImpl1[TargetOther1,T6] = 
        new ADTFoldApplyImpl1[TargetOther1,T6] {
          override def apply[TargetOther0 >: TargetOther1](param6: T6 => TargetOther0): ADTFoldApplyImpl0[TargetOther0] = 
        new ADTFoldApplyImpl0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3,param4,param5,param6)
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
      }

      class CoProduct6[T1,T2,T3,T4,T5,T6](val fold: ADTFoldApplyImpl6[Nothing, T1,T2,T3,T4,T5,T6])
    

      trait ADTFoldApplyImpl7[
        Target0,
        T1,T2,T3,T4,T5,T6,T7
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7): Target7 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).value

        def apply[TargetOther6 >: Target0](param1: T1 => TargetOther6): ADTFoldApplyImpl6[TargetOther6,T2,T3,T4,T5,T6,T7] = 
        new ADTFoldApplyImpl6[TargetOther6,T2,T3,T4,T5,T6,T7] {
          override def apply[TargetOther5 >: TargetOther6](param2: T2 => TargetOther5): ADTFoldApplyImpl5[TargetOther5,T3,T4,T5,T6,T7] = 
        new ADTFoldApplyImpl5[TargetOther5,T3,T4,T5,T6,T7] {
          override def apply[TargetOther4 >: TargetOther5](param3: T3 => TargetOther4): ADTFoldApplyImpl4[TargetOther4,T4,T5,T6,T7] = 
        new ADTFoldApplyImpl4[TargetOther4,T4,T5,T6,T7] {
          override def apply[TargetOther3 >: TargetOther4](param4: T4 => TargetOther3): ADTFoldApplyImpl3[TargetOther3,T5,T6,T7] = 
        new ADTFoldApplyImpl3[TargetOther3,T5,T6,T7] {
          override def apply[TargetOther2 >: TargetOther3](param5: T5 => TargetOther2): ADTFoldApplyImpl2[TargetOther2,T6,T7] = 
        new ADTFoldApplyImpl2[TargetOther2,T6,T7] {
          override def apply[TargetOther1 >: TargetOther2](param6: T6 => TargetOther1): ADTFoldApplyImpl1[TargetOther1,T7] = 
        new ADTFoldApplyImpl1[TargetOther1,T7] {
          override def apply[TargetOther0 >: TargetOther1](param7: T7 => TargetOther0): ADTFoldApplyImpl0[TargetOther0] = 
        new ADTFoldApplyImpl0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3,param4,param5,param6,param7)
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
      }

      class CoProduct7[T1,T2,T3,T4,T5,T6,T7](val fold: ADTFoldApplyImpl7[Nothing, T1,T2,T3,T4,T5,T6,T7])
    

      trait ADTFoldApplyImpl8[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8): Target8 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).value

        def apply[TargetOther7 >: Target0](param1: T1 => TargetOther7): ADTFoldApplyImpl7[TargetOther7,T2,T3,T4,T5,T6,T7,T8] = 
        new ADTFoldApplyImpl7[TargetOther7,T2,T3,T4,T5,T6,T7,T8] {
          override def apply[TargetOther6 >: TargetOther7](param2: T2 => TargetOther6): ADTFoldApplyImpl6[TargetOther6,T3,T4,T5,T6,T7,T8] = 
        new ADTFoldApplyImpl6[TargetOther6,T3,T4,T5,T6,T7,T8] {
          override def apply[TargetOther5 >: TargetOther6](param3: T3 => TargetOther5): ADTFoldApplyImpl5[TargetOther5,T4,T5,T6,T7,T8] = 
        new ADTFoldApplyImpl5[TargetOther5,T4,T5,T6,T7,T8] {
          override def apply[TargetOther4 >: TargetOther5](param4: T4 => TargetOther4): ADTFoldApplyImpl4[TargetOther4,T5,T6,T7,T8] = 
        new ADTFoldApplyImpl4[TargetOther4,T5,T6,T7,T8] {
          override def apply[TargetOther3 >: TargetOther4](param5: T5 => TargetOther3): ADTFoldApplyImpl3[TargetOther3,T6,T7,T8] = 
        new ADTFoldApplyImpl3[TargetOther3,T6,T7,T8] {
          override def apply[TargetOther2 >: TargetOther3](param6: T6 => TargetOther2): ADTFoldApplyImpl2[TargetOther2,T7,T8] = 
        new ADTFoldApplyImpl2[TargetOther2,T7,T8] {
          override def apply[TargetOther1 >: TargetOther2](param7: T7 => TargetOther1): ADTFoldApplyImpl1[TargetOther1,T8] = 
        new ADTFoldApplyImpl1[TargetOther1,T8] {
          override def apply[TargetOther0 >: TargetOther1](param8: T8 => TargetOther0): ADTFoldApplyImpl0[TargetOther0] = 
        new ADTFoldApplyImpl0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3,param4,param5,param6,param7,param8)
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
      }

      class CoProduct8[T1,T2,T3,T4,T5,T6,T7,T8](val fold: ADTFoldApplyImpl8[Nothing, T1,T2,T3,T4,T5,T6,T7,T8])
    

      trait ADTFoldApplyImpl9[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9): Target9 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).value

        def apply[TargetOther8 >: Target0](param1: T1 => TargetOther8): ADTFoldApplyImpl8[TargetOther8,T2,T3,T4,T5,T6,T7,T8,T9] = 
        new ADTFoldApplyImpl8[TargetOther8,T2,T3,T4,T5,T6,T7,T8,T9] {
          override def apply[TargetOther7 >: TargetOther8](param2: T2 => TargetOther7): ADTFoldApplyImpl7[TargetOther7,T3,T4,T5,T6,T7,T8,T9] = 
        new ADTFoldApplyImpl7[TargetOther7,T3,T4,T5,T6,T7,T8,T9] {
          override def apply[TargetOther6 >: TargetOther7](param3: T3 => TargetOther6): ADTFoldApplyImpl6[TargetOther6,T4,T5,T6,T7,T8,T9] = 
        new ADTFoldApplyImpl6[TargetOther6,T4,T5,T6,T7,T8,T9] {
          override def apply[TargetOther5 >: TargetOther6](param4: T4 => TargetOther5): ADTFoldApplyImpl5[TargetOther5,T5,T6,T7,T8,T9] = 
        new ADTFoldApplyImpl5[TargetOther5,T5,T6,T7,T8,T9] {
          override def apply[TargetOther4 >: TargetOther5](param5: T5 => TargetOther4): ADTFoldApplyImpl4[TargetOther4,T6,T7,T8,T9] = 
        new ADTFoldApplyImpl4[TargetOther4,T6,T7,T8,T9] {
          override def apply[TargetOther3 >: TargetOther4](param6: T6 => TargetOther3): ADTFoldApplyImpl3[TargetOther3,T7,T8,T9] = 
        new ADTFoldApplyImpl3[TargetOther3,T7,T8,T9] {
          override def apply[TargetOther2 >: TargetOther3](param7: T7 => TargetOther2): ADTFoldApplyImpl2[TargetOther2,T8,T9] = 
        new ADTFoldApplyImpl2[TargetOther2,T8,T9] {
          override def apply[TargetOther1 >: TargetOther2](param8: T8 => TargetOther1): ADTFoldApplyImpl1[TargetOther1,T9] = 
        new ADTFoldApplyImpl1[TargetOther1,T9] {
          override def apply[TargetOther0 >: TargetOther1](param9: T9 => TargetOther0): ADTFoldApplyImpl0[TargetOther0] = 
        new ADTFoldApplyImpl0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3,param4,param5,param6,param7,param8,param9)
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
      }

      class CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T9](val fold: ADTFoldApplyImpl9[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9])
    

      trait ADTFoldApplyImpl10[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10): Target10 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).value

        def apply[TargetOther9 >: Target0](param1: T1 => TargetOther9): ADTFoldApplyImpl9[TargetOther9,T2,T3,T4,T5,T6,T7,T8,T9,T10] = 
        new ADTFoldApplyImpl9[TargetOther9,T2,T3,T4,T5,T6,T7,T8,T9,T10] {
          override def apply[TargetOther8 >: TargetOther9](param2: T2 => TargetOther8): ADTFoldApplyImpl8[TargetOther8,T3,T4,T5,T6,T7,T8,T9,T10] = 
        new ADTFoldApplyImpl8[TargetOther8,T3,T4,T5,T6,T7,T8,T9,T10] {
          override def apply[TargetOther7 >: TargetOther8](param3: T3 => TargetOther7): ADTFoldApplyImpl7[TargetOther7,T4,T5,T6,T7,T8,T9,T10] = 
        new ADTFoldApplyImpl7[TargetOther7,T4,T5,T6,T7,T8,T9,T10] {
          override def apply[TargetOther6 >: TargetOther7](param4: T4 => TargetOther6): ADTFoldApplyImpl6[TargetOther6,T5,T6,T7,T8,T9,T10] = 
        new ADTFoldApplyImpl6[TargetOther6,T5,T6,T7,T8,T9,T10] {
          override def apply[TargetOther5 >: TargetOther6](param5: T5 => TargetOther5): ADTFoldApplyImpl5[TargetOther5,T6,T7,T8,T9,T10] = 
        new ADTFoldApplyImpl5[TargetOther5,T6,T7,T8,T9,T10] {
          override def apply[TargetOther4 >: TargetOther5](param6: T6 => TargetOther4): ADTFoldApplyImpl4[TargetOther4,T7,T8,T9,T10] = 
        new ADTFoldApplyImpl4[TargetOther4,T7,T8,T9,T10] {
          override def apply[TargetOther3 >: TargetOther4](param7: T7 => TargetOther3): ADTFoldApplyImpl3[TargetOther3,T8,T9,T10] = 
        new ADTFoldApplyImpl3[TargetOther3,T8,T9,T10] {
          override def apply[TargetOther2 >: TargetOther3](param8: T8 => TargetOther2): ADTFoldApplyImpl2[TargetOther2,T9,T10] = 
        new ADTFoldApplyImpl2[TargetOther2,T9,T10] {
          override def apply[TargetOther1 >: TargetOther2](param9: T9 => TargetOther1): ADTFoldApplyImpl1[TargetOther1,T10] = 
        new ADTFoldApplyImpl1[TargetOther1,T10] {
          override def apply[TargetOther0 >: TargetOther1](param10: T10 => TargetOther0): ADTFoldApplyImpl0[TargetOther0] = 
        new ADTFoldApplyImpl0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3,param4,param5,param6,param7,param8,param9,param10)
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
      }

      class CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](val fold: ADTFoldApplyImpl10[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10])
    

      trait ADTFoldApplyImpl11[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11): Target11 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).value

        def apply[TargetOther10 >: Target0](param1: T1 => TargetOther10): ADTFoldApplyImpl10[TargetOther10,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] = 
        new ADTFoldApplyImpl10[TargetOther10,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] {
          override def apply[TargetOther9 >: TargetOther10](param2: T2 => TargetOther9): ADTFoldApplyImpl9[TargetOther9,T3,T4,T5,T6,T7,T8,T9,T10,T11] = 
        new ADTFoldApplyImpl9[TargetOther9,T3,T4,T5,T6,T7,T8,T9,T10,T11] {
          override def apply[TargetOther8 >: TargetOther9](param3: T3 => TargetOther8): ADTFoldApplyImpl8[TargetOther8,T4,T5,T6,T7,T8,T9,T10,T11] = 
        new ADTFoldApplyImpl8[TargetOther8,T4,T5,T6,T7,T8,T9,T10,T11] {
          override def apply[TargetOther7 >: TargetOther8](param4: T4 => TargetOther7): ADTFoldApplyImpl7[TargetOther7,T5,T6,T7,T8,T9,T10,T11] = 
        new ADTFoldApplyImpl7[TargetOther7,T5,T6,T7,T8,T9,T10,T11] {
          override def apply[TargetOther6 >: TargetOther7](param5: T5 => TargetOther6): ADTFoldApplyImpl6[TargetOther6,T6,T7,T8,T9,T10,T11] = 
        new ADTFoldApplyImpl6[TargetOther6,T6,T7,T8,T9,T10,T11] {
          override def apply[TargetOther5 >: TargetOther6](param6: T6 => TargetOther5): ADTFoldApplyImpl5[TargetOther5,T7,T8,T9,T10,T11] = 
        new ADTFoldApplyImpl5[TargetOther5,T7,T8,T9,T10,T11] {
          override def apply[TargetOther4 >: TargetOther5](param7: T7 => TargetOther4): ADTFoldApplyImpl4[TargetOther4,T8,T9,T10,T11] = 
        new ADTFoldApplyImpl4[TargetOther4,T8,T9,T10,T11] {
          override def apply[TargetOther3 >: TargetOther4](param8: T8 => TargetOther3): ADTFoldApplyImpl3[TargetOther3,T9,T10,T11] = 
        new ADTFoldApplyImpl3[TargetOther3,T9,T10,T11] {
          override def apply[TargetOther2 >: TargetOther3](param9: T9 => TargetOther2): ADTFoldApplyImpl2[TargetOther2,T10,T11] = 
        new ADTFoldApplyImpl2[TargetOther2,T10,T11] {
          override def apply[TargetOther1 >: TargetOther2](param10: T10 => TargetOther1): ADTFoldApplyImpl1[TargetOther1,T11] = 
        new ADTFoldApplyImpl1[TargetOther1,T11] {
          override def apply[TargetOther0 >: TargetOther1](param11: T11 => TargetOther0): ADTFoldApplyImpl0[TargetOther0] = 
        new ADTFoldApplyImpl0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11)
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
      }

      class CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](val fold: ADTFoldApplyImpl11[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11])
    

      trait ADTFoldApplyImpl12[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12): Target12 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).apply(param12).value

        def apply[TargetOther11 >: Target0](param1: T1 => TargetOther11): ADTFoldApplyImpl11[TargetOther11,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] = 
        new ADTFoldApplyImpl11[TargetOther11,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] {
          override def apply[TargetOther10 >: TargetOther11](param2: T2 => TargetOther10): ADTFoldApplyImpl10[TargetOther10,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] = 
        new ADTFoldApplyImpl10[TargetOther10,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] {
          override def apply[TargetOther9 >: TargetOther10](param3: T3 => TargetOther9): ADTFoldApplyImpl9[TargetOther9,T4,T5,T6,T7,T8,T9,T10,T11,T12] = 
        new ADTFoldApplyImpl9[TargetOther9,T4,T5,T6,T7,T8,T9,T10,T11,T12] {
          override def apply[TargetOther8 >: TargetOther9](param4: T4 => TargetOther8): ADTFoldApplyImpl8[TargetOther8,T5,T6,T7,T8,T9,T10,T11,T12] = 
        new ADTFoldApplyImpl8[TargetOther8,T5,T6,T7,T8,T9,T10,T11,T12] {
          override def apply[TargetOther7 >: TargetOther8](param5: T5 => TargetOther7): ADTFoldApplyImpl7[TargetOther7,T6,T7,T8,T9,T10,T11,T12] = 
        new ADTFoldApplyImpl7[TargetOther7,T6,T7,T8,T9,T10,T11,T12] {
          override def apply[TargetOther6 >: TargetOther7](param6: T6 => TargetOther6): ADTFoldApplyImpl6[TargetOther6,T7,T8,T9,T10,T11,T12] = 
        new ADTFoldApplyImpl6[TargetOther6,T7,T8,T9,T10,T11,T12] {
          override def apply[TargetOther5 >: TargetOther6](param7: T7 => TargetOther5): ADTFoldApplyImpl5[TargetOther5,T8,T9,T10,T11,T12] = 
        new ADTFoldApplyImpl5[TargetOther5,T8,T9,T10,T11,T12] {
          override def apply[TargetOther4 >: TargetOther5](param8: T8 => TargetOther4): ADTFoldApplyImpl4[TargetOther4,T9,T10,T11,T12] = 
        new ADTFoldApplyImpl4[TargetOther4,T9,T10,T11,T12] {
          override def apply[TargetOther3 >: TargetOther4](param9: T9 => TargetOther3): ADTFoldApplyImpl3[TargetOther3,T10,T11,T12] = 
        new ADTFoldApplyImpl3[TargetOther3,T10,T11,T12] {
          override def apply[TargetOther2 >: TargetOther3](param10: T10 => TargetOther2): ADTFoldApplyImpl2[TargetOther2,T11,T12] = 
        new ADTFoldApplyImpl2[TargetOther2,T11,T12] {
          override def apply[TargetOther1 >: TargetOther2](param11: T11 => TargetOther1): ADTFoldApplyImpl1[TargetOther1,T12] = 
        new ADTFoldApplyImpl1[TargetOther1,T12] {
          override def apply[TargetOther0 >: TargetOther1](param12: T12 => TargetOther0): ADTFoldApplyImpl0[TargetOther0] = 
        new ADTFoldApplyImpl0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12)
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
      }

      class CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](val fold: ADTFoldApplyImpl12[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12])
    

      trait ADTFoldApplyImpl13[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13): Target13 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).apply(param12).apply(param13).value

        def apply[TargetOther12 >: Target0](param1: T1 => TargetOther12): ADTFoldApplyImpl12[TargetOther12,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] = 
        new ADTFoldApplyImpl12[TargetOther12,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] {
          override def apply[TargetOther11 >: TargetOther12](param2: T2 => TargetOther11): ADTFoldApplyImpl11[TargetOther11,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] = 
        new ADTFoldApplyImpl11[TargetOther11,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] {
          override def apply[TargetOther10 >: TargetOther11](param3: T3 => TargetOther10): ADTFoldApplyImpl10[TargetOther10,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] = 
        new ADTFoldApplyImpl10[TargetOther10,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] {
          override def apply[TargetOther9 >: TargetOther10](param4: T4 => TargetOther9): ADTFoldApplyImpl9[TargetOther9,T5,T6,T7,T8,T9,T10,T11,T12,T13] = 
        new ADTFoldApplyImpl9[TargetOther9,T5,T6,T7,T8,T9,T10,T11,T12,T13] {
          override def apply[TargetOther8 >: TargetOther9](param5: T5 => TargetOther8): ADTFoldApplyImpl8[TargetOther8,T6,T7,T8,T9,T10,T11,T12,T13] = 
        new ADTFoldApplyImpl8[TargetOther8,T6,T7,T8,T9,T10,T11,T12,T13] {
          override def apply[TargetOther7 >: TargetOther8](param6: T6 => TargetOther7): ADTFoldApplyImpl7[TargetOther7,T7,T8,T9,T10,T11,T12,T13] = 
        new ADTFoldApplyImpl7[TargetOther7,T7,T8,T9,T10,T11,T12,T13] {
          override def apply[TargetOther6 >: TargetOther7](param7: T7 => TargetOther6): ADTFoldApplyImpl6[TargetOther6,T8,T9,T10,T11,T12,T13] = 
        new ADTFoldApplyImpl6[TargetOther6,T8,T9,T10,T11,T12,T13] {
          override def apply[TargetOther5 >: TargetOther6](param8: T8 => TargetOther5): ADTFoldApplyImpl5[TargetOther5,T9,T10,T11,T12,T13] = 
        new ADTFoldApplyImpl5[TargetOther5,T9,T10,T11,T12,T13] {
          override def apply[TargetOther4 >: TargetOther5](param9: T9 => TargetOther4): ADTFoldApplyImpl4[TargetOther4,T10,T11,T12,T13] = 
        new ADTFoldApplyImpl4[TargetOther4,T10,T11,T12,T13] {
          override def apply[TargetOther3 >: TargetOther4](param10: T10 => TargetOther3): ADTFoldApplyImpl3[TargetOther3,T11,T12,T13] = 
        new ADTFoldApplyImpl3[TargetOther3,T11,T12,T13] {
          override def apply[TargetOther2 >: TargetOther3](param11: T11 => TargetOther2): ADTFoldApplyImpl2[TargetOther2,T12,T13] = 
        new ADTFoldApplyImpl2[TargetOther2,T12,T13] {
          override def apply[TargetOther1 >: TargetOther2](param12: T12 => TargetOther1): ADTFoldApplyImpl1[TargetOther1,T13] = 
        new ADTFoldApplyImpl1[TargetOther1,T13] {
          override def apply[TargetOther0 >: TargetOther1](param13: T13 => TargetOther0): ADTFoldApplyImpl0[TargetOther0] = 
        new ADTFoldApplyImpl0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13)
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
      }

      class CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](val fold: ADTFoldApplyImpl13[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13])
    

      trait ADTFoldApplyImpl14[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14): Target14 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).apply(param12).apply(param13).apply(param14).value

        def apply[TargetOther13 >: Target0](param1: T1 => TargetOther13): ADTFoldApplyImpl13[TargetOther13,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] = 
        new ADTFoldApplyImpl13[TargetOther13,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] {
          override def apply[TargetOther12 >: TargetOther13](param2: T2 => TargetOther12): ADTFoldApplyImpl12[TargetOther12,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] = 
        new ADTFoldApplyImpl12[TargetOther12,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] {
          override def apply[TargetOther11 >: TargetOther12](param3: T3 => TargetOther11): ADTFoldApplyImpl11[TargetOther11,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] = 
        new ADTFoldApplyImpl11[TargetOther11,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] {
          override def apply[TargetOther10 >: TargetOther11](param4: T4 => TargetOther10): ADTFoldApplyImpl10[TargetOther10,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] = 
        new ADTFoldApplyImpl10[TargetOther10,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] {
          override def apply[TargetOther9 >: TargetOther10](param5: T5 => TargetOther9): ADTFoldApplyImpl9[TargetOther9,T6,T7,T8,T9,T10,T11,T12,T13,T14] = 
        new ADTFoldApplyImpl9[TargetOther9,T6,T7,T8,T9,T10,T11,T12,T13,T14] {
          override def apply[TargetOther8 >: TargetOther9](param6: T6 => TargetOther8): ADTFoldApplyImpl8[TargetOther8,T7,T8,T9,T10,T11,T12,T13,T14] = 
        new ADTFoldApplyImpl8[TargetOther8,T7,T8,T9,T10,T11,T12,T13,T14] {
          override def apply[TargetOther7 >: TargetOther8](param7: T7 => TargetOther7): ADTFoldApplyImpl7[TargetOther7,T8,T9,T10,T11,T12,T13,T14] = 
        new ADTFoldApplyImpl7[TargetOther7,T8,T9,T10,T11,T12,T13,T14] {
          override def apply[TargetOther6 >: TargetOther7](param8: T8 => TargetOther6): ADTFoldApplyImpl6[TargetOther6,T9,T10,T11,T12,T13,T14] = 
        new ADTFoldApplyImpl6[TargetOther6,T9,T10,T11,T12,T13,T14] {
          override def apply[TargetOther5 >: TargetOther6](param9: T9 => TargetOther5): ADTFoldApplyImpl5[TargetOther5,T10,T11,T12,T13,T14] = 
        new ADTFoldApplyImpl5[TargetOther5,T10,T11,T12,T13,T14] {
          override def apply[TargetOther4 >: TargetOther5](param10: T10 => TargetOther4): ADTFoldApplyImpl4[TargetOther4,T11,T12,T13,T14] = 
        new ADTFoldApplyImpl4[TargetOther4,T11,T12,T13,T14] {
          override def apply[TargetOther3 >: TargetOther4](param11: T11 => TargetOther3): ADTFoldApplyImpl3[TargetOther3,T12,T13,T14] = 
        new ADTFoldApplyImpl3[TargetOther3,T12,T13,T14] {
          override def apply[TargetOther2 >: TargetOther3](param12: T12 => TargetOther2): ADTFoldApplyImpl2[TargetOther2,T13,T14] = 
        new ADTFoldApplyImpl2[TargetOther2,T13,T14] {
          override def apply[TargetOther1 >: TargetOther2](param13: T13 => TargetOther1): ADTFoldApplyImpl1[TargetOther1,T14] = 
        new ADTFoldApplyImpl1[TargetOther1,T14] {
          override def apply[TargetOther0 >: TargetOther1](param14: T14 => TargetOther0): ADTFoldApplyImpl0[TargetOther0] = 
        new ADTFoldApplyImpl0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14)
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
      }

      class CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](val fold: ADTFoldApplyImpl14[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14])
    

      trait ADTFoldApplyImpl15[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15): Target15 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).apply(param12).apply(param13).apply(param14).apply(param15).value

        def apply[TargetOther14 >: Target0](param1: T1 => TargetOther14): ADTFoldApplyImpl14[TargetOther14,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] = 
        new ADTFoldApplyImpl14[TargetOther14,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] {
          override def apply[TargetOther13 >: TargetOther14](param2: T2 => TargetOther13): ADTFoldApplyImpl13[TargetOther13,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] = 
        new ADTFoldApplyImpl13[TargetOther13,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] {
          override def apply[TargetOther12 >: TargetOther13](param3: T3 => TargetOther12): ADTFoldApplyImpl12[TargetOther12,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] = 
        new ADTFoldApplyImpl12[TargetOther12,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] {
          override def apply[TargetOther11 >: TargetOther12](param4: T4 => TargetOther11): ADTFoldApplyImpl11[TargetOther11,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] = 
        new ADTFoldApplyImpl11[TargetOther11,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] {
          override def apply[TargetOther10 >: TargetOther11](param5: T5 => TargetOther10): ADTFoldApplyImpl10[TargetOther10,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] = 
        new ADTFoldApplyImpl10[TargetOther10,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] {
          override def apply[TargetOther9 >: TargetOther10](param6: T6 => TargetOther9): ADTFoldApplyImpl9[TargetOther9,T7,T8,T9,T10,T11,T12,T13,T14,T15] = 
        new ADTFoldApplyImpl9[TargetOther9,T7,T8,T9,T10,T11,T12,T13,T14,T15] {
          override def apply[TargetOther8 >: TargetOther9](param7: T7 => TargetOther8): ADTFoldApplyImpl8[TargetOther8,T8,T9,T10,T11,T12,T13,T14,T15] = 
        new ADTFoldApplyImpl8[TargetOther8,T8,T9,T10,T11,T12,T13,T14,T15] {
          override def apply[TargetOther7 >: TargetOther8](param8: T8 => TargetOther7): ADTFoldApplyImpl7[TargetOther7,T9,T10,T11,T12,T13,T14,T15] = 
        new ADTFoldApplyImpl7[TargetOther7,T9,T10,T11,T12,T13,T14,T15] {
          override def apply[TargetOther6 >: TargetOther7](param9: T9 => TargetOther6): ADTFoldApplyImpl6[TargetOther6,T10,T11,T12,T13,T14,T15] = 
        new ADTFoldApplyImpl6[TargetOther6,T10,T11,T12,T13,T14,T15] {
          override def apply[TargetOther5 >: TargetOther6](param10: T10 => TargetOther5): ADTFoldApplyImpl5[TargetOther5,T11,T12,T13,T14,T15] = 
        new ADTFoldApplyImpl5[TargetOther5,T11,T12,T13,T14,T15] {
          override def apply[TargetOther4 >: TargetOther5](param11: T11 => TargetOther4): ADTFoldApplyImpl4[TargetOther4,T12,T13,T14,T15] = 
        new ADTFoldApplyImpl4[TargetOther4,T12,T13,T14,T15] {
          override def apply[TargetOther3 >: TargetOther4](param12: T12 => TargetOther3): ADTFoldApplyImpl3[TargetOther3,T13,T14,T15] = 
        new ADTFoldApplyImpl3[TargetOther3,T13,T14,T15] {
          override def apply[TargetOther2 >: TargetOther3](param13: T13 => TargetOther2): ADTFoldApplyImpl2[TargetOther2,T14,T15] = 
        new ADTFoldApplyImpl2[TargetOther2,T14,T15] {
          override def apply[TargetOther1 >: TargetOther2](param14: T14 => TargetOther1): ADTFoldApplyImpl1[TargetOther1,T15] = 
        new ADTFoldApplyImpl1[TargetOther1,T15] {
          override def apply[TargetOther0 >: TargetOther1](param15: T15 => TargetOther0): ADTFoldApplyImpl0[TargetOther0] = 
        new ADTFoldApplyImpl0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15)
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
      }

      class CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](val fold: ADTFoldApplyImpl15[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15])
    

      trait ADTFoldApplyImpl16[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16): Target16 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).apply(param12).apply(param13).apply(param14).apply(param15).apply(param16).value

        def apply[TargetOther15 >: Target0](param1: T1 => TargetOther15): ADTFoldApplyImpl15[TargetOther15,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] = 
        new ADTFoldApplyImpl15[TargetOther15,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] {
          override def apply[TargetOther14 >: TargetOther15](param2: T2 => TargetOther14): ADTFoldApplyImpl14[TargetOther14,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] = 
        new ADTFoldApplyImpl14[TargetOther14,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] {
          override def apply[TargetOther13 >: TargetOther14](param3: T3 => TargetOther13): ADTFoldApplyImpl13[TargetOther13,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] = 
        new ADTFoldApplyImpl13[TargetOther13,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] {
          override def apply[TargetOther12 >: TargetOther13](param4: T4 => TargetOther12): ADTFoldApplyImpl12[TargetOther12,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] = 
        new ADTFoldApplyImpl12[TargetOther12,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] {
          override def apply[TargetOther11 >: TargetOther12](param5: T5 => TargetOther11): ADTFoldApplyImpl11[TargetOther11,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] = 
        new ADTFoldApplyImpl11[TargetOther11,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] {
          override def apply[TargetOther10 >: TargetOther11](param6: T6 => TargetOther10): ADTFoldApplyImpl10[TargetOther10,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] = 
        new ADTFoldApplyImpl10[TargetOther10,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] {
          override def apply[TargetOther9 >: TargetOther10](param7: T7 => TargetOther9): ADTFoldApplyImpl9[TargetOther9,T8,T9,T10,T11,T12,T13,T14,T15,T16] = 
        new ADTFoldApplyImpl9[TargetOther9,T8,T9,T10,T11,T12,T13,T14,T15,T16] {
          override def apply[TargetOther8 >: TargetOther9](param8: T8 => TargetOther8): ADTFoldApplyImpl8[TargetOther8,T9,T10,T11,T12,T13,T14,T15,T16] = 
        new ADTFoldApplyImpl8[TargetOther8,T9,T10,T11,T12,T13,T14,T15,T16] {
          override def apply[TargetOther7 >: TargetOther8](param9: T9 => TargetOther7): ADTFoldApplyImpl7[TargetOther7,T10,T11,T12,T13,T14,T15,T16] = 
        new ADTFoldApplyImpl7[TargetOther7,T10,T11,T12,T13,T14,T15,T16] {
          override def apply[TargetOther6 >: TargetOther7](param10: T10 => TargetOther6): ADTFoldApplyImpl6[TargetOther6,T11,T12,T13,T14,T15,T16] = 
        new ADTFoldApplyImpl6[TargetOther6,T11,T12,T13,T14,T15,T16] {
          override def apply[TargetOther5 >: TargetOther6](param11: T11 => TargetOther5): ADTFoldApplyImpl5[TargetOther5,T12,T13,T14,T15,T16] = 
        new ADTFoldApplyImpl5[TargetOther5,T12,T13,T14,T15,T16] {
          override def apply[TargetOther4 >: TargetOther5](param12: T12 => TargetOther4): ADTFoldApplyImpl4[TargetOther4,T13,T14,T15,T16] = 
        new ADTFoldApplyImpl4[TargetOther4,T13,T14,T15,T16] {
          override def apply[TargetOther3 >: TargetOther4](param13: T13 => TargetOther3): ADTFoldApplyImpl3[TargetOther3,T14,T15,T16] = 
        new ADTFoldApplyImpl3[TargetOther3,T14,T15,T16] {
          override def apply[TargetOther2 >: TargetOther3](param14: T14 => TargetOther2): ADTFoldApplyImpl2[TargetOther2,T15,T16] = 
        new ADTFoldApplyImpl2[TargetOther2,T15,T16] {
          override def apply[TargetOther1 >: TargetOther2](param15: T15 => TargetOther1): ADTFoldApplyImpl1[TargetOther1,T16] = 
        new ADTFoldApplyImpl1[TargetOther1,T16] {
          override def apply[TargetOther0 >: TargetOther1](param16: T16 => TargetOther0): ADTFoldApplyImpl0[TargetOther0] = 
        new ADTFoldApplyImpl0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16)
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
      }

      class CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](val fold: ADTFoldApplyImpl16[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16])
    

      trait ADTFoldApplyImpl17[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17): Target17 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).apply(param12).apply(param13).apply(param14).apply(param15).apply(param16).apply(param17).value

        def apply[TargetOther16 >: Target0](param1: T1 => TargetOther16): ADTFoldApplyImpl16[TargetOther16,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] = 
        new ADTFoldApplyImpl16[TargetOther16,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] {
          override def apply[TargetOther15 >: TargetOther16](param2: T2 => TargetOther15): ADTFoldApplyImpl15[TargetOther15,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] = 
        new ADTFoldApplyImpl15[TargetOther15,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] {
          override def apply[TargetOther14 >: TargetOther15](param3: T3 => TargetOther14): ADTFoldApplyImpl14[TargetOther14,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] = 
        new ADTFoldApplyImpl14[TargetOther14,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] {
          override def apply[TargetOther13 >: TargetOther14](param4: T4 => TargetOther13): ADTFoldApplyImpl13[TargetOther13,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] = 
        new ADTFoldApplyImpl13[TargetOther13,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] {
          override def apply[TargetOther12 >: TargetOther13](param5: T5 => TargetOther12): ADTFoldApplyImpl12[TargetOther12,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] = 
        new ADTFoldApplyImpl12[TargetOther12,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] {
          override def apply[TargetOther11 >: TargetOther12](param6: T6 => TargetOther11): ADTFoldApplyImpl11[TargetOther11,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] = 
        new ADTFoldApplyImpl11[TargetOther11,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] {
          override def apply[TargetOther10 >: TargetOther11](param7: T7 => TargetOther10): ADTFoldApplyImpl10[TargetOther10,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] = 
        new ADTFoldApplyImpl10[TargetOther10,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] {
          override def apply[TargetOther9 >: TargetOther10](param8: T8 => TargetOther9): ADTFoldApplyImpl9[TargetOther9,T9,T10,T11,T12,T13,T14,T15,T16,T17] = 
        new ADTFoldApplyImpl9[TargetOther9,T9,T10,T11,T12,T13,T14,T15,T16,T17] {
          override def apply[TargetOther8 >: TargetOther9](param9: T9 => TargetOther8): ADTFoldApplyImpl8[TargetOther8,T10,T11,T12,T13,T14,T15,T16,T17] = 
        new ADTFoldApplyImpl8[TargetOther8,T10,T11,T12,T13,T14,T15,T16,T17] {
          override def apply[TargetOther7 >: TargetOther8](param10: T10 => TargetOther7): ADTFoldApplyImpl7[TargetOther7,T11,T12,T13,T14,T15,T16,T17] = 
        new ADTFoldApplyImpl7[TargetOther7,T11,T12,T13,T14,T15,T16,T17] {
          override def apply[TargetOther6 >: TargetOther7](param11: T11 => TargetOther6): ADTFoldApplyImpl6[TargetOther6,T12,T13,T14,T15,T16,T17] = 
        new ADTFoldApplyImpl6[TargetOther6,T12,T13,T14,T15,T16,T17] {
          override def apply[TargetOther5 >: TargetOther6](param12: T12 => TargetOther5): ADTFoldApplyImpl5[TargetOther5,T13,T14,T15,T16,T17] = 
        new ADTFoldApplyImpl5[TargetOther5,T13,T14,T15,T16,T17] {
          override def apply[TargetOther4 >: TargetOther5](param13: T13 => TargetOther4): ADTFoldApplyImpl4[TargetOther4,T14,T15,T16,T17] = 
        new ADTFoldApplyImpl4[TargetOther4,T14,T15,T16,T17] {
          override def apply[TargetOther3 >: TargetOther4](param14: T14 => TargetOther3): ADTFoldApplyImpl3[TargetOther3,T15,T16,T17] = 
        new ADTFoldApplyImpl3[TargetOther3,T15,T16,T17] {
          override def apply[TargetOther2 >: TargetOther3](param15: T15 => TargetOther2): ADTFoldApplyImpl2[TargetOther2,T16,T17] = 
        new ADTFoldApplyImpl2[TargetOther2,T16,T17] {
          override def apply[TargetOther1 >: TargetOther2](param16: T16 => TargetOther1): ADTFoldApplyImpl1[TargetOther1,T17] = 
        new ADTFoldApplyImpl1[TargetOther1,T17] {
          override def apply[TargetOther0 >: TargetOther1](param17: T17 => TargetOther0): ADTFoldApplyImpl0[TargetOther0] = 
        new ADTFoldApplyImpl0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17)
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
      }

      class CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](val fold: ADTFoldApplyImpl17[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17])
    

      trait ADTFoldApplyImpl18[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16,Target18 >: Target17](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17,param18: T18 => Target18): Target18 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).apply(param12).apply(param13).apply(param14).apply(param15).apply(param16).apply(param17).apply(param18).value

        def apply[TargetOther17 >: Target0](param1: T1 => TargetOther17): ADTFoldApplyImpl17[TargetOther17,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApplyImpl17[TargetOther17,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther16 >: TargetOther17](param2: T2 => TargetOther16): ADTFoldApplyImpl16[TargetOther16,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApplyImpl16[TargetOther16,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther15 >: TargetOther16](param3: T3 => TargetOther15): ADTFoldApplyImpl15[TargetOther15,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApplyImpl15[TargetOther15,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther14 >: TargetOther15](param4: T4 => TargetOther14): ADTFoldApplyImpl14[TargetOther14,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApplyImpl14[TargetOther14,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther13 >: TargetOther14](param5: T5 => TargetOther13): ADTFoldApplyImpl13[TargetOther13,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApplyImpl13[TargetOther13,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther12 >: TargetOther13](param6: T6 => TargetOther12): ADTFoldApplyImpl12[TargetOther12,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApplyImpl12[TargetOther12,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther11 >: TargetOther12](param7: T7 => TargetOther11): ADTFoldApplyImpl11[TargetOther11,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApplyImpl11[TargetOther11,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther10 >: TargetOther11](param8: T8 => TargetOther10): ADTFoldApplyImpl10[TargetOther10,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApplyImpl10[TargetOther10,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther9 >: TargetOther10](param9: T9 => TargetOther9): ADTFoldApplyImpl9[TargetOther9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApplyImpl9[TargetOther9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther8 >: TargetOther9](param10: T10 => TargetOther8): ADTFoldApplyImpl8[TargetOther8,T11,T12,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApplyImpl8[TargetOther8,T11,T12,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther7 >: TargetOther8](param11: T11 => TargetOther7): ADTFoldApplyImpl7[TargetOther7,T12,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApplyImpl7[TargetOther7,T12,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther6 >: TargetOther7](param12: T12 => TargetOther6): ADTFoldApplyImpl6[TargetOther6,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApplyImpl6[TargetOther6,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther5 >: TargetOther6](param13: T13 => TargetOther5): ADTFoldApplyImpl5[TargetOther5,T14,T15,T16,T17,T18] = 
        new ADTFoldApplyImpl5[TargetOther5,T14,T15,T16,T17,T18] {
          override def apply[TargetOther4 >: TargetOther5](param14: T14 => TargetOther4): ADTFoldApplyImpl4[TargetOther4,T15,T16,T17,T18] = 
        new ADTFoldApplyImpl4[TargetOther4,T15,T16,T17,T18] {
          override def apply[TargetOther3 >: TargetOther4](param15: T15 => TargetOther3): ADTFoldApplyImpl3[TargetOther3,T16,T17,T18] = 
        new ADTFoldApplyImpl3[TargetOther3,T16,T17,T18] {
          override def apply[TargetOther2 >: TargetOther3](param16: T16 => TargetOther2): ADTFoldApplyImpl2[TargetOther2,T17,T18] = 
        new ADTFoldApplyImpl2[TargetOther2,T17,T18] {
          override def apply[TargetOther1 >: TargetOther2](param17: T17 => TargetOther1): ADTFoldApplyImpl1[TargetOther1,T18] = 
        new ADTFoldApplyImpl1[TargetOther1,T18] {
          override def apply[TargetOther0 >: TargetOther1](param18: T18 => TargetOther0): ADTFoldApplyImpl0[TargetOther0] = 
        new ADTFoldApplyImpl0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17,param18)
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
      }

      class CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](val fold: ADTFoldApplyImpl18[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18])
    

      trait ADTFoldApplyImpl19[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16,Target18 >: Target17,Target19 >: Target18](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17,param18: T18 => Target18,param19: T19 => Target19): Target19 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).apply(param12).apply(param13).apply(param14).apply(param15).apply(param16).apply(param17).apply(param18).apply(param19).value

        def apply[TargetOther18 >: Target0](param1: T1 => TargetOther18): ADTFoldApplyImpl18[TargetOther18,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApplyImpl18[TargetOther18,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther17 >: TargetOther18](param2: T2 => TargetOther17): ADTFoldApplyImpl17[TargetOther17,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApplyImpl17[TargetOther17,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther16 >: TargetOther17](param3: T3 => TargetOther16): ADTFoldApplyImpl16[TargetOther16,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApplyImpl16[TargetOther16,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther15 >: TargetOther16](param4: T4 => TargetOther15): ADTFoldApplyImpl15[TargetOther15,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApplyImpl15[TargetOther15,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther14 >: TargetOther15](param5: T5 => TargetOther14): ADTFoldApplyImpl14[TargetOther14,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApplyImpl14[TargetOther14,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther13 >: TargetOther14](param6: T6 => TargetOther13): ADTFoldApplyImpl13[TargetOther13,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApplyImpl13[TargetOther13,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther12 >: TargetOther13](param7: T7 => TargetOther12): ADTFoldApplyImpl12[TargetOther12,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApplyImpl12[TargetOther12,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther11 >: TargetOther12](param8: T8 => TargetOther11): ADTFoldApplyImpl11[TargetOther11,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApplyImpl11[TargetOther11,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther10 >: TargetOther11](param9: T9 => TargetOther10): ADTFoldApplyImpl10[TargetOther10,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApplyImpl10[TargetOther10,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther9 >: TargetOther10](param10: T10 => TargetOther9): ADTFoldApplyImpl9[TargetOther9,T11,T12,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApplyImpl9[TargetOther9,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther8 >: TargetOther9](param11: T11 => TargetOther8): ADTFoldApplyImpl8[TargetOther8,T12,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApplyImpl8[TargetOther8,T12,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther7 >: TargetOther8](param12: T12 => TargetOther7): ADTFoldApplyImpl7[TargetOther7,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApplyImpl7[TargetOther7,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther6 >: TargetOther7](param13: T13 => TargetOther6): ADTFoldApplyImpl6[TargetOther6,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApplyImpl6[TargetOther6,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther5 >: TargetOther6](param14: T14 => TargetOther5): ADTFoldApplyImpl5[TargetOther5,T15,T16,T17,T18,T19] = 
        new ADTFoldApplyImpl5[TargetOther5,T15,T16,T17,T18,T19] {
          override def apply[TargetOther4 >: TargetOther5](param15: T15 => TargetOther4): ADTFoldApplyImpl4[TargetOther4,T16,T17,T18,T19] = 
        new ADTFoldApplyImpl4[TargetOther4,T16,T17,T18,T19] {
          override def apply[TargetOther3 >: TargetOther4](param16: T16 => TargetOther3): ADTFoldApplyImpl3[TargetOther3,T17,T18,T19] = 
        new ADTFoldApplyImpl3[TargetOther3,T17,T18,T19] {
          override def apply[TargetOther2 >: TargetOther3](param17: T17 => TargetOther2): ADTFoldApplyImpl2[TargetOther2,T18,T19] = 
        new ADTFoldApplyImpl2[TargetOther2,T18,T19] {
          override def apply[TargetOther1 >: TargetOther2](param18: T18 => TargetOther1): ADTFoldApplyImpl1[TargetOther1,T19] = 
        new ADTFoldApplyImpl1[TargetOther1,T19] {
          override def apply[TargetOther0 >: TargetOther1](param19: T19 => TargetOther0): ADTFoldApplyImpl0[TargetOther0] = 
        new ADTFoldApplyImpl0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17,param18,param19)
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
      }

      class CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](val fold: ADTFoldApplyImpl19[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19])
    

      trait ADTFoldApplyImpl20[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16,Target18 >: Target17,Target19 >: Target18,Target20 >: Target19](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17,param18: T18 => Target18,param19: T19 => Target19,param20: T20 => Target20): Target20 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).apply(param12).apply(param13).apply(param14).apply(param15).apply(param16).apply(param17).apply(param18).apply(param19).apply(param20).value

        def apply[TargetOther19 >: Target0](param1: T1 => TargetOther19): ADTFoldApplyImpl19[TargetOther19,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApplyImpl19[TargetOther19,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther18 >: TargetOther19](param2: T2 => TargetOther18): ADTFoldApplyImpl18[TargetOther18,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApplyImpl18[TargetOther18,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther17 >: TargetOther18](param3: T3 => TargetOther17): ADTFoldApplyImpl17[TargetOther17,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApplyImpl17[TargetOther17,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther16 >: TargetOther17](param4: T4 => TargetOther16): ADTFoldApplyImpl16[TargetOther16,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApplyImpl16[TargetOther16,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther15 >: TargetOther16](param5: T5 => TargetOther15): ADTFoldApplyImpl15[TargetOther15,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApplyImpl15[TargetOther15,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther14 >: TargetOther15](param6: T6 => TargetOther14): ADTFoldApplyImpl14[TargetOther14,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApplyImpl14[TargetOther14,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther13 >: TargetOther14](param7: T7 => TargetOther13): ADTFoldApplyImpl13[TargetOther13,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApplyImpl13[TargetOther13,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther12 >: TargetOther13](param8: T8 => TargetOther12): ADTFoldApplyImpl12[TargetOther12,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApplyImpl12[TargetOther12,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther11 >: TargetOther12](param9: T9 => TargetOther11): ADTFoldApplyImpl11[TargetOther11,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApplyImpl11[TargetOther11,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther10 >: TargetOther11](param10: T10 => TargetOther10): ADTFoldApplyImpl10[TargetOther10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApplyImpl10[TargetOther10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther9 >: TargetOther10](param11: T11 => TargetOther9): ADTFoldApplyImpl9[TargetOther9,T12,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApplyImpl9[TargetOther9,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther8 >: TargetOther9](param12: T12 => TargetOther8): ADTFoldApplyImpl8[TargetOther8,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApplyImpl8[TargetOther8,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther7 >: TargetOther8](param13: T13 => TargetOther7): ADTFoldApplyImpl7[TargetOther7,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApplyImpl7[TargetOther7,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther6 >: TargetOther7](param14: T14 => TargetOther6): ADTFoldApplyImpl6[TargetOther6,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApplyImpl6[TargetOther6,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther5 >: TargetOther6](param15: T15 => TargetOther5): ADTFoldApplyImpl5[TargetOther5,T16,T17,T18,T19,T20] = 
        new ADTFoldApplyImpl5[TargetOther5,T16,T17,T18,T19,T20] {
          override def apply[TargetOther4 >: TargetOther5](param16: T16 => TargetOther4): ADTFoldApplyImpl4[TargetOther4,T17,T18,T19,T20] = 
        new ADTFoldApplyImpl4[TargetOther4,T17,T18,T19,T20] {
          override def apply[TargetOther3 >: TargetOther4](param17: T17 => TargetOther3): ADTFoldApplyImpl3[TargetOther3,T18,T19,T20] = 
        new ADTFoldApplyImpl3[TargetOther3,T18,T19,T20] {
          override def apply[TargetOther2 >: TargetOther3](param18: T18 => TargetOther2): ADTFoldApplyImpl2[TargetOther2,T19,T20] = 
        new ADTFoldApplyImpl2[TargetOther2,T19,T20] {
          override def apply[TargetOther1 >: TargetOther2](param19: T19 => TargetOther1): ADTFoldApplyImpl1[TargetOther1,T20] = 
        new ADTFoldApplyImpl1[TargetOther1,T20] {
          override def apply[TargetOther0 >: TargetOther1](param20: T20 => TargetOther0): ADTFoldApplyImpl0[TargetOther0] = 
        new ADTFoldApplyImpl0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17,param18,param19,param20)
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
      }

      class CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](val fold: ADTFoldApplyImpl20[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20])
    

      trait ADTFoldApplyImpl21[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16,Target18 >: Target17,Target19 >: Target18,Target20 >: Target19,Target21 >: Target20](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17,param18: T18 => Target18,param19: T19 => Target19,param20: T20 => Target20,param21: T21 => Target21): Target21 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).apply(param12).apply(param13).apply(param14).apply(param15).apply(param16).apply(param17).apply(param18).apply(param19).apply(param20).apply(param21).value

        def apply[TargetOther20 >: Target0](param1: T1 => TargetOther20): ADTFoldApplyImpl20[TargetOther20,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApplyImpl20[TargetOther20,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther19 >: TargetOther20](param2: T2 => TargetOther19): ADTFoldApplyImpl19[TargetOther19,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApplyImpl19[TargetOther19,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther18 >: TargetOther19](param3: T3 => TargetOther18): ADTFoldApplyImpl18[TargetOther18,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApplyImpl18[TargetOther18,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther17 >: TargetOther18](param4: T4 => TargetOther17): ADTFoldApplyImpl17[TargetOther17,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApplyImpl17[TargetOther17,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther16 >: TargetOther17](param5: T5 => TargetOther16): ADTFoldApplyImpl16[TargetOther16,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApplyImpl16[TargetOther16,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther15 >: TargetOther16](param6: T6 => TargetOther15): ADTFoldApplyImpl15[TargetOther15,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApplyImpl15[TargetOther15,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther14 >: TargetOther15](param7: T7 => TargetOther14): ADTFoldApplyImpl14[TargetOther14,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApplyImpl14[TargetOther14,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther13 >: TargetOther14](param8: T8 => TargetOther13): ADTFoldApplyImpl13[TargetOther13,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApplyImpl13[TargetOther13,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther12 >: TargetOther13](param9: T9 => TargetOther12): ADTFoldApplyImpl12[TargetOther12,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApplyImpl12[TargetOther12,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther11 >: TargetOther12](param10: T10 => TargetOther11): ADTFoldApplyImpl11[TargetOther11,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApplyImpl11[TargetOther11,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther10 >: TargetOther11](param11: T11 => TargetOther10): ADTFoldApplyImpl10[TargetOther10,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApplyImpl10[TargetOther10,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther9 >: TargetOther10](param12: T12 => TargetOther9): ADTFoldApplyImpl9[TargetOther9,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApplyImpl9[TargetOther9,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther8 >: TargetOther9](param13: T13 => TargetOther8): ADTFoldApplyImpl8[TargetOther8,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApplyImpl8[TargetOther8,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther7 >: TargetOther8](param14: T14 => TargetOther7): ADTFoldApplyImpl7[TargetOther7,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApplyImpl7[TargetOther7,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther6 >: TargetOther7](param15: T15 => TargetOther6): ADTFoldApplyImpl6[TargetOther6,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApplyImpl6[TargetOther6,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther5 >: TargetOther6](param16: T16 => TargetOther5): ADTFoldApplyImpl5[TargetOther5,T17,T18,T19,T20,T21] = 
        new ADTFoldApplyImpl5[TargetOther5,T17,T18,T19,T20,T21] {
          override def apply[TargetOther4 >: TargetOther5](param17: T17 => TargetOther4): ADTFoldApplyImpl4[TargetOther4,T18,T19,T20,T21] = 
        new ADTFoldApplyImpl4[TargetOther4,T18,T19,T20,T21] {
          override def apply[TargetOther3 >: TargetOther4](param18: T18 => TargetOther3): ADTFoldApplyImpl3[TargetOther3,T19,T20,T21] = 
        new ADTFoldApplyImpl3[TargetOther3,T19,T20,T21] {
          override def apply[TargetOther2 >: TargetOther3](param19: T19 => TargetOther2): ADTFoldApplyImpl2[TargetOther2,T20,T21] = 
        new ADTFoldApplyImpl2[TargetOther2,T20,T21] {
          override def apply[TargetOther1 >: TargetOther2](param20: T20 => TargetOther1): ADTFoldApplyImpl1[TargetOther1,T21] = 
        new ADTFoldApplyImpl1[TargetOther1,T21] {
          override def apply[TargetOther0 >: TargetOther1](param21: T21 => TargetOther0): ADTFoldApplyImpl0[TargetOther0] = 
        new ADTFoldApplyImpl0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17,param18,param19,param20,param21)
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
      }

      class CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](val fold: ADTFoldApplyImpl21[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21])
    

      trait ADTFoldApplyImpl22[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16,Target18 >: Target17,Target19 >: Target18,Target20 >: Target19,Target21 >: Target20,Target22 >: Target21](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17,param18: T18 => Target18,param19: T19 => Target19,param20: T20 => Target20,param21: T21 => Target21,param22: T22 => Target22): Target22 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).apply(param12).apply(param13).apply(param14).apply(param15).apply(param16).apply(param17).apply(param18).apply(param19).apply(param20).apply(param21).apply(param22).value

        def apply[TargetOther21 >: Target0](param1: T1 => TargetOther21): ADTFoldApplyImpl21[TargetOther21,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApplyImpl21[TargetOther21,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther20 >: TargetOther21](param2: T2 => TargetOther20): ADTFoldApplyImpl20[TargetOther20,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApplyImpl20[TargetOther20,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther19 >: TargetOther20](param3: T3 => TargetOther19): ADTFoldApplyImpl19[TargetOther19,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApplyImpl19[TargetOther19,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther18 >: TargetOther19](param4: T4 => TargetOther18): ADTFoldApplyImpl18[TargetOther18,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApplyImpl18[TargetOther18,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther17 >: TargetOther18](param5: T5 => TargetOther17): ADTFoldApplyImpl17[TargetOther17,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApplyImpl17[TargetOther17,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther16 >: TargetOther17](param6: T6 => TargetOther16): ADTFoldApplyImpl16[TargetOther16,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApplyImpl16[TargetOther16,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther15 >: TargetOther16](param7: T7 => TargetOther15): ADTFoldApplyImpl15[TargetOther15,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApplyImpl15[TargetOther15,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther14 >: TargetOther15](param8: T8 => TargetOther14): ADTFoldApplyImpl14[TargetOther14,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApplyImpl14[TargetOther14,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther13 >: TargetOther14](param9: T9 => TargetOther13): ADTFoldApplyImpl13[TargetOther13,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApplyImpl13[TargetOther13,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther12 >: TargetOther13](param10: T10 => TargetOther12): ADTFoldApplyImpl12[TargetOther12,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApplyImpl12[TargetOther12,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther11 >: TargetOther12](param11: T11 => TargetOther11): ADTFoldApplyImpl11[TargetOther11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApplyImpl11[TargetOther11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther10 >: TargetOther11](param12: T12 => TargetOther10): ADTFoldApplyImpl10[TargetOther10,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApplyImpl10[TargetOther10,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther9 >: TargetOther10](param13: T13 => TargetOther9): ADTFoldApplyImpl9[TargetOther9,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApplyImpl9[TargetOther9,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther8 >: TargetOther9](param14: T14 => TargetOther8): ADTFoldApplyImpl8[TargetOther8,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApplyImpl8[TargetOther8,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther7 >: TargetOther8](param15: T15 => TargetOther7): ADTFoldApplyImpl7[TargetOther7,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApplyImpl7[TargetOther7,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther6 >: TargetOther7](param16: T16 => TargetOther6): ADTFoldApplyImpl6[TargetOther6,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApplyImpl6[TargetOther6,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther5 >: TargetOther6](param17: T17 => TargetOther5): ADTFoldApplyImpl5[TargetOther5,T18,T19,T20,T21,T22] = 
        new ADTFoldApplyImpl5[TargetOther5,T18,T19,T20,T21,T22] {
          override def apply[TargetOther4 >: TargetOther5](param18: T18 => TargetOther4): ADTFoldApplyImpl4[TargetOther4,T19,T20,T21,T22] = 
        new ADTFoldApplyImpl4[TargetOther4,T19,T20,T21,T22] {
          override def apply[TargetOther3 >: TargetOther4](param19: T19 => TargetOther3): ADTFoldApplyImpl3[TargetOther3,T20,T21,T22] = 
        new ADTFoldApplyImpl3[TargetOther3,T20,T21,T22] {
          override def apply[TargetOther2 >: TargetOther3](param20: T20 => TargetOther2): ADTFoldApplyImpl2[TargetOther2,T21,T22] = 
        new ADTFoldApplyImpl2[TargetOther2,T21,T22] {
          override def apply[TargetOther1 >: TargetOther2](param21: T21 => TargetOther1): ADTFoldApplyImpl1[TargetOther1,T22] = 
        new ADTFoldApplyImpl1[TargetOther1,T22] {
          override def apply[TargetOther0 >: TargetOther1](param22: T22 => TargetOther0): ADTFoldApplyImpl0[TargetOther0] = 
        new ADTFoldApplyImpl0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17,param18,param19,param20,param21,param22)
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
      }

      class CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](val fold: ADTFoldApplyImpl22[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22])
    
  