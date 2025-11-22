
    package net.scalax.simple.adt
    package instance
    package support

    object helper1 {
      class CoProduct1Helper[T1] {
        FoldApplySelf: CoProduct1[T1] =>
      }

      
      class CoProduct2Helper[T1,T2] {
        FoldApplySelf: CoProduct2[T1,T2] =>
        
        def map2[TargetN](func: T2 => TargetN): CoProduct2[
          T1,TargetN
        ] = FoldApplySelf.tail.map1(func).tail
      
        
        def drop2[TargetN]: Either[T2, CoProduct1[T1]] = ???
      
      }
    

      class CoProduct3Helper[T1,T2,T3] {
        FoldApplySelf: CoProduct3[T1,T2,T3] =>
        
        def map2[TargetN](func: T2 => TargetN): CoProduct3[
          T1,TargetN,T3
        ] = FoldApplySelf.tail.map1(func).tail.tail
      

        def map3[TargetN](func: T3 => TargetN): CoProduct3[
          T1,T2,TargetN
        ] = FoldApplySelf.tail.tail.map1(func).tail
      
        
        def drop2[TargetN]: Either[T2, CoProduct2[T1,T3]] = ???
      

        def drop3[TargetN]: Either[T3, CoProduct2[T1,T2]] = ???
      
      }
    

      class CoProduct4Helper[T1,T2,T3,T4] {
        FoldApplySelf: CoProduct4[T1,T2,T3,T4] =>
        
        def map2[TargetN](func: T2 => TargetN): CoProduct4[
          T1,TargetN,T3,T4
        ] = FoldApplySelf.tail.map1(func).tail.tail.tail
      

        def map3[TargetN](func: T3 => TargetN): CoProduct4[
          T1,T2,TargetN,T4
        ] = FoldApplySelf.tail.tail.map1(func).tail.tail
      

        def map4[TargetN](func: T4 => TargetN): CoProduct4[
          T1,T2,T3,TargetN
        ] = FoldApplySelf.tail.tail.tail.map1(func).tail
      
        
        def drop2[TargetN]: Either[T2, CoProduct3[T1,T3,T4]] = ???
      

        def drop3[TargetN]: Either[T3, CoProduct3[T1,T2,T4]] = ???
      

        def drop4[TargetN]: Either[T4, CoProduct3[T1,T2,T3]] = ???
      
      }
    

      class CoProduct5Helper[T1,T2,T3,T4,T5] {
        FoldApplySelf: CoProduct5[T1,T2,T3,T4,T5] =>
        
        def map2[TargetN](func: T2 => TargetN): CoProduct5[
          T1,TargetN,T3,T4,T5
        ] = FoldApplySelf.tail.map1(func).tail.tail.tail.tail
      

        def map3[TargetN](func: T3 => TargetN): CoProduct5[
          T1,T2,TargetN,T4,T5
        ] = FoldApplySelf.tail.tail.map1(func).tail.tail.tail
      

        def map4[TargetN](func: T4 => TargetN): CoProduct5[
          T1,T2,T3,TargetN,T5
        ] = FoldApplySelf.tail.tail.tail.map1(func).tail.tail
      

        def map5[TargetN](func: T5 => TargetN): CoProduct5[
          T1,T2,T3,T4,TargetN
        ] = FoldApplySelf.tail.tail.tail.tail.map1(func).tail
      
        
        def drop2[TargetN]: Either[T2, CoProduct4[T1,T3,T4,T5]] = ???
      

        def drop3[TargetN]: Either[T3, CoProduct4[T1,T2,T4,T5]] = ???
      

        def drop4[TargetN]: Either[T4, CoProduct4[T1,T2,T3,T5]] = ???
      

        def drop5[TargetN]: Either[T5, CoProduct4[T1,T2,T3,T4]] = ???
      
      }
    

      class CoProduct6Helper[T1,T2,T3,T4,T5,T6] {
        FoldApplySelf: CoProduct6[T1,T2,T3,T4,T5,T6] =>
        
        def map2[TargetN](func: T2 => TargetN): CoProduct6[
          T1,TargetN,T3,T4,T5,T6
        ] = FoldApplySelf.tail.map1(func).tail.tail.tail.tail.tail
      

        def map3[TargetN](func: T3 => TargetN): CoProduct6[
          T1,T2,TargetN,T4,T5,T6
        ] = FoldApplySelf.tail.tail.map1(func).tail.tail.tail.tail
      

        def map4[TargetN](func: T4 => TargetN): CoProduct6[
          T1,T2,T3,TargetN,T5,T6
        ] = FoldApplySelf.tail.tail.tail.map1(func).tail.tail.tail
      

        def map5[TargetN](func: T5 => TargetN): CoProduct6[
          T1,T2,T3,T4,TargetN,T6
        ] = FoldApplySelf.tail.tail.tail.tail.map1(func).tail.tail
      

        def map6[TargetN](func: T6 => TargetN): CoProduct6[
          T1,T2,T3,T4,T5,TargetN
        ] = FoldApplySelf.tail.tail.tail.tail.tail.map1(func).tail
      
        
        def drop2[TargetN]: Either[T2, CoProduct5[T1,T3,T4,T5,T6]] = ???
      

        def drop3[TargetN]: Either[T3, CoProduct5[T1,T2,T4,T5,T6]] = ???
      

        def drop4[TargetN]: Either[T4, CoProduct5[T1,T2,T3,T5,T6]] = ???
      

        def drop5[TargetN]: Either[T5, CoProduct5[T1,T2,T3,T4,T6]] = ???
      

        def drop6[TargetN]: Either[T6, CoProduct5[T1,T2,T3,T4,T5]] = ???
      
      }
    

      class CoProduct7Helper[T1,T2,T3,T4,T5,T6,T7] {
        FoldApplySelf: CoProduct7[T1,T2,T3,T4,T5,T6,T7] =>
        
        def map2[TargetN](func: T2 => TargetN): CoProduct7[
          T1,TargetN,T3,T4,T5,T6,T7
        ] = FoldApplySelf.tail.map1(func).tail.tail.tail.tail.tail.tail
      

        def map3[TargetN](func: T3 => TargetN): CoProduct7[
          T1,T2,TargetN,T4,T5,T6,T7
        ] = FoldApplySelf.tail.tail.map1(func).tail.tail.tail.tail.tail
      

        def map4[TargetN](func: T4 => TargetN): CoProduct7[
          T1,T2,T3,TargetN,T5,T6,T7
        ] = FoldApplySelf.tail.tail.tail.map1(func).tail.tail.tail.tail
      

        def map5[TargetN](func: T5 => TargetN): CoProduct7[
          T1,T2,T3,T4,TargetN,T6,T7
        ] = FoldApplySelf.tail.tail.tail.tail.map1(func).tail.tail.tail
      

        def map6[TargetN](func: T6 => TargetN): CoProduct7[
          T1,T2,T3,T4,T5,TargetN,T7
        ] = FoldApplySelf.tail.tail.tail.tail.tail.map1(func).tail.tail
      

        def map7[TargetN](func: T7 => TargetN): CoProduct7[
          T1,T2,T3,T4,T5,T6,TargetN
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.map1(func).tail
      
        
        def drop2[TargetN]: Either[T2, CoProduct6[T1,T3,T4,T5,T6,T7]] = ???
      

        def drop3[TargetN]: Either[T3, CoProduct6[T1,T2,T4,T5,T6,T7]] = ???
      

        def drop4[TargetN]: Either[T4, CoProduct6[T1,T2,T3,T5,T6,T7]] = ???
      

        def drop5[TargetN]: Either[T5, CoProduct6[T1,T2,T3,T4,T6,T7]] = ???
      

        def drop6[TargetN]: Either[T6, CoProduct6[T1,T2,T3,T4,T5,T7]] = ???
      

        def drop7[TargetN]: Either[T7, CoProduct6[T1,T2,T3,T4,T5,T6]] = ???
      
      }
    

      class CoProduct8Helper[T1,T2,T3,T4,T5,T6,T7,T8] {
        FoldApplySelf: CoProduct8[T1,T2,T3,T4,T5,T6,T7,T8] =>
        
        def map2[TargetN](func: T2 => TargetN): CoProduct8[
          T1,TargetN,T3,T4,T5,T6,T7,T8
        ] = FoldApplySelf.tail.map1(func).tail.tail.tail.tail.tail.tail.tail
      

        def map3[TargetN](func: T3 => TargetN): CoProduct8[
          T1,T2,TargetN,T4,T5,T6,T7,T8
        ] = FoldApplySelf.tail.tail.map1(func).tail.tail.tail.tail.tail.tail
      

        def map4[TargetN](func: T4 => TargetN): CoProduct8[
          T1,T2,T3,TargetN,T5,T6,T7,T8
        ] = FoldApplySelf.tail.tail.tail.map1(func).tail.tail.tail.tail.tail
      

        def map5[TargetN](func: T5 => TargetN): CoProduct8[
          T1,T2,T3,T4,TargetN,T6,T7,T8
        ] = FoldApplySelf.tail.tail.tail.tail.map1(func).tail.tail.tail.tail
      

        def map6[TargetN](func: T6 => TargetN): CoProduct8[
          T1,T2,T3,T4,T5,TargetN,T7,T8
        ] = FoldApplySelf.tail.tail.tail.tail.tail.map1(func).tail.tail.tail
      

        def map7[TargetN](func: T7 => TargetN): CoProduct8[
          T1,T2,T3,T4,T5,T6,TargetN,T8
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.map1(func).tail.tail
      

        def map8[TargetN](func: T8 => TargetN): CoProduct8[
          T1,T2,T3,T4,T5,T6,T7,TargetN
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.map1(func).tail
      
        
        def drop2[TargetN]: Either[T2, CoProduct7[T1,T3,T4,T5,T6,T7,T8]] = ???
      

        def drop3[TargetN]: Either[T3, CoProduct7[T1,T2,T4,T5,T6,T7,T8]] = ???
      

        def drop4[TargetN]: Either[T4, CoProduct7[T1,T2,T3,T5,T6,T7,T8]] = ???
      

        def drop5[TargetN]: Either[T5, CoProduct7[T1,T2,T3,T4,T6,T7,T8]] = ???
      

        def drop6[TargetN]: Either[T6, CoProduct7[T1,T2,T3,T4,T5,T7,T8]] = ???
      

        def drop7[TargetN]: Either[T7, CoProduct7[T1,T2,T3,T4,T5,T6,T8]] = ???
      

        def drop8[TargetN]: Either[T8, CoProduct7[T1,T2,T3,T4,T5,T6,T7]] = ???
      
      }
    

      class CoProduct9Helper[T1,T2,T3,T4,T5,T6,T7,T8,T9] {
        FoldApplySelf: CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T9] =>
        
        def map2[TargetN](func: T2 => TargetN): CoProduct9[
          T1,TargetN,T3,T4,T5,T6,T7,T8,T9
        ] = FoldApplySelf.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail
      

        def map3[TargetN](func: T3 => TargetN): CoProduct9[
          T1,T2,TargetN,T4,T5,T6,T7,T8,T9
        ] = FoldApplySelf.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail
      

        def map4[TargetN](func: T4 => TargetN): CoProduct9[
          T1,T2,T3,TargetN,T5,T6,T7,T8,T9
        ] = FoldApplySelf.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail
      

        def map5[TargetN](func: T5 => TargetN): CoProduct9[
          T1,T2,T3,T4,TargetN,T6,T7,T8,T9
        ] = FoldApplySelf.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail
      

        def map6[TargetN](func: T6 => TargetN): CoProduct9[
          T1,T2,T3,T4,T5,TargetN,T7,T8,T9
        ] = FoldApplySelf.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail
      

        def map7[TargetN](func: T7 => TargetN): CoProduct9[
          T1,T2,T3,T4,T5,T6,TargetN,T8,T9
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail
      

        def map8[TargetN](func: T8 => TargetN): CoProduct9[
          T1,T2,T3,T4,T5,T6,T7,TargetN,T9
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail
      

        def map9[TargetN](func: T9 => TargetN): CoProduct9[
          T1,T2,T3,T4,T5,T6,T7,T8,TargetN
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail
      
        
        def drop2[TargetN]: Either[T2, CoProduct8[T1,T3,T4,T5,T6,T7,T8,T9]] = ???
      

        def drop3[TargetN]: Either[T3, CoProduct8[T1,T2,T4,T5,T6,T7,T8,T9]] = ???
      

        def drop4[TargetN]: Either[T4, CoProduct8[T1,T2,T3,T5,T6,T7,T8,T9]] = ???
      

        def drop5[TargetN]: Either[T5, CoProduct8[T1,T2,T3,T4,T6,T7,T8,T9]] = ???
      

        def drop6[TargetN]: Either[T6, CoProduct8[T1,T2,T3,T4,T5,T7,T8,T9]] = ???
      

        def drop7[TargetN]: Either[T7, CoProduct8[T1,T2,T3,T4,T5,T6,T8,T9]] = ???
      

        def drop8[TargetN]: Either[T8, CoProduct8[T1,T2,T3,T4,T5,T6,T7,T9]] = ???
      

        def drop9[TargetN]: Either[T9, CoProduct8[T1,T2,T3,T4,T5,T6,T7,T8]] = ???
      
      }
    

      class CoProduct10Helper[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] {
        FoldApplySelf: CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] =>
        
        def map2[TargetN](func: T2 => TargetN): CoProduct10[
          T1,TargetN,T3,T4,T5,T6,T7,T8,T9,T10
        ] = FoldApplySelf.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map3[TargetN](func: T3 => TargetN): CoProduct10[
          T1,T2,TargetN,T4,T5,T6,T7,T8,T9,T10
        ] = FoldApplySelf.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail
      

        def map4[TargetN](func: T4 => TargetN): CoProduct10[
          T1,T2,T3,TargetN,T5,T6,T7,T8,T9,T10
        ] = FoldApplySelf.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail
      

        def map5[TargetN](func: T5 => TargetN): CoProduct10[
          T1,T2,T3,T4,TargetN,T6,T7,T8,T9,T10
        ] = FoldApplySelf.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail
      

        def map6[TargetN](func: T6 => TargetN): CoProduct10[
          T1,T2,T3,T4,T5,TargetN,T7,T8,T9,T10
        ] = FoldApplySelf.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail
      

        def map7[TargetN](func: T7 => TargetN): CoProduct10[
          T1,T2,T3,T4,T5,T6,TargetN,T8,T9,T10
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail
      

        def map8[TargetN](func: T8 => TargetN): CoProduct10[
          T1,T2,T3,T4,T5,T6,T7,TargetN,T9,T10
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail
      

        def map9[TargetN](func: T9 => TargetN): CoProduct10[
          T1,T2,T3,T4,T5,T6,T7,T8,TargetN,T10
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail
      

        def map10[TargetN](func: T10 => TargetN): CoProduct10[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,TargetN
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail
      
        
        def drop2[TargetN]: Either[T2, CoProduct9[T1,T3,T4,T5,T6,T7,T8,T9,T10]] = ???
      

        def drop3[TargetN]: Either[T3, CoProduct9[T1,T2,T4,T5,T6,T7,T8,T9,T10]] = ???
      

        def drop4[TargetN]: Either[T4, CoProduct9[T1,T2,T3,T5,T6,T7,T8,T9,T10]] = ???
      

        def drop5[TargetN]: Either[T5, CoProduct9[T1,T2,T3,T4,T6,T7,T8,T9,T10]] = ???
      

        def drop6[TargetN]: Either[T6, CoProduct9[T1,T2,T3,T4,T5,T7,T8,T9,T10]] = ???
      

        def drop7[TargetN]: Either[T7, CoProduct9[T1,T2,T3,T4,T5,T6,T8,T9,T10]] = ???
      

        def drop8[TargetN]: Either[T8, CoProduct9[T1,T2,T3,T4,T5,T6,T7,T9,T10]] = ???
      

        def drop9[TargetN]: Either[T9, CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T10]] = ???
      

        def drop10[TargetN]: Either[T10, CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T9]] = ???
      
      }
    

      class CoProduct11Helper[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] {
        FoldApplySelf: CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] =>
        
        def map2[TargetN](func: T2 => TargetN): CoProduct11[
          T1,TargetN,T3,T4,T5,T6,T7,T8,T9,T10,T11
        ] = FoldApplySelf.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map3[TargetN](func: T3 => TargetN): CoProduct11[
          T1,T2,TargetN,T4,T5,T6,T7,T8,T9,T10,T11
        ] = FoldApplySelf.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map4[TargetN](func: T4 => TargetN): CoProduct11[
          T1,T2,T3,TargetN,T5,T6,T7,T8,T9,T10,T11
        ] = FoldApplySelf.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail
      

        def map5[TargetN](func: T5 => TargetN): CoProduct11[
          T1,T2,T3,T4,TargetN,T6,T7,T8,T9,T10,T11
        ] = FoldApplySelf.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail
      

        def map6[TargetN](func: T6 => TargetN): CoProduct11[
          T1,T2,T3,T4,T5,TargetN,T7,T8,T9,T10,T11
        ] = FoldApplySelf.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail
      

        def map7[TargetN](func: T7 => TargetN): CoProduct11[
          T1,T2,T3,T4,T5,T6,TargetN,T8,T9,T10,T11
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail
      

        def map8[TargetN](func: T8 => TargetN): CoProduct11[
          T1,T2,T3,T4,T5,T6,T7,TargetN,T9,T10,T11
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail
      

        def map9[TargetN](func: T9 => TargetN): CoProduct11[
          T1,T2,T3,T4,T5,T6,T7,T8,TargetN,T10,T11
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail
      

        def map10[TargetN](func: T10 => TargetN): CoProduct11[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,TargetN,T11
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail
      

        def map11[TargetN](func: T11 => TargetN): CoProduct11[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,TargetN
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail
      
        
        def drop2[TargetN]: Either[T2, CoProduct10[T1,T3,T4,T5,T6,T7,T8,T9,T10,T11]] = ???
      

        def drop3[TargetN]: Either[T3, CoProduct10[T1,T2,T4,T5,T6,T7,T8,T9,T10,T11]] = ???
      

        def drop4[TargetN]: Either[T4, CoProduct10[T1,T2,T3,T5,T6,T7,T8,T9,T10,T11]] = ???
      

        def drop5[TargetN]: Either[T5, CoProduct10[T1,T2,T3,T4,T6,T7,T8,T9,T10,T11]] = ???
      

        def drop6[TargetN]: Either[T6, CoProduct10[T1,T2,T3,T4,T5,T7,T8,T9,T10,T11]] = ???
      

        def drop7[TargetN]: Either[T7, CoProduct10[T1,T2,T3,T4,T5,T6,T8,T9,T10,T11]] = ???
      

        def drop8[TargetN]: Either[T8, CoProduct10[T1,T2,T3,T4,T5,T6,T7,T9,T10,T11]] = ???
      

        def drop9[TargetN]: Either[T9, CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T10,T11]] = ???
      

        def drop10[TargetN]: Either[T10, CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T11]] = ???
      

        def drop11[TargetN]: Either[T11, CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]] = ???
      
      }
    

      class CoProduct12Helper[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] {
        FoldApplySelf: CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] =>
        
        def map2[TargetN](func: T2 => TargetN): CoProduct12[
          T1,TargetN,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12
        ] = FoldApplySelf.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map3[TargetN](func: T3 => TargetN): CoProduct12[
          T1,T2,TargetN,T4,T5,T6,T7,T8,T9,T10,T11,T12
        ] = FoldApplySelf.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map4[TargetN](func: T4 => TargetN): CoProduct12[
          T1,T2,T3,TargetN,T5,T6,T7,T8,T9,T10,T11,T12
        ] = FoldApplySelf.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map5[TargetN](func: T5 => TargetN): CoProduct12[
          T1,T2,T3,T4,TargetN,T6,T7,T8,T9,T10,T11,T12
        ] = FoldApplySelf.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail
      

        def map6[TargetN](func: T6 => TargetN): CoProduct12[
          T1,T2,T3,T4,T5,TargetN,T7,T8,T9,T10,T11,T12
        ] = FoldApplySelf.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail
      

        def map7[TargetN](func: T7 => TargetN): CoProduct12[
          T1,T2,T3,T4,T5,T6,TargetN,T8,T9,T10,T11,T12
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail
      

        def map8[TargetN](func: T8 => TargetN): CoProduct12[
          T1,T2,T3,T4,T5,T6,T7,TargetN,T9,T10,T11,T12
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail
      

        def map9[TargetN](func: T9 => TargetN): CoProduct12[
          T1,T2,T3,T4,T5,T6,T7,T8,TargetN,T10,T11,T12
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail
      

        def map10[TargetN](func: T10 => TargetN): CoProduct12[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,TargetN,T11,T12
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail
      

        def map11[TargetN](func: T11 => TargetN): CoProduct12[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,TargetN,T12
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail
      

        def map12[TargetN](func: T12 => TargetN): CoProduct12[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,TargetN
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail
      
        
        def drop2[TargetN]: Either[T2, CoProduct11[T1,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]] = ???
      

        def drop3[TargetN]: Either[T3, CoProduct11[T1,T2,T4,T5,T6,T7,T8,T9,T10,T11,T12]] = ???
      

        def drop4[TargetN]: Either[T4, CoProduct11[T1,T2,T3,T5,T6,T7,T8,T9,T10,T11,T12]] = ???
      

        def drop5[TargetN]: Either[T5, CoProduct11[T1,T2,T3,T4,T6,T7,T8,T9,T10,T11,T12]] = ???
      

        def drop6[TargetN]: Either[T6, CoProduct11[T1,T2,T3,T4,T5,T7,T8,T9,T10,T11,T12]] = ???
      

        def drop7[TargetN]: Either[T7, CoProduct11[T1,T2,T3,T4,T5,T6,T8,T9,T10,T11,T12]] = ???
      

        def drop8[TargetN]: Either[T8, CoProduct11[T1,T2,T3,T4,T5,T6,T7,T9,T10,T11,T12]] = ???
      

        def drop9[TargetN]: Either[T9, CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T10,T11,T12]] = ???
      

        def drop10[TargetN]: Either[T10, CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T11,T12]] = ???
      

        def drop11[TargetN]: Either[T11, CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T12]] = ???
      

        def drop12[TargetN]: Either[T12, CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]] = ???
      
      }
    

      class CoProduct13Helper[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] {
        FoldApplySelf: CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] =>
        
        def map2[TargetN](func: T2 => TargetN): CoProduct13[
          T1,TargetN,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13
        ] = FoldApplySelf.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map3[TargetN](func: T3 => TargetN): CoProduct13[
          T1,T2,TargetN,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13
        ] = FoldApplySelf.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map4[TargetN](func: T4 => TargetN): CoProduct13[
          T1,T2,T3,TargetN,T5,T6,T7,T8,T9,T10,T11,T12,T13
        ] = FoldApplySelf.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map5[TargetN](func: T5 => TargetN): CoProduct13[
          T1,T2,T3,T4,TargetN,T6,T7,T8,T9,T10,T11,T12,T13
        ] = FoldApplySelf.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map6[TargetN](func: T6 => TargetN): CoProduct13[
          T1,T2,T3,T4,T5,TargetN,T7,T8,T9,T10,T11,T12,T13
        ] = FoldApplySelf.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail
      

        def map7[TargetN](func: T7 => TargetN): CoProduct13[
          T1,T2,T3,T4,T5,T6,TargetN,T8,T9,T10,T11,T12,T13
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail
      

        def map8[TargetN](func: T8 => TargetN): CoProduct13[
          T1,T2,T3,T4,T5,T6,T7,TargetN,T9,T10,T11,T12,T13
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail
      

        def map9[TargetN](func: T9 => TargetN): CoProduct13[
          T1,T2,T3,T4,T5,T6,T7,T8,TargetN,T10,T11,T12,T13
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail
      

        def map10[TargetN](func: T10 => TargetN): CoProduct13[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,TargetN,T11,T12,T13
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail
      

        def map11[TargetN](func: T11 => TargetN): CoProduct13[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,TargetN,T12,T13
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail
      

        def map12[TargetN](func: T12 => TargetN): CoProduct13[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,TargetN,T13
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail
      

        def map13[TargetN](func: T13 => TargetN): CoProduct13[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,TargetN
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail
      
        
        def drop2[TargetN]: Either[T2, CoProduct12[T1,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]] = ???
      

        def drop3[TargetN]: Either[T3, CoProduct12[T1,T2,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]] = ???
      

        def drop4[TargetN]: Either[T4, CoProduct12[T1,T2,T3,T5,T6,T7,T8,T9,T10,T11,T12,T13]] = ???
      

        def drop5[TargetN]: Either[T5, CoProduct12[T1,T2,T3,T4,T6,T7,T8,T9,T10,T11,T12,T13]] = ???
      

        def drop6[TargetN]: Either[T6, CoProduct12[T1,T2,T3,T4,T5,T7,T8,T9,T10,T11,T12,T13]] = ???
      

        def drop7[TargetN]: Either[T7, CoProduct12[T1,T2,T3,T4,T5,T6,T8,T9,T10,T11,T12,T13]] = ???
      

        def drop8[TargetN]: Either[T8, CoProduct12[T1,T2,T3,T4,T5,T6,T7,T9,T10,T11,T12,T13]] = ???
      

        def drop9[TargetN]: Either[T9, CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T10,T11,T12,T13]] = ???
      

        def drop10[TargetN]: Either[T10, CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T11,T12,T13]] = ???
      

        def drop11[TargetN]: Either[T11, CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T12,T13]] = ???
      

        def drop12[TargetN]: Either[T12, CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T13]] = ???
      

        def drop13[TargetN]: Either[T13, CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]] = ???
      
      }
    

      class CoProduct14Helper[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] {
        FoldApplySelf: CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] =>
        
        def map2[TargetN](func: T2 => TargetN): CoProduct14[
          T1,TargetN,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14
        ] = FoldApplySelf.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map3[TargetN](func: T3 => TargetN): CoProduct14[
          T1,T2,TargetN,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14
        ] = FoldApplySelf.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map4[TargetN](func: T4 => TargetN): CoProduct14[
          T1,T2,T3,TargetN,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14
        ] = FoldApplySelf.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map5[TargetN](func: T5 => TargetN): CoProduct14[
          T1,T2,T3,T4,TargetN,T6,T7,T8,T9,T10,T11,T12,T13,T14
        ] = FoldApplySelf.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map6[TargetN](func: T6 => TargetN): CoProduct14[
          T1,T2,T3,T4,T5,TargetN,T7,T8,T9,T10,T11,T12,T13,T14
        ] = FoldApplySelf.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map7[TargetN](func: T7 => TargetN): CoProduct14[
          T1,T2,T3,T4,T5,T6,TargetN,T8,T9,T10,T11,T12,T13,T14
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail
      

        def map8[TargetN](func: T8 => TargetN): CoProduct14[
          T1,T2,T3,T4,T5,T6,T7,TargetN,T9,T10,T11,T12,T13,T14
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail
      

        def map9[TargetN](func: T9 => TargetN): CoProduct14[
          T1,T2,T3,T4,T5,T6,T7,T8,TargetN,T10,T11,T12,T13,T14
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail
      

        def map10[TargetN](func: T10 => TargetN): CoProduct14[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,TargetN,T11,T12,T13,T14
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail
      

        def map11[TargetN](func: T11 => TargetN): CoProduct14[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,TargetN,T12,T13,T14
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail
      

        def map12[TargetN](func: T12 => TargetN): CoProduct14[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,TargetN,T13,T14
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail
      

        def map13[TargetN](func: T13 => TargetN): CoProduct14[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,TargetN,T14
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail
      

        def map14[TargetN](func: T14 => TargetN): CoProduct14[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,TargetN
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail
      
        
        def drop2[TargetN]: Either[T2, CoProduct13[T1,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]] = ???
      

        def drop3[TargetN]: Either[T3, CoProduct13[T1,T2,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]] = ???
      

        def drop4[TargetN]: Either[T4, CoProduct13[T1,T2,T3,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]] = ???
      

        def drop5[TargetN]: Either[T5, CoProduct13[T1,T2,T3,T4,T6,T7,T8,T9,T10,T11,T12,T13,T14]] = ???
      

        def drop6[TargetN]: Either[T6, CoProduct13[T1,T2,T3,T4,T5,T7,T8,T9,T10,T11,T12,T13,T14]] = ???
      

        def drop7[TargetN]: Either[T7, CoProduct13[T1,T2,T3,T4,T5,T6,T8,T9,T10,T11,T12,T13,T14]] = ???
      

        def drop8[TargetN]: Either[T8, CoProduct13[T1,T2,T3,T4,T5,T6,T7,T9,T10,T11,T12,T13,T14]] = ???
      

        def drop9[TargetN]: Either[T9, CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T10,T11,T12,T13,T14]] = ???
      

        def drop10[TargetN]: Either[T10, CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T11,T12,T13,T14]] = ???
      

        def drop11[TargetN]: Either[T11, CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T12,T13,T14]] = ???
      

        def drop12[TargetN]: Either[T12, CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T13,T14]] = ???
      

        def drop13[TargetN]: Either[T13, CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T14]] = ???
      

        def drop14[TargetN]: Either[T14, CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]] = ???
      
      }
    

      class CoProduct15Helper[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] {
        FoldApplySelf: CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] =>
        
        def map2[TargetN](func: T2 => TargetN): CoProduct15[
          T1,TargetN,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15
        ] = FoldApplySelf.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map3[TargetN](func: T3 => TargetN): CoProduct15[
          T1,T2,TargetN,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15
        ] = FoldApplySelf.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map4[TargetN](func: T4 => TargetN): CoProduct15[
          T1,T2,T3,TargetN,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15
        ] = FoldApplySelf.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map5[TargetN](func: T5 => TargetN): CoProduct15[
          T1,T2,T3,T4,TargetN,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15
        ] = FoldApplySelf.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map6[TargetN](func: T6 => TargetN): CoProduct15[
          T1,T2,T3,T4,T5,TargetN,T7,T8,T9,T10,T11,T12,T13,T14,T15
        ] = FoldApplySelf.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map7[TargetN](func: T7 => TargetN): CoProduct15[
          T1,T2,T3,T4,T5,T6,TargetN,T8,T9,T10,T11,T12,T13,T14,T15
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map8[TargetN](func: T8 => TargetN): CoProduct15[
          T1,T2,T3,T4,T5,T6,T7,TargetN,T9,T10,T11,T12,T13,T14,T15
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail
      

        def map9[TargetN](func: T9 => TargetN): CoProduct15[
          T1,T2,T3,T4,T5,T6,T7,T8,TargetN,T10,T11,T12,T13,T14,T15
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail
      

        def map10[TargetN](func: T10 => TargetN): CoProduct15[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,TargetN,T11,T12,T13,T14,T15
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail
      

        def map11[TargetN](func: T11 => TargetN): CoProduct15[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,TargetN,T12,T13,T14,T15
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail
      

        def map12[TargetN](func: T12 => TargetN): CoProduct15[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,TargetN,T13,T14,T15
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail
      

        def map13[TargetN](func: T13 => TargetN): CoProduct15[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,TargetN,T14,T15
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail
      

        def map14[TargetN](func: T14 => TargetN): CoProduct15[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,TargetN,T15
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail
      

        def map15[TargetN](func: T15 => TargetN): CoProduct15[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,TargetN
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail
      
        
        def drop2[TargetN]: Either[T2, CoProduct14[T1,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]] = ???
      

        def drop3[TargetN]: Either[T3, CoProduct14[T1,T2,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]] = ???
      

        def drop4[TargetN]: Either[T4, CoProduct14[T1,T2,T3,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]] = ???
      

        def drop5[TargetN]: Either[T5, CoProduct14[T1,T2,T3,T4,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]] = ???
      

        def drop6[TargetN]: Either[T6, CoProduct14[T1,T2,T3,T4,T5,T7,T8,T9,T10,T11,T12,T13,T14,T15]] = ???
      

        def drop7[TargetN]: Either[T7, CoProduct14[T1,T2,T3,T4,T5,T6,T8,T9,T10,T11,T12,T13,T14,T15]] = ???
      

        def drop8[TargetN]: Either[T8, CoProduct14[T1,T2,T3,T4,T5,T6,T7,T9,T10,T11,T12,T13,T14,T15]] = ???
      

        def drop9[TargetN]: Either[T9, CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T10,T11,T12,T13,T14,T15]] = ???
      

        def drop10[TargetN]: Either[T10, CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T11,T12,T13,T14,T15]] = ???
      

        def drop11[TargetN]: Either[T11, CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T12,T13,T14,T15]] = ???
      

        def drop12[TargetN]: Either[T12, CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T13,T14,T15]] = ???
      

        def drop13[TargetN]: Either[T13, CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T14,T15]] = ???
      

        def drop14[TargetN]: Either[T14, CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T15]] = ???
      

        def drop15[TargetN]: Either[T15, CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]] = ???
      
      }
    

      class CoProduct16Helper[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] {
        FoldApplySelf: CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] =>
        
        def map2[TargetN](func: T2 => TargetN): CoProduct16[
          T1,TargetN,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16
        ] = FoldApplySelf.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map3[TargetN](func: T3 => TargetN): CoProduct16[
          T1,T2,TargetN,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16
        ] = FoldApplySelf.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map4[TargetN](func: T4 => TargetN): CoProduct16[
          T1,T2,T3,TargetN,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16
        ] = FoldApplySelf.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map5[TargetN](func: T5 => TargetN): CoProduct16[
          T1,T2,T3,T4,TargetN,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16
        ] = FoldApplySelf.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map6[TargetN](func: T6 => TargetN): CoProduct16[
          T1,T2,T3,T4,T5,TargetN,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16
        ] = FoldApplySelf.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map7[TargetN](func: T7 => TargetN): CoProduct16[
          T1,T2,T3,T4,T5,T6,TargetN,T8,T9,T10,T11,T12,T13,T14,T15,T16
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map8[TargetN](func: T8 => TargetN): CoProduct16[
          T1,T2,T3,T4,T5,T6,T7,TargetN,T9,T10,T11,T12,T13,T14,T15,T16
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map9[TargetN](func: T9 => TargetN): CoProduct16[
          T1,T2,T3,T4,T5,T6,T7,T8,TargetN,T10,T11,T12,T13,T14,T15,T16
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail
      

        def map10[TargetN](func: T10 => TargetN): CoProduct16[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,TargetN,T11,T12,T13,T14,T15,T16
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail
      

        def map11[TargetN](func: T11 => TargetN): CoProduct16[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,TargetN,T12,T13,T14,T15,T16
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail
      

        def map12[TargetN](func: T12 => TargetN): CoProduct16[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,TargetN,T13,T14,T15,T16
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail
      

        def map13[TargetN](func: T13 => TargetN): CoProduct16[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,TargetN,T14,T15,T16
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail
      

        def map14[TargetN](func: T14 => TargetN): CoProduct16[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,TargetN,T15,T16
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail
      

        def map15[TargetN](func: T15 => TargetN): CoProduct16[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,TargetN,T16
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail
      

        def map16[TargetN](func: T16 => TargetN): CoProduct16[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,TargetN
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail
      
        
        def drop2[TargetN]: Either[T2, CoProduct15[T1,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]] = ???
      

        def drop3[TargetN]: Either[T3, CoProduct15[T1,T2,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]] = ???
      

        def drop4[TargetN]: Either[T4, CoProduct15[T1,T2,T3,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]] = ???
      

        def drop5[TargetN]: Either[T5, CoProduct15[T1,T2,T3,T4,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]] = ???
      

        def drop6[TargetN]: Either[T6, CoProduct15[T1,T2,T3,T4,T5,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]] = ???
      

        def drop7[TargetN]: Either[T7, CoProduct15[T1,T2,T3,T4,T5,T6,T8,T9,T10,T11,T12,T13,T14,T15,T16]] = ???
      

        def drop8[TargetN]: Either[T8, CoProduct15[T1,T2,T3,T4,T5,T6,T7,T9,T10,T11,T12,T13,T14,T15,T16]] = ???
      

        def drop9[TargetN]: Either[T9, CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T10,T11,T12,T13,T14,T15,T16]] = ???
      

        def drop10[TargetN]: Either[T10, CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T11,T12,T13,T14,T15,T16]] = ???
      

        def drop11[TargetN]: Either[T11, CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T12,T13,T14,T15,T16]] = ???
      

        def drop12[TargetN]: Either[T12, CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T13,T14,T15,T16]] = ???
      

        def drop13[TargetN]: Either[T13, CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T14,T15,T16]] = ???
      

        def drop14[TargetN]: Either[T14, CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T15,T16]] = ???
      

        def drop15[TargetN]: Either[T15, CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T16]] = ???
      

        def drop16[TargetN]: Either[T16, CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]] = ???
      
      }
    

      class CoProduct17Helper[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] {
        FoldApplySelf: CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] =>
        
        def map2[TargetN](func: T2 => TargetN): CoProduct17[
          T1,TargetN,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17
        ] = FoldApplySelf.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map3[TargetN](func: T3 => TargetN): CoProduct17[
          T1,T2,TargetN,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17
        ] = FoldApplySelf.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map4[TargetN](func: T4 => TargetN): CoProduct17[
          T1,T2,T3,TargetN,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17
        ] = FoldApplySelf.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map5[TargetN](func: T5 => TargetN): CoProduct17[
          T1,T2,T3,T4,TargetN,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17
        ] = FoldApplySelf.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map6[TargetN](func: T6 => TargetN): CoProduct17[
          T1,T2,T3,T4,T5,TargetN,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17
        ] = FoldApplySelf.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map7[TargetN](func: T7 => TargetN): CoProduct17[
          T1,T2,T3,T4,T5,T6,TargetN,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map8[TargetN](func: T8 => TargetN): CoProduct17[
          T1,T2,T3,T4,T5,T6,T7,TargetN,T9,T10,T11,T12,T13,T14,T15,T16,T17
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map9[TargetN](func: T9 => TargetN): CoProduct17[
          T1,T2,T3,T4,T5,T6,T7,T8,TargetN,T10,T11,T12,T13,T14,T15,T16,T17
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map10[TargetN](func: T10 => TargetN): CoProduct17[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,TargetN,T11,T12,T13,T14,T15,T16,T17
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail
      

        def map11[TargetN](func: T11 => TargetN): CoProduct17[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,TargetN,T12,T13,T14,T15,T16,T17
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail
      

        def map12[TargetN](func: T12 => TargetN): CoProduct17[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,TargetN,T13,T14,T15,T16,T17
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail
      

        def map13[TargetN](func: T13 => TargetN): CoProduct17[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,TargetN,T14,T15,T16,T17
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail
      

        def map14[TargetN](func: T14 => TargetN): CoProduct17[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,TargetN,T15,T16,T17
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail
      

        def map15[TargetN](func: T15 => TargetN): CoProduct17[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,TargetN,T16,T17
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail
      

        def map16[TargetN](func: T16 => TargetN): CoProduct17[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,TargetN,T17
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail
      

        def map17[TargetN](func: T17 => TargetN): CoProduct17[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,TargetN
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail
      
        
        def drop2[TargetN]: Either[T2, CoProduct16[T1,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]] = ???
      

        def drop3[TargetN]: Either[T3, CoProduct16[T1,T2,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]] = ???
      

        def drop4[TargetN]: Either[T4, CoProduct16[T1,T2,T3,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]] = ???
      

        def drop5[TargetN]: Either[T5, CoProduct16[T1,T2,T3,T4,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]] = ???
      

        def drop6[TargetN]: Either[T6, CoProduct16[T1,T2,T3,T4,T5,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]] = ???
      

        def drop7[TargetN]: Either[T7, CoProduct16[T1,T2,T3,T4,T5,T6,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]] = ???
      

        def drop8[TargetN]: Either[T8, CoProduct16[T1,T2,T3,T4,T5,T6,T7,T9,T10,T11,T12,T13,T14,T15,T16,T17]] = ???
      

        def drop9[TargetN]: Either[T9, CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T10,T11,T12,T13,T14,T15,T16,T17]] = ???
      

        def drop10[TargetN]: Either[T10, CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T11,T12,T13,T14,T15,T16,T17]] = ???
      

        def drop11[TargetN]: Either[T11, CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T12,T13,T14,T15,T16,T17]] = ???
      

        def drop12[TargetN]: Either[T12, CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T13,T14,T15,T16,T17]] = ???
      

        def drop13[TargetN]: Either[T13, CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T14,T15,T16,T17]] = ???
      

        def drop14[TargetN]: Either[T14, CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T15,T16,T17]] = ???
      

        def drop15[TargetN]: Either[T15, CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T16,T17]] = ???
      

        def drop16[TargetN]: Either[T16, CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T17]] = ???
      

        def drop17[TargetN]: Either[T17, CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]] = ???
      
      }
    

      class CoProduct18Helper[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] {
        FoldApplySelf: CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] =>
        
        def map2[TargetN](func: T2 => TargetN): CoProduct18[
          T1,TargetN,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18
        ] = FoldApplySelf.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map3[TargetN](func: T3 => TargetN): CoProduct18[
          T1,T2,TargetN,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18
        ] = FoldApplySelf.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map4[TargetN](func: T4 => TargetN): CoProduct18[
          T1,T2,T3,TargetN,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18
        ] = FoldApplySelf.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map5[TargetN](func: T5 => TargetN): CoProduct18[
          T1,T2,T3,T4,TargetN,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18
        ] = FoldApplySelf.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map6[TargetN](func: T6 => TargetN): CoProduct18[
          T1,T2,T3,T4,T5,TargetN,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18
        ] = FoldApplySelf.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map7[TargetN](func: T7 => TargetN): CoProduct18[
          T1,T2,T3,T4,T5,T6,TargetN,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map8[TargetN](func: T8 => TargetN): CoProduct18[
          T1,T2,T3,T4,T5,T6,T7,TargetN,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map9[TargetN](func: T9 => TargetN): CoProduct18[
          T1,T2,T3,T4,T5,T6,T7,T8,TargetN,T10,T11,T12,T13,T14,T15,T16,T17,T18
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map10[TargetN](func: T10 => TargetN): CoProduct18[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,TargetN,T11,T12,T13,T14,T15,T16,T17,T18
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map11[TargetN](func: T11 => TargetN): CoProduct18[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,TargetN,T12,T13,T14,T15,T16,T17,T18
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail
      

        def map12[TargetN](func: T12 => TargetN): CoProduct18[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,TargetN,T13,T14,T15,T16,T17,T18
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail
      

        def map13[TargetN](func: T13 => TargetN): CoProduct18[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,TargetN,T14,T15,T16,T17,T18
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail
      

        def map14[TargetN](func: T14 => TargetN): CoProduct18[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,TargetN,T15,T16,T17,T18
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail
      

        def map15[TargetN](func: T15 => TargetN): CoProduct18[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,TargetN,T16,T17,T18
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail
      

        def map16[TargetN](func: T16 => TargetN): CoProduct18[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,TargetN,T17,T18
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail
      

        def map17[TargetN](func: T17 => TargetN): CoProduct18[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,TargetN,T18
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail
      

        def map18[TargetN](func: T18 => TargetN): CoProduct18[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,TargetN
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail
      
        
        def drop2[TargetN]: Either[T2, CoProduct17[T1,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]] = ???
      

        def drop3[TargetN]: Either[T3, CoProduct17[T1,T2,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]] = ???
      

        def drop4[TargetN]: Either[T4, CoProduct17[T1,T2,T3,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]] = ???
      

        def drop5[TargetN]: Either[T5, CoProduct17[T1,T2,T3,T4,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]] = ???
      

        def drop6[TargetN]: Either[T6, CoProduct17[T1,T2,T3,T4,T5,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]] = ???
      

        def drop7[TargetN]: Either[T7, CoProduct17[T1,T2,T3,T4,T5,T6,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]] = ???
      

        def drop8[TargetN]: Either[T8, CoProduct17[T1,T2,T3,T4,T5,T6,T7,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]] = ???
      

        def drop9[TargetN]: Either[T9, CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T10,T11,T12,T13,T14,T15,T16,T17,T18]] = ???
      

        def drop10[TargetN]: Either[T10, CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T11,T12,T13,T14,T15,T16,T17,T18]] = ???
      

        def drop11[TargetN]: Either[T11, CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T12,T13,T14,T15,T16,T17,T18]] = ???
      

        def drop12[TargetN]: Either[T12, CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T13,T14,T15,T16,T17,T18]] = ???
      

        def drop13[TargetN]: Either[T13, CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T14,T15,T16,T17,T18]] = ???
      

        def drop14[TargetN]: Either[T14, CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T15,T16,T17,T18]] = ???
      

        def drop15[TargetN]: Either[T15, CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T16,T17,T18]] = ???
      

        def drop16[TargetN]: Either[T16, CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T17,T18]] = ???
      

        def drop17[TargetN]: Either[T17, CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T18]] = ???
      

        def drop18[TargetN]: Either[T18, CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]] = ???
      
      }
    

      class CoProduct19Helper[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] {
        FoldApplySelf: CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] =>
        
        def map2[TargetN](func: T2 => TargetN): CoProduct19[
          T1,TargetN,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19
        ] = FoldApplySelf.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map3[TargetN](func: T3 => TargetN): CoProduct19[
          T1,T2,TargetN,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19
        ] = FoldApplySelf.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map4[TargetN](func: T4 => TargetN): CoProduct19[
          T1,T2,T3,TargetN,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19
        ] = FoldApplySelf.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map5[TargetN](func: T5 => TargetN): CoProduct19[
          T1,T2,T3,T4,TargetN,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19
        ] = FoldApplySelf.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map6[TargetN](func: T6 => TargetN): CoProduct19[
          T1,T2,T3,T4,T5,TargetN,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19
        ] = FoldApplySelf.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map7[TargetN](func: T7 => TargetN): CoProduct19[
          T1,T2,T3,T4,T5,T6,TargetN,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map8[TargetN](func: T8 => TargetN): CoProduct19[
          T1,T2,T3,T4,T5,T6,T7,TargetN,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map9[TargetN](func: T9 => TargetN): CoProduct19[
          T1,T2,T3,T4,T5,T6,T7,T8,TargetN,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map10[TargetN](func: T10 => TargetN): CoProduct19[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,TargetN,T11,T12,T13,T14,T15,T16,T17,T18,T19
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map11[TargetN](func: T11 => TargetN): CoProduct19[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,TargetN,T12,T13,T14,T15,T16,T17,T18,T19
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map12[TargetN](func: T12 => TargetN): CoProduct19[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,TargetN,T13,T14,T15,T16,T17,T18,T19
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail
      

        def map13[TargetN](func: T13 => TargetN): CoProduct19[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,TargetN,T14,T15,T16,T17,T18,T19
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail
      

        def map14[TargetN](func: T14 => TargetN): CoProduct19[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,TargetN,T15,T16,T17,T18,T19
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail
      

        def map15[TargetN](func: T15 => TargetN): CoProduct19[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,TargetN,T16,T17,T18,T19
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail
      

        def map16[TargetN](func: T16 => TargetN): CoProduct19[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,TargetN,T17,T18,T19
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail
      

        def map17[TargetN](func: T17 => TargetN): CoProduct19[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,TargetN,T18,T19
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail
      

        def map18[TargetN](func: T18 => TargetN): CoProduct19[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,TargetN,T19
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail
      

        def map19[TargetN](func: T19 => TargetN): CoProduct19[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,TargetN
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail
      
        
        def drop2[TargetN]: Either[T2, CoProduct18[T1,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]] = ???
      

        def drop3[TargetN]: Either[T3, CoProduct18[T1,T2,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]] = ???
      

        def drop4[TargetN]: Either[T4, CoProduct18[T1,T2,T3,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]] = ???
      

        def drop5[TargetN]: Either[T5, CoProduct18[T1,T2,T3,T4,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]] = ???
      

        def drop6[TargetN]: Either[T6, CoProduct18[T1,T2,T3,T4,T5,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]] = ???
      

        def drop7[TargetN]: Either[T7, CoProduct18[T1,T2,T3,T4,T5,T6,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]] = ???
      

        def drop8[TargetN]: Either[T8, CoProduct18[T1,T2,T3,T4,T5,T6,T7,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]] = ???
      

        def drop9[TargetN]: Either[T9, CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]] = ???
      

        def drop10[TargetN]: Either[T10, CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T11,T12,T13,T14,T15,T16,T17,T18,T19]] = ???
      

        def drop11[TargetN]: Either[T11, CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T12,T13,T14,T15,T16,T17,T18,T19]] = ???
      

        def drop12[TargetN]: Either[T12, CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T13,T14,T15,T16,T17,T18,T19]] = ???
      

        def drop13[TargetN]: Either[T13, CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T14,T15,T16,T17,T18,T19]] = ???
      

        def drop14[TargetN]: Either[T14, CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T15,T16,T17,T18,T19]] = ???
      

        def drop15[TargetN]: Either[T15, CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T16,T17,T18,T19]] = ???
      

        def drop16[TargetN]: Either[T16, CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T17,T18,T19]] = ???
      

        def drop17[TargetN]: Either[T17, CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T18,T19]] = ???
      

        def drop18[TargetN]: Either[T18, CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T19]] = ???
      

        def drop19[TargetN]: Either[T19, CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]] = ???
      
      }
    

      class CoProduct20Helper[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] {
        FoldApplySelf: CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] =>
        
        def map2[TargetN](func: T2 => TargetN): CoProduct20[
          T1,TargetN,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20
        ] = FoldApplySelf.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map3[TargetN](func: T3 => TargetN): CoProduct20[
          T1,T2,TargetN,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20
        ] = FoldApplySelf.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map4[TargetN](func: T4 => TargetN): CoProduct20[
          T1,T2,T3,TargetN,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20
        ] = FoldApplySelf.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map5[TargetN](func: T5 => TargetN): CoProduct20[
          T1,T2,T3,T4,TargetN,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20
        ] = FoldApplySelf.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map6[TargetN](func: T6 => TargetN): CoProduct20[
          T1,T2,T3,T4,T5,TargetN,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20
        ] = FoldApplySelf.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map7[TargetN](func: T7 => TargetN): CoProduct20[
          T1,T2,T3,T4,T5,T6,TargetN,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map8[TargetN](func: T8 => TargetN): CoProduct20[
          T1,T2,T3,T4,T5,T6,T7,TargetN,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map9[TargetN](func: T9 => TargetN): CoProduct20[
          T1,T2,T3,T4,T5,T6,T7,T8,TargetN,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map10[TargetN](func: T10 => TargetN): CoProduct20[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,TargetN,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map11[TargetN](func: T11 => TargetN): CoProduct20[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,TargetN,T12,T13,T14,T15,T16,T17,T18,T19,T20
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map12[TargetN](func: T12 => TargetN): CoProduct20[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,TargetN,T13,T14,T15,T16,T17,T18,T19,T20
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map13[TargetN](func: T13 => TargetN): CoProduct20[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,TargetN,T14,T15,T16,T17,T18,T19,T20
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail
      

        def map14[TargetN](func: T14 => TargetN): CoProduct20[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,TargetN,T15,T16,T17,T18,T19,T20
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail
      

        def map15[TargetN](func: T15 => TargetN): CoProduct20[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,TargetN,T16,T17,T18,T19,T20
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail
      

        def map16[TargetN](func: T16 => TargetN): CoProduct20[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,TargetN,T17,T18,T19,T20
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail
      

        def map17[TargetN](func: T17 => TargetN): CoProduct20[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,TargetN,T18,T19,T20
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail
      

        def map18[TargetN](func: T18 => TargetN): CoProduct20[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,TargetN,T19,T20
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail
      

        def map19[TargetN](func: T19 => TargetN): CoProduct20[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,TargetN,T20
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail
      

        def map20[TargetN](func: T20 => TargetN): CoProduct20[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,TargetN
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail
      
        
        def drop2[TargetN]: Either[T2, CoProduct19[T1,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]] = ???
      

        def drop3[TargetN]: Either[T3, CoProduct19[T1,T2,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]] = ???
      

        def drop4[TargetN]: Either[T4, CoProduct19[T1,T2,T3,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]] = ???
      

        def drop5[TargetN]: Either[T5, CoProduct19[T1,T2,T3,T4,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]] = ???
      

        def drop6[TargetN]: Either[T6, CoProduct19[T1,T2,T3,T4,T5,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]] = ???
      

        def drop7[TargetN]: Either[T7, CoProduct19[T1,T2,T3,T4,T5,T6,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]] = ???
      

        def drop8[TargetN]: Either[T8, CoProduct19[T1,T2,T3,T4,T5,T6,T7,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]] = ???
      

        def drop9[TargetN]: Either[T9, CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]] = ???
      

        def drop10[TargetN]: Either[T10, CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]] = ???
      

        def drop11[TargetN]: Either[T11, CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T12,T13,T14,T15,T16,T17,T18,T19,T20]] = ???
      

        def drop12[TargetN]: Either[T12, CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T13,T14,T15,T16,T17,T18,T19,T20]] = ???
      

        def drop13[TargetN]: Either[T13, CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T14,T15,T16,T17,T18,T19,T20]] = ???
      

        def drop14[TargetN]: Either[T14, CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T15,T16,T17,T18,T19,T20]] = ???
      

        def drop15[TargetN]: Either[T15, CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T16,T17,T18,T19,T20]] = ???
      

        def drop16[TargetN]: Either[T16, CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T17,T18,T19,T20]] = ???
      

        def drop17[TargetN]: Either[T17, CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T18,T19,T20]] = ???
      

        def drop18[TargetN]: Either[T18, CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T19,T20]] = ???
      

        def drop19[TargetN]: Either[T19, CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T20]] = ???
      

        def drop20[TargetN]: Either[T20, CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]] = ???
      
      }
    

      class CoProduct21Helper[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] {
        FoldApplySelf: CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] =>
        
        def map2[TargetN](func: T2 => TargetN): CoProduct21[
          T1,TargetN,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21
        ] = FoldApplySelf.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map3[TargetN](func: T3 => TargetN): CoProduct21[
          T1,T2,TargetN,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21
        ] = FoldApplySelf.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map4[TargetN](func: T4 => TargetN): CoProduct21[
          T1,T2,T3,TargetN,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21
        ] = FoldApplySelf.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map5[TargetN](func: T5 => TargetN): CoProduct21[
          T1,T2,T3,T4,TargetN,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21
        ] = FoldApplySelf.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map6[TargetN](func: T6 => TargetN): CoProduct21[
          T1,T2,T3,T4,T5,TargetN,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21
        ] = FoldApplySelf.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map7[TargetN](func: T7 => TargetN): CoProduct21[
          T1,T2,T3,T4,T5,T6,TargetN,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map8[TargetN](func: T8 => TargetN): CoProduct21[
          T1,T2,T3,T4,T5,T6,T7,TargetN,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map9[TargetN](func: T9 => TargetN): CoProduct21[
          T1,T2,T3,T4,T5,T6,T7,T8,TargetN,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map10[TargetN](func: T10 => TargetN): CoProduct21[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,TargetN,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map11[TargetN](func: T11 => TargetN): CoProduct21[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,TargetN,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map12[TargetN](func: T12 => TargetN): CoProduct21[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,TargetN,T13,T14,T15,T16,T17,T18,T19,T20,T21
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map13[TargetN](func: T13 => TargetN): CoProduct21[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,TargetN,T14,T15,T16,T17,T18,T19,T20,T21
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map14[TargetN](func: T14 => TargetN): CoProduct21[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,TargetN,T15,T16,T17,T18,T19,T20,T21
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail
      

        def map15[TargetN](func: T15 => TargetN): CoProduct21[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,TargetN,T16,T17,T18,T19,T20,T21
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail
      

        def map16[TargetN](func: T16 => TargetN): CoProduct21[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,TargetN,T17,T18,T19,T20,T21
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail
      

        def map17[TargetN](func: T17 => TargetN): CoProduct21[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,TargetN,T18,T19,T20,T21
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail
      

        def map18[TargetN](func: T18 => TargetN): CoProduct21[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,TargetN,T19,T20,T21
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail
      

        def map19[TargetN](func: T19 => TargetN): CoProduct21[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,TargetN,T20,T21
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail
      

        def map20[TargetN](func: T20 => TargetN): CoProduct21[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,TargetN,T21
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail
      

        def map21[TargetN](func: T21 => TargetN): CoProduct21[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,TargetN
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail
      
        
        def drop2[TargetN]: Either[T2, CoProduct20[T1,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]] = ???
      

        def drop3[TargetN]: Either[T3, CoProduct20[T1,T2,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]] = ???
      

        def drop4[TargetN]: Either[T4, CoProduct20[T1,T2,T3,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]] = ???
      

        def drop5[TargetN]: Either[T5, CoProduct20[T1,T2,T3,T4,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]] = ???
      

        def drop6[TargetN]: Either[T6, CoProduct20[T1,T2,T3,T4,T5,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]] = ???
      

        def drop7[TargetN]: Either[T7, CoProduct20[T1,T2,T3,T4,T5,T6,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]] = ???
      

        def drop8[TargetN]: Either[T8, CoProduct20[T1,T2,T3,T4,T5,T6,T7,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]] = ???
      

        def drop9[TargetN]: Either[T9, CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]] = ???
      

        def drop10[TargetN]: Either[T10, CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]] = ???
      

        def drop11[TargetN]: Either[T11, CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]] = ???
      

        def drop12[TargetN]: Either[T12, CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T13,T14,T15,T16,T17,T18,T19,T20,T21]] = ???
      

        def drop13[TargetN]: Either[T13, CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T14,T15,T16,T17,T18,T19,T20,T21]] = ???
      

        def drop14[TargetN]: Either[T14, CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T15,T16,T17,T18,T19,T20,T21]] = ???
      

        def drop15[TargetN]: Either[T15, CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T16,T17,T18,T19,T20,T21]] = ???
      

        def drop16[TargetN]: Either[T16, CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T17,T18,T19,T20,T21]] = ???
      

        def drop17[TargetN]: Either[T17, CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T18,T19,T20,T21]] = ???
      

        def drop18[TargetN]: Either[T18, CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T19,T20,T21]] = ???
      

        def drop19[TargetN]: Either[T19, CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T20,T21]] = ???
      

        def drop20[TargetN]: Either[T20, CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T21]] = ???
      

        def drop21[TargetN]: Either[T21, CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]] = ???
      
      }
    

      class CoProduct22Helper[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] {
        FoldApplySelf: CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] =>
        
        def map2[TargetN](func: T2 => TargetN): CoProduct22[
          T1,TargetN,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22
        ] = FoldApplySelf.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map3[TargetN](func: T3 => TargetN): CoProduct22[
          T1,T2,TargetN,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22
        ] = FoldApplySelf.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map4[TargetN](func: T4 => TargetN): CoProduct22[
          T1,T2,T3,TargetN,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22
        ] = FoldApplySelf.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map5[TargetN](func: T5 => TargetN): CoProduct22[
          T1,T2,T3,T4,TargetN,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22
        ] = FoldApplySelf.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map6[TargetN](func: T6 => TargetN): CoProduct22[
          T1,T2,T3,T4,T5,TargetN,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22
        ] = FoldApplySelf.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map7[TargetN](func: T7 => TargetN): CoProduct22[
          T1,T2,T3,T4,T5,T6,TargetN,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map8[TargetN](func: T8 => TargetN): CoProduct22[
          T1,T2,T3,T4,T5,T6,T7,TargetN,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map9[TargetN](func: T9 => TargetN): CoProduct22[
          T1,T2,T3,T4,T5,T6,T7,T8,TargetN,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map10[TargetN](func: T10 => TargetN): CoProduct22[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,TargetN,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map11[TargetN](func: T11 => TargetN): CoProduct22[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,TargetN,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map12[TargetN](func: T12 => TargetN): CoProduct22[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,TargetN,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map13[TargetN](func: T13 => TargetN): CoProduct22[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,TargetN,T14,T15,T16,T17,T18,T19,T20,T21,T22
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map14[TargetN](func: T14 => TargetN): CoProduct22[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,TargetN,T15,T16,T17,T18,T19,T20,T21,T22
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail.tail
      

        def map15[TargetN](func: T15 => TargetN): CoProduct22[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,TargetN,T16,T17,T18,T19,T20,T21,T22
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail.tail
      

        def map16[TargetN](func: T16 => TargetN): CoProduct22[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,TargetN,T17,T18,T19,T20,T21,T22
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail.tail
      

        def map17[TargetN](func: T17 => TargetN): CoProduct22[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,TargetN,T18,T19,T20,T21,T22
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail.tail
      

        def map18[TargetN](func: T18 => TargetN): CoProduct22[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,TargetN,T19,T20,T21,T22
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail.tail
      

        def map19[TargetN](func: T19 => TargetN): CoProduct22[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,TargetN,T20,T21,T22
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail.tail
      

        def map20[TargetN](func: T20 => TargetN): CoProduct22[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,TargetN,T21,T22
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail.tail
      

        def map21[TargetN](func: T21 => TargetN): CoProduct22[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,TargetN,T22
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail.tail
      

        def map22[TargetN](func: T22 => TargetN): CoProduct22[
          T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,TargetN
        ] = FoldApplySelf.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.map1(func).tail
      
        
        def drop2[TargetN]: Either[T2, CoProduct21[T1,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]] = ???
      

        def drop3[TargetN]: Either[T3, CoProduct21[T1,T2,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]] = ???
      

        def drop4[TargetN]: Either[T4, CoProduct21[T1,T2,T3,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]] = ???
      

        def drop5[TargetN]: Either[T5, CoProduct21[T1,T2,T3,T4,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]] = ???
      

        def drop6[TargetN]: Either[T6, CoProduct21[T1,T2,T3,T4,T5,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]] = ???
      

        def drop7[TargetN]: Either[T7, CoProduct21[T1,T2,T3,T4,T5,T6,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]] = ???
      

        def drop8[TargetN]: Either[T8, CoProduct21[T1,T2,T3,T4,T5,T6,T7,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]] = ???
      

        def drop9[TargetN]: Either[T9, CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]] = ???
      

        def drop10[TargetN]: Either[T10, CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]] = ???
      

        def drop11[TargetN]: Either[T11, CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]] = ???
      

        def drop12[TargetN]: Either[T12, CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]] = ???
      

        def drop13[TargetN]: Either[T13, CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T14,T15,T16,T17,T18,T19,T20,T21,T22]] = ???
      

        def drop14[TargetN]: Either[T14, CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T15,T16,T17,T18,T19,T20,T21,T22]] = ???
      

        def drop15[TargetN]: Either[T15, CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T16,T17,T18,T19,T20,T21,T22]] = ???
      

        def drop16[TargetN]: Either[T16, CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T17,T18,T19,T20,T21,T22]] = ???
      

        def drop17[TargetN]: Either[T17, CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T18,T19,T20,T21,T22]] = ???
      

        def drop18[TargetN]: Either[T18, CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T19,T20,T21,T22]] = ???
      

        def drop19[TargetN]: Either[T19, CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T20,T21,T22]] = ???
      

        def drop20[TargetN]: Either[T20, CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T21,T22]] = ???
      

        def drop21[TargetN]: Either[T21, CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T22]] = ???
      

        def drop22[TargetN]: Either[T22, CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]] = ???
      
      }
    
    }
  