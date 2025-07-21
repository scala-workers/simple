
    package net.scalax.simple.adt
    package nat
    package support

    
      object SimpleProduct1 {
        SimpleProduct1Self =>

        
      trait TypeGen[M[_], N1[T]] extends TypeGen1[M, N1] {
        override def gen[T]: M[N1[T]]
      }
    
        
      trait SimpleAppender[M[_]] extends SimpleAppender1[M] {
        
      override def append[A1, B1, C1]
        (f1: ABCFunc[A1, B1, C1])
        (a: M[A1], b: M[B1])
        : M[C1]
    
        
      override def zero[N1](p1: N1): M[N1]
    
      }
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_], N1[_]]
          (typeGen: TypeGen[M, N1], sAppender: SimpleAppender[M])
          : M[F[N1]]
      }
    
      }
    

      object SimpleProduct2 {
        SimpleProduct2Self =>

        
      trait TypeGen[M[_,_], N1[T],N2[T]] extends TypeGen2[M, N1,N2] {
        override def gen[T]: M[N1[T],N2[T]]
      }
    
        
      trait SimpleAppender[M[_,_]] extends SimpleAppender2[M] {
        
      override def append[A1,A2, B1,B2, C1,C2]
        (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2])
        (a: M[A1,A2], b: M[B1,B2])
        : M[C1,C2]
    
        
      override def zero[N1,N2](p1: N1,p2: N2): M[N1,N2]
    
      }
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_], N1[_],N2[_]]
          (typeGen: TypeGen[M, N1,N2], sAppender: SimpleAppender[M])
          : M[F[N1],F[N2]]
      }
    
      }
    

      object SimpleProduct3 {
        SimpleProduct3Self =>

        
      trait TypeGen[M[_,_,_], N1[T],N2[T],N3[T]] extends TypeGen3[M, N1,N2,N3] {
        override def gen[T]: M[N1[T],N2[T],N3[T]]
      }
    
        
      trait SimpleAppender[M[_,_,_]] extends SimpleAppender3[M] {
        
      override def append[A1,A2,A3, B1,B2,B3, C1,C2,C3]
        (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3])
        (a: M[A1,A2,A3], b: M[B1,B2,B3])
        : M[C1,C2,C3]
    
        
      override def zero[N1,N2,N3](p1: N1,p2: N2,p3: N3): M[N1,N2,N3]
    
      }
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_], N1[_],N2[_],N3[_]]
          (typeGen: TypeGen[M, N1,N2,N3], sAppender: SimpleAppender[M])
          : M[F[N1],F[N2],F[N3]]
      }
    
      }
    

      object SimpleProduct4 {
        SimpleProduct4Self =>

        
      trait TypeGen[M[_,_,_,_], N1[T],N2[T],N3[T],N4[T]] extends TypeGen4[M, N1,N2,N3,N4] {
        override def gen[T]: M[N1[T],N2[T],N3[T],N4[T]]
      }
    
        
      trait SimpleAppender[M[_,_,_,_]] extends SimpleAppender4[M] {
        
      override def append[A1,A2,A3,A4, B1,B2,B3,B4, C1,C2,C3,C4]
        (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4])
        (a: M[A1,A2,A3,A4], b: M[B1,B2,B3,B4])
        : M[C1,C2,C3,C4]
    
        
      override def zero[N1,N2,N3,N4](p1: N1,p2: N2,p3: N3,p4: N4): M[N1,N2,N3,N4]
    
      }
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_], N1[_],N2[_],N3[_],N4[_]]
          (typeGen: TypeGen[M, N1,N2,N3,N4], sAppender: SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4]]
      }
    
      }
    

      object SimpleProduct5 {
        SimpleProduct5Self =>

        
      trait TypeGen[M[_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T]] extends TypeGen5[M, N1,N2,N3,N4,N5] {
        override def gen[T]: M[N1[T],N2[T],N3[T],N4[T],N5[T]]
      }
    
        
      trait SimpleAppender[M[_,_,_,_,_]] extends SimpleAppender5[M] {
        
      override def append[A1,A2,A3,A4,A5, B1,B2,B3,B4,B5, C1,C2,C3,C4,C5]
        (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5])
        (a: M[A1,A2,A3,A4,A5], b: M[B1,B2,B3,B4,B5])
        : M[C1,C2,C3,C4,C5]
    
        
      override def zero[N1,N2,N3,N4,N5](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5): M[N1,N2,N3,N4,N5]
    
      }
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_]]
          (typeGen: TypeGen[M, N1,N2,N3,N4,N5], sAppender: SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5]]
      }
    
      }
    

      object SimpleProduct6 {
        SimpleProduct6Self =>

        
      trait TypeGen[M[_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T]] extends TypeGen6[M, N1,N2,N3,N4,N5,N6] {
        override def gen[T]: M[N1[T],N2[T],N3[T],N4[T],N5[T],N6[T]]
      }
    
        
      trait SimpleAppender[M[_,_,_,_,_,_]] extends SimpleAppender6[M] {
        
      override def append[A1,A2,A3,A4,A5,A6, B1,B2,B3,B4,B5,B6, C1,C2,C3,C4,C5,C6]
        (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6])
        (a: M[A1,A2,A3,A4,A5,A6], b: M[B1,B2,B3,B4,B5,B6])
        : M[C1,C2,C3,C4,C5,C6]
    
        
      override def zero[N1,N2,N3,N4,N5,N6](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6): M[N1,N2,N3,N4,N5,N6]
    
      }
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_]]
          (typeGen: TypeGen[M, N1,N2,N3,N4,N5,N6], sAppender: SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6]]
      }
    
      }
    

      object SimpleProduct7 {
        SimpleProduct7Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T]] extends TypeGen7[M, N1,N2,N3,N4,N5,N6,N7] {
        override def gen[T]: M[N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T]]
      }
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_]] extends SimpleAppender7[M] {
        
      override def append[A1,A2,A3,A4,A5,A6,A7, B1,B2,B3,B4,B5,B6,B7, C1,C2,C3,C4,C5,C6,C7]
        (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7])
        (a: M[A1,A2,A3,A4,A5,A6,A7], b: M[B1,B2,B3,B4,B5,B6,B7])
        : M[C1,C2,C3,C4,C5,C6,C7]
    
        
      override def zero[N1,N2,N3,N4,N5,N6,N7](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7): M[N1,N2,N3,N4,N5,N6,N7]
    
      }
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_]]
          (typeGen: TypeGen[M, N1,N2,N3,N4,N5,N6,N7], sAppender: SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7]]
      }
    
      }
    

      object SimpleProduct8 {
        SimpleProduct8Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T]] extends TypeGen8[M, N1,N2,N3,N4,N5,N6,N7,N8] {
        override def gen[T]: M[N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T]]
      }
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_]] extends SimpleAppender8[M] {
        
      override def append[A1,A2,A3,A4,A5,A6,A7,A8, B1,B2,B3,B4,B5,B6,B7,B8, C1,C2,C3,C4,C5,C6,C7,C8]
        (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8])
        (a: M[A1,A2,A3,A4,A5,A6,A7,A8], b: M[B1,B2,B3,B4,B5,B6,B7,B8])
        : M[C1,C2,C3,C4,C5,C6,C7,C8]
    
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8): M[N1,N2,N3,N4,N5,N6,N7,N8]
    
      }
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_]]
          (typeGen: TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8], sAppender: SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8]]
      }
    
      }
    

      object SimpleProduct9 {
        SimpleProduct9Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T]] extends TypeGen9[M, N1,N2,N3,N4,N5,N6,N7,N8,N9] {
        override def gen[T]: M[N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T]]
      }
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_]] extends SimpleAppender9[M] {
        
      override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9, B1,B2,B3,B4,B5,B6,B7,B8,B9, C1,C2,C3,C4,C5,C6,C7,C8,C9]
        (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9])
        (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9])
        : M[C1,C2,C3,C4,C5,C6,C7,C8,C9]
    
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9): M[N1,N2,N3,N4,N5,N6,N7,N8,N9]
    
      }
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_]]
          (typeGen: TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9], sAppender: SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9]]
      }
    
      }
    

      object SimpleProduct10 {
        SimpleProduct10Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T]] extends TypeGen10[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10] {
        override def gen[T]: M[N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T]]
      }
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender10[M] {
        
      override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10]
        (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10])
        (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10])
        : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10]
    
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10]
    
      }
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_]]
          (typeGen: TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10], sAppender: SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10]]
      }
    
      }
    

      object SimpleProduct11 {
        SimpleProduct11Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T]] extends TypeGen11[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11] {
        override def gen[T]: M[N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T]]
      }
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender11[M] {
        
      override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11]
        (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11])
        (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11])
        : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11]
    
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11]
    
      }
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_]]
          (typeGen: TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11], sAppender: SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11]]
      }
    
      }
    

      object SimpleProduct12 {
        SimpleProduct12Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T]] extends TypeGen12[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12] {
        override def gen[T]: M[N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T]]
      }
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender12[M] {
        
      override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12]
        (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11],f12: ABCFunc[A12, B12, C12])
        (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12])
        : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12]
    
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11,p12: N12): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12]
    
      }
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_]]
          (typeGen: TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12], sAppender: SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11],F[N12]]
      }
    
      }
    

      object SimpleProduct13 {
        SimpleProduct13Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T]] extends TypeGen13[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13] {
        override def gen[T]: M[N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T]]
      }
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender13[M] {
        
      override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13]
        (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11],f12: ABCFunc[A12, B12, C12],f13: ABCFunc[A13, B13, C13])
        (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13])
        : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13]
    
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11,p12: N12,p13: N13): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13]
    
      }
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_]]
          (typeGen: TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13], sAppender: SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11],F[N12],F[N13]]
      }
    
      }
    

      object SimpleProduct14 {
        SimpleProduct14Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T]] extends TypeGen14[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14] {
        override def gen[T]: M[N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T]]
      }
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender14[M] {
        
      override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14]
        (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11],f12: ABCFunc[A12, B12, C12],f13: ABCFunc[A13, B13, C13],f14: ABCFunc[A14, B14, C14])
        (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14])
        : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14]
    
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11,p12: N12,p13: N13,p14: N14): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14]
    
      }
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_]]
          (typeGen: TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14], sAppender: SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11],F[N12],F[N13],F[N14]]
      }
    
      }
    

      object SimpleProduct15 {
        SimpleProduct15Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T]] extends TypeGen15[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15] {
        override def gen[T]: M[N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T]]
      }
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender15[M] {
        
      override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15]
        (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11],f12: ABCFunc[A12, B12, C12],f13: ABCFunc[A13, B13, C13],f14: ABCFunc[A14, B14, C14],f15: ABCFunc[A15, B15, C15])
        (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15])
        : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15]
    
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11,p12: N12,p13: N13,p14: N14,p15: N15): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15]
    
      }
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_]]
          (typeGen: TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15], sAppender: SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11],F[N12],F[N13],F[N14],F[N15]]
      }
    
      }
    

      object SimpleProduct16 {
        SimpleProduct16Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T],N16[T]] extends TypeGen16[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16] {
        override def gen[T]: M[N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T],N16[T]]
      }
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender16[M] {
        
      override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16]
        (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11],f12: ABCFunc[A12, B12, C12],f13: ABCFunc[A13, B13, C13],f14: ABCFunc[A14, B14, C14],f15: ABCFunc[A15, B15, C15],f16: ABCFunc[A16, B16, C16])
        (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16])
        : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16]
    
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11,p12: N12,p13: N13,p14: N14,p15: N15,p16: N16): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16]
    
      }
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_]]
          (typeGen: TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16], sAppender: SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11],F[N12],F[N13],F[N14],F[N15],F[N16]]
      }
    
      }
    

      object SimpleProduct17 {
        SimpleProduct17Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T],N16[T],N17[T]] extends TypeGen17[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17] {
        override def gen[T]: M[N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T],N16[T],N17[T]]
      }
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender17[M] {
        
      override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17]
        (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11],f12: ABCFunc[A12, B12, C12],f13: ABCFunc[A13, B13, C13],f14: ABCFunc[A14, B14, C14],f15: ABCFunc[A15, B15, C15],f16: ABCFunc[A16, B16, C16],f17: ABCFunc[A17, B17, C17])
        (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17])
        : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17]
    
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11,p12: N12,p13: N13,p14: N14,p15: N15,p16: N16,p17: N17): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17]
    
      }
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_]]
          (typeGen: TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17], sAppender: SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11],F[N12],F[N13],F[N14],F[N15],F[N16],F[N17]]
      }
    
      }
    

      object SimpleProduct18 {
        SimpleProduct18Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T],N16[T],N17[T],N18[T]] extends TypeGen18[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18] {
        override def gen[T]: M[N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T],N16[T],N17[T],N18[T]]
      }
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender18[M] {
        
      override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18]
        (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11],f12: ABCFunc[A12, B12, C12],f13: ABCFunc[A13, B13, C13],f14: ABCFunc[A14, B14, C14],f15: ABCFunc[A15, B15, C15],f16: ABCFunc[A16, B16, C16],f17: ABCFunc[A17, B17, C17],f18: ABCFunc[A18, B18, C18])
        (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18])
        : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18]
    
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11,p12: N12,p13: N13,p14: N14,p15: N15,p16: N16,p17: N17,p18: N18): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18]
    
      }
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_]]
          (typeGen: TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18], sAppender: SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11],F[N12],F[N13],F[N14],F[N15],F[N16],F[N17],F[N18]]
      }
    
      }
    

      object SimpleProduct19 {
        SimpleProduct19Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T],N16[T],N17[T],N18[T],N19[T]] extends TypeGen19[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19] {
        override def gen[T]: M[N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T],N16[T],N17[T],N18[T],N19[T]]
      }
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender19[M] {
        
      override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18,A19, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19]
        (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11],f12: ABCFunc[A12, B12, C12],f13: ABCFunc[A13, B13, C13],f14: ABCFunc[A14, B14, C14],f15: ABCFunc[A15, B15, C15],f16: ABCFunc[A16, B16, C16],f17: ABCFunc[A17, B17, C17],f18: ABCFunc[A18, B18, C18],f19: ABCFunc[A19, B19, C19])
        (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18,A19], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19])
        : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19]
    
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11,p12: N12,p13: N13,p14: N14,p15: N15,p16: N16,p17: N17,p18: N18,p19: N19): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19]
    
      }
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_]]
          (typeGen: TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19], sAppender: SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11],F[N12],F[N13],F[N14],F[N15],F[N16],F[N17],F[N18],F[N19]]
      }
    
      }
    

      object SimpleProduct20 {
        SimpleProduct20Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T],N16[T],N17[T],N18[T],N19[T],N20[T]] extends TypeGen20[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20] {
        override def gen[T]: M[N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T],N16[T],N17[T],N18[T],N19[T],N20[T]]
      }
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender20[M] {
        
      override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18,A19,A20, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20]
        (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11],f12: ABCFunc[A12, B12, C12],f13: ABCFunc[A13, B13, C13],f14: ABCFunc[A14, B14, C14],f15: ABCFunc[A15, B15, C15],f16: ABCFunc[A16, B16, C16],f17: ABCFunc[A17, B17, C17],f18: ABCFunc[A18, B18, C18],f19: ABCFunc[A19, B19, C19],f20: ABCFunc[A20, B20, C20])
        (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18,A19,A20], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20])
        : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20]
    
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11,p12: N12,p13: N13,p14: N14,p15: N15,p16: N16,p17: N17,p18: N18,p19: N19,p20: N20): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20]
    
      }
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],N20[_]]
          (typeGen: TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20], sAppender: SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11],F[N12],F[N13],F[N14],F[N15],F[N16],F[N17],F[N18],F[N19],F[N20]]
      }
    
      }
    

      object SimpleProduct21 {
        SimpleProduct21Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T],N16[T],N17[T],N18[T],N19[T],N20[T],N21[T]] extends TypeGen21[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21] {
        override def gen[T]: M[N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T],N16[T],N17[T],N18[T],N19[T],N20[T],N21[T]]
      }
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender21[M] {
        
      override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18,A19,A20,A21, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20,C21]
        (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11],f12: ABCFunc[A12, B12, C12],f13: ABCFunc[A13, B13, C13],f14: ABCFunc[A14, B14, C14],f15: ABCFunc[A15, B15, C15],f16: ABCFunc[A16, B16, C16],f17: ABCFunc[A17, B17, C17],f18: ABCFunc[A18, B18, C18],f19: ABCFunc[A19, B19, C19],f20: ABCFunc[A20, B20, C20],f21: ABCFunc[A21, B21, C21])
        (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18,A19,A20,A21], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21])
        : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20,C21]
    
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11,p12: N12,p13: N13,p14: N14,p15: N15,p16: N16,p17: N17,p18: N18,p19: N19,p20: N20,p21: N21): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21]
    
      }
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],N20[_],N21[_]]
          (typeGen: TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21], sAppender: SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11],F[N12],F[N13],F[N14],F[N15],F[N16],F[N17],F[N18],F[N19],F[N20],F[N21]]
      }
    
      }
    

      object SimpleProduct22 {
        SimpleProduct22Self =>

        
      trait TypeGen[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T],N16[T],N17[T],N18[T],N19[T],N20[T],N21[T],N22[T]] extends TypeGen22[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21,N22] {
        override def gen[T]: M[N1[T],N2[T],N3[T],N4[T],N5[T],N6[T],N7[T],N8[T],N9[T],N10[T],N11[T],N12[T],N13[T],N14[T],N15[T],N16[T],N17[T],N18[T],N19[T],N20[T],N21[T],N22[T]]
      }
    
        
      trait SimpleAppender[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender22[M] {
        
      override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18,A19,A20,A21,A22, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20,C21,C22]
        (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11],f12: ABCFunc[A12, B12, C12],f13: ABCFunc[A13, B13, C13],f14: ABCFunc[A14, B14, C14],f15: ABCFunc[A15, B15, C15],f16: ABCFunc[A16, B16, C16],f17: ABCFunc[A17, B17, C17],f18: ABCFunc[A18, B18, C18],f19: ABCFunc[A19, B19, C19],f20: ABCFunc[A20, B20, C20],f21: ABCFunc[A21, B21, C21],f22: ABCFunc[A22, B22, C22])
        (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18,A19,A20,A21,A22], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22])
        : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20,C21,C22]
    
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21,N22](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11,p12: N12,p13: N13,p14: N14,p15: N15,p16: N16,p17: N17,p18: N18,p19: N19,p20: N20,p21: N21,p22: N22): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21,N22]
    
      }
    
        
      trait ProductAdapter[F[_[_]]] {
        def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],N20[_],N21[_],N22[_]]
          (typeGen: TypeGen[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21,N22], sAppender: SimpleAppender[M])
          : M[F[N1],F[N2],F[N3],F[N4],F[N5],F[N6],F[N7],F[N8],F[N9],F[N10],F[N11],F[N12],F[N13],F[N14],F[N15],F[N16],F[N17],F[N18],F[N19],F[N20],F[N21],F[N22]]
      }
    
      }
    
  