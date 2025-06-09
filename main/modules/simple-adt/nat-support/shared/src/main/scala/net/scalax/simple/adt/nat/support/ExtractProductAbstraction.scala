package net.scalax.simple.adt
package nat
package support

trait ExtractProductAbstraction[HListLike, AppLike[_, _ <: HListLike] <: HListLike, HZero <: HListLike] {

  def hListFunc: HListFunc[HListLike, AppLike]
  def zero: HZero

  final def hListFuncImpl: HListFunc[HListLike, ({ type AP1[_, T1 <: HListLike] = T1 })#AP1] =
    hListFunc.asInstanceOf[HListFunc[HListLike, ({ type AP1[_, T1 <: HListLike] = T1 })#AP1]]
  final def zeroImpl: HListLike = zero

}
