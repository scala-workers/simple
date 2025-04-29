package net.scalax.simple.codec

import to_list_generic.SimpleProduct1

/*trait GetPropertyByIndex[F[_[_]]] {
  def byIndex(index: Int): Any
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

  val appendMonad: SimpleProduct1.AppendMonad[({ type X[_] = Either[Int, Any] })#X] =
    new SimpleProduct1.AppendMonad[({ type X[_] = Either[Int, Any] })#X] {
      override def zip[A1, B1, C1](
        c: SimpleProduct1.ConvertF[A1, B1, C1],
        ma: Either[Int, Any],
        mb: Either[Int, Any]
      ): Either[Int, Any] = {
        11
      }

      override def zero[N1](n1: N1): ContainsString[N1] = new ContainsString[N1] {
        override def input(t: N1): Either[ListLike, ListLike => ListLike] = Right(identity)
      }
    }

  def toNamed(proNameToFind: String): SimpleProduct1.TypeGen[ContainsString, ({ type T1[_] = String })#T1] =
    new SimpleProduct1.TypeGen[ContainsString, ({ type T1[_] = String })#T1] {
      override def apply[T]: ContainsString[String] = new ContainsString[String] {
        override def input(str: String): Either[ListLike, ListLike => ListLike] = {
          if (str == proNameToFind) Left(ZeroListLike) else Right(t => PositiveListLike(t))
        }
      }
    }

  class Builder[F[_[_]]] {
    def derived(appender1: SimpleProduct1.Appender[F]): IndexOfPropertyName[F] = new IndexOfPropertyName[F] {
      override def ofName(input1: String, model: F[({ type T1[_] = String })#T1]): Int = {
        val containFunc = appender1.toHList1[ContainsString, ({ type T1[_] = String })#T1](appendMonad)(toNamed(input1))
        containFunc.input(model).left.getOrElse(throw new Exception("Not confirm property name.")).size
      }
    }
  }

  def apply[F[_[_]]]: Builder[F] = new Builder[F]

}*/
