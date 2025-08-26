package net.scalax.simple.adt
package instance
package support

import net.scalax.simple.adt.nat.support.{AppendSupportUtil, CoProductUtilN, CoProductUtilNPre1, ItemFunc, ReverseAbstraction}

object ResultCoProductUtilN
    extends CollectionCoProductUtilN[
      ({ type Func2[A, B] = A })#Func2,
      ({ type Func2[A, B] = A => B })#Func2,
      ({ type Func2[A, B] = B })#Func2
    ]
    with InstanceCoProductUtilN[
      AdtCoProduct,
      AdtCoProduct.UsePositive,
      AdtHList,
      AdtHList.UsePositive,
      AdtCoProduct,
      AdtCoProduct.UsePositive
    ]

object ResultAppender
    extends CollectionFunctionSupportImplHelper2[
      ({ type Func2[A, B] = A })#Func2,
      ({ type Func2[A, B] = A => B })#Func2,
      ({ type Func2[A, B] = B })#Func2
    ]
    with InstanceAdtFunctionSupportImplHelper2[
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
  override lazy val coProductFunc: CoProductUtilN[
    ({ type Func2[A, B] = A })#Func2,
    ({ type Func2[A, B] = A => B })#Func2,
    ({ type Func2[A, B] = B })#Func2,
    AdtCoProduct,
    AdtHList,
    AdtCoProduct,
    AdtCoProduct.UsePositive,
    AdtHList.UsePositive,
    AdtCoProduct.UsePositive
  ] with InstanceCoProductUtilN[
      AdtCoProduct,
      AdtCoProduct.UsePositive,
      AdtHList,
      AdtHList.UsePositive,
      AdtCoProduct,
      AdtCoProduct.UsePositive
    ]
    with CollectionCoProductUtilN[
      ({ type Func2[A, B] = A })#Func2,
      ({ type Func2[A, B] = A => B })#Func2,
      ({ type Func2[A, B] = B })#Func2
    ] =
    ResultCoProductUtilN
}
