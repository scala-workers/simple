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

object AdtCoProduct {
  AdtCoProductSelf =>

  type AdtType    = Positive[_, _]
  type UseAdtType = UsePositive[_, _]

  trait One[+T] extends Positive[T, One[T]] { OneSelf =>
    def _foldOne[TU](m: T => TU): TU = OneSelf._foldCoProduct[TU](m, (oth: One[T]) => oth._foldOne[TU](m))
  }
  object One {
    OneSelf =>

    def left[T](t: T): One[T] = new One[T] {
      override def _foldCoProduct[TU](hFunc: T => TU, tFunc: One[T] => TU): TU = hFunc(t)
    }
    def rgiht[T](one: One[T]): One[T] = new One[T] {
      override def _foldCoProduct[TU](hFunc: T => TU, tFunc: One[T] => TU): TU = tFunc(one)
    }

    def unapplyImpl[T](one: One[T]): T   = one._foldOne[T](identity[T])
    def unapply[T](one: One[T]): Some[T] = Some(OneSelf.unapplyImpl[T](one))
  }
  trait UseOne[T] extends One[T] with UsePositive[T, UseOne[T]]
  object UseOne {
    UseOneSelf =>

    def left[T](t: T): UseOne[T] = new UseOne[T] {
      override def _foldCoProduct[TU](hFunc: T => TU, tFunc: UseOne[T] => TU): TU = hFunc(t)
    }
    def right[T](one: UseOne[T]): One[T] = new UseOne[T] {
      override def _foldCoProduct[TU](hFunc: T => TU, tFunc: UseOne[T] => TU): TU = tFunc(one)
    }

    def unapplyImpl[T](one: UseOne[T]): T   = one._foldOne[T](identity[T])
    def unapply[T](one: UseOne[T]): Some[T] = Some(UseOneSelf.unapplyImpl[T](one))
  }

  trait Positive[+H, +Tail <: Positive[_, _]] {
    def _foldCoProduct[TU](hFunc: H => TU, tFunc: Tail => TU): TU
  }

  object Positive {
    def left[H1, T1 <: Positive[_, _]](h: H1): AdtCoProductSelf.Positive[H1, T1] = new AdtCoProductSelf.Positive[H1, T1] {
      override def _foldCoProduct[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = hFunc(h)
    }
    def right[H1, T1 <: Positive[_, _]](r: T1): AdtCoProductSelf.Positive[H1, T1] = new AdtCoProductSelf.Positive[H1, T1] {
      override def _foldCoProduct[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = tFunc(r)
    }
  }

  trait UsePositive[H1, T1 <: UsePositive[_, _]] extends AdtCoProductSelf.Positive[H1, T1]
  object UsePositive {
    def left[H1, T1 <: UsePositive[_, _]](h: H1): AdtCoProductSelf.UsePositive[H1, T1] = new AdtCoProductSelf.UsePositive[H1, T1] {
      override def _foldCoProduct[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = hFunc(h)
    }
    def right[H1, T1 <: UsePositive[_, _]](r: T1): AdtCoProductSelf.UsePositive[H1, T1] = new AdtCoProductSelf.UsePositive[H1, T1] {
      override def _foldCoProduct[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = tFunc(r)
    }

    object Left {
      def unapply[H1](u: UsePositive[H1, _ <: UsePositive[_, _]]): Option[H1] =
        u._foldCoProduct[Option[H1]]((h1: H1) => Some(h1), _ => None)
    }
    object Right {
      def unapply[T1 <: UsePositive[_, _]](u: UsePositive[_, T1]): Option[T1] =
        u._foldCoProduct[Option[T1]](_ => None, (t1: T1) => Some(t1))
    }
  }
}
