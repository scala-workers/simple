package net.scalax.simple.adt
package instance
package support

object AppendTail3 {
  AppendTailSelf =>

  def mapHead[A, B <: UseAdtCoProduct, C](t: AdtCoProduct.UsePositive[A, B])(func: A => C): AdtCoProduct.UsePositive[C, B] =
    t._foldCoProduct[AdtCoProduct.UsePositive[C, B]](
      (a1: A) => AdtCoProduct.UsePositive.left[C, B](func(a1)),
      (a1: B) => AdtCoProduct.UsePositive.right[C, B](a1)
    )

  def headOption[A, B <: UseAdtCoProduct](t: AdtCoProduct.UsePositive[A, B]): Option[A] =
    t._foldCoProduct[Option[A]]((a1: A) => Some(a1), (_: B) => Option.empty[A])

}
