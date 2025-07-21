
    package net.scalax.simple.adt
    package nat
    package support

    
      trait ParameterSimpleSupport1[
        M[_],
        N1[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends ParameterNatSupport1[M, N1, HLLike1, APRHLLike1] {
        ParameterSimpleSupport1Self =>

        
      override final def content: AppenderNatSupport1[M, HLLike1, APRHLLike1] =
        new AppenderNatSupport1[M, HLLike1, APRHLLike1] {
          override def append[I1, H1 <: HLLike1](p1: M[I1], p2: M[H1]): M[APRHLLike1[I1, H1]] = ParameterSimpleSupport1Self
          .simpleAppender
          .append(
      new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
        override def takeHead(m: APRHLLike1[I1, H1]): I1 = ParameterSimpleSupport1Self.apH1.takeHead(m)
        override def takeTail(m: APRHLLike1[I1, H1]): H1 = ParameterSimpleSupport1Self.apH1.takeTail(m)
        override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport1Self.apH1.append(h, t)
      }
      )(p1, p2)
        }
    
        
      def simpleAppender: SimpleAppender1Positive[M]
    
        
      override def typeGen: TypeGen1[M, N1]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
      }

      trait ParameterSimpleSupport2[
        M[_,_],
        N1[_],N2[_],
        HLLike1,HLLike2,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2
      ] extends ParameterNatSupport2[M, N1,N2, HLLike1,HLLike2, APRHLLike1,APRHLLike2] {
        ParameterSimpleSupport2Self =>

        
      override final def content: AppenderNatSupport2[M, HLLike1,HLLike2, APRHLLike1,APRHLLike2] =
        new AppenderNatSupport2[M, HLLike1,HLLike2, APRHLLike1,APRHLLike2] {
          override def append[I1,I2, H1 <: HLLike1,H2 <: HLLike2](p1: M[I1,I2], p2: M[H1,H2]): M[APRHLLike1[I1, H1],APRHLLike2[I2, H2]] = ParameterSimpleSupport2Self
          .simpleAppender
          .append(
      new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
        override def takeHead(m: APRHLLike1[I1, H1]): I1 = ParameterSimpleSupport2Self.apH1.takeHead(m)
        override def takeTail(m: APRHLLike1[I1, H1]): H1 = ParameterSimpleSupport2Self.apH1.takeTail(m)
        override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport2Self.apH1.append(h, t)
      }
      ,
      new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
        override def takeHead(m: APRHLLike2[I2, H2]): I2 = ParameterSimpleSupport2Self.apH2.takeHead(m)
        override def takeTail(m: APRHLLike2[I2, H2]): H2 = ParameterSimpleSupport2Self.apH2.takeTail(m)
        override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport2Self.apH2.append(h, t)
      }
      )(p1, p2)
        }
    
        
      def simpleAppender: SimpleAppender2Positive[M]
    
        
      override def typeGen: TypeGen2[M, N1,N2]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
      }

      trait ParameterSimpleSupport3[
        M[_,_,_],
        N1[_],N2[_],N3[_],
        HLLike1,HLLike2,HLLike3,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3
      ] extends ParameterNatSupport3[M, N1,N2,N3, HLLike1,HLLike2,HLLike3, APRHLLike1,APRHLLike2,APRHLLike3] {
        ParameterSimpleSupport3Self =>

        
      override final def content: AppenderNatSupport3[M, HLLike1,HLLike2,HLLike3, APRHLLike1,APRHLLike2,APRHLLike3] =
        new AppenderNatSupport3[M, HLLike1,HLLike2,HLLike3, APRHLLike1,APRHLLike2,APRHLLike3] {
          override def append[I1,I2,I3, H1 <: HLLike1,H2 <: HLLike2,H3 <: HLLike3](p1: M[I1,I2,I3], p2: M[H1,H2,H3]): M[APRHLLike1[I1, H1],APRHLLike2[I2, H2],APRHLLike3[I3, H3]] = ParameterSimpleSupport3Self
          .simpleAppender
          .append(
      new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
        override def takeHead(m: APRHLLike1[I1, H1]): I1 = ParameterSimpleSupport3Self.apH1.takeHead(m)
        override def takeTail(m: APRHLLike1[I1, H1]): H1 = ParameterSimpleSupport3Self.apH1.takeTail(m)
        override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport3Self.apH1.append(h, t)
      }
      ,
      new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
        override def takeHead(m: APRHLLike2[I2, H2]): I2 = ParameterSimpleSupport3Self.apH2.takeHead(m)
        override def takeTail(m: APRHLLike2[I2, H2]): H2 = ParameterSimpleSupport3Self.apH2.takeTail(m)
        override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport3Self.apH2.append(h, t)
      }
      ,
      new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
        override def takeHead(m: APRHLLike3[I3, H3]): I3 = ParameterSimpleSupport3Self.apH3.takeHead(m)
        override def takeTail(m: APRHLLike3[I3, H3]): H3 = ParameterSimpleSupport3Self.apH3.takeTail(m)
        override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport3Self.apH3.append(h, t)
      }
      )(p1, p2)
        }
    
        
      def simpleAppender: SimpleAppender3Positive[M]
    
        
      override def typeGen: TypeGen3[M, N1,N2,N3]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
      }

      trait ParameterSimpleSupport4[
        M[_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],
        HLLike1,HLLike2,HLLike3,HLLike4,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4
      ] extends ParameterNatSupport4[M, N1,N2,N3,N4, HLLike1,HLLike2,HLLike3,HLLike4, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4] {
        ParameterSimpleSupport4Self =>

        
      override final def content: AppenderNatSupport4[M, HLLike1,HLLike2,HLLike3,HLLike4, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4] =
        new AppenderNatSupport4[M, HLLike1,HLLike2,HLLike3,HLLike4, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4] {
          override def append[I1,I2,I3,I4, H1 <: HLLike1,H2 <: HLLike2,H3 <: HLLike3,H4 <: HLLike4](p1: M[I1,I2,I3,I4], p2: M[H1,H2,H3,H4]): M[APRHLLike1[I1, H1],APRHLLike2[I2, H2],APRHLLike3[I3, H3],APRHLLike4[I4, H4]] = ParameterSimpleSupport4Self
          .simpleAppender
          .append(
      new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
        override def takeHead(m: APRHLLike1[I1, H1]): I1 = ParameterSimpleSupport4Self.apH1.takeHead(m)
        override def takeTail(m: APRHLLike1[I1, H1]): H1 = ParameterSimpleSupport4Self.apH1.takeTail(m)
        override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport4Self.apH1.append(h, t)
      }
      ,
      new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
        override def takeHead(m: APRHLLike2[I2, H2]): I2 = ParameterSimpleSupport4Self.apH2.takeHead(m)
        override def takeTail(m: APRHLLike2[I2, H2]): H2 = ParameterSimpleSupport4Self.apH2.takeTail(m)
        override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport4Self.apH2.append(h, t)
      }
      ,
      new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
        override def takeHead(m: APRHLLike3[I3, H3]): I3 = ParameterSimpleSupport4Self.apH3.takeHead(m)
        override def takeTail(m: APRHLLike3[I3, H3]): H3 = ParameterSimpleSupport4Self.apH3.takeTail(m)
        override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport4Self.apH3.append(h, t)
      }
      ,
      new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
        override def takeHead(m: APRHLLike4[I4, H4]): I4 = ParameterSimpleSupport4Self.apH4.takeHead(m)
        override def takeTail(m: APRHLLike4[I4, H4]): H4 = ParameterSimpleSupport4Self.apH4.takeTail(m)
        override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport4Self.apH4.append(h, t)
      }
      )(p1, p2)
        }
    
        
      def simpleAppender: SimpleAppender4Positive[M]
    
        
      override def typeGen: TypeGen4[M, N1,N2,N3,N4]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
def apH4: HListFunc[HLLike4, APRHLLike4]
      }

      trait ParameterSimpleSupport5[
        M[_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5
      ] extends ParameterNatSupport5[M, N1,N2,N3,N4,N5, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5] {
        ParameterSimpleSupport5Self =>

        
      override final def content: AppenderNatSupport5[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5] =
        new AppenderNatSupport5[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5] {
          override def append[I1,I2,I3,I4,I5, H1 <: HLLike1,H2 <: HLLike2,H3 <: HLLike3,H4 <: HLLike4,H5 <: HLLike5](p1: M[I1,I2,I3,I4,I5], p2: M[H1,H2,H3,H4,H5]): M[APRHLLike1[I1, H1],APRHLLike2[I2, H2],APRHLLike3[I3, H3],APRHLLike4[I4, H4],APRHLLike5[I5, H5]] = ParameterSimpleSupport5Self
          .simpleAppender
          .append(
      new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
        override def takeHead(m: APRHLLike1[I1, H1]): I1 = ParameterSimpleSupport5Self.apH1.takeHead(m)
        override def takeTail(m: APRHLLike1[I1, H1]): H1 = ParameterSimpleSupport5Self.apH1.takeTail(m)
        override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport5Self.apH1.append(h, t)
      }
      ,
      new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
        override def takeHead(m: APRHLLike2[I2, H2]): I2 = ParameterSimpleSupport5Self.apH2.takeHead(m)
        override def takeTail(m: APRHLLike2[I2, H2]): H2 = ParameterSimpleSupport5Self.apH2.takeTail(m)
        override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport5Self.apH2.append(h, t)
      }
      ,
      new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
        override def takeHead(m: APRHLLike3[I3, H3]): I3 = ParameterSimpleSupport5Self.apH3.takeHead(m)
        override def takeTail(m: APRHLLike3[I3, H3]): H3 = ParameterSimpleSupport5Self.apH3.takeTail(m)
        override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport5Self.apH3.append(h, t)
      }
      ,
      new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
        override def takeHead(m: APRHLLike4[I4, H4]): I4 = ParameterSimpleSupport5Self.apH4.takeHead(m)
        override def takeTail(m: APRHLLike4[I4, H4]): H4 = ParameterSimpleSupport5Self.apH4.takeTail(m)
        override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport5Self.apH4.append(h, t)
      }
      ,
      new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
        override def takeHead(m: APRHLLike5[I5, H5]): I5 = ParameterSimpleSupport5Self.apH5.takeHead(m)
        override def takeTail(m: APRHLLike5[I5, H5]): H5 = ParameterSimpleSupport5Self.apH5.takeTail(m)
        override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport5Self.apH5.append(h, t)
      }
      )(p1, p2)
        }
    
        
      def simpleAppender: SimpleAppender5Positive[M]
    
        
      override def typeGen: TypeGen5[M, N1,N2,N3,N4,N5]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
def apH4: HListFunc[HLLike4, APRHLLike4]
def apH5: HListFunc[HLLike5, APRHLLike5]
      }

      trait ParameterSimpleSupport6[
        M[_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6
      ] extends ParameterNatSupport6[M, N1,N2,N3,N4,N5,N6, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6] {
        ParameterSimpleSupport6Self =>

        
      override final def content: AppenderNatSupport6[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6] =
        new AppenderNatSupport6[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6] {
          override def append[I1,I2,I3,I4,I5,I6, H1 <: HLLike1,H2 <: HLLike2,H3 <: HLLike3,H4 <: HLLike4,H5 <: HLLike5,H6 <: HLLike6](p1: M[I1,I2,I3,I4,I5,I6], p2: M[H1,H2,H3,H4,H5,H6]): M[APRHLLike1[I1, H1],APRHLLike2[I2, H2],APRHLLike3[I3, H3],APRHLLike4[I4, H4],APRHLLike5[I5, H5],APRHLLike6[I6, H6]] = ParameterSimpleSupport6Self
          .simpleAppender
          .append(
      new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
        override def takeHead(m: APRHLLike1[I1, H1]): I1 = ParameterSimpleSupport6Self.apH1.takeHead(m)
        override def takeTail(m: APRHLLike1[I1, H1]): H1 = ParameterSimpleSupport6Self.apH1.takeTail(m)
        override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport6Self.apH1.append(h, t)
      }
      ,
      new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
        override def takeHead(m: APRHLLike2[I2, H2]): I2 = ParameterSimpleSupport6Self.apH2.takeHead(m)
        override def takeTail(m: APRHLLike2[I2, H2]): H2 = ParameterSimpleSupport6Self.apH2.takeTail(m)
        override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport6Self.apH2.append(h, t)
      }
      ,
      new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
        override def takeHead(m: APRHLLike3[I3, H3]): I3 = ParameterSimpleSupport6Self.apH3.takeHead(m)
        override def takeTail(m: APRHLLike3[I3, H3]): H3 = ParameterSimpleSupport6Self.apH3.takeTail(m)
        override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport6Self.apH3.append(h, t)
      }
      ,
      new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
        override def takeHead(m: APRHLLike4[I4, H4]): I4 = ParameterSimpleSupport6Self.apH4.takeHead(m)
        override def takeTail(m: APRHLLike4[I4, H4]): H4 = ParameterSimpleSupport6Self.apH4.takeTail(m)
        override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport6Self.apH4.append(h, t)
      }
      ,
      new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
        override def takeHead(m: APRHLLike5[I5, H5]): I5 = ParameterSimpleSupport6Self.apH5.takeHead(m)
        override def takeTail(m: APRHLLike5[I5, H5]): H5 = ParameterSimpleSupport6Self.apH5.takeTail(m)
        override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport6Self.apH5.append(h, t)
      }
      ,
      new ABCFunc[I6, H6, APRHLLike6[I6, H6]] {
        override def takeHead(m: APRHLLike6[I6, H6]): I6 = ParameterSimpleSupport6Self.apH6.takeHead(m)
        override def takeTail(m: APRHLLike6[I6, H6]): H6 = ParameterSimpleSupport6Self.apH6.takeTail(m)
        override def append(h: I6, t: H6): APRHLLike6[I6, H6] = ParameterSimpleSupport6Self.apH6.append(h, t)
      }
      )(p1, p2)
        }
    
        
      def simpleAppender: SimpleAppender6Positive[M]
    
        
      override def typeGen: TypeGen6[M, N1,N2,N3,N4,N5,N6]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
def apH4: HListFunc[HLLike4, APRHLLike4]
def apH5: HListFunc[HLLike5, APRHLLike5]
def apH6: HListFunc[HLLike6, APRHLLike6]
      }

      trait ParameterSimpleSupport7[
        M[_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7
      ] extends ParameterNatSupport7[M, N1,N2,N3,N4,N5,N6,N7, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7] {
        ParameterSimpleSupport7Self =>

        
      override final def content: AppenderNatSupport7[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7] =
        new AppenderNatSupport7[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7] {
          override def append[I1,I2,I3,I4,I5,I6,I7, H1 <: HLLike1,H2 <: HLLike2,H3 <: HLLike3,H4 <: HLLike4,H5 <: HLLike5,H6 <: HLLike6,H7 <: HLLike7](p1: M[I1,I2,I3,I4,I5,I6,I7], p2: M[H1,H2,H3,H4,H5,H6,H7]): M[APRHLLike1[I1, H1],APRHLLike2[I2, H2],APRHLLike3[I3, H3],APRHLLike4[I4, H4],APRHLLike5[I5, H5],APRHLLike6[I6, H6],APRHLLike7[I7, H7]] = ParameterSimpleSupport7Self
          .simpleAppender
          .append(
      new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
        override def takeHead(m: APRHLLike1[I1, H1]): I1 = ParameterSimpleSupport7Self.apH1.takeHead(m)
        override def takeTail(m: APRHLLike1[I1, H1]): H1 = ParameterSimpleSupport7Self.apH1.takeTail(m)
        override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport7Self.apH1.append(h, t)
      }
      ,
      new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
        override def takeHead(m: APRHLLike2[I2, H2]): I2 = ParameterSimpleSupport7Self.apH2.takeHead(m)
        override def takeTail(m: APRHLLike2[I2, H2]): H2 = ParameterSimpleSupport7Self.apH2.takeTail(m)
        override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport7Self.apH2.append(h, t)
      }
      ,
      new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
        override def takeHead(m: APRHLLike3[I3, H3]): I3 = ParameterSimpleSupport7Self.apH3.takeHead(m)
        override def takeTail(m: APRHLLike3[I3, H3]): H3 = ParameterSimpleSupport7Self.apH3.takeTail(m)
        override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport7Self.apH3.append(h, t)
      }
      ,
      new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
        override def takeHead(m: APRHLLike4[I4, H4]): I4 = ParameterSimpleSupport7Self.apH4.takeHead(m)
        override def takeTail(m: APRHLLike4[I4, H4]): H4 = ParameterSimpleSupport7Self.apH4.takeTail(m)
        override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport7Self.apH4.append(h, t)
      }
      ,
      new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
        override def takeHead(m: APRHLLike5[I5, H5]): I5 = ParameterSimpleSupport7Self.apH5.takeHead(m)
        override def takeTail(m: APRHLLike5[I5, H5]): H5 = ParameterSimpleSupport7Self.apH5.takeTail(m)
        override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport7Self.apH5.append(h, t)
      }
      ,
      new ABCFunc[I6, H6, APRHLLike6[I6, H6]] {
        override def takeHead(m: APRHLLike6[I6, H6]): I6 = ParameterSimpleSupport7Self.apH6.takeHead(m)
        override def takeTail(m: APRHLLike6[I6, H6]): H6 = ParameterSimpleSupport7Self.apH6.takeTail(m)
        override def append(h: I6, t: H6): APRHLLike6[I6, H6] = ParameterSimpleSupport7Self.apH6.append(h, t)
      }
      ,
      new ABCFunc[I7, H7, APRHLLike7[I7, H7]] {
        override def takeHead(m: APRHLLike7[I7, H7]): I7 = ParameterSimpleSupport7Self.apH7.takeHead(m)
        override def takeTail(m: APRHLLike7[I7, H7]): H7 = ParameterSimpleSupport7Self.apH7.takeTail(m)
        override def append(h: I7, t: H7): APRHLLike7[I7, H7] = ParameterSimpleSupport7Self.apH7.append(h, t)
      }
      )(p1, p2)
        }
    
        
      def simpleAppender: SimpleAppender7Positive[M]
    
        
      override def typeGen: TypeGen7[M, N1,N2,N3,N4,N5,N6,N7]
    
        def apH1: HListFunc[HLLike1, APRHLLike1]
def apH2: HListFunc[HLLike2, APRHLLike2]
def apH3: HListFunc[HLLike3, APRHLLike3]
def apH4: HListFunc[HLLike4, APRHLLike4]
def apH5: HListFunc[HLLike5, APRHLLike5]
def apH6: HListFunc[HLLike6, APRHLLike6]
def apH7: HListFunc[HLLike7, APRHLLike7]
      }

      trait ParameterSimpleSupport8[
        M[_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8
      ] extends ParameterNatSupport8[M, N1,N2,N3,N4,N5,N6,N7,N8, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8] {
        ParameterSimpleSupport8Self =>

        
      override final def content: AppenderNatSupport8[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8] =
        new AppenderNatSupport8[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8] {
          override def append[I1,I2,I3,I4,I5,I6,I7,I8, H1 <: HLLike1,H2 <: HLLike2,H3 <: HLLike3,H4 <: HLLike4,H5 <: HLLike5,H6 <: HLLike6,H7 <: HLLike7,H8 <: HLLike8](p1: M[I1,I2,I3,I4,I5,I6,I7,I8], p2: M[H1,H2,H3,H4,H5,H6,H7,H8]): M[APRHLLike1[I1, H1],APRHLLike2[I2, H2],APRHLLike3[I3, H3],APRHLLike4[I4, H4],APRHLLike5[I5, H5],APRHLLike6[I6, H6],APRHLLike7[I7, H7],APRHLLike8[I8, H8]] = ParameterSimpleSupport8Self
          .simpleAppender
          .append(
      new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
        override def takeHead(m: APRHLLike1[I1, H1]): I1 = ParameterSimpleSupport8Self.apH1.takeHead(m)
        override def takeTail(m: APRHLLike1[I1, H1]): H1 = ParameterSimpleSupport8Self.apH1.takeTail(m)
        override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport8Self.apH1.append(h, t)
      }
      ,
      new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
        override def takeHead(m: APRHLLike2[I2, H2]): I2 = ParameterSimpleSupport8Self.apH2.takeHead(m)
        override def takeTail(m: APRHLLike2[I2, H2]): H2 = ParameterSimpleSupport8Self.apH2.takeTail(m)
        override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport8Self.apH2.append(h, t)
      }
      ,
      new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
        override def takeHead(m: APRHLLike3[I3, H3]): I3 = ParameterSimpleSupport8Self.apH3.takeHead(m)
        override def takeTail(m: APRHLLike3[I3, H3]): H3 = ParameterSimpleSupport8Self.apH3.takeTail(m)
        override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport8Self.apH3.append(h, t)
      }
      ,
      new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
        override def takeHead(m: APRHLLike4[I4, H4]): I4 = ParameterSimpleSupport8Self.apH4.takeHead(m)
        override def takeTail(m: APRHLLike4[I4, H4]): H4 = ParameterSimpleSupport8Self.apH4.takeTail(m)
        override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport8Self.apH4.append(h, t)
      }
      ,
      new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
        override def takeHead(m: APRHLLike5[I5, H5]): I5 = ParameterSimpleSupport8Self.apH5.takeHead(m)
        override def takeTail(m: APRHLLike5[I5, H5]): H5 = ParameterSimpleSupport8Self.apH5.takeTail(m)
        override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport8Self.apH5.append(h, t)
      }
      ,
      new ABCFunc[I6, H6, APRHLLike6[I6, H6]] {
        override def takeHead(m: APRHLLike6[I6, H6]): I6 = ParameterSimpleSupport8Self.apH6.takeHead(m)
        override def takeTail(m: APRHLLike6[I6, H6]): H6 = ParameterSimpleSupport8Self.apH6.takeTail(m)
        override def append(h: I6, t: H6): APRHLLike6[I6, H6] = ParameterSimpleSupport8Self.apH6.append(h, t)
      }
      ,
      new ABCFunc[I7, H7, APRHLLike7[I7, H7]] {
        override def takeHead(m: APRHLLike7[I7, H7]): I7 = ParameterSimpleSupport8Self.apH7.takeHead(m)
        override def takeTail(m: APRHLLike7[I7, H7]): H7 = ParameterSimpleSupport8Self.apH7.takeTail(m)
        override def append(h: I7, t: H7): APRHLLike7[I7, H7] = ParameterSimpleSupport8Self.apH7.append(h, t)
      }
      ,
      new ABCFunc[I8, H8, APRHLLike8[I8, H8]] {
        override def takeHead(m: APRHLLike8[I8, H8]): I8 = ParameterSimpleSupport8Self.apH8.takeHead(m)
        override def takeTail(m: APRHLLike8[I8, H8]): H8 = ParameterSimpleSupport8Self.apH8.takeTail(m)
        override def append(h: I8, t: H8): APRHLLike8[I8, H8] = ParameterSimpleSupport8Self.apH8.append(h, t)
      }
      )(p1, p2)
        }
    
        
      def simpleAppender: SimpleAppender8Positive[M]
    
        
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

      trait ParameterSimpleSupport9[
        M[_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9
      ] extends ParameterNatSupport9[M, N1,N2,N3,N4,N5,N6,N7,N8,N9, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9] {
        ParameterSimpleSupport9Self =>

        
      override final def content: AppenderNatSupport9[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9] =
        new AppenderNatSupport9[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9] {
          override def append[I1,I2,I3,I4,I5,I6,I7,I8,I9, H1 <: HLLike1,H2 <: HLLike2,H3 <: HLLike3,H4 <: HLLike4,H5 <: HLLike5,H6 <: HLLike6,H7 <: HLLike7,H8 <: HLLike8,H9 <: HLLike9](p1: M[I1,I2,I3,I4,I5,I6,I7,I8,I9], p2: M[H1,H2,H3,H4,H5,H6,H7,H8,H9]): M[APRHLLike1[I1, H1],APRHLLike2[I2, H2],APRHLLike3[I3, H3],APRHLLike4[I4, H4],APRHLLike5[I5, H5],APRHLLike6[I6, H6],APRHLLike7[I7, H7],APRHLLike8[I8, H8],APRHLLike9[I9, H9]] = ParameterSimpleSupport9Self
          .simpleAppender
          .append(
      new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
        override def takeHead(m: APRHLLike1[I1, H1]): I1 = ParameterSimpleSupport9Self.apH1.takeHead(m)
        override def takeTail(m: APRHLLike1[I1, H1]): H1 = ParameterSimpleSupport9Self.apH1.takeTail(m)
        override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport9Self.apH1.append(h, t)
      }
      ,
      new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
        override def takeHead(m: APRHLLike2[I2, H2]): I2 = ParameterSimpleSupport9Self.apH2.takeHead(m)
        override def takeTail(m: APRHLLike2[I2, H2]): H2 = ParameterSimpleSupport9Self.apH2.takeTail(m)
        override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport9Self.apH2.append(h, t)
      }
      ,
      new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
        override def takeHead(m: APRHLLike3[I3, H3]): I3 = ParameterSimpleSupport9Self.apH3.takeHead(m)
        override def takeTail(m: APRHLLike3[I3, H3]): H3 = ParameterSimpleSupport9Self.apH3.takeTail(m)
        override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport9Self.apH3.append(h, t)
      }
      ,
      new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
        override def takeHead(m: APRHLLike4[I4, H4]): I4 = ParameterSimpleSupport9Self.apH4.takeHead(m)
        override def takeTail(m: APRHLLike4[I4, H4]): H4 = ParameterSimpleSupport9Self.apH4.takeTail(m)
        override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport9Self.apH4.append(h, t)
      }
      ,
      new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
        override def takeHead(m: APRHLLike5[I5, H5]): I5 = ParameterSimpleSupport9Self.apH5.takeHead(m)
        override def takeTail(m: APRHLLike5[I5, H5]): H5 = ParameterSimpleSupport9Self.apH5.takeTail(m)
        override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport9Self.apH5.append(h, t)
      }
      ,
      new ABCFunc[I6, H6, APRHLLike6[I6, H6]] {
        override def takeHead(m: APRHLLike6[I6, H6]): I6 = ParameterSimpleSupport9Self.apH6.takeHead(m)
        override def takeTail(m: APRHLLike6[I6, H6]): H6 = ParameterSimpleSupport9Self.apH6.takeTail(m)
        override def append(h: I6, t: H6): APRHLLike6[I6, H6] = ParameterSimpleSupport9Self.apH6.append(h, t)
      }
      ,
      new ABCFunc[I7, H7, APRHLLike7[I7, H7]] {
        override def takeHead(m: APRHLLike7[I7, H7]): I7 = ParameterSimpleSupport9Self.apH7.takeHead(m)
        override def takeTail(m: APRHLLike7[I7, H7]): H7 = ParameterSimpleSupport9Self.apH7.takeTail(m)
        override def append(h: I7, t: H7): APRHLLike7[I7, H7] = ParameterSimpleSupport9Self.apH7.append(h, t)
      }
      ,
      new ABCFunc[I8, H8, APRHLLike8[I8, H8]] {
        override def takeHead(m: APRHLLike8[I8, H8]): I8 = ParameterSimpleSupport9Self.apH8.takeHead(m)
        override def takeTail(m: APRHLLike8[I8, H8]): H8 = ParameterSimpleSupport9Self.apH8.takeTail(m)
        override def append(h: I8, t: H8): APRHLLike8[I8, H8] = ParameterSimpleSupport9Self.apH8.append(h, t)
      }
      ,
      new ABCFunc[I9, H9, APRHLLike9[I9, H9]] {
        override def takeHead(m: APRHLLike9[I9, H9]): I9 = ParameterSimpleSupport9Self.apH9.takeHead(m)
        override def takeTail(m: APRHLLike9[I9, H9]): H9 = ParameterSimpleSupport9Self.apH9.takeTail(m)
        override def append(h: I9, t: H9): APRHLLike9[I9, H9] = ParameterSimpleSupport9Self.apH9.append(h, t)
      }
      )(p1, p2)
        }
    
        
      def simpleAppender: SimpleAppender9Positive[M]
    
        
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

      trait ParameterSimpleSupport10[
        M[_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10
      ] extends ParameterNatSupport10[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10] {
        ParameterSimpleSupport10Self =>

        
      override final def content: AppenderNatSupport10[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10] =
        new AppenderNatSupport10[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10] {
          override def append[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10, H1 <: HLLike1,H2 <: HLLike2,H3 <: HLLike3,H4 <: HLLike4,H5 <: HLLike5,H6 <: HLLike6,H7 <: HLLike7,H8 <: HLLike8,H9 <: HLLike9,H10 <: HLLike10](p1: M[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10], p2: M[H1,H2,H3,H4,H5,H6,H7,H8,H9,H10]): M[APRHLLike1[I1, H1],APRHLLike2[I2, H2],APRHLLike3[I3, H3],APRHLLike4[I4, H4],APRHLLike5[I5, H5],APRHLLike6[I6, H6],APRHLLike7[I7, H7],APRHLLike8[I8, H8],APRHLLike9[I9, H9],APRHLLike10[I10, H10]] = ParameterSimpleSupport10Self
          .simpleAppender
          .append(
      new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
        override def takeHead(m: APRHLLike1[I1, H1]): I1 = ParameterSimpleSupport10Self.apH1.takeHead(m)
        override def takeTail(m: APRHLLike1[I1, H1]): H1 = ParameterSimpleSupport10Self.apH1.takeTail(m)
        override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport10Self.apH1.append(h, t)
      }
      ,
      new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
        override def takeHead(m: APRHLLike2[I2, H2]): I2 = ParameterSimpleSupport10Self.apH2.takeHead(m)
        override def takeTail(m: APRHLLike2[I2, H2]): H2 = ParameterSimpleSupport10Self.apH2.takeTail(m)
        override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport10Self.apH2.append(h, t)
      }
      ,
      new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
        override def takeHead(m: APRHLLike3[I3, H3]): I3 = ParameterSimpleSupport10Self.apH3.takeHead(m)
        override def takeTail(m: APRHLLike3[I3, H3]): H3 = ParameterSimpleSupport10Self.apH3.takeTail(m)
        override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport10Self.apH3.append(h, t)
      }
      ,
      new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
        override def takeHead(m: APRHLLike4[I4, H4]): I4 = ParameterSimpleSupport10Self.apH4.takeHead(m)
        override def takeTail(m: APRHLLike4[I4, H4]): H4 = ParameterSimpleSupport10Self.apH4.takeTail(m)
        override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport10Self.apH4.append(h, t)
      }
      ,
      new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
        override def takeHead(m: APRHLLike5[I5, H5]): I5 = ParameterSimpleSupport10Self.apH5.takeHead(m)
        override def takeTail(m: APRHLLike5[I5, H5]): H5 = ParameterSimpleSupport10Self.apH5.takeTail(m)
        override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport10Self.apH5.append(h, t)
      }
      ,
      new ABCFunc[I6, H6, APRHLLike6[I6, H6]] {
        override def takeHead(m: APRHLLike6[I6, H6]): I6 = ParameterSimpleSupport10Self.apH6.takeHead(m)
        override def takeTail(m: APRHLLike6[I6, H6]): H6 = ParameterSimpleSupport10Self.apH6.takeTail(m)
        override def append(h: I6, t: H6): APRHLLike6[I6, H6] = ParameterSimpleSupport10Self.apH6.append(h, t)
      }
      ,
      new ABCFunc[I7, H7, APRHLLike7[I7, H7]] {
        override def takeHead(m: APRHLLike7[I7, H7]): I7 = ParameterSimpleSupport10Self.apH7.takeHead(m)
        override def takeTail(m: APRHLLike7[I7, H7]): H7 = ParameterSimpleSupport10Self.apH7.takeTail(m)
        override def append(h: I7, t: H7): APRHLLike7[I7, H7] = ParameterSimpleSupport10Self.apH7.append(h, t)
      }
      ,
      new ABCFunc[I8, H8, APRHLLike8[I8, H8]] {
        override def takeHead(m: APRHLLike8[I8, H8]): I8 = ParameterSimpleSupport10Self.apH8.takeHead(m)
        override def takeTail(m: APRHLLike8[I8, H8]): H8 = ParameterSimpleSupport10Self.apH8.takeTail(m)
        override def append(h: I8, t: H8): APRHLLike8[I8, H8] = ParameterSimpleSupport10Self.apH8.append(h, t)
      }
      ,
      new ABCFunc[I9, H9, APRHLLike9[I9, H9]] {
        override def takeHead(m: APRHLLike9[I9, H9]): I9 = ParameterSimpleSupport10Self.apH9.takeHead(m)
        override def takeTail(m: APRHLLike9[I9, H9]): H9 = ParameterSimpleSupport10Self.apH9.takeTail(m)
        override def append(h: I9, t: H9): APRHLLike9[I9, H9] = ParameterSimpleSupport10Self.apH9.append(h, t)
      }
      ,
      new ABCFunc[I10, H10, APRHLLike10[I10, H10]] {
        override def takeHead(m: APRHLLike10[I10, H10]): I10 = ParameterSimpleSupport10Self.apH10.takeHead(m)
        override def takeTail(m: APRHLLike10[I10, H10]): H10 = ParameterSimpleSupport10Self.apH10.takeTail(m)
        override def append(h: I10, t: H10): APRHLLike10[I10, H10] = ParameterSimpleSupport10Self.apH10.append(h, t)
      }
      )(p1, p2)
        }
    
        
      def simpleAppender: SimpleAppender10Positive[M]
    
        
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

      trait ParameterSimpleSupport11[
        M[_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11
      ] extends ParameterNatSupport11[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11] {
        ParameterSimpleSupport11Self =>

        
      override final def content: AppenderNatSupport11[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11] =
        new AppenderNatSupport11[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11] {
          override def append[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11, H1 <: HLLike1,H2 <: HLLike2,H3 <: HLLike3,H4 <: HLLike4,H5 <: HLLike5,H6 <: HLLike6,H7 <: HLLike7,H8 <: HLLike8,H9 <: HLLike9,H10 <: HLLike10,H11 <: HLLike11](p1: M[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11], p2: M[H1,H2,H3,H4,H5,H6,H7,H8,H9,H10,H11]): M[APRHLLike1[I1, H1],APRHLLike2[I2, H2],APRHLLike3[I3, H3],APRHLLike4[I4, H4],APRHLLike5[I5, H5],APRHLLike6[I6, H6],APRHLLike7[I7, H7],APRHLLike8[I8, H8],APRHLLike9[I9, H9],APRHLLike10[I10, H10],APRHLLike11[I11, H11]] = ParameterSimpleSupport11Self
          .simpleAppender
          .append(
      new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
        override def takeHead(m: APRHLLike1[I1, H1]): I1 = ParameterSimpleSupport11Self.apH1.takeHead(m)
        override def takeTail(m: APRHLLike1[I1, H1]): H1 = ParameterSimpleSupport11Self.apH1.takeTail(m)
        override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport11Self.apH1.append(h, t)
      }
      ,
      new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
        override def takeHead(m: APRHLLike2[I2, H2]): I2 = ParameterSimpleSupport11Self.apH2.takeHead(m)
        override def takeTail(m: APRHLLike2[I2, H2]): H2 = ParameterSimpleSupport11Self.apH2.takeTail(m)
        override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport11Self.apH2.append(h, t)
      }
      ,
      new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
        override def takeHead(m: APRHLLike3[I3, H3]): I3 = ParameterSimpleSupport11Self.apH3.takeHead(m)
        override def takeTail(m: APRHLLike3[I3, H3]): H3 = ParameterSimpleSupport11Self.apH3.takeTail(m)
        override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport11Self.apH3.append(h, t)
      }
      ,
      new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
        override def takeHead(m: APRHLLike4[I4, H4]): I4 = ParameterSimpleSupport11Self.apH4.takeHead(m)
        override def takeTail(m: APRHLLike4[I4, H4]): H4 = ParameterSimpleSupport11Self.apH4.takeTail(m)
        override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport11Self.apH4.append(h, t)
      }
      ,
      new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
        override def takeHead(m: APRHLLike5[I5, H5]): I5 = ParameterSimpleSupport11Self.apH5.takeHead(m)
        override def takeTail(m: APRHLLike5[I5, H5]): H5 = ParameterSimpleSupport11Self.apH5.takeTail(m)
        override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport11Self.apH5.append(h, t)
      }
      ,
      new ABCFunc[I6, H6, APRHLLike6[I6, H6]] {
        override def takeHead(m: APRHLLike6[I6, H6]): I6 = ParameterSimpleSupport11Self.apH6.takeHead(m)
        override def takeTail(m: APRHLLike6[I6, H6]): H6 = ParameterSimpleSupport11Self.apH6.takeTail(m)
        override def append(h: I6, t: H6): APRHLLike6[I6, H6] = ParameterSimpleSupport11Self.apH6.append(h, t)
      }
      ,
      new ABCFunc[I7, H7, APRHLLike7[I7, H7]] {
        override def takeHead(m: APRHLLike7[I7, H7]): I7 = ParameterSimpleSupport11Self.apH7.takeHead(m)
        override def takeTail(m: APRHLLike7[I7, H7]): H7 = ParameterSimpleSupport11Self.apH7.takeTail(m)
        override def append(h: I7, t: H7): APRHLLike7[I7, H7] = ParameterSimpleSupport11Self.apH7.append(h, t)
      }
      ,
      new ABCFunc[I8, H8, APRHLLike8[I8, H8]] {
        override def takeHead(m: APRHLLike8[I8, H8]): I8 = ParameterSimpleSupport11Self.apH8.takeHead(m)
        override def takeTail(m: APRHLLike8[I8, H8]): H8 = ParameterSimpleSupport11Self.apH8.takeTail(m)
        override def append(h: I8, t: H8): APRHLLike8[I8, H8] = ParameterSimpleSupport11Self.apH8.append(h, t)
      }
      ,
      new ABCFunc[I9, H9, APRHLLike9[I9, H9]] {
        override def takeHead(m: APRHLLike9[I9, H9]): I9 = ParameterSimpleSupport11Self.apH9.takeHead(m)
        override def takeTail(m: APRHLLike9[I9, H9]): H9 = ParameterSimpleSupport11Self.apH9.takeTail(m)
        override def append(h: I9, t: H9): APRHLLike9[I9, H9] = ParameterSimpleSupport11Self.apH9.append(h, t)
      }
      ,
      new ABCFunc[I10, H10, APRHLLike10[I10, H10]] {
        override def takeHead(m: APRHLLike10[I10, H10]): I10 = ParameterSimpleSupport11Self.apH10.takeHead(m)
        override def takeTail(m: APRHLLike10[I10, H10]): H10 = ParameterSimpleSupport11Self.apH10.takeTail(m)
        override def append(h: I10, t: H10): APRHLLike10[I10, H10] = ParameterSimpleSupport11Self.apH10.append(h, t)
      }
      ,
      new ABCFunc[I11, H11, APRHLLike11[I11, H11]] {
        override def takeHead(m: APRHLLike11[I11, H11]): I11 = ParameterSimpleSupport11Self.apH11.takeHead(m)
        override def takeTail(m: APRHLLike11[I11, H11]): H11 = ParameterSimpleSupport11Self.apH11.takeTail(m)
        override def append(h: I11, t: H11): APRHLLike11[I11, H11] = ParameterSimpleSupport11Self.apH11.append(h, t)
      }
      )(p1, p2)
        }
    
        
      def simpleAppender: SimpleAppender11Positive[M]
    
        
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

      trait ParameterSimpleSupport12[
        M[_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12
      ] extends ParameterNatSupport12[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12] {
        ParameterSimpleSupport12Self =>

        
      override final def content: AppenderNatSupport12[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12] =
        new AppenderNatSupport12[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12] {
          override def append[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12, H1 <: HLLike1,H2 <: HLLike2,H3 <: HLLike3,H4 <: HLLike4,H5 <: HLLike5,H6 <: HLLike6,H7 <: HLLike7,H8 <: HLLike8,H9 <: HLLike9,H10 <: HLLike10,H11 <: HLLike11,H12 <: HLLike12](p1: M[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12], p2: M[H1,H2,H3,H4,H5,H6,H7,H8,H9,H10,H11,H12]): M[APRHLLike1[I1, H1],APRHLLike2[I2, H2],APRHLLike3[I3, H3],APRHLLike4[I4, H4],APRHLLike5[I5, H5],APRHLLike6[I6, H6],APRHLLike7[I7, H7],APRHLLike8[I8, H8],APRHLLike9[I9, H9],APRHLLike10[I10, H10],APRHLLike11[I11, H11],APRHLLike12[I12, H12]] = ParameterSimpleSupport12Self
          .simpleAppender
          .append(
      new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
        override def takeHead(m: APRHLLike1[I1, H1]): I1 = ParameterSimpleSupport12Self.apH1.takeHead(m)
        override def takeTail(m: APRHLLike1[I1, H1]): H1 = ParameterSimpleSupport12Self.apH1.takeTail(m)
        override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport12Self.apH1.append(h, t)
      }
      ,
      new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
        override def takeHead(m: APRHLLike2[I2, H2]): I2 = ParameterSimpleSupport12Self.apH2.takeHead(m)
        override def takeTail(m: APRHLLike2[I2, H2]): H2 = ParameterSimpleSupport12Self.apH2.takeTail(m)
        override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport12Self.apH2.append(h, t)
      }
      ,
      new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
        override def takeHead(m: APRHLLike3[I3, H3]): I3 = ParameterSimpleSupport12Self.apH3.takeHead(m)
        override def takeTail(m: APRHLLike3[I3, H3]): H3 = ParameterSimpleSupport12Self.apH3.takeTail(m)
        override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport12Self.apH3.append(h, t)
      }
      ,
      new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
        override def takeHead(m: APRHLLike4[I4, H4]): I4 = ParameterSimpleSupport12Self.apH4.takeHead(m)
        override def takeTail(m: APRHLLike4[I4, H4]): H4 = ParameterSimpleSupport12Self.apH4.takeTail(m)
        override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport12Self.apH4.append(h, t)
      }
      ,
      new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
        override def takeHead(m: APRHLLike5[I5, H5]): I5 = ParameterSimpleSupport12Self.apH5.takeHead(m)
        override def takeTail(m: APRHLLike5[I5, H5]): H5 = ParameterSimpleSupport12Self.apH5.takeTail(m)
        override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport12Self.apH5.append(h, t)
      }
      ,
      new ABCFunc[I6, H6, APRHLLike6[I6, H6]] {
        override def takeHead(m: APRHLLike6[I6, H6]): I6 = ParameterSimpleSupport12Self.apH6.takeHead(m)
        override def takeTail(m: APRHLLike6[I6, H6]): H6 = ParameterSimpleSupport12Self.apH6.takeTail(m)
        override def append(h: I6, t: H6): APRHLLike6[I6, H6] = ParameterSimpleSupport12Self.apH6.append(h, t)
      }
      ,
      new ABCFunc[I7, H7, APRHLLike7[I7, H7]] {
        override def takeHead(m: APRHLLike7[I7, H7]): I7 = ParameterSimpleSupport12Self.apH7.takeHead(m)
        override def takeTail(m: APRHLLike7[I7, H7]): H7 = ParameterSimpleSupport12Self.apH7.takeTail(m)
        override def append(h: I7, t: H7): APRHLLike7[I7, H7] = ParameterSimpleSupport12Self.apH7.append(h, t)
      }
      ,
      new ABCFunc[I8, H8, APRHLLike8[I8, H8]] {
        override def takeHead(m: APRHLLike8[I8, H8]): I8 = ParameterSimpleSupport12Self.apH8.takeHead(m)
        override def takeTail(m: APRHLLike8[I8, H8]): H8 = ParameterSimpleSupport12Self.apH8.takeTail(m)
        override def append(h: I8, t: H8): APRHLLike8[I8, H8] = ParameterSimpleSupport12Self.apH8.append(h, t)
      }
      ,
      new ABCFunc[I9, H9, APRHLLike9[I9, H9]] {
        override def takeHead(m: APRHLLike9[I9, H9]): I9 = ParameterSimpleSupport12Self.apH9.takeHead(m)
        override def takeTail(m: APRHLLike9[I9, H9]): H9 = ParameterSimpleSupport12Self.apH9.takeTail(m)
        override def append(h: I9, t: H9): APRHLLike9[I9, H9] = ParameterSimpleSupport12Self.apH9.append(h, t)
      }
      ,
      new ABCFunc[I10, H10, APRHLLike10[I10, H10]] {
        override def takeHead(m: APRHLLike10[I10, H10]): I10 = ParameterSimpleSupport12Self.apH10.takeHead(m)
        override def takeTail(m: APRHLLike10[I10, H10]): H10 = ParameterSimpleSupport12Self.apH10.takeTail(m)
        override def append(h: I10, t: H10): APRHLLike10[I10, H10] = ParameterSimpleSupport12Self.apH10.append(h, t)
      }
      ,
      new ABCFunc[I11, H11, APRHLLike11[I11, H11]] {
        override def takeHead(m: APRHLLike11[I11, H11]): I11 = ParameterSimpleSupport12Self.apH11.takeHead(m)
        override def takeTail(m: APRHLLike11[I11, H11]): H11 = ParameterSimpleSupport12Self.apH11.takeTail(m)
        override def append(h: I11, t: H11): APRHLLike11[I11, H11] = ParameterSimpleSupport12Self.apH11.append(h, t)
      }
      ,
      new ABCFunc[I12, H12, APRHLLike12[I12, H12]] {
        override def takeHead(m: APRHLLike12[I12, H12]): I12 = ParameterSimpleSupport12Self.apH12.takeHead(m)
        override def takeTail(m: APRHLLike12[I12, H12]): H12 = ParameterSimpleSupport12Self.apH12.takeTail(m)
        override def append(h: I12, t: H12): APRHLLike12[I12, H12] = ParameterSimpleSupport12Self.apH12.append(h, t)
      }
      )(p1, p2)
        }
    
        
      def simpleAppender: SimpleAppender12Positive[M]
    
        
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

      trait ParameterSimpleSupport13[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13
      ] extends ParameterNatSupport13[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13] {
        ParameterSimpleSupport13Self =>

        
      override final def content: AppenderNatSupport13[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13] =
        new AppenderNatSupport13[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13] {
          override def append[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12,I13, H1 <: HLLike1,H2 <: HLLike2,H3 <: HLLike3,H4 <: HLLike4,H5 <: HLLike5,H6 <: HLLike6,H7 <: HLLike7,H8 <: HLLike8,H9 <: HLLike9,H10 <: HLLike10,H11 <: HLLike11,H12 <: HLLike12,H13 <: HLLike13](p1: M[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12,I13], p2: M[H1,H2,H3,H4,H5,H6,H7,H8,H9,H10,H11,H12,H13]): M[APRHLLike1[I1, H1],APRHLLike2[I2, H2],APRHLLike3[I3, H3],APRHLLike4[I4, H4],APRHLLike5[I5, H5],APRHLLike6[I6, H6],APRHLLike7[I7, H7],APRHLLike8[I8, H8],APRHLLike9[I9, H9],APRHLLike10[I10, H10],APRHLLike11[I11, H11],APRHLLike12[I12, H12],APRHLLike13[I13, H13]] = ParameterSimpleSupport13Self
          .simpleAppender
          .append(
      new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
        override def takeHead(m: APRHLLike1[I1, H1]): I1 = ParameterSimpleSupport13Self.apH1.takeHead(m)
        override def takeTail(m: APRHLLike1[I1, H1]): H1 = ParameterSimpleSupport13Self.apH1.takeTail(m)
        override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport13Self.apH1.append(h, t)
      }
      ,
      new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
        override def takeHead(m: APRHLLike2[I2, H2]): I2 = ParameterSimpleSupport13Self.apH2.takeHead(m)
        override def takeTail(m: APRHLLike2[I2, H2]): H2 = ParameterSimpleSupport13Self.apH2.takeTail(m)
        override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport13Self.apH2.append(h, t)
      }
      ,
      new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
        override def takeHead(m: APRHLLike3[I3, H3]): I3 = ParameterSimpleSupport13Self.apH3.takeHead(m)
        override def takeTail(m: APRHLLike3[I3, H3]): H3 = ParameterSimpleSupport13Self.apH3.takeTail(m)
        override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport13Self.apH3.append(h, t)
      }
      ,
      new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
        override def takeHead(m: APRHLLike4[I4, H4]): I4 = ParameterSimpleSupport13Self.apH4.takeHead(m)
        override def takeTail(m: APRHLLike4[I4, H4]): H4 = ParameterSimpleSupport13Self.apH4.takeTail(m)
        override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport13Self.apH4.append(h, t)
      }
      ,
      new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
        override def takeHead(m: APRHLLike5[I5, H5]): I5 = ParameterSimpleSupport13Self.apH5.takeHead(m)
        override def takeTail(m: APRHLLike5[I5, H5]): H5 = ParameterSimpleSupport13Self.apH5.takeTail(m)
        override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport13Self.apH5.append(h, t)
      }
      ,
      new ABCFunc[I6, H6, APRHLLike6[I6, H6]] {
        override def takeHead(m: APRHLLike6[I6, H6]): I6 = ParameterSimpleSupport13Self.apH6.takeHead(m)
        override def takeTail(m: APRHLLike6[I6, H6]): H6 = ParameterSimpleSupport13Self.apH6.takeTail(m)
        override def append(h: I6, t: H6): APRHLLike6[I6, H6] = ParameterSimpleSupport13Self.apH6.append(h, t)
      }
      ,
      new ABCFunc[I7, H7, APRHLLike7[I7, H7]] {
        override def takeHead(m: APRHLLike7[I7, H7]): I7 = ParameterSimpleSupport13Self.apH7.takeHead(m)
        override def takeTail(m: APRHLLike7[I7, H7]): H7 = ParameterSimpleSupport13Self.apH7.takeTail(m)
        override def append(h: I7, t: H7): APRHLLike7[I7, H7] = ParameterSimpleSupport13Self.apH7.append(h, t)
      }
      ,
      new ABCFunc[I8, H8, APRHLLike8[I8, H8]] {
        override def takeHead(m: APRHLLike8[I8, H8]): I8 = ParameterSimpleSupport13Self.apH8.takeHead(m)
        override def takeTail(m: APRHLLike8[I8, H8]): H8 = ParameterSimpleSupport13Self.apH8.takeTail(m)
        override def append(h: I8, t: H8): APRHLLike8[I8, H8] = ParameterSimpleSupport13Self.apH8.append(h, t)
      }
      ,
      new ABCFunc[I9, H9, APRHLLike9[I9, H9]] {
        override def takeHead(m: APRHLLike9[I9, H9]): I9 = ParameterSimpleSupport13Self.apH9.takeHead(m)
        override def takeTail(m: APRHLLike9[I9, H9]): H9 = ParameterSimpleSupport13Self.apH9.takeTail(m)
        override def append(h: I9, t: H9): APRHLLike9[I9, H9] = ParameterSimpleSupport13Self.apH9.append(h, t)
      }
      ,
      new ABCFunc[I10, H10, APRHLLike10[I10, H10]] {
        override def takeHead(m: APRHLLike10[I10, H10]): I10 = ParameterSimpleSupport13Self.apH10.takeHead(m)
        override def takeTail(m: APRHLLike10[I10, H10]): H10 = ParameterSimpleSupport13Self.apH10.takeTail(m)
        override def append(h: I10, t: H10): APRHLLike10[I10, H10] = ParameterSimpleSupport13Self.apH10.append(h, t)
      }
      ,
      new ABCFunc[I11, H11, APRHLLike11[I11, H11]] {
        override def takeHead(m: APRHLLike11[I11, H11]): I11 = ParameterSimpleSupport13Self.apH11.takeHead(m)
        override def takeTail(m: APRHLLike11[I11, H11]): H11 = ParameterSimpleSupport13Self.apH11.takeTail(m)
        override def append(h: I11, t: H11): APRHLLike11[I11, H11] = ParameterSimpleSupport13Self.apH11.append(h, t)
      }
      ,
      new ABCFunc[I12, H12, APRHLLike12[I12, H12]] {
        override def takeHead(m: APRHLLike12[I12, H12]): I12 = ParameterSimpleSupport13Self.apH12.takeHead(m)
        override def takeTail(m: APRHLLike12[I12, H12]): H12 = ParameterSimpleSupport13Self.apH12.takeTail(m)
        override def append(h: I12, t: H12): APRHLLike12[I12, H12] = ParameterSimpleSupport13Self.apH12.append(h, t)
      }
      ,
      new ABCFunc[I13, H13, APRHLLike13[I13, H13]] {
        override def takeHead(m: APRHLLike13[I13, H13]): I13 = ParameterSimpleSupport13Self.apH13.takeHead(m)
        override def takeTail(m: APRHLLike13[I13, H13]): H13 = ParameterSimpleSupport13Self.apH13.takeTail(m)
        override def append(h: I13, t: H13): APRHLLike13[I13, H13] = ParameterSimpleSupport13Self.apH13.append(h, t)
      }
      )(p1, p2)
        }
    
        
      def simpleAppender: SimpleAppender13Positive[M]
    
        
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

      trait ParameterSimpleSupport14[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14
      ] extends ParameterNatSupport14[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14] {
        ParameterSimpleSupport14Self =>

        
      override final def content: AppenderNatSupport14[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14] =
        new AppenderNatSupport14[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14] {
          override def append[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12,I13,I14, H1 <: HLLike1,H2 <: HLLike2,H3 <: HLLike3,H4 <: HLLike4,H5 <: HLLike5,H6 <: HLLike6,H7 <: HLLike7,H8 <: HLLike8,H9 <: HLLike9,H10 <: HLLike10,H11 <: HLLike11,H12 <: HLLike12,H13 <: HLLike13,H14 <: HLLike14](p1: M[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12,I13,I14], p2: M[H1,H2,H3,H4,H5,H6,H7,H8,H9,H10,H11,H12,H13,H14]): M[APRHLLike1[I1, H1],APRHLLike2[I2, H2],APRHLLike3[I3, H3],APRHLLike4[I4, H4],APRHLLike5[I5, H5],APRHLLike6[I6, H6],APRHLLike7[I7, H7],APRHLLike8[I8, H8],APRHLLike9[I9, H9],APRHLLike10[I10, H10],APRHLLike11[I11, H11],APRHLLike12[I12, H12],APRHLLike13[I13, H13],APRHLLike14[I14, H14]] = ParameterSimpleSupport14Self
          .simpleAppender
          .append(
      new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
        override def takeHead(m: APRHLLike1[I1, H1]): I1 = ParameterSimpleSupport14Self.apH1.takeHead(m)
        override def takeTail(m: APRHLLike1[I1, H1]): H1 = ParameterSimpleSupport14Self.apH1.takeTail(m)
        override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport14Self.apH1.append(h, t)
      }
      ,
      new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
        override def takeHead(m: APRHLLike2[I2, H2]): I2 = ParameterSimpleSupport14Self.apH2.takeHead(m)
        override def takeTail(m: APRHLLike2[I2, H2]): H2 = ParameterSimpleSupport14Self.apH2.takeTail(m)
        override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport14Self.apH2.append(h, t)
      }
      ,
      new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
        override def takeHead(m: APRHLLike3[I3, H3]): I3 = ParameterSimpleSupport14Self.apH3.takeHead(m)
        override def takeTail(m: APRHLLike3[I3, H3]): H3 = ParameterSimpleSupport14Self.apH3.takeTail(m)
        override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport14Self.apH3.append(h, t)
      }
      ,
      new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
        override def takeHead(m: APRHLLike4[I4, H4]): I4 = ParameterSimpleSupport14Self.apH4.takeHead(m)
        override def takeTail(m: APRHLLike4[I4, H4]): H4 = ParameterSimpleSupport14Self.apH4.takeTail(m)
        override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport14Self.apH4.append(h, t)
      }
      ,
      new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
        override def takeHead(m: APRHLLike5[I5, H5]): I5 = ParameterSimpleSupport14Self.apH5.takeHead(m)
        override def takeTail(m: APRHLLike5[I5, H5]): H5 = ParameterSimpleSupport14Self.apH5.takeTail(m)
        override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport14Self.apH5.append(h, t)
      }
      ,
      new ABCFunc[I6, H6, APRHLLike6[I6, H6]] {
        override def takeHead(m: APRHLLike6[I6, H6]): I6 = ParameterSimpleSupport14Self.apH6.takeHead(m)
        override def takeTail(m: APRHLLike6[I6, H6]): H6 = ParameterSimpleSupport14Self.apH6.takeTail(m)
        override def append(h: I6, t: H6): APRHLLike6[I6, H6] = ParameterSimpleSupport14Self.apH6.append(h, t)
      }
      ,
      new ABCFunc[I7, H7, APRHLLike7[I7, H7]] {
        override def takeHead(m: APRHLLike7[I7, H7]): I7 = ParameterSimpleSupport14Self.apH7.takeHead(m)
        override def takeTail(m: APRHLLike7[I7, H7]): H7 = ParameterSimpleSupport14Self.apH7.takeTail(m)
        override def append(h: I7, t: H7): APRHLLike7[I7, H7] = ParameterSimpleSupport14Self.apH7.append(h, t)
      }
      ,
      new ABCFunc[I8, H8, APRHLLike8[I8, H8]] {
        override def takeHead(m: APRHLLike8[I8, H8]): I8 = ParameterSimpleSupport14Self.apH8.takeHead(m)
        override def takeTail(m: APRHLLike8[I8, H8]): H8 = ParameterSimpleSupport14Self.apH8.takeTail(m)
        override def append(h: I8, t: H8): APRHLLike8[I8, H8] = ParameterSimpleSupport14Self.apH8.append(h, t)
      }
      ,
      new ABCFunc[I9, H9, APRHLLike9[I9, H9]] {
        override def takeHead(m: APRHLLike9[I9, H9]): I9 = ParameterSimpleSupport14Self.apH9.takeHead(m)
        override def takeTail(m: APRHLLike9[I9, H9]): H9 = ParameterSimpleSupport14Self.apH9.takeTail(m)
        override def append(h: I9, t: H9): APRHLLike9[I9, H9] = ParameterSimpleSupport14Self.apH9.append(h, t)
      }
      ,
      new ABCFunc[I10, H10, APRHLLike10[I10, H10]] {
        override def takeHead(m: APRHLLike10[I10, H10]): I10 = ParameterSimpleSupport14Self.apH10.takeHead(m)
        override def takeTail(m: APRHLLike10[I10, H10]): H10 = ParameterSimpleSupport14Self.apH10.takeTail(m)
        override def append(h: I10, t: H10): APRHLLike10[I10, H10] = ParameterSimpleSupport14Self.apH10.append(h, t)
      }
      ,
      new ABCFunc[I11, H11, APRHLLike11[I11, H11]] {
        override def takeHead(m: APRHLLike11[I11, H11]): I11 = ParameterSimpleSupport14Self.apH11.takeHead(m)
        override def takeTail(m: APRHLLike11[I11, H11]): H11 = ParameterSimpleSupport14Self.apH11.takeTail(m)
        override def append(h: I11, t: H11): APRHLLike11[I11, H11] = ParameterSimpleSupport14Self.apH11.append(h, t)
      }
      ,
      new ABCFunc[I12, H12, APRHLLike12[I12, H12]] {
        override def takeHead(m: APRHLLike12[I12, H12]): I12 = ParameterSimpleSupport14Self.apH12.takeHead(m)
        override def takeTail(m: APRHLLike12[I12, H12]): H12 = ParameterSimpleSupport14Self.apH12.takeTail(m)
        override def append(h: I12, t: H12): APRHLLike12[I12, H12] = ParameterSimpleSupport14Self.apH12.append(h, t)
      }
      ,
      new ABCFunc[I13, H13, APRHLLike13[I13, H13]] {
        override def takeHead(m: APRHLLike13[I13, H13]): I13 = ParameterSimpleSupport14Self.apH13.takeHead(m)
        override def takeTail(m: APRHLLike13[I13, H13]): H13 = ParameterSimpleSupport14Self.apH13.takeTail(m)
        override def append(h: I13, t: H13): APRHLLike13[I13, H13] = ParameterSimpleSupport14Self.apH13.append(h, t)
      }
      ,
      new ABCFunc[I14, H14, APRHLLike14[I14, H14]] {
        override def takeHead(m: APRHLLike14[I14, H14]): I14 = ParameterSimpleSupport14Self.apH14.takeHead(m)
        override def takeTail(m: APRHLLike14[I14, H14]): H14 = ParameterSimpleSupport14Self.apH14.takeTail(m)
        override def append(h: I14, t: H14): APRHLLike14[I14, H14] = ParameterSimpleSupport14Self.apH14.append(h, t)
      }
      )(p1, p2)
        }
    
        
      def simpleAppender: SimpleAppender14Positive[M]
    
        
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

      trait ParameterSimpleSupport15[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15
      ] extends ParameterNatSupport15[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15] {
        ParameterSimpleSupport15Self =>

        
      override final def content: AppenderNatSupport15[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15] =
        new AppenderNatSupport15[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15] {
          override def append[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12,I13,I14,I15, H1 <: HLLike1,H2 <: HLLike2,H3 <: HLLike3,H4 <: HLLike4,H5 <: HLLike5,H6 <: HLLike6,H7 <: HLLike7,H8 <: HLLike8,H9 <: HLLike9,H10 <: HLLike10,H11 <: HLLike11,H12 <: HLLike12,H13 <: HLLike13,H14 <: HLLike14,H15 <: HLLike15](p1: M[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12,I13,I14,I15], p2: M[H1,H2,H3,H4,H5,H6,H7,H8,H9,H10,H11,H12,H13,H14,H15]): M[APRHLLike1[I1, H1],APRHLLike2[I2, H2],APRHLLike3[I3, H3],APRHLLike4[I4, H4],APRHLLike5[I5, H5],APRHLLike6[I6, H6],APRHLLike7[I7, H7],APRHLLike8[I8, H8],APRHLLike9[I9, H9],APRHLLike10[I10, H10],APRHLLike11[I11, H11],APRHLLike12[I12, H12],APRHLLike13[I13, H13],APRHLLike14[I14, H14],APRHLLike15[I15, H15]] = ParameterSimpleSupport15Self
          .simpleAppender
          .append(
      new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
        override def takeHead(m: APRHLLike1[I1, H1]): I1 = ParameterSimpleSupport15Self.apH1.takeHead(m)
        override def takeTail(m: APRHLLike1[I1, H1]): H1 = ParameterSimpleSupport15Self.apH1.takeTail(m)
        override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport15Self.apH1.append(h, t)
      }
      ,
      new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
        override def takeHead(m: APRHLLike2[I2, H2]): I2 = ParameterSimpleSupport15Self.apH2.takeHead(m)
        override def takeTail(m: APRHLLike2[I2, H2]): H2 = ParameterSimpleSupport15Self.apH2.takeTail(m)
        override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport15Self.apH2.append(h, t)
      }
      ,
      new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
        override def takeHead(m: APRHLLike3[I3, H3]): I3 = ParameterSimpleSupport15Self.apH3.takeHead(m)
        override def takeTail(m: APRHLLike3[I3, H3]): H3 = ParameterSimpleSupport15Self.apH3.takeTail(m)
        override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport15Self.apH3.append(h, t)
      }
      ,
      new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
        override def takeHead(m: APRHLLike4[I4, H4]): I4 = ParameterSimpleSupport15Self.apH4.takeHead(m)
        override def takeTail(m: APRHLLike4[I4, H4]): H4 = ParameterSimpleSupport15Self.apH4.takeTail(m)
        override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport15Self.apH4.append(h, t)
      }
      ,
      new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
        override def takeHead(m: APRHLLike5[I5, H5]): I5 = ParameterSimpleSupport15Self.apH5.takeHead(m)
        override def takeTail(m: APRHLLike5[I5, H5]): H5 = ParameterSimpleSupport15Self.apH5.takeTail(m)
        override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport15Self.apH5.append(h, t)
      }
      ,
      new ABCFunc[I6, H6, APRHLLike6[I6, H6]] {
        override def takeHead(m: APRHLLike6[I6, H6]): I6 = ParameterSimpleSupport15Self.apH6.takeHead(m)
        override def takeTail(m: APRHLLike6[I6, H6]): H6 = ParameterSimpleSupport15Self.apH6.takeTail(m)
        override def append(h: I6, t: H6): APRHLLike6[I6, H6] = ParameterSimpleSupport15Self.apH6.append(h, t)
      }
      ,
      new ABCFunc[I7, H7, APRHLLike7[I7, H7]] {
        override def takeHead(m: APRHLLike7[I7, H7]): I7 = ParameterSimpleSupport15Self.apH7.takeHead(m)
        override def takeTail(m: APRHLLike7[I7, H7]): H7 = ParameterSimpleSupport15Self.apH7.takeTail(m)
        override def append(h: I7, t: H7): APRHLLike7[I7, H7] = ParameterSimpleSupport15Self.apH7.append(h, t)
      }
      ,
      new ABCFunc[I8, H8, APRHLLike8[I8, H8]] {
        override def takeHead(m: APRHLLike8[I8, H8]): I8 = ParameterSimpleSupport15Self.apH8.takeHead(m)
        override def takeTail(m: APRHLLike8[I8, H8]): H8 = ParameterSimpleSupport15Self.apH8.takeTail(m)
        override def append(h: I8, t: H8): APRHLLike8[I8, H8] = ParameterSimpleSupport15Self.apH8.append(h, t)
      }
      ,
      new ABCFunc[I9, H9, APRHLLike9[I9, H9]] {
        override def takeHead(m: APRHLLike9[I9, H9]): I9 = ParameterSimpleSupport15Self.apH9.takeHead(m)
        override def takeTail(m: APRHLLike9[I9, H9]): H9 = ParameterSimpleSupport15Self.apH9.takeTail(m)
        override def append(h: I9, t: H9): APRHLLike9[I9, H9] = ParameterSimpleSupport15Self.apH9.append(h, t)
      }
      ,
      new ABCFunc[I10, H10, APRHLLike10[I10, H10]] {
        override def takeHead(m: APRHLLike10[I10, H10]): I10 = ParameterSimpleSupport15Self.apH10.takeHead(m)
        override def takeTail(m: APRHLLike10[I10, H10]): H10 = ParameterSimpleSupport15Self.apH10.takeTail(m)
        override def append(h: I10, t: H10): APRHLLike10[I10, H10] = ParameterSimpleSupport15Self.apH10.append(h, t)
      }
      ,
      new ABCFunc[I11, H11, APRHLLike11[I11, H11]] {
        override def takeHead(m: APRHLLike11[I11, H11]): I11 = ParameterSimpleSupport15Self.apH11.takeHead(m)
        override def takeTail(m: APRHLLike11[I11, H11]): H11 = ParameterSimpleSupport15Self.apH11.takeTail(m)
        override def append(h: I11, t: H11): APRHLLike11[I11, H11] = ParameterSimpleSupport15Self.apH11.append(h, t)
      }
      ,
      new ABCFunc[I12, H12, APRHLLike12[I12, H12]] {
        override def takeHead(m: APRHLLike12[I12, H12]): I12 = ParameterSimpleSupport15Self.apH12.takeHead(m)
        override def takeTail(m: APRHLLike12[I12, H12]): H12 = ParameterSimpleSupport15Self.apH12.takeTail(m)
        override def append(h: I12, t: H12): APRHLLike12[I12, H12] = ParameterSimpleSupport15Self.apH12.append(h, t)
      }
      ,
      new ABCFunc[I13, H13, APRHLLike13[I13, H13]] {
        override def takeHead(m: APRHLLike13[I13, H13]): I13 = ParameterSimpleSupport15Self.apH13.takeHead(m)
        override def takeTail(m: APRHLLike13[I13, H13]): H13 = ParameterSimpleSupport15Self.apH13.takeTail(m)
        override def append(h: I13, t: H13): APRHLLike13[I13, H13] = ParameterSimpleSupport15Self.apH13.append(h, t)
      }
      ,
      new ABCFunc[I14, H14, APRHLLike14[I14, H14]] {
        override def takeHead(m: APRHLLike14[I14, H14]): I14 = ParameterSimpleSupport15Self.apH14.takeHead(m)
        override def takeTail(m: APRHLLike14[I14, H14]): H14 = ParameterSimpleSupport15Self.apH14.takeTail(m)
        override def append(h: I14, t: H14): APRHLLike14[I14, H14] = ParameterSimpleSupport15Self.apH14.append(h, t)
      }
      ,
      new ABCFunc[I15, H15, APRHLLike15[I15, H15]] {
        override def takeHead(m: APRHLLike15[I15, H15]): I15 = ParameterSimpleSupport15Self.apH15.takeHead(m)
        override def takeTail(m: APRHLLike15[I15, H15]): H15 = ParameterSimpleSupport15Self.apH15.takeTail(m)
        override def append(h: I15, t: H15): APRHLLike15[I15, H15] = ParameterSimpleSupport15Self.apH15.append(h, t)
      }
      )(p1, p2)
        }
    
        
      def simpleAppender: SimpleAppender15Positive[M]
    
        
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

      trait ParameterSimpleSupport16[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16
      ] extends ParameterNatSupport16[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16] {
        ParameterSimpleSupport16Self =>

        
      override final def content: AppenderNatSupport16[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16] =
        new AppenderNatSupport16[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16] {
          override def append[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12,I13,I14,I15,I16, H1 <: HLLike1,H2 <: HLLike2,H3 <: HLLike3,H4 <: HLLike4,H5 <: HLLike5,H6 <: HLLike6,H7 <: HLLike7,H8 <: HLLike8,H9 <: HLLike9,H10 <: HLLike10,H11 <: HLLike11,H12 <: HLLike12,H13 <: HLLike13,H14 <: HLLike14,H15 <: HLLike15,H16 <: HLLike16](p1: M[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12,I13,I14,I15,I16], p2: M[H1,H2,H3,H4,H5,H6,H7,H8,H9,H10,H11,H12,H13,H14,H15,H16]): M[APRHLLike1[I1, H1],APRHLLike2[I2, H2],APRHLLike3[I3, H3],APRHLLike4[I4, H4],APRHLLike5[I5, H5],APRHLLike6[I6, H6],APRHLLike7[I7, H7],APRHLLike8[I8, H8],APRHLLike9[I9, H9],APRHLLike10[I10, H10],APRHLLike11[I11, H11],APRHLLike12[I12, H12],APRHLLike13[I13, H13],APRHLLike14[I14, H14],APRHLLike15[I15, H15],APRHLLike16[I16, H16]] = ParameterSimpleSupport16Self
          .simpleAppender
          .append(
      new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
        override def takeHead(m: APRHLLike1[I1, H1]): I1 = ParameterSimpleSupport16Self.apH1.takeHead(m)
        override def takeTail(m: APRHLLike1[I1, H1]): H1 = ParameterSimpleSupport16Self.apH1.takeTail(m)
        override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport16Self.apH1.append(h, t)
      }
      ,
      new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
        override def takeHead(m: APRHLLike2[I2, H2]): I2 = ParameterSimpleSupport16Self.apH2.takeHead(m)
        override def takeTail(m: APRHLLike2[I2, H2]): H2 = ParameterSimpleSupport16Self.apH2.takeTail(m)
        override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport16Self.apH2.append(h, t)
      }
      ,
      new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
        override def takeHead(m: APRHLLike3[I3, H3]): I3 = ParameterSimpleSupport16Self.apH3.takeHead(m)
        override def takeTail(m: APRHLLike3[I3, H3]): H3 = ParameterSimpleSupport16Self.apH3.takeTail(m)
        override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport16Self.apH3.append(h, t)
      }
      ,
      new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
        override def takeHead(m: APRHLLike4[I4, H4]): I4 = ParameterSimpleSupport16Self.apH4.takeHead(m)
        override def takeTail(m: APRHLLike4[I4, H4]): H4 = ParameterSimpleSupport16Self.apH4.takeTail(m)
        override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport16Self.apH4.append(h, t)
      }
      ,
      new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
        override def takeHead(m: APRHLLike5[I5, H5]): I5 = ParameterSimpleSupport16Self.apH5.takeHead(m)
        override def takeTail(m: APRHLLike5[I5, H5]): H5 = ParameterSimpleSupport16Self.apH5.takeTail(m)
        override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport16Self.apH5.append(h, t)
      }
      ,
      new ABCFunc[I6, H6, APRHLLike6[I6, H6]] {
        override def takeHead(m: APRHLLike6[I6, H6]): I6 = ParameterSimpleSupport16Self.apH6.takeHead(m)
        override def takeTail(m: APRHLLike6[I6, H6]): H6 = ParameterSimpleSupport16Self.apH6.takeTail(m)
        override def append(h: I6, t: H6): APRHLLike6[I6, H6] = ParameterSimpleSupport16Self.apH6.append(h, t)
      }
      ,
      new ABCFunc[I7, H7, APRHLLike7[I7, H7]] {
        override def takeHead(m: APRHLLike7[I7, H7]): I7 = ParameterSimpleSupport16Self.apH7.takeHead(m)
        override def takeTail(m: APRHLLike7[I7, H7]): H7 = ParameterSimpleSupport16Self.apH7.takeTail(m)
        override def append(h: I7, t: H7): APRHLLike7[I7, H7] = ParameterSimpleSupport16Self.apH7.append(h, t)
      }
      ,
      new ABCFunc[I8, H8, APRHLLike8[I8, H8]] {
        override def takeHead(m: APRHLLike8[I8, H8]): I8 = ParameterSimpleSupport16Self.apH8.takeHead(m)
        override def takeTail(m: APRHLLike8[I8, H8]): H8 = ParameterSimpleSupport16Self.apH8.takeTail(m)
        override def append(h: I8, t: H8): APRHLLike8[I8, H8] = ParameterSimpleSupport16Self.apH8.append(h, t)
      }
      ,
      new ABCFunc[I9, H9, APRHLLike9[I9, H9]] {
        override def takeHead(m: APRHLLike9[I9, H9]): I9 = ParameterSimpleSupport16Self.apH9.takeHead(m)
        override def takeTail(m: APRHLLike9[I9, H9]): H9 = ParameterSimpleSupport16Self.apH9.takeTail(m)
        override def append(h: I9, t: H9): APRHLLike9[I9, H9] = ParameterSimpleSupport16Self.apH9.append(h, t)
      }
      ,
      new ABCFunc[I10, H10, APRHLLike10[I10, H10]] {
        override def takeHead(m: APRHLLike10[I10, H10]): I10 = ParameterSimpleSupport16Self.apH10.takeHead(m)
        override def takeTail(m: APRHLLike10[I10, H10]): H10 = ParameterSimpleSupport16Self.apH10.takeTail(m)
        override def append(h: I10, t: H10): APRHLLike10[I10, H10] = ParameterSimpleSupport16Self.apH10.append(h, t)
      }
      ,
      new ABCFunc[I11, H11, APRHLLike11[I11, H11]] {
        override def takeHead(m: APRHLLike11[I11, H11]): I11 = ParameterSimpleSupport16Self.apH11.takeHead(m)
        override def takeTail(m: APRHLLike11[I11, H11]): H11 = ParameterSimpleSupport16Self.apH11.takeTail(m)
        override def append(h: I11, t: H11): APRHLLike11[I11, H11] = ParameterSimpleSupport16Self.apH11.append(h, t)
      }
      ,
      new ABCFunc[I12, H12, APRHLLike12[I12, H12]] {
        override def takeHead(m: APRHLLike12[I12, H12]): I12 = ParameterSimpleSupport16Self.apH12.takeHead(m)
        override def takeTail(m: APRHLLike12[I12, H12]): H12 = ParameterSimpleSupport16Self.apH12.takeTail(m)
        override def append(h: I12, t: H12): APRHLLike12[I12, H12] = ParameterSimpleSupport16Self.apH12.append(h, t)
      }
      ,
      new ABCFunc[I13, H13, APRHLLike13[I13, H13]] {
        override def takeHead(m: APRHLLike13[I13, H13]): I13 = ParameterSimpleSupport16Self.apH13.takeHead(m)
        override def takeTail(m: APRHLLike13[I13, H13]): H13 = ParameterSimpleSupport16Self.apH13.takeTail(m)
        override def append(h: I13, t: H13): APRHLLike13[I13, H13] = ParameterSimpleSupport16Self.apH13.append(h, t)
      }
      ,
      new ABCFunc[I14, H14, APRHLLike14[I14, H14]] {
        override def takeHead(m: APRHLLike14[I14, H14]): I14 = ParameterSimpleSupport16Self.apH14.takeHead(m)
        override def takeTail(m: APRHLLike14[I14, H14]): H14 = ParameterSimpleSupport16Self.apH14.takeTail(m)
        override def append(h: I14, t: H14): APRHLLike14[I14, H14] = ParameterSimpleSupport16Self.apH14.append(h, t)
      }
      ,
      new ABCFunc[I15, H15, APRHLLike15[I15, H15]] {
        override def takeHead(m: APRHLLike15[I15, H15]): I15 = ParameterSimpleSupport16Self.apH15.takeHead(m)
        override def takeTail(m: APRHLLike15[I15, H15]): H15 = ParameterSimpleSupport16Self.apH15.takeTail(m)
        override def append(h: I15, t: H15): APRHLLike15[I15, H15] = ParameterSimpleSupport16Self.apH15.append(h, t)
      }
      ,
      new ABCFunc[I16, H16, APRHLLike16[I16, H16]] {
        override def takeHead(m: APRHLLike16[I16, H16]): I16 = ParameterSimpleSupport16Self.apH16.takeHead(m)
        override def takeTail(m: APRHLLike16[I16, H16]): H16 = ParameterSimpleSupport16Self.apH16.takeTail(m)
        override def append(h: I16, t: H16): APRHLLike16[I16, H16] = ParameterSimpleSupport16Self.apH16.append(h, t)
      }
      )(p1, p2)
        }
    
        
      def simpleAppender: SimpleAppender16Positive[M]
    
        
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

      trait ParameterSimpleSupport17[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17
      ] extends ParameterNatSupport17[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17] {
        ParameterSimpleSupport17Self =>

        
      override final def content: AppenderNatSupport17[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17] =
        new AppenderNatSupport17[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17] {
          override def append[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12,I13,I14,I15,I16,I17, H1 <: HLLike1,H2 <: HLLike2,H3 <: HLLike3,H4 <: HLLike4,H5 <: HLLike5,H6 <: HLLike6,H7 <: HLLike7,H8 <: HLLike8,H9 <: HLLike9,H10 <: HLLike10,H11 <: HLLike11,H12 <: HLLike12,H13 <: HLLike13,H14 <: HLLike14,H15 <: HLLike15,H16 <: HLLike16,H17 <: HLLike17](p1: M[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12,I13,I14,I15,I16,I17], p2: M[H1,H2,H3,H4,H5,H6,H7,H8,H9,H10,H11,H12,H13,H14,H15,H16,H17]): M[APRHLLike1[I1, H1],APRHLLike2[I2, H2],APRHLLike3[I3, H3],APRHLLike4[I4, H4],APRHLLike5[I5, H5],APRHLLike6[I6, H6],APRHLLike7[I7, H7],APRHLLike8[I8, H8],APRHLLike9[I9, H9],APRHLLike10[I10, H10],APRHLLike11[I11, H11],APRHLLike12[I12, H12],APRHLLike13[I13, H13],APRHLLike14[I14, H14],APRHLLike15[I15, H15],APRHLLike16[I16, H16],APRHLLike17[I17, H17]] = ParameterSimpleSupport17Self
          .simpleAppender
          .append(
      new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
        override def takeHead(m: APRHLLike1[I1, H1]): I1 = ParameterSimpleSupport17Self.apH1.takeHead(m)
        override def takeTail(m: APRHLLike1[I1, H1]): H1 = ParameterSimpleSupport17Self.apH1.takeTail(m)
        override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport17Self.apH1.append(h, t)
      }
      ,
      new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
        override def takeHead(m: APRHLLike2[I2, H2]): I2 = ParameterSimpleSupport17Self.apH2.takeHead(m)
        override def takeTail(m: APRHLLike2[I2, H2]): H2 = ParameterSimpleSupport17Self.apH2.takeTail(m)
        override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport17Self.apH2.append(h, t)
      }
      ,
      new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
        override def takeHead(m: APRHLLike3[I3, H3]): I3 = ParameterSimpleSupport17Self.apH3.takeHead(m)
        override def takeTail(m: APRHLLike3[I3, H3]): H3 = ParameterSimpleSupport17Self.apH3.takeTail(m)
        override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport17Self.apH3.append(h, t)
      }
      ,
      new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
        override def takeHead(m: APRHLLike4[I4, H4]): I4 = ParameterSimpleSupport17Self.apH4.takeHead(m)
        override def takeTail(m: APRHLLike4[I4, H4]): H4 = ParameterSimpleSupport17Self.apH4.takeTail(m)
        override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport17Self.apH4.append(h, t)
      }
      ,
      new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
        override def takeHead(m: APRHLLike5[I5, H5]): I5 = ParameterSimpleSupport17Self.apH5.takeHead(m)
        override def takeTail(m: APRHLLike5[I5, H5]): H5 = ParameterSimpleSupport17Self.apH5.takeTail(m)
        override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport17Self.apH5.append(h, t)
      }
      ,
      new ABCFunc[I6, H6, APRHLLike6[I6, H6]] {
        override def takeHead(m: APRHLLike6[I6, H6]): I6 = ParameterSimpleSupport17Self.apH6.takeHead(m)
        override def takeTail(m: APRHLLike6[I6, H6]): H6 = ParameterSimpleSupport17Self.apH6.takeTail(m)
        override def append(h: I6, t: H6): APRHLLike6[I6, H6] = ParameterSimpleSupport17Self.apH6.append(h, t)
      }
      ,
      new ABCFunc[I7, H7, APRHLLike7[I7, H7]] {
        override def takeHead(m: APRHLLike7[I7, H7]): I7 = ParameterSimpleSupport17Self.apH7.takeHead(m)
        override def takeTail(m: APRHLLike7[I7, H7]): H7 = ParameterSimpleSupport17Self.apH7.takeTail(m)
        override def append(h: I7, t: H7): APRHLLike7[I7, H7] = ParameterSimpleSupport17Self.apH7.append(h, t)
      }
      ,
      new ABCFunc[I8, H8, APRHLLike8[I8, H8]] {
        override def takeHead(m: APRHLLike8[I8, H8]): I8 = ParameterSimpleSupport17Self.apH8.takeHead(m)
        override def takeTail(m: APRHLLike8[I8, H8]): H8 = ParameterSimpleSupport17Self.apH8.takeTail(m)
        override def append(h: I8, t: H8): APRHLLike8[I8, H8] = ParameterSimpleSupport17Self.apH8.append(h, t)
      }
      ,
      new ABCFunc[I9, H9, APRHLLike9[I9, H9]] {
        override def takeHead(m: APRHLLike9[I9, H9]): I9 = ParameterSimpleSupport17Self.apH9.takeHead(m)
        override def takeTail(m: APRHLLike9[I9, H9]): H9 = ParameterSimpleSupport17Self.apH9.takeTail(m)
        override def append(h: I9, t: H9): APRHLLike9[I9, H9] = ParameterSimpleSupport17Self.apH9.append(h, t)
      }
      ,
      new ABCFunc[I10, H10, APRHLLike10[I10, H10]] {
        override def takeHead(m: APRHLLike10[I10, H10]): I10 = ParameterSimpleSupport17Self.apH10.takeHead(m)
        override def takeTail(m: APRHLLike10[I10, H10]): H10 = ParameterSimpleSupport17Self.apH10.takeTail(m)
        override def append(h: I10, t: H10): APRHLLike10[I10, H10] = ParameterSimpleSupport17Self.apH10.append(h, t)
      }
      ,
      new ABCFunc[I11, H11, APRHLLike11[I11, H11]] {
        override def takeHead(m: APRHLLike11[I11, H11]): I11 = ParameterSimpleSupport17Self.apH11.takeHead(m)
        override def takeTail(m: APRHLLike11[I11, H11]): H11 = ParameterSimpleSupport17Self.apH11.takeTail(m)
        override def append(h: I11, t: H11): APRHLLike11[I11, H11] = ParameterSimpleSupport17Self.apH11.append(h, t)
      }
      ,
      new ABCFunc[I12, H12, APRHLLike12[I12, H12]] {
        override def takeHead(m: APRHLLike12[I12, H12]): I12 = ParameterSimpleSupport17Self.apH12.takeHead(m)
        override def takeTail(m: APRHLLike12[I12, H12]): H12 = ParameterSimpleSupport17Self.apH12.takeTail(m)
        override def append(h: I12, t: H12): APRHLLike12[I12, H12] = ParameterSimpleSupport17Self.apH12.append(h, t)
      }
      ,
      new ABCFunc[I13, H13, APRHLLike13[I13, H13]] {
        override def takeHead(m: APRHLLike13[I13, H13]): I13 = ParameterSimpleSupport17Self.apH13.takeHead(m)
        override def takeTail(m: APRHLLike13[I13, H13]): H13 = ParameterSimpleSupport17Self.apH13.takeTail(m)
        override def append(h: I13, t: H13): APRHLLike13[I13, H13] = ParameterSimpleSupport17Self.apH13.append(h, t)
      }
      ,
      new ABCFunc[I14, H14, APRHLLike14[I14, H14]] {
        override def takeHead(m: APRHLLike14[I14, H14]): I14 = ParameterSimpleSupport17Self.apH14.takeHead(m)
        override def takeTail(m: APRHLLike14[I14, H14]): H14 = ParameterSimpleSupport17Self.apH14.takeTail(m)
        override def append(h: I14, t: H14): APRHLLike14[I14, H14] = ParameterSimpleSupport17Self.apH14.append(h, t)
      }
      ,
      new ABCFunc[I15, H15, APRHLLike15[I15, H15]] {
        override def takeHead(m: APRHLLike15[I15, H15]): I15 = ParameterSimpleSupport17Self.apH15.takeHead(m)
        override def takeTail(m: APRHLLike15[I15, H15]): H15 = ParameterSimpleSupport17Self.apH15.takeTail(m)
        override def append(h: I15, t: H15): APRHLLike15[I15, H15] = ParameterSimpleSupport17Self.apH15.append(h, t)
      }
      ,
      new ABCFunc[I16, H16, APRHLLike16[I16, H16]] {
        override def takeHead(m: APRHLLike16[I16, H16]): I16 = ParameterSimpleSupport17Self.apH16.takeHead(m)
        override def takeTail(m: APRHLLike16[I16, H16]): H16 = ParameterSimpleSupport17Self.apH16.takeTail(m)
        override def append(h: I16, t: H16): APRHLLike16[I16, H16] = ParameterSimpleSupport17Self.apH16.append(h, t)
      }
      ,
      new ABCFunc[I17, H17, APRHLLike17[I17, H17]] {
        override def takeHead(m: APRHLLike17[I17, H17]): I17 = ParameterSimpleSupport17Self.apH17.takeHead(m)
        override def takeTail(m: APRHLLike17[I17, H17]): H17 = ParameterSimpleSupport17Self.apH17.takeTail(m)
        override def append(h: I17, t: H17): APRHLLike17[I17, H17] = ParameterSimpleSupport17Self.apH17.append(h, t)
      }
      )(p1, p2)
        }
    
        
      def simpleAppender: SimpleAppender17Positive[M]
    
        
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

      trait ParameterSimpleSupport18[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18
      ] extends ParameterNatSupport18[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18] {
        ParameterSimpleSupport18Self =>

        
      override final def content: AppenderNatSupport18[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18] =
        new AppenderNatSupport18[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18] {
          override def append[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12,I13,I14,I15,I16,I17,I18, H1 <: HLLike1,H2 <: HLLike2,H3 <: HLLike3,H4 <: HLLike4,H5 <: HLLike5,H6 <: HLLike6,H7 <: HLLike7,H8 <: HLLike8,H9 <: HLLike9,H10 <: HLLike10,H11 <: HLLike11,H12 <: HLLike12,H13 <: HLLike13,H14 <: HLLike14,H15 <: HLLike15,H16 <: HLLike16,H17 <: HLLike17,H18 <: HLLike18](p1: M[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12,I13,I14,I15,I16,I17,I18], p2: M[H1,H2,H3,H4,H5,H6,H7,H8,H9,H10,H11,H12,H13,H14,H15,H16,H17,H18]): M[APRHLLike1[I1, H1],APRHLLike2[I2, H2],APRHLLike3[I3, H3],APRHLLike4[I4, H4],APRHLLike5[I5, H5],APRHLLike6[I6, H6],APRHLLike7[I7, H7],APRHLLike8[I8, H8],APRHLLike9[I9, H9],APRHLLike10[I10, H10],APRHLLike11[I11, H11],APRHLLike12[I12, H12],APRHLLike13[I13, H13],APRHLLike14[I14, H14],APRHLLike15[I15, H15],APRHLLike16[I16, H16],APRHLLike17[I17, H17],APRHLLike18[I18, H18]] = ParameterSimpleSupport18Self
          .simpleAppender
          .append(
      new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
        override def takeHead(m: APRHLLike1[I1, H1]): I1 = ParameterSimpleSupport18Self.apH1.takeHead(m)
        override def takeTail(m: APRHLLike1[I1, H1]): H1 = ParameterSimpleSupport18Self.apH1.takeTail(m)
        override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport18Self.apH1.append(h, t)
      }
      ,
      new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
        override def takeHead(m: APRHLLike2[I2, H2]): I2 = ParameterSimpleSupport18Self.apH2.takeHead(m)
        override def takeTail(m: APRHLLike2[I2, H2]): H2 = ParameterSimpleSupport18Self.apH2.takeTail(m)
        override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport18Self.apH2.append(h, t)
      }
      ,
      new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
        override def takeHead(m: APRHLLike3[I3, H3]): I3 = ParameterSimpleSupport18Self.apH3.takeHead(m)
        override def takeTail(m: APRHLLike3[I3, H3]): H3 = ParameterSimpleSupport18Self.apH3.takeTail(m)
        override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport18Self.apH3.append(h, t)
      }
      ,
      new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
        override def takeHead(m: APRHLLike4[I4, H4]): I4 = ParameterSimpleSupport18Self.apH4.takeHead(m)
        override def takeTail(m: APRHLLike4[I4, H4]): H4 = ParameterSimpleSupport18Self.apH4.takeTail(m)
        override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport18Self.apH4.append(h, t)
      }
      ,
      new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
        override def takeHead(m: APRHLLike5[I5, H5]): I5 = ParameterSimpleSupport18Self.apH5.takeHead(m)
        override def takeTail(m: APRHLLike5[I5, H5]): H5 = ParameterSimpleSupport18Self.apH5.takeTail(m)
        override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport18Self.apH5.append(h, t)
      }
      ,
      new ABCFunc[I6, H6, APRHLLike6[I6, H6]] {
        override def takeHead(m: APRHLLike6[I6, H6]): I6 = ParameterSimpleSupport18Self.apH6.takeHead(m)
        override def takeTail(m: APRHLLike6[I6, H6]): H6 = ParameterSimpleSupport18Self.apH6.takeTail(m)
        override def append(h: I6, t: H6): APRHLLike6[I6, H6] = ParameterSimpleSupport18Self.apH6.append(h, t)
      }
      ,
      new ABCFunc[I7, H7, APRHLLike7[I7, H7]] {
        override def takeHead(m: APRHLLike7[I7, H7]): I7 = ParameterSimpleSupport18Self.apH7.takeHead(m)
        override def takeTail(m: APRHLLike7[I7, H7]): H7 = ParameterSimpleSupport18Self.apH7.takeTail(m)
        override def append(h: I7, t: H7): APRHLLike7[I7, H7] = ParameterSimpleSupport18Self.apH7.append(h, t)
      }
      ,
      new ABCFunc[I8, H8, APRHLLike8[I8, H8]] {
        override def takeHead(m: APRHLLike8[I8, H8]): I8 = ParameterSimpleSupport18Self.apH8.takeHead(m)
        override def takeTail(m: APRHLLike8[I8, H8]): H8 = ParameterSimpleSupport18Self.apH8.takeTail(m)
        override def append(h: I8, t: H8): APRHLLike8[I8, H8] = ParameterSimpleSupport18Self.apH8.append(h, t)
      }
      ,
      new ABCFunc[I9, H9, APRHLLike9[I9, H9]] {
        override def takeHead(m: APRHLLike9[I9, H9]): I9 = ParameterSimpleSupport18Self.apH9.takeHead(m)
        override def takeTail(m: APRHLLike9[I9, H9]): H9 = ParameterSimpleSupport18Self.apH9.takeTail(m)
        override def append(h: I9, t: H9): APRHLLike9[I9, H9] = ParameterSimpleSupport18Self.apH9.append(h, t)
      }
      ,
      new ABCFunc[I10, H10, APRHLLike10[I10, H10]] {
        override def takeHead(m: APRHLLike10[I10, H10]): I10 = ParameterSimpleSupport18Self.apH10.takeHead(m)
        override def takeTail(m: APRHLLike10[I10, H10]): H10 = ParameterSimpleSupport18Self.apH10.takeTail(m)
        override def append(h: I10, t: H10): APRHLLike10[I10, H10] = ParameterSimpleSupport18Self.apH10.append(h, t)
      }
      ,
      new ABCFunc[I11, H11, APRHLLike11[I11, H11]] {
        override def takeHead(m: APRHLLike11[I11, H11]): I11 = ParameterSimpleSupport18Self.apH11.takeHead(m)
        override def takeTail(m: APRHLLike11[I11, H11]): H11 = ParameterSimpleSupport18Self.apH11.takeTail(m)
        override def append(h: I11, t: H11): APRHLLike11[I11, H11] = ParameterSimpleSupport18Self.apH11.append(h, t)
      }
      ,
      new ABCFunc[I12, H12, APRHLLike12[I12, H12]] {
        override def takeHead(m: APRHLLike12[I12, H12]): I12 = ParameterSimpleSupport18Self.apH12.takeHead(m)
        override def takeTail(m: APRHLLike12[I12, H12]): H12 = ParameterSimpleSupport18Self.apH12.takeTail(m)
        override def append(h: I12, t: H12): APRHLLike12[I12, H12] = ParameterSimpleSupport18Self.apH12.append(h, t)
      }
      ,
      new ABCFunc[I13, H13, APRHLLike13[I13, H13]] {
        override def takeHead(m: APRHLLike13[I13, H13]): I13 = ParameterSimpleSupport18Self.apH13.takeHead(m)
        override def takeTail(m: APRHLLike13[I13, H13]): H13 = ParameterSimpleSupport18Self.apH13.takeTail(m)
        override def append(h: I13, t: H13): APRHLLike13[I13, H13] = ParameterSimpleSupport18Self.apH13.append(h, t)
      }
      ,
      new ABCFunc[I14, H14, APRHLLike14[I14, H14]] {
        override def takeHead(m: APRHLLike14[I14, H14]): I14 = ParameterSimpleSupport18Self.apH14.takeHead(m)
        override def takeTail(m: APRHLLike14[I14, H14]): H14 = ParameterSimpleSupport18Self.apH14.takeTail(m)
        override def append(h: I14, t: H14): APRHLLike14[I14, H14] = ParameterSimpleSupport18Self.apH14.append(h, t)
      }
      ,
      new ABCFunc[I15, H15, APRHLLike15[I15, H15]] {
        override def takeHead(m: APRHLLike15[I15, H15]): I15 = ParameterSimpleSupport18Self.apH15.takeHead(m)
        override def takeTail(m: APRHLLike15[I15, H15]): H15 = ParameterSimpleSupport18Self.apH15.takeTail(m)
        override def append(h: I15, t: H15): APRHLLike15[I15, H15] = ParameterSimpleSupport18Self.apH15.append(h, t)
      }
      ,
      new ABCFunc[I16, H16, APRHLLike16[I16, H16]] {
        override def takeHead(m: APRHLLike16[I16, H16]): I16 = ParameterSimpleSupport18Self.apH16.takeHead(m)
        override def takeTail(m: APRHLLike16[I16, H16]): H16 = ParameterSimpleSupport18Self.apH16.takeTail(m)
        override def append(h: I16, t: H16): APRHLLike16[I16, H16] = ParameterSimpleSupport18Self.apH16.append(h, t)
      }
      ,
      new ABCFunc[I17, H17, APRHLLike17[I17, H17]] {
        override def takeHead(m: APRHLLike17[I17, H17]): I17 = ParameterSimpleSupport18Self.apH17.takeHead(m)
        override def takeTail(m: APRHLLike17[I17, H17]): H17 = ParameterSimpleSupport18Self.apH17.takeTail(m)
        override def append(h: I17, t: H17): APRHLLike17[I17, H17] = ParameterSimpleSupport18Self.apH17.append(h, t)
      }
      ,
      new ABCFunc[I18, H18, APRHLLike18[I18, H18]] {
        override def takeHead(m: APRHLLike18[I18, H18]): I18 = ParameterSimpleSupport18Self.apH18.takeHead(m)
        override def takeTail(m: APRHLLike18[I18, H18]): H18 = ParameterSimpleSupport18Self.apH18.takeTail(m)
        override def append(h: I18, t: H18): APRHLLike18[I18, H18] = ParameterSimpleSupport18Self.apH18.append(h, t)
      }
      )(p1, p2)
        }
    
        
      def simpleAppender: SimpleAppender18Positive[M]
    
        
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

      trait ParameterSimpleSupport19[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19
      ] extends ParameterNatSupport19[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19] {
        ParameterSimpleSupport19Self =>

        
      override final def content: AppenderNatSupport19[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19] =
        new AppenderNatSupport19[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19] {
          override def append[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12,I13,I14,I15,I16,I17,I18,I19, H1 <: HLLike1,H2 <: HLLike2,H3 <: HLLike3,H4 <: HLLike4,H5 <: HLLike5,H6 <: HLLike6,H7 <: HLLike7,H8 <: HLLike8,H9 <: HLLike9,H10 <: HLLike10,H11 <: HLLike11,H12 <: HLLike12,H13 <: HLLike13,H14 <: HLLike14,H15 <: HLLike15,H16 <: HLLike16,H17 <: HLLike17,H18 <: HLLike18,H19 <: HLLike19](p1: M[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12,I13,I14,I15,I16,I17,I18,I19], p2: M[H1,H2,H3,H4,H5,H6,H7,H8,H9,H10,H11,H12,H13,H14,H15,H16,H17,H18,H19]): M[APRHLLike1[I1, H1],APRHLLike2[I2, H2],APRHLLike3[I3, H3],APRHLLike4[I4, H4],APRHLLike5[I5, H5],APRHLLike6[I6, H6],APRHLLike7[I7, H7],APRHLLike8[I8, H8],APRHLLike9[I9, H9],APRHLLike10[I10, H10],APRHLLike11[I11, H11],APRHLLike12[I12, H12],APRHLLike13[I13, H13],APRHLLike14[I14, H14],APRHLLike15[I15, H15],APRHLLike16[I16, H16],APRHLLike17[I17, H17],APRHLLike18[I18, H18],APRHLLike19[I19, H19]] = ParameterSimpleSupport19Self
          .simpleAppender
          .append(
      new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
        override def takeHead(m: APRHLLike1[I1, H1]): I1 = ParameterSimpleSupport19Self.apH1.takeHead(m)
        override def takeTail(m: APRHLLike1[I1, H1]): H1 = ParameterSimpleSupport19Self.apH1.takeTail(m)
        override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport19Self.apH1.append(h, t)
      }
      ,
      new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
        override def takeHead(m: APRHLLike2[I2, H2]): I2 = ParameterSimpleSupport19Self.apH2.takeHead(m)
        override def takeTail(m: APRHLLike2[I2, H2]): H2 = ParameterSimpleSupport19Self.apH2.takeTail(m)
        override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport19Self.apH2.append(h, t)
      }
      ,
      new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
        override def takeHead(m: APRHLLike3[I3, H3]): I3 = ParameterSimpleSupport19Self.apH3.takeHead(m)
        override def takeTail(m: APRHLLike3[I3, H3]): H3 = ParameterSimpleSupport19Self.apH3.takeTail(m)
        override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport19Self.apH3.append(h, t)
      }
      ,
      new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
        override def takeHead(m: APRHLLike4[I4, H4]): I4 = ParameterSimpleSupport19Self.apH4.takeHead(m)
        override def takeTail(m: APRHLLike4[I4, H4]): H4 = ParameterSimpleSupport19Self.apH4.takeTail(m)
        override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport19Self.apH4.append(h, t)
      }
      ,
      new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
        override def takeHead(m: APRHLLike5[I5, H5]): I5 = ParameterSimpleSupport19Self.apH5.takeHead(m)
        override def takeTail(m: APRHLLike5[I5, H5]): H5 = ParameterSimpleSupport19Self.apH5.takeTail(m)
        override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport19Self.apH5.append(h, t)
      }
      ,
      new ABCFunc[I6, H6, APRHLLike6[I6, H6]] {
        override def takeHead(m: APRHLLike6[I6, H6]): I6 = ParameterSimpleSupport19Self.apH6.takeHead(m)
        override def takeTail(m: APRHLLike6[I6, H6]): H6 = ParameterSimpleSupport19Self.apH6.takeTail(m)
        override def append(h: I6, t: H6): APRHLLike6[I6, H6] = ParameterSimpleSupport19Self.apH6.append(h, t)
      }
      ,
      new ABCFunc[I7, H7, APRHLLike7[I7, H7]] {
        override def takeHead(m: APRHLLike7[I7, H7]): I7 = ParameterSimpleSupport19Self.apH7.takeHead(m)
        override def takeTail(m: APRHLLike7[I7, H7]): H7 = ParameterSimpleSupport19Self.apH7.takeTail(m)
        override def append(h: I7, t: H7): APRHLLike7[I7, H7] = ParameterSimpleSupport19Self.apH7.append(h, t)
      }
      ,
      new ABCFunc[I8, H8, APRHLLike8[I8, H8]] {
        override def takeHead(m: APRHLLike8[I8, H8]): I8 = ParameterSimpleSupport19Self.apH8.takeHead(m)
        override def takeTail(m: APRHLLike8[I8, H8]): H8 = ParameterSimpleSupport19Self.apH8.takeTail(m)
        override def append(h: I8, t: H8): APRHLLike8[I8, H8] = ParameterSimpleSupport19Self.apH8.append(h, t)
      }
      ,
      new ABCFunc[I9, H9, APRHLLike9[I9, H9]] {
        override def takeHead(m: APRHLLike9[I9, H9]): I9 = ParameterSimpleSupport19Self.apH9.takeHead(m)
        override def takeTail(m: APRHLLike9[I9, H9]): H9 = ParameterSimpleSupport19Self.apH9.takeTail(m)
        override def append(h: I9, t: H9): APRHLLike9[I9, H9] = ParameterSimpleSupport19Self.apH9.append(h, t)
      }
      ,
      new ABCFunc[I10, H10, APRHLLike10[I10, H10]] {
        override def takeHead(m: APRHLLike10[I10, H10]): I10 = ParameterSimpleSupport19Self.apH10.takeHead(m)
        override def takeTail(m: APRHLLike10[I10, H10]): H10 = ParameterSimpleSupport19Self.apH10.takeTail(m)
        override def append(h: I10, t: H10): APRHLLike10[I10, H10] = ParameterSimpleSupport19Self.apH10.append(h, t)
      }
      ,
      new ABCFunc[I11, H11, APRHLLike11[I11, H11]] {
        override def takeHead(m: APRHLLike11[I11, H11]): I11 = ParameterSimpleSupport19Self.apH11.takeHead(m)
        override def takeTail(m: APRHLLike11[I11, H11]): H11 = ParameterSimpleSupport19Self.apH11.takeTail(m)
        override def append(h: I11, t: H11): APRHLLike11[I11, H11] = ParameterSimpleSupport19Self.apH11.append(h, t)
      }
      ,
      new ABCFunc[I12, H12, APRHLLike12[I12, H12]] {
        override def takeHead(m: APRHLLike12[I12, H12]): I12 = ParameterSimpleSupport19Self.apH12.takeHead(m)
        override def takeTail(m: APRHLLike12[I12, H12]): H12 = ParameterSimpleSupport19Self.apH12.takeTail(m)
        override def append(h: I12, t: H12): APRHLLike12[I12, H12] = ParameterSimpleSupport19Self.apH12.append(h, t)
      }
      ,
      new ABCFunc[I13, H13, APRHLLike13[I13, H13]] {
        override def takeHead(m: APRHLLike13[I13, H13]): I13 = ParameterSimpleSupport19Self.apH13.takeHead(m)
        override def takeTail(m: APRHLLike13[I13, H13]): H13 = ParameterSimpleSupport19Self.apH13.takeTail(m)
        override def append(h: I13, t: H13): APRHLLike13[I13, H13] = ParameterSimpleSupport19Self.apH13.append(h, t)
      }
      ,
      new ABCFunc[I14, H14, APRHLLike14[I14, H14]] {
        override def takeHead(m: APRHLLike14[I14, H14]): I14 = ParameterSimpleSupport19Self.apH14.takeHead(m)
        override def takeTail(m: APRHLLike14[I14, H14]): H14 = ParameterSimpleSupport19Self.apH14.takeTail(m)
        override def append(h: I14, t: H14): APRHLLike14[I14, H14] = ParameterSimpleSupport19Self.apH14.append(h, t)
      }
      ,
      new ABCFunc[I15, H15, APRHLLike15[I15, H15]] {
        override def takeHead(m: APRHLLike15[I15, H15]): I15 = ParameterSimpleSupport19Self.apH15.takeHead(m)
        override def takeTail(m: APRHLLike15[I15, H15]): H15 = ParameterSimpleSupport19Self.apH15.takeTail(m)
        override def append(h: I15, t: H15): APRHLLike15[I15, H15] = ParameterSimpleSupport19Self.apH15.append(h, t)
      }
      ,
      new ABCFunc[I16, H16, APRHLLike16[I16, H16]] {
        override def takeHead(m: APRHLLike16[I16, H16]): I16 = ParameterSimpleSupport19Self.apH16.takeHead(m)
        override def takeTail(m: APRHLLike16[I16, H16]): H16 = ParameterSimpleSupport19Self.apH16.takeTail(m)
        override def append(h: I16, t: H16): APRHLLike16[I16, H16] = ParameterSimpleSupport19Self.apH16.append(h, t)
      }
      ,
      new ABCFunc[I17, H17, APRHLLike17[I17, H17]] {
        override def takeHead(m: APRHLLike17[I17, H17]): I17 = ParameterSimpleSupport19Self.apH17.takeHead(m)
        override def takeTail(m: APRHLLike17[I17, H17]): H17 = ParameterSimpleSupport19Self.apH17.takeTail(m)
        override def append(h: I17, t: H17): APRHLLike17[I17, H17] = ParameterSimpleSupport19Self.apH17.append(h, t)
      }
      ,
      new ABCFunc[I18, H18, APRHLLike18[I18, H18]] {
        override def takeHead(m: APRHLLike18[I18, H18]): I18 = ParameterSimpleSupport19Self.apH18.takeHead(m)
        override def takeTail(m: APRHLLike18[I18, H18]): H18 = ParameterSimpleSupport19Self.apH18.takeTail(m)
        override def append(h: I18, t: H18): APRHLLike18[I18, H18] = ParameterSimpleSupport19Self.apH18.append(h, t)
      }
      ,
      new ABCFunc[I19, H19, APRHLLike19[I19, H19]] {
        override def takeHead(m: APRHLLike19[I19, H19]): I19 = ParameterSimpleSupport19Self.apH19.takeHead(m)
        override def takeTail(m: APRHLLike19[I19, H19]): H19 = ParameterSimpleSupport19Self.apH19.takeTail(m)
        override def append(h: I19, t: H19): APRHLLike19[I19, H19] = ParameterSimpleSupport19Self.apH19.append(h, t)
      }
      )(p1, p2)
        }
    
        
      def simpleAppender: SimpleAppender19Positive[M]
    
        
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

      trait ParameterSimpleSupport20[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],N20[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19,APRHLLike20[_, _ <: HLLike20] <: HLLike20
      ] extends ParameterNatSupport20[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20] {
        ParameterSimpleSupport20Self =>

        
      override final def content: AppenderNatSupport20[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20] =
        new AppenderNatSupport20[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20] {
          override def append[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12,I13,I14,I15,I16,I17,I18,I19,I20, H1 <: HLLike1,H2 <: HLLike2,H3 <: HLLike3,H4 <: HLLike4,H5 <: HLLike5,H6 <: HLLike6,H7 <: HLLike7,H8 <: HLLike8,H9 <: HLLike9,H10 <: HLLike10,H11 <: HLLike11,H12 <: HLLike12,H13 <: HLLike13,H14 <: HLLike14,H15 <: HLLike15,H16 <: HLLike16,H17 <: HLLike17,H18 <: HLLike18,H19 <: HLLike19,H20 <: HLLike20](p1: M[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12,I13,I14,I15,I16,I17,I18,I19,I20], p2: M[H1,H2,H3,H4,H5,H6,H7,H8,H9,H10,H11,H12,H13,H14,H15,H16,H17,H18,H19,H20]): M[APRHLLike1[I1, H1],APRHLLike2[I2, H2],APRHLLike3[I3, H3],APRHLLike4[I4, H4],APRHLLike5[I5, H5],APRHLLike6[I6, H6],APRHLLike7[I7, H7],APRHLLike8[I8, H8],APRHLLike9[I9, H9],APRHLLike10[I10, H10],APRHLLike11[I11, H11],APRHLLike12[I12, H12],APRHLLike13[I13, H13],APRHLLike14[I14, H14],APRHLLike15[I15, H15],APRHLLike16[I16, H16],APRHLLike17[I17, H17],APRHLLike18[I18, H18],APRHLLike19[I19, H19],APRHLLike20[I20, H20]] = ParameterSimpleSupport20Self
          .simpleAppender
          .append(
      new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
        override def takeHead(m: APRHLLike1[I1, H1]): I1 = ParameterSimpleSupport20Self.apH1.takeHead(m)
        override def takeTail(m: APRHLLike1[I1, H1]): H1 = ParameterSimpleSupport20Self.apH1.takeTail(m)
        override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport20Self.apH1.append(h, t)
      }
      ,
      new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
        override def takeHead(m: APRHLLike2[I2, H2]): I2 = ParameterSimpleSupport20Self.apH2.takeHead(m)
        override def takeTail(m: APRHLLike2[I2, H2]): H2 = ParameterSimpleSupport20Self.apH2.takeTail(m)
        override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport20Self.apH2.append(h, t)
      }
      ,
      new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
        override def takeHead(m: APRHLLike3[I3, H3]): I3 = ParameterSimpleSupport20Self.apH3.takeHead(m)
        override def takeTail(m: APRHLLike3[I3, H3]): H3 = ParameterSimpleSupport20Self.apH3.takeTail(m)
        override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport20Self.apH3.append(h, t)
      }
      ,
      new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
        override def takeHead(m: APRHLLike4[I4, H4]): I4 = ParameterSimpleSupport20Self.apH4.takeHead(m)
        override def takeTail(m: APRHLLike4[I4, H4]): H4 = ParameterSimpleSupport20Self.apH4.takeTail(m)
        override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport20Self.apH4.append(h, t)
      }
      ,
      new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
        override def takeHead(m: APRHLLike5[I5, H5]): I5 = ParameterSimpleSupport20Self.apH5.takeHead(m)
        override def takeTail(m: APRHLLike5[I5, H5]): H5 = ParameterSimpleSupport20Self.apH5.takeTail(m)
        override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport20Self.apH5.append(h, t)
      }
      ,
      new ABCFunc[I6, H6, APRHLLike6[I6, H6]] {
        override def takeHead(m: APRHLLike6[I6, H6]): I6 = ParameterSimpleSupport20Self.apH6.takeHead(m)
        override def takeTail(m: APRHLLike6[I6, H6]): H6 = ParameterSimpleSupport20Self.apH6.takeTail(m)
        override def append(h: I6, t: H6): APRHLLike6[I6, H6] = ParameterSimpleSupport20Self.apH6.append(h, t)
      }
      ,
      new ABCFunc[I7, H7, APRHLLike7[I7, H7]] {
        override def takeHead(m: APRHLLike7[I7, H7]): I7 = ParameterSimpleSupport20Self.apH7.takeHead(m)
        override def takeTail(m: APRHLLike7[I7, H7]): H7 = ParameterSimpleSupport20Self.apH7.takeTail(m)
        override def append(h: I7, t: H7): APRHLLike7[I7, H7] = ParameterSimpleSupport20Self.apH7.append(h, t)
      }
      ,
      new ABCFunc[I8, H8, APRHLLike8[I8, H8]] {
        override def takeHead(m: APRHLLike8[I8, H8]): I8 = ParameterSimpleSupport20Self.apH8.takeHead(m)
        override def takeTail(m: APRHLLike8[I8, H8]): H8 = ParameterSimpleSupport20Self.apH8.takeTail(m)
        override def append(h: I8, t: H8): APRHLLike8[I8, H8] = ParameterSimpleSupport20Self.apH8.append(h, t)
      }
      ,
      new ABCFunc[I9, H9, APRHLLike9[I9, H9]] {
        override def takeHead(m: APRHLLike9[I9, H9]): I9 = ParameterSimpleSupport20Self.apH9.takeHead(m)
        override def takeTail(m: APRHLLike9[I9, H9]): H9 = ParameterSimpleSupport20Self.apH9.takeTail(m)
        override def append(h: I9, t: H9): APRHLLike9[I9, H9] = ParameterSimpleSupport20Self.apH9.append(h, t)
      }
      ,
      new ABCFunc[I10, H10, APRHLLike10[I10, H10]] {
        override def takeHead(m: APRHLLike10[I10, H10]): I10 = ParameterSimpleSupport20Self.apH10.takeHead(m)
        override def takeTail(m: APRHLLike10[I10, H10]): H10 = ParameterSimpleSupport20Self.apH10.takeTail(m)
        override def append(h: I10, t: H10): APRHLLike10[I10, H10] = ParameterSimpleSupport20Self.apH10.append(h, t)
      }
      ,
      new ABCFunc[I11, H11, APRHLLike11[I11, H11]] {
        override def takeHead(m: APRHLLike11[I11, H11]): I11 = ParameterSimpleSupport20Self.apH11.takeHead(m)
        override def takeTail(m: APRHLLike11[I11, H11]): H11 = ParameterSimpleSupport20Self.apH11.takeTail(m)
        override def append(h: I11, t: H11): APRHLLike11[I11, H11] = ParameterSimpleSupport20Self.apH11.append(h, t)
      }
      ,
      new ABCFunc[I12, H12, APRHLLike12[I12, H12]] {
        override def takeHead(m: APRHLLike12[I12, H12]): I12 = ParameterSimpleSupport20Self.apH12.takeHead(m)
        override def takeTail(m: APRHLLike12[I12, H12]): H12 = ParameterSimpleSupport20Self.apH12.takeTail(m)
        override def append(h: I12, t: H12): APRHLLike12[I12, H12] = ParameterSimpleSupport20Self.apH12.append(h, t)
      }
      ,
      new ABCFunc[I13, H13, APRHLLike13[I13, H13]] {
        override def takeHead(m: APRHLLike13[I13, H13]): I13 = ParameterSimpleSupport20Self.apH13.takeHead(m)
        override def takeTail(m: APRHLLike13[I13, H13]): H13 = ParameterSimpleSupport20Self.apH13.takeTail(m)
        override def append(h: I13, t: H13): APRHLLike13[I13, H13] = ParameterSimpleSupport20Self.apH13.append(h, t)
      }
      ,
      new ABCFunc[I14, H14, APRHLLike14[I14, H14]] {
        override def takeHead(m: APRHLLike14[I14, H14]): I14 = ParameterSimpleSupport20Self.apH14.takeHead(m)
        override def takeTail(m: APRHLLike14[I14, H14]): H14 = ParameterSimpleSupport20Self.apH14.takeTail(m)
        override def append(h: I14, t: H14): APRHLLike14[I14, H14] = ParameterSimpleSupport20Self.apH14.append(h, t)
      }
      ,
      new ABCFunc[I15, H15, APRHLLike15[I15, H15]] {
        override def takeHead(m: APRHLLike15[I15, H15]): I15 = ParameterSimpleSupport20Self.apH15.takeHead(m)
        override def takeTail(m: APRHLLike15[I15, H15]): H15 = ParameterSimpleSupport20Self.apH15.takeTail(m)
        override def append(h: I15, t: H15): APRHLLike15[I15, H15] = ParameterSimpleSupport20Self.apH15.append(h, t)
      }
      ,
      new ABCFunc[I16, H16, APRHLLike16[I16, H16]] {
        override def takeHead(m: APRHLLike16[I16, H16]): I16 = ParameterSimpleSupport20Self.apH16.takeHead(m)
        override def takeTail(m: APRHLLike16[I16, H16]): H16 = ParameterSimpleSupport20Self.apH16.takeTail(m)
        override def append(h: I16, t: H16): APRHLLike16[I16, H16] = ParameterSimpleSupport20Self.apH16.append(h, t)
      }
      ,
      new ABCFunc[I17, H17, APRHLLike17[I17, H17]] {
        override def takeHead(m: APRHLLike17[I17, H17]): I17 = ParameterSimpleSupport20Self.apH17.takeHead(m)
        override def takeTail(m: APRHLLike17[I17, H17]): H17 = ParameterSimpleSupport20Self.apH17.takeTail(m)
        override def append(h: I17, t: H17): APRHLLike17[I17, H17] = ParameterSimpleSupport20Self.apH17.append(h, t)
      }
      ,
      new ABCFunc[I18, H18, APRHLLike18[I18, H18]] {
        override def takeHead(m: APRHLLike18[I18, H18]): I18 = ParameterSimpleSupport20Self.apH18.takeHead(m)
        override def takeTail(m: APRHLLike18[I18, H18]): H18 = ParameterSimpleSupport20Self.apH18.takeTail(m)
        override def append(h: I18, t: H18): APRHLLike18[I18, H18] = ParameterSimpleSupport20Self.apH18.append(h, t)
      }
      ,
      new ABCFunc[I19, H19, APRHLLike19[I19, H19]] {
        override def takeHead(m: APRHLLike19[I19, H19]): I19 = ParameterSimpleSupport20Self.apH19.takeHead(m)
        override def takeTail(m: APRHLLike19[I19, H19]): H19 = ParameterSimpleSupport20Self.apH19.takeTail(m)
        override def append(h: I19, t: H19): APRHLLike19[I19, H19] = ParameterSimpleSupport20Self.apH19.append(h, t)
      }
      ,
      new ABCFunc[I20, H20, APRHLLike20[I20, H20]] {
        override def takeHead(m: APRHLLike20[I20, H20]): I20 = ParameterSimpleSupport20Self.apH20.takeHead(m)
        override def takeTail(m: APRHLLike20[I20, H20]): H20 = ParameterSimpleSupport20Self.apH20.takeTail(m)
        override def append(h: I20, t: H20): APRHLLike20[I20, H20] = ParameterSimpleSupport20Self.apH20.append(h, t)
      }
      )(p1, p2)
        }
    
        
      def simpleAppender: SimpleAppender20Positive[M]
    
        
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

      trait ParameterSimpleSupport21[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],N20[_],N21[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19,APRHLLike20[_, _ <: HLLike20] <: HLLike20,APRHLLike21[_, _ <: HLLike21] <: HLLike21
      ] extends ParameterNatSupport21[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20,APRHLLike21] {
        ParameterSimpleSupport21Self =>

        
      override final def content: AppenderNatSupport21[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20,APRHLLike21] =
        new AppenderNatSupport21[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20,APRHLLike21] {
          override def append[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12,I13,I14,I15,I16,I17,I18,I19,I20,I21, H1 <: HLLike1,H2 <: HLLike2,H3 <: HLLike3,H4 <: HLLike4,H5 <: HLLike5,H6 <: HLLike6,H7 <: HLLike7,H8 <: HLLike8,H9 <: HLLike9,H10 <: HLLike10,H11 <: HLLike11,H12 <: HLLike12,H13 <: HLLike13,H14 <: HLLike14,H15 <: HLLike15,H16 <: HLLike16,H17 <: HLLike17,H18 <: HLLike18,H19 <: HLLike19,H20 <: HLLike20,H21 <: HLLike21](p1: M[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12,I13,I14,I15,I16,I17,I18,I19,I20,I21], p2: M[H1,H2,H3,H4,H5,H6,H7,H8,H9,H10,H11,H12,H13,H14,H15,H16,H17,H18,H19,H20,H21]): M[APRHLLike1[I1, H1],APRHLLike2[I2, H2],APRHLLike3[I3, H3],APRHLLike4[I4, H4],APRHLLike5[I5, H5],APRHLLike6[I6, H6],APRHLLike7[I7, H7],APRHLLike8[I8, H8],APRHLLike9[I9, H9],APRHLLike10[I10, H10],APRHLLike11[I11, H11],APRHLLike12[I12, H12],APRHLLike13[I13, H13],APRHLLike14[I14, H14],APRHLLike15[I15, H15],APRHLLike16[I16, H16],APRHLLike17[I17, H17],APRHLLike18[I18, H18],APRHLLike19[I19, H19],APRHLLike20[I20, H20],APRHLLike21[I21, H21]] = ParameterSimpleSupport21Self
          .simpleAppender
          .append(
      new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
        override def takeHead(m: APRHLLike1[I1, H1]): I1 = ParameterSimpleSupport21Self.apH1.takeHead(m)
        override def takeTail(m: APRHLLike1[I1, H1]): H1 = ParameterSimpleSupport21Self.apH1.takeTail(m)
        override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport21Self.apH1.append(h, t)
      }
      ,
      new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
        override def takeHead(m: APRHLLike2[I2, H2]): I2 = ParameterSimpleSupport21Self.apH2.takeHead(m)
        override def takeTail(m: APRHLLike2[I2, H2]): H2 = ParameterSimpleSupport21Self.apH2.takeTail(m)
        override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport21Self.apH2.append(h, t)
      }
      ,
      new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
        override def takeHead(m: APRHLLike3[I3, H3]): I3 = ParameterSimpleSupport21Self.apH3.takeHead(m)
        override def takeTail(m: APRHLLike3[I3, H3]): H3 = ParameterSimpleSupport21Self.apH3.takeTail(m)
        override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport21Self.apH3.append(h, t)
      }
      ,
      new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
        override def takeHead(m: APRHLLike4[I4, H4]): I4 = ParameterSimpleSupport21Self.apH4.takeHead(m)
        override def takeTail(m: APRHLLike4[I4, H4]): H4 = ParameterSimpleSupport21Self.apH4.takeTail(m)
        override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport21Self.apH4.append(h, t)
      }
      ,
      new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
        override def takeHead(m: APRHLLike5[I5, H5]): I5 = ParameterSimpleSupport21Self.apH5.takeHead(m)
        override def takeTail(m: APRHLLike5[I5, H5]): H5 = ParameterSimpleSupport21Self.apH5.takeTail(m)
        override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport21Self.apH5.append(h, t)
      }
      ,
      new ABCFunc[I6, H6, APRHLLike6[I6, H6]] {
        override def takeHead(m: APRHLLike6[I6, H6]): I6 = ParameterSimpleSupport21Self.apH6.takeHead(m)
        override def takeTail(m: APRHLLike6[I6, H6]): H6 = ParameterSimpleSupport21Self.apH6.takeTail(m)
        override def append(h: I6, t: H6): APRHLLike6[I6, H6] = ParameterSimpleSupport21Self.apH6.append(h, t)
      }
      ,
      new ABCFunc[I7, H7, APRHLLike7[I7, H7]] {
        override def takeHead(m: APRHLLike7[I7, H7]): I7 = ParameterSimpleSupport21Self.apH7.takeHead(m)
        override def takeTail(m: APRHLLike7[I7, H7]): H7 = ParameterSimpleSupport21Self.apH7.takeTail(m)
        override def append(h: I7, t: H7): APRHLLike7[I7, H7] = ParameterSimpleSupport21Self.apH7.append(h, t)
      }
      ,
      new ABCFunc[I8, H8, APRHLLike8[I8, H8]] {
        override def takeHead(m: APRHLLike8[I8, H8]): I8 = ParameterSimpleSupport21Self.apH8.takeHead(m)
        override def takeTail(m: APRHLLike8[I8, H8]): H8 = ParameterSimpleSupport21Self.apH8.takeTail(m)
        override def append(h: I8, t: H8): APRHLLike8[I8, H8] = ParameterSimpleSupport21Self.apH8.append(h, t)
      }
      ,
      new ABCFunc[I9, H9, APRHLLike9[I9, H9]] {
        override def takeHead(m: APRHLLike9[I9, H9]): I9 = ParameterSimpleSupport21Self.apH9.takeHead(m)
        override def takeTail(m: APRHLLike9[I9, H9]): H9 = ParameterSimpleSupport21Self.apH9.takeTail(m)
        override def append(h: I9, t: H9): APRHLLike9[I9, H9] = ParameterSimpleSupport21Self.apH9.append(h, t)
      }
      ,
      new ABCFunc[I10, H10, APRHLLike10[I10, H10]] {
        override def takeHead(m: APRHLLike10[I10, H10]): I10 = ParameterSimpleSupport21Self.apH10.takeHead(m)
        override def takeTail(m: APRHLLike10[I10, H10]): H10 = ParameterSimpleSupport21Self.apH10.takeTail(m)
        override def append(h: I10, t: H10): APRHLLike10[I10, H10] = ParameterSimpleSupport21Self.apH10.append(h, t)
      }
      ,
      new ABCFunc[I11, H11, APRHLLike11[I11, H11]] {
        override def takeHead(m: APRHLLike11[I11, H11]): I11 = ParameterSimpleSupport21Self.apH11.takeHead(m)
        override def takeTail(m: APRHLLike11[I11, H11]): H11 = ParameterSimpleSupport21Self.apH11.takeTail(m)
        override def append(h: I11, t: H11): APRHLLike11[I11, H11] = ParameterSimpleSupport21Self.apH11.append(h, t)
      }
      ,
      new ABCFunc[I12, H12, APRHLLike12[I12, H12]] {
        override def takeHead(m: APRHLLike12[I12, H12]): I12 = ParameterSimpleSupport21Self.apH12.takeHead(m)
        override def takeTail(m: APRHLLike12[I12, H12]): H12 = ParameterSimpleSupport21Self.apH12.takeTail(m)
        override def append(h: I12, t: H12): APRHLLike12[I12, H12] = ParameterSimpleSupport21Self.apH12.append(h, t)
      }
      ,
      new ABCFunc[I13, H13, APRHLLike13[I13, H13]] {
        override def takeHead(m: APRHLLike13[I13, H13]): I13 = ParameterSimpleSupport21Self.apH13.takeHead(m)
        override def takeTail(m: APRHLLike13[I13, H13]): H13 = ParameterSimpleSupport21Self.apH13.takeTail(m)
        override def append(h: I13, t: H13): APRHLLike13[I13, H13] = ParameterSimpleSupport21Self.apH13.append(h, t)
      }
      ,
      new ABCFunc[I14, H14, APRHLLike14[I14, H14]] {
        override def takeHead(m: APRHLLike14[I14, H14]): I14 = ParameterSimpleSupport21Self.apH14.takeHead(m)
        override def takeTail(m: APRHLLike14[I14, H14]): H14 = ParameterSimpleSupport21Self.apH14.takeTail(m)
        override def append(h: I14, t: H14): APRHLLike14[I14, H14] = ParameterSimpleSupport21Self.apH14.append(h, t)
      }
      ,
      new ABCFunc[I15, H15, APRHLLike15[I15, H15]] {
        override def takeHead(m: APRHLLike15[I15, H15]): I15 = ParameterSimpleSupport21Self.apH15.takeHead(m)
        override def takeTail(m: APRHLLike15[I15, H15]): H15 = ParameterSimpleSupport21Self.apH15.takeTail(m)
        override def append(h: I15, t: H15): APRHLLike15[I15, H15] = ParameterSimpleSupport21Self.apH15.append(h, t)
      }
      ,
      new ABCFunc[I16, H16, APRHLLike16[I16, H16]] {
        override def takeHead(m: APRHLLike16[I16, H16]): I16 = ParameterSimpleSupport21Self.apH16.takeHead(m)
        override def takeTail(m: APRHLLike16[I16, H16]): H16 = ParameterSimpleSupport21Self.apH16.takeTail(m)
        override def append(h: I16, t: H16): APRHLLike16[I16, H16] = ParameterSimpleSupport21Self.apH16.append(h, t)
      }
      ,
      new ABCFunc[I17, H17, APRHLLike17[I17, H17]] {
        override def takeHead(m: APRHLLike17[I17, H17]): I17 = ParameterSimpleSupport21Self.apH17.takeHead(m)
        override def takeTail(m: APRHLLike17[I17, H17]): H17 = ParameterSimpleSupport21Self.apH17.takeTail(m)
        override def append(h: I17, t: H17): APRHLLike17[I17, H17] = ParameterSimpleSupport21Self.apH17.append(h, t)
      }
      ,
      new ABCFunc[I18, H18, APRHLLike18[I18, H18]] {
        override def takeHead(m: APRHLLike18[I18, H18]): I18 = ParameterSimpleSupport21Self.apH18.takeHead(m)
        override def takeTail(m: APRHLLike18[I18, H18]): H18 = ParameterSimpleSupport21Self.apH18.takeTail(m)
        override def append(h: I18, t: H18): APRHLLike18[I18, H18] = ParameterSimpleSupport21Self.apH18.append(h, t)
      }
      ,
      new ABCFunc[I19, H19, APRHLLike19[I19, H19]] {
        override def takeHead(m: APRHLLike19[I19, H19]): I19 = ParameterSimpleSupport21Self.apH19.takeHead(m)
        override def takeTail(m: APRHLLike19[I19, H19]): H19 = ParameterSimpleSupport21Self.apH19.takeTail(m)
        override def append(h: I19, t: H19): APRHLLike19[I19, H19] = ParameterSimpleSupport21Self.apH19.append(h, t)
      }
      ,
      new ABCFunc[I20, H20, APRHLLike20[I20, H20]] {
        override def takeHead(m: APRHLLike20[I20, H20]): I20 = ParameterSimpleSupport21Self.apH20.takeHead(m)
        override def takeTail(m: APRHLLike20[I20, H20]): H20 = ParameterSimpleSupport21Self.apH20.takeTail(m)
        override def append(h: I20, t: H20): APRHLLike20[I20, H20] = ParameterSimpleSupport21Self.apH20.append(h, t)
      }
      ,
      new ABCFunc[I21, H21, APRHLLike21[I21, H21]] {
        override def takeHead(m: APRHLLike21[I21, H21]): I21 = ParameterSimpleSupport21Self.apH21.takeHead(m)
        override def takeTail(m: APRHLLike21[I21, H21]): H21 = ParameterSimpleSupport21Self.apH21.takeTail(m)
        override def append(h: I21, t: H21): APRHLLike21[I21, H21] = ParameterSimpleSupport21Self.apH21.append(h, t)
      }
      )(p1, p2)
        }
    
        
      def simpleAppender: SimpleAppender21Positive[M]
    
        
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

      trait ParameterSimpleSupport22[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],N20[_],N21[_],N22[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21,HLLike22,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19,APRHLLike20[_, _ <: HLLike20] <: HLLike20,APRHLLike21[_, _ <: HLLike21] <: HLLike21,APRHLLike22[_, _ <: HLLike22] <: HLLike22
      ] extends ParameterNatSupport22[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21,N22, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21,HLLike22, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20,APRHLLike21,APRHLLike22] {
        ParameterSimpleSupport22Self =>

        
      override final def content: AppenderNatSupport22[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21,HLLike22, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20,APRHLLike21,APRHLLike22] =
        new AppenderNatSupport22[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21,HLLike22, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20,APRHLLike21,APRHLLike22] {
          override def append[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12,I13,I14,I15,I16,I17,I18,I19,I20,I21,I22, H1 <: HLLike1,H2 <: HLLike2,H3 <: HLLike3,H4 <: HLLike4,H5 <: HLLike5,H6 <: HLLike6,H7 <: HLLike7,H8 <: HLLike8,H9 <: HLLike9,H10 <: HLLike10,H11 <: HLLike11,H12 <: HLLike12,H13 <: HLLike13,H14 <: HLLike14,H15 <: HLLike15,H16 <: HLLike16,H17 <: HLLike17,H18 <: HLLike18,H19 <: HLLike19,H20 <: HLLike20,H21 <: HLLike21,H22 <: HLLike22](p1: M[I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12,I13,I14,I15,I16,I17,I18,I19,I20,I21,I22], p2: M[H1,H2,H3,H4,H5,H6,H7,H8,H9,H10,H11,H12,H13,H14,H15,H16,H17,H18,H19,H20,H21,H22]): M[APRHLLike1[I1, H1],APRHLLike2[I2, H2],APRHLLike3[I3, H3],APRHLLike4[I4, H4],APRHLLike5[I5, H5],APRHLLike6[I6, H6],APRHLLike7[I7, H7],APRHLLike8[I8, H8],APRHLLike9[I9, H9],APRHLLike10[I10, H10],APRHLLike11[I11, H11],APRHLLike12[I12, H12],APRHLLike13[I13, H13],APRHLLike14[I14, H14],APRHLLike15[I15, H15],APRHLLike16[I16, H16],APRHLLike17[I17, H17],APRHLLike18[I18, H18],APRHLLike19[I19, H19],APRHLLike20[I20, H20],APRHLLike21[I21, H21],APRHLLike22[I22, H22]] = ParameterSimpleSupport22Self
          .simpleAppender
          .append(
      new ABCFunc[I1, H1, APRHLLike1[I1, H1]] {
        override def takeHead(m: APRHLLike1[I1, H1]): I1 = ParameterSimpleSupport22Self.apH1.takeHead(m)
        override def takeTail(m: APRHLLike1[I1, H1]): H1 = ParameterSimpleSupport22Self.apH1.takeTail(m)
        override def append(h: I1, t: H1): APRHLLike1[I1, H1] = ParameterSimpleSupport22Self.apH1.append(h, t)
      }
      ,
      new ABCFunc[I2, H2, APRHLLike2[I2, H2]] {
        override def takeHead(m: APRHLLike2[I2, H2]): I2 = ParameterSimpleSupport22Self.apH2.takeHead(m)
        override def takeTail(m: APRHLLike2[I2, H2]): H2 = ParameterSimpleSupport22Self.apH2.takeTail(m)
        override def append(h: I2, t: H2): APRHLLike2[I2, H2] = ParameterSimpleSupport22Self.apH2.append(h, t)
      }
      ,
      new ABCFunc[I3, H3, APRHLLike3[I3, H3]] {
        override def takeHead(m: APRHLLike3[I3, H3]): I3 = ParameterSimpleSupport22Self.apH3.takeHead(m)
        override def takeTail(m: APRHLLike3[I3, H3]): H3 = ParameterSimpleSupport22Self.apH3.takeTail(m)
        override def append(h: I3, t: H3): APRHLLike3[I3, H3] = ParameterSimpleSupport22Self.apH3.append(h, t)
      }
      ,
      new ABCFunc[I4, H4, APRHLLike4[I4, H4]] {
        override def takeHead(m: APRHLLike4[I4, H4]): I4 = ParameterSimpleSupport22Self.apH4.takeHead(m)
        override def takeTail(m: APRHLLike4[I4, H4]): H4 = ParameterSimpleSupport22Self.apH4.takeTail(m)
        override def append(h: I4, t: H4): APRHLLike4[I4, H4] = ParameterSimpleSupport22Self.apH4.append(h, t)
      }
      ,
      new ABCFunc[I5, H5, APRHLLike5[I5, H5]] {
        override def takeHead(m: APRHLLike5[I5, H5]): I5 = ParameterSimpleSupport22Self.apH5.takeHead(m)
        override def takeTail(m: APRHLLike5[I5, H5]): H5 = ParameterSimpleSupport22Self.apH5.takeTail(m)
        override def append(h: I5, t: H5): APRHLLike5[I5, H5] = ParameterSimpleSupport22Self.apH5.append(h, t)
      }
      ,
      new ABCFunc[I6, H6, APRHLLike6[I6, H6]] {
        override def takeHead(m: APRHLLike6[I6, H6]): I6 = ParameterSimpleSupport22Self.apH6.takeHead(m)
        override def takeTail(m: APRHLLike6[I6, H6]): H6 = ParameterSimpleSupport22Self.apH6.takeTail(m)
        override def append(h: I6, t: H6): APRHLLike6[I6, H6] = ParameterSimpleSupport22Self.apH6.append(h, t)
      }
      ,
      new ABCFunc[I7, H7, APRHLLike7[I7, H7]] {
        override def takeHead(m: APRHLLike7[I7, H7]): I7 = ParameterSimpleSupport22Self.apH7.takeHead(m)
        override def takeTail(m: APRHLLike7[I7, H7]): H7 = ParameterSimpleSupport22Self.apH7.takeTail(m)
        override def append(h: I7, t: H7): APRHLLike7[I7, H7] = ParameterSimpleSupport22Self.apH7.append(h, t)
      }
      ,
      new ABCFunc[I8, H8, APRHLLike8[I8, H8]] {
        override def takeHead(m: APRHLLike8[I8, H8]): I8 = ParameterSimpleSupport22Self.apH8.takeHead(m)
        override def takeTail(m: APRHLLike8[I8, H8]): H8 = ParameterSimpleSupport22Self.apH8.takeTail(m)
        override def append(h: I8, t: H8): APRHLLike8[I8, H8] = ParameterSimpleSupport22Self.apH8.append(h, t)
      }
      ,
      new ABCFunc[I9, H9, APRHLLike9[I9, H9]] {
        override def takeHead(m: APRHLLike9[I9, H9]): I9 = ParameterSimpleSupport22Self.apH9.takeHead(m)
        override def takeTail(m: APRHLLike9[I9, H9]): H9 = ParameterSimpleSupport22Self.apH9.takeTail(m)
        override def append(h: I9, t: H9): APRHLLike9[I9, H9] = ParameterSimpleSupport22Self.apH9.append(h, t)
      }
      ,
      new ABCFunc[I10, H10, APRHLLike10[I10, H10]] {
        override def takeHead(m: APRHLLike10[I10, H10]): I10 = ParameterSimpleSupport22Self.apH10.takeHead(m)
        override def takeTail(m: APRHLLike10[I10, H10]): H10 = ParameterSimpleSupport22Self.apH10.takeTail(m)
        override def append(h: I10, t: H10): APRHLLike10[I10, H10] = ParameterSimpleSupport22Self.apH10.append(h, t)
      }
      ,
      new ABCFunc[I11, H11, APRHLLike11[I11, H11]] {
        override def takeHead(m: APRHLLike11[I11, H11]): I11 = ParameterSimpleSupport22Self.apH11.takeHead(m)
        override def takeTail(m: APRHLLike11[I11, H11]): H11 = ParameterSimpleSupport22Self.apH11.takeTail(m)
        override def append(h: I11, t: H11): APRHLLike11[I11, H11] = ParameterSimpleSupport22Self.apH11.append(h, t)
      }
      ,
      new ABCFunc[I12, H12, APRHLLike12[I12, H12]] {
        override def takeHead(m: APRHLLike12[I12, H12]): I12 = ParameterSimpleSupport22Self.apH12.takeHead(m)
        override def takeTail(m: APRHLLike12[I12, H12]): H12 = ParameterSimpleSupport22Self.apH12.takeTail(m)
        override def append(h: I12, t: H12): APRHLLike12[I12, H12] = ParameterSimpleSupport22Self.apH12.append(h, t)
      }
      ,
      new ABCFunc[I13, H13, APRHLLike13[I13, H13]] {
        override def takeHead(m: APRHLLike13[I13, H13]): I13 = ParameterSimpleSupport22Self.apH13.takeHead(m)
        override def takeTail(m: APRHLLike13[I13, H13]): H13 = ParameterSimpleSupport22Self.apH13.takeTail(m)
        override def append(h: I13, t: H13): APRHLLike13[I13, H13] = ParameterSimpleSupport22Self.apH13.append(h, t)
      }
      ,
      new ABCFunc[I14, H14, APRHLLike14[I14, H14]] {
        override def takeHead(m: APRHLLike14[I14, H14]): I14 = ParameterSimpleSupport22Self.apH14.takeHead(m)
        override def takeTail(m: APRHLLike14[I14, H14]): H14 = ParameterSimpleSupport22Self.apH14.takeTail(m)
        override def append(h: I14, t: H14): APRHLLike14[I14, H14] = ParameterSimpleSupport22Self.apH14.append(h, t)
      }
      ,
      new ABCFunc[I15, H15, APRHLLike15[I15, H15]] {
        override def takeHead(m: APRHLLike15[I15, H15]): I15 = ParameterSimpleSupport22Self.apH15.takeHead(m)
        override def takeTail(m: APRHLLike15[I15, H15]): H15 = ParameterSimpleSupport22Self.apH15.takeTail(m)
        override def append(h: I15, t: H15): APRHLLike15[I15, H15] = ParameterSimpleSupport22Self.apH15.append(h, t)
      }
      ,
      new ABCFunc[I16, H16, APRHLLike16[I16, H16]] {
        override def takeHead(m: APRHLLike16[I16, H16]): I16 = ParameterSimpleSupport22Self.apH16.takeHead(m)
        override def takeTail(m: APRHLLike16[I16, H16]): H16 = ParameterSimpleSupport22Self.apH16.takeTail(m)
        override def append(h: I16, t: H16): APRHLLike16[I16, H16] = ParameterSimpleSupport22Self.apH16.append(h, t)
      }
      ,
      new ABCFunc[I17, H17, APRHLLike17[I17, H17]] {
        override def takeHead(m: APRHLLike17[I17, H17]): I17 = ParameterSimpleSupport22Self.apH17.takeHead(m)
        override def takeTail(m: APRHLLike17[I17, H17]): H17 = ParameterSimpleSupport22Self.apH17.takeTail(m)
        override def append(h: I17, t: H17): APRHLLike17[I17, H17] = ParameterSimpleSupport22Self.apH17.append(h, t)
      }
      ,
      new ABCFunc[I18, H18, APRHLLike18[I18, H18]] {
        override def takeHead(m: APRHLLike18[I18, H18]): I18 = ParameterSimpleSupport22Self.apH18.takeHead(m)
        override def takeTail(m: APRHLLike18[I18, H18]): H18 = ParameterSimpleSupport22Self.apH18.takeTail(m)
        override def append(h: I18, t: H18): APRHLLike18[I18, H18] = ParameterSimpleSupport22Self.apH18.append(h, t)
      }
      ,
      new ABCFunc[I19, H19, APRHLLike19[I19, H19]] {
        override def takeHead(m: APRHLLike19[I19, H19]): I19 = ParameterSimpleSupport22Self.apH19.takeHead(m)
        override def takeTail(m: APRHLLike19[I19, H19]): H19 = ParameterSimpleSupport22Self.apH19.takeTail(m)
        override def append(h: I19, t: H19): APRHLLike19[I19, H19] = ParameterSimpleSupport22Self.apH19.append(h, t)
      }
      ,
      new ABCFunc[I20, H20, APRHLLike20[I20, H20]] {
        override def takeHead(m: APRHLLike20[I20, H20]): I20 = ParameterSimpleSupport22Self.apH20.takeHead(m)
        override def takeTail(m: APRHLLike20[I20, H20]): H20 = ParameterSimpleSupport22Self.apH20.takeTail(m)
        override def append(h: I20, t: H20): APRHLLike20[I20, H20] = ParameterSimpleSupport22Self.apH20.append(h, t)
      }
      ,
      new ABCFunc[I21, H21, APRHLLike21[I21, H21]] {
        override def takeHead(m: APRHLLike21[I21, H21]): I21 = ParameterSimpleSupport22Self.apH21.takeHead(m)
        override def takeTail(m: APRHLLike21[I21, H21]): H21 = ParameterSimpleSupport22Self.apH21.takeTail(m)
        override def append(h: I21, t: H21): APRHLLike21[I21, H21] = ParameterSimpleSupport22Self.apH21.append(h, t)
      }
      ,
      new ABCFunc[I22, H22, APRHLLike22[I22, H22]] {
        override def takeHead(m: APRHLLike22[I22, H22]): I22 = ParameterSimpleSupport22Self.apH22.takeHead(m)
        override def takeTail(m: APRHLLike22[I22, H22]): H22 = ParameterSimpleSupport22Self.apH22.takeTail(m)
        override def append(h: I22, t: H22): APRHLLike22[I22, H22] = ParameterSimpleSupport22Self.apH22.append(h, t)
      }
      )(p1, p2)
        }
    
        
      def simpleAppender: SimpleAppender22Positive[M]
    
        
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
  