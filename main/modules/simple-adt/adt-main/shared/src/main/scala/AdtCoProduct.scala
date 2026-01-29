package net.scalax.simple.adt
package instance

object AdtCoProduct {
  AdtCoProductSelf =>

  type AdtType = AdtCoProductSelf.Positive[_, _]
  trait Positive[+H, +Tail <: AdtCoProductSelf.Positive[_, _]] {
    def _foldCoProduct[TU](hFunc: H => TU, tFunc: Tail => TU): TU
  }
  object Positive {
    def left[H1, T1 <: AdtCoProductSelf.AdtType](h: H1): AdtCoProductSelf.Positive[H1, T1] = new AdtCoProductSelf.Positive[H1, T1] {
      override def _foldCoProduct[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = hFunc(h)
    }
    def right[H1, T1 <: AdtCoProductSelf.AdtType](r: T1): AdtCoProductSelf.Positive[H1, T1] = new AdtCoProductSelf.Positive[H1, T1] {
      override def _foldCoProduct[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = tFunc(r)
    }

    object Left {
      def unapply[H1](u: AdtCoProductSelf.Positive[H1, _ <: AdtCoProductSelf.AdtType]): Option[H1] =
        u._foldCoProduct[Option[H1]]((h1: H1) => Some(h1), _ => None)
    }
    object Right {
      def unapply[T1 <: AdtCoProductSelf.AdtType](u: AdtCoProductSelf.Positive[_, T1]): Option[T1] =
        u._foldCoProduct[Option[T1]](_ => None, (t1: T1) => Some(t1))
    }
  }

  trait One[+T] extends Positive[T, AdtCoProductSelf.One[T]]
  object One { OneSelf =>

    def left[T](t: T): AdtCoProductSelf.One[T] = new AdtCoProductSelf.One[T] {
      override def _foldCoProduct[TU](hFunc: T => TU, tFunc: One[T] => TU): TU = hFunc(t)
    }
    def right[T](one: One[T]): AdtCoProductSelf.One[T] = new AdtCoProductSelf.One[T] {
      override def _foldCoProduct[TU](hFunc: T => TU, tFunc: AdtCoProductSelf.One[T] => TU): TU = tFunc(one)
    }

    def foldOnece[T, U](one: One[T])(func: T => U): U =
      one._foldCoProduct[U](func, (otherOne: One[T]) => OneSelf.foldOnece[T, U](otherOne)(func))
    def merge[T](one: One[T]): T                          = OneSelf.foldOnece[T, T](one)(identity[T])
    def unapply[T](one: AdtCoProductSelf.One[T]): Some[T] = Some(OneSelf.merge[T](one))

  }

  object Use {

    type AdtType = AdtCoProductSelf.Use.Positive[_, _]
    trait Positive[H1, T1 <: AdtCoProductSelf.Use.AdtType] extends AdtCoProductSelf.Positive[H1, T1]
    object Positive {

      def left[H1, T1 <: AdtCoProductSelf.Use.AdtType](h: H1): AdtCoProductSelf.Use.Positive[H1, T1] =
        new AdtCoProductSelf.Use.Positive[H1, T1] {
          override def _foldCoProduct[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = hFunc(h)
        }
      def right[H1, T1 <: AdtCoProductSelf.Use.AdtType](r: T1): AdtCoProductSelf.Use.Positive[H1, T1] =
        new AdtCoProductSelf.Use.Positive[H1, T1] {
          override def _foldCoProduct[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = tFunc(r)
        }

      object Left {
        def unapply[H1](u: AdtCoProductSelf.Use.Positive[H1, _ <: AdtCoProductSelf.Use.AdtType]): Option[H1] =
          u._foldCoProduct[Option[H1]]((h1: H1) => Some(h1), _ => None)
      }
      object Right {
        def unapply[T1 <: AdtCoProductSelf.Use.AdtType](u: AdtCoProductSelf.Use.Positive[_, T1]): Option[T1] =
          u._foldCoProduct[Option[T1]](_ => None, (t1: T1) => Some(t1))
      }

    }

    trait One[T] extends AdtCoProductSelf.One[T] with AdtCoProductSelf.Use.Positive[T, AdtCoProductSelf.Use.One[T]]
    object One { UseOneSelf =>

      def left[T](t: T): AdtCoProductSelf.Use.One[T] = new AdtCoProductSelf.Use.One[T] {
        override def _foldCoProduct[TU](hFunc: T => TU, tFunc: AdtCoProductSelf.Use.One[T] => TU): TU = hFunc(t)
      }
      def right[T](one: AdtCoProductSelf.Use.One[T]): AdtCoProductSelf.Use.One[T] = new AdtCoProductSelf.Use.One[T] {
        override def _foldCoProduct[TU](hFunc: T => TU, tFunc: AdtCoProductSelf.Use.One[T] => TU): TU = tFunc(one)
      }

      def foldOnece[T, U](one: AdtCoProductSelf.Use.One[T])(func: T => U): U = AdtCoProductSelf.One.foldOnece[T, U](one)(func)
      def merge[T](one: AdtCoProductSelf.Use.One[T]): T                      = AdtCoProductSelf.One.merge[T](one)
      def unapply[T](one: AdtCoProductSelf.Use.One[T]): Some[T]              = AdtCoProductSelf.One.unapply[T](one)

    }
  }

  object Common {

    type AdtType = AdtCoProductSelf.Common.Positive[_, _]
    trait Positive[H1, +T1 <: AdtCoProductSelf.Common.AdtType] extends AdtCoProductSelf.Positive[H1, T1]
    object Positive {

      object Left {
        def apply[H1, T1 <: AdtCoProductSelf.Common.AdtType](h: H1): AdtCoProductSelf.Common.Positive[H1, T1] =
          new AdtCoProductSelf.Common.Positive[H1, T1] {
            override def _foldCoProduct[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = hFunc(h)
          }

        def unapply[H1](u: AdtCoProductSelf.Common.Positive[H1, _ <: AdtCoProductSelf.Common.AdtType]): Option[H1] =
          u._foldCoProduct[Option[H1]]((h1: H1) => Some(h1), _ => None)
      }
      object Right {
        def apply[H1, T1 <: AdtCoProductSelf.Common.AdtType](r: T1): AdtCoProductSelf.Common.Positive[H1, T1] =
          new AdtCoProductSelf.Common.Positive[H1, T1] {
            override def _foldCoProduct[TU](hFunc: H1 => TU, tFunc: T1 => TU): TU = tFunc(r)
          }

        def unapply[T1 <: AdtCoProductSelf.Common.AdtType](u: AdtCoProductSelf.Common.Positive[_, T1]): Option[T1] =
          u._foldCoProduct[Option[T1]](_ => None, (t1: T1) => Some(t1))
      }

    }

  }

}
