package net.scalax.simple.adt
package nat
package support

trait SimpleAppender1Zero[M[_]] {

  def zero[N1](p1: N1): M[N1]

}

trait SimpleAppender2Zero[M[_, _]] {

  def zero[N1, N2](p1: N1, p2: N2): M[N1, N2]

}

trait SimpleAppender3Zero[M[_, _, _]] {

  def zero[N1, N2, N3](p1: N1, p2: N2, p3: N3): M[N1, N2, N3]

}

trait SimpleAppender4Zero[M[_, _, _, _]] {

  def zero[N1, N2, N3, N4](p1: N1, p2: N2, p3: N3, p4: N4): M[N1, N2, N3, N4]

}

trait SimpleAppender5Zero[M[_, _, _, _, _]] {

  def zero[N1, N2, N3, N4, N5](p1: N1, p2: N2, p3: N3, p4: N4, p5: N5): M[N1, N2, N3, N4, N5]

}

trait SimpleAppender6Zero[M[_, _, _, _, _, _]] {

  def zero[N1, N2, N3, N4, N5, N6](p1: N1, p2: N2, p3: N3, p4: N4, p5: N5, p6: N6): M[N1, N2, N3, N4, N5, N6]

}

trait SimpleAppender7Zero[M[_, _, _, _, _, _, _]] {

  def zero[N1, N2, N3, N4, N5, N6, N7](p1: N1, p2: N2, p3: N3, p4: N4, p5: N5, p6: N6, p7: N7): M[N1, N2, N3, N4, N5, N6, N7]

}

trait SimpleAppender8Zero[M[_, _, _, _, _, _, _, _]] {

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

trait SimpleAppender9Zero[M[_, _, _, _, _, _, _, _, _]] {

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

trait SimpleAppender10Zero[M[_, _, _, _, _, _, _, _, _, _]] {

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
