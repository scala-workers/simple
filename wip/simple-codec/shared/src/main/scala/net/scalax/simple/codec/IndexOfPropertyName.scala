package net.scalax.simple.codec

import to_list_generic.SimpleProduct1

trait IndexOfPropertyName[F[_[_]]] {
  def ofName(input1: String, model: F[({ type T1[_] = String })#T1]): Int
}

object IndexOfPropertyName {

  val keepIndex: Int => Int = identity _
  val upIndex: Int => Int   = t => t + 1

  trait ContainsString[T] {
    def input(t: T): Int => Int
  }

  val appendMonad: SimpleProduct1.AppendMonad[ContainsString] = new SimpleProduct1.AppendMonad[ContainsString] {
    override def zip[A1, B1, C1](
      c: SimpleProduct1.ConvertF[A1, B1, C1],
      ma: ContainsString[A1],
      mb: ContainsString[B1]
    ): ContainsString[C1] = new ContainsString[C1] {
      override def input(t: C1): Int => Int = {
        def head1: A1 = c.takeHead1(t)
        def tail1: B1 = c.takeTail1(t)

        t => mb.input(tail1)(ma.input(head1)(t))
      }
    }

    override def zero[N1](n1: N1): ContainsString[N1] = new ContainsString[N1] {
      override def input(t: N1): Int => Int = keepIndex
    }
  }

  def toNamed(proNameToFind: String): SimpleProduct1.TypeGen[ContainsString, ({ type T1[_] = String })#T1] =
    new SimpleProduct1.TypeGen[ContainsString, ({ type T1[_] = String })#T1] {
      override def apply[T]: ContainsString[String] = new ContainsString[String] {
        override def input(t: String): Int => Int = if (t == proNameToFind) keepIndex else upIndex
      }
    }

  class Builder[F[_[_]]] {
    def derived(appender1: SimpleProduct1.Appender[F]): IndexOfPropertyName[F] = new IndexOfPropertyName[F] {
      override def ofName(input1: String, model: F[({ type T1[_] = String })#T1]): Int = {
        val containFunc = appender1.toHList1[ContainsString, ({ type T1[_] = String })#T1](appendMonad)(toNamed(input1))
        containFunc.input(model)(0)
      }
    }
  }

  def apply[F[_[_]]]: Builder[F] = new Builder[F]

}
