package net.scalax.simple.adt
package nat
package support

trait SimpleAppender1Positive[M[_]] {

  def append[A1, B1, C1](f1: ABCFunc[A1, B1, C1])(a: M[A1], b: M[B1]): M[C1]

}

trait SimpleAppender2Positive[M[_, _]] {

  def append[A1, A2, B1, B2, C1, C2](f1: ABCFunc[A1, B1, C1], f2: ABCFunc[A2, B2, C2])(a: M[A1, A2], b: M[B1, B2]): M[C1, C2]

}

trait SimpleAppender3Positive[M[_, _, _]] {

  def append[A1, A2, A3, B1, B2, B3, C1, C2, C3](f1: ABCFunc[A1, B1, C1], f2: ABCFunc[A2, B2, C2], f3: ABCFunc[A3, B3, C3])(
    a: M[A1, A2, A3],
    b: M[B1, B2, B3]
  ): M[C1, C2, C3]

}

trait SimpleAppender4Positive[M[_, _, _, _]] {

  def append[A1, A2, A3, A4, B1, B2, B3, B4, C1, C2, C3, C4](
    f1: ABCFunc[A1, B1, C1],
    f2: ABCFunc[A2, B2, C2],
    f3: ABCFunc[A3, B3, C3],
    f4: ABCFunc[A4, B4, C4]
  )(a: M[A1, A2, A3, A4], b: M[B1, B2, B3, B4]): M[C1, C2, C3, C4]

}

trait SimpleAppender5Positive[M[_, _, _, _, _]] {

  def append[A1, A2, A3, A4, A5, B1, B2, B3, B4, B5, C1, C2, C3, C4, C5](
    f1: ABCFunc[A1, B1, C1],
    f2: ABCFunc[A2, B2, C2],
    f3: ABCFunc[A3, B3, C3],
    f4: ABCFunc[A4, B4, C4],
    f5: ABCFunc[A5, B5, C5]
  )(a: M[A1, A2, A3, A4, A5], b: M[B1, B2, B3, B4, B5]): M[C1, C2, C3, C4, C5]

}

trait SimpleAppender6Positive[M[_, _, _, _, _, _]] {

  def append[A1, A2, A3, A4, A5, A6, B1, B2, B3, B4, B5, B6, C1, C2, C3, C4, C5, C6](
    f1: ABCFunc[A1, B1, C1],
    f2: ABCFunc[A2, B2, C2],
    f3: ABCFunc[A3, B3, C3],
    f4: ABCFunc[A4, B4, C4],
    f5: ABCFunc[A5, B5, C5],
    f6: ABCFunc[A6, B6, C6]
  )(a: M[A1, A2, A3, A4, A5, A6], b: M[B1, B2, B3, B4, B5, B6]): M[C1, C2, C3, C4, C5, C6]

}

trait SimpleAppender7Positive[M[_, _, _, _, _, _, _]] {

  def append[A1, A2, A3, A4, A5, A6, A7, B1, B2, B3, B4, B5, B6, B7, C1, C2, C3, C4, C5, C6, C7](
    f1: ABCFunc[A1, B1, C1],
    f2: ABCFunc[A2, B2, C2],
    f3: ABCFunc[A3, B3, C3],
    f4: ABCFunc[A4, B4, C4],
    f5: ABCFunc[A5, B5, C5],
    f6: ABCFunc[A6, B6, C6],
    f7: ABCFunc[A7, B7, C7]
  )(a: M[A1, A2, A3, A4, A5, A6, A7], b: M[B1, B2, B3, B4, B5, B6, B7]): M[C1, C2, C3, C4, C5, C6, C7]

}

trait SimpleAppender8Positive[M[_, _, _, _, _, _, _, _]] {

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

}

trait SimpleAppender9Positive[M[_, _, _, _, _, _, _, _, _]] {

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

}

trait SimpleAppender10Positive[M[_, _, _, _, _, _, _, _, _, _]] {

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

}
