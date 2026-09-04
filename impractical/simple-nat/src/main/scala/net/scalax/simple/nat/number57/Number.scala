package net.scalax.simple
package nat
package number57

object Num57 { NumSelf =>

  // 整数list
  trait Number {
    def tail: () => Number
    def plus(other: Number, appender1: (() => Number) => Number, appender2: (() => Number) => Number): Number
    def numType: Int
  }

  case class Successor1(override val tail: () => Number) extends Number {
    override def plus(other: Number, appender1: (() => Number) => Number, appender2: (() => Number) => Number): Number =
      Successor1(() => tail().plus(other, appender1, appender2))
    override def numType: Int = 1
  }
  case class Successor2(override val tail: () => Number) extends Number {
    override def plus(other: Number, appender1: (() => Number) => Number, appender2: (() => Number) => Number): Number =
      Successor2(() => tail().plus(other, appender1, appender2))
    override def numType: Int = 2
  }
  case class Successor3(override val tail: () => Number) extends Number {
    override def numType: Int                                                                                          = 3
    override def plus(other: Number, appender1: (() => Number) => Number, appender2: (() => Number) => Number): Number =
      appender1(() => other.plus(tail(), appender2, appender1))
  }

  val Successor4: (() => Number) => Number = numP => numP()

}
