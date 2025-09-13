package net.scalax.simple.adt
package instance

import net.scalax.simple.adt.instance.support.impl2.FunctionM2Impl1

object ADTBuilderHelperImplicit {

  trait ToOptionHelper[InputCoProduct <: AdtCoProduct, Target, OutHList <: AdtHList] {
    def inputCoProduct(i: InputCoProduct, functionList: OutHList): Option[Target]
  }

  object ToOptionHelper {
    implicit def implicit1[I1, InputCoProduct <: AdtCoProduct, Target, OutHList <: AdtHList](implicit
      c: ToOptionHelper[InputCoProduct, Target, OutHList]
    ): ToOptionHelper[AdtCoProduct.UsePositive[I1, InputCoProduct], Target, AdtHList.UsePositive[I1 => Option[Target], OutHList]] =
      new ToOptionHelper[AdtCoProduct.UsePositive[I1, InputCoProduct], Target, AdtHList.UsePositive[I1 => Option[Target], OutHList]] {
        override def inputCoProduct(
          i: AdtCoProduct.UsePositive[I1, InputCoProduct],
          functionList: AdtHList.UsePositive[I1 => Option[Target], OutHList]
        ): Option[Target] = {
          val funcApply = FunctionM2Impl1.nextInstance.nextInstance.functionM2[I1, OutHList, InputCoProduct, Option[Target]](
            (n1: OutHList) => (n2: InputCoProduct) => c.inputCoProduct(n2, n1)
          )

          funcApply(functionList)(i)
        }
      }

    implicit def implicit2[Target]: ToOptionHelper[AdtCoProduct.zero.type, Target, AdtHList.zero.type] =
      new ToOptionHelper[AdtCoProduct.zero.type, Target, AdtHList.zero.type] {
        override def inputCoProduct(i: AdtCoProduct.zero.type, functionList: AdtHList.zero.type): Option[Target] = Option.empty
      }

    trait ForFetch[Target] {
      def inputHList[X1 <: AdtCoProduct, X2 <: AdtHList](n: X1)(implicit h: ToOptionHelper[X1, Target, X2]): ForNeedHList[X2, Target] =
        new ForNeedHList[X2, Target] {
          override def fetchHList(implicit need: NeedHList[X2, Target]): Option[Target] = h.inputCoProduct(n, need.model)
        }
    }

    def target[Target]: ForFetch[Target] = new ForFetch[Target] {
      //
    }

    trait ForNeedHList[N <: AdtHList, Target] {
      def fetchHList(implicit n: NeedHList[N, Target]): Option[Target]
    }
  }

  trait NeedHList[N <: AdtHList, Target] {
    def model: N
  }

  object NeedHList {
    implicit def implicit1[I1, Target, OutHList <: AdtHList](implicit
      c: I1 => Target,
      tail: NeedHList[OutHList, Target]
    ): NeedHList[AdtHList.UsePositive[I1 => Option[Target], OutHList], Target] =
      new NeedHList[AdtHList.UsePositive[I1 => Option[Target], OutHList], Target] {
        override def model: AdtHList.UsePositive[I1 => Option[Target], OutHList] =
          AdtHList.UsePositive.append(c.andThen(Some.apply), tail.model)
      }

    implicit def implicit2[Target]: NeedHList[AdtHList.zero.type, Target] = new NeedHList[AdtHList.zero.type, Target] {
      override val model: AdtHList.zero.type = AdtHList.zero
    }
  }

}
