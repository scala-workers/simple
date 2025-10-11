
    package net.scalax.simple.adt
    package instance
    package support

    trait ADTApplyFunction2 {
      Self: ADTUnapplyBuilder =>
      
      trait CoProduct1Apply[T1] {
        CoProduct1ApplySelf =>
        def instance[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UseOne[AdtFunction[Target, T1]]]): CoProduct1[T1] = {
          CoProduct1ApplySelf.typeOnly[Target].foldLeft(_.adtFunctionApply(target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UseOne[AdtFunction[Target, T1]]]): CoProduct1[AdtFunction[Target, T1]] = {
          new CoProduct1(param.value)
        }
      }

      object CoProduct1 extends Self.ADTOptionsUnapply1 {
        def apply[T1]: CoProduct1Apply[T1] =
          new CoProduct1Apply[T1] {
            //
          }
      }
    

      trait CoProduct2Apply[T1,T2] {
        CoProduct2ApplySelf =>
        def instance[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UseOne[AdtFunction[Target, T2]]]]): CoProduct2[T1,T2] = {
          CoProduct2ApplySelf.typeOnly[Target].foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UseOne[AdtFunction[Target, T2]]]]): CoProduct2[AdtFunction[Target, T1],AdtFunction[Target, T2]] = {
          new CoProduct2(param.value)
        }
      }

      object CoProduct2 extends Self.ADTOptionsUnapply2 {
        def apply[T1,T2]: CoProduct2Apply[T1,T2] =
          new CoProduct2Apply[T1,T2] {
            //
          }
      }
    

      trait CoProduct3Apply[T1,T2,T3] {
        CoProduct3ApplySelf =>
        def instance[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UseOne[AdtFunction[Target, T3]]]]]): CoProduct3[T1,T2,T3] = {
          CoProduct3ApplySelf.typeOnly[Target].foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UseOne[AdtFunction[Target, T3]]]]]): CoProduct3[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3]] = {
          new CoProduct3(param.value)
        }
      }

      object CoProduct3 extends Self.ADTOptionsUnapply3 {
        def apply[T1,T2,T3]: CoProduct3Apply[T1,T2,T3] =
          new CoProduct3Apply[T1,T2,T3] {
            //
          }
      }
    

      trait CoProduct4Apply[T1,T2,T3,T4] {
        CoProduct4ApplySelf =>
        def instance[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UseOne[AdtFunction[Target, T4]]]]]]): CoProduct4[T1,T2,T3,T4] = {
          CoProduct4ApplySelf.typeOnly[Target].foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UseOne[AdtFunction[Target, T4]]]]]]): CoProduct4[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4]] = {
          new CoProduct4(param.value)
        }
      }

      object CoProduct4 extends Self.ADTOptionsUnapply4 {
        def apply[T1,T2,T3,T4]: CoProduct4Apply[T1,T2,T3,T4] =
          new CoProduct4Apply[T1,T2,T3,T4] {
            //
          }
      }
    

      trait CoProduct5Apply[T1,T2,T3,T4,T5] {
        CoProduct5ApplySelf =>
        def instance[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UseOne[AdtFunction[Target, T5]]]]]]]): CoProduct5[T1,T2,T3,T4,T5] = {
          CoProduct5ApplySelf.typeOnly[Target].foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UseOne[AdtFunction[Target, T5]]]]]]]): CoProduct5[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5]] = {
          new CoProduct5(param.value)
        }
      }

      object CoProduct5 extends Self.ADTOptionsUnapply5 {
        def apply[T1,T2,T3,T4,T5]: CoProduct5Apply[T1,T2,T3,T4,T5] =
          new CoProduct5Apply[T1,T2,T3,T4,T5] {
            //
          }
      }
    

      trait CoProduct6Apply[T1,T2,T3,T4,T5,T6] {
        CoProduct6ApplySelf =>
        def instance[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UseOne[AdtFunction[Target, T6]]]]]]]]): CoProduct6[T1,T2,T3,T4,T5,T6] = {
          CoProduct6ApplySelf.typeOnly[Target].foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UseOne[AdtFunction[Target, T6]]]]]]]]): CoProduct6[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6]] = {
          new CoProduct6(param.value)
        }
      }

      object CoProduct6 extends Self.ADTOptionsUnapply6 {
        def apply[T1,T2,T3,T4,T5,T6]: CoProduct6Apply[T1,T2,T3,T4,T5,T6] =
          new CoProduct6Apply[T1,T2,T3,T4,T5,T6] {
            //
          }
      }
    

      trait CoProduct7Apply[T1,T2,T3,T4,T5,T6,T7] {
        CoProduct7ApplySelf =>
        def instance[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UseOne[AdtFunction[Target, T7]]]]]]]]]): CoProduct7[T1,T2,T3,T4,T5,T6,T7] = {
          CoProduct7ApplySelf.typeOnly[Target].foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UseOne[AdtFunction[Target, T7]]]]]]]]]): CoProduct7[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7]] = {
          new CoProduct7(param.value)
        }
      }

      object CoProduct7 extends Self.ADTOptionsUnapply7 {
        def apply[T1,T2,T3,T4,T5,T6,T7]: CoProduct7Apply[T1,T2,T3,T4,T5,T6,T7] =
          new CoProduct7Apply[T1,T2,T3,T4,T5,T6,T7] {
            //
          }
      }
    

      trait CoProduct8Apply[T1,T2,T3,T4,T5,T6,T7,T8] {
        CoProduct8ApplySelf =>
        def instance[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UseOne[AdtFunction[Target, T8]]]]]]]]]]): CoProduct8[T1,T2,T3,T4,T5,T6,T7,T8] = {
          CoProduct8ApplySelf.typeOnly[Target].foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UseOne[AdtFunction[Target, T8]]]]]]]]]]): CoProduct8[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8]] = {
          new CoProduct8(param.value)
        }
      }

      object CoProduct8 extends Self.ADTOptionsUnapply8 {
        def apply[T1,T2,T3,T4,T5,T6,T7,T8]: CoProduct8Apply[T1,T2,T3,T4,T5,T6,T7,T8] =
          new CoProduct8Apply[T1,T2,T3,T4,T5,T6,T7,T8] {
            //
          }
      }
    

      trait CoProduct9Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9] {
        CoProduct9ApplySelf =>
        def instance[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UseOne[AdtFunction[Target, T9]]]]]]]]]]]): CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T9] = {
          CoProduct9ApplySelf.typeOnly[Target].foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UseOne[AdtFunction[Target, T9]]]]]]]]]]]): CoProduct9[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9]] = {
          new CoProduct9(param.value)
        }
      }

      object CoProduct9 extends Self.ADTOptionsUnapply9 {
        def apply[T1,T2,T3,T4,T5,T6,T7,T8,T9]: CoProduct9Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9] =
          new CoProduct9Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9] {
            //
          }
      }
    

      trait CoProduct10Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] {
        CoProduct10ApplySelf =>
        def instance[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UseOne[AdtFunction[Target, T10]]]]]]]]]]]]): CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] = {
          CoProduct10ApplySelf.typeOnly[Target].foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UseOne[AdtFunction[Target, T10]]]]]]]]]]]]): CoProduct10[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10]] = {
          new CoProduct10(param.value)
        }
      }

      object CoProduct10 extends Self.ADTOptionsUnapply10 {
        def apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]: CoProduct10Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] =
          new CoProduct10Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] {
            //
          }
      }
    

      trait CoProduct11Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] {
        CoProduct11ApplySelf =>
        def instance[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UseOne[AdtFunction[Target, T11]]]]]]]]]]]]]): CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] = {
          CoProduct11ApplySelf.typeOnly[Target].foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UseOne[AdtFunction[Target, T11]]]]]]]]]]]]]): CoProduct11[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11]] = {
          new CoProduct11(param.value)
        }
      }

      object CoProduct11 extends Self.ADTOptionsUnapply11 {
        def apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]: CoProduct11Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] =
          new CoProduct11Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] {
            //
          }
      }
    

      trait CoProduct12Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] {
        CoProduct12ApplySelf =>
        def instance[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UseOne[AdtFunction[Target, T12]]]]]]]]]]]]]]): CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] = {
          CoProduct12ApplySelf.typeOnly[Target].foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UseOne[AdtFunction[Target, T12]]]]]]]]]]]]]]): CoProduct12[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12]] = {
          new CoProduct12(param.value)
        }
      }

      object CoProduct12 extends Self.ADTOptionsUnapply12 {
        def apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]: CoProduct12Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] =
          new CoProduct12Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] {
            //
          }
      }
    

      trait CoProduct13Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] {
        CoProduct13ApplySelf =>
        def instance[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UseOne[AdtFunction[Target, T13]]]]]]]]]]]]]]]): CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] = {
          CoProduct13ApplySelf.typeOnly[Target].foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UseOne[AdtFunction[Target, T13]]]]]]]]]]]]]]]): CoProduct13[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13]] = {
          new CoProduct13(param.value)
        }
      }

      object CoProduct13 extends Self.ADTOptionsUnapply13 {
        def apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]: CoProduct13Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] =
          new CoProduct13Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] {
            //
          }
      }
    

      trait CoProduct14Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] {
        CoProduct14ApplySelf =>
        def instance[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UseOne[AdtFunction[Target, T14]]]]]]]]]]]]]]]]): CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] = {
          CoProduct14ApplySelf.typeOnly[Target].foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UseOne[AdtFunction[Target, T14]]]]]]]]]]]]]]]]): CoProduct14[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14]] = {
          new CoProduct14(param.value)
        }
      }

      object CoProduct14 extends Self.ADTOptionsUnapply14 {
        def apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]: CoProduct14Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] =
          new CoProduct14Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] {
            //
          }
      }
    

      trait CoProduct15Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] {
        CoProduct15ApplySelf =>
        def instance[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UseOne[AdtFunction[Target, T15]]]]]]]]]]]]]]]]]): CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] = {
          CoProduct15ApplySelf.typeOnly[Target].foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UseOne[AdtFunction[Target, T15]]]]]]]]]]]]]]]]]): CoProduct15[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15]] = {
          new CoProduct15(param.value)
        }
      }

      object CoProduct15 extends Self.ADTOptionsUnapply15 {
        def apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]: CoProduct15Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] =
          new CoProduct15Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] {
            //
          }
      }
    

      trait CoProduct16Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] {
        CoProduct16ApplySelf =>
        def instance[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UseOne[AdtFunction[Target, T16]]]]]]]]]]]]]]]]]]): CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] = {
          CoProduct16ApplySelf.typeOnly[Target].foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UseOne[AdtFunction[Target, T16]]]]]]]]]]]]]]]]]]): CoProduct16[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15],AdtFunction[Target, T16]] = {
          new CoProduct16(param.value)
        }
      }

      object CoProduct16 extends Self.ADTOptionsUnapply16 {
        def apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]: CoProduct16Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] =
          new CoProduct16Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] {
            //
          }
      }
    

      trait CoProduct17Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] {
        CoProduct17ApplySelf =>
        def instance[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UseOne[AdtFunction[Target, T17]]]]]]]]]]]]]]]]]]]): CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] = {
          CoProduct17ApplySelf.typeOnly[Target].foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UseOne[AdtFunction[Target, T17]]]]]]]]]]]]]]]]]]]): CoProduct17[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15],AdtFunction[Target, T16],AdtFunction[Target, T17]] = {
          new CoProduct17(param.value)
        }
      }

      object CoProduct17 extends Self.ADTOptionsUnapply17 {
        def apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]: CoProduct17Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] =
          new CoProduct17Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] {
            //
          }
      }
    

      trait CoProduct18Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {
        CoProduct18ApplySelf =>
        def instance[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UseOne[AdtFunction[Target, T18]]]]]]]]]]]]]]]]]]]]): CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] = {
          CoProduct18ApplySelf.typeOnly[Target].foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UseOne[AdtFunction[Target, T18]]]]]]]]]]]]]]]]]]]]): CoProduct18[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15],AdtFunction[Target, T16],AdtFunction[Target, T17],AdtFunction[Target, T18]] = {
          new CoProduct18(param.value)
        }
      }

      object CoProduct18 extends Self.ADTOptionsUnapply18 {
        def apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]: CoProduct18Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] =
          new CoProduct18Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {
            //
          }
      }
    

      trait CoProduct19Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
        CoProduct19ApplySelf =>
        def instance[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UseOne[AdtFunction[Target, T19]]]]]]]]]]]]]]]]]]]]]): CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] = {
          CoProduct19ApplySelf.typeOnly[Target].foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UseOne[AdtFunction[Target, T19]]]]]]]]]]]]]]]]]]]]]): CoProduct19[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15],AdtFunction[Target, T16],AdtFunction[Target, T17],AdtFunction[Target, T18],AdtFunction[Target, T19]] = {
          new CoProduct19(param.value)
        }
      }

      object CoProduct19 extends Self.ADTOptionsUnapply19 {
        def apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]: CoProduct19Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] =
          new CoProduct19Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
            //
          }
      }
    

      trait CoProduct20Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
        CoProduct20ApplySelf =>
        def instance[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UsePositive[AdtFunction[Target, T19], AdtCoProduct.UseOne[AdtFunction[Target, T20]]]]]]]]]]]]]]]]]]]]]]): CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] = {
          CoProduct20ApplySelf.typeOnly[Target].foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UsePositive[AdtFunction[Target, T19], AdtCoProduct.UseOne[AdtFunction[Target, T20]]]]]]]]]]]]]]]]]]]]]]): CoProduct20[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15],AdtFunction[Target, T16],AdtFunction[Target, T17],AdtFunction[Target, T18],AdtFunction[Target, T19],AdtFunction[Target, T20]] = {
          new CoProduct20(param.value)
        }
      }

      object CoProduct20 extends Self.ADTOptionsUnapply20 {
        def apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]: CoProduct20Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] =
          new CoProduct20Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
            //
          }
      }
    

      trait CoProduct21Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
        CoProduct21ApplySelf =>
        def instance[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UsePositive[AdtFunction[Target, T19], AdtCoProduct.UsePositive[AdtFunction[Target, T20], AdtCoProduct.UseOne[AdtFunction[Target, T21]]]]]]]]]]]]]]]]]]]]]]]): CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] = {
          CoProduct21ApplySelf.typeOnly[Target].foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UsePositive[AdtFunction[Target, T19], AdtCoProduct.UsePositive[AdtFunction[Target, T20], AdtCoProduct.UseOne[AdtFunction[Target, T21]]]]]]]]]]]]]]]]]]]]]]]): CoProduct21[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15],AdtFunction[Target, T16],AdtFunction[Target, T17],AdtFunction[Target, T18],AdtFunction[Target, T19],AdtFunction[Target, T20],AdtFunction[Target, T21]] = {
          new CoProduct21(param.value)
        }
      }

      object CoProduct21 extends Self.ADTOptionsUnapply21 {
        def apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]: CoProduct21Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] =
          new CoProduct21Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
            //
          }
      }
    

      trait CoProduct22Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
        CoProduct22ApplySelf =>
        def instance[Target](target: Target)(implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UsePositive[AdtFunction[Target, T19], AdtCoProduct.UsePositive[AdtFunction[Target, T20], AdtCoProduct.UsePositive[AdtFunction[Target, T21], AdtCoProduct.UseOne[AdtFunction[Target, T22]]]]]]]]]]]]]]]]]]]]]]]]): CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] = {
          CoProduct22ApplySelf.typeOnly[Target].foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target)).foldLeft(_.adtFunctionApply(target))
        }

        def typeOnly[Target](implicit param: ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, T1], AdtCoProduct.UsePositive[AdtFunction[Target, T2], AdtCoProduct.UsePositive[AdtFunction[Target, T3], AdtCoProduct.UsePositive[AdtFunction[Target, T4], AdtCoProduct.UsePositive[AdtFunction[Target, T5], AdtCoProduct.UsePositive[AdtFunction[Target, T6], AdtCoProduct.UsePositive[AdtFunction[Target, T7], AdtCoProduct.UsePositive[AdtFunction[Target, T8], AdtCoProduct.UsePositive[AdtFunction[Target, T9], AdtCoProduct.UsePositive[AdtFunction[Target, T10], AdtCoProduct.UsePositive[AdtFunction[Target, T11], AdtCoProduct.UsePositive[AdtFunction[Target, T12], AdtCoProduct.UsePositive[AdtFunction[Target, T13], AdtCoProduct.UsePositive[AdtFunction[Target, T14], AdtCoProduct.UsePositive[AdtFunction[Target, T15], AdtCoProduct.UsePositive[AdtFunction[Target, T16], AdtCoProduct.UsePositive[AdtFunction[Target, T17], AdtCoProduct.UsePositive[AdtFunction[Target, T18], AdtCoProduct.UsePositive[AdtFunction[Target, T19], AdtCoProduct.UsePositive[AdtFunction[Target, T20], AdtCoProduct.UsePositive[AdtFunction[Target, T21], AdtCoProduct.UseOne[AdtFunction[Target, T22]]]]]]]]]]]]]]]]]]]]]]]]): CoProduct22[AdtFunction[Target, T1],AdtFunction[Target, T2],AdtFunction[Target, T3],AdtFunction[Target, T4],AdtFunction[Target, T5],AdtFunction[Target, T6],AdtFunction[Target, T7],AdtFunction[Target, T8],AdtFunction[Target, T9],AdtFunction[Target, T10],AdtFunction[Target, T11],AdtFunction[Target, T12],AdtFunction[Target, T13],AdtFunction[Target, T14],AdtFunction[Target, T15],AdtFunction[Target, T16],AdtFunction[Target, T17],AdtFunction[Target, T18],AdtFunction[Target, T19],AdtFunction[Target, T20],AdtFunction[Target, T21],AdtFunction[Target, T22]] = {
          new CoProduct22(param.value)
        }
      }

      object CoProduct22 extends Self.ADTOptionsUnapply22 {
        def apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]: CoProduct22Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] =
          new CoProduct22Apply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
            //
          }
      }
    
    }
  