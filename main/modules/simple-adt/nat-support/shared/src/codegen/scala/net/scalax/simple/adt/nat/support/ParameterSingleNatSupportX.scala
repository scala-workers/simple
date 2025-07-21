
    package net.scalax.simple.adt
    package nat
    package support

    
      trait ParameterSingleNatSupport1[
        M[_],
        N1[_],
        HLLike,
        APRHLLike[_, _ <: HLLike] <: HLLike
      ] extends ParameterSimpleSupport1[M, N1, HLLike, APRHLLike] {
        ParameterNatSupport1Self =>

        
      override def typeGen: TypeGen1[M, N1]
    

        override def simpleAppender: SimpleAppender1Positive[M]
        def apH: HListFunc[HLLike, APRHLLike]

        override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport1Self.apH
      }
    

      trait ParameterSingleNatSupport2[
        M[_,_],
        N1[_],N2[_],
        HLLike,
        APRHLLike[_, _ <: HLLike] <: HLLike
      ] extends ParameterSimpleSupport2[M, N1,N2, HLLike,HLLike, APRHLLike,APRHLLike] {
        ParameterNatSupport2Self =>

        
      override def typeGen: TypeGen2[M, N1,N2]
    

        override def simpleAppender: SimpleAppender2Positive[M]
        def apH: HListFunc[HLLike, APRHLLike]

        override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport2Self.apH
override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport2Self.apH
      }
    

      trait ParameterSingleNatSupport3[
        M[_,_,_],
        N1[_],N2[_],N3[_],
        HLLike,
        APRHLLike[_, _ <: HLLike] <: HLLike
      ] extends ParameterSimpleSupport3[M, N1,N2,N3, HLLike,HLLike,HLLike, APRHLLike,APRHLLike,APRHLLike] {
        ParameterNatSupport3Self =>

        
      override def typeGen: TypeGen3[M, N1,N2,N3]
    

        override def simpleAppender: SimpleAppender3Positive[M]
        def apH: HListFunc[HLLike, APRHLLike]

        override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport3Self.apH
override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport3Self.apH
override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport3Self.apH
      }
    

      trait ParameterSingleNatSupport4[
        M[_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],
        HLLike,
        APRHLLike[_, _ <: HLLike] <: HLLike
      ] extends ParameterSimpleSupport4[M, N1,N2,N3,N4, HLLike,HLLike,HLLike,HLLike, APRHLLike,APRHLLike,APRHLLike,APRHLLike] {
        ParameterNatSupport4Self =>

        
      override def typeGen: TypeGen4[M, N1,N2,N3,N4]
    

        override def simpleAppender: SimpleAppender4Positive[M]
        def apH: HListFunc[HLLike, APRHLLike]

        override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport4Self.apH
override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport4Self.apH
override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport4Self.apH
override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport4Self.apH
      }
    

      trait ParameterSingleNatSupport5[
        M[_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],
        HLLike,
        APRHLLike[_, _ <: HLLike] <: HLLike
      ] extends ParameterSimpleSupport5[M, N1,N2,N3,N4,N5, HLLike,HLLike,HLLike,HLLike,HLLike, APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike] {
        ParameterNatSupport5Self =>

        
      override def typeGen: TypeGen5[M, N1,N2,N3,N4,N5]
    

        override def simpleAppender: SimpleAppender5Positive[M]
        def apH: HListFunc[HLLike, APRHLLike]

        override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport5Self.apH
override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport5Self.apH
override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport5Self.apH
override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport5Self.apH
override final def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport5Self.apH
      }
    

      trait ParameterSingleNatSupport6[
        M[_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],
        HLLike,
        APRHLLike[_, _ <: HLLike] <: HLLike
      ] extends ParameterSimpleSupport6[M, N1,N2,N3,N4,N5,N6, HLLike,HLLike,HLLike,HLLike,HLLike,HLLike, APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike] {
        ParameterNatSupport6Self =>

        
      override def typeGen: TypeGen6[M, N1,N2,N3,N4,N5,N6]
    

        override def simpleAppender: SimpleAppender6Positive[M]
        def apH: HListFunc[HLLike, APRHLLike]

        override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport6Self.apH
override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport6Self.apH
override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport6Self.apH
override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport6Self.apH
override final def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport6Self.apH
override final def apH6: HListFunc[HLLike, APRHLLike] = ParameterNatSupport6Self.apH
      }
    

      trait ParameterSingleNatSupport7[
        M[_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],
        HLLike,
        APRHLLike[_, _ <: HLLike] <: HLLike
      ] extends ParameterSimpleSupport7[M, N1,N2,N3,N4,N5,N6,N7, HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike, APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike] {
        ParameterNatSupport7Self =>

        
      override def typeGen: TypeGen7[M, N1,N2,N3,N4,N5,N6,N7]
    

        override def simpleAppender: SimpleAppender7Positive[M]
        def apH: HListFunc[HLLike, APRHLLike]

        override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport7Self.apH
override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport7Self.apH
override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport7Self.apH
override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport7Self.apH
override final def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport7Self.apH
override final def apH6: HListFunc[HLLike, APRHLLike] = ParameterNatSupport7Self.apH
override final def apH7: HListFunc[HLLike, APRHLLike] = ParameterNatSupport7Self.apH
      }
    

      trait ParameterSingleNatSupport8[
        M[_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],
        HLLike,
        APRHLLike[_, _ <: HLLike] <: HLLike
      ] extends ParameterSimpleSupport8[M, N1,N2,N3,N4,N5,N6,N7,N8, HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike, APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike] {
        ParameterNatSupport8Self =>

        
      override def typeGen: TypeGen8[M, N1,N2,N3,N4,N5,N6,N7,N8]
    

        override def simpleAppender: SimpleAppender8Positive[M]
        def apH: HListFunc[HLLike, APRHLLike]

        override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport8Self.apH
override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport8Self.apH
override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport8Self.apH
override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport8Self.apH
override final def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport8Self.apH
override final def apH6: HListFunc[HLLike, APRHLLike] = ParameterNatSupport8Self.apH
override final def apH7: HListFunc[HLLike, APRHLLike] = ParameterNatSupport8Self.apH
override final def apH8: HListFunc[HLLike, APRHLLike] = ParameterNatSupport8Self.apH
      }
    

      trait ParameterSingleNatSupport9[
        M[_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],
        HLLike,
        APRHLLike[_, _ <: HLLike] <: HLLike
      ] extends ParameterSimpleSupport9[M, N1,N2,N3,N4,N5,N6,N7,N8,N9, HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike, APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike] {
        ParameterNatSupport9Self =>

        
      override def typeGen: TypeGen9[M, N1,N2,N3,N4,N5,N6,N7,N8,N9]
    

        override def simpleAppender: SimpleAppender9Positive[M]
        def apH: HListFunc[HLLike, APRHLLike]

        override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport9Self.apH
override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport9Self.apH
override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport9Self.apH
override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport9Self.apH
override final def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport9Self.apH
override final def apH6: HListFunc[HLLike, APRHLLike] = ParameterNatSupport9Self.apH
override final def apH7: HListFunc[HLLike, APRHLLike] = ParameterNatSupport9Self.apH
override final def apH8: HListFunc[HLLike, APRHLLike] = ParameterNatSupport9Self.apH
override final def apH9: HListFunc[HLLike, APRHLLike] = ParameterNatSupport9Self.apH
      }
    

      trait ParameterSingleNatSupport10[
        M[_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],
        HLLike,
        APRHLLike[_, _ <: HLLike] <: HLLike
      ] extends ParameterSimpleSupport10[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10, HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike, APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike] {
        ParameterNatSupport10Self =>

        
      override def typeGen: TypeGen10[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10]
    

        override def simpleAppender: SimpleAppender10Positive[M]
        def apH: HListFunc[HLLike, APRHLLike]

        override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport10Self.apH
override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport10Self.apH
override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport10Self.apH
override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport10Self.apH
override final def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport10Self.apH
override final def apH6: HListFunc[HLLike, APRHLLike] = ParameterNatSupport10Self.apH
override final def apH7: HListFunc[HLLike, APRHLLike] = ParameterNatSupport10Self.apH
override final def apH8: HListFunc[HLLike, APRHLLike] = ParameterNatSupport10Self.apH
override final def apH9: HListFunc[HLLike, APRHLLike] = ParameterNatSupport10Self.apH
override final def apH10: HListFunc[HLLike, APRHLLike] = ParameterNatSupport10Self.apH
      }
    

      trait ParameterSingleNatSupport11[
        M[_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],
        HLLike,
        APRHLLike[_, _ <: HLLike] <: HLLike
      ] extends ParameterSimpleSupport11[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11, HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike, APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike] {
        ParameterNatSupport11Self =>

        
      override def typeGen: TypeGen11[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11]
    

        override def simpleAppender: SimpleAppender11Positive[M]
        def apH: HListFunc[HLLike, APRHLLike]

        override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport11Self.apH
override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport11Self.apH
override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport11Self.apH
override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport11Self.apH
override final def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport11Self.apH
override final def apH6: HListFunc[HLLike, APRHLLike] = ParameterNatSupport11Self.apH
override final def apH7: HListFunc[HLLike, APRHLLike] = ParameterNatSupport11Self.apH
override final def apH8: HListFunc[HLLike, APRHLLike] = ParameterNatSupport11Self.apH
override final def apH9: HListFunc[HLLike, APRHLLike] = ParameterNatSupport11Self.apH
override final def apH10: HListFunc[HLLike, APRHLLike] = ParameterNatSupport11Self.apH
override final def apH11: HListFunc[HLLike, APRHLLike] = ParameterNatSupport11Self.apH
      }
    

      trait ParameterSingleNatSupport12[
        M[_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],
        HLLike,
        APRHLLike[_, _ <: HLLike] <: HLLike
      ] extends ParameterSimpleSupport12[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12, HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike, APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike] {
        ParameterNatSupport12Self =>

        
      override def typeGen: TypeGen12[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12]
    

        override def simpleAppender: SimpleAppender12Positive[M]
        def apH: HListFunc[HLLike, APRHLLike]

        override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport12Self.apH
override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport12Self.apH
override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport12Self.apH
override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport12Self.apH
override final def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport12Self.apH
override final def apH6: HListFunc[HLLike, APRHLLike] = ParameterNatSupport12Self.apH
override final def apH7: HListFunc[HLLike, APRHLLike] = ParameterNatSupport12Self.apH
override final def apH8: HListFunc[HLLike, APRHLLike] = ParameterNatSupport12Self.apH
override final def apH9: HListFunc[HLLike, APRHLLike] = ParameterNatSupport12Self.apH
override final def apH10: HListFunc[HLLike, APRHLLike] = ParameterNatSupport12Self.apH
override final def apH11: HListFunc[HLLike, APRHLLike] = ParameterNatSupport12Self.apH
override final def apH12: HListFunc[HLLike, APRHLLike] = ParameterNatSupport12Self.apH
      }
    

      trait ParameterSingleNatSupport13[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],
        HLLike,
        APRHLLike[_, _ <: HLLike] <: HLLike
      ] extends ParameterSimpleSupport13[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13, HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike, APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike] {
        ParameterNatSupport13Self =>

        
      override def typeGen: TypeGen13[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13]
    

        override def simpleAppender: SimpleAppender13Positive[M]
        def apH: HListFunc[HLLike, APRHLLike]

        override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport13Self.apH
override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport13Self.apH
override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport13Self.apH
override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport13Self.apH
override final def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport13Self.apH
override final def apH6: HListFunc[HLLike, APRHLLike] = ParameterNatSupport13Self.apH
override final def apH7: HListFunc[HLLike, APRHLLike] = ParameterNatSupport13Self.apH
override final def apH8: HListFunc[HLLike, APRHLLike] = ParameterNatSupport13Self.apH
override final def apH9: HListFunc[HLLike, APRHLLike] = ParameterNatSupport13Self.apH
override final def apH10: HListFunc[HLLike, APRHLLike] = ParameterNatSupport13Self.apH
override final def apH11: HListFunc[HLLike, APRHLLike] = ParameterNatSupport13Self.apH
override final def apH12: HListFunc[HLLike, APRHLLike] = ParameterNatSupport13Self.apH
override final def apH13: HListFunc[HLLike, APRHLLike] = ParameterNatSupport13Self.apH
      }
    

      trait ParameterSingleNatSupport14[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],
        HLLike,
        APRHLLike[_, _ <: HLLike] <: HLLike
      ] extends ParameterSimpleSupport14[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14, HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike, APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike] {
        ParameterNatSupport14Self =>

        
      override def typeGen: TypeGen14[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14]
    

        override def simpleAppender: SimpleAppender14Positive[M]
        def apH: HListFunc[HLLike, APRHLLike]

        override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport14Self.apH
override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport14Self.apH
override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport14Self.apH
override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport14Self.apH
override final def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport14Self.apH
override final def apH6: HListFunc[HLLike, APRHLLike] = ParameterNatSupport14Self.apH
override final def apH7: HListFunc[HLLike, APRHLLike] = ParameterNatSupport14Self.apH
override final def apH8: HListFunc[HLLike, APRHLLike] = ParameterNatSupport14Self.apH
override final def apH9: HListFunc[HLLike, APRHLLike] = ParameterNatSupport14Self.apH
override final def apH10: HListFunc[HLLike, APRHLLike] = ParameterNatSupport14Self.apH
override final def apH11: HListFunc[HLLike, APRHLLike] = ParameterNatSupport14Self.apH
override final def apH12: HListFunc[HLLike, APRHLLike] = ParameterNatSupport14Self.apH
override final def apH13: HListFunc[HLLike, APRHLLike] = ParameterNatSupport14Self.apH
override final def apH14: HListFunc[HLLike, APRHLLike] = ParameterNatSupport14Self.apH
      }
    

      trait ParameterSingleNatSupport15[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],
        HLLike,
        APRHLLike[_, _ <: HLLike] <: HLLike
      ] extends ParameterSimpleSupport15[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15, HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike, APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike] {
        ParameterNatSupport15Self =>

        
      override def typeGen: TypeGen15[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15]
    

        override def simpleAppender: SimpleAppender15Positive[M]
        def apH: HListFunc[HLLike, APRHLLike]

        override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport15Self.apH
override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport15Self.apH
override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport15Self.apH
override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport15Self.apH
override final def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport15Self.apH
override final def apH6: HListFunc[HLLike, APRHLLike] = ParameterNatSupport15Self.apH
override final def apH7: HListFunc[HLLike, APRHLLike] = ParameterNatSupport15Self.apH
override final def apH8: HListFunc[HLLike, APRHLLike] = ParameterNatSupport15Self.apH
override final def apH9: HListFunc[HLLike, APRHLLike] = ParameterNatSupport15Self.apH
override final def apH10: HListFunc[HLLike, APRHLLike] = ParameterNatSupport15Self.apH
override final def apH11: HListFunc[HLLike, APRHLLike] = ParameterNatSupport15Self.apH
override final def apH12: HListFunc[HLLike, APRHLLike] = ParameterNatSupport15Self.apH
override final def apH13: HListFunc[HLLike, APRHLLike] = ParameterNatSupport15Self.apH
override final def apH14: HListFunc[HLLike, APRHLLike] = ParameterNatSupport15Self.apH
override final def apH15: HListFunc[HLLike, APRHLLike] = ParameterNatSupport15Self.apH
      }
    

      trait ParameterSingleNatSupport16[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],
        HLLike,
        APRHLLike[_, _ <: HLLike] <: HLLike
      ] extends ParameterSimpleSupport16[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16, HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike, APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike] {
        ParameterNatSupport16Self =>

        
      override def typeGen: TypeGen16[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16]
    

        override def simpleAppender: SimpleAppender16Positive[M]
        def apH: HListFunc[HLLike, APRHLLike]

        override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport16Self.apH
override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport16Self.apH
override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport16Self.apH
override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport16Self.apH
override final def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport16Self.apH
override final def apH6: HListFunc[HLLike, APRHLLike] = ParameterNatSupport16Self.apH
override final def apH7: HListFunc[HLLike, APRHLLike] = ParameterNatSupport16Self.apH
override final def apH8: HListFunc[HLLike, APRHLLike] = ParameterNatSupport16Self.apH
override final def apH9: HListFunc[HLLike, APRHLLike] = ParameterNatSupport16Self.apH
override final def apH10: HListFunc[HLLike, APRHLLike] = ParameterNatSupport16Self.apH
override final def apH11: HListFunc[HLLike, APRHLLike] = ParameterNatSupport16Self.apH
override final def apH12: HListFunc[HLLike, APRHLLike] = ParameterNatSupport16Self.apH
override final def apH13: HListFunc[HLLike, APRHLLike] = ParameterNatSupport16Self.apH
override final def apH14: HListFunc[HLLike, APRHLLike] = ParameterNatSupport16Self.apH
override final def apH15: HListFunc[HLLike, APRHLLike] = ParameterNatSupport16Self.apH
override final def apH16: HListFunc[HLLike, APRHLLike] = ParameterNatSupport16Self.apH
      }
    

      trait ParameterSingleNatSupport17[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],
        HLLike,
        APRHLLike[_, _ <: HLLike] <: HLLike
      ] extends ParameterSimpleSupport17[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17, HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike, APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike] {
        ParameterNatSupport17Self =>

        
      override def typeGen: TypeGen17[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17]
    

        override def simpleAppender: SimpleAppender17Positive[M]
        def apH: HListFunc[HLLike, APRHLLike]

        override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport17Self.apH
override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport17Self.apH
override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport17Self.apH
override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport17Self.apH
override final def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport17Self.apH
override final def apH6: HListFunc[HLLike, APRHLLike] = ParameterNatSupport17Self.apH
override final def apH7: HListFunc[HLLike, APRHLLike] = ParameterNatSupport17Self.apH
override final def apH8: HListFunc[HLLike, APRHLLike] = ParameterNatSupport17Self.apH
override final def apH9: HListFunc[HLLike, APRHLLike] = ParameterNatSupport17Self.apH
override final def apH10: HListFunc[HLLike, APRHLLike] = ParameterNatSupport17Self.apH
override final def apH11: HListFunc[HLLike, APRHLLike] = ParameterNatSupport17Self.apH
override final def apH12: HListFunc[HLLike, APRHLLike] = ParameterNatSupport17Self.apH
override final def apH13: HListFunc[HLLike, APRHLLike] = ParameterNatSupport17Self.apH
override final def apH14: HListFunc[HLLike, APRHLLike] = ParameterNatSupport17Self.apH
override final def apH15: HListFunc[HLLike, APRHLLike] = ParameterNatSupport17Self.apH
override final def apH16: HListFunc[HLLike, APRHLLike] = ParameterNatSupport17Self.apH
override final def apH17: HListFunc[HLLike, APRHLLike] = ParameterNatSupport17Self.apH
      }
    

      trait ParameterSingleNatSupport18[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],
        HLLike,
        APRHLLike[_, _ <: HLLike] <: HLLike
      ] extends ParameterSimpleSupport18[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18, HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike, APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike] {
        ParameterNatSupport18Self =>

        
      override def typeGen: TypeGen18[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18]
    

        override def simpleAppender: SimpleAppender18Positive[M]
        def apH: HListFunc[HLLike, APRHLLike]

        override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport18Self.apH
override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport18Self.apH
override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport18Self.apH
override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport18Self.apH
override final def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport18Self.apH
override final def apH6: HListFunc[HLLike, APRHLLike] = ParameterNatSupport18Self.apH
override final def apH7: HListFunc[HLLike, APRHLLike] = ParameterNatSupport18Self.apH
override final def apH8: HListFunc[HLLike, APRHLLike] = ParameterNatSupport18Self.apH
override final def apH9: HListFunc[HLLike, APRHLLike] = ParameterNatSupport18Self.apH
override final def apH10: HListFunc[HLLike, APRHLLike] = ParameterNatSupport18Self.apH
override final def apH11: HListFunc[HLLike, APRHLLike] = ParameterNatSupport18Self.apH
override final def apH12: HListFunc[HLLike, APRHLLike] = ParameterNatSupport18Self.apH
override final def apH13: HListFunc[HLLike, APRHLLike] = ParameterNatSupport18Self.apH
override final def apH14: HListFunc[HLLike, APRHLLike] = ParameterNatSupport18Self.apH
override final def apH15: HListFunc[HLLike, APRHLLike] = ParameterNatSupport18Self.apH
override final def apH16: HListFunc[HLLike, APRHLLike] = ParameterNatSupport18Self.apH
override final def apH17: HListFunc[HLLike, APRHLLike] = ParameterNatSupport18Self.apH
override final def apH18: HListFunc[HLLike, APRHLLike] = ParameterNatSupport18Self.apH
      }
    

      trait ParameterSingleNatSupport19[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],
        HLLike,
        APRHLLike[_, _ <: HLLike] <: HLLike
      ] extends ParameterSimpleSupport19[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19, HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike, APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike] {
        ParameterNatSupport19Self =>

        
      override def typeGen: TypeGen19[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19]
    

        override def simpleAppender: SimpleAppender19Positive[M]
        def apH: HListFunc[HLLike, APRHLLike]

        override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport19Self.apH
override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport19Self.apH
override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport19Self.apH
override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport19Self.apH
override final def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport19Self.apH
override final def apH6: HListFunc[HLLike, APRHLLike] = ParameterNatSupport19Self.apH
override final def apH7: HListFunc[HLLike, APRHLLike] = ParameterNatSupport19Self.apH
override final def apH8: HListFunc[HLLike, APRHLLike] = ParameterNatSupport19Self.apH
override final def apH9: HListFunc[HLLike, APRHLLike] = ParameterNatSupport19Self.apH
override final def apH10: HListFunc[HLLike, APRHLLike] = ParameterNatSupport19Self.apH
override final def apH11: HListFunc[HLLike, APRHLLike] = ParameterNatSupport19Self.apH
override final def apH12: HListFunc[HLLike, APRHLLike] = ParameterNatSupport19Self.apH
override final def apH13: HListFunc[HLLike, APRHLLike] = ParameterNatSupport19Self.apH
override final def apH14: HListFunc[HLLike, APRHLLike] = ParameterNatSupport19Self.apH
override final def apH15: HListFunc[HLLike, APRHLLike] = ParameterNatSupport19Self.apH
override final def apH16: HListFunc[HLLike, APRHLLike] = ParameterNatSupport19Self.apH
override final def apH17: HListFunc[HLLike, APRHLLike] = ParameterNatSupport19Self.apH
override final def apH18: HListFunc[HLLike, APRHLLike] = ParameterNatSupport19Self.apH
override final def apH19: HListFunc[HLLike, APRHLLike] = ParameterNatSupport19Self.apH
      }
    

      trait ParameterSingleNatSupport20[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],N20[_],
        HLLike,
        APRHLLike[_, _ <: HLLike] <: HLLike
      ] extends ParameterSimpleSupport20[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20, HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike, APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike] {
        ParameterNatSupport20Self =>

        
      override def typeGen: TypeGen20[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20]
    

        override def simpleAppender: SimpleAppender20Positive[M]
        def apH: HListFunc[HLLike, APRHLLike]

        override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport20Self.apH
override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport20Self.apH
override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport20Self.apH
override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport20Self.apH
override final def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport20Self.apH
override final def apH6: HListFunc[HLLike, APRHLLike] = ParameterNatSupport20Self.apH
override final def apH7: HListFunc[HLLike, APRHLLike] = ParameterNatSupport20Self.apH
override final def apH8: HListFunc[HLLike, APRHLLike] = ParameterNatSupport20Self.apH
override final def apH9: HListFunc[HLLike, APRHLLike] = ParameterNatSupport20Self.apH
override final def apH10: HListFunc[HLLike, APRHLLike] = ParameterNatSupport20Self.apH
override final def apH11: HListFunc[HLLike, APRHLLike] = ParameterNatSupport20Self.apH
override final def apH12: HListFunc[HLLike, APRHLLike] = ParameterNatSupport20Self.apH
override final def apH13: HListFunc[HLLike, APRHLLike] = ParameterNatSupport20Self.apH
override final def apH14: HListFunc[HLLike, APRHLLike] = ParameterNatSupport20Self.apH
override final def apH15: HListFunc[HLLike, APRHLLike] = ParameterNatSupport20Self.apH
override final def apH16: HListFunc[HLLike, APRHLLike] = ParameterNatSupport20Self.apH
override final def apH17: HListFunc[HLLike, APRHLLike] = ParameterNatSupport20Self.apH
override final def apH18: HListFunc[HLLike, APRHLLike] = ParameterNatSupport20Self.apH
override final def apH19: HListFunc[HLLike, APRHLLike] = ParameterNatSupport20Self.apH
override final def apH20: HListFunc[HLLike, APRHLLike] = ParameterNatSupport20Self.apH
      }
    

      trait ParameterSingleNatSupport21[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],N20[_],N21[_],
        HLLike,
        APRHLLike[_, _ <: HLLike] <: HLLike
      ] extends ParameterSimpleSupport21[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21, HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike, APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike] {
        ParameterNatSupport21Self =>

        
      override def typeGen: TypeGen21[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21]
    

        override def simpleAppender: SimpleAppender21Positive[M]
        def apH: HListFunc[HLLike, APRHLLike]

        override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport21Self.apH
override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport21Self.apH
override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport21Self.apH
override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport21Self.apH
override final def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport21Self.apH
override final def apH6: HListFunc[HLLike, APRHLLike] = ParameterNatSupport21Self.apH
override final def apH7: HListFunc[HLLike, APRHLLike] = ParameterNatSupport21Self.apH
override final def apH8: HListFunc[HLLike, APRHLLike] = ParameterNatSupport21Self.apH
override final def apH9: HListFunc[HLLike, APRHLLike] = ParameterNatSupport21Self.apH
override final def apH10: HListFunc[HLLike, APRHLLike] = ParameterNatSupport21Self.apH
override final def apH11: HListFunc[HLLike, APRHLLike] = ParameterNatSupport21Self.apH
override final def apH12: HListFunc[HLLike, APRHLLike] = ParameterNatSupport21Self.apH
override final def apH13: HListFunc[HLLike, APRHLLike] = ParameterNatSupport21Self.apH
override final def apH14: HListFunc[HLLike, APRHLLike] = ParameterNatSupport21Self.apH
override final def apH15: HListFunc[HLLike, APRHLLike] = ParameterNatSupport21Self.apH
override final def apH16: HListFunc[HLLike, APRHLLike] = ParameterNatSupport21Self.apH
override final def apH17: HListFunc[HLLike, APRHLLike] = ParameterNatSupport21Self.apH
override final def apH18: HListFunc[HLLike, APRHLLike] = ParameterNatSupport21Self.apH
override final def apH19: HListFunc[HLLike, APRHLLike] = ParameterNatSupport21Self.apH
override final def apH20: HListFunc[HLLike, APRHLLike] = ParameterNatSupport21Self.apH
override final def apH21: HListFunc[HLLike, APRHLLike] = ParameterNatSupport21Self.apH
      }
    

      trait ParameterSingleNatSupport22[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],N20[_],N21[_],N22[_],
        HLLike,
        APRHLLike[_, _ <: HLLike] <: HLLike
      ] extends ParameterSimpleSupport22[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21,N22, HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike,HLLike, APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike,APRHLLike] {
        ParameterNatSupport22Self =>

        
      override def typeGen: TypeGen22[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21,N22]
    

        override def simpleAppender: SimpleAppender22Positive[M]
        def apH: HListFunc[HLLike, APRHLLike]

        override final def apH1: HListFunc[HLLike, APRHLLike] = ParameterNatSupport22Self.apH
override final def apH2: HListFunc[HLLike, APRHLLike] = ParameterNatSupport22Self.apH
override final def apH3: HListFunc[HLLike, APRHLLike] = ParameterNatSupport22Self.apH
override final def apH4: HListFunc[HLLike, APRHLLike] = ParameterNatSupport22Self.apH
override final def apH5: HListFunc[HLLike, APRHLLike] = ParameterNatSupport22Self.apH
override final def apH6: HListFunc[HLLike, APRHLLike] = ParameterNatSupport22Self.apH
override final def apH7: HListFunc[HLLike, APRHLLike] = ParameterNatSupport22Self.apH
override final def apH8: HListFunc[HLLike, APRHLLike] = ParameterNatSupport22Self.apH
override final def apH9: HListFunc[HLLike, APRHLLike] = ParameterNatSupport22Self.apH
override final def apH10: HListFunc[HLLike, APRHLLike] = ParameterNatSupport22Self.apH
override final def apH11: HListFunc[HLLike, APRHLLike] = ParameterNatSupport22Self.apH
override final def apH12: HListFunc[HLLike, APRHLLike] = ParameterNatSupport22Self.apH
override final def apH13: HListFunc[HLLike, APRHLLike] = ParameterNatSupport22Self.apH
override final def apH14: HListFunc[HLLike, APRHLLike] = ParameterNatSupport22Self.apH
override final def apH15: HListFunc[HLLike, APRHLLike] = ParameterNatSupport22Self.apH
override final def apH16: HListFunc[HLLike, APRHLLike] = ParameterNatSupport22Self.apH
override final def apH17: HListFunc[HLLike, APRHLLike] = ParameterNatSupport22Self.apH
override final def apH18: HListFunc[HLLike, APRHLLike] = ParameterNatSupport22Self.apH
override final def apH19: HListFunc[HLLike, APRHLLike] = ParameterNatSupport22Self.apH
override final def apH20: HListFunc[HLLike, APRHLLike] = ParameterNatSupport22Self.apH
override final def apH21: HListFunc[HLLike, APRHLLike] = ParameterNatSupport22Self.apH
override final def apH22: HListFunc[HLLike, APRHLLike] = ParameterNatSupport22Self.apH
      }
    
  