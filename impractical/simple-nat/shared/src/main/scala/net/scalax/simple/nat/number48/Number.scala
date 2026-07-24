package net.scalax.simple
package nat
package number48

object Number48 {

  case class TimeResult(key: String, tail: () => TimeResult)

  trait Time {
    val other: (Time, Time, Time, Time, Time, Time) => TimeResult
  }

  val TimeDong: (String, () => Time) => Time = (key: String, tail1: () => Time) =>
    new Time {
      override val other = (tail2: Time, tail3: Time, tail4: Time, tail5: Time, tail6: Time, tail7: Time) =>
        TimeResult(key = key, tail = () => tail7.other(tail1(), tail2, tail3, tail4, tail5, tail6))
    }

  val TimeCount: (() => Time) => Time = (tail1: () => Time) =>
    new Time {
      override val other = (tail2: Time, tail3: Time, tail4: Time, tail5: Time, tail6: Time, tail7: Time) =>
        tail2.other(tail3, tail4, tail5, tail6, tail7, tail1())
    }

}
