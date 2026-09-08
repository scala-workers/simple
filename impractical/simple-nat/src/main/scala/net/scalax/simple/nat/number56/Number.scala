package net.scalax.simple
package nat
package number56

object Num56 { NumSelf =>

  // 整数list
  trait Number {
    def plus(other: Number): Number
    def unsafeRun: (() => Number, Int)
  }

  val Successor1: (() => Number) => Number = tail =>
    new Number {
      override def plus(other: Number): Number    = Successor1(() => tail().plus(other))
      override def unsafeRun: (() => Number, Int) = (tail, 1)
    }
  val Successor2: (() => Number) => Number = tail =>
    new Number {
      override def plus(other: Number): Number    = Successor2(() => tail().plus(other))
      override def unsafeRun: (() => Number, Int) = (tail, 2)

    }
  val Successor3: (() => Number) => Number = tail =>
    new Number {
      override def plus(other: Number): Number    = Successor3(() => other.plus(tail()))
      override def unsafeRun: (() => Number, Int) = (tail, 3)
    }

}
