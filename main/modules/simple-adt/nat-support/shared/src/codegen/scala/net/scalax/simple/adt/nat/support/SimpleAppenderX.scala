package net.scalax.simple.adt
package nat
package support

trait SimpleAppender1[M[_]] {

  def append[A1, B1, C1](f1: ABCFunc[A1, B1, C1])(a: M[A1], b: M[B1]): M[C1]

  def zero[N1](p1: N1): M[N1]

}

trait SimpleAppender2[M[_, _]] {

  def append[A1, A2, B1, B2, C1, C2](f1: ABCFunc[A1, B1, C1], f2: ABCFunc[A2, B2, C2])(a: M[A1, A2], b: M[B1, B2]): M[C1, C2]

  def zero[N1, N2](p1: N1, p2: N2): M[N1, N2]

}

trait SimpleAppender3[M[_, _, _]] {

  def append[A1, A2, A3, B1, B2, B3, C1, C2, C3](f1: ABCFunc[A1, B1, C1], f2: ABCFunc[A2, B2, C2], f3: ABCFunc[A3, B3, C3])(
    a: M[A1, A2, A3],
    b: M[B1, B2, B3]
  ): M[C1, C2, C3]

  def zero[N1, N2, N3](p1: N1, p2: N2, p3: N3): M[N1, N2, N3]

}

trait SimpleAppender4[M[_, _, _, _]] {

  def append[A1, A2, A3, A4, B1, B2, B3, B4, C1, C2, C3, C4](
    f1: ABCFunc[A1, B1, C1],
    f2: ABCFunc[A2, B2, C2],
    f3: ABCFunc[A3, B3, C3],
    f4: ABCFunc[A4, B4, C4]
  )(a: M[A1, A2, A3, A4], b: M[B1, B2, B3, B4]): M[C1, C2, C3, C4]

  def zero[N1, N2, N3, N4](p1: N1, p2: N2, p3: N3, p4: N4): M[N1, N2, N3, N4]

}

trait SimpleAppender5[M[_, _, _, _, _]] {

  def append[A1, A2, A3, A4, A5, B1, B2, B3, B4, B5, C1, C2, C3, C4, C5](
    f1: ABCFunc[A1, B1, C1],
    f2: ABCFunc[A2, B2, C2],
    f3: ABCFunc[A3, B3, C3],
    f4: ABCFunc[A4, B4, C4],
    f5: ABCFunc[A5, B5, C5]
  )(a: M[A1, A2, A3, A4, A5], b: M[B1, B2, B3, B4, B5]): M[C1, C2, C3, C4, C5]

  def zero[N1, N2, N3, N4, N5](p1: N1, p2: N2, p3: N3, p4: N4, p5: N5): M[N1, N2, N3, N4, N5]

}

trait SimpleAppender6[M[_, _, _, _, _, _]] {

  def append[A1, A2, A3, A4, A5, A6, B1, B2, B3, B4, B5, B6, C1, C2, C3, C4, C5, C6](
    f1: ABCFunc[A1, B1, C1],
    f2: ABCFunc[A2, B2, C2],
    f3: ABCFunc[A3, B3, C3],
    f4: ABCFunc[A4, B4, C4],
    f5: ABCFunc[A5, B5, C5],
    f6: ABCFunc[A6, B6, C6]
  )(a: M[A1, A2, A3, A4, A5, A6], b: M[B1, B2, B3, B4, B5, B6]): M[C1, C2, C3, C4, C5, C6]

  def zero[N1, N2, N3, N4, N5, N6](p1: N1, p2: N2, p3: N3, p4: N4, p5: N5, p6: N6): M[N1, N2, N3, N4, N5, N6]

}

trait SimpleAppender7[M[_, _, _, _, _, _, _]] {

  def append[A1, A2, A3, A4, A5, A6, A7, B1, B2, B3, B4, B5, B6, B7, C1, C2, C3, C4, C5, C6, C7](
    f1: ABCFunc[A1, B1, C1],
    f2: ABCFunc[A2, B2, C2],
    f3: ABCFunc[A3, B3, C3],
    f4: ABCFunc[A4, B4, C4],
    f5: ABCFunc[A5, B5, C5],
    f6: ABCFunc[A6, B6, C6],
    f7: ABCFunc[A7, B7, C7]
  )(a: M[A1, A2, A3, A4, A5, A6, A7], b: M[B1, B2, B3, B4, B5, B6, B7]): M[C1, C2, C3, C4, C5, C6, C7]

  def zero[N1, N2, N3, N4, N5, N6, N7](p1: N1, p2: N2, p3: N3, p4: N4, p5: N5, p6: N6, p7: N7): M[N1, N2, N3, N4, N5, N6, N7]

}

trait SimpleAppender8[M[_, _, _, _, _, _, _, _]] {

  def append[A1, A2, A3, A4, A5, A6, A7, A8, B1, B2, B3, B4, B5, B6, B7, B8, C1, C2, C3, C4, C5, C6, C7, C8](
    f1: ABCFunc[A1, B1, C1],
    f2: ABCFunc[A2, B2, C2],
    f3: ABCFunc[A3, B3, C3],
    f4: ABCFunc[A4, B4, C4],
    f5: ABCFunc[A5, B5, C5],
    f6: ABCFunc[A6, B6, C6],
    f7: ABCFunc[A7, B7, C7],
    f8: ABCFunc[A8, B8, C8]
  )(a: M[A1, A2, A3, A4, A5, A6, A7, A8], b: M[B1, B2, B3, B4, B5, B6, B7, B8]): M[C1, C2, C3, C4, C5, C6, C7, C8]

  def zero[N1, N2, N3, N4, N5, N6, N7, N8](
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

trait SimpleAppender9[M[_, _, _, _, _, _, _, _, _]] {

  def append[A1, A2, A3, A4, A5, A6, A7, A8, A9, B1, B2, B3, B4, B5, B6, B7, B8, B9, C1, C2, C3, C4, C5, C6, C7, C8, C9](
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

  def zero[N1, N2, N3, N4, N5, N6, N7, N8, N9](
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

trait SimpleAppender10[M[_, _, _, _, _, _, _, _, _, _]] {

  def append[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10](
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

  def zero[N1, N2, N3, N4, N5, N6, N7, N8, N9, N10](
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
