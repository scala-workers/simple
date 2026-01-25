package net.scalax.simple.adt
package instance
package support

import net.scalax.simple.append.support.collectioncount22.typeparameter22.SimpleAppender

object AppendTail6 {

  type AppendAny[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, Tail1 <: Any] = Any

  trait AppenderAlias[M[_ <: Pro1], Pro1, AppendPro1[_, _ <: Pro1] <: Pro1, ProInstance1 <: Pro1]
      extends SimpleAppender[
        ({
          type KM1[
            T1 <: Pro1,
            T2 <: Any,
            T3 <: Any,
            T4 <: Any,
            T5 <: Any,
            T6 <: Any,
            T7 <: Any,
            T8 <: Any,
            T9 <: Any,
            T10 <: Any,
            T11 <: Any,
            T12 <: Any,
            T13 <: Any,
            T14 <: Any,
            T15 <: Any,
            T16 <: Any,
            T17 <: Any,
            T18 <: Any,
            T19 <: Any,
            T20 <: Any,
            T21 <: Any,
            T22 <: Any
          ] = M[T1]
        })#KM1,
        Pro1,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        ({
          type Ty1[
            T1,
            T2,
            T3,
            T4,
            T5,
            T6,
            T7,
            T8,
            T9,
            T10,
            T11,
            T12,
            T13,
            T14,
            T15,
            T16,
            T17,
            T18,
            T19,
            T20,
            T21,
            T22,
            Tail1 <: Pro1
          ] = AppendPro1[T1, Tail1]
        })#Ty1,
        AppendAny,
        AppendAny,
        AppendAny,
        AppendAny,
        AppendAny,
        AppendAny,
        AppendAny,
        AppendAny,
        AppendAny,
        AppendAny,
        AppendAny,
        AppendAny,
        AppendAny,
        AppendAny,
        AppendAny,
        AppendAny,
        AppendAny,
        AppendAny,
        AppendAny,
        AppendAny,
        AppendAny,
        ProInstance1,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any,
        Any
      ] {
    override def next[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
      : AppenderAlias[M, Pro1, AppendPro1, AppendPro1[T1, ProInstance1]]
  }

  trait AppendToOption[TPoint, XU1 <: UseAdtCoProduct]
      extends AppenderAlias[({ type XM[U <: UseAdtCoProduct] = U => Option[TPoint] })#XM, UseAdtCoProduct, AdtCoProduct.UsePositive, XU1] {
    AppendToOptionSelf =>

    override def next[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
      : AppendToOption[TPoint, AdtCoProduct.UsePositive[T1, XU1]] = new AppendToOption[TPoint, AdtCoProduct.UsePositive[T1, XU1]] {
      override def current: AdtCoProduct.UsePositive[T1, XU1] => Option[TPoint] = (m1: AdtCoProduct.UsePositive[T1, XU1]) => {
        m1._foldCoProduct[Option[TPoint]]((t1: T1) => Option.empty[TPoint], (xu1: XU1) => AppendToOptionSelf.current(xu1))
      }
    }
  }

  object AppendToOption extends LawImplicit {
    implicit def appendToZero[OneType, ZeroInstance <: UseAdtCoProduct]
      : AppendToOption[OneType, AdtCoProduct.UsePositive[OneType, ZeroInstance]] =
      new AppendToOption[OneType, AdtCoProduct.UsePositive[OneType, ZeroInstance]] {
        override def current: AdtCoProduct.UsePositive[OneType, ZeroInstance] => Option[OneType] =
          (m: AdtCoProduct.UsePositive[OneType, ZeroInstance]) => {
            m._foldCoProduct[Option[OneType]]((oneType: OneType) => Some(oneType), (zeroInstance: ZeroInstance) => Option.empty[OneType])
          }
      }

    implicit def appendToOne[OneType]: AppendToOption[OneType, AdtCoProduct.UseOne[OneType]] =
      new AppendToOption[OneType, AdtCoProduct.UseOne[OneType]] {
        override def current: AdtCoProduct.UseOne[OneType] => Option[OneType] = (m: AdtCoProduct.UseOne[OneType]) => {
          AdtCoProduct.UseOne.unapply(m)
        }
      }
  }

  trait LawImplicit {
    implicit def appendToOption[T1, OT, ZT <: UseAdtCoProduct](implicit
      tail: AppendToOption[OT, ZT]
    ): AppendToOption[OT, AdtCoProduct.UsePositive[T1, ZT]] =
      tail.next[T1, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  }

  def toValue[OneType, ZeroInstance <: UseAdtCoProduct](
    m: AdtCoProduct.UsePositive[OneType, ZeroInstance]
  ): AdtCoProduct.UsePositive[OneType, ZeroInstance] = m

  trait Apply[T] {
    def take[A <: UseAdtCoProduct](a: A)(implicit k: AppendToOption[T, A]): Option[T] = k.current(a)
  }

  def apply[T]: Apply[T] = new Apply[T] {
    //
  }

}
