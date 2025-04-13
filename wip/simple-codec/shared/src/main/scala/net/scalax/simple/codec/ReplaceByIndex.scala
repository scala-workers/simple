package net.scalax.simple.codec

import net.scalax.simple.codec.to_list_generic.SimpleProduct1

trait ReplaceByIndex[F[_[_]]] {
  def replace[T[_]](index: Int, proValue: Any): F[T] => F[T]
}

object ReplaceByIndex {

  private type MA[H] = (Int, Any, H) => H
  private val appendMonad: SimpleProduct1.AppendMonad[MA] = new SimpleProduct1.AppendMonad[MA] {
    override def zip[A1, B1, C1](
      c: SimpleProduct1.ConvertF[A1, B1, C1],
      ma: (Int, Any, A1) => A1,
      mb: (Int, Any, B1) => B1
    ): (Int, Any, C1) => C1 = (index, anyModel, c1) => {
      if (index >= 0) {
        val oldA1: A1 = c.takeHead1(c1)
        val oldB1: B1 = c.takeTail1(c1)
        val newA1: A1 = ma(index, anyModel, oldA1)
        val newB1: B1 = mb(index - 1, anyModel, oldB1)

        c.from1(newA1, newB1)
      } else c1
    }

    @inline override def zero[N1](n1: N1): (Int, Any, N1) => N1 = (_, _, t) => t
  }

  private def funcImpl[T[_]]: SimpleProduct1.TypeGen[MA, T] = new SimpleProduct1.TypeGen[MA, T] {
    @inline override def apply[X1]: (Int, Any, T[X1]) => T[X1] = (index, anyModel, x1) =>
      if (index == 0) anyModel.asInstanceOf[T[X1]] else x1
  }

  class Builder[F[_[_]]] {
    def derived(fromList: SimpleProduct1.Appender[F]): ReplaceByIndex[F] = new ReplaceByIndex[F] {
      override def replace[T[_]](index: Int, proValue: Any): F[T] => F[T] = {
        val fromInt = fromList.toHList1[MA, T](appendMonad)(funcImpl[T])
        (t: F[T]) => fromInt(index, proValue, t)
      }
    }
  }

  def apply[F[_[_]]]: Builder[F] = new Builder[F]

}
