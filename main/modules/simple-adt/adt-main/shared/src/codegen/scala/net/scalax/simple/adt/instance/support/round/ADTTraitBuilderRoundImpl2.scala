
    package net.scalax.simple.adt
    package instance
    package support
    package round

    object Impl2 {

      trait CoProduct1[T1] extends Impl1.CoProduct1[T1] with AdtCoProduct.Common.Positive[T1, Impl2.CoProduct1[T1]] { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: Impl2.CoProduct1[T1] => Target): Target = {
          CoProductSelf.fold[Target](param1)
        }
        @inline def fold[Target](param1: T1 => Target): Target =
          CoProductSelf._foldCoProduct[Target](param1, s1 => s1.fold[Target](param1))
      }

      
      trait CoProduct2[T1,T2]
        extends Impl1.CoProduct2[T1,T2]
        with AdtCoProduct.Common.Positive[T1, AdtCoProduct.Common.Positive[T2, Impl2.CoProduct2[T1,T2]]] { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: AdtCoProduct.Common.Positive[T2, Impl2.CoProduct2[T1,T2]] => Target): Target = {
          
        val param2: T2 => Target = ux => tail(
          
          AdtCoProduct.Common.Positive.Left(ux)
          
        )
      
          CoProductSelf.fold[Target](param1,param2)
        }
        @inline def fold[Target](
          param1: T1 => Target,param2: T2 => Target
        ): Target = CoProductSelf._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2.fold[Target](param1,param2)))
      }
    

      trait CoProduct3[T1,T2,T3]
        extends Impl1.CoProduct3[T1,T2,T3]
        with AdtCoProduct.Common.Positive[T1, AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, Impl2.CoProduct3[T1,T2,T3]]]] { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, Impl2.CoProduct3[T1,T2,T3]]] => Target): Target = {
          
        val param2: T2 => Target = ux => tail(
          
          AdtCoProduct.Common.Positive.Left(ux)
          
        )
      

        val param3: T3 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          )
        )
      
          CoProductSelf.fold[Target](param1,param2,param3)
        }
        @inline def fold[Target](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target
        ): Target = CoProductSelf._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3.fold[Target](param1,param2,param3))))
      }
    

      trait CoProduct4[T1,T2,T3,T4]
        extends Impl1.CoProduct4[T1,T2,T3,T4]
        with AdtCoProduct.Common.Positive[T1, AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, Impl2.CoProduct4[T1,T2,T3,T4]]]]] { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, Impl2.CoProduct4[T1,T2,T3,T4]]]] => Target): Target = {
          
        val param2: T2 => Target = ux => tail(
          
          AdtCoProduct.Common.Positive.Left(ux)
          
        )
      

        val param3: T3 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          )
        )
      

        val param4: T4 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) )
        )
      
          CoProductSelf.fold[Target](param1,param2,param3,param4)
        }
        @inline def fold[Target](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target
        ): Target = CoProductSelf._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4.fold[Target](param1,param2,param3,param4)))))
      }
    

      trait CoProduct5[T1,T2,T3,T4,T5]
        extends Impl1.CoProduct5[T1,T2,T3,T4,T5]
        with AdtCoProduct.Common.Positive[T1, AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, Impl2.CoProduct5[T1,T2,T3,T4,T5]]]]]] { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, Impl2.CoProduct5[T1,T2,T3,T4,T5]]]]] => Target): Target = {
          
        val param2: T2 => Target = ux => tail(
          
          AdtCoProduct.Common.Positive.Left(ux)
          
        )
      

        val param3: T3 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          )
        )
      

        val param4: T4 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) )
        )
      

        val param5: T5 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) )
        )
      
          CoProductSelf.fold[Target](param1,param2,param3,param4,param5)
        }
        @inline def fold[Target](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target
        ): Target = CoProductSelf._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5.fold[Target](param1,param2,param3,param4,param5))))))
      }
    

      trait CoProduct6[T1,T2,T3,T4,T5,T6]
        extends Impl1.CoProduct6[T1,T2,T3,T4,T5,T6]
        with AdtCoProduct.Common.Positive[T1, AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, Impl2.CoProduct6[T1,T2,T3,T4,T5,T6]]]]]]] { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, Impl2.CoProduct6[T1,T2,T3,T4,T5,T6]]]]]] => Target): Target = {
          
        val param2: T2 => Target = ux => tail(
          
          AdtCoProduct.Common.Positive.Left(ux)
          
        )
      

        val param3: T3 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          )
        )
      

        val param4: T4 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) )
        )
      

        val param5: T5 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) )
        )
      

        val param6: T6 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) )
        )
      
          CoProductSelf.fold[Target](param1,param2,param3,param4,param5,param6)
        }
        @inline def fold[Target](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target
        ): Target = CoProductSelf._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6.fold[Target](param1,param2,param3,param4,param5,param6)))))))
      }
    

      trait CoProduct7[T1,T2,T3,T4,T5,T6,T7]
        extends Impl1.CoProduct7[T1,T2,T3,T4,T5,T6,T7]
        with AdtCoProduct.Common.Positive[T1, AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, Impl2.CoProduct7[T1,T2,T3,T4,T5,T6,T7]]]]]]]] { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, Impl2.CoProduct7[T1,T2,T3,T4,T5,T6,T7]]]]]]] => Target): Target = {
          
        val param2: T2 => Target = ux => tail(
          
          AdtCoProduct.Common.Positive.Left(ux)
          
        )
      

        val param3: T3 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          )
        )
      

        val param4: T4 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) )
        )
      

        val param5: T5 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) )
        )
      

        val param6: T6 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) )
        )
      

        val param7: T7 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) )
        )
      
          CoProductSelf.fold[Target](param1,param2,param3,param4,param5,param6,param7)
        }
        @inline def fold[Target](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target
        ): Target = CoProductSelf._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7.fold[Target](param1,param2,param3,param4,param5,param6,param7))))))))
      }
    

      trait CoProduct8[T1,T2,T3,T4,T5,T6,T7,T8]
        extends Impl1.CoProduct8[T1,T2,T3,T4,T5,T6,T7,T8]
        with AdtCoProduct.Common.Positive[T1, AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, Impl2.CoProduct8[T1,T2,T3,T4,T5,T6,T7,T8]]]]]]]]] { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, Impl2.CoProduct8[T1,T2,T3,T4,T5,T6,T7,T8]]]]]]]] => Target): Target = {
          
        val param2: T2 => Target = ux => tail(
          
          AdtCoProduct.Common.Positive.Left(ux)
          
        )
      

        val param3: T3 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          )
        )
      

        val param4: T4 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) )
        )
      

        val param5: T5 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) )
        )
      

        val param6: T6 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) )
        )
      

        val param7: T7 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) )
        )
      

        val param8: T8 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) )
        )
      
          CoProductSelf.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8)
        }
        @inline def fold[Target](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target
        ): Target = CoProductSelf._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8)))))))))
      }
    

      trait CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T9]
        extends Impl1.CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T9]
        with AdtCoProduct.Common.Positive[T1, AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, Impl2.CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T9]]]]]]]]]] { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, Impl2.CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T9]]]]]]]]] => Target): Target = {
          
        val param2: T2 => Target = ux => tail(
          
          AdtCoProduct.Common.Positive.Left(ux)
          
        )
      

        val param3: T3 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          )
        )
      

        val param4: T4 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) )
        )
      

        val param5: T5 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) )
        )
      

        val param6: T6 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) )
        )
      

        val param7: T7 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) )
        )
      

        val param8: T8 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) )
        )
      

        val param9: T9 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) )
        )
      
          CoProductSelf.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9)
        }
        @inline def fold[Target](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target
        ): Target = CoProductSelf._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9))))))))))
      }
    

      trait CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]
        extends Impl1.CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]
        with AdtCoProduct.Common.Positive[T1, AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, Impl2.CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]]]]]]]]]]] { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, Impl2.CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]]]]]]]]]] => Target): Target = {
          
        val param2: T2 => Target = ux => tail(
          
          AdtCoProduct.Common.Positive.Left(ux)
          
        )
      

        val param3: T3 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          )
        )
      

        val param4: T4 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) )
        )
      

        val param5: T5 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) )
        )
      

        val param6: T6 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) )
        )
      

        val param7: T7 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) )
        )
      

        val param8: T8 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) )
        )
      

        val param9: T9 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) )
        )
      

        val param10: T10 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) )
        )
      
          CoProductSelf.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10)
        }
        @inline def fold[Target](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target
        ): Target = CoProductSelf._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10)))))))))))
      }
    

      trait CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]
        extends Impl1.CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]
        with AdtCoProduct.Common.Positive[T1, AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, Impl2.CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]]]]]]]]]]]] { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, Impl2.CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]]]]]]]]]]] => Target): Target = {
          
        val param2: T2 => Target = ux => tail(
          
          AdtCoProduct.Common.Positive.Left(ux)
          
        )
      

        val param3: T3 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          )
        )
      

        val param4: T4 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) )
        )
      

        val param5: T5 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) )
        )
      

        val param6: T6 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) )
        )
      

        val param7: T7 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) )
        )
      

        val param8: T8 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) )
        )
      

        val param9: T9 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) )
        )
      

        val param10: T10 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) )
        )
      

        val param11: T11 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) )
        )
      
          CoProductSelf.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11)
        }
        @inline def fold[Target](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target
        ): Target = CoProductSelf._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11))))))))))))
      }
    

      trait CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]
        extends Impl1.CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]
        with AdtCoProduct.Common.Positive[T1, AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, AdtCoProduct.Common.Positive[T12, Impl2.CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]]]]]]]]]]]]] { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, AdtCoProduct.Common.Positive[T12, Impl2.CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]]]]]]]]]]]] => Target): Target = {
          
        val param2: T2 => Target = ux => tail(
          
          AdtCoProduct.Common.Positive.Left(ux)
          
        )
      

        val param3: T3 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          )
        )
      

        val param4: T4 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) )
        )
      

        val param5: T5 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) )
        )
      

        val param6: T6 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) )
        )
      

        val param7: T7 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) )
        )
      

        val param8: T8 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) )
        )
      

        val param9: T9 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) )
        )
      

        val param10: T10 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) )
        )
      

        val param11: T11 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) )
        )
      

        val param12: T12 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) )
        )
      
          CoProductSelf.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12)
        }
        @inline def fold[Target](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target
        ): Target = CoProductSelf._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12)))))))))))))
      }
    

      trait CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]
        extends Impl1.CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]
        with AdtCoProduct.Common.Positive[T1, AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, AdtCoProduct.Common.Positive[T12, AdtCoProduct.Common.Positive[T13, Impl2.CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]]]]]]]]]]]]]] { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, AdtCoProduct.Common.Positive[T12, AdtCoProduct.Common.Positive[T13, Impl2.CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]]]]]]]]]]]]] => Target): Target = {
          
        val param2: T2 => Target = ux => tail(
          
          AdtCoProduct.Common.Positive.Left(ux)
          
        )
      

        val param3: T3 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          )
        )
      

        val param4: T4 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) )
        )
      

        val param5: T5 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) )
        )
      

        val param6: T6 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) )
        )
      

        val param7: T7 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) )
        )
      

        val param8: T8 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) )
        )
      

        val param9: T9 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) )
        )
      

        val param10: T10 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) )
        )
      

        val param11: T11 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) )
        )
      

        val param12: T12 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) )
        )
      

        val param13: T13 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) )
        )
      
          CoProductSelf.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13)
        }
        @inline def fold[Target](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target
        ): Target = CoProductSelf._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13))))))))))))))
      }
    

      trait CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]
        extends Impl1.CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]
        with AdtCoProduct.Common.Positive[T1, AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, AdtCoProduct.Common.Positive[T12, AdtCoProduct.Common.Positive[T13, AdtCoProduct.Common.Positive[T14, Impl2.CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]]]]]]]]]]]]]]] { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, AdtCoProduct.Common.Positive[T12, AdtCoProduct.Common.Positive[T13, AdtCoProduct.Common.Positive[T14, Impl2.CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]]]]]]]]]]]]]] => Target): Target = {
          
        val param2: T2 => Target = ux => tail(
          
          AdtCoProduct.Common.Positive.Left(ux)
          
        )
      

        val param3: T3 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          )
        )
      

        val param4: T4 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) )
        )
      

        val param5: T5 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) )
        )
      

        val param6: T6 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) )
        )
      

        val param7: T7 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) )
        )
      

        val param8: T8 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) )
        )
      

        val param9: T9 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) )
        )
      

        val param10: T10 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) )
        )
      

        val param11: T11 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) )
        )
      

        val param12: T12 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) )
        )
      

        val param13: T13 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param14: T14 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) )
        )
      
          CoProductSelf.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14)
        }
        @inline def fold[Target](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target
        ): Target = CoProductSelf._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14)))))))))))))))
      }
    

      trait CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
        extends Impl1.CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
        with AdtCoProduct.Common.Positive[T1, AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, AdtCoProduct.Common.Positive[T12, AdtCoProduct.Common.Positive[T13, AdtCoProduct.Common.Positive[T14, AdtCoProduct.Common.Positive[T15, Impl2.CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]]]]]]]]]]]]]]]] { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, AdtCoProduct.Common.Positive[T12, AdtCoProduct.Common.Positive[T13, AdtCoProduct.Common.Positive[T14, AdtCoProduct.Common.Positive[T15, Impl2.CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]]]]]]]]]]]]]]] => Target): Target = {
          
        val param2: T2 => Target = ux => tail(
          
          AdtCoProduct.Common.Positive.Left(ux)
          
        )
      

        val param3: T3 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          )
        )
      

        val param4: T4 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) )
        )
      

        val param5: T5 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) )
        )
      

        val param6: T6 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) )
        )
      

        val param7: T7 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) )
        )
      

        val param8: T8 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) )
        )
      

        val param9: T9 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) )
        )
      

        val param10: T10 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) )
        )
      

        val param11: T11 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) )
        )
      

        val param12: T12 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) )
        )
      

        val param13: T13 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param14: T14 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param15: T15 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      
          CoProductSelf.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15)
        }
        @inline def fold[Target](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target
        ): Target = CoProductSelf._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => s15.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15))))))))))))))))
      }
    

      trait CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
        extends Impl1.CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
        with AdtCoProduct.Common.Positive[T1, AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, AdtCoProduct.Common.Positive[T12, AdtCoProduct.Common.Positive[T13, AdtCoProduct.Common.Positive[T14, AdtCoProduct.Common.Positive[T15, AdtCoProduct.Common.Positive[T16, Impl2.CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]]]]]]]]]]]]]]]]] { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, AdtCoProduct.Common.Positive[T12, AdtCoProduct.Common.Positive[T13, AdtCoProduct.Common.Positive[T14, AdtCoProduct.Common.Positive[T15, AdtCoProduct.Common.Positive[T16, Impl2.CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]]]]]]]]]]]]]]]] => Target): Target = {
          
        val param2: T2 => Target = ux => tail(
          
          AdtCoProduct.Common.Positive.Left(ux)
          
        )
      

        val param3: T3 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          )
        )
      

        val param4: T4 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) )
        )
      

        val param5: T5 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) )
        )
      

        val param6: T6 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) )
        )
      

        val param7: T7 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) )
        )
      

        val param8: T8 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) )
        )
      

        val param9: T9 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) )
        )
      

        val param10: T10 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) )
        )
      

        val param11: T11 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) )
        )
      

        val param12: T12 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) )
        )
      

        val param13: T13 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param14: T14 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param15: T15 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param16: T16 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      
          CoProductSelf.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16)
        }
        @inline def fold[Target](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target,param16: T16 => Target
        ): Target = CoProductSelf._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => s15._foldCoProduct[Target](param16, s16 => s16.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16)))))))))))))))))
      }
    

      trait CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
        extends Impl1.CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
        with AdtCoProduct.Common.Positive[T1, AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, AdtCoProduct.Common.Positive[T12, AdtCoProduct.Common.Positive[T13, AdtCoProduct.Common.Positive[T14, AdtCoProduct.Common.Positive[T15, AdtCoProduct.Common.Positive[T16, AdtCoProduct.Common.Positive[T17, Impl2.CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]]]]]]]]]]]]]]]]]] { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, AdtCoProduct.Common.Positive[T12, AdtCoProduct.Common.Positive[T13, AdtCoProduct.Common.Positive[T14, AdtCoProduct.Common.Positive[T15, AdtCoProduct.Common.Positive[T16, AdtCoProduct.Common.Positive[T17, Impl2.CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]]]]]]]]]]]]]]]]] => Target): Target = {
          
        val param2: T2 => Target = ux => tail(
          
          AdtCoProduct.Common.Positive.Left(ux)
          
        )
      

        val param3: T3 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          )
        )
      

        val param4: T4 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) )
        )
      

        val param5: T5 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) )
        )
      

        val param6: T6 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) )
        )
      

        val param7: T7 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) )
        )
      

        val param8: T8 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) )
        )
      

        val param9: T9 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) )
        )
      

        val param10: T10 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) )
        )
      

        val param11: T11 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) )
        )
      

        val param12: T12 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) )
        )
      

        val param13: T13 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param14: T14 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param15: T15 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param16: T16 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param17: T17 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      
          CoProductSelf.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17)
        }
        @inline def fold[Target](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target,param16: T16 => Target,param17: T17 => Target
        ): Target = CoProductSelf._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => s15._foldCoProduct[Target](param16, s16 => s16._foldCoProduct[Target](param17, s17 => s17.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17))))))))))))))))))
      }
    

      trait CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
        extends Impl1.CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
        with AdtCoProduct.Common.Positive[T1, AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, AdtCoProduct.Common.Positive[T12, AdtCoProduct.Common.Positive[T13, AdtCoProduct.Common.Positive[T14, AdtCoProduct.Common.Positive[T15, AdtCoProduct.Common.Positive[T16, AdtCoProduct.Common.Positive[T17, AdtCoProduct.Common.Positive[T18, Impl2.CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]]]]]]]]]]]]]]]]]]] { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, AdtCoProduct.Common.Positive[T12, AdtCoProduct.Common.Positive[T13, AdtCoProduct.Common.Positive[T14, AdtCoProduct.Common.Positive[T15, AdtCoProduct.Common.Positive[T16, AdtCoProduct.Common.Positive[T17, AdtCoProduct.Common.Positive[T18, Impl2.CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]]]]]]]]]]]]]]]]]] => Target): Target = {
          
        val param2: T2 => Target = ux => tail(
          
          AdtCoProduct.Common.Positive.Left(ux)
          
        )
      

        val param3: T3 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          )
        )
      

        val param4: T4 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) )
        )
      

        val param5: T5 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) )
        )
      

        val param6: T6 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) )
        )
      

        val param7: T7 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) )
        )
      

        val param8: T8 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) )
        )
      

        val param9: T9 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) )
        )
      

        val param10: T10 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) )
        )
      

        val param11: T11 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) )
        )
      

        val param12: T12 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) )
        )
      

        val param13: T13 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param14: T14 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param15: T15 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param16: T16 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param17: T17 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param18: T18 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      
          CoProductSelf.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17,param18)
        }
        @inline def fold[Target](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target,param16: T16 => Target,param17: T17 => Target,param18: T18 => Target
        ): Target = CoProductSelf._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => s15._foldCoProduct[Target](param16, s16 => s16._foldCoProduct[Target](param17, s17 => s17._foldCoProduct[Target](param18, s18 => s18.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17,param18)))))))))))))))))))
      }
    

      trait CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
        extends Impl1.CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
        with AdtCoProduct.Common.Positive[T1, AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, AdtCoProduct.Common.Positive[T12, AdtCoProduct.Common.Positive[T13, AdtCoProduct.Common.Positive[T14, AdtCoProduct.Common.Positive[T15, AdtCoProduct.Common.Positive[T16, AdtCoProduct.Common.Positive[T17, AdtCoProduct.Common.Positive[T18, AdtCoProduct.Common.Positive[T19, Impl2.CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]]]]]]]]]]]]]]]]]]]] { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, AdtCoProduct.Common.Positive[T12, AdtCoProduct.Common.Positive[T13, AdtCoProduct.Common.Positive[T14, AdtCoProduct.Common.Positive[T15, AdtCoProduct.Common.Positive[T16, AdtCoProduct.Common.Positive[T17, AdtCoProduct.Common.Positive[T18, AdtCoProduct.Common.Positive[T19, Impl2.CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]]]]]]]]]]]]]]]]]]] => Target): Target = {
          
        val param2: T2 => Target = ux => tail(
          
          AdtCoProduct.Common.Positive.Left(ux)
          
        )
      

        val param3: T3 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          )
        )
      

        val param4: T4 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) )
        )
      

        val param5: T5 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) )
        )
      

        val param6: T6 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) )
        )
      

        val param7: T7 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) )
        )
      

        val param8: T8 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) )
        )
      

        val param9: T9 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) )
        )
      

        val param10: T10 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) )
        )
      

        val param11: T11 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) )
        )
      

        val param12: T12 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) )
        )
      

        val param13: T13 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param14: T14 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param15: T15 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param16: T16 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param17: T17 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param18: T18 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param19: T19 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      
          CoProductSelf.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17,param18,param19)
        }
        @inline def fold[Target](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target,param16: T16 => Target,param17: T17 => Target,param18: T18 => Target,param19: T19 => Target
        ): Target = CoProductSelf._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => s15._foldCoProduct[Target](param16, s16 => s16._foldCoProduct[Target](param17, s17 => s17._foldCoProduct[Target](param18, s18 => s18._foldCoProduct[Target](param19, s19 => s19.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17,param18,param19))))))))))))))))))))
      }
    

      trait CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
        extends Impl1.CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
        with AdtCoProduct.Common.Positive[T1, AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, AdtCoProduct.Common.Positive[T12, AdtCoProduct.Common.Positive[T13, AdtCoProduct.Common.Positive[T14, AdtCoProduct.Common.Positive[T15, AdtCoProduct.Common.Positive[T16, AdtCoProduct.Common.Positive[T17, AdtCoProduct.Common.Positive[T18, AdtCoProduct.Common.Positive[T19, AdtCoProduct.Common.Positive[T20, Impl2.CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]]]]]]]]]]]]]]]]]]]]] { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, AdtCoProduct.Common.Positive[T12, AdtCoProduct.Common.Positive[T13, AdtCoProduct.Common.Positive[T14, AdtCoProduct.Common.Positive[T15, AdtCoProduct.Common.Positive[T16, AdtCoProduct.Common.Positive[T17, AdtCoProduct.Common.Positive[T18, AdtCoProduct.Common.Positive[T19, AdtCoProduct.Common.Positive[T20, Impl2.CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]]]]]]]]]]]]]]]]]]]] => Target): Target = {
          
        val param2: T2 => Target = ux => tail(
          
          AdtCoProduct.Common.Positive.Left(ux)
          
        )
      

        val param3: T3 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          )
        )
      

        val param4: T4 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) )
        )
      

        val param5: T5 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) )
        )
      

        val param6: T6 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) )
        )
      

        val param7: T7 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) )
        )
      

        val param8: T8 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) )
        )
      

        val param9: T9 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) )
        )
      

        val param10: T10 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) )
        )
      

        val param11: T11 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) )
        )
      

        val param12: T12 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) )
        )
      

        val param13: T13 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param14: T14 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param15: T15 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param16: T16 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param17: T17 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param18: T18 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param19: T19 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param20: T20 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      
          CoProductSelf.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17,param18,param19,param20)
        }
        @inline def fold[Target](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target,param16: T16 => Target,param17: T17 => Target,param18: T18 => Target,param19: T19 => Target,param20: T20 => Target
        ): Target = CoProductSelf._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => s15._foldCoProduct[Target](param16, s16 => s16._foldCoProduct[Target](param17, s17 => s17._foldCoProduct[Target](param18, s18 => s18._foldCoProduct[Target](param19, s19 => s19._foldCoProduct[Target](param20, s20 => s20.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17,param18,param19,param20)))))))))))))))))))))
      }
    

      trait CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
        extends Impl1.CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
        with AdtCoProduct.Common.Positive[T1, AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, AdtCoProduct.Common.Positive[T12, AdtCoProduct.Common.Positive[T13, AdtCoProduct.Common.Positive[T14, AdtCoProduct.Common.Positive[T15, AdtCoProduct.Common.Positive[T16, AdtCoProduct.Common.Positive[T17, AdtCoProduct.Common.Positive[T18, AdtCoProduct.Common.Positive[T19, AdtCoProduct.Common.Positive[T20, AdtCoProduct.Common.Positive[T21, Impl2.CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]]]]]]]]]]]]]]]]]]]]]] { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, AdtCoProduct.Common.Positive[T12, AdtCoProduct.Common.Positive[T13, AdtCoProduct.Common.Positive[T14, AdtCoProduct.Common.Positive[T15, AdtCoProduct.Common.Positive[T16, AdtCoProduct.Common.Positive[T17, AdtCoProduct.Common.Positive[T18, AdtCoProduct.Common.Positive[T19, AdtCoProduct.Common.Positive[T20, AdtCoProduct.Common.Positive[T21, Impl2.CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]]]]]]]]]]]]]]]]]]]]] => Target): Target = {
          
        val param2: T2 => Target = ux => tail(
          
          AdtCoProduct.Common.Positive.Left(ux)
          
        )
      

        val param3: T3 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          )
        )
      

        val param4: T4 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) )
        )
      

        val param5: T5 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) )
        )
      

        val param6: T6 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) )
        )
      

        val param7: T7 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) )
        )
      

        val param8: T8 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) )
        )
      

        val param9: T9 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) )
        )
      

        val param10: T10 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) )
        )
      

        val param11: T11 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) )
        )
      

        val param12: T12 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) )
        )
      

        val param13: T13 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param14: T14 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param15: T15 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param16: T16 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param17: T17 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param18: T18 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param19: T19 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param20: T20 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param21: T21 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      
          CoProductSelf.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17,param18,param19,param20,param21)
        }
        @inline def fold[Target](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target,param16: T16 => Target,param17: T17 => Target,param18: T18 => Target,param19: T19 => Target,param20: T20 => Target,param21: T21 => Target
        ): Target = CoProductSelf._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => s15._foldCoProduct[Target](param16, s16 => s16._foldCoProduct[Target](param17, s17 => s17._foldCoProduct[Target](param18, s18 => s18._foldCoProduct[Target](param19, s19 => s19._foldCoProduct[Target](param20, s20 => s20._foldCoProduct[Target](param21, s21 => s21.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17,param18,param19,param20,param21))))))))))))))))))))))
      }
    

      trait CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
        extends Impl1.CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
        with AdtCoProduct.Common.Positive[T1, AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, AdtCoProduct.Common.Positive[T12, AdtCoProduct.Common.Positive[T13, AdtCoProduct.Common.Positive[T14, AdtCoProduct.Common.Positive[T15, AdtCoProduct.Common.Positive[T16, AdtCoProduct.Common.Positive[T17, AdtCoProduct.Common.Positive[T18, AdtCoProduct.Common.Positive[T19, AdtCoProduct.Common.Positive[T20, AdtCoProduct.Common.Positive[T21, AdtCoProduct.Common.Positive[T22, Impl2.CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]]]]]]]]]]]]]]]]]]]]]]] { CoProductSelf =>
        @inline override def _foldCoProduct[Target](param1: T1 => Target, tail: AdtCoProduct.Common.Positive[T2, AdtCoProduct.Common.Positive[T3, AdtCoProduct.Common.Positive[T4, AdtCoProduct.Common.Positive[T5, AdtCoProduct.Common.Positive[T6, AdtCoProduct.Common.Positive[T7, AdtCoProduct.Common.Positive[T8, AdtCoProduct.Common.Positive[T9, AdtCoProduct.Common.Positive[T10, AdtCoProduct.Common.Positive[T11, AdtCoProduct.Common.Positive[T12, AdtCoProduct.Common.Positive[T13, AdtCoProduct.Common.Positive[T14, AdtCoProduct.Common.Positive[T15, AdtCoProduct.Common.Positive[T16, AdtCoProduct.Common.Positive[T17, AdtCoProduct.Common.Positive[T18, AdtCoProduct.Common.Positive[T19, AdtCoProduct.Common.Positive[T20, AdtCoProduct.Common.Positive[T21, AdtCoProduct.Common.Positive[T22, Impl2.CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]]]]]]]]]]]]]]]]]]]]]] => Target): Target = {
          
        val param2: T2 => Target = ux => tail(
          
          AdtCoProduct.Common.Positive.Left(ux)
          
        )
      

        val param3: T3 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          )
        )
      

        val param4: T4 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) )
        )
      

        val param5: T5 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) )
        )
      

        val param6: T6 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) )
        )
      

        val param7: T7 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) )
        )
      

        val param8: T8 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) )
        )
      

        val param9: T9 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) )
        )
      

        val param10: T10 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) )
        )
      

        val param11: T11 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) )
        )
      

        val param12: T12 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) )
        )
      

        val param13: T13 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param14: T14 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param15: T15 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param16: T16 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param17: T17 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param18: T18 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param19: T19 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param20: T20 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param21: T21 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      

        val param22: T22 => Target = ux => tail(
          AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right( AdtCoProduct.Common.Positive.Right(
          AdtCoProduct.Common.Positive.Left(ux)
          ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) )
        )
      
          CoProductSelf.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17,param18,param19,param20,param21,param22)
        }
        @inline def fold[Target](
          param1: T1 => Target,param2: T2 => Target,param3: T3 => Target,param4: T4 => Target,param5: T5 => Target,param6: T6 => Target,param7: T7 => Target,param8: T8 => Target,param9: T9 => Target,param10: T10 => Target,param11: T11 => Target,param12: T12 => Target,param13: T13 => Target,param14: T14 => Target,param15: T15 => Target,param16: T16 => Target,param17: T17 => Target,param18: T18 => Target,param19: T19 => Target,param20: T20 => Target,param21: T21 => Target,param22: T22 => Target
        ): Target = CoProductSelf._foldCoProduct[Target](param1, s1 => s1._foldCoProduct[Target](param2, s2 => s2._foldCoProduct[Target](param3, s3 => s3._foldCoProduct[Target](param4, s4 => s4._foldCoProduct[Target](param5, s5 => s5._foldCoProduct[Target](param6, s6 => s6._foldCoProduct[Target](param7, s7 => s7._foldCoProduct[Target](param8, s8 => s8._foldCoProduct[Target](param9, s9 => s9._foldCoProduct[Target](param10, s10 => s10._foldCoProduct[Target](param11, s11 => s11._foldCoProduct[Target](param12, s12 => s12._foldCoProduct[Target](param13, s13 => s13._foldCoProduct[Target](param14, s14 => s14._foldCoProduct[Target](param15, s15 => s15._foldCoProduct[Target](param16, s16 => s16._foldCoProduct[Target](param17, s17 => s17._foldCoProduct[Target](param18, s18 => s18._foldCoProduct[Target](param19, s19 => s19._foldCoProduct[Target](param20, s20 => s20._foldCoProduct[Target](param21, s21 => s21._foldCoProduct[Target](param22, s22 => s22.fold[Target](param1,param2,param3,param4,param5,param6,param7,param8,param9,param10,param11,param12,param13,param14,param15,param16,param17,param18,param19,param20,param21,param22)))))))))))))))))))))))
      }
    
    }
  