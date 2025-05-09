package net.scalax.simple.codec

import to_list_generic.SimpleProduct1

trait GetPropertyByIndex[F[_[_]]] {
  def byIndexImpl[UX](index: Int): F[({ type X1[_] = UX })#X1] => UX
  def byIndex[T[_]](index: Int): F[T] => Any = {
    val func1: F[({ type X1[_] = Any })#X1] => Any = byIndexImpl[Any](index)
    func1.asInstanceOf[F[T] => Any]
  }
}

object GetPropertyByIndex {

  def appendMonad[ProType]: SimpleProduct1.AppendMonad[({ type X[T0] = (Int, T0) => Either[Int, ProType] })#X] =
    new SimpleProduct1.AppendMonad[({ type X[T0] = (Int, T0) => Either[Int, ProType] })#X] {
      override def zip[A1, B1, C1](
        c: SimpleProduct1.ConvertF[A1, B1, C1],
        ma: (Int, A1) => Either[Int, ProType],
        mb: (Int, B1) => Either[Int, ProType]
      ): (Int, C1) => Either[Int, ProType] = (index, pro) => {
        ma(index, c.takeHead1(pro)).fold(index => mb(index, c.takeTail1(pro)), newInstance => Right(newInstance))
      }

      override def zero[N1](n1: N1): (Int, N1) => Either[Int, ProType] = (index, pro) => {
        Left(index)
      }
    }

  def toNamed[ProType]: SimpleProduct1.TypeGen[({ type X[T0] = (Int, T0) => Either[Int, ProType] })#X, ({ type T1[_] = ProType })#T1] =
    new SimpleProduct1.TypeGen[({ type X[T0] = (Int, T0) => Either[Int, ProType] })#X, ({ type T1[_] = ProType })#T1] {
      override def apply[T]: (Int, ProType) => Either[Int, ProType] = (index, pro) => {
        if (index == 0) Right(pro) else Left(index - 1)
      }
    }

  class Builder[F[_[_]]] {
    def derived(appender1: SimpleProduct1.Appender[F]): GetPropertyByIndex[F] = new GetPropertyByIndex[F] {
      override def byIndexImpl[UX](index: Int): F[({ type X1[_] = UX })#X1] => UX = (fM: F[({ type X1[_] = UX })#X1]) => {
        val containFunc =
          appender1.toHList1[({ type X[T0] = (Int, T0) => Either[Int, UX] })#X, ({ type T1[_] = UX })#T1](appendMonad[UX])(toNamed[UX])
        containFunc(index, fM).getOrElse(throw new Exception("Out of Index."))
      }
    }
  }

  def apply[F[_[_]]]: Builder[F] = new Builder[F]

}
