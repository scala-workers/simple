package net.scalax.simple.adt
package nat
package support

trait ParameterNatSupport1[M[_]] {
  def item1[T1]: M[T1]
}
trait ParameterNatSupport2[M[_, _]] {
  def item2[T1, T2]: M[T1, T2]
}
trait ParameterNatSupport3[M[_, _, _]] {
  def item3[T1, T2, T3]: M[T1, T2, T3]
}
trait ParameterNatSupport4[M[_, _, _, _]] {
  def item4[T1, T2, T3, T4]: M[T1, T2, T3, T4]
}
trait ParameterNatSupport5[M[_, _, _, _, _]] {
  def item5[T1, T2, T3, T4, T5]: M[T1, T2, T3, T4, T5]
}
trait ParameterNatSupport6[M[_, _, _, _, _, _]] {
  def item6[T1, T2, T3, T4, T5, T6]: M[T1, T2, T3, T4, T5, T6]
}
