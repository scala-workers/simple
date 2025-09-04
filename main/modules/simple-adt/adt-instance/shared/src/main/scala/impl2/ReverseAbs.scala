package net.scalax.simple.adt
package instance
package support
package impl2

trait FunctionM2Abs[M1[_, _], M2[_, _], Nat1, Nat1Positive[_, _ <: Nat1] <: Nat1, Nat2, Nat2Positive[
  _,
  _ <: Nat2
] <: Nat2, Nat3, Nat3Positive[_, _ <: Nat3] <: Nat3, Nat4, Nat4Positive[_, _ <: Nat4] <: Nat4] {
  def functionM2[Item, N1 <: Nat1, N2 <: Nat2, CTX]
    : M1[M1[N1, M2[N2, CTX]], M1[Nat1Positive[M2[Item, CTX], N1], M2[Nat2Positive[Item, N2], CTX]]]

  def nextInstance: FunctionM2Abs[
    M1,
    ({ type NextM2[A, B] = M2[B, A] })#NextM2,
    Nat2,
    Nat2Positive,
    Nat3,
    Nat3Positive,
    Nat4,
    Nat4Positive,
    Nat1,
    Nat1Positive
  ]
}

object FunctionM2Impl1
    extends FunctionM2Abs[
      ({ type Func1[A, B] = A => B })#Func1,
      ({ type Func1[A, B] = A => B })#Func1,
      AdtCoProduct,
      AdtCoProduct.UsePositive,
      AdtHList,
      AdtHList.UsePositive,
      AdtHList,
      AdtHList.UsePositive,
      AdtCoProduct,
      AdtCoProduct.UsePositive
    ] {

  override def functionM2[Item, N1 <: AdtCoProduct, N2 <: AdtHList, CTX]
    : (N1 => N2 => CTX) => AdtCoProduct.UsePositive[Item => CTX, N1] => AdtHList.UsePositive[Item, N2] => CTX =
    (param: (N1 => N2 => CTX)) => { (in1: AdtCoProduct.UsePositive[Item => CTX, N1]) =>
      { (in2: AdtHList.UsePositive[Item, N2]) =>
        {
          in1.fold[CTX](i1 => i1(in2.head), i2 => param(i2)(in2.tail))
        }
      }
    }

  override lazy val nextInstance: FunctionM2Impl2.type = FunctionM2Impl2

}

object FunctionM2Impl2
    extends FunctionM2Abs[
      ({ type Func1[A, B] = A => B })#Func1,
      ({ type Func1[A, B] = B => A })#Func1,
      AdtHList,
      AdtHList.UsePositive,
      AdtHList,
      AdtHList.UsePositive,
      AdtCoProduct,
      AdtCoProduct.UsePositive,
      AdtCoProduct,
      AdtCoProduct.UsePositive
    ] {

  override def functionM2[Item, N1 <: AdtHList, N2 <: AdtHList, CTX]
    : (N1 => CTX => N2) => AdtHList.UsePositive[CTX => Item, N1] => CTX => AdtHList.UsePositive[Item, N2] = (param: (N1 => CTX => N2)) => {
    (in2: AdtHList.UsePositive[CTX => Item, N1]) =>
      { (ctx: CTX) =>
        {
          AdtHList.UsePositive.append[Item, N2](in2.head(ctx), param(in2.tail)(ctx))
        }
      }
  }

  override lazy val nextInstance: FunctionM2Impl3.type = FunctionM2Impl3

}

object FunctionM2Impl3
    extends FunctionM2Abs[
      ({ type Func1[A, B] = A => B })#Func1,
      ({ type Func1[A, B] = A => B })#Func1,
      AdtHList,
      AdtHList.UsePositive,
      AdtCoProduct,
      AdtCoProduct.UsePositive,
      AdtCoProduct,
      AdtCoProduct.UsePositive,
      AdtHList,
      AdtHList.UsePositive
    ] {

  override def functionM2[Item, N1 <: AdtHList, N2 <: AdtCoProduct, CTX]
    : (N1 => N2 => CTX) => AdtHList.UsePositive[Item => CTX, N1] => AdtCoProduct.UsePositive[Item, N2] => CTX =
    (param: (N1 => N2 => CTX)) => { (in2: AdtHList.UsePositive[Item => CTX, N1]) =>
      { (in1: AdtCoProduct.UsePositive[Item, N2]) =>
        {
          in1.fold[CTX](i1 => in2.head(i1), i2 => param(in2.tail)(i2))
        }
      }
    }

  override lazy val nextInstance: FunctionM2Impl4.type = FunctionM2Impl4

}

object FunctionM2Impl4
    extends FunctionM2Abs[
      ({ type Func1[A, B] = A => B })#Func1,
      ({ type Func1[A, B] = B => A })#Func1,
      AdtCoProduct,
      AdtCoProduct.UsePositive,
      AdtCoProduct,
      AdtCoProduct.UsePositive,
      AdtHList,
      AdtHList.UsePositive,
      AdtHList,
      AdtHList.UsePositive
    ] {

  override def functionM2[Item, N1 <: AdtCoProduct, N2 <: AdtCoProduct, CTX]
    : (N1 => CTX => N2) => AdtCoProduct.UsePositive[CTX => Item, N1] => CTX => AdtCoProduct.UsePositive[Item, N2] =
    (param: (N1 => CTX => N2)) => { (in1: AdtCoProduct.UsePositive[CTX => Item, N1]) =>
      { (ctx: CTX) =>
        {
          in1.fold[AdtCoProduct.UsePositive[Item, N2]](
            (itemFunc: CTX => Item) => AdtCoProduct.UsePositive.left[Item, N2](itemFunc(ctx)),
            (n1: N1) => AdtCoProduct.UsePositive.right[Item, N2](param(n1)(ctx))
          )
        }
      }

    }

  override lazy val nextInstance: FunctionM2Impl1.type = FunctionM2Impl1

}
