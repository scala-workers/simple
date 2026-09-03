package net.scalax.simple
package nat
package number54

object Num54 { NumSelf =>

  trait Number {
    def plus(other: Number): Number
    def size: Int
  }

  case class Successor(tail: Number) extends Number {
    override def plus(other: Number): Number = Successor(tail.plus(other))
    override def size: Int                   = tail.size + 1
  }
  case object Zero extends Number {
    override def plus(other: Number): Number = other
    override def size: Int                   = 0
  }

}
