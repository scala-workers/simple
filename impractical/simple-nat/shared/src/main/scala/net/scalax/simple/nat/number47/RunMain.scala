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

    lazy val build_1: ghdmzsk = buildImpl(appender = Num47.Append1.tail2Num, numLong = current1, zero = () => build_2)
    lazy val build_2: ghdmzsk = Num47.Append1.tail1Num(name).inputGHDMZSK(() => build_1)

    build_1
  }

  @tailrec
  def countImpl(
    num: () => ghdmzsk,
    current: Map[String, Int],
    printlnSum: Int,
    speed: Long,
    dealResult: Map[String, Int] => Unit
  ): Unit = {
    val needPrintln: Boolean = current.values.sum % speed == 0

    if (needPrintln) {
      dealResult(current): Unit
    }

    val currentNum = num()

    if (printlnSum > 0) {
      currentNum match {
        case num1: Num47.Num1 =>
          val oldValue = current.getOrElse(num1.name, 1)
          val newMap   = current + (num1.name -> (oldValue + 1))
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
    dealResult: Map[String, Int] => Unit
  ): Unit =
    countImpl(
      num = num,
      current = Map.empty,
      printlnSum = printlnSum,
      speed = speed,
      dealResult = dealResult
    )

  def main(arr: Array[String]): Unit = {
    lazy val 月: ghdmzsk  = Num47.Append1.tail1Num("月").inputGHDMZSK(() => 月)
    val 日: ghdmzsk       = build(30, "日")
    val 时: ghdmzsk       = build(24, "时")
    val 分: ghdmzsk       = build(60, "分")
    val 秒: ghdmzsk       = build(60, "秒")
    lazy val 毫秒: ghdmzsk = Num47.Append1.tail2Num.inputGHDMZSK(() => 毫秒)

    count(
      () => 月.inputGHDMZSK(() => 日).inputGHDMZSK(() => 时).inputGHDMZSK(() => 分).inputGHDMZSK(() => 秒).inputGHDMZSK(() => 毫秒),
      printlnSum = 1000,
      speed = 100000000,
      dealResult = map => {
        println("month vs day")
        println(BigDecimal(map.get("月").getOrElse(1)) / BigDecimal(map.get("日").getOrElse(1)))
        println("day vs hour")
        println(BigDecimal(map.get("日").getOrElse(1)) / BigDecimal(map.get("时").getOrElse(1)))
        println("hour vs min")
        println(BigDecimal(map.get("时").getOrElse(1)) / BigDecimal(map.get("分").getOrElse(1)))
        println("hour vs second")
        println(BigDecimal(map.get("分").getOrElse(1)) / BigDecimal(map.get("秒").getOrElse(1)))

        println("hour vs second")
        println(BigDecimal(map.get("时").getOrElse(1)) / BigDecimal(map.get("秒").getOrElse(1)))
        println("=== finished 1 ===")
      }
    )

  }

}
