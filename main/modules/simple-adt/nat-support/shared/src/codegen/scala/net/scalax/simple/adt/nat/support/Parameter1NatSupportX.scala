
    package net.scalax.simple.adt
    package nat
    package support

    
      trait Parameter1NatSupport1[
        M[_],
        N1[_],
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends Parameter10NatSupport1[
        M,
        ({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N1[U1] })#TypeXM,
        HLLike1,
        APRHLLike1
      ] {
        Parameter1NatSupport1Self =>

        
      final def append1[Item, HCollection1 <: HLLike1](p1: M[HCollection1]): M[APRHLLike1[N1[Item], HCollection1]] = Parameter1NatSupport1Self.append10[Item, Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any, HCollection1](p1)
    

        
      override def content: AppenderNatSupport1[M, HLLike1, APRHLLike1]
    
        
      override def typeGen: TypeGen1[M, N1]
    
      }

      trait Parameter1NatSupport2[
        M[_,_],
        N1[_],N2[_],
        HLLike1,HLLike2,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2
      ] extends Parameter10NatSupport2[
        M,
        ({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N1[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N2[U1] })#TypeXM,
        HLLike1,HLLike2,
        APRHLLike1,APRHLLike2
      ] {
        Parameter1NatSupport2Self =>

        
      final def append1[Item, HCollection1 <: HLLike1,HCollection2 <: HLLike2](p1: M[HCollection1,HCollection2]): M[APRHLLike1[N1[Item], HCollection1],APRHLLike2[N2[Item], HCollection2]] = Parameter1NatSupport2Self.append10[Item, Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any, HCollection1,HCollection2](p1)
    

        
      override def content: AppenderNatSupport2[M, HLLike1,HLLike2, APRHLLike1,APRHLLike2]
    
        
      override def typeGen: TypeGen2[M, N1,N2]
    
      }

      trait Parameter1NatSupport3[
        M[_,_,_],
        N1[_],N2[_],N3[_],
        HLLike1,HLLike2,HLLike3,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3
      ] extends Parameter10NatSupport3[
        M,
        ({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N1[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N2[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N3[U1] })#TypeXM,
        HLLike1,HLLike2,HLLike3,
        APRHLLike1,APRHLLike2,APRHLLike3
      ] {
        Parameter1NatSupport3Self =>

        
      final def append1[Item, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3](p1: M[HCollection1,HCollection2,HCollection3]): M[APRHLLike1[N1[Item], HCollection1],APRHLLike2[N2[Item], HCollection2],APRHLLike3[N3[Item], HCollection3]] = Parameter1NatSupport3Self.append10[Item, Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any, HCollection1,HCollection2,HCollection3](p1)
    

        
      override def content: AppenderNatSupport3[M, HLLike1,HLLike2,HLLike3, APRHLLike1,APRHLLike2,APRHLLike3]
    
        
      override def typeGen: TypeGen3[M, N1,N2,N3]
    
      }

      trait Parameter1NatSupport4[
        M[_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],
        HLLike1,HLLike2,HLLike3,HLLike4,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4
      ] extends Parameter10NatSupport4[
        M,
        ({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N1[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N2[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N3[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N4[U1] })#TypeXM,
        HLLike1,HLLike2,HLLike3,HLLike4,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4
      ] {
        Parameter1NatSupport4Self =>

        
      final def append1[Item, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4](p1: M[HCollection1,HCollection2,HCollection3,HCollection4]): M[APRHLLike1[N1[Item], HCollection1],APRHLLike2[N2[Item], HCollection2],APRHLLike3[N3[Item], HCollection3],APRHLLike4[N4[Item], HCollection4]] = Parameter1NatSupport4Self.append10[Item, Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any, HCollection1,HCollection2,HCollection3,HCollection4](p1)
    

        
      override def content: AppenderNatSupport4[M, HLLike1,HLLike2,HLLike3,HLLike4, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4]
    
        
      override def typeGen: TypeGen4[M, N1,N2,N3,N4]
    
      }

      trait Parameter1NatSupport5[
        M[_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5
      ] extends Parameter10NatSupport5[
        M,
        ({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N1[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N2[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N3[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N4[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N5[U1] })#TypeXM,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5
      ] {
        Parameter1NatSupport5Self =>

        
      final def append1[Item, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5](p1: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5]): M[APRHLLike1[N1[Item], HCollection1],APRHLLike2[N2[Item], HCollection2],APRHLLike3[N3[Item], HCollection3],APRHLLike4[N4[Item], HCollection4],APRHLLike5[N5[Item], HCollection5]] = Parameter1NatSupport5Self.append10[Item, Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5](p1)
    

        
      override def content: AppenderNatSupport5[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5]
    
        
      override def typeGen: TypeGen5[M, N1,N2,N3,N4,N5]
    
      }

      trait Parameter1NatSupport6[
        M[_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6
      ] extends Parameter10NatSupport6[
        M,
        ({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N1[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N2[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N3[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N4[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N5[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N6[U1] })#TypeXM,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6
      ] {
        Parameter1NatSupport6Self =>

        
      final def append1[Item, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6](p1: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6]): M[APRHLLike1[N1[Item], HCollection1],APRHLLike2[N2[Item], HCollection2],APRHLLike3[N3[Item], HCollection3],APRHLLike4[N4[Item], HCollection4],APRHLLike5[N5[Item], HCollection5],APRHLLike6[N6[Item], HCollection6]] = Parameter1NatSupport6Self.append10[Item, Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6](p1)
    

        
      override def content: AppenderNatSupport6[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6]
    
        
      override def typeGen: TypeGen6[M, N1,N2,N3,N4,N5,N6]
    
      }

      trait Parameter1NatSupport7[
        M[_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7
      ] extends Parameter10NatSupport7[
        M,
        ({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N1[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N2[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N3[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N4[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N5[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N6[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N7[U1] })#TypeXM,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7
      ] {
        Parameter1NatSupport7Self =>

        
      final def append1[Item, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7](p1: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7]): M[APRHLLike1[N1[Item], HCollection1],APRHLLike2[N2[Item], HCollection2],APRHLLike3[N3[Item], HCollection3],APRHLLike4[N4[Item], HCollection4],APRHLLike5[N5[Item], HCollection5],APRHLLike6[N6[Item], HCollection6],APRHLLike7[N7[Item], HCollection7]] = Parameter1NatSupport7Self.append10[Item, Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7](p1)
    

        
      override def content: AppenderNatSupport7[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7]
    
        
      override def typeGen: TypeGen7[M, N1,N2,N3,N4,N5,N6,N7]
    
      }

      trait Parameter1NatSupport8[
        M[_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8
      ] extends Parameter10NatSupport8[
        M,
        ({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N1[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N2[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N3[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N4[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N5[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N6[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N7[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N8[U1] })#TypeXM,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8
      ] {
        Parameter1NatSupport8Self =>

        
      final def append1[Item, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8](p1: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8]): M[APRHLLike1[N1[Item], HCollection1],APRHLLike2[N2[Item], HCollection2],APRHLLike3[N3[Item], HCollection3],APRHLLike4[N4[Item], HCollection4],APRHLLike5[N5[Item], HCollection5],APRHLLike6[N6[Item], HCollection6],APRHLLike7[N7[Item], HCollection7],APRHLLike8[N8[Item], HCollection8]] = Parameter1NatSupport8Self.append10[Item, Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8](p1)
    

        
      override def content: AppenderNatSupport8[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8]
    
        
      override def typeGen: TypeGen8[M, N1,N2,N3,N4,N5,N6,N7,N8]
    
      }

      trait Parameter1NatSupport9[
        M[_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9
      ] extends Parameter10NatSupport9[
        M,
        ({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N1[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N2[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N3[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N4[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N5[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N6[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N7[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N8[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N9[U1] })#TypeXM,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9
      ] {
        Parameter1NatSupport9Self =>

        
      final def append1[Item, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9](p1: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9]): M[APRHLLike1[N1[Item], HCollection1],APRHLLike2[N2[Item], HCollection2],APRHLLike3[N3[Item], HCollection3],APRHLLike4[N4[Item], HCollection4],APRHLLike5[N5[Item], HCollection5],APRHLLike6[N6[Item], HCollection6],APRHLLike7[N7[Item], HCollection7],APRHLLike8[N8[Item], HCollection8],APRHLLike9[N9[Item], HCollection9]] = Parameter1NatSupport9Self.append10[Item, Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9](p1)
    

        
      override def content: AppenderNatSupport9[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9]
    
        
      override def typeGen: TypeGen9[M, N1,N2,N3,N4,N5,N6,N7,N8,N9]
    
      }

      trait Parameter1NatSupport10[
        M[_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10
      ] extends Parameter10NatSupport10[
        M,
        ({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N1[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N2[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N3[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N4[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N5[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N6[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N7[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N8[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N9[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N10[U1] })#TypeXM,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10
      ] {
        Parameter1NatSupport10Self =>

        
      final def append1[Item, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10](p1: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10]): M[APRHLLike1[N1[Item], HCollection1],APRHLLike2[N2[Item], HCollection2],APRHLLike3[N3[Item], HCollection3],APRHLLike4[N4[Item], HCollection4],APRHLLike5[N5[Item], HCollection5],APRHLLike6[N6[Item], HCollection6],APRHLLike7[N7[Item], HCollection7],APRHLLike8[N8[Item], HCollection8],APRHLLike9[N9[Item], HCollection9],APRHLLike10[N10[Item], HCollection10]] = Parameter1NatSupport10Self.append10[Item, Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10](p1)
    

        
      override def content: AppenderNatSupport10[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10]
    
        
      override def typeGen: TypeGen10[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10]
    
      }

      trait Parameter1NatSupport11[
        M[_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11
      ] extends Parameter10NatSupport11[
        M,
        ({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N1[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N2[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N3[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N4[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N5[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N6[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N7[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N8[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N9[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N10[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N11[U1] })#TypeXM,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11
      ] {
        Parameter1NatSupport11Self =>

        
      final def append1[Item, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11](p1: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11]): M[APRHLLike1[N1[Item], HCollection1],APRHLLike2[N2[Item], HCollection2],APRHLLike3[N3[Item], HCollection3],APRHLLike4[N4[Item], HCollection4],APRHLLike5[N5[Item], HCollection5],APRHLLike6[N6[Item], HCollection6],APRHLLike7[N7[Item], HCollection7],APRHLLike8[N8[Item], HCollection8],APRHLLike9[N9[Item], HCollection9],APRHLLike10[N10[Item], HCollection10],APRHLLike11[N11[Item], HCollection11]] = Parameter1NatSupport11Self.append10[Item, Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11](p1)
    

        
      override def content: AppenderNatSupport11[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11]
    
        
      override def typeGen: TypeGen11[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11]
    
      }

      trait Parameter1NatSupport12[
        M[_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12
      ] extends Parameter10NatSupport12[
        M,
        ({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N1[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N2[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N3[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N4[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N5[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N6[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N7[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N8[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N9[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N10[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N11[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N12[U1] })#TypeXM,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12
      ] {
        Parameter1NatSupport12Self =>

        
      final def append1[Item, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12](p1: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12]): M[APRHLLike1[N1[Item], HCollection1],APRHLLike2[N2[Item], HCollection2],APRHLLike3[N3[Item], HCollection3],APRHLLike4[N4[Item], HCollection4],APRHLLike5[N5[Item], HCollection5],APRHLLike6[N6[Item], HCollection6],APRHLLike7[N7[Item], HCollection7],APRHLLike8[N8[Item], HCollection8],APRHLLike9[N9[Item], HCollection9],APRHLLike10[N10[Item], HCollection10],APRHLLike11[N11[Item], HCollection11],APRHLLike12[N12[Item], HCollection12]] = Parameter1NatSupport12Self.append10[Item, Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12](p1)
    

        
      override def content: AppenderNatSupport12[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12]
    
        
      override def typeGen: TypeGen12[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12]
    
      }

      trait Parameter1NatSupport13[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13
      ] extends Parameter10NatSupport13[
        M,
        ({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N1[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N2[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N3[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N4[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N5[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N6[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N7[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N8[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N9[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N10[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N11[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N12[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N13[U1] })#TypeXM,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13
      ] {
        Parameter1NatSupport13Self =>

        
      final def append1[Item, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13](p1: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13]): M[APRHLLike1[N1[Item], HCollection1],APRHLLike2[N2[Item], HCollection2],APRHLLike3[N3[Item], HCollection3],APRHLLike4[N4[Item], HCollection4],APRHLLike5[N5[Item], HCollection5],APRHLLike6[N6[Item], HCollection6],APRHLLike7[N7[Item], HCollection7],APRHLLike8[N8[Item], HCollection8],APRHLLike9[N9[Item], HCollection9],APRHLLike10[N10[Item], HCollection10],APRHLLike11[N11[Item], HCollection11],APRHLLike12[N12[Item], HCollection12],APRHLLike13[N13[Item], HCollection13]] = Parameter1NatSupport13Self.append10[Item, Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13](p1)
    

        
      override def content: AppenderNatSupport13[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13]
    
        
      override def typeGen: TypeGen13[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13]
    
      }

      trait Parameter1NatSupport14[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14
      ] extends Parameter10NatSupport14[
        M,
        ({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N1[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N2[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N3[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N4[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N5[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N6[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N7[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N8[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N9[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N10[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N11[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N12[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N13[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N14[U1] })#TypeXM,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14
      ] {
        Parameter1NatSupport14Self =>

        
      final def append1[Item, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14](p1: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14]): M[APRHLLike1[N1[Item], HCollection1],APRHLLike2[N2[Item], HCollection2],APRHLLike3[N3[Item], HCollection3],APRHLLike4[N4[Item], HCollection4],APRHLLike5[N5[Item], HCollection5],APRHLLike6[N6[Item], HCollection6],APRHLLike7[N7[Item], HCollection7],APRHLLike8[N8[Item], HCollection8],APRHLLike9[N9[Item], HCollection9],APRHLLike10[N10[Item], HCollection10],APRHLLike11[N11[Item], HCollection11],APRHLLike12[N12[Item], HCollection12],APRHLLike13[N13[Item], HCollection13],APRHLLike14[N14[Item], HCollection14]] = Parameter1NatSupport14Self.append10[Item, Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14](p1)
    

        
      override def content: AppenderNatSupport14[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14]
    
        
      override def typeGen: TypeGen14[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14]
    
      }

      trait Parameter1NatSupport15[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15
      ] extends Parameter10NatSupport15[
        M,
        ({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N1[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N2[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N3[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N4[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N5[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N6[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N7[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N8[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N9[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N10[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N11[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N12[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N13[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N14[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N15[U1] })#TypeXM,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15
      ] {
        Parameter1NatSupport15Self =>

        
      final def append1[Item, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15](p1: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15]): M[APRHLLike1[N1[Item], HCollection1],APRHLLike2[N2[Item], HCollection2],APRHLLike3[N3[Item], HCollection3],APRHLLike4[N4[Item], HCollection4],APRHLLike5[N5[Item], HCollection5],APRHLLike6[N6[Item], HCollection6],APRHLLike7[N7[Item], HCollection7],APRHLLike8[N8[Item], HCollection8],APRHLLike9[N9[Item], HCollection9],APRHLLike10[N10[Item], HCollection10],APRHLLike11[N11[Item], HCollection11],APRHLLike12[N12[Item], HCollection12],APRHLLike13[N13[Item], HCollection13],APRHLLike14[N14[Item], HCollection14],APRHLLike15[N15[Item], HCollection15]] = Parameter1NatSupport15Self.append10[Item, Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15](p1)
    

        
      override def content: AppenderNatSupport15[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15]
    
        
      override def typeGen: TypeGen15[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15]
    
      }

      trait Parameter1NatSupport16[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16
      ] extends Parameter10NatSupport16[
        M,
        ({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N1[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N2[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N3[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N4[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N5[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N6[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N7[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N8[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N9[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N10[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N11[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N12[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N13[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N14[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N15[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N16[U1] })#TypeXM,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16
      ] {
        Parameter1NatSupport16Self =>

        
      final def append1[Item, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16](p1: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16]): M[APRHLLike1[N1[Item], HCollection1],APRHLLike2[N2[Item], HCollection2],APRHLLike3[N3[Item], HCollection3],APRHLLike4[N4[Item], HCollection4],APRHLLike5[N5[Item], HCollection5],APRHLLike6[N6[Item], HCollection6],APRHLLike7[N7[Item], HCollection7],APRHLLike8[N8[Item], HCollection8],APRHLLike9[N9[Item], HCollection9],APRHLLike10[N10[Item], HCollection10],APRHLLike11[N11[Item], HCollection11],APRHLLike12[N12[Item], HCollection12],APRHLLike13[N13[Item], HCollection13],APRHLLike14[N14[Item], HCollection14],APRHLLike15[N15[Item], HCollection15],APRHLLike16[N16[Item], HCollection16]] = Parameter1NatSupport16Self.append10[Item, Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16](p1)
    

        
      override def content: AppenderNatSupport16[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16]
    
        
      override def typeGen: TypeGen16[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16]
    
      }

      trait Parameter1NatSupport17[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17
      ] extends Parameter10NatSupport17[
        M,
        ({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N1[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N2[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N3[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N4[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N5[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N6[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N7[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N8[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N9[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N10[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N11[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N12[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N13[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N14[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N15[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N16[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N17[U1] })#TypeXM,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17
      ] {
        Parameter1NatSupport17Self =>

        
      final def append1[Item, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17](p1: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17]): M[APRHLLike1[N1[Item], HCollection1],APRHLLike2[N2[Item], HCollection2],APRHLLike3[N3[Item], HCollection3],APRHLLike4[N4[Item], HCollection4],APRHLLike5[N5[Item], HCollection5],APRHLLike6[N6[Item], HCollection6],APRHLLike7[N7[Item], HCollection7],APRHLLike8[N8[Item], HCollection8],APRHLLike9[N9[Item], HCollection9],APRHLLike10[N10[Item], HCollection10],APRHLLike11[N11[Item], HCollection11],APRHLLike12[N12[Item], HCollection12],APRHLLike13[N13[Item], HCollection13],APRHLLike14[N14[Item], HCollection14],APRHLLike15[N15[Item], HCollection15],APRHLLike16[N16[Item], HCollection16],APRHLLike17[N17[Item], HCollection17]] = Parameter1NatSupport17Self.append10[Item, Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17](p1)
    

        
      override def content: AppenderNatSupport17[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17]
    
        
      override def typeGen: TypeGen17[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17]
    
      }

      trait Parameter1NatSupport18[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18
      ] extends Parameter10NatSupport18[
        M,
        ({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N1[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N2[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N3[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N4[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N5[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N6[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N7[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N8[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N9[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N10[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N11[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N12[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N13[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N14[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N15[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N16[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N17[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N18[U1] })#TypeXM,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18
      ] {
        Parameter1NatSupport18Self =>

        
      final def append1[Item, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17,HCollection18 <: HLLike18](p1: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18]): M[APRHLLike1[N1[Item], HCollection1],APRHLLike2[N2[Item], HCollection2],APRHLLike3[N3[Item], HCollection3],APRHLLike4[N4[Item], HCollection4],APRHLLike5[N5[Item], HCollection5],APRHLLike6[N6[Item], HCollection6],APRHLLike7[N7[Item], HCollection7],APRHLLike8[N8[Item], HCollection8],APRHLLike9[N9[Item], HCollection9],APRHLLike10[N10[Item], HCollection10],APRHLLike11[N11[Item], HCollection11],APRHLLike12[N12[Item], HCollection12],APRHLLike13[N13[Item], HCollection13],APRHLLike14[N14[Item], HCollection14],APRHLLike15[N15[Item], HCollection15],APRHLLike16[N16[Item], HCollection16],APRHLLike17[N17[Item], HCollection17],APRHLLike18[N18[Item], HCollection18]] = Parameter1NatSupport18Self.append10[Item, Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18](p1)
    

        
      override def content: AppenderNatSupport18[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18]
    
        
      override def typeGen: TypeGen18[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18]
    
      }

      trait Parameter1NatSupport19[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19
      ] extends Parameter10NatSupport19[
        M,
        ({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N1[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N2[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N3[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N4[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N5[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N6[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N7[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N8[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N9[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N10[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N11[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N12[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N13[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N14[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N15[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N16[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N17[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N18[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N19[U1] })#TypeXM,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19
      ] {
        Parameter1NatSupport19Self =>

        
      final def append1[Item, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17,HCollection18 <: HLLike18,HCollection19 <: HLLike19](p1: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19]): M[APRHLLike1[N1[Item], HCollection1],APRHLLike2[N2[Item], HCollection2],APRHLLike3[N3[Item], HCollection3],APRHLLike4[N4[Item], HCollection4],APRHLLike5[N5[Item], HCollection5],APRHLLike6[N6[Item], HCollection6],APRHLLike7[N7[Item], HCollection7],APRHLLike8[N8[Item], HCollection8],APRHLLike9[N9[Item], HCollection9],APRHLLike10[N10[Item], HCollection10],APRHLLike11[N11[Item], HCollection11],APRHLLike12[N12[Item], HCollection12],APRHLLike13[N13[Item], HCollection13],APRHLLike14[N14[Item], HCollection14],APRHLLike15[N15[Item], HCollection15],APRHLLike16[N16[Item], HCollection16],APRHLLike17[N17[Item], HCollection17],APRHLLike18[N18[Item], HCollection18],APRHLLike19[N19[Item], HCollection19]] = Parameter1NatSupport19Self.append10[Item, Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19](p1)
    

        
      override def content: AppenderNatSupport19[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19]
    
        
      override def typeGen: TypeGen19[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19]
    
      }

      trait Parameter1NatSupport20[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],N20[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19,APRHLLike20[_, _ <: HLLike20] <: HLLike20
      ] extends Parameter10NatSupport20[
        M,
        ({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N1[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N2[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N3[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N4[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N5[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N6[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N7[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N8[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N9[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N10[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N11[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N12[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N13[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N14[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N15[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N16[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N17[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N18[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N19[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N20[U1] })#TypeXM,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20
      ] {
        Parameter1NatSupport20Self =>

        
      final def append1[Item, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17,HCollection18 <: HLLike18,HCollection19 <: HLLike19,HCollection20 <: HLLike20](p1: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20]): M[APRHLLike1[N1[Item], HCollection1],APRHLLike2[N2[Item], HCollection2],APRHLLike3[N3[Item], HCollection3],APRHLLike4[N4[Item], HCollection4],APRHLLike5[N5[Item], HCollection5],APRHLLike6[N6[Item], HCollection6],APRHLLike7[N7[Item], HCollection7],APRHLLike8[N8[Item], HCollection8],APRHLLike9[N9[Item], HCollection9],APRHLLike10[N10[Item], HCollection10],APRHLLike11[N11[Item], HCollection11],APRHLLike12[N12[Item], HCollection12],APRHLLike13[N13[Item], HCollection13],APRHLLike14[N14[Item], HCollection14],APRHLLike15[N15[Item], HCollection15],APRHLLike16[N16[Item], HCollection16],APRHLLike17[N17[Item], HCollection17],APRHLLike18[N18[Item], HCollection18],APRHLLike19[N19[Item], HCollection19],APRHLLike20[N20[Item], HCollection20]] = Parameter1NatSupport20Self.append10[Item, Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20](p1)
    

        
      override def content: AppenderNatSupport20[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20]
    
        
      override def typeGen: TypeGen20[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20]
    
      }

      trait Parameter1NatSupport21[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],N20[_],N21[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19,APRHLLike20[_, _ <: HLLike20] <: HLLike20,APRHLLike21[_, _ <: HLLike21] <: HLLike21
      ] extends Parameter10NatSupport21[
        M,
        ({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N1[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N2[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N3[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N4[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N5[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N6[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N7[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N8[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N9[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N10[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N11[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N12[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N13[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N14[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N15[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N16[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N17[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N18[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N19[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N20[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N21[U1] })#TypeXM,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20,APRHLLike21
      ] {
        Parameter1NatSupport21Self =>

        
      final def append1[Item, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17,HCollection18 <: HLLike18,HCollection19 <: HLLike19,HCollection20 <: HLLike20,HCollection21 <: HLLike21](p1: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20,HCollection21]): M[APRHLLike1[N1[Item], HCollection1],APRHLLike2[N2[Item], HCollection2],APRHLLike3[N3[Item], HCollection3],APRHLLike4[N4[Item], HCollection4],APRHLLike5[N5[Item], HCollection5],APRHLLike6[N6[Item], HCollection6],APRHLLike7[N7[Item], HCollection7],APRHLLike8[N8[Item], HCollection8],APRHLLike9[N9[Item], HCollection9],APRHLLike10[N10[Item], HCollection10],APRHLLike11[N11[Item], HCollection11],APRHLLike12[N12[Item], HCollection12],APRHLLike13[N13[Item], HCollection13],APRHLLike14[N14[Item], HCollection14],APRHLLike15[N15[Item], HCollection15],APRHLLike16[N16[Item], HCollection16],APRHLLike17[N17[Item], HCollection17],APRHLLike18[N18[Item], HCollection18],APRHLLike19[N19[Item], HCollection19],APRHLLike20[N20[Item], HCollection20],APRHLLike21[N21[Item], HCollection21]] = Parameter1NatSupport21Self.append10[Item, Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20,HCollection21](p1)
    

        
      override def content: AppenderNatSupport21[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20,APRHLLike21]
    
        
      override def typeGen: TypeGen21[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21]
    
      }

      trait Parameter1NatSupport22[
        M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_],
        N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],N20[_],N21[_],N22[_],
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21,HLLike22,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1,APRHLLike2[_, _ <: HLLike2] <: HLLike2,APRHLLike3[_, _ <: HLLike3] <: HLLike3,APRHLLike4[_, _ <: HLLike4] <: HLLike4,APRHLLike5[_, _ <: HLLike5] <: HLLike5,APRHLLike6[_, _ <: HLLike6] <: HLLike6,APRHLLike7[_, _ <: HLLike7] <: HLLike7,APRHLLike8[_, _ <: HLLike8] <: HLLike8,APRHLLike9[_, _ <: HLLike9] <: HLLike9,APRHLLike10[_, _ <: HLLike10] <: HLLike10,APRHLLike11[_, _ <: HLLike11] <: HLLike11,APRHLLike12[_, _ <: HLLike12] <: HLLike12,APRHLLike13[_, _ <: HLLike13] <: HLLike13,APRHLLike14[_, _ <: HLLike14] <: HLLike14,APRHLLike15[_, _ <: HLLike15] <: HLLike15,APRHLLike16[_, _ <: HLLike16] <: HLLike16,APRHLLike17[_, _ <: HLLike17] <: HLLike17,APRHLLike18[_, _ <: HLLike18] <: HLLike18,APRHLLike19[_, _ <: HLLike19] <: HLLike19,APRHLLike20[_, _ <: HLLike20] <: HLLike20,APRHLLike21[_, _ <: HLLike21] <: HLLike21,APRHLLike22[_, _ <: HLLike22] <: HLLike22
      ] extends Parameter10NatSupport22[
        M,
        ({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N1[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N2[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N3[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N4[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N5[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N6[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N7[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N8[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N9[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N10[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N11[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N12[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N13[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N14[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N15[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N16[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N17[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N18[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N19[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N20[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N21[U1] })#TypeXM,({ type TypeXM[U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22] = N22[U1] })#TypeXM,
        HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21,HLLike22,
        APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20,APRHLLike21,APRHLLike22
      ] {
        Parameter1NatSupport22Self =>

        
      final def append1[Item, HCollection1 <: HLLike1,HCollection2 <: HLLike2,HCollection3 <: HLLike3,HCollection4 <: HLLike4,HCollection5 <: HLLike5,HCollection6 <: HLLike6,HCollection7 <: HLLike7,HCollection8 <: HLLike8,HCollection9 <: HLLike9,HCollection10 <: HLLike10,HCollection11 <: HLLike11,HCollection12 <: HLLike12,HCollection13 <: HLLike13,HCollection14 <: HLLike14,HCollection15 <: HLLike15,HCollection16 <: HLLike16,HCollection17 <: HLLike17,HCollection18 <: HLLike18,HCollection19 <: HLLike19,HCollection20 <: HLLike20,HCollection21 <: HLLike21,HCollection22 <: HLLike22](p1: M[HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20,HCollection21,HCollection22]): M[APRHLLike1[N1[Item], HCollection1],APRHLLike2[N2[Item], HCollection2],APRHLLike3[N3[Item], HCollection3],APRHLLike4[N4[Item], HCollection4],APRHLLike5[N5[Item], HCollection5],APRHLLike6[N6[Item], HCollection6],APRHLLike7[N7[Item], HCollection7],APRHLLike8[N8[Item], HCollection8],APRHLLike9[N9[Item], HCollection9],APRHLLike10[N10[Item], HCollection10],APRHLLike11[N11[Item], HCollection11],APRHLLike12[N12[Item], HCollection12],APRHLLike13[N13[Item], HCollection13],APRHLLike14[N14[Item], HCollection14],APRHLLike15[N15[Item], HCollection15],APRHLLike16[N16[Item], HCollection16],APRHLLike17[N17[Item], HCollection17],APRHLLike18[N18[Item], HCollection18],APRHLLike19[N19[Item], HCollection19],APRHLLike20[N20[Item], HCollection20],APRHLLike21[N21[Item], HCollection21],APRHLLike22[N22[Item], HCollection22]] = Parameter1NatSupport22Self.append10[Item, Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any, HCollection1,HCollection2,HCollection3,HCollection4,HCollection5,HCollection6,HCollection7,HCollection8,HCollection9,HCollection10,HCollection11,HCollection12,HCollection13,HCollection14,HCollection15,HCollection16,HCollection17,HCollection18,HCollection19,HCollection20,HCollection21,HCollection22](p1)
    

        
      override def content: AppenderNatSupport22[M, HLLike1,HLLike2,HLLike3,HLLike4,HLLike5,HLLike6,HLLike7,HLLike8,HLLike9,HLLike10,HLLike11,HLLike12,HLLike13,HLLike14,HLLike15,HLLike16,HLLike17,HLLike18,HLLike19,HLLike20,HLLike21,HLLike22, APRHLLike1,APRHLLike2,APRHLLike3,APRHLLike4,APRHLLike5,APRHLLike6,APRHLLike7,APRHLLike8,APRHLLike9,APRHLLike10,APRHLLike11,APRHLLike12,APRHLLike13,APRHLLike14,APRHLLike15,APRHLLike16,APRHLLike17,APRHLLike18,APRHLLike19,APRHLLike20,APRHLLike21,APRHLLike22]
    
        
      override def typeGen: TypeGen22[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21,N22]
    
      }
  