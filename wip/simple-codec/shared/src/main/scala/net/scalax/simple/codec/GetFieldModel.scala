package net.scalax.simple.codec

import net.scalax.simple.adt.nat.support.{ABCFunc, SimpleProduct2}

trait GetFieldModel[F[_[_]]] {
  def getFieldModel[I[_]]: F[({ type XI[t] = F[I] => I[t] })#XI]
}

object GetFieldModel {

  type TestGenericHelper[Sum, Temp, Item] = (Sum => Temp) => Item

  def appender[Sum]: SimpleProduct2.SimpleAppender[({ type HE[U1, U2] = TestGenericHelper[Sum, U1, U2] })#HE] =
    new SimpleProduct2.SimpleAppender[({ type HE[U1, U2] = TestGenericHelper[Sum, U1, U2] })#HE] {
      override def append[A1, A2, B1, B2, C1, C2](f1: ABCFunc[A1, B1, C1], f2: ABCFunc[A2, B2, C2])(
        a: TestGenericHelper[Sum, A1, A2],
        b: TestGenericHelper[Sum, B1, B2]
      ): TestGenericHelper[Sum, C1, C2] = (in: Sum => C1) => {
        val in1: Sum => A1 = in.andThen(f1.takeHead)
        val in2: Sum => B1 = in.andThen(f1.takeTail)

        val a2: A2 = a(in1)
        val b2: B2 = b(in2)

        f2.append(a2, b2)
      }

      override def zero[N1, N2](p1: N1, p2: N2): TestGenericHelper[Sum, N1, N2] = (in: Sum => N1) => p2
    }

  def createTypeGen[Sum, X1[_]]
    : SimpleProduct2.TypeGen[({ type HE[U1, U2] = TestGenericHelper[Sum, U1, U2] })#HE, X1, ({ type NU2[T] = Sum => X1[T] })#NU2] =
    new SimpleProduct2.TypeGen[({ type HE[U1, U2] = TestGenericHelper[Sum, U1, U2] })#HE, X1, ({ type NU2[T] = Sum => X1[T] })#NU2] {
      override def gen[Item1]: TestGenericHelper[Sum, X1[Item1], Sum => X1[Item1]] = identity[Sum => X1[Item1]]
    }

  class Builder[F[_[_]]] {
    def derived(o1: SimpleProduct2.ProductAdapter[F]): GetFieldModel[F] = new GetFieldModel[F] {
      override def getFieldModel[UX[_]]: F[({ type S1[T] = F[UX] => UX[T] })#S1] = {
        val func: TestGenericHelper[F[UX], F[UX], F[({ type NU2[T] = F[UX] => UX[T] })#NU2]] =
          o1.append[({ type HE[U1, U2] = TestGenericHelper[F[UX], U1, U2] })#HE, UX, ({ type NU2[T] = F[UX] => UX[T] })#NU2](
            typeGen = createTypeGen[F[UX], UX],
            sAppender = appender
          )

        func(identity[F[UX]])
      }
    }
  }

  def apply[F[_[_]]]: Builder[F] = new Builder[F]

}
