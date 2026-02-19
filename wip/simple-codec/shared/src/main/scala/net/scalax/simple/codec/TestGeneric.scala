package net.scalax.simple.codec
package to_list_generic

import net.scalax.simple.adt.nat.support.{ABCFunc, SimpleProduct1, SimpleProduct2}

trait SelfGeneric[F[_[_]]] {
  def to[UX[_]]: F[({ type S1[T] = F[UX] => UX[T] })#S1]
}

object SelfGeneric {

  trait TestGenericHelper[Sum, Temp, Item] {
    def out(in: Sum => Temp): Item
  }

  def appender[Sum]: SimpleProduct2.SimpleAppender[({ type HE[U1, U2] = TestGenericHelper[Sum, U1, U2] })#HE] =
    new SimpleProduct2.SimpleAppender[({ type HE[U1, U2] = TestGenericHelper[Sum, U1, U2] })#HE] {
      override def append[A1, A2, B1, B2, C1, C2](f1: ABCFunc[A1, B1, C1], f2: ABCFunc[A2, B2, C2])(
        a: TestGenericHelper[Sum, A1, A2],
        b: TestGenericHelper[Sum, B1, B2]
      ): TestGenericHelper[Sum, C1, C2] = new TestGenericHelper[Sum, C1, C2] {
        override def out(in: Sum => C1): C2 = {
          val in1: Sum => A1 = in.andThen(f1.takeHead)
          val in2: Sum => B1 = in.andThen(f1.takeTail)

          val a2: A2 = a.out(in1)
          val b2: B2 = b.out(in2)

          f2.append(a2, b2)
        }
      }

      override def zero[N1, N2](p1: N1, p2: N2): TestGenericHelper[Sum, N1, N2] = new TestGenericHelper[Sum, N1, N2] {
        override def out(in: Sum => N1): N2 = p2
      }
    }

  def createTypeGen[Sum, X1[_]]
    : SimpleProduct2.TypeGen[({ type HE[U1, U2] = TestGenericHelper[Sum, U1, U2] })#HE, X1, ({ type NU2[T] = Sum => X1[T] })#NU2] =
    new SimpleProduct2.TypeGen[({ type HE[U1, U2] = TestGenericHelper[Sum, U1, U2] })#HE, X1, ({ type NU2[T] = Sum => X1[T] })#NU2] {
      override def gen[Item1]: TestGenericHelper[Sum, X1[Item1], Sum => X1[Item1]] =
        new TestGenericHelper[Sum, X1[Item1], Sum => X1[Item1]] {
          override def out(in: Sum => X1[Item1]): Sum => X1[Item1] = in
        }
    }

  class Builder[F[_[_]]] {
    def derived(o1: SimpleProduct2.ProductAdapter[F]): SelfGeneric[F] = new SelfGeneric[F] {
      override def to[UX[_]]: F[({ type S1[T] = F[UX] => UX[T] })#S1] = {
        val func: TestGenericHelper[F[UX], F[UX], F[({ type NU2[T] = F[UX] => UX[T] })#NU2]] =
          o1.append[({ type HE[U1, U2] = TestGenericHelper[F[UX], U1, U2] })#HE, UX, ({ type NU2[T] = F[UX] => UX[T] })#NU2](
            typeGen = createTypeGen[F[UX], UX],
            sAppender = appender
          )

        func.out(identity[F[UX]])
      }
    }
  }

  def apply[F[_[_]]]: Builder[F] = new Builder[F]

}
