package net.scalax.simple
package nat
package number46

import scala.annotation.tailrec
import ghdmzsk.ghdmzsk

object RunTest1 {

  def build(current1: Long, current2: Long): ghdmzsk = {
    def buildImpl(appender: ghdmzsk, numLong: Long, zero: () => ghdmzsk): ghdmzsk = {
      if (numLong > 0) {
        appender.inputGHDMZSK(() => buildImpl(appender, numLong - 1, zero))
      } else {
        zero()
      }
    }

    lazy val build_1: ghdmzsk = buildImpl(appender = Num46.Append1.tail1Num, numLong = current1, zero = () => build_2)
    lazy val build_2: ghdmzsk = buildImpl(appender = Num46.Append1.tail2Num, numLong = current2, zero = () => build_1)

    build_1
  }

  @tailrec
  def countImpl(
    num: () => ghdmzsk,
    current1: Long,
    current2: Long,
    printlnSum: Int,
    speed: Long,
    dealResult: (Long, Long) => Unit
  ): Unit = {
    val needPrintln: Boolean = (current1 + current2) % speed == 0

    if (needPrintln) {
      dealResult(current1, current2): Unit
    }

    val currentNum = num()

    if (printlnSum > 0) {
      currentNum match {
        case num1: Num46.Num1 =>
          countImpl(
            () => num1.pre1,
            current1 = current1 + 1,
            current2 = current2,
            printlnSum = if (needPrintln) printlnSum - 1 else printlnSum,
            speed = speed,
            dealResult = dealResult
          )
        case num2: Num46.Num2 =>
          countImpl(
            () => num2.pre2,
            current1 = current1,
            current2 = current2 + 1,
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
    dealResult: (Long, Long) => Unit
  ): Unit =
    countImpl(
      num = num,
      current1 = 1,
      current2 = 1,
      printlnSum = printlnSum,
      speed = speed,
      dealResult = dealResult
    )

  def main1(arr: Array[String]): Unit = {
    def countIns(a1: Long, a2: Long, b1: Long, b2: Long): Unit = {

      val aResult: BigDecimal = BigDecimal(a1) / BigDecimal(a2)
      val bResult: BigDecimal = BigDecimal(b1) / BigDecimal(b2)

      val num1: ghdmzsk = build(current1 = a1, current2 = a2)
      val num2: ghdmzsk = build(current1 = b1, current2 = b2)

      count(
        () => num1,
        printlnSum = 2,
        speed = 10000000,
        dealResult = (u1, u2) => {
          locally {
            println(s"inputA: $aResult,  currentA: $num1")
          }
        }
      )

      count(
        () => num1,
        printlnSum = 2,
        speed = 10000000,
        dealResult = (u1, u2) => {
          locally {
            println(s"inputA: $bResult,  currentA: $num1")
          }
        }
      )

      count(
        () => num1.inputGHDMZSK(() => Num46.Append1.tail1Num).inputGHDMZSK(() => num2).inputGHDMZSK(() => Num46.Append1.tail2Num),
        printlnSum = 5,
        speed = 10000000,
        dealResult = (u1, u2) => {
          locally {
            val aResult: BigDecimal  = BigDecimal(a1) / BigDecimal(a2)
            val bResult: BigDecimal  = BigDecimal(b1) / BigDecimal(b2)
            val coResult: BigDecimal = BigDecimal(u1) / BigDecimal(u2)
            println(s"result1: ${aResult / bResult},  current1: $coResult")
          }
        }
      )

    }

    countIns(a1 = 17, a2 = 87, b1 = 79, b2 = 42)
    println("=== finished 1 ===")
    countIns(a1 = 123, a2 = 23, b1 = 12, b2 = 3)
    println("=== finished 2 ===")
  }

}
