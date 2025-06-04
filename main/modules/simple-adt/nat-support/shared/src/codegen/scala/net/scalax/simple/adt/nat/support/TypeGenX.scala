package net.scalax.simple.adt
package nat
package support

trait TypeGen1[M[_], N1[_]] {
  def gen[T]: M[N1[T]]
}

trait TypeGen2[M[_, _], N1[_], N2[_]] {
  def gen[T]: M[N1[T], N2[T]]
}

trait TypeGen3[M[_, _, _], N1[_], N2[_], N3[_]] {
  def gen[T]: M[N1[T], N2[T], N3[T]]
}

trait TypeGen4[M[_, _, _, _], N1[_], N2[_], N3[_], N4[_]] {
  def gen[T]: M[N1[T], N2[T], N3[T], N4[T]]
}

trait TypeGen5[M[_, _, _, _, _], N1[_], N2[_], N3[_], N4[_], N5[_]] {
  def gen[T]: M[N1[T], N2[T], N3[T], N4[T], N5[T]]
}

trait TypeGen6[M[_, _, _, _, _, _], N1[_], N2[_], N3[_], N4[_], N5[_], N6[_]] {
  def gen[T]: M[N1[T], N2[T], N3[T], N4[T], N5[T], N6[T]]
}
