package net.scalax.simple
package nat
package number48

object Number48 {

  case class TimeTran(dizhi: Long, year: Long, month: Long, day: Long, hour: Long, min: Long)

  case class TimeResult(key: TimeTran => TimeTran, tail: () => TimeResult)

  trait Time {
    def other(tail1: Time, tail2: Time, tail3: Time, tail4: Time, tail5: Time, tail6: Time): TimeResult
  }

  case class TimeDong(key: TimeTran => TimeTran, tail1: () => Time) extends Time {
    def other(tail2: Time, tail3: Time, tail4: Time, tail5: Time, tail6: Time, tail7: Time): TimeResult =
      TimeResult(key = key, tail = () => tail7.other(tail1(), tail2, tail3, tail4, tail5, tail6))
  }

  case class TimeCount(tail1: () => Time) extends Time {
    def other(tail2: Time, tail3: Time, tail4: Time, tail5: Time, tail6: Time, tail7: Time): TimeResult =
      tail2.other(tail3, tail4, tail5, tail6, tail7, tail1())
  }

}
