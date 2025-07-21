
    package net.scalax.simple.adt
    package nat
    package support

    
      trait SimpleAppender1[M[_]] extends SimpleAppender1Positive[M] with SimpleAppender1Zero[M] {
        
       override def append[A1, B1, C1]
         (f1: ABCFunc[A1, B1, C1])
         (a: M[A1], b: M[B1])
         : M[C1]
     
        
      override def zero[N1](p1: N1): M[N1]
    
      }
    

      trait SimpleAppender2[M[_,_]] extends SimpleAppender2Positive[M] with SimpleAppender2Zero[M] {
        
       override def append[A1,A2, B1,B2, C1,C2]
         (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2])
         (a: M[A1,A2], b: M[B1,B2])
         : M[C1,C2]
     
        
      override def zero[N1,N2](p1: N1,p2: N2): M[N1,N2]
    
      }
    

      trait SimpleAppender3[M[_,_,_]] extends SimpleAppender3Positive[M] with SimpleAppender3Zero[M] {
        
       override def append[A1,A2,A3, B1,B2,B3, C1,C2,C3]
         (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3])
         (a: M[A1,A2,A3], b: M[B1,B2,B3])
         : M[C1,C2,C3]
     
        
      override def zero[N1,N2,N3](p1: N1,p2: N2,p3: N3): M[N1,N2,N3]
    
      }
    

      trait SimpleAppender4[M[_,_,_,_]] extends SimpleAppender4Positive[M] with SimpleAppender4Zero[M] {
        
       override def append[A1,A2,A3,A4, B1,B2,B3,B4, C1,C2,C3,C4]
         (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4])
         (a: M[A1,A2,A3,A4], b: M[B1,B2,B3,B4])
         : M[C1,C2,C3,C4]
     
        
      override def zero[N1,N2,N3,N4](p1: N1,p2: N2,p3: N3,p4: N4): M[N1,N2,N3,N4]
    
      }
    

      trait SimpleAppender5[M[_,_,_,_,_]] extends SimpleAppender5Positive[M] with SimpleAppender5Zero[M] {
        
       override def append[A1,A2,A3,A4,A5, B1,B2,B3,B4,B5, C1,C2,C3,C4,C5]
         (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5])
         (a: M[A1,A2,A3,A4,A5], b: M[B1,B2,B3,B4,B5])
         : M[C1,C2,C3,C4,C5]
     
        
      override def zero[N1,N2,N3,N4,N5](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5): M[N1,N2,N3,N4,N5]
    
      }
    

      trait SimpleAppender6[M[_,_,_,_,_,_]] extends SimpleAppender6Positive[M] with SimpleAppender6Zero[M] {
        
       override def append[A1,A2,A3,A4,A5,A6, B1,B2,B3,B4,B5,B6, C1,C2,C3,C4,C5,C6]
         (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6])
         (a: M[A1,A2,A3,A4,A5,A6], b: M[B1,B2,B3,B4,B5,B6])
         : M[C1,C2,C3,C4,C5,C6]
     
        
      override def zero[N1,N2,N3,N4,N5,N6](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6): M[N1,N2,N3,N4,N5,N6]
    
      }
    

      trait SimpleAppender7[M[_,_,_,_,_,_,_]] extends SimpleAppender7Positive[M] with SimpleAppender7Zero[M] {
        
       override def append[A1,A2,A3,A4,A5,A6,A7, B1,B2,B3,B4,B5,B6,B7, C1,C2,C3,C4,C5,C6,C7]
         (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7])
         (a: M[A1,A2,A3,A4,A5,A6,A7], b: M[B1,B2,B3,B4,B5,B6,B7])
         : M[C1,C2,C3,C4,C5,C6,C7]
     
        
      override def zero[N1,N2,N3,N4,N5,N6,N7](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7): M[N1,N2,N3,N4,N5,N6,N7]
    
      }
    

      trait SimpleAppender8[M[_,_,_,_,_,_,_,_]] extends SimpleAppender8Positive[M] with SimpleAppender8Zero[M] {
        
       override def append[A1,A2,A3,A4,A5,A6,A7,A8, B1,B2,B3,B4,B5,B6,B7,B8, C1,C2,C3,C4,C5,C6,C7,C8]
         (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8])
         (a: M[A1,A2,A3,A4,A5,A6,A7,A8], b: M[B1,B2,B3,B4,B5,B6,B7,B8])
         : M[C1,C2,C3,C4,C5,C6,C7,C8]
     
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8): M[N1,N2,N3,N4,N5,N6,N7,N8]
    
      }
    

      trait SimpleAppender9[M[_,_,_,_,_,_,_,_,_]] extends SimpleAppender9Positive[M] with SimpleAppender9Zero[M] {
        
       override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9, B1,B2,B3,B4,B5,B6,B7,B8,B9, C1,C2,C3,C4,C5,C6,C7,C8,C9]
         (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9])
         (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9])
         : M[C1,C2,C3,C4,C5,C6,C7,C8,C9]
     
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9): M[N1,N2,N3,N4,N5,N6,N7,N8,N9]
    
      }
    

      trait SimpleAppender10[M[_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender10Positive[M] with SimpleAppender10Zero[M] {
        
       override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10]
         (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10])
         (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10])
         : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10]
     
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10]
    
      }
    

      trait SimpleAppender11[M[_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender11Positive[M] with SimpleAppender11Zero[M] {
        
       override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11]
         (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11])
         (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11])
         : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11]
     
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11]
    
      }
    

      trait SimpleAppender12[M[_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender12Positive[M] with SimpleAppender12Zero[M] {
        
       override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12]
         (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11],f12: ABCFunc[A12, B12, C12])
         (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12])
         : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12]
     
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11,p12: N12): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12]
    
      }
    

      trait SimpleAppender13[M[_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender13Positive[M] with SimpleAppender13Zero[M] {
        
       override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13]
         (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11],f12: ABCFunc[A12, B12, C12],f13: ABCFunc[A13, B13, C13])
         (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13])
         : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13]
     
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11,p12: N12,p13: N13): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13]
    
      }
    

      trait SimpleAppender14[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender14Positive[M] with SimpleAppender14Zero[M] {
        
       override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14]
         (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11],f12: ABCFunc[A12, B12, C12],f13: ABCFunc[A13, B13, C13],f14: ABCFunc[A14, B14, C14])
         (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14])
         : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14]
     
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11,p12: N12,p13: N13,p14: N14): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14]
    
      }
    

      trait SimpleAppender15[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender15Positive[M] with SimpleAppender15Zero[M] {
        
       override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15]
         (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11],f12: ABCFunc[A12, B12, C12],f13: ABCFunc[A13, B13, C13],f14: ABCFunc[A14, B14, C14],f15: ABCFunc[A15, B15, C15])
         (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15])
         : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15]
     
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11,p12: N12,p13: N13,p14: N14,p15: N15): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15]
    
      }
    

      trait SimpleAppender16[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender16Positive[M] with SimpleAppender16Zero[M] {
        
       override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16]
         (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11],f12: ABCFunc[A12, B12, C12],f13: ABCFunc[A13, B13, C13],f14: ABCFunc[A14, B14, C14],f15: ABCFunc[A15, B15, C15],f16: ABCFunc[A16, B16, C16])
         (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16])
         : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16]
     
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11,p12: N12,p13: N13,p14: N14,p15: N15,p16: N16): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16]
    
      }
    

      trait SimpleAppender17[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender17Positive[M] with SimpleAppender17Zero[M] {
        
       override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17]
         (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11],f12: ABCFunc[A12, B12, C12],f13: ABCFunc[A13, B13, C13],f14: ABCFunc[A14, B14, C14],f15: ABCFunc[A15, B15, C15],f16: ABCFunc[A16, B16, C16],f17: ABCFunc[A17, B17, C17])
         (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17])
         : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17]
     
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11,p12: N12,p13: N13,p14: N14,p15: N15,p16: N16,p17: N17): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17]
    
      }
    

      trait SimpleAppender18[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender18Positive[M] with SimpleAppender18Zero[M] {
        
       override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18]
         (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11],f12: ABCFunc[A12, B12, C12],f13: ABCFunc[A13, B13, C13],f14: ABCFunc[A14, B14, C14],f15: ABCFunc[A15, B15, C15],f16: ABCFunc[A16, B16, C16],f17: ABCFunc[A17, B17, C17],f18: ABCFunc[A18, B18, C18])
         (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18])
         : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18]
     
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11,p12: N12,p13: N13,p14: N14,p15: N15,p16: N16,p17: N17,p18: N18): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18]
    
      }
    

      trait SimpleAppender19[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender19Positive[M] with SimpleAppender19Zero[M] {
        
       override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18,A19, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19]
         (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11],f12: ABCFunc[A12, B12, C12],f13: ABCFunc[A13, B13, C13],f14: ABCFunc[A14, B14, C14],f15: ABCFunc[A15, B15, C15],f16: ABCFunc[A16, B16, C16],f17: ABCFunc[A17, B17, C17],f18: ABCFunc[A18, B18, C18],f19: ABCFunc[A19, B19, C19])
         (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18,A19], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19])
         : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19]
     
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11,p12: N12,p13: N13,p14: N14,p15: N15,p16: N16,p17: N17,p18: N18,p19: N19): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19]
    
      }
    

      trait SimpleAppender20[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender20Positive[M] with SimpleAppender20Zero[M] {
        
       override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18,A19,A20, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20]
         (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11],f12: ABCFunc[A12, B12, C12],f13: ABCFunc[A13, B13, C13],f14: ABCFunc[A14, B14, C14],f15: ABCFunc[A15, B15, C15],f16: ABCFunc[A16, B16, C16],f17: ABCFunc[A17, B17, C17],f18: ABCFunc[A18, B18, C18],f19: ABCFunc[A19, B19, C19],f20: ABCFunc[A20, B20, C20])
         (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18,A19,A20], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20])
         : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20]
     
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11,p12: N12,p13: N13,p14: N14,p15: N15,p16: N16,p17: N17,p18: N18,p19: N19,p20: N20): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20]
    
      }
    

      trait SimpleAppender21[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender21Positive[M] with SimpleAppender21Zero[M] {
        
       override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18,A19,A20,A21, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20,C21]
         (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11],f12: ABCFunc[A12, B12, C12],f13: ABCFunc[A13, B13, C13],f14: ABCFunc[A14, B14, C14],f15: ABCFunc[A15, B15, C15],f16: ABCFunc[A16, B16, C16],f17: ABCFunc[A17, B17, C17],f18: ABCFunc[A18, B18, C18],f19: ABCFunc[A19, B19, C19],f20: ABCFunc[A20, B20, C20],f21: ABCFunc[A21, B21, C21])
         (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18,A19,A20,A21], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21])
         : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20,C21]
     
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11,p12: N12,p13: N13,p14: N14,p15: N15,p16: N16,p17: N17,p18: N18,p19: N19,p20: N20,p21: N21): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21]
    
      }
    

      trait SimpleAppender22[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_]] extends SimpleAppender22Positive[M] with SimpleAppender22Zero[M] {
        
       override def append[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18,A19,A20,A21,A22, B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22, C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20,C21,C22]
         (f1: ABCFunc[A1, B1, C1],f2: ABCFunc[A2, B2, C2],f3: ABCFunc[A3, B3, C3],f4: ABCFunc[A4, B4, C4],f5: ABCFunc[A5, B5, C5],f6: ABCFunc[A6, B6, C6],f7: ABCFunc[A7, B7, C7],f8: ABCFunc[A8, B8, C8],f9: ABCFunc[A9, B9, C9],f10: ABCFunc[A10, B10, C10],f11: ABCFunc[A11, B11, C11],f12: ABCFunc[A12, B12, C12],f13: ABCFunc[A13, B13, C13],f14: ABCFunc[A14, B14, C14],f15: ABCFunc[A15, B15, C15],f16: ABCFunc[A16, B16, C16],f17: ABCFunc[A17, B17, C17],f18: ABCFunc[A18, B18, C18],f19: ABCFunc[A19, B19, C19],f20: ABCFunc[A20, B20, C20],f21: ABCFunc[A21, B21, C21],f22: ABCFunc[A22, B22, C22])
         (a: M[A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18,A19,A20,A21,A22], b: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22])
         : M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20,C21,C22]
     
        
      override def zero[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21,N22](p1: N1,p2: N2,p3: N3,p4: N4,p5: N5,p6: N6,p7: N7,p8: N8,p9: N9,p10: N10,p11: N11,p12: N12,p13: N13,p14: N14,p15: N15,p16: N16,p17: N17,p18: N18,p19: N19,p20: N20,p21: N21,p22: N22): M[N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21,N22]
    
      }
    
  