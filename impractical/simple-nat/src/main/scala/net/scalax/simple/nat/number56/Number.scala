package net.scalax.simple
package nat
package number56

object Num56 { NumSelf =>

  // 整数list
  trait Number {
    def tail: () => Number
    def plus(other: Number): Number
    def numType: Int
  }

  case class Successor1(override val tail: () => Number) extends Number {
    override def plus(other: Number): Number = Successor1(() => tail().plus(other))
    override def numType: Int                = 1
  }
  case class Successor2(override val tail: () => Number) extends Number {
    override def plus(other: Number): Number = Successor2(() => tail().plus(other))
    override def numType: Int                = 2
  }
  case class Successor3(override val tail: () => Number) extends Number {
    override def plus(other: Number): Number = Successor3(() => other.plus(tail()))
    override def numType: Int                = 3
  }

}
