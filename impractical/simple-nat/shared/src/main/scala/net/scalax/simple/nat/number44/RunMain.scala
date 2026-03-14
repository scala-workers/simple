package net.scalax.simple
package nat
package number44

import scala.annotation.tailrec
import ghdmzsk._

object RunTest1 {

  def build(current1: Long, current2: Long, current3: Long, current4: Long): ghdmzsk = {
    def buildImpl(appender: ghdmzsk, numLong: Long, zero: () => ghdmzsk): ghdmzsk = {
      if (numLong > 0) {
        appender.inputGHDMZSK(() => buildImpl(appender, numLong - 1, zero))
      } else {
        zero()
      }
    }

    lazy val build_1: ghdmzsk = buildImpl(appender = Num44.Append1.tail1Num, numLong = current1, zero = () => build_4)
    lazy val build_2: ghdmzsk = buildImpl(appender = Num44.Append1.tail2Num, numLong = current2, zero = () => build_1)
    lazy val build_3: ghdmzsk = buildImpl(appender = Num44.Append1.tail3Num, numLong = current3, zero = () => build_2)
    lazy val build_4: ghdmzsk = buildImpl(appender = Num44.Append1.tail4Num, numLong = current4, zero = () => build_3)

    build_1
  }

  @tailrec
  def countImpl(
    num: () => ghdmzsk,
    current1: Long,
    current2: Long,
    current3: Long,
    current4: Long,
    printlnSum: Int,
    speed: Long,
    dealResult: (Long, Long, Long, Long) => Unit
  ): Unit = {
    val needPrintln: Boolean = (current1 + current2 + current3 + current4) % speed == 0

    if (needPrintln) {
      dealResult(current1, current2, current3, current4): Unit
    }

    val currentNum = num()

    if (printlnSum > 0) {
      currentNum match {
        case num1: Num44.Num1 =>
          countImpl(
            () => num1.pre1,
            current1 = current1 + 1,
            current2 = current2,
            current3 = current3,
            current4 = current4,
            printlnSum = if (needPrintln) printlnSum - 1 else printlnSum,
            speed = speed,
            dealResult = dealResult
          )
        case num2: Num44.Num2 =>
          countImpl(
            () => num2.pre2,
            current1 = current1,
            current2 = current2 + 1,
            current3 = current3,
            current4 = current4,
            printlnSum = if (needPrintln) printlnSum - 1 else printlnSum,
            speed = speed,
            dealResult = dealResult
          )
        case num3: Num44.Num3 =>
          countImpl(
            () => num3.pre3,
            current1 = current1,
            current2 = current2,
            current3 = current3 + 1,
            current4 = current4,
            printlnSum = if (needPrintln) printlnSum - 1 else printlnSum,
            speed = speed,
            dealResult = dealResult
          )
        case num4: Num44.Num4 =>
          countImpl(
            () => num4.pre4,
            current1 = current1,
            current2 = current2,
            current3 = current3,
            current4 = current4 + 1,
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
    dealResult: (Long, Long, Long, Long) => Unit
  ): Unit =
    countImpl(
      num = num,
      current1 = 1,
      current2 = 1,
      current3 = 1,
      current4 = 1,
      printlnSum = printlnSum,
      speed = speed,
      dealResult = dealResult
    )

  def main(arr: Array[String]): Unit = {
    println("== start 1 ==")

    val 分子1: Long = 17
    val 分母1: Long = 12

    val 分子2: Long = 11
    val 分母2: Long = 3

    val 分子3: Long = 79
    val 分母3: Long = 65

    val 分子4: Long = 81
    val 分母4: Long = 93

    val genResult: (Long, Long, Long, Long) => BigDecimal = (a1, a2, a3, a4) => BigDecimal(11)

    val num1: ghdmzsk          = build(current1 = 分子1, current2 = 分母1, current3 = 分子2, current4 = 分母2)
    val num1Except: BigDecimal = BigDecimal(分子1) / BigDecimal(分母1)
    count(
      () => num1,
      printlnSum = 5,
      dealResult = (a1, a2, a3, a4) => {
        val aResult: BigDecimal = (BigDecimal(a1) + BigDecimal(a2)) / (BigDecimal(a3) + BigDecimal(a4))
        println(
          s"except: $num1Except, current1: $a1, current2: $a2, current3: $a3, current4: $a4, current: $aResult"
        )
      }
    )
    println("== end 1 ==")

    val num2: ghdmzsk          = build(current1 = 分子3, current2 = 分母3, current3 = 分子4, current4 = 分母4)
    val num2Except: BigDecimal = BigDecimal(分子2) / BigDecimal(分母2)
    count(
      () => num2,
      printlnSum = 5,
      dealResult = (a1, a2, a3, a4) => {
        val aResult: BigDecimal = (BigDecimal(a1) + BigDecimal(a2)) / (BigDecimal(a3) + BigDecimal(a4))
        println(
          s"except: $num1Except, current1: $a1, current2: $a2, current3: $a3, current4: $a4, current: $aResult"
        )
      }
    )
    println("== end 2 ==")

    val num3_1: ghdmzsk        = num1.inputGHDMZSK(() => Num44.Append1.tail3Num)
    val num3_2: ghdmzsk        = num2.inputGHDMZSK(() => Num44.Append1.tail4Num)
    val num3: ghdmzsk          = num3_1.inputGHDMZSK(() => num3_2)
    val num3Except: BigDecimal = BigDecimal(分子3) / BigDecimal(分母3)
    count(
      () => num3,
      printlnSum = 5,
      dealResult = (a1, a2, a3, a4) => {
        val aResult: BigDecimal = (BigDecimal(a1) + BigDecimal(a2)) / (BigDecimal(a3) + BigDecimal(a4))
        println(
          s"except: $num1Except, current1: $a1, current2: $a2, current3: $a3, current4: $a4, current: $aResult"
        )
      }
    )
    println("== end 3 ==")

    /*val num4: ghdmzsk          = build(分子 = 分母4, 分母 = 分子4)
    val num4Except: BigDecimal = BigDecimal(分子4) / BigDecimal(分母4)
    count(() => num4, except = num4Except, printlnSum = 5)*/

    /*val result1: ghdmzsk = Num43.Append1.tailToRightInstance
      .inputGHDMZSK(() => num1)
      .inputGHDMZSK(() => num2)
      .inputGHDMZSK(() => num3)
      .inputGHDMZSK(() => num4)
      .inputGHDMZSK(() => Num43.Append1.tailToLeftInstance)
    val result1Except: BigDecimal = num1Except * num2Except * num3Except * num4Except
    count(() => result1, except = result1Except, printlnSum = 5)

    val result2: ghdmzsk = Num43.Append1.tailToRightInstance
      .inputGHDMZSK(() => num1)
      .inputGHDMZSK(() => result1)
      .inputGHDMZSK(() => num3)
      .inputGHDMZSK(() => result1)
      .inputGHDMZSK(() => Num43.Append1.tailToLeftInstance)
    val result2Except: BigDecimal = num1Except * result1Except * num3Except * result1Except
    count(() => result2, except = result2Except, printlnSum = 5)

    val result3: ghdmzsk = Num43.Append1.tailToRightInstance
      .inputGHDMZSK(() => result1)
      .inputGHDMZSK(() => result2)
      .inputGHDMZSK(() => num3)
      .inputGHDMZSK(() => num4)
      .inputGHDMZSK(() => Num43.Append1.tailToLeftInstance)
    val result3Except: BigDecimal = result1Except * result2Except * num3Except * num4Except
    count(() => result3, except = result3Except, printlnSum = 20)*/

    println("== finished 1 ==")
  }

}
