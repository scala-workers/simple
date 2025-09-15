
    package net.scalax.simple.adt
    package instance
    package support

    trait ADTApplyFunction2 {
      
      trait ADTOptions1[T1] {
        def input[Target](target: Target)(implicit param: AdtCoProduct.UseOne[AdtFunction[Target, T1]]): ADTFoldApply1[Nothing, T1] = {
          ADTApplyFunction.adtApply1(ADTFuncBuilderHelper.inputHList(param, target))
        }

        def typeOnly[Target](implicit param: AdtCoProduct.UseOne[AdtFunction[Target, T1]]): ADTFoldApply1[Nothing, AdtFunction[Target, T1]] = {
          ADTApplyFunction.adtApply1(param)
        }
      }
    

      trait ADTOptions2[T1,T2] {
        def input[Target](target: Target)(implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UseOne[AdtFunction[Target, T2]]]): ADTFoldApply2[Nothing, T1,T2] = {
          ADTApplyFunction.adtApply2(ADTFuncBuilderHelper.inputHList(param, target))
        }

        def typeOnly[Target](implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UseOne[AdtFunction[Target, T2]]]): ADTFoldApply2[Nothing, AdtFunction[Target, T1],AdtFunction[Target, T2]] = {
          ADTApplyFunction.adtApply2(param)
        }
      }
    

      trait ADTOptions3[T1,T2,T3] {
        def input[Target](target: Target)(implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UseOne[AdtFunction[Target, T3]]]]): ADTFoldApply3[Nothing, T1,T2,T3] = {
          ADTApplyFunction.adtApply3(ADTFuncBuilderHelper.inputHList(param, target))
        }

        def typeOnly[Target](implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UseOne[AdtFunction[Target, T3]]]]): ADTFoldApply3[Nothing, AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3]] = {
          ADTApplyFunction.adtApply3(param)
        }
      }
    

      trait ADTOptions4[T1,T2,T3,T4] {
        def input[Target](target: Target)(implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UseOne[AdtFunction[Target, T4]]]]]): ADTFoldApply4[Nothing, T1,T2,T3,T4] = {
          ADTApplyFunction.adtApply4(ADTFuncBuilderHelper.inputHList(param, target))
        }

        def typeOnly[Target](implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UseOne[AdtFunction[Target, T4]]]]]): ADTFoldApply4[Nothing, AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4]] = {
          ADTApplyFunction.adtApply4(param)
        }
      }
    

      trait ADTOptions5[T1,T2,T3,T4,T5] {
        def input[Target](target: Target)(implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UseOne[AdtFunction[Target, T5]]]]]]): ADTFoldApply5[Nothing, T1,T2,T3,T4,T5] = {
          ADTApplyFunction.adtApply5(ADTFuncBuilderHelper.inputHList(param, target))
        }

        def typeOnly[Target](implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UseOne[AdtFunction[Target, T5]]]]]]): ADTFoldApply5[Nothing, AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5]] = {
          ADTApplyFunction.adtApply5(param)
        }
      }
    

      trait ADTOptions6[T1,T2,T3,T4,T5,T6] {
        def input[Target](target: Target)(implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UseOne[AdtFunction[Target, T6]]]]]]]): ADTFoldApply6[Nothing, T1,T2,T3,T4,T5,T6] = {
          ADTApplyFunction.adtApply6(ADTFuncBuilderHelper.inputHList(param, target))
        }

        def typeOnly[Target](implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UseOne[AdtFunction[Target, T6]]]]]]]): ADTFoldApply6[Nothing, AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6]] = {
          ADTApplyFunction.adtApply6(param)
        }
      }
    

      trait ADTOptions7[T1,T2,T3,T4,T5,T6,T7] {
        def input[Target](target: Target)(implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UseOne[AdtFunction[Target, T7]]]]]]]]): ADTFoldApply7[Nothing, T1,T2,T3,T4,T5,T6,T7] = {
          ADTApplyFunction.adtApply7(ADTFuncBuilderHelper.inputHList(param, target))
        }

        def typeOnly[Target](implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UseOne[AdtFunction[Target, T7]]]]]]]]): ADTFoldApply7[Nothing, AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7]] = {
          ADTApplyFunction.adtApply7(param)
        }
      }
    

      trait ADTOptions8[T1,T2,T3,T4,T5,T6,T7,T8] {
        def input[Target](target: Target)(implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UseOne[AdtFunction[Target, T8]]]]]]]]]): ADTFoldApply8[Nothing, T1,T2,T3,T4,T5,T6,T7,T8] = {
          ADTApplyFunction.adtApply8(ADTFuncBuilderHelper.inputHList(param, target))
        }

        def typeOnly[Target](implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UseOne[AdtFunction[Target, T8]]]]]]]]]): ADTFoldApply8[Nothing, AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8]] = {
          ADTApplyFunction.adtApply8(param)
        }
      }
    

      trait ADTOptions9[T1,T2,T3,T4,T5,T6,T7,T8,T9] {
        def input[Target](target: Target)(implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UseOne[AdtFunction[Target, T9]]]]]]]]]]): ADTFoldApply9[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9] = {
          ADTApplyFunction.adtApply9(ADTFuncBuilderHelper.inputHList(param, target))
        }

        def typeOnly[Target](implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UseOne[AdtFunction[Target, T9]]]]]]]]]]): ADTFoldApply9[Nothing, AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9]] = {
          ADTApplyFunction.adtApply9(param)
        }
      }
    

      trait ADTOptions10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] {
        def input[Target](target: Target)(implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UseOne[AdtFunction[Target, T10]]]]]]]]]]]): ADTFoldApply10[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] = {
          ADTApplyFunction.adtApply10(ADTFuncBuilderHelper.inputHList(param, target))
        }

        def typeOnly[Target](implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UseOne[AdtFunction[Target, T10]]]]]]]]]]]): ADTFoldApply10[Nothing, AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10]] = {
          ADTApplyFunction.adtApply10(param)
        }
      }
    

      trait ADTOptions11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] {
        def input[Target](target: Target)(implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UseOne[AdtFunction[Target, T11]]]]]]]]]]]]): ADTFoldApply11[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] = {
          ADTApplyFunction.adtApply11(ADTFuncBuilderHelper.inputHList(param, target))
        }

        def typeOnly[Target](implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UseOne[AdtFunction[Target, T11]]]]]]]]]]]]): ADTFoldApply11[Nothing, AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11]] = {
          ADTApplyFunction.adtApply11(param)
        }
      }
    

      trait ADTOptions12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] {
        def input[Target](target: Target)(implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UseOne[AdtFunction[Target, T12]]]]]]]]]]]]]): ADTFoldApply12[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] = {
          ADTApplyFunction.adtApply12(ADTFuncBuilderHelper.inputHList(param, target))
        }

        def typeOnly[Target](implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UseOne[AdtFunction[Target, T12]]]]]]]]]]]]]): ADTFoldApply12[Nothing, AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12]] = {
          ADTApplyFunction.adtApply12(param)
        }
      }
    

      trait ADTOptions13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] {
        def input[Target](target: Target)(implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UseOne[AdtFunction[Target, T13]]]]]]]]]]]]]]): ADTFoldApply13[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] = {
          ADTApplyFunction.adtApply13(ADTFuncBuilderHelper.inputHList(param, target))
        }

        def typeOnly[Target](implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UseOne[AdtFunction[Target, T13]]]]]]]]]]]]]]): ADTFoldApply13[Nothing, AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13]] = {
          ADTApplyFunction.adtApply13(param)
        }
      }
    

      trait ADTOptions14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] {
        def input[Target](target: Target)(implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UseOne[AdtFunction[Target, T14]]]]]]]]]]]]]]]): ADTFoldApply14[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] = {
          ADTApplyFunction.adtApply14(ADTFuncBuilderHelper.inputHList(param, target))
        }

        def typeOnly[Target](implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UseOne[AdtFunction[Target, T14]]]]]]]]]]]]]]]): ADTFoldApply14[Nothing, AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14]] = {
          ADTApplyFunction.adtApply14(param)
        }
      }
    

      trait ADTOptions15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] {
        def input[Target](target: Target)(implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UseOne[AdtFunction[Target, T15]]]]]]]]]]]]]]]]): ADTFoldApply15[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] = {
          ADTApplyFunction.adtApply15(ADTFuncBuilderHelper.inputHList(param, target))
        }

        def typeOnly[Target](implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UseOne[AdtFunction[Target, T15]]]]]]]]]]]]]]]]): ADTFoldApply15[Nothing, AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15]] = {
          ADTApplyFunction.adtApply15(param)
        }
      }
    

      trait ADTOptions16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] {
        def input[Target](target: Target)(implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UseOne[AdtFunction[Target, T16]]]]]]]]]]]]]]]]]): ADTFoldApply16[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] = {
          ADTApplyFunction.adtApply16(ADTFuncBuilderHelper.inputHList(param, target))
        }

        def typeOnly[Target](implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UseOne[AdtFunction[Target, T16]]]]]]]]]]]]]]]]]): ADTFoldApply16[Nothing, AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15],AdtFunction[Target, T16]] = {
          ADTApplyFunction.adtApply16(param)
        }
      }
    

      trait ADTOptions17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] {
        def input[Target](target: Target)(implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UseOne[AdtFunction[Target, T17]]]]]]]]]]]]]]]]]]): ADTFoldApply17[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] = {
          ADTApplyFunction.adtApply17(ADTFuncBuilderHelper.inputHList(param, target))
        }

        def typeOnly[Target](implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UseOne[AdtFunction[Target, T17]]]]]]]]]]]]]]]]]]): ADTFoldApply17[Nothing, AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15],AdtFunction[Target, T16],AdtFunction[Target, T17]] = {
          ADTApplyFunction.adtApply17(param)
        }
      }
    

      trait ADTOptions18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {
        def input[Target](target: Target)(implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UseOne[AdtFunction[Target, T18]]]]]]]]]]]]]]]]]]]): ADTFoldApply18[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = {
          ADTApplyFunction.adtApply18(ADTFuncBuilderHelper.inputHList(param, target))
        }

        def typeOnly[Target](implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UseOne[AdtFunction[Target, T18]]]]]]]]]]]]]]]]]]]): ADTFoldApply18[Nothing, AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15],AdtFunction[Target, T16],AdtFunction[Target, T17],AdtFunction[Target, T18]] = {
          ADTApplyFunction.adtApply18(param)
        }
      }
    

      trait ADTOptions19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
        def input[Target](target: Target)(implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UseOne[AdtFunction[Target, T19]]]]]]]]]]]]]]]]]]]]): ADTFoldApply19[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = {
          ADTApplyFunction.adtApply19(ADTFuncBuilderHelper.inputHList(param, target))
        }

        def typeOnly[Target](implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UseOne[AdtFunction[Target, T19]]]]]]]]]]]]]]]]]]]]): ADTFoldApply19[Nothing, AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15],AdtFunction[Target, T16],AdtFunction[Target, T17],AdtFunction[Target, T18],AdtFunction[Target, T19]] = {
          ADTApplyFunction.adtApply19(param)
        }
      }
    

      trait ADTOptions20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
        def input[Target](target: Target)(implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UsePositive[AdtFunction[Target, T19], AdtCoProduct.UseOne[AdtFunction[Target, T20]]]]]]]]]]]]]]]]]]]]]): ADTFoldApply20[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = {
          ADTApplyFunction.adtApply20(ADTFuncBuilderHelper.inputHList(param, target))
        }

        def typeOnly[Target](implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UsePositive[AdtFunction[Target, T19], AdtCoProduct.UseOne[AdtFunction[Target, T20]]]]]]]]]]]]]]]]]]]]]): ADTFoldApply20[Nothing, AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15],AdtFunction[Target, T16],AdtFunction[Target, T17],AdtFunction[Target, T18],AdtFunction[Target, T19],AdtFunction[Target, T20]] = {
          ADTApplyFunction.adtApply20(param)
        }
      }
    

      trait ADTOptions21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
        def input[Target](target: Target)(implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UsePositive[AdtFunction[Target, T19], AdtCoProduct.UsePositive[AdtFunction[Target, T20], AdtCoProduct.UseOne[AdtFunction[Target, T21]]]]]]]]]]]]]]]]]]]]]]): ADTFoldApply21[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = {
          ADTApplyFunction.adtApply21(ADTFuncBuilderHelper.inputHList(param, target))
        }

        def typeOnly[Target](implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UsePositive[AdtFunction[Target, T19], AdtCoProduct.UsePositive[AdtFunction[Target, T20], AdtCoProduct.UseOne[AdtFunction[Target, T21]]]]]]]]]]]]]]]]]]]]]]): ADTFoldApply21[Nothing, AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15],AdtFunction[Target, T16],AdtFunction[Target, T17],AdtFunction[Target, T18],AdtFunction[Target, T19],AdtFunction[Target, T20],AdtFunction[Target, T21]] = {
          ADTApplyFunction.adtApply21(param)
        }
      }
    

      trait ADTOptions22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
        def input[Target](target: Target)(implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UsePositive[AdtFunction[Target, T19], AdtCoProduct.UsePositive[AdtFunction[Target, T20], AdtCoProduct.UsePositive[AdtFunction[Target, T21], AdtCoProduct.UseOne[AdtFunction[Target, T22]]]]]]]]]]]]]]]]]]]]]]]): ADTFoldApply22[Nothing, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = {
          ADTApplyFunction.adtApply22(ADTFuncBuilderHelper.inputHList(param, target))
        }

        def typeOnly[Target](implicit param: AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UsePositive[AdtFunction[Target, T19], AdtCoProduct.UsePositive[AdtFunction[Target, T20], AdtCoProduct.UsePositive[AdtFunction[Target, T21], AdtCoProduct.UseOne[AdtFunction[Target, T22]]]]]]]]]]]]]]]]]]]]]]]): ADTFoldApply22[Nothing, AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15],AdtFunction[Target, T16],AdtFunction[Target, T17],AdtFunction[Target, T18],AdtFunction[Target, T19],AdtFunction[Target, T20],AdtFunction[Target, T21],AdtFunction[Target, T22]] = {
          ADTApplyFunction.adtApply22(param)
        }
      }
    
    }
  