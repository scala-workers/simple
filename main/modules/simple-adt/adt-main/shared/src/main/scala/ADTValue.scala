package net.scalax.simple.adt
package instance

trait ADTValue[T <: AdtCoProduct] {
  def value: T
}

object ADTValue extends LawTraitImplicit {

  implicit def posImplicit2[Target, I1, Tail <: UseAdtCoProduct](implicit
    t1: AdtFunction[Target, I1]
  ): ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, I1], Tail]] =
    new ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, I1], Tail]] {
      override def value: AdtCoProduct.UsePositive[AdtFunction[Target, I1], Tail] =
        AdtCoProduct.UsePositive.left[AdtFunction[Target, I1], Tail](t1)
    }

  implicit def oneImplicit3[Target, I1](implicit t1: AdtFunction[Target, I1]): ADTValue[AdtCoProduct.UseOne[AdtFunction[Target, I1]]] =
    new ADTValue[AdtCoProduct.UseOne[AdtFunction[Target, I1]]] {
      override def value: AdtCoProduct.UseOne[AdtFunction[Target, I1]] = AdtCoProduct.UseOne.left[AdtFunction[Target, I1]](t1)
    }

}

trait LawTraitImplicit {

  implicit def posImplicit1[Target, I1, Tail <: UseAdtCoProduct](implicit
    t1: ADTValue[Tail]
  ): ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, I1], Tail]] =
    new ADTValue[AdtCoProduct.UsePositive[AdtFunction[Target, I1], Tail]] {
      override def value: AdtCoProduct.UsePositive[AdtFunction[Target, I1], Tail] =
        AdtCoProduct.UsePositive.right[AdtFunction[Target, I1], Tail](t1.value)
    }

}
