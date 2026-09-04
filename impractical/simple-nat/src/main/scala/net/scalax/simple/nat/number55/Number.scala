package net.scalax.simple
package nat
package number55

object Num55 { NumSelf =>

  // 整数list
  trait Number {
    def plus(other: Number): Number
    def size: Int
  }

  case class Successor1(tail: Number) extends Number {
    override def plus(other: Number): Number = Successor1(tail.plus(other))
    override def size: Int                   = tail.size + 1
  }
  case class Successor2(tail: Number) extends Number {
    override def plus(other: Number): Number = Successor2(tail.plus(other))
    override def size: Int                   = tail.size - 1
  }
  case object Zero extends Number {
    override def plus(other: Number): Number = other
    override def size: Int                   = 0
  }

}
