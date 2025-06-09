package net.scalax.simple.adt
package nat
package support

trait SimpleProductContextX[F[_[_]]] {

  def simpleProduct1: SimpleProduct1.ProductAdapter[F]

  def simpleProduct2: SimpleProduct2.ProductAdapter[F]

  def simpleProduct3: SimpleProduct3.ProductAdapter[F]

  def simpleProduct4: SimpleProduct4.ProductAdapter[F]

  def simpleProduct5: SimpleProduct5.ProductAdapter[F]

  def simpleProduct6: SimpleProduct6.ProductAdapter[F]

  def simpleProduct7: SimpleProduct7.ProductAdapter[F]

  def simpleProduct8: SimpleProduct8.ProductAdapter[F]

  def simpleProduct9: SimpleProduct9.ProductAdapter[F]

  def simpleProduct10: SimpleProduct10.ProductAdapter[F]

}
