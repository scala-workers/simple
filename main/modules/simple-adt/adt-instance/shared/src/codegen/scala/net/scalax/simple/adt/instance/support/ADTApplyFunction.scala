
    package net.scalax.simple.adt
    package instance
    package support

    object ADTApplyFunction {
      
      def adtApply1[
        T1
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.zero.type]): ADTFoldApply1[Nothing,  T1] = new ADTFoldApply1[Nothing,  T1] {

        override protected def foldValueOpt[Target1 >: Nothing](implicit param1: T1 => Target1): Option[Target1] = ADTBuilderHelperImplicit.ToOptionHelper.target[Target1].inputHList(param).fetchHList

      }
    

      def adtApply2[
        T1,T2
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.zero.type]]): ADTFoldApply2[Nothing,  T1,T2] = new ADTFoldApply2[Nothing,  T1,T2] {

        override protected def foldValueOpt[Target1 >: Nothing,Target2 >: Target1](implicit param1: T1 => Target1,param2: T2 => Target2): Option[Target2] = ADTBuilderHelperImplicit.ToOptionHelper.target[Target2].inputHList(param).fetchHList

      }
    

      def adtApply3[
        T1,T2,T3
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.zero.type]]]): ADTFoldApply3[Nothing,  T1,T2,T3] = new ADTFoldApply3[Nothing,  T1,T2,T3] {

        override protected def foldValueOpt[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2](implicit param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3): Option[Target3] = ADTBuilderHelperImplicit.ToOptionHelper.target[Target3].inputHList(param).fetchHList

      }
    

      def adtApply4[
        T1,T2,T3,T4
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.zero.type]]]]): ADTFoldApply4[Nothing,  T1,T2,T3,T4] = new ADTFoldApply4[Nothing,  T1,T2,T3,T4] {

        override protected def foldValueOpt[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3](implicit param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4): Option[Target4] = ADTBuilderHelperImplicit.ToOptionHelper.target[Target4].inputHList(param).fetchHList

      }
    

      def adtApply5[
        T1,T2,T3,T4,T5
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.zero.type]]]]]): ADTFoldApply5[Nothing,  T1,T2,T3,T4,T5] = new ADTFoldApply5[Nothing,  T1,T2,T3,T4,T5] {

        override protected def foldValueOpt[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4](implicit param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5): Option[Target5] = ADTBuilderHelperImplicit.ToOptionHelper.target[Target5].inputHList(param).fetchHList

      }
    

      def adtApply6[
        T1,T2,T3,T4,T5,T6
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.zero.type]]]]]]): ADTFoldApply6[Nothing,  T1,T2,T3,T4,T5,T6] = new ADTFoldApply6[Nothing,  T1,T2,T3,T4,T5,T6] {

        override protected def foldValueOpt[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5](implicit param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6): Option[Target6] = ADTBuilderHelperImplicit.ToOptionHelper.target[Target6].inputHList(param).fetchHList

      }
    

      def adtApply7[
        T1,T2,T3,T4,T5,T6,T7
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.zero.type]]]]]]]): ADTFoldApply7[Nothing,  T1,T2,T3,T4,T5,T6,T7] = new ADTFoldApply7[Nothing,  T1,T2,T3,T4,T5,T6,T7] {

        override protected def foldValueOpt[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6](implicit param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7): Option[Target7] = ADTBuilderHelperImplicit.ToOptionHelper.target[Target7].inputHList(param).fetchHList

      }
    

      def adtApply8[
        T1,T2,T3,T4,T5,T6,T7,T8
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.zero.type]]]]]]]]): ADTFoldApply8[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8] = new ADTFoldApply8[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8] {

        override protected def foldValueOpt[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7](implicit param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8): Option[Target8] = ADTBuilderHelperImplicit.ToOptionHelper.target[Target8].inputHList(param).fetchHList

      }
    

      def adtApply9[
        T1,T2,T3,T4,T5,T6,T7,T8,T9
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.zero.type]]]]]]]]]): ADTFoldApply9[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9] = new ADTFoldApply9[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9] {

        override protected def foldValueOpt[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8](implicit param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9): Option[Target9] = ADTBuilderHelperImplicit.ToOptionHelper.target[Target9].inputHList(param).fetchHList

      }
    

      def adtApply10[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.zero.type]]]]]]]]]]): ADTFoldApply10[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] = new ADTFoldApply10[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] {

        override protected def foldValueOpt[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9](implicit param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10): Option[Target10] = ADTBuilderHelperImplicit.ToOptionHelper.target[Target10].inputHList(param).fetchHList

      }
    

      def adtApply11[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UsePositive[T11, AdtCoProduct.zero.type]]]]]]]]]]]): ADTFoldApply11[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] = new ADTFoldApply11[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] {

        override protected def foldValueOpt[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10](implicit param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11): Option[Target11] = ADTBuilderHelperImplicit.ToOptionHelper.target[Target11].inputHList(param).fetchHList

      }
    

      def adtApply12[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UsePositive[T11, AdtCoProduct.UsePositive[T12, AdtCoProduct.zero.type]]]]]]]]]]]]): ADTFoldApply12[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] = new ADTFoldApply12[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] {

        override protected def foldValueOpt[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11](implicit param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12): Option[Target12] = ADTBuilderHelperImplicit.ToOptionHelper.target[Target12].inputHList(param).fetchHList

      }
    

      def adtApply13[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UsePositive[T11, AdtCoProduct.UsePositive[T12, AdtCoProduct.UsePositive[T13, AdtCoProduct.zero.type]]]]]]]]]]]]]): ADTFoldApply13[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] = new ADTFoldApply13[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] {

        override protected def foldValueOpt[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12](implicit param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13): Option[Target13] = ADTBuilderHelperImplicit.ToOptionHelper.target[Target13].inputHList(param).fetchHList

      }
    

      def adtApply14[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UsePositive[T11, AdtCoProduct.UsePositive[T12, AdtCoProduct.UsePositive[T13, AdtCoProduct.UsePositive[T14, AdtCoProduct.zero.type]]]]]]]]]]]]]]): ADTFoldApply14[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] = new ADTFoldApply14[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] {

        override protected def foldValueOpt[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13](implicit param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14): Option[Target14] = ADTBuilderHelperImplicit.ToOptionHelper.target[Target14].inputHList(param).fetchHList

      }
    

      def adtApply15[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UsePositive[T11, AdtCoProduct.UsePositive[T12, AdtCoProduct.UsePositive[T13, AdtCoProduct.UsePositive[T14, AdtCoProduct.UsePositive[T15, AdtCoProduct.zero.type]]]]]]]]]]]]]]]): ADTFoldApply15[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] = new ADTFoldApply15[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] {

        override protected def foldValueOpt[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14](implicit param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15): Option[Target15] = ADTBuilderHelperImplicit.ToOptionHelper.target[Target15].inputHList(param).fetchHList

      }
    

      def adtApply16[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UsePositive[T11, AdtCoProduct.UsePositive[T12, AdtCoProduct.UsePositive[T13, AdtCoProduct.UsePositive[T14, AdtCoProduct.UsePositive[T15, AdtCoProduct.UsePositive[T16, AdtCoProduct.zero.type]]]]]]]]]]]]]]]]): ADTFoldApply16[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] = new ADTFoldApply16[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] {

        override protected def foldValueOpt[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15](implicit param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16): Option[Target16] = ADTBuilderHelperImplicit.ToOptionHelper.target[Target16].inputHList(param).fetchHList

      }
    

      def adtApply17[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UsePositive[T11, AdtCoProduct.UsePositive[T12, AdtCoProduct.UsePositive[T13, AdtCoProduct.UsePositive[T14, AdtCoProduct.UsePositive[T15, AdtCoProduct.UsePositive[T16, AdtCoProduct.UsePositive[T17, AdtCoProduct.zero.type]]]]]]]]]]]]]]]]]): ADTFoldApply17[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] = new ADTFoldApply17[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] {

        override protected def foldValueOpt[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16](implicit param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17): Option[Target17] = ADTBuilderHelperImplicit.ToOptionHelper.target[Target17].inputHList(param).fetchHList

      }
    

      def adtApply18[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UsePositive[T11, AdtCoProduct.UsePositive[T12, AdtCoProduct.UsePositive[T13, AdtCoProduct.UsePositive[T14, AdtCoProduct.UsePositive[T15, AdtCoProduct.UsePositive[T16, AdtCoProduct.UsePositive[T17, AdtCoProduct.UsePositive[T18, AdtCoProduct.zero.type]]]]]]]]]]]]]]]]]]): ADTFoldApply18[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = new ADTFoldApply18[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {

        override protected def foldValueOpt[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16,Target18 >: Target17](implicit param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17,param18: T18 => Target18): Option[Target18] = ADTBuilderHelperImplicit.ToOptionHelper.target[Target18].inputHList(param).fetchHList

      }
    

      def adtApply19[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UsePositive[T11, AdtCoProduct.UsePositive[T12, AdtCoProduct.UsePositive[T13, AdtCoProduct.UsePositive[T14, AdtCoProduct.UsePositive[T15, AdtCoProduct.UsePositive[T16, AdtCoProduct.UsePositive[T17, AdtCoProduct.UsePositive[T18, AdtCoProduct.UsePositive[T19, AdtCoProduct.zero.type]]]]]]]]]]]]]]]]]]]): ADTFoldApply19[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = new ADTFoldApply19[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {

        override protected def foldValueOpt[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16,Target18 >: Target17,Target19 >: Target18](implicit param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17,param18: T18 => Target18,param19: T19 => Target19): Option[Target19] = ADTBuilderHelperImplicit.ToOptionHelper.target[Target19].inputHList(param).fetchHList

      }
    

      def adtApply20[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UsePositive[T11, AdtCoProduct.UsePositive[T12, AdtCoProduct.UsePositive[T13, AdtCoProduct.UsePositive[T14, AdtCoProduct.UsePositive[T15, AdtCoProduct.UsePositive[T16, AdtCoProduct.UsePositive[T17, AdtCoProduct.UsePositive[T18, AdtCoProduct.UsePositive[T19, AdtCoProduct.UsePositive[T20, AdtCoProduct.zero.type]]]]]]]]]]]]]]]]]]]]): ADTFoldApply20[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = new ADTFoldApply20[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {

        override protected def foldValueOpt[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16,Target18 >: Target17,Target19 >: Target18,Target20 >: Target19](implicit param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17,param18: T18 => Target18,param19: T19 => Target19,param20: T20 => Target20): Option[Target20] = ADTBuilderHelperImplicit.ToOptionHelper.target[Target20].inputHList(param).fetchHList

      }
    

      def adtApply21[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UsePositive[T11, AdtCoProduct.UsePositive[T12, AdtCoProduct.UsePositive[T13, AdtCoProduct.UsePositive[T14, AdtCoProduct.UsePositive[T15, AdtCoProduct.UsePositive[T16, AdtCoProduct.UsePositive[T17, AdtCoProduct.UsePositive[T18, AdtCoProduct.UsePositive[T19, AdtCoProduct.UsePositive[T20, AdtCoProduct.UsePositive[T21, AdtCoProduct.zero.type]]]]]]]]]]]]]]]]]]]]]): ADTFoldApply21[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = new ADTFoldApply21[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {

        override protected def foldValueOpt[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16,Target18 >: Target17,Target19 >: Target18,Target20 >: Target19,Target21 >: Target20](implicit param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17,param18: T18 => Target18,param19: T19 => Target19,param20: T20 => Target20,param21: T21 => Target21): Option[Target21] = ADTBuilderHelperImplicit.ToOptionHelper.target[Target21].inputHList(param).fetchHList

      }
    

      def adtApply22[
        T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22
      ](param: AdtCoProduct.UsePositive[T1, AdtCoProduct.UsePositive[T2, AdtCoProduct.UsePositive[T3, AdtCoProduct.UsePositive[T4, AdtCoProduct.UsePositive[T5, AdtCoProduct.UsePositive[T6, AdtCoProduct.UsePositive[T7, AdtCoProduct.UsePositive[T8, AdtCoProduct.UsePositive[T9, AdtCoProduct.UsePositive[T10, AdtCoProduct.UsePositive[T11, AdtCoProduct.UsePositive[T12, AdtCoProduct.UsePositive[T13, AdtCoProduct.UsePositive[T14, AdtCoProduct.UsePositive[T15, AdtCoProduct.UsePositive[T16, AdtCoProduct.UsePositive[T17, AdtCoProduct.UsePositive[T18, AdtCoProduct.UsePositive[T19, AdtCoProduct.UsePositive[T20, AdtCoProduct.UsePositive[T21, AdtCoProduct.UsePositive[T22, AdtCoProduct.zero.type]]]]]]]]]]]]]]]]]]]]]]): ADTFoldApply22[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = new ADTFoldApply22[Nothing,  T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {

        override protected def foldValueOpt[Target1 >: Nothing,Target2 >: Target1,Target3 >: Target2,Target4 >: Target3,Target5 >: Target4,Target6 >: Target5,Target7 >: Target6,Target8 >: Target7,Target9 >: Target8,Target10 >: Target9,Target11 >: Target10,Target12 >: Target11,Target13 >: Target12,Target14 >: Target13,Target15 >: Target14,Target16 >: Target15,Target17 >: Target16,Target18 >: Target17,Target19 >: Target18,Target20 >: Target19,Target21 >: Target20,Target22 >: Target21](implicit param1: T1 => Target1,param2: T2 => Target2,param3: T3 => Target3,param4: T4 => Target4,param5: T5 => Target5,param6: T6 => Target6,param7: T7 => Target7,param8: T8 => Target8,param9: T9 => Target9,param10: T10 => Target10,param11: T11 => Target11,param12: T12 => Target12,param13: T13 => Target13,param14: T14 => Target14,param15: T15 => Target15,param16: T16 => Target16,param17: T17 => Target17,param18: T18 => Target18,param19: T19 => Target19,param20: T20 => Target20,param21: T21 => Target21,param22: T22 => Target22): Option[Target22] = ADTBuilderHelperImplicit.ToOptionHelper.target[Target22].inputHList(param).fetchHList

      }
    
    }
  