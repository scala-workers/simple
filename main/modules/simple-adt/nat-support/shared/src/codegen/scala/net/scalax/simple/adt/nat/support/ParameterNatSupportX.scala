
    package net.scalax.simple.adt
    package nat
    package support

    
      trait ParameterNatSupport1[
        M[_],
        N1[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends Parameter1NatSupport1[
        M,
        N1,
        HLLike1,
        APRHLLike1
      ] {
        ParameterNatSupport1Self =>

        
      override def content: AppenderNatSupport1[M, HLLike1, APRHLLike1]
    
        
      override def typeGen: TypeGen1[M, N1]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
      }

      trait ParameterNatSupport2[
        M[_,_],
        N1[_],N2[_],
        HLLike1,HLLike2,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2
      ] extends Parameter1NatSupport2[
        M,
        N1,N2,
        HLLike1,HLLike2,
        APRHLLike1,APRHLLike2
      ] {
        ParameterNatSupport2Self =>

        
      override def content: AppenderNatSupport2[M, HLLike1,HLLike2, APRHLLike1,APRHLLike2]
    
        
      override def typeGen: TypeGen2[M, N1,N2]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
      }

      trait ParameterNatSupport3[
        M[_,_,_],
        N1[_],N2[_],N3[_],
        HLLike1,HLLike2,HLLike3,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3
      ] extends Parameter1NatSupport3[
        M,
        N1,N2,N3,
        HLLike1,HLLike2,HLLike3,
        APRHLLike1,APRHLLike2,APRHLLike3
      ] {
        ParameterNatSupport3Self =>

        
      override def content: AppenderNatSupport3[M, HLLike1,HLLike2,HLLike3, APRHLLike1,APRHLLike2,APRHLLike3]
    
        
      override def typeGen: TypeGen3[M, N1,N2,N3]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
      }

      trait ParameterNatSupport4[
        M[_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],
        HLLike1,HLLike2,HLLike3,HLLike4,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4
      ] extends Parameter1NatSupport4[
        M,
        N1,N2,N3,N4,
        HLLike1,HLLike2,HLLike3,HLLike4,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4
      ] {
        ParameterNatSupport4Self =>

        
      override def content: AppenderNatSupport4[M, HLLike1,HLLike2,HLLike3,HLLike4, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4]
    
        
      override def typeGen: TypeGen4[M, N1,N2,N3,N4]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
def apH4: HListFunc[HLLike4, APRHLLike4]
      }

      trait ParameterNatSupport5[
        M[_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5
      ] extends Parameter1NatSupport5[
        M,
        N1,N2,N3,N4,N5,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5
      ] {
        ParameterNatSupport5Self =>

        
      override def content: AppenderNatSupport5[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5]
    
        
      override def typeGen: TypeGen5[M, N1,N2,N3,N4,N5]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
def apH4: HListFunc[HLLike4, APRHLLike4]
def apH5: HListFunc[HLLike5, APRHLLike5]
      }

      trait ParameterNatSupport6[
        M[_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6
      ] extends Parameter1NatSupport6[
        M,
        N1,N2,N3,N4,N5,N6,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6
      ] {
        ParameterNatSupport6Self =>

        
      override def content: AppenderNatSupport6[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6]
    
        
      override def typeGen: TypeGen6[M, N1,N2,N3,N4,N5,N6]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
def apH4: HListFunc[HLLike4, APRHLLike4]
def apH5: HListFunc[HLLike5, APRHLLike5]
def apH6: HListFunc[HLLike6, APRHLLike6]
      }

      trait ParameterNatSupport7[
        M[_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7
      ] extends Parameter1NatSupport7[
        M,
        N1,N2,N3,N4,N5,N6,N7,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7
      ] {
        ParameterNatSupport7Self =>

        
      override def content: AppenderNatSupport7[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7]
    
        
      override def typeGen: TypeGen7[M, N1,N2,N3,N4,N5,N6,N7]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
def apH4: HListFunc[HLLike4, APRHLLike4]
def apH5: HListFunc[HLLike5, APRHLLike5]
def apH6: HListFunc[HLLike6, APRHLLike6]
def apH7: HListFunc[HLLike7, APRHLLike7]
      }

      trait ParameterNatSupport8[
        M[_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8
      ] extends Parameter1NatSupport8[
        M,
        N1,N2,N3,N4,N5,N6,N7,N8,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8
      ] {
        ParameterNatSupport8Self =>

        
      override def content: AppenderNatSupport8[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8]
    
        
      override def typeGen: TypeGen8[M, N1,N2,N3,N4,N5,N6,N7,N8]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
def apH4: HListFunc[HLLike4, APRHLLike4]
def apH5: HListFunc[HLLike5, APRHLLike5]
def apH6: HListFunc[HLLike6, APRHLLike6]
def apH7: HListFunc[HLLike7, APRHLLike7]
def apH8: HListFunc[HLLike8, APRHLLike8]
      }

      trait ParameterNatSupport9[
        M[_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9
      ] extends Parameter1NatSupport9[
        M,
        N1,N2,N3,N4,N5,N6,N7,N8,N9,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9
      ] {
        ParameterNatSupport9Self =>

        
      override def content: AppenderNatSupport9[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9]
    
        
      override def typeGen: TypeGen9[M, N1,N2,N3,N4,N5,N6,N7,N8,N9]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
def apH4: HListFunc[HLLike4, APRHLLike4]
def apH5: HListFunc[HLLike5, APRHLLike5]
def apH6: HListFunc[HLLike6, APRHLLike6]
def apH7: HListFunc[HLLike7, APRHLLike7]
def apH8: HListFunc[HLLike8, APRHLLike8]
def apH9: HListFunc[HLLike9, APRHLLike9]
      }

      trait ParameterNatSupport10[
        M[_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10
      ] extends Parameter1NatSupport10[
        M,
        N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10
      ] {
        ParameterNatSupport10Self =>

        
      override def content: AppenderNatSupport10[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10]
    
        
      override def typeGen: TypeGen10[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
def apH4: HListFunc[HLLike4, APRHLLike4]
def apH5: HListFunc[HLLike5, APRHLLike5]
def apH6: HListFunc[HLLike6, APRHLLike6]
def apH7: HListFunc[HLLike7, APRHLLike7]
def apH8: HListFunc[HLLike8, APRHLLike8]
def apH9: HListFunc[HLLike9, APRHLLike9]
def apH10: HListFunc[HLLike10, APRHLLike10]
      }

      trait ParameterNatSupport11[
        M[_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11
      ] extends Parameter1NatSupport11[
        M,
        N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11
      ] {
        ParameterNatSupport11Self =>

        
      override def content: AppenderNatSupport11[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11]
    
        
      override def typeGen: TypeGen11[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
def apH4: HListFunc[HLLike4, APRHLLike4]
def apH5: HListFunc[HLLike5, APRHLLike5]
def apH6: HListFunc[HLLike6, APRHLLike6]
def apH7: HListFunc[HLLike7, APRHLLike7]
def apH8: HListFunc[HLLike8, APRHLLike8]
def apH9: HListFunc[HLLike9, APRHLLike9]
def apH10: HListFunc[HLLike10, APRHLLike10]
def apH11: HListFunc[HLLike11, APRHLLike11]
      }

      trait ParameterNatSupport12[
        M[_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12
      ] extends Parameter1NatSupport12[
        M,
        N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12
      ] {
        ParameterNatSupport12Self =>

        
      override def content: AppenderNatSupport12[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12]
    
        
      override def typeGen: TypeGen12[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
def apH4: HListFunc[HLLike4, APRHLLike4]
def apH5: HListFunc[HLLike5, APRHLLike5]
def apH6: HListFunc[HLLike6, APRHLLike6]
def apH7: HListFunc[HLLike7, APRHLLike7]
def apH8: HListFunc[HLLike8, APRHLLike8]
def apH9: HListFunc[HLLike9, APRHLLike9]
def apH10: HListFunc[HLLike10, APRHLLike10]
def apH11: HListFunc[HLLike11, APRHLLike11]
def apH12: HListFunc[HLLike12, APRHLLike12]
      }

      trait ParameterNatSupport13[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13
      ] extends Parameter1NatSupport13[
        M,
        N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13
      ] {
        ParameterNatSupport13Self =>

        
      override def content: AppenderNatSupport13[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13]
    
        
      override def typeGen: TypeGen13[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
def apH4: HListFunc[HLLike4, APRHLLike4]
def apH5: HListFunc[HLLike5, APRHLLike5]
def apH6: HListFunc[HLLike6, APRHLLike6]
def apH7: HListFunc[HLLike7, APRHLLike7]
def apH8: HListFunc[HLLike8, APRHLLike8]
def apH9: HListFunc[HLLike9, APRHLLike9]
def apH10: HListFunc[HLLike10, APRHLLike10]
def apH11: HListFunc[HLLike11, APRHLLike11]
def apH12: HListFunc[HLLike12, APRHLLike12]
def apH13: HListFunc[HLLike13, APRHLLike13]
      }

      trait ParameterNatSupport14[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14
      ] extends Parameter1NatSupport14[
        M,
        N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14
      ] {
        ParameterNatSupport14Self =>

        
      override def content: AppenderNatSupport14[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14]
    
        
      override def typeGen: TypeGen14[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
def apH4: HListFunc[HLLike4, APRHLLike4]
def apH5: HListFunc[HLLike5, APRHLLike5]
def apH6: HListFunc[HLLike6, APRHLLike6]
def apH7: HListFunc[HLLike7, APRHLLike7]
def apH8: HListFunc[HLLike8, APRHLLike8]
def apH9: HListFunc[HLLike9, APRHLLike9]
def apH10: HListFunc[HLLike10, APRHLLike10]
def apH11: HListFunc[HLLike11, APRHLLike11]
def apH12: HListFunc[HLLike12, APRHLLike12]
def apH13: HListFunc[HLLike13, APRHLLike13]
def apH14: HListFunc[HLLike14, APRHLLike14]
      }

      trait ParameterNatSupport15[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15
      ] extends Parameter1NatSupport15[
        M,
        N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15
      ] {
        ParameterNatSupport15Self =>

        
      override def content: AppenderNatSupport15[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15]
    
        
      override def typeGen: TypeGen15[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
def apH4: HListFunc[HLLike4, APRHLLike4]
def apH5: HListFunc[HLLike5, APRHLLike5]
def apH6: HListFunc[HLLike6, APRHLLike6]
def apH7: HListFunc[HLLike7, APRHLLike7]
def apH8: HListFunc[HLLike8, APRHLLike8]
def apH9: HListFunc[HLLike9, APRHLLike9]
def apH10: HListFunc[HLLike10, APRHLLike10]
def apH11: HListFunc[HLLike11, APRHLLike11]
def apH12: HListFunc[HLLike12, APRHLLike12]
def apH13: HListFunc[HLLike13, APRHLLike13]
def apH14: HListFunc[HLLike14, APRHLLike14]
def apH15: HListFunc[HLLike15, APRHLLike15]
      }

      trait ParameterNatSupport16[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16
      ] extends Parameter1NatSupport16[
        M,
        N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16
      ] {
        ParameterNatSupport16Self =>

        
      override def content: AppenderNatSupport16[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16]
    
        
      override def typeGen: TypeGen16[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
def apH4: HListFunc[HLLike4, APRHLLike4]
def apH5: HListFunc[HLLike5, APRHLLike5]
def apH6: HListFunc[HLLike6, APRHLLike6]
def apH7: HListFunc[HLLike7, APRHLLike7]
def apH8: HListFunc[HLLike8, APRHLLike8]
def apH9: HListFunc[HLLike9, APRHLLike9]
def apH10: HListFunc[HLLike10, APRHLLike10]
def apH11: HListFunc[HLLike11, APRHLLike11]
def apH12: HListFunc[HLLike12, APRHLLike12]
def apH13: HListFunc[HLLike13, APRHLLike13]
def apH14: HListFunc[HLLike14, APRHLLike14]
def apH15: HListFunc[HLLike15, APRHLLike15]
def apH16: HListFunc[HLLike16, APRHLLike16]
      }

      trait ParameterNatSupport17[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17
      ] extends Parameter1NatSupport17[
        M,
        N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17
      ] {
        ParameterNatSupport17Self =>

        
      override def content: AppenderNatSupport17[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17]
    
        
      override def typeGen: TypeGen17[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
def apH4: HListFunc[HLLike4, APRHLLike4]
def apH5: HListFunc[HLLike5, APRHLLike5]
def apH6: HListFunc[HLLike6, APRHLLike6]
def apH7: HListFunc[HLLike7, APRHLLike7]
def apH8: HListFunc[HLLike8, APRHLLike8]
def apH9: HListFunc[HLLike9, APRHLLike9]
def apH10: HListFunc[HLLike10, APRHLLike10]
def apH11: HListFunc[HLLike11, APRHLLike11]
def apH12: HListFunc[HLLike12, APRHLLike12]
def apH13: HListFunc[HLLike13, APRHLLike13]
def apH14: HListFunc[HLLike14, APRHLLike14]
def apH15: HListFunc[HLLike15, APRHLLike15]
def apH16: HListFunc[HLLike16, APRHLLike16]
def apH17: HListFunc[HLLike17, APRHLLike17]
      }

      trait ParameterNatSupport18[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18
      ] extends Parameter1NatSupport18[
        M,
        N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18
      ] {
        ParameterNatSupport18Self =>

        
      override def content: AppenderNatSupport18[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18]
    
        
      override def typeGen: TypeGen18[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
def apH4: HListFunc[HLLike4, APRHLLike4]
def apH5: HListFunc[HLLike5, APRHLLike5]
def apH6: HListFunc[HLLike6, APRHLLike6]
def apH7: HListFunc[HLLike7, APRHLLike7]
def apH8: HListFunc[HLLike8, APRHLLike8]
def apH9: HListFunc[HLLike9, APRHLLike9]
def apH10: HListFunc[HLLike10, APRHLLike10]
def apH11: HListFunc[HLLike11, APRHLLike11]
def apH12: HListFunc[HLLike12, APRHLLike12]
def apH13: HListFunc[HLLike13, APRHLLike13]
def apH14: HListFunc[HLLike14, APRHLLike14]
def apH15: HListFunc[HLLike15, APRHLLike15]
def apH16: HListFunc[HLLike16, APRHLLike16]
def apH17: HListFunc[HLLike17, APRHLLike17]
def apH18: HListFunc[HLLike18, APRHLLike18]
      }

      trait ParameterNatSupport19[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19
      ] extends Parameter1NatSupport19[
        M,
        N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19
      ] {
        ParameterNatSupport19Self =>

        
      override def content: AppenderNatSupport19[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19]
    
        
      override def typeGen: TypeGen19[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
def apH4: HListFunc[HLLike4, APRHLLike4]
def apH5: HListFunc[HLLike5, APRHLLike5]
def apH6: HListFunc[HLLike6, APRHLLike6]
def apH7: HListFunc[HLLike7, APRHLLike7]
def apH8: HListFunc[HLLike8, APRHLLike8]
def apH9: HListFunc[HLLike9, APRHLLike9]
def apH10: HListFunc[HLLike10, APRHLLike10]
def apH11: HListFunc[HLLike11, APRHLLike11]
def apH12: HListFunc[HLLike12, APRHLLike12]
def apH13: HListFunc[HLLike13, APRHLLike13]
def apH14: HListFunc[HLLike14, APRHLLike14]
def apH15: HListFunc[HLLike15, APRHLLike15]
def apH16: HListFunc[HLLike16, APRHLLike16]
def apH17: HListFunc[HLLike17, APRHLLike17]
def apH18: HListFunc[HLLike18, APRHLLike18]
def apH19: HListFunc[HLLike19, APRHLLike19]
      }

      trait ParameterNatSupport20[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],N20[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19,APRHLLike20[_, _ <: HLLike20] <: HLLike20
      ] extends Parameter1NatSupport20[
        M,
        N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20
      ] {
        ParameterNatSupport20Self =>

        
      override def content: AppenderNatSupport20[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20]
    
        
      override def typeGen: TypeGen20[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
def apH4: HListFunc[HLLike4, APRHLLike4]
def apH5: HListFunc[HLLike5, APRHLLike5]
def apH6: HListFunc[HLLike6, APRHLLike6]
def apH7: HListFunc[HLLike7, APRHLLike7]
def apH8: HListFunc[HLLike8, APRHLLike8]
def apH9: HListFunc[HLLike9, APRHLLike9]
def apH10: HListFunc[HLLike10, APRHLLike10]
def apH11: HListFunc[HLLike11, APRHLLike11]
def apH12: HListFunc[HLLike12, APRHLLike12]
def apH13: HListFunc[HLLike13, APRHLLike13]
def apH14: HListFunc[HLLike14, APRHLLike14]
def apH15: HListFunc[HLLike15, APRHLLike15]
def apH16: HListFunc[HLLike16, APRHLLike16]
def apH17: HListFunc[HLLike17, APRHLLike17]
def apH18: HListFunc[HLLike18, APRHLLike18]
def apH19: HListFunc[HLLike19, APRHLLike19]
def apH20: HListFunc[HLLike20, APRHLLike20]
      }

      trait ParameterNatSupport21[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],N20[_],N21[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19,APRHLLike20[_, _ <: HLLike20] <: HLLike20,APRHLLike21[_, _ <: HLLike21] <: HLLike21
      ] extends Parameter1NatSupport21[
        M,
        N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20,APRHLLike21
      ] {
        ParameterNatSupport21Self =>

        
      override def content: AppenderNatSupport21[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20,APRHLLike21]
    
        
      override def typeGen: TypeGen21[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
def apH4: HListFunc[HLLike4, APRHLLike4]
def apH5: HListFunc[HLLike5, APRHLLike5]
def apH6: HListFunc[HLLike6, APRHLLike6]
def apH7: HListFunc[HLLike7, APRHLLike7]
def apH8: HListFunc[HLLike8, APRHLLike8]
def apH9: HListFunc[HLLike9, APRHLLike9]
def apH10: HListFunc[HLLike10, APRHLLike10]
def apH11: HListFunc[HLLike11, APRHLLike11]
def apH12: HListFunc[HLLike12, APRHLLike12]
def apH13: HListFunc[HLLike13, APRHLLike13]
def apH14: HListFunc[HLLike14, APRHLLike14]
def apH15: HListFunc[HLLike15, APRHLLike15]
def apH16: HListFunc[HLLike16, APRHLLike16]
def apH17: HListFunc[HLLike17, APRHLLike17]
def apH18: HListFunc[HLLike18, APRHLLike18]
def apH19: HListFunc[HLLike19, APRHLLike19]
def apH20: HListFunc[HLLike20, APRHLLike20]
def apH21: HListFunc[HLLike21, APRHLLike21]
      }

      trait ParameterNatSupport22[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],N20[_],N21[_],N22[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21,HLLike22,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19,APRHLLike20[_, _ <: HLLike20] <: HLLike20,APRHLLike21[_, _ <: HLLike21] <: HLLike21,APRHLLike22[_, _ <: HLLike22] <: HLLike22
      ] extends Parameter1NatSupport22[
        M,
        N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21,N22,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21,HLLike22,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20,APRHLLike21,APRHLLike22
      ] {
        ParameterNatSupport22Self =>

        
      override def content: AppenderNatSupport22[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21,HLLike22, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20,APRHLLike21,APRHLLike22]
    
        
      override def typeGen: TypeGen22[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21,N22]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
def apH4: HListFunc[HLLike4, APRHLLike4]
def apH5: HListFunc[HLLike5, APRHLLike5]
def apH6: HListFunc[HLLike6, APRHLLike6]
def apH7: HListFunc[HLLike7, APRHLLike7]
def apH8: HListFunc[HLLike8, APRHLLike8]
def apH9: HListFunc[HLLike9, APRHLLike9]
def apH10: HListFunc[HLLike10, APRHLLike10]
def apH11: HListFunc[HLLike11, APRHLLike11]
def apH12: HListFunc[HLLike12, APRHLLike12]
def apH13: HListFunc[HLLike13, APRHLLike13]
def apH14: HListFunc[HLLike14, APRHLLike14]
def apH15: HListFunc[HLLike15, APRHLLike15]
def apH16: HListFunc[HLLike16, APRHLLike16]
def apH17: HListFunc[HLLike17, APRHLLike17]
def apH18: HListFunc[HLLike18, APRHLLike18]
def apH19: HListFunc[HLLike19, APRHLLike19]
def apH20: HListFunc[HLLike20, APRHLLike20]
def apH21: HListFunc[HLLike21, APRHLLike21]
def apH22: HListFunc[HLLike22, APRHLLike22]
      }
  