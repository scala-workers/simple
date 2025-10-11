package net.scalax.simple.adt
package instance

object ADTBuilderHelperImplicit {

  trait NeedCoProduct[N <: AdtCoProduct, Target] {
    def model(n: N): Target
  }

  object NeedCoProduct {
    implicit def implicit1[I1 <: Target, Target, OutHList <: AdtCoProduct](implicit
      tail: NeedCoProduct[OutHList, Target]
    ): NeedCoProduct[AdtCoProduct.UsePositive[I1, OutHList], Target] =
      new NeedCoProduct[AdtCoProduct.UsePositive[I1, OutHList], Target] {
        override def model(t: AdtCoProduct.UsePositive[I1, OutHList]): Target = t.fold[Target]((a: I1) => a, (b: OutHList) => tail.model(b))
      }

    implicit def implicit2[I1 <: Target, Target]: NeedCoProduct[AdtCoProduct.UseOne[I1], Target] =
      new NeedCoProduct[AdtCoProduct.UseOne[I1], Target] {
        override def model(a: AdtCoProduct.UseOne[I1]): Target = a.value
      }

    trait Apply[T] {
      def input[In <: AdtCoProduct](u: In)(implicit au: NeedCoProduct[In, T]): T = au.model(u)
    }

    def apply[T]: Apply[T] = new Apply[T] {
      //
    }
  }

}
