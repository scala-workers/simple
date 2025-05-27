package net.scalax.simple.adt
package nat
package support

trait HListFunc[HLLike, Ap[_, _ <: HLLike] <: HLLike] {
  def takeHead[Head, Tail <: HLLike](m: Ap[Head, Tail]): Head
  def takeTail[Head, Tail <: HLLike](m: Ap[Head, Tail]): Tail
  def append[Head, Tail <: HLLike](h: Head, t: Tail): Ap[Head, Tail]
}
