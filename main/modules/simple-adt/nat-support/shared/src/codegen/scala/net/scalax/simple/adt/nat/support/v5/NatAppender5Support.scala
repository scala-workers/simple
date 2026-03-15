
    package net.scalax.simple.adt
    package nat
    package support
    package v5

    object SimpleRunnerIt10Codengen {
      SimpleRunnerIt10Codengen =>

      def toItera[F[_[_]], T](spc: AppenderSupport4[F]): AppenderSupport4[({ type TPF[MXX[_]] = F[({ type XUU[_] = MXX[T] })#XUU] })#TPF] = {
        type TPF[MXX[_]] = F[({ type XUU[_] = MXX[T] })#XUU]
        new AppenderSupport4[TPF] {
          
      override def simpleRunner1: AppenderSupport1.Simple1.Runner[TPF] = new AppenderSupport1.Simple1.Runner[TPF] {
        override def append[M[_], N1[_]]
          (
            sAppender: AppenderSupport1.Simple1.Appender[M, N1],
            sZero: AppenderSupport1.Simple1.Zero[M])
          : M[TPF[({ type NXX[_] = N1[T] })#NXX]] =
            spc.simpleRunner1.append[M, ({ type NXX[_] = N1[T] })#NXX](
              new AppenderSupport1.Simple1.Appender[M, ({ type NXX[_] = N1[T] })#NXX] {
                override def append[
                  U1,
                  B1,
                  C1
                ](
                  abc1: net.scalax.simple.adt.nat.support.ABCFunc[N1[T], B1, C1],
                  ma: M[B1]
                ): M[C1] = sAppender.append[
                  T,
                  B1,
                  C1
                ](abc1, ma)
              },
              sZero
            )
      }
    

      override def simpleRunner2: AppenderSupport1.Simple2.Runner[TPF] = new AppenderSupport1.Simple2.Runner[TPF] {
        override def append[M[_,_], N1[_],N2[_]]
          (
            sAppender: AppenderSupport1.Simple2.Appender[M, N1,N2],
            sZero: AppenderSupport1.Simple2.Zero[M])
          : M[TPF[({ type NXX[_] = N1[T] })#NXX],TPF[({ type NXX[_] = N2[T] })#NXX]] =
            spc.simpleRunner2.append[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX](
              new AppenderSupport1.Simple2.Appender[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX] {
                override def append[
                  U1,
                  B1,B2,
                  C1,C2
                ](
                  abc1: net.scalax.simple.adt.nat.support.ABCFunc[N1[T], B1, C1],abc2: net.scalax.simple.adt.nat.support.ABCFunc[N2[T], B2, C2],
                  ma: M[B1,B2]
                ): M[C1,C2] = sAppender.append[
                  T,
                  B1,B2,
                  C1,C2
                ](abc1,abc2, ma)
              },
              sZero
            )
      }
    

      override def simpleRunner3: AppenderSupport1.Simple3.Runner[TPF] = new AppenderSupport1.Simple3.Runner[TPF] {
        override def append[M[_,_,_], N1[_],N2[_],N3[_]]
          (
            sAppender: AppenderSupport1.Simple3.Appender[M, N1,N2,N3],
            sZero: AppenderSupport1.Simple3.Zero[M])
          : M[TPF[({ type NXX[_] = N1[T] })#NXX],TPF[({ type NXX[_] = N2[T] })#NXX],TPF[({ type NXX[_] = N3[T] })#NXX]] =
            spc.simpleRunner3.append[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX](
              new AppenderSupport1.Simple3.Appender[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX] {
                override def append[
                  U1,
                  B1,B2,B3,
                  C1,C2,C3
                ](
                  abc1: net.scalax.simple.adt.nat.support.ABCFunc[N1[T], B1, C1],abc2: net.scalax.simple.adt.nat.support.ABCFunc[N2[T], B2, C2],abc3: net.scalax.simple.adt.nat.support.ABCFunc[N3[T], B3, C3],
                  ma: M[B1,B2,B3]
                ): M[C1,C2,C3] = sAppender.append[
                  T,
                  B1,B2,B3,
                  C1,C2,C3
                ](abc1,abc2,abc3, ma)
              },
              sZero
            )
      }
    

      override def simpleRunner4: AppenderSupport1.Simple4.Runner[TPF] = new AppenderSupport1.Simple4.Runner[TPF] {
        override def append[M[_,_,_,_], N1[_],N2[_],N3[_],N4[_]]
          (
            sAppender: AppenderSupport1.Simple4.Appender[M, N1,N2,N3,N4],
            sZero: AppenderSupport1.Simple4.Zero[M])
          : M[TPF[({ type NXX[_] = N1[T] })#NXX],TPF[({ type NXX[_] = N2[T] })#NXX],TPF[({ type NXX[_] = N3[T] })#NXX],TPF[({ type NXX[_] = N4[T] })#NXX]] =
            spc.simpleRunner4.append[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX](
              new AppenderSupport1.Simple4.Appender[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX] {
                override def append[
                  U1,
                  B1,B2,B3,B4,
                  C1,C2,C3,C4
                ](
                  abc1: net.scalax.simple.adt.nat.support.ABCFunc[N1[T], B1, C1],abc2: net.scalax.simple.adt.nat.support.ABCFunc[N2[T], B2, C2],abc3: net.scalax.simple.adt.nat.support.ABCFunc[N3[T], B3, C3],abc4: net.scalax.simple.adt.nat.support.ABCFunc[N4[T], B4, C4],
                  ma: M[B1,B2,B3,B4]
                ): M[C1,C2,C3,C4] = sAppender.append[
                  T,
                  B1,B2,B3,B4,
                  C1,C2,C3,C4
                ](abc1,abc2,abc3,abc4, ma)
              },
              sZero
            )
      }
    

      override def simpleRunner5: AppenderSupport1.Simple5.Runner[TPF] = new AppenderSupport1.Simple5.Runner[TPF] {
        override def append[M[_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_]]
          (
            sAppender: AppenderSupport1.Simple5.Appender[M, N1,N2,N3,N4,N5],
            sZero: AppenderSupport1.Simple5.Zero[M])
          : M[TPF[({ type NXX[_] = N1[T] })#NXX],TPF[({ type NXX[_] = N2[T] })#NXX],TPF[({ type NXX[_] = N3[T] })#NXX],TPF[({ type NXX[_] = N4[T] })#NXX],TPF[({ type NXX[_] = N5[T] })#NXX]] =
            spc.simpleRunner5.append[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX](
              new AppenderSupport1.Simple5.Appender[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX] {
                override def append[
                  U1,
                  B1,B2,B3,B4,B5,
                  C1,C2,C3,C4,C5
                ](
                  abc1: net.scalax.simple.adt.nat.support.ABCFunc[N1[T], B1, C1],abc2: net.scalax.simple.adt.nat.support.ABCFunc[N2[T], B2, C2],abc3: net.scalax.simple.adt.nat.support.ABCFunc[N3[T], B3, C3],abc4: net.scalax.simple.adt.nat.support.ABCFunc[N4[T], B4, C4],abc5: net.scalax.simple.adt.nat.support.ABCFunc[N5[T], B5, C5],
                  ma: M[B1,B2,B3,B4,B5]
                ): M[C1,C2,C3,C4,C5] = sAppender.append[
                  T,
                  B1,B2,B3,B4,B5,
                  C1,C2,C3,C4,C5
                ](abc1,abc2,abc3,abc4,abc5, ma)
              },
              sZero
            )
      }
    

      override def simpleRunner6: AppenderSupport1.Simple6.Runner[TPF] = new AppenderSupport1.Simple6.Runner[TPF] {
        override def append[M[_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_]]
          (
            sAppender: AppenderSupport1.Simple6.Appender[M, N1,N2,N3,N4,N5,N6],
            sZero: AppenderSupport1.Simple6.Zero[M])
          : M[TPF[({ type NXX[_] = N1[T] })#NXX],TPF[({ type NXX[_] = N2[T] })#NXX],TPF[({ type NXX[_] = N3[T] })#NXX],TPF[({ type NXX[_] = N4[T] })#NXX],TPF[({ type NXX[_] = N5[T] })#NXX],TPF[({ type NXX[_] = N6[T] })#NXX]] =
            spc.simpleRunner6.append[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX](
              new AppenderSupport1.Simple6.Appender[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX] {
                override def append[
                  U1,
                  B1,B2,B3,B4,B5,B6,
                  C1,C2,C3,C4,C5,C6
                ](
                  abc1: net.scalax.simple.adt.nat.support.ABCFunc[N1[T], B1, C1],abc2: net.scalax.simple.adt.nat.support.ABCFunc[N2[T], B2, C2],abc3: net.scalax.simple.adt.nat.support.ABCFunc[N3[T], B3, C3],abc4: net.scalax.simple.adt.nat.support.ABCFunc[N4[T], B4, C4],abc5: net.scalax.simple.adt.nat.support.ABCFunc[N5[T], B5, C5],abc6: net.scalax.simple.adt.nat.support.ABCFunc[N6[T], B6, C6],
                  ma: M[B1,B2,B3,B4,B5,B6]
                ): M[C1,C2,C3,C4,C5,C6] = sAppender.append[
                  T,
                  B1,B2,B3,B4,B5,B6,
                  C1,C2,C3,C4,C5,C6
                ](abc1,abc2,abc3,abc4,abc5,abc6, ma)
              },
              sZero
            )
      }
    

      override def simpleRunner7: AppenderSupport1.Simple7.Runner[TPF] = new AppenderSupport1.Simple7.Runner[TPF] {
        override def append[M[_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_]]
          (
            sAppender: AppenderSupport1.Simple7.Appender[M, N1,N2,N3,N4,N5,N6,N7],
            sZero: AppenderSupport1.Simple7.Zero[M])
          : M[TPF[({ type NXX[_] = N1[T] })#NXX],TPF[({ type NXX[_] = N2[T] })#NXX],TPF[({ type NXX[_] = N3[T] })#NXX],TPF[({ type NXX[_] = N4[T] })#NXX],TPF[({ type NXX[_] = N5[T] })#NXX],TPF[({ type NXX[_] = N6[T] })#NXX],TPF[({ type NXX[_] = N7[T] })#NXX]] =
            spc.simpleRunner7.append[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX](
              new AppenderSupport1.Simple7.Appender[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX] {
                override def append[
                  U1,
                  B1,B2,B3,B4,B5,B6,B7,
                  C1,C2,C3,C4,C5,C6,C7
                ](
                  abc1: net.scalax.simple.adt.nat.support.ABCFunc[N1[T], B1, C1],abc2: net.scalax.simple.adt.nat.support.ABCFunc[N2[T], B2, C2],abc3: net.scalax.simple.adt.nat.support.ABCFunc[N3[T], B3, C3],abc4: net.scalax.simple.adt.nat.support.ABCFunc[N4[T], B4, C4],abc5: net.scalax.simple.adt.nat.support.ABCFunc[N5[T], B5, C5],abc6: net.scalax.simple.adt.nat.support.ABCFunc[N6[T], B6, C6],abc7: net.scalax.simple.adt.nat.support.ABCFunc[N7[T], B7, C7],
                  ma: M[B1,B2,B3,B4,B5,B6,B7]
                ): M[C1,C2,C3,C4,C5,C6,C7] = sAppender.append[
                  T,
                  B1,B2,B3,B4,B5,B6,B7,
                  C1,C2,C3,C4,C5,C6,C7
                ](abc1,abc2,abc3,abc4,abc5,abc6,abc7, ma)
              },
              sZero
            )
      }
    

      override def simpleRunner8: AppenderSupport1.Simple8.Runner[TPF] = new AppenderSupport1.Simple8.Runner[TPF] {
        override def append[M[_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_]]
          (
            sAppender: AppenderSupport1.Simple8.Appender[M, N1,N2,N3,N4,N5,N6,N7,N8],
            sZero: AppenderSupport1.Simple8.Zero[M])
          : M[TPF[({ type NXX[_] = N1[T] })#NXX],TPF[({ type NXX[_] = N2[T] })#NXX],TPF[({ type NXX[_] = N3[T] })#NXX],TPF[({ type NXX[_] = N4[T] })#NXX],TPF[({ type NXX[_] = N5[T] })#NXX],TPF[({ type NXX[_] = N6[T] })#NXX],TPF[({ type NXX[_] = N7[T] })#NXX],TPF[({ type NXX[_] = N8[T] })#NXX]] =
            spc.simpleRunner8.append[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX](
              new AppenderSupport1.Simple8.Appender[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX] {
                override def append[
                  U1,
                  B1,B2,B3,B4,B5,B6,B7,B8,
                  C1,C2,C3,C4,C5,C6,C7,C8
                ](
                  abc1: net.scalax.simple.adt.nat.support.ABCFunc[N1[T], B1, C1],abc2: net.scalax.simple.adt.nat.support.ABCFunc[N2[T], B2, C2],abc3: net.scalax.simple.adt.nat.support.ABCFunc[N3[T], B3, C3],abc4: net.scalax.simple.adt.nat.support.ABCFunc[N4[T], B4, C4],abc5: net.scalax.simple.adt.nat.support.ABCFunc[N5[T], B5, C5],abc6: net.scalax.simple.adt.nat.support.ABCFunc[N6[T], B6, C6],abc7: net.scalax.simple.adt.nat.support.ABCFunc[N7[T], B7, C7],abc8: net.scalax.simple.adt.nat.support.ABCFunc[N8[T], B8, C8],
                  ma: M[B1,B2,B3,B4,B5,B6,B7,B8]
                ): M[C1,C2,C3,C4,C5,C6,C7,C8] = sAppender.append[
                  T,
                  B1,B2,B3,B4,B5,B6,B7,B8,
                  C1,C2,C3,C4,C5,C6,C7,C8
                ](abc1,abc2,abc3,abc4,abc5,abc6,abc7,abc8, ma)
              },
              sZero
            )
      }
    

      override def simpleRunner9: AppenderSupport1.Simple9.Runner[TPF] = new AppenderSupport1.Simple9.Runner[TPF] {
        override def append[M[_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_]]
          (
            sAppender: AppenderSupport1.Simple9.Appender[M, N1,N2,N3,N4,N5,N6,N7,N8,N9],
            sZero: AppenderSupport1.Simple9.Zero[M])
          : M[TPF[({ type NXX[_] = N1[T] })#NXX],TPF[({ type NXX[_] = N2[T] })#NXX],TPF[({ type NXX[_] = N3[T] })#NXX],TPF[({ type NXX[_] = N4[T] })#NXX],TPF[({ type NXX[_] = N5[T] })#NXX],TPF[({ type NXX[_] = N6[T] })#NXX],TPF[({ type NXX[_] = N7[T] })#NXX],TPF[({ type NXX[_] = N8[T] })#NXX],TPF[({ type NXX[_] = N9[T] })#NXX]] =
            spc.simpleRunner9.append[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX](
              new AppenderSupport1.Simple9.Appender[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX] {
                override def append[
                  U1,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9
                ](
                  abc1: net.scalax.simple.adt.nat.support.ABCFunc[N1[T], B1, C1],abc2: net.scalax.simple.adt.nat.support.ABCFunc[N2[T], B2, C2],abc3: net.scalax.simple.adt.nat.support.ABCFunc[N3[T], B3, C3],abc4: net.scalax.simple.adt.nat.support.ABCFunc[N4[T], B4, C4],abc5: net.scalax.simple.adt.nat.support.ABCFunc[N5[T], B5, C5],abc6: net.scalax.simple.adt.nat.support.ABCFunc[N6[T], B6, C6],abc7: net.scalax.simple.adt.nat.support.ABCFunc[N7[T], B7, C7],abc8: net.scalax.simple.adt.nat.support.ABCFunc[N8[T], B8, C8],abc9: net.scalax.simple.adt.nat.support.ABCFunc[N9[T], B9, C9],
                  ma: M[B1,B2,B3,B4,B5,B6,B7,B8,B9]
                ): M[C1,C2,C3,C4,C5,C6,C7,C8,C9] = sAppender.append[
                  T,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9
                ](abc1,abc2,abc3,abc4,abc5,abc6,abc7,abc8,abc9, ma)
              },
              sZero
            )
      }
    

      override def simpleRunner10: AppenderSupport1.Simple10.Runner[TPF] = new AppenderSupport1.Simple10.Runner[TPF] {
        override def append[M[_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_]]
          (
            sAppender: AppenderSupport1.Simple10.Appender[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10],
            sZero: AppenderSupport1.Simple10.Zero[M])
          : M[TPF[({ type NXX[_] = N1[T] })#NXX],TPF[({ type NXX[_] = N2[T] })#NXX],TPF[({ type NXX[_] = N3[T] })#NXX],TPF[({ type NXX[_] = N4[T] })#NXX],TPF[({ type NXX[_] = N5[T] })#NXX],TPF[({ type NXX[_] = N6[T] })#NXX],TPF[({ type NXX[_] = N7[T] })#NXX],TPF[({ type NXX[_] = N8[T] })#NXX],TPF[({ type NXX[_] = N9[T] })#NXX],TPF[({ type NXX[_] = N10[T] })#NXX]] =
            spc.simpleRunner10.append[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX](
              new AppenderSupport1.Simple10.Appender[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX] {
                override def append[
                  U1,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10
                ](
                  abc1: net.scalax.simple.adt.nat.support.ABCFunc[N1[T], B1, C1],abc2: net.scalax.simple.adt.nat.support.ABCFunc[N2[T], B2, C2],abc3: net.scalax.simple.adt.nat.support.ABCFunc[N3[T], B3, C3],abc4: net.scalax.simple.adt.nat.support.ABCFunc[N4[T], B4, C4],abc5: net.scalax.simple.adt.nat.support.ABCFunc[N5[T], B5, C5],abc6: net.scalax.simple.adt.nat.support.ABCFunc[N6[T], B6, C6],abc7: net.scalax.simple.adt.nat.support.ABCFunc[N7[T], B7, C7],abc8: net.scalax.simple.adt.nat.support.ABCFunc[N8[T], B8, C8],abc9: net.scalax.simple.adt.nat.support.ABCFunc[N9[T], B9, C9],abc10: net.scalax.simple.adt.nat.support.ABCFunc[N10[T], B10, C10],
                  ma: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10]
                ): M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10] = sAppender.append[
                  T,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10
                ](abc1,abc2,abc3,abc4,abc5,abc6,abc7,abc8,abc9,abc10, ma)
              },
              sZero
            )
      }
    

      override def simpleRunner11: AppenderSupport1.Simple11.Runner[TPF] = new AppenderSupport1.Simple11.Runner[TPF] {
        override def append[M[_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_]]
          (
            sAppender: AppenderSupport1.Simple11.Appender[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11],
            sZero: AppenderSupport1.Simple11.Zero[M])
          : M[TPF[({ type NXX[_] = N1[T] })#NXX],TPF[({ type NXX[_] = N2[T] })#NXX],TPF[({ type NXX[_] = N3[T] })#NXX],TPF[({ type NXX[_] = N4[T] })#NXX],TPF[({ type NXX[_] = N5[T] })#NXX],TPF[({ type NXX[_] = N6[T] })#NXX],TPF[({ type NXX[_] = N7[T] })#NXX],TPF[({ type NXX[_] = N8[T] })#NXX],TPF[({ type NXX[_] = N9[T] })#NXX],TPF[({ type NXX[_] = N10[T] })#NXX],TPF[({ type NXX[_] = N11[T] })#NXX]] =
            spc.simpleRunner11.append[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX](
              new AppenderSupport1.Simple11.Appender[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX] {
                override def append[
                  U1,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11
                ](
                  abc1: net.scalax.simple.adt.nat.support.ABCFunc[N1[T], B1, C1],abc2: net.scalax.simple.adt.nat.support.ABCFunc[N2[T], B2, C2],abc3: net.scalax.simple.adt.nat.support.ABCFunc[N3[T], B3, C3],abc4: net.scalax.simple.adt.nat.support.ABCFunc[N4[T], B4, C4],abc5: net.scalax.simple.adt.nat.support.ABCFunc[N5[T], B5, C5],abc6: net.scalax.simple.adt.nat.support.ABCFunc[N6[T], B6, C6],abc7: net.scalax.simple.adt.nat.support.ABCFunc[N7[T], B7, C7],abc8: net.scalax.simple.adt.nat.support.ABCFunc[N8[T], B8, C8],abc9: net.scalax.simple.adt.nat.support.ABCFunc[N9[T], B9, C9],abc10: net.scalax.simple.adt.nat.support.ABCFunc[N10[T], B10, C10],abc11: net.scalax.simple.adt.nat.support.ABCFunc[N11[T], B11, C11],
                  ma: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11]
                ): M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11] = sAppender.append[
                  T,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11
                ](abc1,abc2,abc3,abc4,abc5,abc6,abc7,abc8,abc9,abc10,abc11, ma)
              },
              sZero
            )
      }
    

      override def simpleRunner12: AppenderSupport1.Simple12.Runner[TPF] = new AppenderSupport1.Simple12.Runner[TPF] {
        override def append[M[_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_]]
          (
            sAppender: AppenderSupport1.Simple12.Appender[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12],
            sZero: AppenderSupport1.Simple12.Zero[M])
          : M[TPF[({ type NXX[_] = N1[T] })#NXX],TPF[({ type NXX[_] = N2[T] })#NXX],TPF[({ type NXX[_] = N3[T] })#NXX],TPF[({ type NXX[_] = N4[T] })#NXX],TPF[({ type NXX[_] = N5[T] })#NXX],TPF[({ type NXX[_] = N6[T] })#NXX],TPF[({ type NXX[_] = N7[T] })#NXX],TPF[({ type NXX[_] = N8[T] })#NXX],TPF[({ type NXX[_] = N9[T] })#NXX],TPF[({ type NXX[_] = N10[T] })#NXX],TPF[({ type NXX[_] = N11[T] })#NXX],TPF[({ type NXX[_] = N12[T] })#NXX]] =
            spc.simpleRunner12.append[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX,({ type NXX[_] = N12[T] })#NXX](
              new AppenderSupport1.Simple12.Appender[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX,({ type NXX[_] = N12[T] })#NXX] {
                override def append[
                  U1,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12
                ](
                  abc1: net.scalax.simple.adt.nat.support.ABCFunc[N1[T], B1, C1],abc2: net.scalax.simple.adt.nat.support.ABCFunc[N2[T], B2, C2],abc3: net.scalax.simple.adt.nat.support.ABCFunc[N3[T], B3, C3],abc4: net.scalax.simple.adt.nat.support.ABCFunc[N4[T], B4, C4],abc5: net.scalax.simple.adt.nat.support.ABCFunc[N5[T], B5, C5],abc6: net.scalax.simple.adt.nat.support.ABCFunc[N6[T], B6, C6],abc7: net.scalax.simple.adt.nat.support.ABCFunc[N7[T], B7, C7],abc8: net.scalax.simple.adt.nat.support.ABCFunc[N8[T], B8, C8],abc9: net.scalax.simple.adt.nat.support.ABCFunc[N9[T], B9, C9],abc10: net.scalax.simple.adt.nat.support.ABCFunc[N10[T], B10, C10],abc11: net.scalax.simple.adt.nat.support.ABCFunc[N11[T], B11, C11],abc12: net.scalax.simple.adt.nat.support.ABCFunc[N12[T], B12, C12],
                  ma: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12]
                ): M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12] = sAppender.append[
                  T,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12
                ](abc1,abc2,abc3,abc4,abc5,abc6,abc7,abc8,abc9,abc10,abc11,abc12, ma)
              },
              sZero
            )
      }
    

      override def simpleRunner13: AppenderSupport1.Simple13.Runner[TPF] = new AppenderSupport1.Simple13.Runner[TPF] {
        override def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_]]
          (
            sAppender: AppenderSupport1.Simple13.Appender[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13],
            sZero: AppenderSupport1.Simple13.Zero[M])
          : M[TPF[({ type NXX[_] = N1[T] })#NXX],TPF[({ type NXX[_] = N2[T] })#NXX],TPF[({ type NXX[_] = N3[T] })#NXX],TPF[({ type NXX[_] = N4[T] })#NXX],TPF[({ type NXX[_] = N5[T] })#NXX],TPF[({ type NXX[_] = N6[T] })#NXX],TPF[({ type NXX[_] = N7[T] })#NXX],TPF[({ type NXX[_] = N8[T] })#NXX],TPF[({ type NXX[_] = N9[T] })#NXX],TPF[({ type NXX[_] = N10[T] })#NXX],TPF[({ type NXX[_] = N11[T] })#NXX],TPF[({ type NXX[_] = N12[T] })#NXX],TPF[({ type NXX[_] = N13[T] })#NXX]] =
            spc.simpleRunner13.append[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX,({ type NXX[_] = N12[T] })#NXX,({ type NXX[_] = N13[T] })#NXX](
              new AppenderSupport1.Simple13.Appender[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX,({ type NXX[_] = N12[T] })#NXX,({ type NXX[_] = N13[T] })#NXX] {
                override def append[
                  U1,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13
                ](
                  abc1: net.scalax.simple.adt.nat.support.ABCFunc[N1[T], B1, C1],abc2: net.scalax.simple.adt.nat.support.ABCFunc[N2[T], B2, C2],abc3: net.scalax.simple.adt.nat.support.ABCFunc[N3[T], B3, C3],abc4: net.scalax.simple.adt.nat.support.ABCFunc[N4[T], B4, C4],abc5: net.scalax.simple.adt.nat.support.ABCFunc[N5[T], B5, C5],abc6: net.scalax.simple.adt.nat.support.ABCFunc[N6[T], B6, C6],abc7: net.scalax.simple.adt.nat.support.ABCFunc[N7[T], B7, C7],abc8: net.scalax.simple.adt.nat.support.ABCFunc[N8[T], B8, C8],abc9: net.scalax.simple.adt.nat.support.ABCFunc[N9[T], B9, C9],abc10: net.scalax.simple.adt.nat.support.ABCFunc[N10[T], B10, C10],abc11: net.scalax.simple.adt.nat.support.ABCFunc[N11[T], B11, C11],abc12: net.scalax.simple.adt.nat.support.ABCFunc[N12[T], B12, C12],abc13: net.scalax.simple.adt.nat.support.ABCFunc[N13[T], B13, C13],
                  ma: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13]
                ): M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13] = sAppender.append[
                  T,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13
                ](abc1,abc2,abc3,abc4,abc5,abc6,abc7,abc8,abc9,abc10,abc11,abc12,abc13, ma)
              },
              sZero
            )
      }
    

      override def simpleRunner14: AppenderSupport1.Simple14.Runner[TPF] = new AppenderSupport1.Simple14.Runner[TPF] {
        override def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_]]
          (
            sAppender: AppenderSupport1.Simple14.Appender[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14],
            sZero: AppenderSupport1.Simple14.Zero[M])
          : M[TPF[({ type NXX[_] = N1[T] })#NXX],TPF[({ type NXX[_] = N2[T] })#NXX],TPF[({ type NXX[_] = N3[T] })#NXX],TPF[({ type NXX[_] = N4[T] })#NXX],TPF[({ type NXX[_] = N5[T] })#NXX],TPF[({ type NXX[_] = N6[T] })#NXX],TPF[({ type NXX[_] = N7[T] })#NXX],TPF[({ type NXX[_] = N8[T] })#NXX],TPF[({ type NXX[_] = N9[T] })#NXX],TPF[({ type NXX[_] = N10[T] })#NXX],TPF[({ type NXX[_] = N11[T] })#NXX],TPF[({ type NXX[_] = N12[T] })#NXX],TPF[({ type NXX[_] = N13[T] })#NXX],TPF[({ type NXX[_] = N14[T] })#NXX]] =
            spc.simpleRunner14.append[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX,({ type NXX[_] = N12[T] })#NXX,({ type NXX[_] = N13[T] })#NXX,({ type NXX[_] = N14[T] })#NXX](
              new AppenderSupport1.Simple14.Appender[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX,({ type NXX[_] = N12[T] })#NXX,({ type NXX[_] = N13[T] })#NXX,({ type NXX[_] = N14[T] })#NXX] {
                override def append[
                  U1,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14
                ](
                  abc1: net.scalax.simple.adt.nat.support.ABCFunc[N1[T], B1, C1],abc2: net.scalax.simple.adt.nat.support.ABCFunc[N2[T], B2, C2],abc3: net.scalax.simple.adt.nat.support.ABCFunc[N3[T], B3, C3],abc4: net.scalax.simple.adt.nat.support.ABCFunc[N4[T], B4, C4],abc5: net.scalax.simple.adt.nat.support.ABCFunc[N5[T], B5, C5],abc6: net.scalax.simple.adt.nat.support.ABCFunc[N6[T], B6, C6],abc7: net.scalax.simple.adt.nat.support.ABCFunc[N7[T], B7, C7],abc8: net.scalax.simple.adt.nat.support.ABCFunc[N8[T], B8, C8],abc9: net.scalax.simple.adt.nat.support.ABCFunc[N9[T], B9, C9],abc10: net.scalax.simple.adt.nat.support.ABCFunc[N10[T], B10, C10],abc11: net.scalax.simple.adt.nat.support.ABCFunc[N11[T], B11, C11],abc12: net.scalax.simple.adt.nat.support.ABCFunc[N12[T], B12, C12],abc13: net.scalax.simple.adt.nat.support.ABCFunc[N13[T], B13, C13],abc14: net.scalax.simple.adt.nat.support.ABCFunc[N14[T], B14, C14],
                  ma: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14]
                ): M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14] = sAppender.append[
                  T,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14
                ](abc1,abc2,abc3,abc4,abc5,abc6,abc7,abc8,abc9,abc10,abc11,abc12,abc13,abc14, ma)
              },
              sZero
            )
      }
    

      override def simpleRunner15: AppenderSupport1.Simple15.Runner[TPF] = new AppenderSupport1.Simple15.Runner[TPF] {
        override def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_]]
          (
            sAppender: AppenderSupport1.Simple15.Appender[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15],
            sZero: AppenderSupport1.Simple15.Zero[M])
          : M[TPF[({ type NXX[_] = N1[T] })#NXX],TPF[({ type NXX[_] = N2[T] })#NXX],TPF[({ type NXX[_] = N3[T] })#NXX],TPF[({ type NXX[_] = N4[T] })#NXX],TPF[({ type NXX[_] = N5[T] })#NXX],TPF[({ type NXX[_] = N6[T] })#NXX],TPF[({ type NXX[_] = N7[T] })#NXX],TPF[({ type NXX[_] = N8[T] })#NXX],TPF[({ type NXX[_] = N9[T] })#NXX],TPF[({ type NXX[_] = N10[T] })#NXX],TPF[({ type NXX[_] = N11[T] })#NXX],TPF[({ type NXX[_] = N12[T] })#NXX],TPF[({ type NXX[_] = N13[T] })#NXX],TPF[({ type NXX[_] = N14[T] })#NXX],TPF[({ type NXX[_] = N15[T] })#NXX]] =
            spc.simpleRunner15.append[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX,({ type NXX[_] = N12[T] })#NXX,({ type NXX[_] = N13[T] })#NXX,({ type NXX[_] = N14[T] })#NXX,({ type NXX[_] = N15[T] })#NXX](
              new AppenderSupport1.Simple15.Appender[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX,({ type NXX[_] = N12[T] })#NXX,({ type NXX[_] = N13[T] })#NXX,({ type NXX[_] = N14[T] })#NXX,({ type NXX[_] = N15[T] })#NXX] {
                override def append[
                  U1,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15
                ](
                  abc1: net.scalax.simple.adt.nat.support.ABCFunc[N1[T], B1, C1],abc2: net.scalax.simple.adt.nat.support.ABCFunc[N2[T], B2, C2],abc3: net.scalax.simple.adt.nat.support.ABCFunc[N3[T], B3, C3],abc4: net.scalax.simple.adt.nat.support.ABCFunc[N4[T], B4, C4],abc5: net.scalax.simple.adt.nat.support.ABCFunc[N5[T], B5, C5],abc6: net.scalax.simple.adt.nat.support.ABCFunc[N6[T], B6, C6],abc7: net.scalax.simple.adt.nat.support.ABCFunc[N7[T], B7, C7],abc8: net.scalax.simple.adt.nat.support.ABCFunc[N8[T], B8, C8],abc9: net.scalax.simple.adt.nat.support.ABCFunc[N9[T], B9, C9],abc10: net.scalax.simple.adt.nat.support.ABCFunc[N10[T], B10, C10],abc11: net.scalax.simple.adt.nat.support.ABCFunc[N11[T], B11, C11],abc12: net.scalax.simple.adt.nat.support.ABCFunc[N12[T], B12, C12],abc13: net.scalax.simple.adt.nat.support.ABCFunc[N13[T], B13, C13],abc14: net.scalax.simple.adt.nat.support.ABCFunc[N14[T], B14, C14],abc15: net.scalax.simple.adt.nat.support.ABCFunc[N15[T], B15, C15],
                  ma: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15]
                ): M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15] = sAppender.append[
                  T,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15
                ](abc1,abc2,abc3,abc4,abc5,abc6,abc7,abc8,abc9,abc10,abc11,abc12,abc13,abc14,abc15, ma)
              },
              sZero
            )
      }
    

      override def simpleRunner16: AppenderSupport1.Simple16.Runner[TPF] = new AppenderSupport1.Simple16.Runner[TPF] {
        override def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_]]
          (
            sAppender: AppenderSupport1.Simple16.Appender[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16],
            sZero: AppenderSupport1.Simple16.Zero[M])
          : M[TPF[({ type NXX[_] = N1[T] })#NXX],TPF[({ type NXX[_] = N2[T] })#NXX],TPF[({ type NXX[_] = N3[T] })#NXX],TPF[({ type NXX[_] = N4[T] })#NXX],TPF[({ type NXX[_] = N5[T] })#NXX],TPF[({ type NXX[_] = N6[T] })#NXX],TPF[({ type NXX[_] = N7[T] })#NXX],TPF[({ type NXX[_] = N8[T] })#NXX],TPF[({ type NXX[_] = N9[T] })#NXX],TPF[({ type NXX[_] = N10[T] })#NXX],TPF[({ type NXX[_] = N11[T] })#NXX],TPF[({ type NXX[_] = N12[T] })#NXX],TPF[({ type NXX[_] = N13[T] })#NXX],TPF[({ type NXX[_] = N14[T] })#NXX],TPF[({ type NXX[_] = N15[T] })#NXX],TPF[({ type NXX[_] = N16[T] })#NXX]] =
            spc.simpleRunner16.append[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX,({ type NXX[_] = N12[T] })#NXX,({ type NXX[_] = N13[T] })#NXX,({ type NXX[_] = N14[T] })#NXX,({ type NXX[_] = N15[T] })#NXX,({ type NXX[_] = N16[T] })#NXX](
              new AppenderSupport1.Simple16.Appender[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX,({ type NXX[_] = N12[T] })#NXX,({ type NXX[_] = N13[T] })#NXX,({ type NXX[_] = N14[T] })#NXX,({ type NXX[_] = N15[T] })#NXX,({ type NXX[_] = N16[T] })#NXX] {
                override def append[
                  U1,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16
                ](
                  abc1: net.scalax.simple.adt.nat.support.ABCFunc[N1[T], B1, C1],abc2: net.scalax.simple.adt.nat.support.ABCFunc[N2[T], B2, C2],abc3: net.scalax.simple.adt.nat.support.ABCFunc[N3[T], B3, C3],abc4: net.scalax.simple.adt.nat.support.ABCFunc[N4[T], B4, C4],abc5: net.scalax.simple.adt.nat.support.ABCFunc[N5[T], B5, C5],abc6: net.scalax.simple.adt.nat.support.ABCFunc[N6[T], B6, C6],abc7: net.scalax.simple.adt.nat.support.ABCFunc[N7[T], B7, C7],abc8: net.scalax.simple.adt.nat.support.ABCFunc[N8[T], B8, C8],abc9: net.scalax.simple.adt.nat.support.ABCFunc[N9[T], B9, C9],abc10: net.scalax.simple.adt.nat.support.ABCFunc[N10[T], B10, C10],abc11: net.scalax.simple.adt.nat.support.ABCFunc[N11[T], B11, C11],abc12: net.scalax.simple.adt.nat.support.ABCFunc[N12[T], B12, C12],abc13: net.scalax.simple.adt.nat.support.ABCFunc[N13[T], B13, C13],abc14: net.scalax.simple.adt.nat.support.ABCFunc[N14[T], B14, C14],abc15: net.scalax.simple.adt.nat.support.ABCFunc[N15[T], B15, C15],abc16: net.scalax.simple.adt.nat.support.ABCFunc[N16[T], B16, C16],
                  ma: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16]
                ): M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16] = sAppender.append[
                  T,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16
                ](abc1,abc2,abc3,abc4,abc5,abc6,abc7,abc8,abc9,abc10,abc11,abc12,abc13,abc14,abc15,abc16, ma)
              },
              sZero
            )
      }
    

      override def simpleRunner17: AppenderSupport1.Simple17.Runner[TPF] = new AppenderSupport1.Simple17.Runner[TPF] {
        override def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_]]
          (
            sAppender: AppenderSupport1.Simple17.Appender[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17],
            sZero: AppenderSupport1.Simple17.Zero[M])
          : M[TPF[({ type NXX[_] = N1[T] })#NXX],TPF[({ type NXX[_] = N2[T] })#NXX],TPF[({ type NXX[_] = N3[T] })#NXX],TPF[({ type NXX[_] = N4[T] })#NXX],TPF[({ type NXX[_] = N5[T] })#NXX],TPF[({ type NXX[_] = N6[T] })#NXX],TPF[({ type NXX[_] = N7[T] })#NXX],TPF[({ type NXX[_] = N8[T] })#NXX],TPF[({ type NXX[_] = N9[T] })#NXX],TPF[({ type NXX[_] = N10[T] })#NXX],TPF[({ type NXX[_] = N11[T] })#NXX],TPF[({ type NXX[_] = N12[T] })#NXX],TPF[({ type NXX[_] = N13[T] })#NXX],TPF[({ type NXX[_] = N14[T] })#NXX],TPF[({ type NXX[_] = N15[T] })#NXX],TPF[({ type NXX[_] = N16[T] })#NXX],TPF[({ type NXX[_] = N17[T] })#NXX]] =
            spc.simpleRunner17.append[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX,({ type NXX[_] = N12[T] })#NXX,({ type NXX[_] = N13[T] })#NXX,({ type NXX[_] = N14[T] })#NXX,({ type NXX[_] = N15[T] })#NXX,({ type NXX[_] = N16[T] })#NXX,({ type NXX[_] = N17[T] })#NXX](
              new AppenderSupport1.Simple17.Appender[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX,({ type NXX[_] = N12[T] })#NXX,({ type NXX[_] = N13[T] })#NXX,({ type NXX[_] = N14[T] })#NXX,({ type NXX[_] = N15[T] })#NXX,({ type NXX[_] = N16[T] })#NXX,({ type NXX[_] = N17[T] })#NXX] {
                override def append[
                  U1,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17
                ](
                  abc1: net.scalax.simple.adt.nat.support.ABCFunc[N1[T], B1, C1],abc2: net.scalax.simple.adt.nat.support.ABCFunc[N2[T], B2, C2],abc3: net.scalax.simple.adt.nat.support.ABCFunc[N3[T], B3, C3],abc4: net.scalax.simple.adt.nat.support.ABCFunc[N4[T], B4, C4],abc5: net.scalax.simple.adt.nat.support.ABCFunc[N5[T], B5, C5],abc6: net.scalax.simple.adt.nat.support.ABCFunc[N6[T], B6, C6],abc7: net.scalax.simple.adt.nat.support.ABCFunc[N7[T], B7, C7],abc8: net.scalax.simple.adt.nat.support.ABCFunc[N8[T], B8, C8],abc9: net.scalax.simple.adt.nat.support.ABCFunc[N9[T], B9, C9],abc10: net.scalax.simple.adt.nat.support.ABCFunc[N10[T], B10, C10],abc11: net.scalax.simple.adt.nat.support.ABCFunc[N11[T], B11, C11],abc12: net.scalax.simple.adt.nat.support.ABCFunc[N12[T], B12, C12],abc13: net.scalax.simple.adt.nat.support.ABCFunc[N13[T], B13, C13],abc14: net.scalax.simple.adt.nat.support.ABCFunc[N14[T], B14, C14],abc15: net.scalax.simple.adt.nat.support.ABCFunc[N15[T], B15, C15],abc16: net.scalax.simple.adt.nat.support.ABCFunc[N16[T], B16, C16],abc17: net.scalax.simple.adt.nat.support.ABCFunc[N17[T], B17, C17],
                  ma: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17]
                ): M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17] = sAppender.append[
                  T,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17
                ](abc1,abc2,abc3,abc4,abc5,abc6,abc7,abc8,abc9,abc10,abc11,abc12,abc13,abc14,abc15,abc16,abc17, ma)
              },
              sZero
            )
      }
    

      override def simpleRunner18: AppenderSupport1.Simple18.Runner[TPF] = new AppenderSupport1.Simple18.Runner[TPF] {
        override def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_]]
          (
            sAppender: AppenderSupport1.Simple18.Appender[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18],
            sZero: AppenderSupport1.Simple18.Zero[M])
          : M[TPF[({ type NXX[_] = N1[T] })#NXX],TPF[({ type NXX[_] = N2[T] })#NXX],TPF[({ type NXX[_] = N3[T] })#NXX],TPF[({ type NXX[_] = N4[T] })#NXX],TPF[({ type NXX[_] = N5[T] })#NXX],TPF[({ type NXX[_] = N6[T] })#NXX],TPF[({ type NXX[_] = N7[T] })#NXX],TPF[({ type NXX[_] = N8[T] })#NXX],TPF[({ type NXX[_] = N9[T] })#NXX],TPF[({ type NXX[_] = N10[T] })#NXX],TPF[({ type NXX[_] = N11[T] })#NXX],TPF[({ type NXX[_] = N12[T] })#NXX],TPF[({ type NXX[_] = N13[T] })#NXX],TPF[({ type NXX[_] = N14[T] })#NXX],TPF[({ type NXX[_] = N15[T] })#NXX],TPF[({ type NXX[_] = N16[T] })#NXX],TPF[({ type NXX[_] = N17[T] })#NXX],TPF[({ type NXX[_] = N18[T] })#NXX]] =
            spc.simpleRunner18.append[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX,({ type NXX[_] = N12[T] })#NXX,({ type NXX[_] = N13[T] })#NXX,({ type NXX[_] = N14[T] })#NXX,({ type NXX[_] = N15[T] })#NXX,({ type NXX[_] = N16[T] })#NXX,({ type NXX[_] = N17[T] })#NXX,({ type NXX[_] = N18[T] })#NXX](
              new AppenderSupport1.Simple18.Appender[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX,({ type NXX[_] = N12[T] })#NXX,({ type NXX[_] = N13[T] })#NXX,({ type NXX[_] = N14[T] })#NXX,({ type NXX[_] = N15[T] })#NXX,({ type NXX[_] = N16[T] })#NXX,({ type NXX[_] = N17[T] })#NXX,({ type NXX[_] = N18[T] })#NXX] {
                override def append[
                  U1,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18
                ](
                  abc1: net.scalax.simple.adt.nat.support.ABCFunc[N1[T], B1, C1],abc2: net.scalax.simple.adt.nat.support.ABCFunc[N2[T], B2, C2],abc3: net.scalax.simple.adt.nat.support.ABCFunc[N3[T], B3, C3],abc4: net.scalax.simple.adt.nat.support.ABCFunc[N4[T], B4, C4],abc5: net.scalax.simple.adt.nat.support.ABCFunc[N5[T], B5, C5],abc6: net.scalax.simple.adt.nat.support.ABCFunc[N6[T], B6, C6],abc7: net.scalax.simple.adt.nat.support.ABCFunc[N7[T], B7, C7],abc8: net.scalax.simple.adt.nat.support.ABCFunc[N8[T], B8, C8],abc9: net.scalax.simple.adt.nat.support.ABCFunc[N9[T], B9, C9],abc10: net.scalax.simple.adt.nat.support.ABCFunc[N10[T], B10, C10],abc11: net.scalax.simple.adt.nat.support.ABCFunc[N11[T], B11, C11],abc12: net.scalax.simple.adt.nat.support.ABCFunc[N12[T], B12, C12],abc13: net.scalax.simple.adt.nat.support.ABCFunc[N13[T], B13, C13],abc14: net.scalax.simple.adt.nat.support.ABCFunc[N14[T], B14, C14],abc15: net.scalax.simple.adt.nat.support.ABCFunc[N15[T], B15, C15],abc16: net.scalax.simple.adt.nat.support.ABCFunc[N16[T], B16, C16],abc17: net.scalax.simple.adt.nat.support.ABCFunc[N17[T], B17, C17],abc18: net.scalax.simple.adt.nat.support.ABCFunc[N18[T], B18, C18],
                  ma: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18]
                ): M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18] = sAppender.append[
                  T,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18
                ](abc1,abc2,abc3,abc4,abc5,abc6,abc7,abc8,abc9,abc10,abc11,abc12,abc13,abc14,abc15,abc16,abc17,abc18, ma)
              },
              sZero
            )
      }
    

      override def simpleRunner19: AppenderSupport1.Simple19.Runner[TPF] = new AppenderSupport1.Simple19.Runner[TPF] {
        override def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_]]
          (
            sAppender: AppenderSupport1.Simple19.Appender[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19],
            sZero: AppenderSupport1.Simple19.Zero[M])
          : M[TPF[({ type NXX[_] = N1[T] })#NXX],TPF[({ type NXX[_] = N2[T] })#NXX],TPF[({ type NXX[_] = N3[T] })#NXX],TPF[({ type NXX[_] = N4[T] })#NXX],TPF[({ type NXX[_] = N5[T] })#NXX],TPF[({ type NXX[_] = N6[T] })#NXX],TPF[({ type NXX[_] = N7[T] })#NXX],TPF[({ type NXX[_] = N8[T] })#NXX],TPF[({ type NXX[_] = N9[T] })#NXX],TPF[({ type NXX[_] = N10[T] })#NXX],TPF[({ type NXX[_] = N11[T] })#NXX],TPF[({ type NXX[_] = N12[T] })#NXX],TPF[({ type NXX[_] = N13[T] })#NXX],TPF[({ type NXX[_] = N14[T] })#NXX],TPF[({ type NXX[_] = N15[T] })#NXX],TPF[({ type NXX[_] = N16[T] })#NXX],TPF[({ type NXX[_] = N17[T] })#NXX],TPF[({ type NXX[_] = N18[T] })#NXX],TPF[({ type NXX[_] = N19[T] })#NXX]] =
            spc.simpleRunner19.append[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX,({ type NXX[_] = N12[T] })#NXX,({ type NXX[_] = N13[T] })#NXX,({ type NXX[_] = N14[T] })#NXX,({ type NXX[_] = N15[T] })#NXX,({ type NXX[_] = N16[T] })#NXX,({ type NXX[_] = N17[T] })#NXX,({ type NXX[_] = N18[T] })#NXX,({ type NXX[_] = N19[T] })#NXX](
              new AppenderSupport1.Simple19.Appender[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX,({ type NXX[_] = N12[T] })#NXX,({ type NXX[_] = N13[T] })#NXX,({ type NXX[_] = N14[T] })#NXX,({ type NXX[_] = N15[T] })#NXX,({ type NXX[_] = N16[T] })#NXX,({ type NXX[_] = N17[T] })#NXX,({ type NXX[_] = N18[T] })#NXX,({ type NXX[_] = N19[T] })#NXX] {
                override def append[
                  U1,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19
                ](
                  abc1: net.scalax.simple.adt.nat.support.ABCFunc[N1[T], B1, C1],abc2: net.scalax.simple.adt.nat.support.ABCFunc[N2[T], B2, C2],abc3: net.scalax.simple.adt.nat.support.ABCFunc[N3[T], B3, C3],abc4: net.scalax.simple.adt.nat.support.ABCFunc[N4[T], B4, C4],abc5: net.scalax.simple.adt.nat.support.ABCFunc[N5[T], B5, C5],abc6: net.scalax.simple.adt.nat.support.ABCFunc[N6[T], B6, C6],abc7: net.scalax.simple.adt.nat.support.ABCFunc[N7[T], B7, C7],abc8: net.scalax.simple.adt.nat.support.ABCFunc[N8[T], B8, C8],abc9: net.scalax.simple.adt.nat.support.ABCFunc[N9[T], B9, C9],abc10: net.scalax.simple.adt.nat.support.ABCFunc[N10[T], B10, C10],abc11: net.scalax.simple.adt.nat.support.ABCFunc[N11[T], B11, C11],abc12: net.scalax.simple.adt.nat.support.ABCFunc[N12[T], B12, C12],abc13: net.scalax.simple.adt.nat.support.ABCFunc[N13[T], B13, C13],abc14: net.scalax.simple.adt.nat.support.ABCFunc[N14[T], B14, C14],abc15: net.scalax.simple.adt.nat.support.ABCFunc[N15[T], B15, C15],abc16: net.scalax.simple.adt.nat.support.ABCFunc[N16[T], B16, C16],abc17: net.scalax.simple.adt.nat.support.ABCFunc[N17[T], B17, C17],abc18: net.scalax.simple.adt.nat.support.ABCFunc[N18[T], B18, C18],abc19: net.scalax.simple.adt.nat.support.ABCFunc[N19[T], B19, C19],
                  ma: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19]
                ): M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19] = sAppender.append[
                  T,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19
                ](abc1,abc2,abc3,abc4,abc5,abc6,abc7,abc8,abc9,abc10,abc11,abc12,abc13,abc14,abc15,abc16,abc17,abc18,abc19, ma)
              },
              sZero
            )
      }
    

      override def simpleRunner20: AppenderSupport1.Simple20.Runner[TPF] = new AppenderSupport1.Simple20.Runner[TPF] {
        override def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],N20[_]]
          (
            sAppender: AppenderSupport1.Simple20.Appender[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20],
            sZero: AppenderSupport1.Simple20.Zero[M])
          : M[TPF[({ type NXX[_] = N1[T] })#NXX],TPF[({ type NXX[_] = N2[T] })#NXX],TPF[({ type NXX[_] = N3[T] })#NXX],TPF[({ type NXX[_] = N4[T] })#NXX],TPF[({ type NXX[_] = N5[T] })#NXX],TPF[({ type NXX[_] = N6[T] })#NXX],TPF[({ type NXX[_] = N7[T] })#NXX],TPF[({ type NXX[_] = N8[T] })#NXX],TPF[({ type NXX[_] = N9[T] })#NXX],TPF[({ type NXX[_] = N10[T] })#NXX],TPF[({ type NXX[_] = N11[T] })#NXX],TPF[({ type NXX[_] = N12[T] })#NXX],TPF[({ type NXX[_] = N13[T] })#NXX],TPF[({ type NXX[_] = N14[T] })#NXX],TPF[({ type NXX[_] = N15[T] })#NXX],TPF[({ type NXX[_] = N16[T] })#NXX],TPF[({ type NXX[_] = N17[T] })#NXX],TPF[({ type NXX[_] = N18[T] })#NXX],TPF[({ type NXX[_] = N19[T] })#NXX],TPF[({ type NXX[_] = N20[T] })#NXX]] =
            spc.simpleRunner20.append[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX,({ type NXX[_] = N12[T] })#NXX,({ type NXX[_] = N13[T] })#NXX,({ type NXX[_] = N14[T] })#NXX,({ type NXX[_] = N15[T] })#NXX,({ type NXX[_] = N16[T] })#NXX,({ type NXX[_] = N17[T] })#NXX,({ type NXX[_] = N18[T] })#NXX,({ type NXX[_] = N19[T] })#NXX,({ type NXX[_] = N20[T] })#NXX](
              new AppenderSupport1.Simple20.Appender[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX,({ type NXX[_] = N12[T] })#NXX,({ type NXX[_] = N13[T] })#NXX,({ type NXX[_] = N14[T] })#NXX,({ type NXX[_] = N15[T] })#NXX,({ type NXX[_] = N16[T] })#NXX,({ type NXX[_] = N17[T] })#NXX,({ type NXX[_] = N18[T] })#NXX,({ type NXX[_] = N19[T] })#NXX,({ type NXX[_] = N20[T] })#NXX] {
                override def append[
                  U1,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20
                ](
                  abc1: net.scalax.simple.adt.nat.support.ABCFunc[N1[T], B1, C1],abc2: net.scalax.simple.adt.nat.support.ABCFunc[N2[T], B2, C2],abc3: net.scalax.simple.adt.nat.support.ABCFunc[N3[T], B3, C3],abc4: net.scalax.simple.adt.nat.support.ABCFunc[N4[T], B4, C4],abc5: net.scalax.simple.adt.nat.support.ABCFunc[N5[T], B5, C5],abc6: net.scalax.simple.adt.nat.support.ABCFunc[N6[T], B6, C6],abc7: net.scalax.simple.adt.nat.support.ABCFunc[N7[T], B7, C7],abc8: net.scalax.simple.adt.nat.support.ABCFunc[N8[T], B8, C8],abc9: net.scalax.simple.adt.nat.support.ABCFunc[N9[T], B9, C9],abc10: net.scalax.simple.adt.nat.support.ABCFunc[N10[T], B10, C10],abc11: net.scalax.simple.adt.nat.support.ABCFunc[N11[T], B11, C11],abc12: net.scalax.simple.adt.nat.support.ABCFunc[N12[T], B12, C12],abc13: net.scalax.simple.adt.nat.support.ABCFunc[N13[T], B13, C13],abc14: net.scalax.simple.adt.nat.support.ABCFunc[N14[T], B14, C14],abc15: net.scalax.simple.adt.nat.support.ABCFunc[N15[T], B15, C15],abc16: net.scalax.simple.adt.nat.support.ABCFunc[N16[T], B16, C16],abc17: net.scalax.simple.adt.nat.support.ABCFunc[N17[T], B17, C17],abc18: net.scalax.simple.adt.nat.support.ABCFunc[N18[T], B18, C18],abc19: net.scalax.simple.adt.nat.support.ABCFunc[N19[T], B19, C19],abc20: net.scalax.simple.adt.nat.support.ABCFunc[N20[T], B20, C20],
                  ma: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20]
                ): M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20] = sAppender.append[
                  T,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20
                ](abc1,abc2,abc3,abc4,abc5,abc6,abc7,abc8,abc9,abc10,abc11,abc12,abc13,abc14,abc15,abc16,abc17,abc18,abc19,abc20, ma)
              },
              sZero
            )
      }
    

      override def simpleRunner21: AppenderSupport1.Simple21.Runner[TPF] = new AppenderSupport1.Simple21.Runner[TPF] {
        override def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],N20[_],N21[_]]
          (
            sAppender: AppenderSupport1.Simple21.Appender[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21],
            sZero: AppenderSupport1.Simple21.Zero[M])
          : M[TPF[({ type NXX[_] = N1[T] })#NXX],TPF[({ type NXX[_] = N2[T] })#NXX],TPF[({ type NXX[_] = N3[T] })#NXX],TPF[({ type NXX[_] = N4[T] })#NXX],TPF[({ type NXX[_] = N5[T] })#NXX],TPF[({ type NXX[_] = N6[T] })#NXX],TPF[({ type NXX[_] = N7[T] })#NXX],TPF[({ type NXX[_] = N8[T] })#NXX],TPF[({ type NXX[_] = N9[T] })#NXX],TPF[({ type NXX[_] = N10[T] })#NXX],TPF[({ type NXX[_] = N11[T] })#NXX],TPF[({ type NXX[_] = N12[T] })#NXX],TPF[({ type NXX[_] = N13[T] })#NXX],TPF[({ type NXX[_] = N14[T] })#NXX],TPF[({ type NXX[_] = N15[T] })#NXX],TPF[({ type NXX[_] = N16[T] })#NXX],TPF[({ type NXX[_] = N17[T] })#NXX],TPF[({ type NXX[_] = N18[T] })#NXX],TPF[({ type NXX[_] = N19[T] })#NXX],TPF[({ type NXX[_] = N20[T] })#NXX],TPF[({ type NXX[_] = N21[T] })#NXX]] =
            spc.simpleRunner21.append[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX,({ type NXX[_] = N12[T] })#NXX,({ type NXX[_] = N13[T] })#NXX,({ type NXX[_] = N14[T] })#NXX,({ type NXX[_] = N15[T] })#NXX,({ type NXX[_] = N16[T] })#NXX,({ type NXX[_] = N17[T] })#NXX,({ type NXX[_] = N18[T] })#NXX,({ type NXX[_] = N19[T] })#NXX,({ type NXX[_] = N20[T] })#NXX,({ type NXX[_] = N21[T] })#NXX](
              new AppenderSupport1.Simple21.Appender[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX,({ type NXX[_] = N12[T] })#NXX,({ type NXX[_] = N13[T] })#NXX,({ type NXX[_] = N14[T] })#NXX,({ type NXX[_] = N15[T] })#NXX,({ type NXX[_] = N16[T] })#NXX,({ type NXX[_] = N17[T] })#NXX,({ type NXX[_] = N18[T] })#NXX,({ type NXX[_] = N19[T] })#NXX,({ type NXX[_] = N20[T] })#NXX,({ type NXX[_] = N21[T] })#NXX] {
                override def append[
                  U1,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20,C21
                ](
                  abc1: net.scalax.simple.adt.nat.support.ABCFunc[N1[T], B1, C1],abc2: net.scalax.simple.adt.nat.support.ABCFunc[N2[T], B2, C2],abc3: net.scalax.simple.adt.nat.support.ABCFunc[N3[T], B3, C3],abc4: net.scalax.simple.adt.nat.support.ABCFunc[N4[T], B4, C4],abc5: net.scalax.simple.adt.nat.support.ABCFunc[N5[T], B5, C5],abc6: net.scalax.simple.adt.nat.support.ABCFunc[N6[T], B6, C6],abc7: net.scalax.simple.adt.nat.support.ABCFunc[N7[T], B7, C7],abc8: net.scalax.simple.adt.nat.support.ABCFunc[N8[T], B8, C8],abc9: net.scalax.simple.adt.nat.support.ABCFunc[N9[T], B9, C9],abc10: net.scalax.simple.adt.nat.support.ABCFunc[N10[T], B10, C10],abc11: net.scalax.simple.adt.nat.support.ABCFunc[N11[T], B11, C11],abc12: net.scalax.simple.adt.nat.support.ABCFunc[N12[T], B12, C12],abc13: net.scalax.simple.adt.nat.support.ABCFunc[N13[T], B13, C13],abc14: net.scalax.simple.adt.nat.support.ABCFunc[N14[T], B14, C14],abc15: net.scalax.simple.adt.nat.support.ABCFunc[N15[T], B15, C15],abc16: net.scalax.simple.adt.nat.support.ABCFunc[N16[T], B16, C16],abc17: net.scalax.simple.adt.nat.support.ABCFunc[N17[T], B17, C17],abc18: net.scalax.simple.adt.nat.support.ABCFunc[N18[T], B18, C18],abc19: net.scalax.simple.adt.nat.support.ABCFunc[N19[T], B19, C19],abc20: net.scalax.simple.adt.nat.support.ABCFunc[N20[T], B20, C20],abc21: net.scalax.simple.adt.nat.support.ABCFunc[N21[T], B21, C21],
                  ma: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21]
                ): M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20,C21] = sAppender.append[
                  T,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20,C21
                ](abc1,abc2,abc3,abc4,abc5,abc6,abc7,abc8,abc9,abc10,abc11,abc12,abc13,abc14,abc15,abc16,abc17,abc18,abc19,abc20,abc21, ma)
              },
              sZero
            )
      }
    

      override def simpleRunner22: AppenderSupport1.Simple22.Runner[TPF] = new AppenderSupport1.Simple22.Runner[TPF] {
        override def append[M[_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_,_], N1[_],N2[_],N3[_],N4[_],N5[_],N6[_],N7[_],N8[_],N9[_],N10[_],N11[_],N12[_],N13[_],N14[_],N15[_],N16[_],N17[_],N18[_],N19[_],N20[_],N21[_],N22[_]]
          (
            sAppender: AppenderSupport1.Simple22.Appender[M, N1,N2,N3,N4,N5,N6,N7,N8,N9,N10,N11,N12,N13,N14,N15,N16,N17,N18,N19,N20,N21,N22],
            sZero: AppenderSupport1.Simple22.Zero[M])
          : M[TPF[({ type NXX[_] = N1[T] })#NXX],TPF[({ type NXX[_] = N2[T] })#NXX],TPF[({ type NXX[_] = N3[T] })#NXX],TPF[({ type NXX[_] = N4[T] })#NXX],TPF[({ type NXX[_] = N5[T] })#NXX],TPF[({ type NXX[_] = N6[T] })#NXX],TPF[({ type NXX[_] = N7[T] })#NXX],TPF[({ type NXX[_] = N8[T] })#NXX],TPF[({ type NXX[_] = N9[T] })#NXX],TPF[({ type NXX[_] = N10[T] })#NXX],TPF[({ type NXX[_] = N11[T] })#NXX],TPF[({ type NXX[_] = N12[T] })#NXX],TPF[({ type NXX[_] = N13[T] })#NXX],TPF[({ type NXX[_] = N14[T] })#NXX],TPF[({ type NXX[_] = N15[T] })#NXX],TPF[({ type NXX[_] = N16[T] })#NXX],TPF[({ type NXX[_] = N17[T] })#NXX],TPF[({ type NXX[_] = N18[T] })#NXX],TPF[({ type NXX[_] = N19[T] })#NXX],TPF[({ type NXX[_] = N20[T] })#NXX],TPF[({ type NXX[_] = N21[T] })#NXX],TPF[({ type NXX[_] = N22[T] })#NXX]] =
            spc.simpleRunner22.append[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX,({ type NXX[_] = N12[T] })#NXX,({ type NXX[_] = N13[T] })#NXX,({ type NXX[_] = N14[T] })#NXX,({ type NXX[_] = N15[T] })#NXX,({ type NXX[_] = N16[T] })#NXX,({ type NXX[_] = N17[T] })#NXX,({ type NXX[_] = N18[T] })#NXX,({ type NXX[_] = N19[T] })#NXX,({ type NXX[_] = N20[T] })#NXX,({ type NXX[_] = N21[T] })#NXX,({ type NXX[_] = N22[T] })#NXX](
              new AppenderSupport1.Simple22.Appender[M, ({ type NXX[_] = N1[T] })#NXX,({ type NXX[_] = N2[T] })#NXX,({ type NXX[_] = N3[T] })#NXX,({ type NXX[_] = N4[T] })#NXX,({ type NXX[_] = N5[T] })#NXX,({ type NXX[_] = N6[T] })#NXX,({ type NXX[_] = N7[T] })#NXX,({ type NXX[_] = N8[T] })#NXX,({ type NXX[_] = N9[T] })#NXX,({ type NXX[_] = N10[T] })#NXX,({ type NXX[_] = N11[T] })#NXX,({ type NXX[_] = N12[T] })#NXX,({ type NXX[_] = N13[T] })#NXX,({ type NXX[_] = N14[T] })#NXX,({ type NXX[_] = N15[T] })#NXX,({ type NXX[_] = N16[T] })#NXX,({ type NXX[_] = N17[T] })#NXX,({ type NXX[_] = N18[T] })#NXX,({ type NXX[_] = N19[T] })#NXX,({ type NXX[_] = N20[T] })#NXX,({ type NXX[_] = N21[T] })#NXX,({ type NXX[_] = N22[T] })#NXX] {
                override def append[
                  U1,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20,C21,C22
                ](
                  abc1: net.scalax.simple.adt.nat.support.ABCFunc[N1[T], B1, C1],abc2: net.scalax.simple.adt.nat.support.ABCFunc[N2[T], B2, C2],abc3: net.scalax.simple.adt.nat.support.ABCFunc[N3[T], B3, C3],abc4: net.scalax.simple.adt.nat.support.ABCFunc[N4[T], B4, C4],abc5: net.scalax.simple.adt.nat.support.ABCFunc[N5[T], B5, C5],abc6: net.scalax.simple.adt.nat.support.ABCFunc[N6[T], B6, C6],abc7: net.scalax.simple.adt.nat.support.ABCFunc[N7[T], B7, C7],abc8: net.scalax.simple.adt.nat.support.ABCFunc[N8[T], B8, C8],abc9: net.scalax.simple.adt.nat.support.ABCFunc[N9[T], B9, C9],abc10: net.scalax.simple.adt.nat.support.ABCFunc[N10[T], B10, C10],abc11: net.scalax.simple.adt.nat.support.ABCFunc[N11[T], B11, C11],abc12: net.scalax.simple.adt.nat.support.ABCFunc[N12[T], B12, C12],abc13: net.scalax.simple.adt.nat.support.ABCFunc[N13[T], B13, C13],abc14: net.scalax.simple.adt.nat.support.ABCFunc[N14[T], B14, C14],abc15: net.scalax.simple.adt.nat.support.ABCFunc[N15[T], B15, C15],abc16: net.scalax.simple.adt.nat.support.ABCFunc[N16[T], B16, C16],abc17: net.scalax.simple.adt.nat.support.ABCFunc[N17[T], B17, C17],abc18: net.scalax.simple.adt.nat.support.ABCFunc[N18[T], B18, C18],abc19: net.scalax.simple.adt.nat.support.ABCFunc[N19[T], B19, C19],abc20: net.scalax.simple.adt.nat.support.ABCFunc[N20[T], B20, C20],abc21: net.scalax.simple.adt.nat.support.ABCFunc[N21[T], B21, C21],abc22: net.scalax.simple.adt.nat.support.ABCFunc[N22[T], B22, C22],
                  ma: M[B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22]
                ): M[C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20,C21,C22] = sAppender.append[
                  T,
                  B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,
                  C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20,C21,C22
                ](abc1,abc2,abc3,abc4,abc5,abc6,abc7,abc8,abc9,abc10,abc11,abc12,abc13,abc14,abc15,abc16,abc17,abc18,abc19,abc20,abc21,abc22, ma)
              },
              sZero
            )
      }
    
        }
      }

    }
  