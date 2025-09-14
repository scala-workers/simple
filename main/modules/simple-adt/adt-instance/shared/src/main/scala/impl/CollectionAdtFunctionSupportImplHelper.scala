package net.scalax.simple.adt
package instance
package support

import net.scalax.simple.adt.nat.support.{AppendSupportUtil, CoProductUtilN, CoProductUtilNPre1, ItemFunc, ReverseAbstraction}

object CollectionAppender
    extends AppendSupportUtil[
      AdtCoProduct,
      AdtHList,
      AdtCoProduct,
      AdtCoProduct.UsePositive,
      AdtHList.UsePositive,
      AdtCoProduct.UsePositive
    ] {

  override def append[T1, T2, T3, HCollection1 <: AdtCoProduct, HCollection2 <: AdtHList, HCollection3 <: AdtCoProduct](
    p1: (T1, T2) => T3,
    p2: (HCollection1, HCollection2) => HCollection3
  ): (AdtCoProduct.UsePositive[T1, HCollection1], AdtHList.UsePositive[T2, HCollection2]) => AdtCoProduct.UsePositive[T3, HCollection3] =
    (param1: AdtCoProduct.UsePositive[T1, HCollection1], param2: AdtHList.UsePositive[T2, HCollection2]) => {
      val t2: T2              = param2.head
      val tail2: HCollection2 = param2.tail
      param1.fold[AdtCoProduct.UsePositive[T3, HCollection3]](
        (t1: T1) => AdtCoProduct.UsePositive.left[T3, HCollection3](p1(t1, t2)),
        (tail1: HCollection1) => AdtCoProduct.UsePositive.right[T3, HCollection3](p2(tail1, tail2))
      )
    }

}

trait CollectionCoProductUtilN[M1[_, _], M2[_, _], M3[_, _]]
    extends FinalCoProductUtilN[
      M1,
      M2,
      M3,
      AdtCoProduct,
      AdtCoProduct.UsePositive,
      AdtHList,
      AdtHList.UsePositive,
      AdtCoProduct,
      AdtCoProduct.UsePositive
    ] {
  FinalCoProductUtilNSelf =>

  override lazy val content
    : AppendSupportUtil[AdtCoProduct, AdtHList, AdtCoProduct, AdtCoProduct.UsePositive, AdtHList.UsePositive, AdtCoProduct.UsePositive] =
    CollectionAppender
  override def typeGen: ItemFunc[M1, M2, M3]

}

/*trait CollectionFunctionSupportImplHelper2[M1[_, _], M2[_, _], M3[_, _]]
    extends FinalAdtFunctionSupportImplHelper2[
      M1,
      M2,
      M3,
      AdtCoProduct,
      AdtCoProduct.UsePositive,
      AdtCoProduct.zero.type,
      AdtHList,
      AdtHList.UsePositive,
      AdtHList.zero.type,
      AdtCoProduct,
      AdtCoProduct.UsePositive,
      AdtCoProduct.zero.type
    ] {
  override val inputHList0: (AdtCoProduct.zero.type, AdtHList.zero.type) => AdtCoProduct.zero.type =
    (a: AdtCoProduct.zero.type, b: AdtHList.zero.type) => a
  override def coProductFunc: CollectionCoProductUtilN[M1, M2, M3]
}*/
