package net.scalax.simple
package nat
package number47

import scala.annotation.tailrec
import ghdmzsk._

object RunTest1 {

  def build(current1: Long, name: String): ghdmzsk = {
    def buildImpl(appender: ghdmzsk, numLong: Long, zero: () => ghdmzsk): ghdmzsk = {
      if (numLong > 0) {
        appender.inputGHDMZSK(() => buildImpl(appender, numLong - 1, zero))
      } else {
        zero()
      }
    }

    lazy val build_1: ghdmzsk = buildImpl(appender = Num47.Append1.tail2Num(name), numLong = current1, zero = () => build_2)
    lazy val build_2: ghdmzsk = Num47.Append1.tail1Num.inputGHDMZSK(() => build_1)

    build_1
  }

  @tailrec
  def countImpl(
    num: () => ghdmzsk,
    current: Map[String, Long],
    printlnSum: Int,
    speed: Long,
    dealResult: Map[String, Long] => Unit
  ): Unit = {
    val needPrintln: Boolean = current.values.sum % speed == 0

    if (needPrintln) {
      dealResult(current): Unit
    }

    val currentNum = num()

    if (printlnSum > 0) {
      currentNum match {
        case num1: Num47.Num1 =>
          val oldValue: Long = current.getOrElse(num1.name, 1L)
          val newMap         = current + (num1.name -> (oldValue + 1L))

          countImpl(
            () => num1.inputGHDMZSK(() => null),
            current = newMap,
            printlnSum = if (needPrintln) printlnSum - 1 else printlnSum,
            speed = speed,
            dealResult = dealResult
          )
      }
    }
  }

  def count(
    num: () => ghdmzsk,
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

  def main1(arr: Array[String]): Unit = {
    lazy val 天干: ghdmzsk = Num47.Append1.tail1Num.inputGHDMZSK(() => 天干)
    val 地支: ghdmzsk      = build(10, "dizhi")
    val 年: ghdmzsk       = build(12, "year")
    val 月: ghdmzsk       = build(12, "month")
    val 日: ghdmzsk       = build(30, "day")
    val 时: ghdmzsk       = build(24, "hour")
    val 分: ghdmzsk       = build(60, "min")
    val 秒: ghdmzsk       = build(60, "second")
    lazy val 毫秒: ghdmzsk = Num47.Append1.tail2Num("mill").inputGHDMZSK(() => 毫秒)

    count(
      () =>
        天干.inputGHDMZSK(() => 地支)
          .inputGHDMZSK(() => 年)
          .inputGHDMZSK(() => 月)
          .inputGHDMZSK(() => 日)
          .inputGHDMZSK(() => 时)
          .inputGHDMZSK(() => 分)
          .inputGHDMZSK(() => 秒)
          .inputGHDMZSK(() => 毫秒),
      printlnSum = 1000,
      speed = 100000000,
      dealResult = map => {
        println(map)

        println("month vs day")
        println(BigDecimal(map.getOrElse("day", 1L)) / BigDecimal(map.getOrElse("month", 1L)))
        println("year vs month")
        println(BigDecimal(map.getOrElse("month", 1L)) / BigDecimal(map.getOrElse("year", 1L)))
        println("day vs hour")
        println(BigDecimal(map.getOrElse("hour", 1L)) / BigDecimal(map.getOrElse("day", 1L)))
        println("hour vs min")
        println(BigDecimal(map.getOrElse("min", 1L)) / BigDecimal(map.getOrElse("hour", 1L)))
        println("min vs second")
        println(BigDecimal(map.getOrElse("second", 1L)) / BigDecimal(map.getOrElse("min", 1L)))

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
