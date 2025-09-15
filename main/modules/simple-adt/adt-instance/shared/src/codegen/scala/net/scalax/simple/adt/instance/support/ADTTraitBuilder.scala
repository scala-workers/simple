
    package net.scalax.simple.adt
    package instance
    package support

    trait ADTFoldApply0[Target0] {
      FoldApplySelf =>
      def value: Target0
    }

    
      trait ADTFoldApply1[
        Target0,
        T1
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0](param1: T1 => Target1): Target1 = FoldApplySelf.apply(param1).value

        def apply[TargetOther0 >: Target0](param1: T1 => TargetOther0): ADTFoldApply0[TargetOther0] = 
        new ADTFoldApply0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1)
        }
      
      }
    

      trait ADTFoldApply2[
        Target0,
        T1,T2
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1](param1: T1 => Target1,param2: T2 => Target2): Target2 = FoldApplySelf.apply(param1).apply(param2).value

        def apply[TargetOther1 >: Target0](param1: T1 => TargetOther1): ADTFoldApply1[TargetOther1,T2] = 
        new ADTFoldApply1[TargetOther1,T2] {
          override def apply[TargetOther0 >: TargetOther1](param2: T2 => TargetOther0): ADTFoldApply0[TargetOther0] = 
        new ADTFoldApply0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2)
        }
      
        }
      
      }
    

      trait ADTFoldApply3[
        Target0,
        T1,T2,T3
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3): Target3 = FoldApplySelf.apply(param1).apply(param2).apply(param3).value

        def apply[TargetOther2 >: Target0](param1: T1 => TargetOther2): ADTFoldApply2[TargetOther2,T2,T3] = 
        new ADTFoldApply2[TargetOther2,T2,T3] {
          override def apply[TargetOther1 >: TargetOther2](param2: T2 => TargetOther1): ADTFoldApply1[TargetOther1,T3] = 
        new ADTFoldApply1[TargetOther1,T3] {
          override def apply[TargetOther0 >: TargetOther1](param3: T3 => TargetOther0): ADTFoldApply0[TargetOther0] = 
        new ADTFoldApply0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3)
        }
      
        }
      
        }
      
      }
    

      trait ADTFoldApply4[
        Target0,
        T1,T2,T3,T4
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4): Target4 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).value

        def apply[TargetOther3 >: Target0](param1: T1 => TargetOther3): ADTFoldApply3[TargetOther3,T2,T3,T4] = 
        new ADTFoldApply3[TargetOther3,T2,T3,T4] {
          override def apply[TargetOther2 >: TargetOther3](param2: T2 => TargetOther2): ADTFoldApply2[TargetOther2,T3,T4] = 
        new ADTFoldApply2[TargetOther2,T3,T4] {
          override def apply[TargetOther1 >: TargetOther2](param3: T3 => TargetOther1): ADTFoldApply1[TargetOther1,T4] = 
        new ADTFoldApply1[TargetOther1,T4] {
          override def apply[TargetOther0 >: TargetOther1](param4: T4 => TargetOther0): ADTFoldApply0[TargetOther0] = 
        new ADTFoldApply0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3,param4)
        }
      
        }
      
        }
      
        }
      
      }
    

      trait ADTFoldApply5[
        Target0,
        T1,T2,T3,T4,T5
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5): Target5 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).value

        def apply[TargetOther4 >: Target0](param1: T1 => TargetOther4): ADTFoldApply4[TargetOther4,T2,T3,T4,T5] = 
        new ADTFoldApply4[TargetOther4,T2,T3,T4,T5] {
          override def apply[TargetOther3 >: TargetOther4](param2: T2 => TargetOther3): ADTFoldApply3[TargetOther3,T3,T4,T5] = 
        new ADTFoldApply3[TargetOther3,T3,T4,T5] {
          override def apply[TargetOther2 >: TargetOther3](param3: T3 => TargetOther2): ADTFoldApply2[TargetOther2,T4,T5] = 
        new ADTFoldApply2[TargetOther2,T4,T5] {
          override def apply[TargetOther1 >: TargetOther2](param4: T4 => TargetOther1): ADTFoldApply1[TargetOther1,T5] = 
        new ADTFoldApply1[TargetOther1,T5] {
          override def apply[TargetOther0 >: TargetOther1](param5: T5 => TargetOther0): ADTFoldApply0[TargetOther0] = 
        new ADTFoldApply0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3,param4,param5)
        }
      
        }
      
        }
      
        }
      
        }
      
      }
    

      trait ADTFoldApply6[
        Target0,
        T1,T2,T3,T4,T5,T6
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6): Target6 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).value

        def apply[TargetOther5 >: Target0](param1: T1 => TargetOther5): ADTFoldApply5[TargetOther5,T2,T3,T4,T5,T6] = 
        new ADTFoldApply5[TargetOther5,T2,T3,T4,T5,T6] {
          override def apply[TargetOther4 >: TargetOther5](param2: T2 => TargetOther4): ADTFoldApply4[TargetOther4,T3,T4,T5,T6] = 
        new ADTFoldApply4[TargetOther4,T3,T4,T5,T6] {
          override def apply[TargetOther3 >: TargetOther4](param3: T3 => TargetOther3): ADTFoldApply3[TargetOther3,T4,T5,T6] = 
        new ADTFoldApply3[TargetOther3,T4,T5,T6] {
          override def apply[TargetOther2 >: TargetOther3](param4: T4 => TargetOther2): ADTFoldApply2[TargetOther2,T5,T6] = 
        new ADTFoldApply2[TargetOther2,T5,T6] {
          override def apply[TargetOther1 >: TargetOther2](param5: T5 => TargetOther1): ADTFoldApply1[TargetOther1,T6] = 
        new ADTFoldApply1[TargetOther1,T6] {
          override def apply[TargetOther0 >: TargetOther1](param6: T6 => TargetOther0): ADTFoldApply0[TargetOther0] = 
        new ADTFoldApply0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3,param4,param5,param6)
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
      }
    

      trait ADTFoldApply7[
        Target0,
        T1,T2,T3,T4,T5,T6,T7
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7): Target7 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).value

        def apply[TargetOther6 >: Target0](param1: T1 => TargetOther6): ADTFoldApply6[TargetOther6,T2,T3,T4,T5,T6,T7] = 
        new ADTFoldApply6[TargetOther6,T2,T3,T4,T5,T6,T7] {
          override def apply[TargetOther5 >: TargetOther6](param2: T2 => TargetOther5): ADTFoldApply5[TargetOther5,T3,T4,T5,T6,T7] = 
        new ADTFoldApply5[TargetOther5,T3,T4,T5,T6,T7] {
          override def apply[TargetOther4 >: TargetOther5](param3: T3 => TargetOther4): ADTFoldApply4[TargetOther4,T4,T5,T6,T7] = 
        new ADTFoldApply4[TargetOther4,T4,T5,T6,T7] {
          override def apply[TargetOther3 >: TargetOther4](param4: T4 => TargetOther3): ADTFoldApply3[TargetOther3,T5,T6,T7] = 
        new ADTFoldApply3[TargetOther3,T5,T6,T7] {
          override def apply[TargetOther2 >: TargetOther3](param5: T5 => TargetOther2): ADTFoldApply2[TargetOther2,T6,T7] = 
        new ADTFoldApply2[TargetOther2,T6,T7] {
          override def apply[TargetOther1 >: TargetOther2](param6: T6 => TargetOther1): ADTFoldApply1[TargetOther1,T7] = 
        new ADTFoldApply1[TargetOther1,T7] {
          override def apply[TargetOther0 >: TargetOther1](param7: T7 => TargetOther0): ADTFoldApply0[TargetOther0] = 
        new ADTFoldApply0[TargetOther0] {
          override def value: TargetOther0 = FoldApplySelf.value(param1,param2,param3,param4,param5,param6,param7)
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
        }
      
      }
    

      trait ADTFoldApply8[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8): Target8 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).value

        def apply[TargetOther7 >: Target0](param1: T1 => TargetOther7): ADTFoldApply7[TargetOther7,T2,T3,T4,T5,T6,T7,T8] = 
        new ADTFoldApply7[TargetOther7,T2,T3,T4,T5,T6,T7,T8] {
          override def apply[TargetOther6 >: TargetOther7](param2: T2 => TargetOther6): ADTFoldApply6[TargetOther6,T3,T4,T5,T6,T7,T8] = 
        new ADTFoldApply6[TargetOther6,T3,T4,T5,T6,T7,T8] {
          override def apply[TargetOther5 >: TargetOther6](param3: T3 => TargetOther5): ADTFoldApply5[TargetOther5,T4,T5,T6,T7,T8] = 
        new ADTFoldApply5[TargetOther5,T4,T5,T6,T7,T8] {
          override def apply[TargetOther4 >: TargetOther5](param4: T4 => TargetOther4): ADTFoldApply4[TargetOther4,T5,T6,T7,T8] = 
        new ADTFoldApply4[TargetOther4,T5,T6,T7,T8] {
          override def apply[TargetOther3 >: TargetOther4](param5: T5 => TargetOther3): ADTFoldApply3[TargetOther3,T6,T7,T8] = 
        new ADTFoldApply3[TargetOther3,T6,T7,T8] {
          override def apply[TargetOther2 >: TargetOther3](param6: T6 => TargetOther2): ADTFoldApply2[TargetOther2,T7,T8] = 
        new ADTFoldApply2[TargetOther2,T7,T8] {
          override def apply[TargetOther1 >: TargetOther2](param7: T7 => TargetOther1): ADTFoldApply1[TargetOther1,T8] = 
        new ADTFoldApply1[TargetOther1,T8] {
          override def apply[TargetOther0 >: TargetOther1](param8: T8 => TargetOther0): ADTFoldApply0[TargetOther0] = 
        new ADTFoldApply0[TargetOther0] {
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
    

      trait ADTFoldApply9[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9): Target9 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).value

        def apply[TargetOther8 >: Target0](param1: T1 => TargetOther8): ADTFoldApply8[TargetOther8,T2,T3,T4,T5,T6,T7,T8,T9] = 
        new ADTFoldApply8[TargetOther8,T2,T3,T4,T5,T6,T7,T8,T9] {
          override def apply[TargetOther7 >: TargetOther8](param2: T2 => TargetOther7): ADTFoldApply7[TargetOther7,T3,T4,T5,T6,T7,T8,T9] = 
        new ADTFoldApply7[TargetOther7,T3,T4,T5,T6,T7,T8,T9] {
          override def apply[TargetOther6 >: TargetOther7](param3: T3 => TargetOther6): ADTFoldApply6[TargetOther6,T4,T5,T6,T7,T8,T9] = 
        new ADTFoldApply6[TargetOther6,T4,T5,T6,T7,T8,T9] {
          override def apply[TargetOther5 >: TargetOther6](param4: T4 => TargetOther5): ADTFoldApply5[TargetOther5,T5,T6,T7,T8,T9] = 
        new ADTFoldApply5[TargetOther5,T5,T6,T7,T8,T9] {
          override def apply[TargetOther4 >: TargetOther5](param5: T5 => TargetOther4): ADTFoldApply4[TargetOther4,T6,T7,T8,T9] = 
        new ADTFoldApply4[TargetOther4,T6,T7,T8,T9] {
          override def apply[TargetOther3 >: TargetOther4](param6: T6 => TargetOther3): ADTFoldApply3[TargetOther3,T7,T8,T9] = 
        new ADTFoldApply3[TargetOther3,T7,T8,T9] {
          override def apply[TargetOther2 >: TargetOther3](param7: T7 => TargetOther2): ADTFoldApply2[TargetOther2,T8,T9] = 
        new ADTFoldApply2[TargetOther2,T8,T9] {
          override def apply[TargetOther1 >: TargetOther2](param8: T8 => TargetOther1): ADTFoldApply1[TargetOther1,T9] = 
        new ADTFoldApply1[TargetOther1,T9] {
          override def apply[TargetOther0 >: TargetOther1](param9: T9 => TargetOther0): ADTFoldApply0[TargetOther0] = 
        new ADTFoldApply0[TargetOther0] {
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
    

      trait ADTFoldApply10[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10): Target10 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).value

        def apply[TargetOther9 >: Target0](param1: T1 => TargetOther9): ADTFoldApply9[TargetOther9,T2,T3,T4,T5,T6,T7,T8,T9,T10] = 
        new ADTFoldApply9[TargetOther9,T2,T3,T4,T5,T6,T7,T8,T9,T10] {
          override def apply[TargetOther8 >: TargetOther9](param2: T2 => TargetOther8): ADTFoldApply8[TargetOther8,T3,T4,T5,T6,T7,T8,T9,T10] = 
        new ADTFoldApply8[TargetOther8,T3,T4,T5,T6,T7,T8,T9,T10] {
          override def apply[TargetOther7 >: TargetOther8](param3: T3 => TargetOther7): ADTFoldApply7[TargetOther7,T4,T5,T6,T7,T8,T9,T10] = 
        new ADTFoldApply7[TargetOther7,T4,T5,T6,T7,T8,T9,T10] {
          override def apply[TargetOther6 >: TargetOther7](param4: T4 => TargetOther6): ADTFoldApply6[TargetOther6,T5,T6,T7,T8,T9,T10] = 
        new ADTFoldApply6[TargetOther6,T5,T6,T7,T8,T9,T10] {
          override def apply[TargetOther5 >: TargetOther6](param5: T5 => TargetOther5): ADTFoldApply5[TargetOther5,T6,T7,T8,T9,T10] = 
        new ADTFoldApply5[TargetOther5,T6,T7,T8,T9,T10] {
          override def apply[TargetOther4 >: TargetOther5](param6: T6 => TargetOther4): ADTFoldApply4[TargetOther4,T7,T8,T9,T10] = 
        new ADTFoldApply4[TargetOther4,T7,T8,T9,T10] {
          override def apply[TargetOther3 >: TargetOther4](param7: T7 => TargetOther3): ADTFoldApply3[TargetOther3,T8,T9,T10] = 
        new ADTFoldApply3[TargetOther3,T8,T9,T10] {
          override def apply[TargetOther2 >: TargetOther3](param8: T8 => TargetOther2): ADTFoldApply2[TargetOther2,T9,T10] = 
        new ADTFoldApply2[TargetOther2,T9,T10] {
          override def apply[TargetOther1 >: TargetOther2](param9: T9 => TargetOther1): ADTFoldApply1[TargetOther1,T10] = 
        new ADTFoldApply1[TargetOther1,T10] {
          override def apply[TargetOther0 >: TargetOther1](param10: T10 => TargetOther0): ADTFoldApply0[TargetOther0] = 
        new ADTFoldApply0[TargetOther0] {
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
    

      trait ADTFoldApply11[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11): Target11 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).value

        def apply[TargetOther10 >: Target0](param1: T1 => TargetOther10): ADTFoldApply10[TargetOther10,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] = 
        new ADTFoldApply10[TargetOther10,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] {
          override def apply[TargetOther9 >: TargetOther10](param2: T2 => TargetOther9): ADTFoldApply9[TargetOther9,T3,T4,T5,T6,T7,T8,T9,T10,T11] = 
        new ADTFoldApply9[TargetOther9,T3,T4,T5,T6,T7,T8,T9,T10,T11] {
          override def apply[TargetOther8 >: TargetOther9](param3: T3 => TargetOther8): ADTFoldApply8[TargetOther8,T4,T5,T6,T7,T8,T9,T10,T11] = 
        new ADTFoldApply8[TargetOther8,T4,T5,T6,T7,T8,T9,T10,T11] {
          override def apply[TargetOther7 >: TargetOther8](param4: T4 => TargetOther7): ADTFoldApply7[TargetOther7,T5,T6,T7,T8,T9,T10,T11] = 
        new ADTFoldApply7[TargetOther7,T5,T6,T7,T8,T9,T10,T11] {
          override def apply[TargetOther6 >: TargetOther7](param5: T5 => TargetOther6): ADTFoldApply6[TargetOther6,T6,T7,T8,T9,T10,T11] = 
        new ADTFoldApply6[TargetOther6,T6,T7,T8,T9,T10,T11] {
          override def apply[TargetOther5 >: TargetOther6](param6: T6 => TargetOther5): ADTFoldApply5[TargetOther5,T7,T8,T9,T10,T11] = 
        new ADTFoldApply5[TargetOther5,T7,T8,T9,T10,T11] {
          override def apply[TargetOther4 >: TargetOther5](param7: T7 => TargetOther4): ADTFoldApply4[TargetOther4,T8,T9,T10,T11] = 
        new ADTFoldApply4[TargetOther4,T8,T9,T10,T11] {
          override def apply[TargetOther3 >: TargetOther4](param8: T8 => TargetOther3): ADTFoldApply3[TargetOther3,T9,T10,T11] = 
        new ADTFoldApply3[TargetOther3,T9,T10,T11] {
          override def apply[TargetOther2 >: TargetOther3](param9: T9 => TargetOther2): ADTFoldApply2[TargetOther2,T10,T11] = 
        new ADTFoldApply2[TargetOther2,T10,T11] {
          override def apply[TargetOther1 >: TargetOther2](param10: T10 => TargetOther1): ADTFoldApply1[TargetOther1,T11] = 
        new ADTFoldApply1[TargetOther1,T11] {
          override def apply[TargetOther0 >: TargetOther1](param11: T11 => TargetOther0): ADTFoldApply0[TargetOther0] = 
        new ADTFoldApply0[TargetOther0] {
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
    

      trait ADTFoldApply12[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12): Target12 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).apply(param12).value

        def apply[TargetOther11 >: Target0](param1: T1 => TargetOther11): ADTFoldApply11[TargetOther11,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] = 
        new ADTFoldApply11[TargetOther11,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] {
          override def apply[TargetOther10 >: TargetOther11](param2: T2 => TargetOther10): ADTFoldApply10[TargetOther10,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] = 
        new ADTFoldApply10[TargetOther10,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] {
          override def apply[TargetOther9 >: TargetOther10](param3: T3 => TargetOther9): ADTFoldApply9[TargetOther9,T4,T5,T6,T7,T8,T9,T10,T11,T12] = 
        new ADTFoldApply9[TargetOther9,T4,T5,T6,T7,T8,T9,T10,T11,T12] {
          override def apply[TargetOther8 >: TargetOther9](param4: T4 => TargetOther8): ADTFoldApply8[TargetOther8,T5,T6,T7,T8,T9,T10,T11,T12] = 
        new ADTFoldApply8[TargetOther8,T5,T6,T7,T8,T9,T10,T11,T12] {
          override def apply[TargetOther7 >: TargetOther8](param5: T5 => TargetOther7): ADTFoldApply7[TargetOther7,T6,T7,T8,T9,T10,T11,T12] = 
        new ADTFoldApply7[TargetOther7,T6,T7,T8,T9,T10,T11,T12] {
          override def apply[TargetOther6 >: TargetOther7](param6: T6 => TargetOther6): ADTFoldApply6[TargetOther6,T7,T8,T9,T10,T11,T12] = 
        new ADTFoldApply6[TargetOther6,T7,T8,T9,T10,T11,T12] {
          override def apply[TargetOther5 >: TargetOther6](param7: T7 => TargetOther5): ADTFoldApply5[TargetOther5,T8,T9,T10,T11,T12] = 
        new ADTFoldApply5[TargetOther5,T8,T9,T10,T11,T12] {
          override def apply[TargetOther4 >: TargetOther5](param8: T8 => TargetOther4): ADTFoldApply4[TargetOther4,T9,T10,T11,T12] = 
        new ADTFoldApply4[TargetOther4,T9,T10,T11,T12] {
          override def apply[TargetOther3 >: TargetOther4](param9: T9 => TargetOther3): ADTFoldApply3[TargetOther3,T10,T11,T12] = 
        new ADTFoldApply3[TargetOther3,T10,T11,T12] {
          override def apply[TargetOther2 >: TargetOther3](param10: T10 => TargetOther2): ADTFoldApply2[TargetOther2,T11,T12] = 
        new ADTFoldApply2[TargetOther2,T11,T12] {
          override def apply[TargetOther1 >: TargetOther2](param11: T11 => TargetOther1): ADTFoldApply1[TargetOther1,T12] = 
        new ADTFoldApply1[TargetOther1,T12] {
          override def apply[TargetOther0 >: TargetOther1](param12: T12 => TargetOther0): ADTFoldApply0[TargetOther0] = 
        new ADTFoldApply0[TargetOther0] {
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
    

      trait ADTFoldApply13[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13): Target13 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).apply(param12).apply(param13).value

        def apply[TargetOther12 >: Target0](param1: T1 => TargetOther12): ADTFoldApply12[TargetOther12,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] = 
        new ADTFoldApply12[TargetOther12,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] {
          override def apply[TargetOther11 >: TargetOther12](param2: T2 => TargetOther11): ADTFoldApply11[TargetOther11,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] = 
        new ADTFoldApply11[TargetOther11,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] {
          override def apply[TargetOther10 >: TargetOther11](param3: T3 => TargetOther10): ADTFoldApply10[TargetOther10,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] = 
        new ADTFoldApply10[TargetOther10,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] {
          override def apply[TargetOther9 >: TargetOther10](param4: T4 => TargetOther9): ADTFoldApply9[TargetOther9,T5,T6,T7,T8,T9,T10,T11,T12,T13] = 
        new ADTFoldApply9[TargetOther9,T5,T6,T7,T8,T9,T10,T11,T12,T13] {
          override def apply[TargetOther8 >: TargetOther9](param5: T5 => TargetOther8): ADTFoldApply8[TargetOther8,T6,T7,T8,T9,T10,T11,T12,T13] = 
        new ADTFoldApply8[TargetOther8,T6,T7,T8,T9,T10,T11,T12,T13] {
          override def apply[TargetOther7 >: TargetOther8](param6: T6 => TargetOther7): ADTFoldApply7[TargetOther7,T7,T8,T9,T10,T11,T12,T13] = 
        new ADTFoldApply7[TargetOther7,T7,T8,T9,T10,T11,T12,T13] {
          override def apply[TargetOther6 >: TargetOther7](param7: T7 => TargetOther6): ADTFoldApply6[TargetOther6,T8,T9,T10,T11,T12,T13] = 
        new ADTFoldApply6[TargetOther6,T8,T9,T10,T11,T12,T13] {
          override def apply[TargetOther5 >: TargetOther6](param8: T8 => TargetOther5): ADTFoldApply5[TargetOther5,T9,T10,T11,T12,T13] = 
        new ADTFoldApply5[TargetOther5,T9,T10,T11,T12,T13] {
          override def apply[TargetOther4 >: TargetOther5](param9: T9 => TargetOther4): ADTFoldApply4[TargetOther4,T10,T11,T12,T13] = 
        new ADTFoldApply4[TargetOther4,T10,T11,T12,T13] {
          override def apply[TargetOther3 >: TargetOther4](param10: T10 => TargetOther3): ADTFoldApply3[TargetOther3,T11,T12,T13] = 
        new ADTFoldApply3[TargetOther3,T11,T12,T13] {
          override def apply[TargetOther2 >: TargetOther3](param11: T11 => TargetOther2): ADTFoldApply2[TargetOther2,T12,T13] = 
        new ADTFoldApply2[TargetOther2,T12,T13] {
          override def apply[TargetOther1 >: TargetOther2](param12: T12 => TargetOther1): ADTFoldApply1[TargetOther1,T13] = 
        new ADTFoldApply1[TargetOther1,T13] {
          override def apply[TargetOther0 >: TargetOther1](param13: T13 => TargetOther0): ADTFoldApply0[TargetOther0] = 
        new ADTFoldApply0[TargetOther0] {
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
    

      trait ADTFoldApply14[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14): Target14 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).apply(param12).apply(param13).apply(param14).value

        def apply[TargetOther13 >: Target0](param1: T1 => TargetOther13): ADTFoldApply13[TargetOther13,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] = 
        new ADTFoldApply13[TargetOther13,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] {
          override def apply[TargetOther12 >: TargetOther13](param2: T2 => TargetOther12): ADTFoldApply12[TargetOther12,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] = 
        new ADTFoldApply12[TargetOther12,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] {
          override def apply[TargetOther11 >: TargetOther12](param3: T3 => TargetOther11): ADTFoldApply11[TargetOther11,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] = 
        new ADTFoldApply11[TargetOther11,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] {
          override def apply[TargetOther10 >: TargetOther11](param4: T4 => TargetOther10): ADTFoldApply10[TargetOther10,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] = 
        new ADTFoldApply10[TargetOther10,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] {
          override def apply[TargetOther9 >: TargetOther10](param5: T5 => TargetOther9): ADTFoldApply9[TargetOther9,T6,T7,T8,T9,T10,T11,T12,T13,T14] = 
        new ADTFoldApply9[TargetOther9,T6,T7,T8,T9,T10,T11,T12,T13,T14] {
          override def apply[TargetOther8 >: TargetOther9](param6: T6 => TargetOther8): ADTFoldApply8[TargetOther8,T7,T8,T9,T10,T11,T12,T13,T14] = 
        new ADTFoldApply8[TargetOther8,T7,T8,T9,T10,T11,T12,T13,T14] {
          override def apply[TargetOther7 >: TargetOther8](param7: T7 => TargetOther7): ADTFoldApply7[TargetOther7,T8,T9,T10,T11,T12,T13,T14] = 
        new ADTFoldApply7[TargetOther7,T8,T9,T10,T11,T12,T13,T14] {
          override def apply[TargetOther6 >: TargetOther7](param8: T8 => TargetOther6): ADTFoldApply6[TargetOther6,T9,T10,T11,T12,T13,T14] = 
        new ADTFoldApply6[TargetOther6,T9,T10,T11,T12,T13,T14] {
          override def apply[TargetOther5 >: TargetOther6](param9: T9 => TargetOther5): ADTFoldApply5[TargetOther5,T10,T11,T12,T13,T14] = 
        new ADTFoldApply5[TargetOther5,T10,T11,T12,T13,T14] {
          override def apply[TargetOther4 >: TargetOther5](param10: T10 => TargetOther4): ADTFoldApply4[TargetOther4,T11,T12,T13,T14] = 
        new ADTFoldApply4[TargetOther4,T11,T12,T13,T14] {
          override def apply[TargetOther3 >: TargetOther4](param11: T11 => TargetOther3): ADTFoldApply3[TargetOther3,T12,T13,T14] = 
        new ADTFoldApply3[TargetOther3,T12,T13,T14] {
          override def apply[TargetOther2 >: TargetOther3](param12: T12 => TargetOther2): ADTFoldApply2[TargetOther2,T13,T14] = 
        new ADTFoldApply2[TargetOther2,T13,T14] {
          override def apply[TargetOther1 >: TargetOther2](param13: T13 => TargetOther1): ADTFoldApply1[TargetOther1,T14] = 
        new ADTFoldApply1[TargetOther1,T14] {
          override def apply[TargetOther0 >: TargetOther1](param14: T14 => TargetOther0): ADTFoldApply0[TargetOther0] = 
        new ADTFoldApply0[TargetOther0] {
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
    

      trait ADTFoldApply15[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15): Target15 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).apply(param12).apply(param13).apply(param14).apply(param15).value

        def apply[TargetOther14 >: Target0](param1: T1 => TargetOther14): ADTFoldApply14[TargetOther14,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] = 
        new ADTFoldApply14[TargetOther14,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] {
          override def apply[TargetOther13 >: TargetOther14](param2: T2 => TargetOther13): ADTFoldApply13[TargetOther13,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] = 
        new ADTFoldApply13[TargetOther13,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] {
          override def apply[TargetOther12 >: TargetOther13](param3: T3 => TargetOther12): ADTFoldApply12[TargetOther12,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] = 
        new ADTFoldApply12[TargetOther12,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] {
          override def apply[TargetOther11 >: TargetOther12](param4: T4 => TargetOther11): ADTFoldApply11[TargetOther11,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] = 
        new ADTFoldApply11[TargetOther11,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] {
          override def apply[TargetOther10 >: TargetOther11](param5: T5 => TargetOther10): ADTFoldApply10[TargetOther10,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] = 
        new ADTFoldApply10[TargetOther10,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] {
          override def apply[TargetOther9 >: TargetOther10](param6: T6 => TargetOther9): ADTFoldApply9[TargetOther9,T7,T8,T9,T10,T11,T12,T13,T14,T15] = 
        new ADTFoldApply9[TargetOther9,T7,T8,T9,T10,T11,T12,T13,T14,T15] {
          override def apply[TargetOther8 >: TargetOther9](param7: T7 => TargetOther8): ADTFoldApply8[TargetOther8,T8,T9,T10,T11,T12,T13,T14,T15] = 
        new ADTFoldApply8[TargetOther8,T8,T9,T10,T11,T12,T13,T14,T15] {
          override def apply[TargetOther7 >: TargetOther8](param8: T8 => TargetOther7): ADTFoldApply7[TargetOther7,T9,T10,T11,T12,T13,T14,T15] = 
        new ADTFoldApply7[TargetOther7,T9,T10,T11,T12,T13,T14,T15] {
          override def apply[TargetOther6 >: TargetOther7](param9: T9 => TargetOther6): ADTFoldApply6[TargetOther6,T10,T11,T12,T13,T14,T15] = 
        new ADTFoldApply6[TargetOther6,T10,T11,T12,T13,T14,T15] {
          override def apply[TargetOther5 >: TargetOther6](param10: T10 => TargetOther5): ADTFoldApply5[TargetOther5,T11,T12,T13,T14,T15] = 
        new ADTFoldApply5[TargetOther5,T11,T12,T13,T14,T15] {
          override def apply[TargetOther4 >: TargetOther5](param11: T11 => TargetOther4): ADTFoldApply4[TargetOther4,T12,T13,T14,T15] = 
        new ADTFoldApply4[TargetOther4,T12,T13,T14,T15] {
          override def apply[TargetOther3 >: TargetOther4](param12: T12 => TargetOther3): ADTFoldApply3[TargetOther3,T13,T14,T15] = 
        new ADTFoldApply3[TargetOther3,T13,T14,T15] {
          override def apply[TargetOther2 >: TargetOther3](param13: T13 => TargetOther2): ADTFoldApply2[TargetOther2,T14,T15] = 
        new ADTFoldApply2[TargetOther2,T14,T15] {
          override def apply[TargetOther1 >: TargetOther2](param14: T14 => TargetOther1): ADTFoldApply1[TargetOther1,T15] = 
        new ADTFoldApply1[TargetOther1,T15] {
          override def apply[TargetOther0 >: TargetOther1](param15: T15 => TargetOther0): ADTFoldApply0[TargetOther0] = 
        new ADTFoldApply0[TargetOther0] {
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
    

      trait ADTFoldApply16[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16): Target16 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).apply(param12).apply(param13).apply(param14).apply(param15).apply(param16).value

        def apply[TargetOther15 >: Target0](param1: T1 => TargetOther15): ADTFoldApply15[TargetOther15,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] = 
        new ADTFoldApply15[TargetOther15,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] {
          override def apply[TargetOther14 >: TargetOther15](param2: T2 => TargetOther14): ADTFoldApply14[TargetOther14,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] = 
        new ADTFoldApply14[TargetOther14,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] {
          override def apply[TargetOther13 >: TargetOther14](param3: T3 => TargetOther13): ADTFoldApply13[TargetOther13,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] = 
        new ADTFoldApply13[TargetOther13,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] {
          override def apply[TargetOther12 >: TargetOther13](param4: T4 => TargetOther12): ADTFoldApply12[TargetOther12,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] = 
        new ADTFoldApply12[TargetOther12,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] {
          override def apply[TargetOther11 >: TargetOther12](param5: T5 => TargetOther11): ADTFoldApply11[TargetOther11,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] = 
        new ADTFoldApply11[TargetOther11,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] {
          override def apply[TargetOther10 >: TargetOther11](param6: T6 => TargetOther10): ADTFoldApply10[TargetOther10,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] = 
        new ADTFoldApply10[TargetOther10,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] {
          override def apply[TargetOther9 >: TargetOther10](param7: T7 => TargetOther9): ADTFoldApply9[TargetOther9,T8,T9,T10,T11,T12,T13,T14,T15,T16] = 
        new ADTFoldApply9[TargetOther9,T8,T9,T10,T11,T12,T13,T14,T15,T16] {
          override def apply[TargetOther8 >: TargetOther9](param8: T8 => TargetOther8): ADTFoldApply8[TargetOther8,T9,T10,T11,T12,T13,T14,T15,T16] = 
        new ADTFoldApply8[TargetOther8,T9,T10,T11,T12,T13,T14,T15,T16] {
          override def apply[TargetOther7 >: TargetOther8](param9: T9 => TargetOther7): ADTFoldApply7[TargetOther7,T10,T11,T12,T13,T14,T15,T16] = 
        new ADTFoldApply7[TargetOther7,T10,T11,T12,T13,T14,T15,T16] {
          override def apply[TargetOther6 >: TargetOther7](param10: T10 => TargetOther6): ADTFoldApply6[TargetOther6,T11,T12,T13,T14,T15,T16] = 
        new ADTFoldApply6[TargetOther6,T11,T12,T13,T14,T15,T16] {
          override def apply[TargetOther5 >: TargetOther6](param11: T11 => TargetOther5): ADTFoldApply5[TargetOther5,T12,T13,T14,T15,T16] = 
        new ADTFoldApply5[TargetOther5,T12,T13,T14,T15,T16] {
          override def apply[TargetOther4 >: TargetOther5](param12: T12 => TargetOther4): ADTFoldApply4[TargetOther4,T13,T14,T15,T16] = 
        new ADTFoldApply4[TargetOther4,T13,T14,T15,T16] {
          override def apply[TargetOther3 >: TargetOther4](param13: T13 => TargetOther3): ADTFoldApply3[TargetOther3,T14,T15,T16] = 
        new ADTFoldApply3[TargetOther3,T14,T15,T16] {
          override def apply[TargetOther2 >: TargetOther3](param14: T14 => TargetOther2): ADTFoldApply2[TargetOther2,T15,T16] = 
        new ADTFoldApply2[TargetOther2,T15,T16] {
          override def apply[TargetOther1 >: TargetOther2](param15: T15 => TargetOther1): ADTFoldApply1[TargetOther1,T16] = 
        new ADTFoldApply1[TargetOther1,T16] {
          override def apply[TargetOther0 >: TargetOther1](param16: T16 => TargetOther0): ADTFoldApply0[TargetOther0] = 
        new ADTFoldApply0[TargetOther0] {
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
    

      trait ADTFoldApply17[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17): Target17 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).apply(param12).apply(param13).apply(param14).apply(param15).apply(param16).apply(param17).value

        def apply[TargetOther16 >: Target0](param1: T1 => TargetOther16): ADTFoldApply16[TargetOther16,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] = 
        new ADTFoldApply16[TargetOther16,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] {
          override def apply[TargetOther15 >: TargetOther16](param2: T2 => TargetOther15): ADTFoldApply15[TargetOther15,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] = 
        new ADTFoldApply15[TargetOther15,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] {
          override def apply[TargetOther14 >: TargetOther15](param3: T3 => TargetOther14): ADTFoldApply14[TargetOther14,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] = 
        new ADTFoldApply14[TargetOther14,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] {
          override def apply[TargetOther13 >: TargetOther14](param4: T4 => TargetOther13): ADTFoldApply13[TargetOther13,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] = 
        new ADTFoldApply13[TargetOther13,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] {
          override def apply[TargetOther12 >: TargetOther13](param5: T5 => TargetOther12): ADTFoldApply12[TargetOther12,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] = 
        new ADTFoldApply12[TargetOther12,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] {
          override def apply[TargetOther11 >: TargetOther12](param6: T6 => TargetOther11): ADTFoldApply11[TargetOther11,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] = 
        new ADTFoldApply11[TargetOther11,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] {
          override def apply[TargetOther10 >: TargetOther11](param7: T7 => TargetOther10): ADTFoldApply10[TargetOther10,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] = 
        new ADTFoldApply10[TargetOther10,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] {
          override def apply[TargetOther9 >: TargetOther10](param8: T8 => TargetOther9): ADTFoldApply9[TargetOther9,T9,T10,T11,T12,T13,T14,T15,T16,T17] = 
        new ADTFoldApply9[TargetOther9,T9,T10,T11,T12,T13,T14,T15,T16,T17] {
          override def apply[TargetOther8 >: TargetOther9](param9: T9 => TargetOther8): ADTFoldApply8[TargetOther8,T10,T11,T12,T13,T14,T15,T16,T17] = 
        new ADTFoldApply8[TargetOther8,T10,T11,T12,T13,T14,T15,T16,T17] {
          override def apply[TargetOther7 >: TargetOther8](param10: T10 => TargetOther7): ADTFoldApply7[TargetOther7,T11,T12,T13,T14,T15,T16,T17] = 
        new ADTFoldApply7[TargetOther7,T11,T12,T13,T14,T15,T16,T17] {
          override def apply[TargetOther6 >: TargetOther7](param11: T11 => TargetOther6): ADTFoldApply6[TargetOther6,T12,T13,T14,T15,T16,T17] = 
        new ADTFoldApply6[TargetOther6,T12,T13,T14,T15,T16,T17] {
          override def apply[TargetOther5 >: TargetOther6](param12: T12 => TargetOther5): ADTFoldApply5[TargetOther5,T13,T14,T15,T16,T17] = 
        new ADTFoldApply5[TargetOther5,T13,T14,T15,T16,T17] {
          override def apply[TargetOther4 >: TargetOther5](param13: T13 => TargetOther4): ADTFoldApply4[TargetOther4,T14,T15,T16,T17] = 
        new ADTFoldApply4[TargetOther4,T14,T15,T16,T17] {
          override def apply[TargetOther3 >: TargetOther4](param14: T14 => TargetOther3): ADTFoldApply3[TargetOther3,T15,T16,T17] = 
        new ADTFoldApply3[TargetOther3,T15,T16,T17] {
          override def apply[TargetOther2 >: TargetOther3](param15: T15 => TargetOther2): ADTFoldApply2[TargetOther2,T16,T17] = 
        new ADTFoldApply2[TargetOther2,T16,T17] {
          override def apply[TargetOther1 >: TargetOther2](param16: T16 => TargetOther1): ADTFoldApply1[TargetOther1,T17] = 
        new ADTFoldApply1[TargetOther1,T17] {
          override def apply[TargetOther0 >: TargetOther1](param17: T17 => TargetOther0): ADTFoldApply0[TargetOther0] = 
        new ADTFoldApply0[TargetOther0] {
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
    

      trait ADTFoldApply18[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16,Target18 >: Target17](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17,param18: T18 => Target18): Target18 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).apply(param12).apply(param13).apply(param14).apply(param15).apply(param16).apply(param17).apply(param18).value

        def apply[TargetOther17 >: Target0](param1: T1 => TargetOther17): ADTFoldApply17[TargetOther17,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApply17[TargetOther17,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther16 >: TargetOther17](param2: T2 => TargetOther16): ADTFoldApply16[TargetOther16,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApply16[TargetOther16,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther15 >: TargetOther16](param3: T3 => TargetOther15): ADTFoldApply15[TargetOther15,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApply15[TargetOther15,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther14 >: TargetOther15](param4: T4 => TargetOther14): ADTFoldApply14[TargetOther14,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApply14[TargetOther14,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther13 >: TargetOther14](param5: T5 => TargetOther13): ADTFoldApply13[TargetOther13,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApply13[TargetOther13,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther12 >: TargetOther13](param6: T6 => TargetOther12): ADTFoldApply12[TargetOther12,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApply12[TargetOther12,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther11 >: TargetOther12](param7: T7 => TargetOther11): ADTFoldApply11[TargetOther11,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApply11[TargetOther11,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther10 >: TargetOther11](param8: T8 => TargetOther10): ADTFoldApply10[TargetOther10,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApply10[TargetOther10,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther9 >: TargetOther10](param9: T9 => TargetOther9): ADTFoldApply9[TargetOther9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApply9[TargetOther9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther8 >: TargetOther9](param10: T10 => TargetOther8): ADTFoldApply8[TargetOther8,T11,T12,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApply8[TargetOther8,T11,T12,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther7 >: TargetOther8](param11: T11 => TargetOther7): ADTFoldApply7[TargetOther7,T12,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApply7[TargetOther7,T12,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther6 >: TargetOther7](param12: T12 => TargetOther6): ADTFoldApply6[TargetOther6,T13,T14,T15,T16,T17,T18] = 
        new ADTFoldApply6[TargetOther6,T13,T14,T15,T16,T17,T18] {
          override def apply[TargetOther5 >: TargetOther6](param13: T13 => TargetOther5): ADTFoldApply5[TargetOther5,T14,T15,T16,T17,T18] = 
        new ADTFoldApply5[TargetOther5,T14,T15,T16,T17,T18] {
          override def apply[TargetOther4 >: TargetOther5](param14: T14 => TargetOther4): ADTFoldApply4[TargetOther4,T15,T16,T17,T18] = 
        new ADTFoldApply4[TargetOther4,T15,T16,T17,T18] {
          override def apply[TargetOther3 >: TargetOther4](param15: T15 => TargetOther3): ADTFoldApply3[TargetOther3,T16,T17,T18] = 
        new ADTFoldApply3[TargetOther3,T16,T17,T18] {
          override def apply[TargetOther2 >: TargetOther3](param16: T16 => TargetOther2): ADTFoldApply2[TargetOther2,T17,T18] = 
        new ADTFoldApply2[TargetOther2,T17,T18] {
          override def apply[TargetOther1 >: TargetOther2](param17: T17 => TargetOther1): ADTFoldApply1[TargetOther1,T18] = 
        new ADTFoldApply1[TargetOther1,T18] {
          override def apply[TargetOther0 >: TargetOther1](param18: T18 => TargetOther0): ADTFoldApply0[TargetOther0] = 
        new ADTFoldApply0[TargetOther0] {
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
    

      trait ADTFoldApply19[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16,Target18 >: Target17,Target19 >: Target18](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17,param18: T18 => Target18,param19: T19 => Target19): Target19 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).apply(param12).apply(param13).apply(param14).apply(param15).apply(param16).apply(param17).apply(param18).apply(param19).value

        def apply[TargetOther18 >: Target0](param1: T1 => TargetOther18): ADTFoldApply18[TargetOther18,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApply18[TargetOther18,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther17 >: TargetOther18](param2: T2 => TargetOther17): ADTFoldApply17[TargetOther17,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApply17[TargetOther17,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther16 >: TargetOther17](param3: T3 => TargetOther16): ADTFoldApply16[TargetOther16,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApply16[TargetOther16,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther15 >: TargetOther16](param4: T4 => TargetOther15): ADTFoldApply15[TargetOther15,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApply15[TargetOther15,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther14 >: TargetOther15](param5: T5 => TargetOther14): ADTFoldApply14[TargetOther14,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApply14[TargetOther14,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther13 >: TargetOther14](param6: T6 => TargetOther13): ADTFoldApply13[TargetOther13,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApply13[TargetOther13,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther12 >: TargetOther13](param7: T7 => TargetOther12): ADTFoldApply12[TargetOther12,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApply12[TargetOther12,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther11 >: TargetOther12](param8: T8 => TargetOther11): ADTFoldApply11[TargetOther11,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApply11[TargetOther11,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther10 >: TargetOther11](param9: T9 => TargetOther10): ADTFoldApply10[TargetOther10,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApply10[TargetOther10,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther9 >: TargetOther10](param10: T10 => TargetOther9): ADTFoldApply9[TargetOther9,T11,T12,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApply9[TargetOther9,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther8 >: TargetOther9](param11: T11 => TargetOther8): ADTFoldApply8[TargetOther8,T12,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApply8[TargetOther8,T12,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther7 >: TargetOther8](param12: T12 => TargetOther7): ADTFoldApply7[TargetOther7,T13,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApply7[TargetOther7,T13,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther6 >: TargetOther7](param13: T13 => TargetOther6): ADTFoldApply6[TargetOther6,T14,T15,T16,T17,T18,T19] = 
        new ADTFoldApply6[TargetOther6,T14,T15,T16,T17,T18,T19] {
          override def apply[TargetOther5 >: TargetOther6](param14: T14 => TargetOther5): ADTFoldApply5[TargetOther5,T15,T16,T17,T18,T19] = 
        new ADTFoldApply5[TargetOther5,T15,T16,T17,T18,T19] {
          override def apply[TargetOther4 >: TargetOther5](param15: T15 => TargetOther4): ADTFoldApply4[TargetOther4,T16,T17,T18,T19] = 
        new ADTFoldApply4[TargetOther4,T16,T17,T18,T19] {
          override def apply[TargetOther3 >: TargetOther4](param16: T16 => TargetOther3): ADTFoldApply3[TargetOther3,T17,T18,T19] = 
        new ADTFoldApply3[TargetOther3,T17,T18,T19] {
          override def apply[TargetOther2 >: TargetOther3](param17: T17 => TargetOther2): ADTFoldApply2[TargetOther2,T18,T19] = 
        new ADTFoldApply2[TargetOther2,T18,T19] {
          override def apply[TargetOther1 >: TargetOther2](param18: T18 => TargetOther1): ADTFoldApply1[TargetOther1,T19] = 
        new ADTFoldApply1[TargetOther1,T19] {
          override def apply[TargetOther0 >: TargetOther1](param19: T19 => TargetOther0): ADTFoldApply0[TargetOther0] = 
        new ADTFoldApply0[TargetOther0] {
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
    

      trait ADTFoldApply20[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16,Target18 >: Target17,Target19 >: Target18,Target20 >: Target19](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17,param18: T18 => Target18,param19: T19 => Target19,param20: T20 => Target20): Target20 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).apply(param12).apply(param13).apply(param14).apply(param15).apply(param16).apply(param17).apply(param18).apply(param19).apply(param20).value

        def apply[TargetOther19 >: Target0](param1: T1 => TargetOther19): ADTFoldApply19[TargetOther19,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApply19[TargetOther19,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther18 >: TargetOther19](param2: T2 => TargetOther18): ADTFoldApply18[TargetOther18,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApply18[TargetOther18,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther17 >: TargetOther18](param3: T3 => TargetOther17): ADTFoldApply17[TargetOther17,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApply17[TargetOther17,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther16 >: TargetOther17](param4: T4 => TargetOther16): ADTFoldApply16[TargetOther16,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApply16[TargetOther16,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther15 >: TargetOther16](param5: T5 => TargetOther15): ADTFoldApply15[TargetOther15,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApply15[TargetOther15,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther14 >: TargetOther15](param6: T6 => TargetOther14): ADTFoldApply14[TargetOther14,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApply14[TargetOther14,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther13 >: TargetOther14](param7: T7 => TargetOther13): ADTFoldApply13[TargetOther13,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApply13[TargetOther13,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther12 >: TargetOther13](param8: T8 => TargetOther12): ADTFoldApply12[TargetOther12,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApply12[TargetOther12,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther11 >: TargetOther12](param9: T9 => TargetOther11): ADTFoldApply11[TargetOther11,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApply11[TargetOther11,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther10 >: TargetOther11](param10: T10 => TargetOther10): ADTFoldApply10[TargetOther10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApply10[TargetOther10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther9 >: TargetOther10](param11: T11 => TargetOther9): ADTFoldApply9[TargetOther9,T12,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApply9[TargetOther9,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther8 >: TargetOther9](param12: T12 => TargetOther8): ADTFoldApply8[TargetOther8,T13,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApply8[TargetOther8,T13,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther7 >: TargetOther8](param13: T13 => TargetOther7): ADTFoldApply7[TargetOther7,T14,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApply7[TargetOther7,T14,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther6 >: TargetOther7](param14: T14 => TargetOther6): ADTFoldApply6[TargetOther6,T15,T16,T17,T18,T19,T20] = 
        new ADTFoldApply6[TargetOther6,T15,T16,T17,T18,T19,T20] {
          override def apply[TargetOther5 >: TargetOther6](param15: T15 => TargetOther5): ADTFoldApply5[TargetOther5,T16,T17,T18,T19,T20] = 
        new ADTFoldApply5[TargetOther5,T16,T17,T18,T19,T20] {
          override def apply[TargetOther4 >: TargetOther5](param16: T16 => TargetOther4): ADTFoldApply4[TargetOther4,T17,T18,T19,T20] = 
        new ADTFoldApply4[TargetOther4,T17,T18,T19,T20] {
          override def apply[TargetOther3 >: TargetOther4](param17: T17 => TargetOther3): ADTFoldApply3[TargetOther3,T18,T19,T20] = 
        new ADTFoldApply3[TargetOther3,T18,T19,T20] {
          override def apply[TargetOther2 >: TargetOther3](param18: T18 => TargetOther2): ADTFoldApply2[TargetOther2,T19,T20] = 
        new ADTFoldApply2[TargetOther2,T19,T20] {
          override def apply[TargetOther1 >: TargetOther2](param19: T19 => TargetOther1): ADTFoldApply1[TargetOther1,T20] = 
        new ADTFoldApply1[TargetOther1,T20] {
          override def apply[TargetOther0 >: TargetOther1](param20: T20 => TargetOther0): ADTFoldApply0[TargetOther0] = 
        new ADTFoldApply0[TargetOther0] {
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
    

      trait ADTFoldApply21[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16,Target18 >: Target17,Target19 >: Target18,Target20 >: Target19,Target21 >: Target20](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17,param18: T18 => Target18,param19: T19 => Target19,param20: T20 => Target20,param21: T21 => Target21): Target21 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).apply(param12).apply(param13).apply(param14).apply(param15).apply(param16).apply(param17).apply(param18).apply(param19).apply(param20).apply(param21).value

        def apply[TargetOther20 >: Target0](param1: T1 => TargetOther20): ADTFoldApply20[TargetOther20,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApply20[TargetOther20,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther19 >: TargetOther20](param2: T2 => TargetOther19): ADTFoldApply19[TargetOther19,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApply19[TargetOther19,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther18 >: TargetOther19](param3: T3 => TargetOther18): ADTFoldApply18[TargetOther18,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApply18[TargetOther18,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther17 >: TargetOther18](param4: T4 => TargetOther17): ADTFoldApply17[TargetOther17,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApply17[TargetOther17,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther16 >: TargetOther17](param5: T5 => TargetOther16): ADTFoldApply16[TargetOther16,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApply16[TargetOther16,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther15 >: TargetOther16](param6: T6 => TargetOther15): ADTFoldApply15[TargetOther15,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApply15[TargetOther15,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther14 >: TargetOther15](param7: T7 => TargetOther14): ADTFoldApply14[TargetOther14,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApply14[TargetOther14,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther13 >: TargetOther14](param8: T8 => TargetOther13): ADTFoldApply13[TargetOther13,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApply13[TargetOther13,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther12 >: TargetOther13](param9: T9 => TargetOther12): ADTFoldApply12[TargetOther12,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApply12[TargetOther12,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther11 >: TargetOther12](param10: T10 => TargetOther11): ADTFoldApply11[TargetOther11,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApply11[TargetOther11,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther10 >: TargetOther11](param11: T11 => TargetOther10): ADTFoldApply10[TargetOther10,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApply10[TargetOther10,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther9 >: TargetOther10](param12: T12 => TargetOther9): ADTFoldApply9[TargetOther9,T13,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApply9[TargetOther9,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther8 >: TargetOther9](param13: T13 => TargetOther8): ADTFoldApply8[TargetOther8,T14,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApply8[TargetOther8,T14,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther7 >: TargetOther8](param14: T14 => TargetOther7): ADTFoldApply7[TargetOther7,T15,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApply7[TargetOther7,T15,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther6 >: TargetOther7](param15: T15 => TargetOther6): ADTFoldApply6[TargetOther6,T16,T17,T18,T19,T20,T21] = 
        new ADTFoldApply6[TargetOther6,T16,T17,T18,T19,T20,T21] {
          override def apply[TargetOther5 >: TargetOther6](param16: T16 => TargetOther5): ADTFoldApply5[TargetOther5,T17,T18,T19,T20,T21] = 
        new ADTFoldApply5[TargetOther5,T17,T18,T19,T20,T21] {
          override def apply[TargetOther4 >: TargetOther5](param17: T17 => TargetOther4): ADTFoldApply4[TargetOther4,T18,T19,T20,T21] = 
        new ADTFoldApply4[TargetOther4,T18,T19,T20,T21] {
          override def apply[TargetOther3 >: TargetOther4](param18: T18 => TargetOther3): ADTFoldApply3[TargetOther3,T19,T20,T21] = 
        new ADTFoldApply3[TargetOther3,T19,T20,T21] {
          override def apply[TargetOther2 >: TargetOther3](param19: T19 => TargetOther2): ADTFoldApply2[TargetOther2,T20,T21] = 
        new ADTFoldApply2[TargetOther2,T20,T21] {
          override def apply[TargetOther1 >: TargetOther2](param20: T20 => TargetOther1): ADTFoldApply1[TargetOther1,T21] = 
        new ADTFoldApply1[TargetOther1,T21] {
          override def apply[TargetOther0 >: TargetOther1](param21: T21 => TargetOther0): ADTFoldApply0[TargetOther0] = 
        new ADTFoldApply0[TargetOther0] {
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
    

      trait ADTFoldApply22[
        Target0,
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22
      ] {
        FoldApplySelf =>
        def value[Target1 >: Target0,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16,Target18 >: Target17,Target19 >: Target18,Target20 >: Target19,Target21 >: Target20,Target22 >: Target21](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17,param18: T18 => Target18,param19: T19 => Target19,param20: T20 => Target20,param21: T21 => Target21,param22: T22 => Target22): Target22 = FoldApplySelf.apply(param1).apply(param2).apply(param3).apply(param4).apply(param5).apply(param6).apply(param7).apply(param8).apply(param9).apply(param10).apply(param11).apply(param12).apply(param13).apply(param14).apply(param15).apply(param16).apply(param17).apply(param18).apply(param19).apply(param20).apply(param21).apply(param22).value

        def apply[TargetOther21 >: Target0](param1: T1 => TargetOther21): ADTFoldApply21[TargetOther21,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApply21[TargetOther21,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther20 >: TargetOther21](param2: T2 => TargetOther20): ADTFoldApply20[TargetOther20,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApply20[TargetOther20,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther19 >: TargetOther20](param3: T3 => TargetOther19): ADTFoldApply19[TargetOther19,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApply19[TargetOther19,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther18 >: TargetOther19](param4: T4 => TargetOther18): ADTFoldApply18[TargetOther18,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApply18[TargetOther18,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther17 >: TargetOther18](param5: T5 => TargetOther17): ADTFoldApply17[TargetOther17,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApply17[TargetOther17,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther16 >: TargetOther17](param6: T6 => TargetOther16): ADTFoldApply16[TargetOther16,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApply16[TargetOther16,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther15 >: TargetOther16](param7: T7 => TargetOther15): ADTFoldApply15[TargetOther15,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApply15[TargetOther15,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther14 >: TargetOther15](param8: T8 => TargetOther14): ADTFoldApply14[TargetOther14,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApply14[TargetOther14,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther13 >: TargetOther14](param9: T9 => TargetOther13): ADTFoldApply13[TargetOther13,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApply13[TargetOther13,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther12 >: TargetOther13](param10: T10 => TargetOther12): ADTFoldApply12[TargetOther12,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApply12[TargetOther12,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther11 >: TargetOther12](param11: T11 => TargetOther11): ADTFoldApply11[TargetOther11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApply11[TargetOther11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther10 >: TargetOther11](param12: T12 => TargetOther10): ADTFoldApply10[TargetOther10,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApply10[TargetOther10,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther9 >: TargetOther10](param13: T13 => TargetOther9): ADTFoldApply9[TargetOther9,T14,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApply9[TargetOther9,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther8 >: TargetOther9](param14: T14 => TargetOther8): ADTFoldApply8[TargetOther8,T15,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApply8[TargetOther8,T15,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther7 >: TargetOther8](param15: T15 => TargetOther7): ADTFoldApply7[TargetOther7,T16,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApply7[TargetOther7,T16,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther6 >: TargetOther7](param16: T16 => TargetOther6): ADTFoldApply6[TargetOther6,T17,T18,T19,T20,T21,T22] = 
        new ADTFoldApply6[TargetOther6,T17,T18,T19,T20,T21,T22] {
          override def apply[TargetOther5 >: TargetOther6](param17: T17 => TargetOther5): ADTFoldApply5[TargetOther5,T18,T19,T20,T21,T22] = 
        new ADTFoldApply5[TargetOther5,T18,T19,T20,T21,T22] {
          override def apply[TargetOther4 >: TargetOther5](param18: T18 => TargetOther4): ADTFoldApply4[TargetOther4,T19,T20,T21,T22] = 
        new ADTFoldApply4[TargetOther4,T19,T20,T21,T22] {
          override def apply[TargetOther3 >: TargetOther4](param19: T19 => TargetOther3): ADTFoldApply3[TargetOther3,T20,T21,T22] = 
        new ADTFoldApply3[TargetOther3,T20,T21,T22] {
          override def apply[TargetOther2 >: TargetOther3](param20: T20 => TargetOther2): ADTFoldApply2[TargetOther2,T21,T22] = 
        new ADTFoldApply2[TargetOther2,T21,T22] {
          override def apply[TargetOther1 >: TargetOther2](param21: T21 => TargetOther1): ADTFoldApply1[TargetOther1,T22] = 
        new ADTFoldApply1[TargetOther1,T22] {
          override def apply[TargetOther0 >: TargetOther1](param22: T22 => TargetOther0): ADTFoldApply0[TargetOther0] = 
        new ADTFoldApply0[TargetOther0] {
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
    
  