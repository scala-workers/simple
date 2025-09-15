
    package net.scalax.simple.adt
    package instance
    package support

    object ADTApplyFunction {
      
      def adtApply1[
        T1
      ](param: AdtCoProduct.UseOne[T1]): ADTFoldApply1[Nothing,  T1] = new ADTFoldApply1[Nothing,  T1] {

        override def value[Target1 >: Nothing](param1: T1 => Target1): Target1 = {
          implicit val paramImpl1 = param1
          ADTBuilderHelperImplicit.ForFetch[Target1].inputHList(param)
        }

      }
    

      def adtApply2[
        T1,T2
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UseOne[T2]]): ADTFoldApply2[Nothing,  T1,T2] = new ADTFoldApply2[Nothing,  T1,T2] {

        override def value[Target1 >: Nothing,Target2 >: Target1](param1: T1 => Target1,param2: T2 => Target2): Target2 = {
          implicit val paramImpl1 = param1
implicit val paramImpl2 = param2
          ADTBuilderHelperImplicit.ForFetch[Target2].inputHList(param)
        }

      }
    

      def adtApply3[
        T1,T2,T3
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UseOne[T3]]]): ADTFoldApply3[Nothing,  T1,T2,T3] = new ADTFoldApply3[Nothing,  T1,T2,T3] {

        override def value[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3): Target3 = {
          implicit val paramImpl1 = param1
implicit val paramImpl2 = param2
implicit val paramImpl3 = param3
          ADTBuilderHelperImplicit.ForFetch[Target3].inputHList(param)
        }

      }
    

      def adtApply4[
        T1,T2,T3,T4
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UseOne[T4]]]]): ADTFoldApply4[Nothing,  T1,T2,T3,T4] = new ADTFoldApply4[Nothing,  T1,T2,T3,T4] {

        override def value[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4): Target4 = {
          implicit val paramImpl1 = param1
implicit val paramImpl2 = param2
implicit val paramImpl3 = param3
implicit val paramImpl4 = param4
          ADTBuilderHelperImplicit.ForFetch[Target4].inputHList(param)
        }

      }
    

      def adtApply5[
        T1,T2,T3,T4,T5
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UseOne[T5]]]]]): ADTFoldApply5[Nothing,  T1,T2,T3,T4,T5] = new ADTFoldApply5[Nothing,  T1,T2,T3,T4,T5] {

        override def value[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5): Target5 = {
          implicit val paramImpl1 = param1
implicit val paramImpl2 = param2
implicit val paramImpl3 = param3
implicit val paramImpl4 = param4
implicit val paramImpl5 = param5
          ADTBuilderHelperImplicit.ForFetch[Target5].inputHList(param)
        }

      }
    

      def adtApply6[
        T1,T2,T3,T4,T5,T6
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UseOne[T6]]]]]]): ADTFoldApply6[Nothing,  T1,T2,T3,T4,T5,T6] = new ADTFoldApply6[Nothing,  T1,T2,T3,T4,T5,T6] {

        override def value[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6): Target6 = {
          implicit val paramImpl1 = param1
implicit val paramImpl2 = param2
implicit val paramImpl3 = param3
implicit val paramImpl4 = param4
implicit val paramImpl5 = param5
implicit val paramImpl6 = param6
          ADTBuilderHelperImplicit.ForFetch[Target6].inputHList(param)
        }

      }
    

      def adtApply7[
        T1,T2,T3,T4,T5,T6,T7
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UseOne[T7]]]]]]]): ADTFoldApply7[Nothing,  T1,T2,T3,T4,T5,T6,T7] = new ADTFoldApply7[Nothing,  T1,T2,T3,T4,T5,T6,T7] {

        override def value[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7): Target7 = {
          implicit val paramImpl1 = param1
implicit val paramImpl2 = param2
implicit val paramImpl3 = param3
implicit val paramImpl4 = param4
implicit val paramImpl5 = param5
implicit val paramImpl6 = param6
implicit val paramImpl7 = param7
          ADTBuilderHelperImplicit.ForFetch[Target7].inputHList(param)
        }

      }
    

      def adtApply8[
        T1,T2,T3,T4,T5,T6,T7,T8
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UseOne[T8]]]]]]]]): ADTFoldApply8[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8] = new ADTFoldApply8[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8] {

        override def value[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8): Target8 = {
          implicit val paramImpl1 = param1
implicit val paramImpl2 = param2
implicit val paramImpl3 = param3
implicit val paramImpl4 = param4
implicit val paramImpl5 = param5
implicit val paramImpl6 = param6
implicit val paramImpl7 = param7
implicit val paramImpl8 = param8
          ADTBuilderHelperImplicit.ForFetch[Target8].inputHList(param)
        }

      }
    

      def adtApply9[
        T1,T2,T3,T4,T5,T6,T7,T8,T9
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UseOne[T9]]]]]]]]]): ADTFoldApply9[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9] = new ADTFoldApply9[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9] {

        override def value[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9): Target9 = {
          implicit val paramImpl1 = param1
implicit val paramImpl2 = param2
implicit val paramImpl3 = param3
implicit val paramImpl4 = param4
implicit val paramImpl5 = param5
implicit val paramImpl6 = param6
implicit val paramImpl7 = param7
implicit val paramImpl8 = param8
implicit val paramImpl9 = param9
          ADTBuilderHelperImplicit.ForFetch[Target9].inputHList(param)
        }

      }
    

      def adtApply10[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UseOne[T10]]]]]]]]]]): ADTFoldApply10[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] = new ADTFoldApply10[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] {

        override def value[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10): Target10 = {
          implicit val paramImpl1 = param1
implicit val paramImpl2 = param2
implicit val paramImpl3 = param3
implicit val paramImpl4 = param4
implicit val paramImpl5 = param5
implicit val paramImpl6 = param6
implicit val paramImpl7 = param7
implicit val paramImpl8 = param8
implicit val paramImpl9 = param9
implicit val paramImpl10 = param10
          ADTBuilderHelperImplicit.ForFetch[Target10].inputHList(param)
        }

      }
    

      def adtApply11[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UseOne[T11]]]]]]]]]]]): ADTFoldApply11[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] = new ADTFoldApply11[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] {

        override def value[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11): Target11 = {
          implicit val paramImpl1 = param1
implicit val paramImpl2 = param2
implicit val paramImpl3 = param3
implicit val paramImpl4 = param4
implicit val paramImpl5 = param5
implicit val paramImpl6 = param6
implicit val paramImpl7 = param7
implicit val paramImpl8 = param8
implicit val paramImpl9 = param9
implicit val paramImpl10 = param10
implicit val paramImpl11 = param11
          ADTBuilderHelperImplicit.ForFetch[Target11].inputHList(param)
        }

      }
    

      def adtApply12[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UsePositive[T11, AdtCoProduct.UseOne[T12]]]]]]]]]]]]): ADTFoldApply12[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] = new ADTFoldApply12[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] {

        override def value[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12): Target12 = {
          implicit val paramImpl1 = param1
implicit val paramImpl2 = param2
implicit val paramImpl3 = param3
implicit val paramImpl4 = param4
implicit val paramImpl5 = param5
implicit val paramImpl6 = param6
implicit val paramImpl7 = param7
implicit val paramImpl8 = param8
implicit val paramImpl9 = param9
implicit val paramImpl10 = param10
implicit val paramImpl11 = param11
implicit val paramImpl12 = param12
          ADTBuilderHelperImplicit.ForFetch[Target12].inputHList(param)
        }

      }
    

      def adtApply13[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UsePositive[T11, AdtCoProduct.UsePositive[T12, AdtCoProduct.UseOne[T13]]]]]]]]]]]]]): ADTFoldApply13[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] = new ADTFoldApply13[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] {

        override def value[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13): Target13 = {
          implicit val paramImpl1 = param1
implicit val paramImpl2 = param2
implicit val paramImpl3 = param3
implicit val paramImpl4 = param4
implicit val paramImpl5 = param5
implicit val paramImpl6 = param6
implicit val paramImpl7 = param7
implicit val paramImpl8 = param8
implicit val paramImpl9 = param9
implicit val paramImpl10 = param10
implicit val paramImpl11 = param11
implicit val paramImpl12 = param12
implicit val paramImpl13 = param13
          ADTBuilderHelperImplicit.ForFetch[Target13].inputHList(param)
        }

      }
    

      def adtApply14[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UsePositive[T11, AdtCoProduct.UsePositive[T12, AdtCoProduct.UsePositive[T13, AdtCoProduct.UseOne[T14]]]]]]]]]]]]]]): ADTFoldApply14[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] = new ADTFoldApply14[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] {

        override def value[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14): Target14 = {
          implicit val paramImpl1 = param1
implicit val paramImpl2 = param2
implicit val paramImpl3 = param3
implicit val paramImpl4 = param4
implicit val paramImpl5 = param5
implicit val paramImpl6 = param6
implicit val paramImpl7 = param7
implicit val paramImpl8 = param8
implicit val paramImpl9 = param9
implicit val paramImpl10 = param10
implicit val paramImpl11 = param11
implicit val paramImpl12 = param12
implicit val paramImpl13 = param13
implicit val paramImpl14 = param14
          ADTBuilderHelperImplicit.ForFetch[Target14].inputHList(param)
        }

      }
    

      def adtApply15[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UsePositive[T11, AdtCoProduct.UsePositive[T12, AdtCoProduct.UsePositive[T13, AdtCoProduct.UsePositive[T14, AdtCoProduct.UseOne[T15]]]]]]]]]]]]]]]): ADTFoldApply15[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] = new ADTFoldApply15[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] {

        override def value[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15): Target15 = {
          implicit val paramImpl1 = param1
implicit val paramImpl2 = param2
implicit val paramImpl3 = param3
implicit val paramImpl4 = param4
implicit val paramImpl5 = param5
implicit val paramImpl6 = param6
implicit val paramImpl7 = param7
implicit val paramImpl8 = param8
implicit val paramImpl9 = param9
implicit val paramImpl10 = param10
implicit val paramImpl11 = param11
implicit val paramImpl12 = param12
implicit val paramImpl13 = param13
implicit val paramImpl14 = param14
implicit val paramImpl15 = param15
          ADTBuilderHelperImplicit.ForFetch[Target15].inputHList(param)
        }

      }
    

      def adtApply16[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UsePositive[T11, AdtCoProduct.UsePositive[T12, AdtCoProduct.UsePositive[T13, AdtCoProduct.UsePositive[T14, AdtCoProduct.UsePositive[T15, AdtCoProduct.UseOne[T16]]]]]]]]]]]]]]]]): ADTFoldApply16[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] = new ADTFoldApply16[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] {

        override def value[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16): Target16 = {
          implicit val paramImpl1 = param1
implicit val paramImpl2 = param2
implicit val paramImpl3 = param3
implicit val paramImpl4 = param4
implicit val paramImpl5 = param5
implicit val paramImpl6 = param6
implicit val paramImpl7 = param7
implicit val paramImpl8 = param8
implicit val paramImpl9 = param9
implicit val paramImpl10 = param10
implicit val paramImpl11 = param11
implicit val paramImpl12 = param12
implicit val paramImpl13 = param13
implicit val paramImpl14 = param14
implicit val paramImpl15 = param15
implicit val paramImpl16 = param16
          ADTBuilderHelperImplicit.ForFetch[Target16].inputHList(param)
        }

      }
    

      def adtApply17[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UsePositive[T11, AdtCoProduct.UsePositive[T12, AdtCoProduct.UsePositive[T13, AdtCoProduct.UsePositive[T14, AdtCoProduct.UsePositive[T15, AdtCoProduct.UsePositive[T16, AdtCoProduct.UseOne[T17]]]]]]]]]]]]]]]]]): ADTFoldApply17[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] = new ADTFoldApply17[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] {

        override def value[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17): Target17 = {
          implicit val paramImpl1 = param1
implicit val paramImpl2 = param2
implicit val paramImpl3 = param3
implicit val paramImpl4 = param4
implicit val paramImpl5 = param5
implicit val paramImpl6 = param6
implicit val paramImpl7 = param7
implicit val paramImpl8 = param8
implicit val paramImpl9 = param9
implicit val paramImpl10 = param10
implicit val paramImpl11 = param11
implicit val paramImpl12 = param12
implicit val paramImpl13 = param13
implicit val paramImpl14 = param14
implicit val paramImpl15 = param15
implicit val paramImpl16 = param16
implicit val paramImpl17 = param17
          ADTBuilderHelperImplicit.ForFetch[Target17].inputHList(param)
        }

      }
    

      def adtApply18[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UsePositive[T11, AdtCoProduct.UsePositive[T12, AdtCoProduct.UsePositive[T13, AdtCoProduct.UsePositive[T14, AdtCoProduct.UsePositive[T15, AdtCoProduct.UsePositive[T16, AdtCoProduct.UsePositive[T17, AdtCoProduct.UseOne[T18]]]]]]]]]]]]]]]]]]): ADTFoldApply18[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = new ADTFoldApply18[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {

        override def value[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16,Target18 >: Target17](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17,param18: T18 => Target18): Target18 = {
          implicit val paramImpl1 = param1
implicit val paramImpl2 = param2
implicit val paramImpl3 = param3
implicit val paramImpl4 = param4
implicit val paramImpl5 = param5
implicit val paramImpl6 = param6
implicit val paramImpl7 = param7
implicit val paramImpl8 = param8
implicit val paramImpl9 = param9
implicit val paramImpl10 = param10
implicit val paramImpl11 = param11
implicit val paramImpl12 = param12
implicit val paramImpl13 = param13
implicit val paramImpl14 = param14
implicit val paramImpl15 = param15
implicit val paramImpl16 = param16
implicit val paramImpl17 = param17
implicit val paramImpl18 = param18
          ADTBuilderHelperImplicit.ForFetch[Target18].inputHList(param)
        }

      }
    

      def adtApply19[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UsePositive[T11, AdtCoProduct.UsePositive[T12, AdtCoProduct.UsePositive[T13, AdtCoProduct.UsePositive[T14, AdtCoProduct.UsePositive[T15, AdtCoProduct.UsePositive[T16, AdtCoProduct.UsePositive[T17, AdtCoProduct.UsePositive[T18, AdtCoProduct.UseOne[T19]]]]]]]]]]]]]]]]]]]): ADTFoldApply19[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = new ADTFoldApply19[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {

        override def value[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16,Target18 >: Target17,Target19 >: Target18](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17,param18: T18 => Target18,param19: T19 => Target19): Target19 = {
          implicit val paramImpl1 = param1
implicit val paramImpl2 = param2
implicit val paramImpl3 = param3
implicit val paramImpl4 = param4
implicit val paramImpl5 = param5
implicit val paramImpl6 = param6
implicit val paramImpl7 = param7
implicit val paramImpl8 = param8
implicit val paramImpl9 = param9
implicit val paramImpl10 = param10
implicit val paramImpl11 = param11
implicit val paramImpl12 = param12
implicit val paramImpl13 = param13
implicit val paramImpl14 = param14
implicit val paramImpl15 = param15
implicit val paramImpl16 = param16
implicit val paramImpl17 = param17
implicit val paramImpl18 = param18
implicit val paramImpl19 = param19
          ADTBuilderHelperImplicit.ForFetch[Target19].inputHList(param)
        }

      }
    

      def adtApply20[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UsePositive[T11, AdtCoProduct.UsePositive[T12, AdtCoProduct.UsePositive[T13, AdtCoProduct.UsePositive[T14, AdtCoProduct.UsePositive[T15, AdtCoProduct.UsePositive[T16, AdtCoProduct.UsePositive[T17, AdtCoProduct.UsePositive[T18, AdtCoProduct.UsePositive[T19, AdtCoProduct.UseOne[T20]]]]]]]]]]]]]]]]]]]]): ADTFoldApply20[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = new ADTFoldApply20[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {

        override def value[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16,Target18 >: Target17,Target19 >: Target18,Target20 >: Target19](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17,param18: T18 => Target18,param19: T19 => Target19,param20: T20 => Target20): Target20 = {
          implicit val paramImpl1 = param1
implicit val paramImpl2 = param2
implicit val paramImpl3 = param3
implicit val paramImpl4 = param4
implicit val paramImpl5 = param5
implicit val paramImpl6 = param6
implicit val paramImpl7 = param7
implicit val paramImpl8 = param8
implicit val paramImpl9 = param9
implicit val paramImpl10 = param10
implicit val paramImpl11 = param11
implicit val paramImpl12 = param12
implicit val paramImpl13 = param13
implicit val paramImpl14 = param14
implicit val paramImpl15 = param15
implicit val paramImpl16 = param16
implicit val paramImpl17 = param17
implicit val paramImpl18 = param18
implicit val paramImpl19 = param19
implicit val paramImpl20 = param20
          ADTBuilderHelperImplicit.ForFetch[Target20].inputHList(param)
        }

      }
    

      def adtApply21[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UsePositive[T11, AdtCoProduct.UsePositive[T12, AdtCoProduct.UsePositive[T13, AdtCoProduct.UsePositive[T14, AdtCoProduct.UsePositive[T15, AdtCoProduct.UsePositive[T16, AdtCoProduct.UsePositive[T17, AdtCoProduct.UsePositive[T18, AdtCoProduct.UsePositive[T19, AdtCoProduct.UsePositive[T20, AdtCoProduct.UseOne[T21]]]]]]]]]]]]]]]]]]]]]): ADTFoldApply21[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = new ADTFoldApply21[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {

        override def value[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16,Target18 >: Target17,Target19 >: Target18,Target20 >: Target19,Target21 >: Target20](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17,param18: T18 => Target18,param19: T19 => Target19,param20: T20 => Target20,param21: T21 => Target21): Target21 = {
          implicit val paramImpl1 = param1
implicit val paramImpl2 = param2
implicit val paramImpl3 = param3
implicit val paramImpl4 = param4
implicit val paramImpl5 = param5
implicit val paramImpl6 = param6
implicit val paramImpl7 = param7
implicit val paramImpl8 = param8
implicit val paramImpl9 = param9
implicit val paramImpl10 = param10
implicit val paramImpl11 = param11
implicit val paramImpl12 = param12
implicit val paramImpl13 = param13
implicit val paramImpl14 = param14
implicit val paramImpl15 = param15
implicit val paramImpl16 = param16
implicit val paramImpl17 = param17
implicit val paramImpl18 = param18
implicit val paramImpl19 = param19
implicit val paramImpl20 = param20
implicit val paramImpl21 = param21
          ADTBuilderHelperImplicit.ForFetch[Target21].inputHList(param)
        }

      }
    

      def adtApply22[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UsePositive[T11, AdtCoProduct.UsePositive[T12, AdtCoProduct.UsePositive[T13, AdtCoProduct.UsePositive[T14, AdtCoProduct.UsePositive[T15, AdtCoProduct.UsePositive[T16, AdtCoProduct.UsePositive[T17, AdtCoProduct.UsePositive[T18, AdtCoProduct.UsePositive[T19, AdtCoProduct.UsePositive[T20, AdtCoProduct.UsePositive[T21, AdtCoProduct.UseOne[T22]]]]]]]]]]]]]]]]]]]]]]): ADTFoldApply22[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = new ADTFoldApply22[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {

        override def value[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16,Target18 >: Target17,Target19 >: Target18,Target20 >: Target19,Target21 >: Target20,Target22 >: Target21](param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17,param18: T18 => Target18,param19: T19 => Target19,param20: T20 => Target20,param21: T21 => Target21,param22: T22 => Target22): Target22 = {
          implicit val paramImpl1 = param1
implicit val paramImpl2 = param2
implicit val paramImpl3 = param3
implicit val paramImpl4 = param4
implicit val paramImpl5 = param5
implicit val paramImpl6 = param6
implicit val paramImpl7 = param7
implicit val paramImpl8 = param8
implicit val paramImpl9 = param9
implicit val paramImpl10 = param10
implicit val paramImpl11 = param11
implicit val paramImpl12 = param12
implicit val paramImpl13 = param13
implicit val paramImpl14 = param14
implicit val paramImpl15 = param15
implicit val paramImpl16 = param16
implicit val paramImpl17 = param17
implicit val paramImpl18 = param18
implicit val paramImpl19 = param19
implicit val paramImpl20 = param20
implicit val paramImpl21 = param21
implicit val paramImpl22 = param22
          ADTBuilderHelperImplicit.ForFetch[Target22].inputHList(param)
        }

      }
    
    }
  