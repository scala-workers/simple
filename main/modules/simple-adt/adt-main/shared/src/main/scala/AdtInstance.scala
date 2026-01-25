package net.scalax.simple.adt
package instance

trait AdtHList

object AdtHList {
  AdtHListSelf =>

  val zero: AdtHList = new AdtHList {
    //
  }

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
trait UseAdtCoProduct extends AdtCoProduct

trait AdtEither[+L, +R] {
  def _foldCoProduct[TU](hFunc: L => TU, tFunc: R => TU): TU
}

trait UseAdtEither[L, R] extends AdtEither[L, R]

object AdtCoProduct {
  AdtCoProductSelf =>

  trait One[+T] extends AdtCoProduct with AdtEither[T, One[T]]
  object One {
    OneSelf =>

    def left[T](t: T): One[T] = new One[T] {
      override def _foldCoProduct[TU](hFunc: T => TU, tFunc: One[T] => TU): TU = hFunc(t)
    }
    def rgiht[T](one: One[T]): One[T] = new One[T] {
      override def _foldCoProduct[TU](hFunc: T => TU, tFunc: One[T] => TU): TU = tFunc(one)
    }

    def unapply[T](one: One[T]): Some[T] = one._foldCoProduct[Some[T]]((t: T) => Some(t), (one: One[T]) => OneSelf.unapply[T](one))
  }
  trait UseOne[T] extends One[T] with UseAdtCoProduct with UseAdtEither[T, UseOne[T]]
  object UseOne {
    UseOneSelf =>

    def left[T](t: T): UseOne[T] = new UseOne[T] {
      override def _foldCoProduct[TU](hFunc: T => TU, tFunc: UseOne[T] => TU): TU = hFunc(t)
    }
    def rgiht[T](one: UseOne[T]): One[T] = new UseOne[T] {
      override def _foldCoProduct[TU](hFunc: T => TU, tFunc: UseOne[T] => TU): TU = tFunc(one)
    }

    def unapply[T](one: UseOne[T]): Some[T] = one._foldCoProduct[Some[T]]((t: T) => Some(t), (one: UseOne[T]) => UseOneSelf.unapply[T](one))
  }

  trait Positive[+H, +Tail <: AdtCoProduct] extends AdtCoProduct with AdtEither[H, Tail]

  object Positive {
    def left[H1, T1 <: AdtCoProduct](h: H1): AdtCoProductSelf.Positive[H1, T1] = new AdtCoProductSelf.Positive[H1, T1] {
      override def _foldCoProduct[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = hFunc(h)
    }
    def right[H1, T1 <: AdtCoProduct](r: T1): AdtCoProductSelf.Positive[H1, T1] = new AdtCoProductSelf.Positive[H1, T1] {
      override def _foldCoProduct[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = tFunc(r)
    }
  }

  trait UsePositive[H1, T1 <: UseAdtCoProduct] extends AdtCoProductSelf.Positive[H1, T1] with UseAdtEither[H1, T1] with UseAdtCoProduct {
    override def _foldCoProduct[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU
  }
  object UsePositive {
    def left[H1, T1 <: UseAdtCoProduct](h: H1): AdtCoProductSelf.UsePositive[H1, T1] = new AdtCoProductSelf.UsePositive[H1, T1] {
      override def _foldCoProduct[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = hFunc(h)
    }
    def right[H1, T1 <: UseAdtCoProduct](r: T1): AdtCoProductSelf.UsePositive[H1, T1] = new AdtCoProductSelf.UsePositive[H1, T1] {
      override def _foldCoProduct[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = tFunc(r)
    }

    object Left {
      def unapply[H1](u: UsePositive[H1, _ <: UseAdtCoProduct]): Option[H1] = u._foldCoProduct[Option[H1]]((h1: H1) => Some(h1), _ => None)
    }
    object Right {
      def unapply[T1 <: UseAdtCoProduct](u: UsePositive[_, T1]): Option[T1] = u._foldCoProduct[Option[T1]](_ => None, (t1: T1) => Some(t1))
    }
  }
}
