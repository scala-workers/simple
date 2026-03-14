package net.scalax.simple.adt.nat.support
package v5

object Append2Impl extends v5.AppenderSupport2[shapeless.HList, shapeless.::] {
  private object hlistFunc1 extends HListFunc[shapeless.HList, shapeless.::] {
    override def takeHead[Head, Tail <: shapeless.HList](m: shapeless.::[Head, Tail]): Head        = m.head
    override def takeTail[Head, Tail <: shapeless.HList](m: shapeless.::[Head, Tail]): Tail        = m.tail
    override def append[Head, Tail <: shapeless.HList](h: Head, t: Tail): shapeless.::[Head, Tail] = shapeless.::[Head, Tail](h, t)

    private lazy val anyToABCFunc: ABCFunc[Any, shapeless.HList, shapeless.::[Any, shapeless.HList]] = super.toABCFunc[Any, shapeless.HList]
    override def toABCFunc[Head, HCollecio <: shapeless.HList]: ABCFunc[Head, HCollecio, shapeless.::[Head, HCollecio]] =
      anyToABCFunc.asInstanceOf[ABCFunc[Head, HCollecio, shapeless.::[Head, HCollecio]]]
  }

  override def abcGen[H, T <: shapeless.HList]: ABCFunc[H, T, shapeless.::[H, T]] = hlistFunc1.toABCFunc[H, T]
}
