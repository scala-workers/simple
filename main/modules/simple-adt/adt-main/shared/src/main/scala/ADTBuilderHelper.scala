package net.scalax.simple.adt
package instance

import support.impl2.FunctionAbs

object ADTBuilderHelperImplicit {

  trait ForFetch[Target] {
    def inputHList[X1 <: AdtCoProduct, X2 <: AdtHList](
      n: X1
    )(implicit h: ToOptionHelper[X1, Target, X2], need: NeedHList[X2, Target]): Target = h.inputCoProduct(n, need.model)
  }

  object ForFetch {
    def apply[Target]: ForFetch[Target] = new ForFetch[Target] {
      //
    }
  }

  trait ToOptionHelper[InputCoProduct <: AdtCoProduct, Target, OutHList <: AdtHList] {
    def inputCoProduct(i: InputCoProduct, functionList: OutHList): Target
  }

  object ToOptionHelper {

    implicit def implicit1[I1, InputCoProduct <: AdtCoProduct, Target, OutHList <: AdtHList](implicit
      c: ToOptionHelper[InputCoProduct, Target, OutHList]
    ): ToOptionHelper[AdtCoProduct.UsePositive[I1, InputCoProduct], Target, AdtHList.UsePositive[I1 => Target, OutHList]] =
      new ToOptionHelper[AdtCoProduct.UsePositive[I1, InputCoProduct], Target, AdtHList.UsePositive[I1 => Target, OutHList]] {
        override def inputCoProduct(
          i: AdtCoProduct.UsePositive[I1, InputCoProduct],
          functionList: AdtHList.UsePositive[I1 => Target, OutHList]
        ): Target = {
          val funcApply = FunctionAbs.out.nextInstance.nextInstance.functionM2[I1, OutHList, InputCoProduct, Target]((n1: OutHList) =>
            (n2: InputCoProduct) => c.inputCoProduct(n2, n1)
          )

          funcApply(functionList)(i)
        }
      }

    implicit def implicit2[Item1, Target]
      : ToOptionHelper[AdtCoProduct.UseOne[Item1], Target, AdtHList.UsePositive[Item1 => Target, AdtHList.zero.type]] =
      new ToOptionHelper[AdtCoProduct.UseOne[Item1], Target, AdtHList.UsePositive[Item1 => Target, AdtHList.zero.type]] {
        override def inputCoProduct(
          i: AdtCoProduct.UseOne[Item1],
          functionList: AdtHList.UsePositive[Item1 => Target, AdtHList.zero.type]
        ): Target = functionList.head(i.value)
      }

  }

  trait NeedHList[N <: AdtHList, Target] {
    def model: N
  }

  object NeedHList {
    implicit def implicit1[I1, Target, OutHList <: AdtHList](implicit
      c: I1 => Target,
      tail: NeedHList[OutHList, Target]
    ): NeedHList[AdtHList.UsePositive[I1 => Target, OutHList], Target] =
      new NeedHList[AdtHList.UsePositive[I1 => Target, OutHList], Target] {
        override def model: AdtHList.UsePositive[I1 => Target, OutHList] = AdtHList.UsePositive.append(c, tail.model)
      }

    implicit def implicit2[Target]: NeedHList[AdtHList.zero.type, Target] = new NeedHList[AdtHList.zero.type, Target] {
      override val model: AdtHList.zero.type = AdtHList.zero
    }
  }

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
