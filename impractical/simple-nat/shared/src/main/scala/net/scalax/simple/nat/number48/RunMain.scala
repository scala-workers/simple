package net.scalax.simple
package nat
package number48

import net.scalax.simple.nat.number48.Number48.{Time, TimeCount, TimeDong, TimeResult}

import scala.annotation.tailrec

object RunTest1 {

  def build(current1: Long, name: String): Time = {
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
    current: Map[String, Long],
    printlnSum: Int,
    speed: Long,
    dealResult: Map[String, Long] => Unit
  ): Unit = {
    val needPrintln: Boolean = current.values.sum % speed == 0

    if (needPrintln) {
      dealResult(current): Unit
    }

    if (printlnSum > 0) {
      val currentNum = num()

      val oldValue: Long = current.getOrElse(currentNum.key, 1L)
      val newMap         = current + (currentNum.key -> (oldValue + 1L))

      countImpl(
        currentNum.tail,
        current = newMap,
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
    dealResult: Map[String, Long] => Unit
  ): Unit =
    countImpl(
      num = num,
      current = Map.empty,
      printlnSum = printlnSum,
      speed = speed,
      dealResult = dealResult
    )

  def main(arr: Array[String]): Unit = {
    lazy val top: Time = TimeCount(() => top)
    val 年: Time        = build(12, "year")
    val 月: Time        = build(30, "month")
    val 日: Time        = build(24, "day")
    val 时: Time        = build(60, "hour")
    val 分: Time        = build(60, "min")
    lazy val 秒: Time   = TimeDong("second", () => 秒)

    count(
      () => top.other(年, 月, 日, 时, 分, 秒),
      printlnSum = 5,
      speed = 100000000,
      dealResult = map => {
        println(map)

        println("second vs min")
        println(BigDecimal(map.getOrElse("second", 1L)) / BigDecimal(map.getOrElse("min", 1L)))
        println("min vs hour")
        println(BigDecimal(map.getOrElse("min", 1L)) / BigDecimal(map.getOrElse("hour", 1L)))
        println("hour vs day")
        println(BigDecimal(map.getOrElse("hour", 1L)) / BigDecimal(map.getOrElse("day", 1L)))
        println("day vs month")
        println(BigDecimal(map.getOrElse("day", 1L)) / BigDecimal(map.getOrElse("month", 1L)))

        println("hour vs second")
        println(BigDecimal(map.getOrElse("second", 1L)) / BigDecimal(map.getOrElse("hour", 1L)))
        println("year vs day")
        println(BigDecimal(map.getOrElse("day", 1L)) / BigDecimal(map.getOrElse("year", 1L)))
        println("day vs second")
        println(BigDecimal(map.getOrElse("second", 1L)) / BigDecimal(map.getOrElse("day", 1L)))

        println("=== finished 1 ===")
      }
    )

  }

}
