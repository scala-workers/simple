package net.scalax.simple.adt
package nat
package support

object ExtPro extends ExtractProductAbstraction[shapeless.HList, shapeless.::, shapeless.HNil] {
  override val hListFunc: HListFunc[shapeless.HList, shapeless.::] = HAppender
  override val zero: shapeless.HNil                                = shapeless.HNil
  override def runtimeCountSize(t: shapeless.HList): Int           = t.runtimeLength
  override def labelledItemToString(t: Any): String                = t.asInstanceOf[Symbol].name
}

object HAppender extends HListFunc[shapeless.HList, shapeless.::] {
  override def takeHead[Head, Tail <: shapeless.HList](m: shapeless.::[Head, Tail]): Head        = m.head
  override def takeTail[Head, Tail <: shapeless.HList](m: shapeless.::[Head, Tail]): Tail        = m.tail
  override def append[Head, Tail <: shapeless.HList](h: Head, t: Tail): shapeless.::[Head, Tail] = shapeless.::[Head, Tail](h, t)
}

class ExtractProductUtil(override val extraAbstraction: ExtractProductAbstraction[shapeless.HList, shapeless.::, shapeless.HNil])
    extends ExtractProduct[shapeless.HList, shapeless.::, shapeless.HNil]

object ExtractProductUtil extends ExtractProductUtil(extraAbstraction = ExtPro)
