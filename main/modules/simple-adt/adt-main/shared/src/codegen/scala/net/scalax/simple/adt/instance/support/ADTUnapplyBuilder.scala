
    package net.scalax.simple.adt
    package instance
    package support

    trait ADTUnapplyBuilder {
      
          trait ADTOptionsUnapply1 {
            def unapply[T1](
              p1:  AdtCoProduct.Use.Positive[T1, _ ]
            ): Option[T1] = p1._foldCoProduct(p1 => Option.empty, p0 => Some(p0))
          }
        

          trait ADTOptionsUnapply2 {
            def unapply[T2](
              p2: AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[T2, _ ] ]
            ): Option[T2] = p2._foldCoProduct(p2 => Option.empty, p1 => p1._foldCoProduct(p1 => Option.empty, p0 => Some(p0)))
          }
        

          trait ADTOptionsUnapply3 {
            def unapply[T3](
              p3: AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[T3, _ ] ] ]
            ): Option[T3] = p3._foldCoProduct(p3 => Option.empty, p2 => p2._foldCoProduct(p2 => Option.empty, p1 => p1._foldCoProduct(p1 => Option.empty, p0 => Some(p0))))
          }
        

          trait ADTOptionsUnapply4 {
            def unapply[T4](
              p4: AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[T4, _ ] ] ] ]
            ): Option[T4] = p4._foldCoProduct(p4 => Option.empty, p3 => p3._foldCoProduct(p3 => Option.empty, p2 => p2._foldCoProduct(p2 => Option.empty, p1 => p1._foldCoProduct(p1 => Option.empty, p0 => Some(p0)))))
          }
        

          trait ADTOptionsUnapply5 {
            def unapply[T5](
              p5: AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[T5, _ ] ] ] ] ]
            ): Option[T5] = p5._foldCoProduct(p5 => Option.empty, p4 => p4._foldCoProduct(p4 => Option.empty, p3 => p3._foldCoProduct(p3 => Option.empty, p2 => p2._foldCoProduct(p2 => Option.empty, p1 => p1._foldCoProduct(p1 => Option.empty, p0 => Some(p0))))))
          }
        

          trait ADTOptionsUnapply6 {
            def unapply[T6](
              p6: AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[T6, _ ] ] ] ] ] ]
            ): Option[T6] = p6._foldCoProduct(p6 => Option.empty, p5 => p5._foldCoProduct(p5 => Option.empty, p4 => p4._foldCoProduct(p4 => Option.empty, p3 => p3._foldCoProduct(p3 => Option.empty, p2 => p2._foldCoProduct(p2 => Option.empty, p1 => p1._foldCoProduct(p1 => Option.empty, p0 => Some(p0)))))))
          }
        

          trait ADTOptionsUnapply7 {
            def unapply[T7](
              p7: AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[T7, _ ] ] ] ] ] ] ]
            ): Option[T7] = p7._foldCoProduct(p7 => Option.empty, p6 => p6._foldCoProduct(p6 => Option.empty, p5 => p5._foldCoProduct(p5 => Option.empty, p4 => p4._foldCoProduct(p4 => Option.empty, p3 => p3._foldCoProduct(p3 => Option.empty, p2 => p2._foldCoProduct(p2 => Option.empty, p1 => p1._foldCoProduct(p1 => Option.empty, p0 => Some(p0))))))))
          }
        

          trait ADTOptionsUnapply8 {
            def unapply[T8](
              p8: AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[T8, _ ] ] ] ] ] ] ] ]
            ): Option[T8] = p8._foldCoProduct(p8 => Option.empty, p7 => p7._foldCoProduct(p7 => Option.empty, p6 => p6._foldCoProduct(p6 => Option.empty, p5 => p5._foldCoProduct(p5 => Option.empty, p4 => p4._foldCoProduct(p4 => Option.empty, p3 => p3._foldCoProduct(p3 => Option.empty, p2 => p2._foldCoProduct(p2 => Option.empty, p1 => p1._foldCoProduct(p1 => Option.empty, p0 => Some(p0)))))))))
          }
        

          trait ADTOptionsUnapply9 {
            def unapply[T9](
              p9: AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[T9, _ ] ] ] ] ] ] ] ] ]
            ): Option[T9] = p9._foldCoProduct(p9 => Option.empty, p8 => p8._foldCoProduct(p8 => Option.empty, p7 => p7._foldCoProduct(p7 => Option.empty, p6 => p6._foldCoProduct(p6 => Option.empty, p5 => p5._foldCoProduct(p5 => Option.empty, p4 => p4._foldCoProduct(p4 => Option.empty, p3 => p3._foldCoProduct(p3 => Option.empty, p2 => p2._foldCoProduct(p2 => Option.empty, p1 => p1._foldCoProduct(p1 => Option.empty, p0 => Some(p0))))))))))
          }
        

          trait ADTOptionsUnapply10 {
            def unapply[T10](
              p10: AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[T10, _ ] ] ] ] ] ] ] ] ] ]
            ): Option[T10] = p10._foldCoProduct(p10 => Option.empty, p9 => p9._foldCoProduct(p9 => Option.empty, p8 => p8._foldCoProduct(p8 => Option.empty, p7 => p7._foldCoProduct(p7 => Option.empty, p6 => p6._foldCoProduct(p6 => Option.empty, p5 => p5._foldCoProduct(p5 => Option.empty, p4 => p4._foldCoProduct(p4 => Option.empty, p3 => p3._foldCoProduct(p3 => Option.empty, p2 => p2._foldCoProduct(p2 => Option.empty, p1 => p1._foldCoProduct(p1 => Option.empty, p0 => Some(p0)))))))))))
          }
        

          trait ADTOptionsUnapply11 {
            def unapply[T11](
              p11: AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[T11, _ ] ] ] ] ] ] ] ] ] ] ]
            ): Option[T11] = p11._foldCoProduct(p11 => Option.empty, p10 => p10._foldCoProduct(p10 => Option.empty, p9 => p9._foldCoProduct(p9 => Option.empty, p8 => p8._foldCoProduct(p8 => Option.empty, p7 => p7._foldCoProduct(p7 => Option.empty, p6 => p6._foldCoProduct(p6 => Option.empty, p5 => p5._foldCoProduct(p5 => Option.empty, p4 => p4._foldCoProduct(p4 => Option.empty, p3 => p3._foldCoProduct(p3 => Option.empty, p2 => p2._foldCoProduct(p2 => Option.empty, p1 => p1._foldCoProduct(p1 => Option.empty, p0 => Some(p0))))))))))))
          }
        

          trait ADTOptionsUnapply12 {
            def unapply[T12](
              p12: AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[T12, _ ] ] ] ] ] ] ] ] ] ] ] ]
            ): Option[T12] = p12._foldCoProduct(p12 => Option.empty, p11 => p11._foldCoProduct(p11 => Option.empty, p10 => p10._foldCoProduct(p10 => Option.empty, p9 => p9._foldCoProduct(p9 => Option.empty, p8 => p8._foldCoProduct(p8 => Option.empty, p7 => p7._foldCoProduct(p7 => Option.empty, p6 => p6._foldCoProduct(p6 => Option.empty, p5 => p5._foldCoProduct(p5 => Option.empty, p4 => p4._foldCoProduct(p4 => Option.empty, p3 => p3._foldCoProduct(p3 => Option.empty, p2 => p2._foldCoProduct(p2 => Option.empty, p1 => p1._foldCoProduct(p1 => Option.empty, p0 => Some(p0)))))))))))))
          }
        

          trait ADTOptionsUnapply13 {
            def unapply[T13](
              p13: AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[T13, _ ] ] ] ] ] ] ] ] ] ] ] ] ]
            ): Option[T13] = p13._foldCoProduct(p13 => Option.empty, p12 => p12._foldCoProduct(p12 => Option.empty, p11 => p11._foldCoProduct(p11 => Option.empty, p10 => p10._foldCoProduct(p10 => Option.empty, p9 => p9._foldCoProduct(p9 => Option.empty, p8 => p8._foldCoProduct(p8 => Option.empty, p7 => p7._foldCoProduct(p7 => Option.empty, p6 => p6._foldCoProduct(p6 => Option.empty, p5 => p5._foldCoProduct(p5 => Option.empty, p4 => p4._foldCoProduct(p4 => Option.empty, p3 => p3._foldCoProduct(p3 => Option.empty, p2 => p2._foldCoProduct(p2 => Option.empty, p1 => p1._foldCoProduct(p1 => Option.empty, p0 => Some(p0))))))))))))))
          }
        

          trait ADTOptionsUnapply14 {
            def unapply[T14](
              p14: AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[T14, _ ] ] ] ] ] ] ] ] ] ] ] ] ] ]
            ): Option[T14] = p14._foldCoProduct(p14 => Option.empty, p13 => p13._foldCoProduct(p13 => Option.empty, p12 => p12._foldCoProduct(p12 => Option.empty, p11 => p11._foldCoProduct(p11 => Option.empty, p10 => p10._foldCoProduct(p10 => Option.empty, p9 => p9._foldCoProduct(p9 => Option.empty, p8 => p8._foldCoProduct(p8 => Option.empty, p7 => p7._foldCoProduct(p7 => Option.empty, p6 => p6._foldCoProduct(p6 => Option.empty, p5 => p5._foldCoProduct(p5 => Option.empty, p4 => p4._foldCoProduct(p4 => Option.empty, p3 => p3._foldCoProduct(p3 => Option.empty, p2 => p2._foldCoProduct(p2 => Option.empty, p1 => p1._foldCoProduct(p1 => Option.empty, p0 => Some(p0)))))))))))))))
          }
        

          trait ADTOptionsUnapply15 {
            def unapply[T15](
              p15: AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[T15, _ ] ] ] ] ] ] ] ] ] ] ] ] ] ] ]
            ): Option[T15] = p15._foldCoProduct(p15 => Option.empty, p14 => p14._foldCoProduct(p14 => Option.empty, p13 => p13._foldCoProduct(p13 => Option.empty, p12 => p12._foldCoProduct(p12 => Option.empty, p11 => p11._foldCoProduct(p11 => Option.empty, p10 => p10._foldCoProduct(p10 => Option.empty, p9 => p9._foldCoProduct(p9 => Option.empty, p8 => p8._foldCoProduct(p8 => Option.empty, p7 => p7._foldCoProduct(p7 => Option.empty, p6 => p6._foldCoProduct(p6 => Option.empty, p5 => p5._foldCoProduct(p5 => Option.empty, p4 => p4._foldCoProduct(p4 => Option.empty, p3 => p3._foldCoProduct(p3 => Option.empty, p2 => p2._foldCoProduct(p2 => Option.empty, p1 => p1._foldCoProduct(p1 => Option.empty, p0 => Some(p0))))))))))))))))
          }
        

          trait ADTOptionsUnapply16 {
            def unapply[T16](
              p16: AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[T16, _ ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ]
            ): Option[T16] = p16._foldCoProduct(p16 => Option.empty, p15 => p15._foldCoProduct(p15 => Option.empty, p14 => p14._foldCoProduct(p14 => Option.empty, p13 => p13._foldCoProduct(p13 => Option.empty, p12 => p12._foldCoProduct(p12 => Option.empty, p11 => p11._foldCoProduct(p11 => Option.empty, p10 => p10._foldCoProduct(p10 => Option.empty, p9 => p9._foldCoProduct(p9 => Option.empty, p8 => p8._foldCoProduct(p8 => Option.empty, p7 => p7._foldCoProduct(p7 => Option.empty, p6 => p6._foldCoProduct(p6 => Option.empty, p5 => p5._foldCoProduct(p5 => Option.empty, p4 => p4._foldCoProduct(p4 => Option.empty, p3 => p3._foldCoProduct(p3 => Option.empty, p2 => p2._foldCoProduct(p2 => Option.empty, p1 => p1._foldCoProduct(p1 => Option.empty, p0 => Some(p0)))))))))))))))))
          }
        

          trait ADTOptionsUnapply17 {
            def unapply[T17](
              p17: AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[T17, _ ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ]
            ): Option[T17] = p17._foldCoProduct(p17 => Option.empty, p16 => p16._foldCoProduct(p16 => Option.empty, p15 => p15._foldCoProduct(p15 => Option.empty, p14 => p14._foldCoProduct(p14 => Option.empty, p13 => p13._foldCoProduct(p13 => Option.empty, p12 => p12._foldCoProduct(p12 => Option.empty, p11 => p11._foldCoProduct(p11 => Option.empty, p10 => p10._foldCoProduct(p10 => Option.empty, p9 => p9._foldCoProduct(p9 => Option.empty, p8 => p8._foldCoProduct(p8 => Option.empty, p7 => p7._foldCoProduct(p7 => Option.empty, p6 => p6._foldCoProduct(p6 => Option.empty, p5 => p5._foldCoProduct(p5 => Option.empty, p4 => p4._foldCoProduct(p4 => Option.empty, p3 => p3._foldCoProduct(p3 => Option.empty, p2 => p2._foldCoProduct(p2 => Option.empty, p1 => p1._foldCoProduct(p1 => Option.empty, p0 => Some(p0))))))))))))))))))
          }
        

          trait ADTOptionsUnapply18 {
            def unapply[T18](
              p18: AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[T18, _ ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ]
            ): Option[T18] = p18._foldCoProduct(p18 => Option.empty, p17 => p17._foldCoProduct(p17 => Option.empty, p16 => p16._foldCoProduct(p16 => Option.empty, p15 => p15._foldCoProduct(p15 => Option.empty, p14 => p14._foldCoProduct(p14 => Option.empty, p13 => p13._foldCoProduct(p13 => Option.empty, p12 => p12._foldCoProduct(p12 => Option.empty, p11 => p11._foldCoProduct(p11 => Option.empty, p10 => p10._foldCoProduct(p10 => Option.empty, p9 => p9._foldCoProduct(p9 => Option.empty, p8 => p8._foldCoProduct(p8 => Option.empty, p7 => p7._foldCoProduct(p7 => Option.empty, p6 => p6._foldCoProduct(p6 => Option.empty, p5 => p5._foldCoProduct(p5 => Option.empty, p4 => p4._foldCoProduct(p4 => Option.empty, p3 => p3._foldCoProduct(p3 => Option.empty, p2 => p2._foldCoProduct(p2 => Option.empty, p1 => p1._foldCoProduct(p1 => Option.empty, p0 => Some(p0)))))))))))))))))))
          }
        

          trait ADTOptionsUnapply19 {
            def unapply[T19](
              p19: AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[T19, _ ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ]
            ): Option[T19] = p19._foldCoProduct(p19 => Option.empty, p18 => p18._foldCoProduct(p18 => Option.empty, p17 => p17._foldCoProduct(p17 => Option.empty, p16 => p16._foldCoProduct(p16 => Option.empty, p15 => p15._foldCoProduct(p15 => Option.empty, p14 => p14._foldCoProduct(p14 => Option.empty, p13 => p13._foldCoProduct(p13 => Option.empty, p12 => p12._foldCoProduct(p12 => Option.empty, p11 => p11._foldCoProduct(p11 => Option.empty, p10 => p10._foldCoProduct(p10 => Option.empty, p9 => p9._foldCoProduct(p9 => Option.empty, p8 => p8._foldCoProduct(p8 => Option.empty, p7 => p7._foldCoProduct(p7 => Option.empty, p6 => p6._foldCoProduct(p6 => Option.empty, p5 => p5._foldCoProduct(p5 => Option.empty, p4 => p4._foldCoProduct(p4 => Option.empty, p3 => p3._foldCoProduct(p3 => Option.empty, p2 => p2._foldCoProduct(p2 => Option.empty, p1 => p1._foldCoProduct(p1 => Option.empty, p0 => Some(p0))))))))))))))))))))
          }
        

          trait ADTOptionsUnapply20 {
            def unapply[T20](
              p20: AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[T20, _ ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ]
            ): Option[T20] = p20._foldCoProduct(p20 => Option.empty, p19 => p19._foldCoProduct(p19 => Option.empty, p18 => p18._foldCoProduct(p18 => Option.empty, p17 => p17._foldCoProduct(p17 => Option.empty, p16 => p16._foldCoProduct(p16 => Option.empty, p15 => p15._foldCoProduct(p15 => Option.empty, p14 => p14._foldCoProduct(p14 => Option.empty, p13 => p13._foldCoProduct(p13 => Option.empty, p12 => p12._foldCoProduct(p12 => Option.empty, p11 => p11._foldCoProduct(p11 => Option.empty, p10 => p10._foldCoProduct(p10 => Option.empty, p9 => p9._foldCoProduct(p9 => Option.empty, p8 => p8._foldCoProduct(p8 => Option.empty, p7 => p7._foldCoProduct(p7 => Option.empty, p6 => p6._foldCoProduct(p6 => Option.empty, p5 => p5._foldCoProduct(p5 => Option.empty, p4 => p4._foldCoProduct(p4 => Option.empty, p3 => p3._foldCoProduct(p3 => Option.empty, p2 => p2._foldCoProduct(p2 => Option.empty, p1 => p1._foldCoProduct(p1 => Option.empty, p0 => Some(p0)))))))))))))))))))))
          }
        

          trait ADTOptionsUnapply21 {
            def unapply[T21](
              p21: AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[T21, _ ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ]
            ): Option[T21] = p21._foldCoProduct(p21 => Option.empty, p20 => p20._foldCoProduct(p20 => Option.empty, p19 => p19._foldCoProduct(p19 => Option.empty, p18 => p18._foldCoProduct(p18 => Option.empty, p17 => p17._foldCoProduct(p17 => Option.empty, p16 => p16._foldCoProduct(p16 => Option.empty, p15 => p15._foldCoProduct(p15 => Option.empty, p14 => p14._foldCoProduct(p14 => Option.empty, p13 => p13._foldCoProduct(p13 => Option.empty, p12 => p12._foldCoProduct(p12 => Option.empty, p11 => p11._foldCoProduct(p11 => Option.empty, p10 => p10._foldCoProduct(p10 => Option.empty, p9 => p9._foldCoProduct(p9 => Option.empty, p8 => p8._foldCoProduct(p8 => Option.empty, p7 => p7._foldCoProduct(p7 => Option.empty, p6 => p6._foldCoProduct(p6 => Option.empty, p5 => p5._foldCoProduct(p5 => Option.empty, p4 => p4._foldCoProduct(p4 => Option.empty, p3 => p3._foldCoProduct(p3 => Option.empty, p2 => p2._foldCoProduct(p2 => Option.empty, p1 => p1._foldCoProduct(p1 => Option.empty, p0 => Some(p0))))))))))))))))))))))
          }
        

          trait ADTOptionsUnapply22 {
            def unapply[T22](
              p22: AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[_,  AdtCoProduct.Use.Positive[T22, _ ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ]
            ): Option[T22] = p22._foldCoProduct(p22 => Option.empty, p21 => p21._foldCoProduct(p21 => Option.empty, p20 => p20._foldCoProduct(p20 => Option.empty, p19 => p19._foldCoProduct(p19 => Option.empty, p18 => p18._foldCoProduct(p18 => Option.empty, p17 => p17._foldCoProduct(p17 => Option.empty, p16 => p16._foldCoProduct(p16 => Option.empty, p15 => p15._foldCoProduct(p15 => Option.empty, p14 => p14._foldCoProduct(p14 => Option.empty, p13 => p13._foldCoProduct(p13 => Option.empty, p12 => p12._foldCoProduct(p12 => Option.empty, p11 => p11._foldCoProduct(p11 => Option.empty, p10 => p10._foldCoProduct(p10 => Option.empty, p9 => p9._foldCoProduct(p9 => Option.empty, p8 => p8._foldCoProduct(p8 => Option.empty, p7 => p7._foldCoProduct(p7 => Option.empty, p6 => p6._foldCoProduct(p6 => Option.empty, p5 => p5._foldCoProduct(p5 => Option.empty, p4 => p4._foldCoProduct(p4 => Option.empty, p3 => p3._foldCoProduct(p3 => Option.empty, p2 => p2._foldCoProduct(p2 => Option.empty, p1 => p1._foldCoProduct(p1 => Option.empty, p0 => Some(p0)))))))))))))))))))))))
          }
        
    }
  