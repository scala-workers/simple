package net.scalax.simple.adt
package nat
package support

object SimpleProduct1 {
  SimpleProduct1Self =>

  trait TypeGen[M[_], N1[T]] extends TypeGen1[M, N1] {
    override def gen[T]: M[N1[T]]
  }

  trait SimpleAppender[M[_]] extends SimpleAppender1[M] {

    override def append[A1, B1, C1](f1: ABCFunc[A1, B1, C1])(a: M[A1], b: M[B1]): M[C1]

    override def zero[N1](p1: N1): M[N1]

  }

  trait ProductAdapter[F[_[_]]] {
    def append[M[_], N1[_]](typeGen: TypeGen[M, N1], sAppender: SimpleAppender[M]): M[F[N1]]
  }

}

object SimpleProduct2 {
  SimpleProduct2Self =>

  trait TypeGen[M[_, _], N1[T], N2[T]] extends TypeGen2[M, N1, N2] {
    override def gen[T]: M[N1[T], N2[T]]
  }

  trait SimpleAppender[M[_, _]] extends SimpleAppender2[M] {

    override def append[A1, A2, B1, B2, C1, C2](f1: ABCFunc[A1, B1, C1], f2: ABCFunc[A2, B2, C2])(a: M[A1, A2], b: M[B1, B2]): M[C1, C2]

    override def zero[N1, N2](p1: N1, p2: N2): M[N1, N2]

  }

  trait ProductAdapter[F[_[_]]] {
    def append[M[_, _], N1[_], N2[_]](typeGen: TypeGen[M, N1, N2], sAppender: SimpleAppender[M]): M[F[N1], F[N2]]
  }

}

object SimpleProduct3 {
  SimpleProduct3Self =>

  trait TypeGen[M[_, _, _], N1[T], N2[T], N3[T]] extends TypeGen3[M, N1, N2, N3] {
    override def gen[T]: M[N1[T], N2[T], N3[T]]
  }

  trait SimpleAppender[M[_, _, _]] extends SimpleAppender3[M] {

    override def append[A1, A2, A3, B1, B2, B3, C1, C2, C3](f1: ABCFunc[A1, B1, C1], f2: ABCFunc[A2, B2, C2], f3: ABCFunc[A3, B3, C3])(
      a: M[A1, A2, A3],
      b: M[B1, B2, B3]
    ): M[C1, C2, C3]

    override def zero[N1, N2, N3](p1: N1, p2: N2, p3: N3): M[N1, N2, N3]

  }

  trait ProductAdapter[F[_[_]]] {
    def append[M[_, _, _], N1[_], N2[_], N3[_]](typeGen: TypeGen[M, N1, N2, N3], sAppender: SimpleAppender[M]): M[F[N1], F[N2], F[N3]]
  }

}

object SimpleProduct4 {
  SimpleProduct4Self =>

  trait TypeGen[M[_, _, _, _], N1[T], N2[T], N3[T], N4[T]] extends TypeGen4[M, N1, N2, N3, N4] {
    override def gen[T]: M[N1[T], N2[T], N3[T], N4[T]]
  }

  trait SimpleAppender[M[_, _, _, _]] extends SimpleAppender4[M] {

    override def append[A1, A2, A3, A4, B1, B2, B3, B4, C1, C2, C3, C4](
      f1: ABCFunc[A1, B1, C1],
      f2: ABCFunc[A2, B2, C2],
      f3: ABCFunc[A3, B3, C3],
      f4: ABCFunc[A4, B4, C4]
    )(a: M[A1, A2, A3, A4], b: M[B1, B2, B3, B4]): M[C1, C2, C3, C4]

    override def zero[N1, N2, N3, N4](p1: N1, p2: N2, p3: N3, p4: N4): M[N1, N2, N3, N4]

  }

  trait ProductAdapter[F[_[_]]] {
    def append[M[_, _, _, _], N1[_], N2[_], N3[_], N4[_]](
      typeGen: TypeGen[M, N1, N2, N3, N4],
      sAppender: SimpleAppender[M]
    ): M[F[N1], F[N2], F[N3], F[N4]]
  }

}

object SimpleProduct5 {
  SimpleProduct5Self =>

  trait TypeGen[M[_, _, _, _, _], N1[T], N2[T], N3[T], N4[T], N5[T]] extends TypeGen5[M, N1, N2, N3, N4, N5] {
    override def gen[T]: M[N1[T], N2[T], N3[T], N4[T], N5[T]]
  }

  trait SimpleAppender[M[_, _, _, _, _]] extends SimpleAppender5[M] {

    override def append[A1, A2, A3, A4, A5, B1, B2, B3, B4, B5, C1, C2, C3, C4, C5](
      f1: ABCFunc[A1, B1, C1],
      f2: ABCFunc[A2, B2, C2],
      f3: ABCFunc[A3, B3, C3],
      f4: ABCFunc[A4, B4, C4],
      f5: ABCFunc[A5, B5, C5]
    )(a: M[A1, A2, A3, A4, A5], b: M[B1, B2, B3, B4, B5]): M[C1, C2, C3, C4, C5]

    override def zero[N1, N2, N3, N4, N5](p1: N1, p2: N2, p3: N3, p4: N4, p5: N5): M[N1, N2, N3, N4, N5]

  }

  trait ProductAdapter[F[_[_]]] {
    def append[M[_, _, _, _, _], N1[_], N2[_], N3[_], N4[_], N5[_]](
      typeGen: TypeGen[M, N1, N2, N3, N4, N5],
      sAppender: SimpleAppender[M]
    ): M[F[N1], F[N2], F[N3], F[N4], F[N5]]
  }

}

object SimpleProduct6 {
  SimpleProduct6Self =>

  trait TypeGen[M[_, _, _, _, _, _], N1[T], N2[T], N3[T], N4[T], N5[T], N6[T]] extends TypeGen6[M, N1, N2, N3, N4, N5, N6] {
    override def gen[T]: M[N1[T], N2[T], N3[T], N4[T], N5[T], N6[T]]
  }

  trait SimpleAppender[M[_, _, _, _, _, _]] extends SimpleAppender6[M] {

    override def append[A1, A2, A3, A4, A5, A6, B1, B2, B3, B4, B5, B6, C1, C2, C3, C4, C5, C6](
      f1: ABCFunc[A1, B1, C1],
      f2: ABCFunc[A2, B2, C2],
      f3: ABCFunc[A3, B3, C3],
      f4: ABCFunc[A4, B4, C4],
      f5: ABCFunc[A5, B5, C5],
      f6: ABCFunc[A6, B6, C6]
    )(a: M[A1, A2, A3, A4, A5, A6], b: M[B1, B2, B3, B4, B5, B6]): M[C1, C2, C3, C4, C5, C6]

    override def zero[N1, N2, N3, N4, N5, N6](p1: N1, p2: N2, p3: N3, p4: N4, p5: N5, p6: N6): M[N1, N2, N3, N4, N5, N6]

  }

  trait ProductAdapter[F[_[_]]] {
    def append[M[_, _, _, _, _, _], N1[_], N2[_], N3[_], N4[_], N5[_], N6[_]](
      typeGen: TypeGen[M, N1, N2, N3, N4, N5, N6],
      sAppender: SimpleAppender[M]
    ): M[F[N1], F[N2], F[N3], F[N4], F[N5], F[N6]]
  }

}

object SimpleProduct7 {
  SimpleProduct7Self =>

  trait TypeGen[M[_, _, _, _, _, _, _], N1[T], N2[T], N3[T], N4[T], N5[T], N6[T], N7[T]] extends TypeGen7[M, N1, N2, N3, N4, N5, N6, N7] {
    override def gen[T]: M[N1[T], N2[T], N3[T], N4[T], N5[T], N6[T], N7[T]]
  }

  trait SimpleAppender[M[_, _, _, _, _, _, _]] extends SimpleAppender7[M] {

    override def append[A1, A2, A3, A4, A5, A6, A7, B1, B2, B3, B4, B5, B6, B7, C1, C2, C3, C4, C5, C6, C7](
      f1: ABCFunc[A1, B1, C1],
      f2: ABCFunc[A2, B2, C2],
      f3: ABCFunc[A3, B3, C3],
      f4: ABCFunc[A4, B4, C4],
      f5: ABCFunc[A5, B5, C5],
      f6: ABCFunc[A6, B6, C6],
      f7: ABCFunc[A7, B7, C7]
    )(a: M[A1, A2, A3, A4, A5, A6, A7], b: M[B1, B2, B3, B4, B5, B6, B7]): M[C1, C2, C3, C4, C5, C6, C7]

    override def zero[N1, N2, N3, N4, N5, N6, N7](p1: N1, p2: N2, p3: N3, p4: N4, p5: N5, p6: N6, p7: N7): M[N1, N2, N3, N4, N5, N6, N7]

  }

  trait ProductAdapter[F[_[_]]] {
    def append[M[_, _, _, _, _, _, _], N1[_], N2[_], N3[_], N4[_], N5[_], N6[_], N7[_]](
      typeGen: TypeGen[M, N1, N2, N3, N4, N5, N6, N7],
      sAppender: SimpleAppender[M]
    ): M[F[N1], F[N2], F[N3], F[N4], F[N5], F[N6], F[N7]]
  }

}

object SimpleProduct8 {
  SimpleProduct8Self =>

  trait TypeGen[M[_, _, _, _, _, _, _, _], N1[T], N2[T], N3[T], N4[T], N5[T], N6[T], N7[T], N8[T]]
      extends TypeGen8[M, N1, N2, N3, N4, N5, N6, N7, N8] {
    override def gen[T]: M[N1[T], N2[T], N3[T], N4[T], N5[T], N6[T], N7[T], N8[T]]
  }

  trait SimpleAppender[M[_, _, _, _, _, _, _, _]] extends SimpleAppender8[M] {

    override def append[A1, A2, A3, A4, A5, A6, A7, A8, B1, B2, B3, B4, B5, B6, B7, B8, C1, C2, C3, C4, C5, C6, C7, C8](
      f1: ABCFunc[A1, B1, C1],
      f2: ABCFunc[A2, B2, C2],
      f3: ABCFunc[A3, B3, C3],
      f4: ABCFunc[A4, B4, C4],
      f5: ABCFunc[A5, B5, C5],
      f6: ABCFunc[A6, B6, C6],
      f7: ABCFunc[A7, B7, C7],
      f8: ABCFunc[A8, B8, C8]
    )(a: M[A1, A2, A3, A4, A5, A6, A7, A8], b: M[B1, B2, B3, B4, B5, B6, B7, B8]): M[C1, C2, C3, C4, C5, C6, C7, C8]

    override def zero[N1, N2, N3, N4, N5, N6, N7, N8](
      p1: N1,
      p2: N2,
      p3: N3,
      p4: N4,
      p5: N5,
      p6: N6,
      p7: N7,
      p8: N8
    ): M[N1, N2, N3, N4, N5, N6, N7, N8]

  }

  trait ProductAdapter[F[_[_]]] {
    def append[M[_, _, _, _, _, _, _, _], N1[_], N2[_], N3[_], N4[_], N5[_], N6[_], N7[_], N8[_]](
      typeGen: TypeGen[M, N1, N2, N3, N4, N5, N6, N7, N8],
      sAppender: SimpleAppender[M]
    ): M[F[N1], F[N2], F[N3], F[N4], F[N5], F[N6], F[N7], F[N8]]
  }

}

object SimpleProduct9 {
  SimpleProduct9Self =>

  trait TypeGen[M[_, _, _, _, _, _, _, _, _], N1[T], N2[T], N3[T], N4[T], N5[T], N6[T], N7[T], N8[T], N9[T]]
      extends TypeGen9[M, N1, N2, N3, N4, N5, N6, N7, N8, N9] {
    override def gen[T]: M[N1[T], N2[T], N3[T], N4[T], N5[T], N6[T], N7[T], N8[T], N9[T]]
  }

  trait SimpleAppender[M[_, _, _, _, _, _, _, _, _]] extends SimpleAppender9[M] {

    override def append[A1, A2, A3, A4, A5, A6, A7, A8, A9, B1, B2, B3, B4, B5, B6, B7, B8, B9, C1, C2, C3, C4, C5, C6, C7, C8, C9](
      f1: ABCFunc[A1, B1, C1],
      f2: ABCFunc[A2, B2, C2],
      f3: ABCFunc[A3, B3, C3],
      f4: ABCFunc[A4, B4, C4],
      f5: ABCFunc[A5, B5, C5],
      f6: ABCFunc[A6, B6, C6],
      f7: ABCFunc[A7, B7, C7],
      f8: ABCFunc[A8, B8, C8],
      f9: ABCFunc[A9, B9, C9]
    )(a: M[A1, A2, A3, A4, A5, A6, A7, A8, A9], b: M[B1, B2, B3, B4, B5, B6, B7, B8, B9]): M[C1, C2, C3, C4, C5, C6, C7, C8, C9]

    override def zero[N1, N2, N3, N4, N5, N6, N7, N8, N9](
      p1: N1,
      p2: N2,
      p3: N3,
      p4: N4,
      p5: N5,
      p6: N6,
      p7: N7,
      p8: N8,
      p9: N9
    ): M[N1, N2, N3, N4, N5, N6, N7, N8, N9]

  }

  trait ProductAdapter[F[_[_]]] {
    def append[M[_, _, _, _, _, _, _, _, _], N1[_], N2[_], N3[_], N4[_], N5[_], N6[_], N7[_], N8[_], N9[_]](
      typeGen: TypeGen[M, N1, N2, N3, N4, N5, N6, N7, N8, N9],
      sAppender: SimpleAppender[M]
    ): M[F[N1], F[N2], F[N3], F[N4], F[N5], F[N6], F[N7], F[N8], F[N9]]
  }

}

object SimpleProduct10 {
  SimpleProduct10Self =>

  trait TypeGen[M[_, _, _, _, _, _, _, _, _, _], N1[T], N2[T], N3[T], N4[T], N5[T], N6[T], N7[T], N8[T], N9[T], N10[T]]
      extends TypeGen10[M, N1, N2, N3, N4, N5, N6, N7, N8, N9, N10] {
    override def gen[T]: M[N1[T], N2[T], N3[T], N4[T], N5[T], N6[T], N7[T], N8[T], N9[T], N10[T]]
  }

  trait SimpleAppender[M[_, _, _, _, _, _, _, _, _, _]] extends SimpleAppender10[M] {

    override def append[
      A1,
      A2,
      A3,
      A4,
      A5,
      A6,
      A7,
      A8,
      A9,
      A10,
      B1,
      B2,
      B3,
      B4,
      B5,
      B6,
      B7,
      B8,
      B9,
      B10,
      C1,
      C2,
      C3,
      C4,
      C5,
      C6,
      C7,
      C8,
      C9,
      C10
    ](
      f1: ABCFunc[A1, B1, C1],
      f2: ABCFunc[A2, B2, C2],
      f3: ABCFunc[A3, B3, C3],
      f4: ABCFunc[A4, B4, C4],
      f5: ABCFunc[A5, B5, C5],
      f6: ABCFunc[A6, B6, C6],
      f7: ABCFunc[A7, B7, C7],
      f8: ABCFunc[A8, B8, C8],
      f9: ABCFunc[A9, B9, C9],
      f10: ABCFunc[A10, B10, C10]
    )(
      a: M[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10],
      b: M[B1, B2, B3, B4, B5, B6, B7, B8, B9, B10]
    ): M[C1, C2, C3, C4, C5, C6, C7, C8, C9, C10]

    override def zero[N1, N2, N3, N4, N5, N6, N7, N8, N9, N10](
      p1: N1,
      p2: N2,
      p3: N3,
      p4: N4,
      p5: N5,
      p6: N6,
      p7: N7,
      p8: N8,
      p9: N9,
      p10: N10
    ): M[N1, N2, N3, N4, N5, N6, N7, N8, N9, N10]

  }

  trait ProductAdapter[F[_[_]]] {
    def append[M[_, _, _, _, _, _, _, _, _, _], N1[_], N2[_], N3[_], N4[_], N5[_], N6[_], N7[_], N8[_], N9[_], N10[_]](
      typeGen: TypeGen[M, N1, N2, N3, N4, N5, N6, N7, N8, N9, N10],
      sAppender: SimpleAppender[M]
    ): M[F[N1], F[N2], F[N3], F[N4], F[N5], F[N6], F[N7], F[N8], F[N9], F[N10]]
  }

}
