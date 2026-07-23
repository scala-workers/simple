package net.scalax.simple
package nat
package number48

import net.scalax.simple.nat.number48.Number48.{Time, TimeCount, TimeDong, TimeResult, TimeTran}

import scala.annotation.tailrec

object RunTest1 {

  def build(current1: Long, name: TimeTran => TimeTran): Time = {
    def buildImpl(numLong: Long, zero: () => Time): Time = {
      if (numLong > 0) {
        TimeCount(() => buildImpl(numLong - 1, zero))
      } else {
        zero()
      }
    }

    lazy val build_1: Time = buildImpl(numLong = current1, zero = () => build_2)
    lazy val build_2: Time = TimeDong(name, () => build_1)

    build_1
  }

  @tailrec
  def countImpl(
    num: () => TimeResult,
    current: TimeTran,
    printlnSum: Int,
    speed: Long,
    dealResult: TimeTran => Unit
  ): Unit = {
    val sum                  = current.dizhi + current.year + current.month + current.day + current.hour
    val needPrintln: Boolean = sum % speed == 0

    if (needPrintln) {
      dealResult(current): Unit
    }

    if (printlnSum > 0) {
      val currentNum = num()

      val newCurrent: TimeTran = currentNum.key(current)

      countImpl(
        currentNum.tail,
        current = newCurrent,
        printlnSum = if (needPrintln) printlnSum - 1 else printlnSum,
        speed = speed,
        dealResult = dealResult
      )
    }
  }

  def count(
    num: () => TimeResult,
    printlnSum: Int,
    speed: Long = 80000,
    dealResult: TimeTran => Unit
  ): Unit =
    countImpl(
      num = num,
      current = TimeTran(1, 1, 1, 1, 1, 1),
      printlnSum = printlnSum,
      speed = speed,
      dealResult = dealResult
    )

  def main(arr: Array[String]): Unit = {
    lazy val top: Time = TimeCount(() => top)
    val 地支: Time       = build(12, s => s.copy(dizhi = s.dizhi + 1))
    val 年: Time        = build(12, s => s.copy(year = s.year + 1))
    val 月: Time        = build(30, s => s.copy(month = s.month + 1))
    val 日: Time        = build(24, s => s.copy(day = s.day + 1))
    val 时: Time        = build(60, s => s.copy(hour = s.hour + 1))
    lazy val 分: Time   = TimeDong(s => s.copy(min = s.min + 1), () => 分)

    count(
      () => top.other(地支, 年, 月, 日, 时, 分),
      printlnSum = 50,
      speed = 10000000,
      dealResult = map => {
        println(map)

        println("min vs hour")
        println(BigDecimal(map.min) / BigDecimal(map.hour))
        println("hour vs day")
        println(BigDecimal(map.hour) / BigDecimal(map.day))
        println("day vs month")
        println(BigDecimal(map.day) / BigDecimal(map.month))
        println("month vs year")
        println(BigDecimal(map.month) / BigDecimal(map.year))

        println("year vs day")
        println(BigDecimal(map.day) / BigDecimal(map.year))
        println("day vs second")
        println(BigDecimal(map.min * 60) / BigDecimal(map.day))

        println("=== finished 1 ===")
      }
    )

  }

}
