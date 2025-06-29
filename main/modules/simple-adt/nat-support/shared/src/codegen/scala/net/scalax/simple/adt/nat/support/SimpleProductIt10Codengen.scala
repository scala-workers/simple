package net.scalax.simple.adt
package nat
package support

object SimpleProductIt10Codengen {
  SimpleProductIt10CodengenSelf =>

  def toItera[F[_[_]], T](
    spc: SimpleProductContextX[F]
  ): SimpleProductContextX[({ type TPF[MXX[_]] = F[({ type XUU[_] = MXX[T] })#XUU] })#TPF] = {
    type TPF[MXX[_]] = F[({ type XUU[_] = MXX[T] })#XUU]
    new SimpleProductContextX[TPF] {

      override def simpleProduct1: SimpleProduct1.ProductAdapter[TPF] = new SimpleProduct1.ProductAdapter[TPF] {
        override def append[M[_], N1[_]](
          typeGen: SimpleProduct1.TypeGen[M, N1],
          sAppender: SimpleProduct1.SimpleAppender[M]
        ): M[TPF[({ type NXX[_] = N1[T] })#NXX]] =
          spc.simpleProduct1.append[M, ({ type NXX[_] = N1[T] })#NXX](
            new SimpleProduct1.TypeGen[M, ({ type NXX[_] = N1[T] })#NXX] {
              override def gen[U1]: M[N1[T]] = typeGen.gen[T]
            },
            sAppender
          )
      }

      override def simpleProduct2: SimpleProduct2.ProductAdapter[TPF] = new SimpleProduct2.ProductAdapter[TPF] {
        override def append[M[_, _], N1[_], N2[_]](
          typeGen: SimpleProduct2.TypeGen[M, N1, N2],
          sAppender: SimpleProduct2.SimpleAppender[M]
        ): M[TPF[({ type NXX[_] = N1[T] })#NXX], TPF[({ type NXX[_] = N2[T] })#NXX]] =
          spc.simpleProduct2.append[M, ({ type NXX[_] = N1[T] })#NXX, ({ type NXX[_] = N2[T] })#NXX](
            new SimpleProduct2.TypeGen[M, ({ type NXX[_] = N1[T] })#NXX, ({ type NXX[_] = N2[T] })#NXX] {
              override def gen[U1]: M[N1[T], N2[T]] = typeGen.gen[T]
            },
            sAppender
          )
      }

      override def simpleProduct3: SimpleProduct3.ProductAdapter[TPF] = new SimpleProduct3.ProductAdapter[TPF] {
        override def append[M[_, _, _], N1[_], N2[_], N3[_]](
          typeGen: SimpleProduct3.TypeGen[M, N1, N2, N3],
          sAppender: SimpleProduct3.SimpleAppender[M]
        ): M[TPF[({ type NXX[_] = N1[T] })#NXX], TPF[({ type NXX[_] = N2[T] })#NXX], TPF[({ type NXX[_] = N3[T] })#NXX]] =
          spc.simpleProduct3.append[M, ({ type NXX[_] = N1[T] })#NXX, ({ type NXX[_] = N2[T] })#NXX, ({ type NXX[_] = N3[T] })#NXX](
            new SimpleProduct3.TypeGen[M, ({ type NXX[_] = N1[T] })#NXX, ({ type NXX[_] = N2[T] })#NXX, ({ type NXX[_] = N3[T] })#NXX] {
              override def gen[U1]: M[N1[T], N2[T], N3[T]] = typeGen.gen[T]
            },
            sAppender
          )
      }

      override def simpleProduct4: SimpleProduct4.ProductAdapter[TPF] = new SimpleProduct4.ProductAdapter[TPF] {
        override def append[M[_, _, _, _], N1[_], N2[_], N3[_], N4[_]](
          typeGen: SimpleProduct4.TypeGen[M, N1, N2, N3, N4],
          sAppender: SimpleProduct4.SimpleAppender[M]
        ): M[TPF[({ type NXX[_] = N1[T] })#NXX], TPF[({ type NXX[_] = N2[T] })#NXX], TPF[({ type NXX[_] = N3[T] })#NXX], TPF[
          ({ type NXX[_] = N4[T] })#NXX
        ]] =
          spc.simpleProduct4.append[
            M,
            ({ type NXX[_] = N1[T] })#NXX,
            ({ type NXX[_] = N2[T] })#NXX,
            ({ type NXX[_] = N3[T] })#NXX,
            ({ type NXX[_] = N4[T] })#NXX
          ](
            new SimpleProduct4.TypeGen[
              M,
              ({ type NXX[_] = N1[T] })#NXX,
              ({ type NXX[_] = N2[T] })#NXX,
              ({ type NXX[_] = N3[T] })#NXX,
              ({ type NXX[_] = N4[T] })#NXX
            ] {
              override def gen[U1]: M[N1[T], N2[T], N3[T], N4[T]] = typeGen.gen[T]
            },
            sAppender
          )
      }

      override def simpleProduct5: SimpleProduct5.ProductAdapter[TPF] = new SimpleProduct5.ProductAdapter[TPF] {
        override def append[M[_, _, _, _, _], N1[_], N2[_], N3[_], N4[_], N5[_]](
          typeGen: SimpleProduct5.TypeGen[M, N1, N2, N3, N4, N5],
          sAppender: SimpleProduct5.SimpleAppender[M]
        ): M[
          TPF[({ type NXX[_] = N1[T] })#NXX],
          TPF[({ type NXX[_] = N2[T] })#NXX],
          TPF[({ type NXX[_] = N3[T] })#NXX],
          TPF[({ type NXX[_] = N4[T] })#NXX],
          TPF[({ type NXX[_] = N5[T] })#NXX]
        ] =
          spc.simpleProduct5.append[
            M,
            ({ type NXX[_] = N1[T] })#NXX,
            ({ type NXX[_] = N2[T] })#NXX,
            ({ type NXX[_] = N3[T] })#NXX,
            ({ type NXX[_] = N4[T] })#NXX,
            ({ type NXX[_] = N5[T] })#NXX
          ](
            new SimpleProduct5.TypeGen[
              M,
              ({ type NXX[_] = N1[T] })#NXX,
              ({ type NXX[_] = N2[T] })#NXX,
              ({ type NXX[_] = N3[T] })#NXX,
              ({ type NXX[_] = N4[T] })#NXX,
              ({ type NXX[_] = N5[T] })#NXX
            ] {
              override def gen[U1]: M[N1[T], N2[T], N3[T], N4[T], N5[T]] = typeGen.gen[T]
            },
            sAppender
          )
      }

      override def simpleProduct6: SimpleProduct6.ProductAdapter[TPF] = new SimpleProduct6.ProductAdapter[TPF] {
        override def append[M[_, _, _, _, _, _], N1[_], N2[_], N3[_], N4[_], N5[_], N6[_]](
          typeGen: SimpleProduct6.TypeGen[M, N1, N2, N3, N4, N5, N6],
          sAppender: SimpleProduct6.SimpleAppender[M]
        ): M[
          TPF[({ type NXX[_] = N1[T] })#NXX],
          TPF[({ type NXX[_] = N2[T] })#NXX],
          TPF[({ type NXX[_] = N3[T] })#NXX],
          TPF[({ type NXX[_] = N4[T] })#NXX],
          TPF[({ type NXX[_] = N5[T] })#NXX],
          TPF[({ type NXX[_] = N6[T] })#NXX]
        ] =
          spc.simpleProduct6.append[
            M,
            ({ type NXX[_] = N1[T] })#NXX,
            ({ type NXX[_] = N2[T] })#NXX,
            ({ type NXX[_] = N3[T] })#NXX,
            ({ type NXX[_] = N4[T] })#NXX,
            ({ type NXX[_] = N5[T] })#NXX,
            ({ type NXX[_] = N6[T] })#NXX
          ](
            new SimpleProduct6.TypeGen[
              M,
              ({ type NXX[_] = N1[T] })#NXX,
              ({ type NXX[_] = N2[T] })#NXX,
              ({ type NXX[_] = N3[T] })#NXX,
              ({ type NXX[_] = N4[T] })#NXX,
              ({ type NXX[_] = N5[T] })#NXX,
              ({ type NXX[_] = N6[T] })#NXX
            ] {
              override def gen[U1]: M[N1[T], N2[T], N3[T], N4[T], N5[T], N6[T]] = typeGen.gen[T]
            },
            sAppender
          )
      }

      override def simpleProduct7: SimpleProduct7.ProductAdapter[TPF] = new SimpleProduct7.ProductAdapter[TPF] {
        override def append[M[_, _, _, _, _, _, _], N1[_], N2[_], N3[_], N4[_], N5[_], N6[_], N7[_]](
          typeGen: SimpleProduct7.TypeGen[M, N1, N2, N3, N4, N5, N6, N7],
          sAppender: SimpleProduct7.SimpleAppender[M]
        ): M[
          TPF[({ type NXX[_] = N1[T] })#NXX],
          TPF[({ type NXX[_] = N2[T] })#NXX],
          TPF[({ type NXX[_] = N3[T] })#NXX],
          TPF[({ type NXX[_] = N4[T] })#NXX],
          TPF[({ type NXX[_] = N5[T] })#NXX],
          TPF[({ type NXX[_] = N6[T] })#NXX],
          TPF[({ type NXX[_] = N7[T] })#NXX]
        ] =
          spc.simpleProduct7.append[
            M,
            ({ type NXX[_] = N1[T] })#NXX,
            ({ type NXX[_] = N2[T] })#NXX,
            ({ type NXX[_] = N3[T] })#NXX,
            ({ type NXX[_] = N4[T] })#NXX,
            ({ type NXX[_] = N5[T] })#NXX,
            ({ type NXX[_] = N6[T] })#NXX,
            ({ type NXX[_] = N7[T] })#NXX
          ](
            new SimpleProduct7.TypeGen[
              M,
              ({ type NXX[_] = N1[T] })#NXX,
              ({ type NXX[_] = N2[T] })#NXX,
              ({ type NXX[_] = N3[T] })#NXX,
              ({ type NXX[_] = N4[T] })#NXX,
              ({ type NXX[_] = N5[T] })#NXX,
              ({ type NXX[_] = N6[T] })#NXX,
              ({ type NXX[_] = N7[T] })#NXX
            ] {
              override def gen[U1]: M[N1[T], N2[T], N3[T], N4[T], N5[T], N6[T], N7[T]] = typeGen.gen[T]
            },
            sAppender
          )
      }

      override def simpleProduct8: SimpleProduct8.ProductAdapter[TPF] = new SimpleProduct8.ProductAdapter[TPF] {
        override def append[M[_, _, _, _, _, _, _, _], N1[_], N2[_], N3[_], N4[_], N5[_], N6[_], N7[_], N8[_]](
          typeGen: SimpleProduct8.TypeGen[M, N1, N2, N3, N4, N5, N6, N7, N8],
          sAppender: SimpleProduct8.SimpleAppender[M]
        ): M[
          TPF[({ type NXX[_] = N1[T] })#NXX],
          TPF[({ type NXX[_] = N2[T] })#NXX],
          TPF[({ type NXX[_] = N3[T] })#NXX],
          TPF[({ type NXX[_] = N4[T] })#NXX],
          TPF[({ type NXX[_] = N5[T] })#NXX],
          TPF[({ type NXX[_] = N6[T] })#NXX],
          TPF[({ type NXX[_] = N7[T] })#NXX],
          TPF[({ type NXX[_] = N8[T] })#NXX]
        ] =
          spc.simpleProduct8.append[
            M,
            ({ type NXX[_] = N1[T] })#NXX,
            ({ type NXX[_] = N2[T] })#NXX,
            ({ type NXX[_] = N3[T] })#NXX,
            ({ type NXX[_] = N4[T] })#NXX,
            ({ type NXX[_] = N5[T] })#NXX,
            ({ type NXX[_] = N6[T] })#NXX,
            ({ type NXX[_] = N7[T] })#NXX,
            ({ type NXX[_] = N8[T] })#NXX
          ](
            new SimpleProduct8.TypeGen[
              M,
              ({ type NXX[_] = N1[T] })#NXX,
              ({ type NXX[_] = N2[T] })#NXX,
              ({ type NXX[_] = N3[T] })#NXX,
              ({ type NXX[_] = N4[T] })#NXX,
              ({ type NXX[_] = N5[T] })#NXX,
              ({ type NXX[_] = N6[T] })#NXX,
              ({ type NXX[_] = N7[T] })#NXX,
              ({ type NXX[_] = N8[T] })#NXX
            ] {
              override def gen[U1]: M[N1[T], N2[T], N3[T], N4[T], N5[T], N6[T], N7[T], N8[T]] = typeGen.gen[T]
            },
            sAppender
          )
      }

      override def simpleProduct9: SimpleProduct9.ProductAdapter[TPF] = new SimpleProduct9.ProductAdapter[TPF] {
        override def append[M[_, _, _, _, _, _, _, _, _], N1[_], N2[_], N3[_], N4[_], N5[_], N6[_], N7[_], N8[_], N9[_]](
          typeGen: SimpleProduct9.TypeGen[M, N1, N2, N3, N4, N5, N6, N7, N8, N9],
          sAppender: SimpleProduct9.SimpleAppender[M]
        ): M[
          TPF[({ type NXX[_] = N1[T] })#NXX],
          TPF[({ type NXX[_] = N2[T] })#NXX],
          TPF[({ type NXX[_] = N3[T] })#NXX],
          TPF[({ type NXX[_] = N4[T] })#NXX],
          TPF[({ type NXX[_] = N5[T] })#NXX],
          TPF[({ type NXX[_] = N6[T] })#NXX],
          TPF[({ type NXX[_] = N7[T] })#NXX],
          TPF[({ type NXX[_] = N8[T] })#NXX],
          TPF[({ type NXX[_] = N9[T] })#NXX]
        ] =
          spc.simpleProduct9.append[
            M,
            ({ type NXX[_] = N1[T] })#NXX,
            ({ type NXX[_] = N2[T] })#NXX,
            ({ type NXX[_] = N3[T] })#NXX,
            ({ type NXX[_] = N4[T] })#NXX,
            ({ type NXX[_] = N5[T] })#NXX,
            ({ type NXX[_] = N6[T] })#NXX,
            ({ type NXX[_] = N7[T] })#NXX,
            ({ type NXX[_] = N8[T] })#NXX,
            ({ type NXX[_] = N9[T] })#NXX
          ](
            new SimpleProduct9.TypeGen[
              M,
              ({ type NXX[_] = N1[T] })#NXX,
              ({ type NXX[_] = N2[T] })#NXX,
              ({ type NXX[_] = N3[T] })#NXX,
              ({ type NXX[_] = N4[T] })#NXX,
              ({ type NXX[_] = N5[T] })#NXX,
              ({ type NXX[_] = N6[T] })#NXX,
              ({ type NXX[_] = N7[T] })#NXX,
              ({ type NXX[_] = N8[T] })#NXX,
              ({ type NXX[_] = N9[T] })#NXX
            ] {
              override def gen[U1]: M[N1[T], N2[T], N3[T], N4[T], N5[T], N6[T], N7[T], N8[T], N9[T]] = typeGen.gen[T]
            },
            sAppender
          )
      }

      override def simpleProduct10: SimpleProduct10.ProductAdapter[TPF] = new SimpleProduct10.ProductAdapter[TPF] {
        override def append[M[_, _, _, _, _, _, _, _, _, _], N1[_], N2[_], N3[_], N4[_], N5[_], N6[_], N7[_], N8[_], N9[_], N10[_]](
          typeGen: SimpleProduct10.TypeGen[M, N1, N2, N3, N4, N5, N6, N7, N8, N9, N10],
          sAppender: SimpleProduct10.SimpleAppender[M]
        ): M[
          TPF[({ type NXX[_] = N1[T] })#NXX],
          TPF[({ type NXX[_] = N2[T] })#NXX],
          TPF[({ type NXX[_] = N3[T] })#NXX],
          TPF[({ type NXX[_] = N4[T] })#NXX],
          TPF[({ type NXX[_] = N5[T] })#NXX],
          TPF[({ type NXX[_] = N6[T] })#NXX],
          TPF[({ type NXX[_] = N7[T] })#NXX],
          TPF[({ type NXX[_] = N8[T] })#NXX],
          TPF[({ type NXX[_] = N9[T] })#NXX],
          TPF[({ type NXX[_] = N10[T] })#NXX]
        ] =
          spc.simpleProduct10.append[
            M,
            ({ type NXX[_] = N1[T] })#NXX,
            ({ type NXX[_] = N2[T] })#NXX,
            ({ type NXX[_] = N3[T] })#NXX,
            ({ type NXX[_] = N4[T] })#NXX,
            ({ type NXX[_] = N5[T] })#NXX,
            ({ type NXX[_] = N6[T] })#NXX,
            ({ type NXX[_] = N7[T] })#NXX,
            ({ type NXX[_] = N8[T] })#NXX,
            ({ type NXX[_] = N9[T] })#NXX,
            ({ type NXX[_] = N10[T] })#NXX
          ](
            new SimpleProduct10.TypeGen[
              M,
              ({ type NXX[_] = N1[T] })#NXX,
              ({ type NXX[_] = N2[T] })#NXX,
              ({ type NXX[_] = N3[T] })#NXX,
              ({ type NXX[_] = N4[T] })#NXX,
              ({ type NXX[_] = N5[T] })#NXX,
              ({ type NXX[_] = N6[T] })#NXX,
              ({ type NXX[_] = N7[T] })#NXX,
              ({ type NXX[_] = N8[T] })#NXX,
              ({ type NXX[_] = N9[T] })#NXX,
              ({ type NXX[_] = N10[T] })#NXX
            ] {
              override def gen[U1]: M[N1[T], N2[T], N3[T], N4[T], N5[T], N6[T], N7[T], N8[T], N9[T], N10[T]] = typeGen.gen[T]
            },
            sAppender
          )
      }

    }
  }

}
