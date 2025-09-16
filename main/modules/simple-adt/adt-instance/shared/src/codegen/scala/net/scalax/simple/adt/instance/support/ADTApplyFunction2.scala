
    package net.scalax.simple.adt
    package instance
    package support

    trait ADTApplyFunction2 {
      Self: ADTUnapplyBuilder =>
      
      trait CoProduct1Apply[T1] extends Self.ADTOptionsUnapply1 {
        def apply[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UseOne[AdtFunction[Target, T1]]]): CoProduct1[T1] = {
          ADTApplyFunction.adtApply1(ADTFuncBuilderHelper.inputHList(param.value, target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UseOne[AdtFunction[Target, T1]]]): CoProduct1[AdtFunction[Target, T1]] = {
          ADTApplyFunction.adtApply1(param.value)
        }
      }

      def CoProduct1[T1]: CoProduct1Apply[T1] =
        new CoProduct1Apply[T1] {
          //
        }
    

      trait CoProduct2Apply[T1,T2] extends Self.ADTOptionsUnapply2 {
        def apply[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UseOne[AdtFunction[Target, T2]]]]): CoProduct2[T1,T2] = {
          ADTApplyFunction.adtApply2(ADTFuncBuilderHelper.inputHList(param.value, target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UseOne[AdtFunction[Target, T2]]]]): CoProduct2[AdtFunction[Target, T1],AdtFunction[Target, T2]] = {
          ADTApplyFunction.adtApply2(param.value)
        }
      }

      def CoProduct2[T1,T2]: CoProduct2Apply[T1,T2] =
        new CoProduct2Apply[T1,T2] {
          //
        }
    

      trait CoProduct3Apply[T1,T2,T3] extends Self.ADTOptionsUnapply3 {
        def apply[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UseOne[AdtFunction[Target, T3]]]]]): CoProduct3[T1,T2,T3] = {
          ADTApplyFunction.adtApply3(ADTFuncBuilderHelper.inputHList(param.value, target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UseOne[AdtFunction[Target, T3]]]]]): CoProduct3[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3]] = {
          ADTApplyFunction.adtApply3(param.value)
        }
      }

      def CoProduct3[T1,T2,T3]: CoProduct3Apply[T1,T2,T3] =
        new CoProduct3Apply[T1,T2,T3] {
          //
        }
    

      trait CoProduct4Apply[T1,T2,T3,T4] extends Self.ADTOptionsUnapply4 {
        def apply[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UseOne[AdtFunction[Target, T4]]]]]]): CoProduct4[T1,T2,T3,T4] = {
          ADTApplyFunction.adtApply4(ADTFuncBuilderHelper.inputHList(param.value, target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UseOne[AdtFunction[Target, T4]]]]]]): CoProduct4[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4]] = {
          ADTApplyFunction.adtApply4(param.value)
        }
      }

      def CoProduct4[T1,T2,T3,T4]: CoProduct4Apply[T1,T2,T3,T4] =
        new CoProduct4Apply[T1,T2,T3,T4] {
          //
        }
    

      trait CoProduct5Apply[T1,T2,T3,T4,T5] extends Self.ADTOptionsUnapply5 {
        def apply[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UseOne[AdtFunction[Target, T5]]]]]]]): CoProduct5[T1,T2,T3,T4,T5] = {
          ADTApplyFunction.adtApply5(ADTFuncBuilderHelper.inputHList(param.value, target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UseOne[AdtFunction[Target, T5]]]]]]]): CoProduct5[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5]] = {
          ADTApplyFunction.adtApply5(param.value)
        }
      }

      def CoProduct5[T1,T2,T3,T4,T5]: CoProduct5Apply[T1,T2,T3,T4,T5] =
        new CoProduct5Apply[T1,T2,T3,T4,T5] {
          //
        }
    

      trait CoProduct6Apply[T1,T2,T3,T4,T5,T6] extends Self.ADTOptionsUnapply6 {
        def apply[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UseOne[AdtFunction[Target, T6]]]]]]]]): CoProduct6[T1,T2,T3,T4,T5,T6] = {
          ADTApplyFunction.adtApply6(ADTFuncBuilderHelper.inputHList(param.value, target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UseOne[AdtFunction[Target, T6]]]]]]]]): CoProduct6[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6]] = {
          ADTApplyFunction.adtApply6(param.value)
        }
      }

      def CoProduct6[T1,T2,T3,T4,T5,T6]: CoProduct6Apply[T1,T2,T3,T4,T5,T6] =
        new CoProduct6Apply[T1,T2,T3,T4,T5,T6] {
          //
        }
    

      trait CoProduct7Apply[T1,T2,T3,T4,T5,T6,T7] extends Self.ADTOptionsUnapply7 {
        def apply[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UseOne[AdtFunction[Target, T7]]]]]]]]]): CoProduct7[T1,T2,T3,T4,T5,T6,T7] = {
          ADTApplyFunction.adtApply7(ADTFuncBuilderHelper.inputHList(param.value, target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UseOne[AdtFunction[Target, T7]]]]]]]]]): CoProduct7[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7]] = {
          ADTApplyFunction.adtApply7(param.value)
        }
      }

      def CoProduct7[T1,T2,T3,T4,T5,T6,T7]: CoProduct7Apply[T1,T2,T3,T4,T5,T6,T7] =
        new CoProduct7Apply[T1,T2,T3,T4,T5,T6,T7] {
          //
        }
    

      trait CoProduct8Apply[T1,T2,T3,T4,T5,T6,T7,T8] extends Self.ADTOptionsUnapply8 {
        def apply[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UseOne[AdtFunction[Target, T8]]]]]]]]]]): CoProduct8[T1,T2,T3,T4,T5,T6,T7,T8] = {
          ADTApplyFunction.adtApply8(ADTFuncBuilderHelper.inputHList(param.value, target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UseOne[AdtFunction[Target, T8]]]]]]]]]]): CoProduct8[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8]] = {
          ADTApplyFunction.adtApply8(param.value)
        }
      }

      def CoProduct8[T1,T2,T3,T4,T5,T6,T7,T8]: CoProduct8Apply[T1,T2,T3,T4,T5,T6,T7,T8] =
        new CoProduct8Apply[T1,T2,T3,T4,T5,T6,T7,T8] {
          //
        }
    

      trait CoProduct9Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9] extends Self.ADTOptionsUnapply9 {
        def apply[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UseOne[AdtFunction[Target, T9]]]]]]]]]]]): CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T9] = {
          ADTApplyFunction.adtApply9(ADTFuncBuilderHelper.inputHList(param.value, target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UseOne[AdtFunction[Target, T9]]]]]]]]]]]): CoProduct9[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9]] = {
          ADTApplyFunction.adtApply9(param.value)
        }
      }

      def CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T9]: CoProduct9Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9] =
        new CoProduct9Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9] {
          //
        }
    

      trait CoProduct10Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] extends Self.ADTOptionsUnapply10 {
        def apply[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UseOne[AdtFunction[Target, T10]]]]]]]]]]]]): CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] = {
          ADTApplyFunction.adtApply10(ADTFuncBuilderHelper.inputHList(param.value, target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UseOne[AdtFunction[Target, T10]]]]]]]]]]]]): CoProduct10[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10]] = {
          ADTApplyFunction.adtApply10(param.value)
        }
      }

      def CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]: CoProduct10Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] =
        new CoProduct10Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] {
          //
        }
    

      trait CoProduct11Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] extends Self.ADTOptionsUnapply11 {
        def apply[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UseOne[AdtFunction[Target, T11]]]]]]]]]]]]]): CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] = {
          ADTApplyFunction.adtApply11(ADTFuncBuilderHelper.inputHList(param.value, target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UseOne[AdtFunction[Target, T11]]]]]]]]]]]]]): CoProduct11[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11]] = {
          ADTApplyFunction.adtApply11(param.value)
        }
      }

      def CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]: CoProduct11Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] =
        new CoProduct11Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] {
          //
        }
    

      trait CoProduct12Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] extends Self.ADTOptionsUnapply12 {
        def apply[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UseOne[AdtFunction[Target, T12]]]]]]]]]]]]]]): CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] = {
          ADTApplyFunction.adtApply12(ADTFuncBuilderHelper.inputHList(param.value, target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UseOne[AdtFunction[Target, T12]]]]]]]]]]]]]]): CoProduct12[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12]] = {
          ADTApplyFunction.adtApply12(param.value)
        }
      }

      def CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]: CoProduct12Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] =
        new CoProduct12Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] {
          //
        }
    

      trait CoProduct13Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] extends Self.ADTOptionsUnapply13 {
        def apply[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UseOne[AdtFunction[Target, T13]]]]]]]]]]]]]]]): CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] = {
          ADTApplyFunction.adtApply13(ADTFuncBuilderHelper.inputHList(param.value, target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UseOne[AdtFunction[Target, T13]]]]]]]]]]]]]]]): CoProduct13[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13]] = {
          ADTApplyFunction.adtApply13(param.value)
        }
      }

      def CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]: CoProduct13Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] =
        new CoProduct13Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] {
          //
        }
    

      trait CoProduct14Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] extends Self.ADTOptionsUnapply14 {
        def apply[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UseOne[AdtFunction[Target, T14]]]]]]]]]]]]]]]]): CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] = {
          ADTApplyFunction.adtApply14(ADTFuncBuilderHelper.inputHList(param.value, target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UseOne[AdtFunction[Target, T14]]]]]]]]]]]]]]]]): CoProduct14[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14]] = {
          ADTApplyFunction.adtApply14(param.value)
        }
      }

      def CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]: CoProduct14Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] =
        new CoProduct14Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] {
          //
        }
    

      trait CoProduct15Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] extends Self.ADTOptionsUnapply15 {
        def apply[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UseOne[AdtFunction[Target, T15]]]]]]]]]]]]]]]]]): CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] = {
          ADTApplyFunction.adtApply15(ADTFuncBuilderHelper.inputHList(param.value, target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UseOne[AdtFunction[Target, T15]]]]]]]]]]]]]]]]]): CoProduct15[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15]] = {
          ADTApplyFunction.adtApply15(param.value)
        }
      }

      def CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]: CoProduct15Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] =
        new CoProduct15Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] {
          //
        }
    

      trait CoProduct16Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] extends Self.ADTOptionsUnapply16 {
        def apply[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UseOne[AdtFunction[Target, T16]]]]]]]]]]]]]]]]]]): CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] = {
          ADTApplyFunction.adtApply16(ADTFuncBuilderHelper.inputHList(param.value, target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UseOne[AdtFunction[Target, T16]]]]]]]]]]]]]]]]]]): CoProduct16[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15],AdtFunction[Target, T16]] = {
          ADTApplyFunction.adtApply16(param.value)
        }
      }

      def CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]: CoProduct16Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] =
        new CoProduct16Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] {
          //
        }
    

      trait CoProduct17Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] extends Self.ADTOptionsUnapply17 {
        def apply[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UseOne[AdtFunction[Target, T17]]]]]]]]]]]]]]]]]]]): CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] = {
          ADTApplyFunction.adtApply17(ADTFuncBuilderHelper.inputHList(param.value, target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UseOne[AdtFunction[Target, T17]]]]]]]]]]]]]]]]]]]): CoProduct17[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15],AdtFunction[Target, T16],AdtFunction[Target, T17]] = {
          ADTApplyFunction.adtApply17(param.value)
        }
      }

      def CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]: CoProduct17Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] =
        new CoProduct17Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] {
          //
        }
    

      trait CoProduct18Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] extends Self.ADTOptionsUnapply18 {
        def apply[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UseOne[AdtFunction[Target, T18]]]]]]]]]]]]]]]]]]]]): CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = {
          ADTApplyFunction.adtApply18(ADTFuncBuilderHelper.inputHList(param.value, target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UseOne[AdtFunction[Target, T18]]]]]]]]]]]]]]]]]]]]): CoProduct18[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15],AdtFunction[Target, T16],AdtFunction[Target, T17],AdtFunction[Target, T18]] = {
          ADTApplyFunction.adtApply18(param.value)
        }
      }

      def CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]: CoProduct18Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] =
        new CoProduct18Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {
          //
        }
    

      trait CoProduct19Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] extends Self.ADTOptionsUnapply19 {
        def apply[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UseOne[AdtFunction[Target, T19]]]]]]]]]]]]]]]]]]]]]): CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = {
          ADTApplyFunction.adtApply19(ADTFuncBuilderHelper.inputHList(param.value, target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UseOne[AdtFunction[Target, T19]]]]]]]]]]]]]]]]]]]]]): CoProduct19[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15],AdtFunction[Target, T16],AdtFunction[Target, T17],AdtFunction[Target, T18],AdtFunction[Target, T19]] = {
          ADTApplyFunction.adtApply19(param.value)
        }
      }

      def CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]: CoProduct19Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] =
        new CoProduct19Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
          //
        }
    

      trait CoProduct20Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] extends Self.ADTOptionsUnapply20 {
        def apply[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UsePositive[AdtFunction[Target, T19], AdtCoProduct.UseOne[AdtFunction[Target, T20]]]]]]]]]]]]]]]]]]]]]]): CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = {
          ADTApplyFunction.adtApply20(ADTFuncBuilderHelper.inputHList(param.value, target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UsePositive[AdtFunction[Target, T19], AdtCoProduct.UseOne[AdtFunction[Target, T20]]]]]]]]]]]]]]]]]]]]]]): CoProduct20[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15],AdtFunction[Target, T16],AdtFunction[Target, T17],AdtFunction[Target, T18],AdtFunction[Target, T19],AdtFunction[Target, T20]] = {
          ADTApplyFunction.adtApply20(param.value)
        }
      }

      def CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]: CoProduct20Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] =
        new CoProduct20Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
          //
        }
    

      trait CoProduct21Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] extends Self.ADTOptionsUnapply21 {
        def apply[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UsePositive[AdtFunction[Target, T19], AdtCoProduct.UsePositive[AdtFunction[Target, T20], AdtCoProduct.UseOne[AdtFunction[Target, T21]]]]]]]]]]]]]]]]]]]]]]]): CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = {
          ADTApplyFunction.adtApply21(ADTFuncBuilderHelper.inputHList(param.value, target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UsePositive[AdtFunction[Target, T19], AdtCoProduct.UsePositive[AdtFunction[Target, T20], AdtCoProduct.UseOne[AdtFunction[Target, T21]]]]]]]]]]]]]]]]]]]]]]]): CoProduct21[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15],AdtFunction[Target, T16],AdtFunction[Target, T17],AdtFunction[Target, T18],AdtFunction[Target, T19],AdtFunction[Target, T20],AdtFunction[Target, T21]] = {
          ADTApplyFunction.adtApply21(param.value)
        }
      }

      def CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]: CoProduct21Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] =
        new CoProduct21Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
          //
        }
    

      trait CoProduct22Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] extends Self.ADTOptionsUnapply22 {
        def apply[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UsePositive[AdtFunction[Target, T19], AdtCoProduct.UsePositive[AdtFunction[Target, T20], AdtCoProduct.UsePositive[AdtFunction[Target, T21], AdtCoProduct.UseOne[AdtFunction[Target, T22]]]]]]]]]]]]]]]]]]]]]]]]): CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = {
          ADTApplyFunction.adtApply22(ADTFuncBuilderHelper.inputHList(param.value, target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UsePositive[AdtFunction[Target, T19], AdtCoProduct.UsePositive[AdtFunction[Target, T20], AdtCoProduct.UsePositive[AdtFunction[Target, T21], AdtCoProduct.UseOne[AdtFunction[Target, T22]]]]]]]]]]]]]]]]]]]]]]]]): CoProduct22[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15],AdtFunction[Target, T16],AdtFunction[Target, T17],AdtFunction[Target, T18],AdtFunction[Target, T19],AdtFunction[Target, T20],AdtFunction[Target, T21],AdtFunction[Target, T22]] = {
          ADTApplyFunction.adtApply22(param.value)
        }
      }

      def CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]: CoProduct22Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] =
        new CoProduct22Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
          //
        }
    
    }
  