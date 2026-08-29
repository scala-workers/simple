package net.scalax.simple
package nat
package number51

object Num51 { NumSelf =>

  abstract class Number51(val tail: () => Number51, val isNumerator: Boolean) {
    def other(otherNum: Number51, appender1: (() => Number51) => Number51, appender2: (() => Number51) => Number51): Number51
  }

  val appender1: (() => Number51) => Number51 = (num1) =>
    new Number51(num1, true) {
      override def other(num2: Number51, app1: (() => Number51) => Number51, app2: (() => Number51) => Number51): Number51 =
        app1(() => num1().other(num2, app1, app2))
    }

  val appender2: (() => Number51) => Number51 = (num1) =>
    new Number51(num1, false) {
      override def other(num2: Number51, app1: (() => Number51) => Number51, app2: (() => Number51) => Number51): Number51 =
        num2.other(num1(), app2, app1)
    }

}
