package net.scalax.simple.adt
package instance

object ADTBuilderHelperImplicit {

  trait NeedCoProduct[N <: AdtCoProduct, Target] {
    def model(n: N): Target
  }

  object NeedCoProduct {
    implicit def implicit1[X1 <: Target, Target, OutHList <: AdtCoProduct](implicit
      tail: NeedCoProduct[OutHList, Target]
    ): NeedCoProduct[AdtCoProduct.UsePositive[X1, OutHList], Target] =
      new NeedCoProduct[AdtCoProduct.UsePositive[X1, OutHList], Target] {
        override def model(t: AdtCoProduct.UsePositive[X1, OutHList]): Target =
          t._foldCoProduct[Target]((a: Target) => a, (b: OutHList) => tail.model(b))
      }

    implicit def implicit2[X1 <: Target, Target]: NeedCoProduct[AdtCoProduct.UseOne[X1], Target] =
      new NeedCoProduct[AdtCoProduct.UseOne[X1], Target] {
        override def model(a: AdtCoProduct.UseOne[X1]): Target = a.value
      }
  }

  trait Apply[Target] {
    def input[X1 <: Target, In <: AdtCoProduct](u: AdtCoProduct.UsePositive[X1, In])(implicit au: NeedCoProduct[In, Target]): Target =
      u._foldCoProduct((t1: X1) => t1, (t2: In) => au.model(t2))
  }

  private val applyAny1: Apply[Any] = new Apply[Any] {
    //
  }

  private def applyAny2[T]: Apply[T] = applyAny1.asInstanceOf[Apply[T]]

  def apply[T]: Apply[T] = applyAny2[T]

}
