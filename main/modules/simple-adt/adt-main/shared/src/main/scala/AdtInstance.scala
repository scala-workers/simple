package net.scalax.simple.adt
package instance

trait AdtHList

object AdtHList {
  AdtHListSelf =>

  object zero extends AdtHList

  trait Positive[+H, +Tail <: AdtHList] extends AdtHList {
    def head: H
    def tail: Tail
  }
  object Positive {
    def append[H1, T1 <: AdtHList](h: H1, t: T1): AdtHListSelf.Positive[H1, T1] = new AdtHListSelf.Positive[H1, T1] {
      override def head: H1 = h
      override def tail: T1 = t
    }
  }

  trait UsePositive[H1, T1 <: AdtHList] extends Positive[H1, T1] {
    def head: H1
    def tail: T1
  }
  object UsePositive {
    def append[H1, T1 <: AdtHList](h: H1, t: T1): AdtHListSelf.UsePositive[H1, T1] = new AdtHListSelf.UsePositive[H1, T1] {
      override def head: H1 = h
      override def tail: T1 = t
    }
  }
}

trait AdtCoProduct

object AdtCoProduct {
  AdtCoProductSelf =>

  class One[+T](val value: T)            extends AdtCoProduct
  class UseOne[T](override val value: T) extends One[T](value = value)

  trait Positive[+H, +Tail <: AdtCoProduct] extends AdtCoProduct {
    def fold[TU](hFunc: H => TU, tFunc: Tail => TU): TU
  }
  object Positive {
    def left[H1, T1 <: AdtCoProduct](h: H1): AdtCoProductSelf.Positive[H1, T1] = new AdtCoProductSelf.Positive[H1, T1] {
      override def fold[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = hFunc(h)
    }
    def right[H1, T1 <: AdtCoProduct](r: T1): AdtCoProductSelf.Positive[H1, T1] = new AdtCoProductSelf.Positive[H1, T1] {
      override def fold[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = tFunc(r)
    }
  }

  trait UsePositive[H1, T1 <: AdtCoProduct] extends AdtCoProductSelf.Positive[H1, T1] {
    override def fold[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU
  }
  object UsePositive {
    def left[H1, T1 <: AdtCoProduct](h: H1): AdtCoProductSelf.UsePositive[H1, T1] = new AdtCoProductSelf.UsePositive[H1, T1] {
      override def fold[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = hFunc(h)
    }
    def right[H1, T1 <: AdtCoProduct](r: T1): AdtCoProductSelf.UsePositive[H1, T1] = new AdtCoProductSelf.UsePositive[H1, T1] {
      override def fold[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = tFunc(r)
    }
  }
}
