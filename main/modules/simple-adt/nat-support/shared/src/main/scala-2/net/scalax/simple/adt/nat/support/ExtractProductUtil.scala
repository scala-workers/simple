package net.scalax.simple.adt
package nat
package support

object ExtractProductUtil extends ExtractProduct[shapeless.HList, shapeless.::, shapeless.HNil] {
  override val hListFunc: HListFunc[shapeless.HList, shapeless.::] = HListFuncAppender
  override val zero: shapeless.HNil                                = shapeless.HNil
}

object HListFuncAppender extends HListFunc[shapeless.HList, shapeless.::] {
  override def takeHead[Head, Tail <: shapeless.HList](m: shapeless.::[Head, Tail]): Head        = m.head
  override def takeTail[Head, Tail <: shapeless.HList](m: shapeless.::[Head, Tail]): Tail        = m.tail
  override def append[Head, Tail <: shapeless.HList](h: Head, t: Tail): shapeless.::[Head, Tail] = shapeless.::[Head, Tail](h, t)
}
