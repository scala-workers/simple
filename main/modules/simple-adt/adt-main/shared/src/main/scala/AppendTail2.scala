package net.scalax.simple.adt
package instance
package support

object AppendTail2 {
  AppendTailSelf =>

  trait CoPro[Content[_ <: AdtCoProduct] <: AdtCoProduct]
  trait CoProPositive[A, Content[_ <: AdtCoProduct] <: AdtCoProduct]
      extends CoPro[({ type T[U1 <: AdtCoProduct] = AdtCoProduct.UsePositive[A, U1] })#T]

  trait AppendContent1[Content[_ <: AdtCoProduct] <: AdtCoProduct] {
    AppendContent1Self =>
    11

  }

}
