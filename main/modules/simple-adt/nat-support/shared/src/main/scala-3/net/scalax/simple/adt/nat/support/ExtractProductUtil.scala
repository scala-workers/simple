package net.scalax.simple.adt
package nat
package support

object ExtPro extends ExtractProductAbstraction[Tuple, *:, EmptyTuple] {
  override val hListFunc: HListFunc[Tuple, *:]             = HAppender
  override val zero: EmptyTuple                            = EmptyTuple
  override inline def runtimeCountSize(t: Tuple): Int      = t.productArity
  override inline def labelledItemToString(t: Any): String = t.asInstanceOf[String]
}

object HAppender extends HListFunc[Tuple, *:] {
  override def takeHead[Head, Tail <: Tuple](m: Head *: Tail): Head        = m.head
  override def takeTail[Head, Tail <: Tuple](m: Head *: Tail): Tail        = m.tail
  override def append[Head, Tail <: Tuple](h: Head, t: Tail): Head *: Tail = h *: t
}

class ExtractProductUtil(override val extraAbstraction: ExtractProductAbstraction[Tuple, *:, EmptyTuple])
    extends ExtractProduct[Tuple, *:, EmptyTuple]

object ExtractProductUtil extends ExtractProductUtil(extraAbstraction = ExtPro)
