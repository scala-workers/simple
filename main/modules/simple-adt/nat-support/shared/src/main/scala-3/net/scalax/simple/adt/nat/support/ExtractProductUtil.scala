package net.scalax.simple.adt
package nat
package support

object ExtractProductUtil extends ExtractProduct[Tuple, *:, EmptyTuple] {
  override val hListFunc: HListFunc[Tuple, *:] = HListFuncAppender
  override val zero: EmptyTuple                = EmptyTuple
}

object HListFuncAppender extends HListFunc[Tuple, *:] {
  override def takeHead[Head, Tail <: Tuple](m: Head *: Tail): Head        = m.head
  override def takeTail[Head, Tail <: Tuple](m: Head *: Tail): Tail        = m.tail
  override def append[Head, Tail <: Tuple](h: Head, t: Tail): Head *: Tail = h *: t
}
