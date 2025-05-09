package net.scalax.simple.codec

import to_list_generic.SimpleProduct1

trait GetPropertyByIndex[F[_[_]]] {
  def byIndex[T[_]](model: F[T], index: Int): T[Any]
}

object GetPropertyByIndex {

  trait ListLike {
    def size: Int
  }
  object PositiveListLike extends (ListLike => ListLike) {
    override def apply(v1: ListLike): ListLike = new ListLike {
      override def size: Int = v1.size + 1
    }
  }
  object ZeroListLike extends ListLike {
    override def size: Int = 0
  }

  val appendMonad: SimpleProduct1.AppendMonad[({ type X[T0] = (Int, T0) => Either[Int, Any] })#X] =
    new SimpleProduct1.AppendMonad[({ type X[T0] = (Int, T0) => Either[Int, Any] })#X] {
      override def zip[A1, B1, C1](
        c: SimpleProduct1.ConvertF[A1, B1, C1],
        ma: (Int, A1) => Either[Int, Any],
        mb: (Int, B1) => Either[Int, Any]
      ): (Int, C1) => Either[Int, Any] = { (index, pro) =>
        ma(index, c.takeHead1(pro)).fold(index => mb(index, c.takeTail1(pro)), newInstance => Right(newInstance))
      }

      override def zero[N1](n1: N1): (Int, N1) => Either[Int, Any] = { (index, pro) =>
        Left(index)
      }
    }

  def toNamed[TXX[_]]: SimpleProduct1.TypeGen[({ type X[T0] = (Int, T0) => Either[Int, Any] })#X, TXX] =
    new SimpleProduct1.TypeGen[({ type X[T0] = (Int, T0) => Either[Int, Any] })#X, ({ type T1[U] = TXX[U] })#T1] {
      override def apply[T]: (Int, TXX[T]) => Either[Int, Any] = { (index, pro) =>
        if (index == 0) Right(pro) else Left(index - 1)
      }
    }

  class Builder[F[_[_]]] {
    def derived(appender1: SimpleProduct1.Appender[F]): GetPropertyByIndex[F] = new GetPropertyByIndex[F] {
      override def byIndex[TU[_]](model: F[TU], index: Int): TU[Any] = {
        val containFunc =
          appender1.toHList1[({ type X[T0] = (Int, T0) => Either[Int, Any] })#X, TU](appendMonad)(toNamed[TU])
        containFunc(index, model).getOrElse(throw new Exception("Out of Index.")).asInstanceOf[TU[Any]]
      }
    }
  }

  def apply[F[_[_]]]: Builder[F] = new Builder[F]

}
