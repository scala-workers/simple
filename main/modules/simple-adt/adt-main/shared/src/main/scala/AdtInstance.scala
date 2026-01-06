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

  trait UsePositive[H1, T1 <: AdtHList] extends Positive[H1, T1]
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

  trait One[+T] extends AdtCoProduct {
    def value: T
  }
  trait UseOne[T] extends One[T]

  trait Positive[+H, +Tail <: AdtCoProduct] extends AdtCoProduct {
    def _foldCoProduct[TU](hFunc: H => TU, tFunc: Tail => TU): TU
  }
  object Positive {
    def left[H1, T1 <: AdtCoProduct](h: H1): AdtCoProductSelf.Positive[H1, T1] = new AdtCoProductSelf.Positive[H1, T1] {
      override def _foldCoProduct[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = hFunc(h)
    }
    def right[H1, T1 <: AdtCoProduct](r: T1): AdtCoProductSelf.Positive[H1, T1] = new AdtCoProductSelf.Positive[H1, T1] {
      override def _foldCoProduct[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = tFunc(r)
    }
  }

  trait UsePositive[H1, T1 <: AdtCoProduct] extends AdtCoProductSelf.Positive[H1, T1] {
    override def _foldCoProduct[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU
  }
  object UsePositive {
    def left[H1, T1 <: AdtCoProduct](h: H1): AdtCoProductSelf.UsePositive[H1, T1] = new AdtCoProductSelf.UsePositive[H1, T1] {
      override def _foldCoProduct[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = hFunc(h)
    }
    def right[H1, T1 <: AdtCoProduct](r: T1): AdtCoProductSelf.UsePositive[H1, T1] = new AdtCoProductSelf.UsePositive[H1, T1] {
      override def _foldCoProduct[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = tFunc(r)
    }

    object Left {
      def unapply[H1](u: UsePositive[H1, _ <: AdtCoProduct]): Option[H1] = u._foldCoProduct[Option[H1]]((h1: H1) => Some(h1), _ => None)
    }
    object Right {
      def unapply[T1 <: AdtCoProduct](u: UsePositive[_, T1]): Option[T1] = u._foldCoProduct[Option[T1]](_ => None, (t1: T1) => Some(t1))
    }
  }
}
