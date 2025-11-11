
    package net.scalax.simple.adt
    package nat
    package support

    
      object SimpleProduct1 {
        SimpleProduct1Self =>

        
      trait TypeGen[M[_], N1[T]] extends TypeGen1[M, N1]
    
        
      trait SimpleAppender[M[_]] extends SimpleAppender1[M]
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_], N1[_]]
          (typeGen: SimpleProduct1.TypeGen[M, N1], sAppender: SimpleProduct1.SimpleAppender[M])
          : M[F[N1]]
      }
    
      }
    

      object SimpleProduct2 {
        SimpleProduct2Self =>

        
      trait TypeGen[M[_,_], N1[T],N2[T]] extends TypeGen2[M, N1,N2]
    
        
      trait SimpleAppender[M[_,_]] extends SimpleAppender2[M]
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_], N1[_],N2[_]]
          (typeGen: SimpleProduct2.TypeGen[M, N1,N2], sAppender: SimpleProduct2.SimpleAppender[M])
          : M[F[N1],F[N2]]
      }
    
      }
    

      object SimpleProduct3 {
        SimpleProduct3Self =>

        
      trait TypeGen[M[_,_,_], N1[T],N2[T],N3[T]] extends TypeGen3[M, N1,N2,N3]
    
        
      trait SimpleAppender[M[_,_,_]] extends SimpleAppender3[M]
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_], N1[_],N2[_],N3[_]]
          (typeGen: SimpleProduct3.TypeGen[M, N1,N2,N3], sAppender: SimpleProduct3.SimpleAppender[M])
          : M[F[N1],F[N2],F[N3]]
      }
    
      }
    

      object SimpleProduct4 {
        SimpleProduct4Self =>

        
      trait TypeGen[M[_,_,_,_], N1[T],N2[T],N3[T],N4[T]] extends TypeGen4[M, N1,N2,N3,N4]
    
        
      trait SimpleAppender[M[_,_,_,_]] extends SimpleAppender4[M]
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_], N1[_],N2[_],N3[_],N4[_]]
          (typeGen: SimpleProduct4.TypeGen[M, N1,N2,N3,N4], sAppender: SimpleProduct4.SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4]]
      }
    
      }
    

      object SimpleProduct5 {
        SimpleProduct5Self =>

        
      trait TypeGen[M[_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T]] extends TypeGen5[M, N1,N2,N3,N4,N5]
    
        
      trait SimpleAppender[M[_,_,_,_,_]] extends SimpleAppender5[M]
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_]]
          (typeGen: SimpleProduct5.TypeGen[M, N1,N2,N3,N4,N5], sAppender: SimpleProduct5.SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5]]
      }
    
      }
    

      object SimpleProduct6 {
        SimpleProduct6Self =>

        
      trait TypeGen[M[_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T]] extends TypeGen6[M, N1,N2,N3,N4,N5,N6]
    
        
      trait SimpleAppender[M[_,_,_,_,_,_]] extends SimpleAppender6[M]
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_]]
          (typeGen: SimpleProduct6.TypeGen[M, N1,N2,N3,N4,N5,N6], sAppender: SimpleProduct6.SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6]]
      }
    
      }
    

      object SimpleProduct7 {
        SimpleProduct7Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T]] extends TypeGen7[M, N1,N2,N3,N4,N5,N6,N7]
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_]] extends SimpleAppender7[M]
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_]]
          (typeGen: SimpleProduct7.TypeGen[M, N1,N2,N3,N4,N5,N6,N7], sAppender: SimpleProduct7.SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7]]
      }
    
      }
    

      object SimpleProduct8 {
        SimpleProduct8Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T]] extends TypeGen8[M, N1,N2,N3,N4,N5,N6,N7,N8]
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_]] extends SimpleAppender8[M]
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_]]
          (typeGen: SimpleProduct8.TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8], sAppender: SimpleProduct8.SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8]]
      }
    
      }
    

      object SimpleProduct9 {
        SimpleProduct9Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T]] extends TypeGen9[M, N1,N2,N3,N4,N5,N6,N7,N8,N9]
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_]] extends SimpleAppender9[M]
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_]]
          (typeGen: SimpleProduct9.TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9], sAppender: SimpleProduct9.SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9]]
      }
    
      }
    

      object SimpleProduct10 {
        SimpleProduct10Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T]] extends TypeGen10[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10]
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender10[M]
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_]]
          (typeGen: SimpleProduct10.TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10], sAppender: SimpleProduct10.SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10]]
      }
    
      }
    

      object SimpleProduct11 {
        SimpleProduct11Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T]] extends TypeGen11[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11]
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender11[M]
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_]]
          (typeGen: SimpleProduct11.TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11], sAppender: SimpleProduct11.SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11]]
      }
    
      }
    

      object SimpleProduct12 {
        SimpleProduct12Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T]] extends TypeGen12[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12]
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender12[M]
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_]]
          (typeGen: SimpleProduct12.TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12], sAppender: SimpleProduct12.SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11],F[N12]]
      }
    
      }
    

      object SimpleProduct13 {
        SimpleProduct13Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T]] extends TypeGen13[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13]
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender13[M]
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_]]
          (typeGen: SimpleProduct13.TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13], sAppender: SimpleProduct13.SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11],F[N12],F[N13]]
      }
    
      }
    

      object SimpleProduct14 {
        SimpleProduct14Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T]] extends TypeGen14[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14]
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender14[M]
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_]]
          (typeGen: SimpleProduct14.TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14], sAppender: SimpleProduct14.SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11],F[N12],F[N13],F[N14]]
      }
    
      }
    

      object SimpleProduct15 {
        SimpleProduct15Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T]] extends TypeGen15[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15]
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender15[M]
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_]]
          (typeGen: SimpleProduct15.TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15], sAppender: SimpleProduct15.SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11],F[N12],F[N13],F[N14],F[N15]]
      }
    
      }
    

      object SimpleProduct16 {
        SimpleProduct16Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T],N16[T]] extends TypeGen16[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16]
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender16[M]
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_]]
          (typeGen: SimpleProduct16.TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16], sAppender: SimpleProduct16.SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11],F[N12],F[N13],F[N14],F[N15],F[N16]]
      }
    
      }
    

      object SimpleProduct17 {
        SimpleProduct17Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T],N16[T],N17[T]] extends TypeGen17[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17]
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender17[M]
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_]]
          (typeGen: SimpleProduct17.TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17], sAppender: SimpleProduct17.SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11],F[N12],F[N13],F[N14],F[N15],F[N16],F[N17]]
      }
    
      }
    

      object SimpleProduct18 {
        SimpleProduct18Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T],N16[T],N17[T],N18[T]] extends TypeGen18[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18]
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender18[M]
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_]]
          (typeGen: SimpleProduct18.TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18], sAppender: SimpleProduct18.SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11],F[N12],F[N13],F[N14],F[N15],F[N16],F[N17],F[N18]]
      }
    
      }
    

      object SimpleProduct19 {
        SimpleProduct19Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T],N16[T],N17[T],N18[T],N19[T]] extends TypeGen19[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19]
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender19[M]
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_]]
          (typeGen: SimpleProduct19.TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19], sAppender: SimpleProduct19.SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11],F[N12],F[N13],F[N14],F[N15],F[N16],F[N17],F[N18],F[N19]]
      }
    
      }
    

      object SimpleProduct20 {
        SimpleProduct20Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T],N16[T],N17[T],N18[T],N19[T],N20[T]] extends TypeGen20[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20]
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender20[M]
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],N20[_]]
          (typeGen: SimpleProduct20.TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20], sAppender: SimpleProduct20.SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11],F[N12],F[N13],F[N14],F[N15],F[N16],F[N17],F[N18],F[N19],F[N20]]
      }
    
      }
    

      object SimpleProduct21 {
        SimpleProduct21Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T],N16[T],N17[T],N18[T],N19[T],N20[T],N21[T]] extends TypeGen21[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21]
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender21[M]
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],N20[_],N21[_]]
          (typeGen: SimpleProduct21.TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21], sAppender: SimpleProduct21.SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11],F[N12],F[N13],F[N14],F[N15],F[N16],F[N17],F[N18],F[N19],F[N20],F[N21]]
      }
    
      }
    

      object SimpleProduct22 {
        SimpleProduct22Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T],N16[T],N17[T],N18[T],N19[T],N20[T],N21[T],N22[T]] extends TypeGen22[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21,N22]
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender22[M]
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],N20[_],N21[_],N22[_]]
          (typeGen: SimpleProduct22.TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21,N22], sAppender: SimpleProduct22.SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11],F[N12],F[N13],F[N14],F[N15],F[N16],F[N17],F[N18],F[N19],F[N20],F[N21],F[N22]]
      }
    
      }
    
  