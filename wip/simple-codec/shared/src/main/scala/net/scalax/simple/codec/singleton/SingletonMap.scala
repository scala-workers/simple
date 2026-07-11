package net.scalax.simple.codec
package to_list_generic

trait SingletonMap[T] {
  def instance: T
}

object SingletonMap {
  def instance[T](t: => T): SingletonMap[T] = new SingletonMap[T] {
    override def instance: T = t

  }
}
