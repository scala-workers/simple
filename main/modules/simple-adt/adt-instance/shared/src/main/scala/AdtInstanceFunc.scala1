package net.scalax.simple.adt
package instance

import nat.support.{AppendSimpleAdt, CoProductFunc, CoProductUtil2, HListFunc}

object AdtInstanceFunc {
  AdtInstanceFuncSelf =>

  val coProductFunc: CoProductFunc[AdtCoProduct, AdtCoProduct.UsePositive] = new CoProductFunc[AdtCoProduct, AdtCoProduct.UsePositive] {
    override def appendLeft[Head, Tail <: AdtCoProduct](m: Head): AdtCoProduct.UsePositive[Head, Tail]  = AdtCoProduct.UsePositive.left(m)
    override def appendRight[Head, Tail <: AdtCoProduct](m: Tail): AdtCoProduct.UsePositive[Head, Tail] = AdtCoProduct.UsePositive.right(m)
    override def fold[Head, Tail <: AdtCoProduct, U](h: Head => U, t: Tail => U): AdtCoProduct.UsePositive[Head, Tail] => U = adtP =>
      adtP.fold(h, t)
  }

  val hlistFunc: HListFunc[AdtHList, AdtHList.UsePositive] = new HListFunc[AdtHList, AdtHList.UsePositive] {
    override def takeHead[Head, Tail <: AdtHList](m: AdtHList.UsePositive[Head, Tail]): Head        = m.head
    override def takeTail[Head, Tail <: AdtHList](m: AdtHList.UsePositive[Head, Tail]): Tail        = m.tail
    override def append[Head, Tail <: AdtHList](h: Head, t: Tail): AdtHList.UsePositive[Head, Tail] = AdtHList.UsePositive.append(h, t)
  }

  val coProductUtil2
    : CoProductUtil2[AdtCoProduct, AdtCoProduct.UsePositive, AdtHList, AdtHList.UsePositive, AdtCoProduct, AdtCoProduct.UsePositive] =
    new CoProductUtil2[AdtCoProduct, AdtCoProduct.UsePositive, AdtHList, AdtHList.UsePositive, AdtCoProduct, AdtCoProduct.UsePositive](
      coProductFunc,
      hlistFunc,
      coProductFunc
    )

  val appendSimpleAdt
    : AppendSimpleAdt[AdtCoProduct, AdtCoProduct.UsePositive, AdtHList, AdtHList.UsePositive, AdtCoProduct, AdtCoProduct.UsePositive] =
    coProductUtil2

}
