package net.scalax.simple
package nat
package number39

import scala.annotation.tailrec
import ghdmzsk._

object RunTest1 {

  /*def build(分子: Long, 分母: Long): ghdmzsk = {
    def buildImpl(isFenmu: Boolean, numLong: Long, zero: () => ghdmzsk): ghdmzsk = {
      if (numLong > 0) {
        if (isFenmu) {
          乘除1.toLeft.inputGHDMZSK(() => buildImpl(isFenmu = isFenmu, numLong = numLong - 1, zero))
        } else {
          乘除1.toRight.inputGHDMZSK(() => buildImpl(isFenmu = isFenmu, numLong = numLong - 1, zero))
        }
      } else {
        zero()
      }
    }

    lazy val build1: ghdmzsk = buildImpl(isFenmu = false, numLong = 分子, zero = () => build2)
    lazy val build2: ghdmzsk = buildImpl(isFenmu = true, numLong = 分母, zero = () => build1)

    build1
  }*/

  @tailrec
  def countImpl(
    num: () => ghdmzsk,
    current分子: Long,
    current分母: Long,
    exceptResult: BigDecimal,
    printlnSum: Int,
    speed: Long
  ): Unit = {
    val needPrintln: Boolean = (current分子 + current分母) % speed == 0

    def current: BigDecimal = BigDecimal(current分子) / BigDecimal(current分母)
    def cha: BigDecimal     = current - exceptResult

    if (needPrintln) {
      println(s"except: $exceptResult, current: $current分子 / $current分母 = $current, cha = $cha")
    }

    val currentNum = num()

    if (printlnSum > 0) {
      currentNum match {
        case num1: Num39.Num1 =>
          countImpl(
            () => num1.pre1,
            current分子 = current分子,
            current分母 = current分母 + 1,
            exceptResult = exceptResult,
            printlnSum = if (needPrintln) printlnSum - 1 else printlnSum,
            speed = speed
          )
        case num2: Num39.Num2 =>
          countImpl(
            () => num2.pre2,
            current分子 = current分子 + 1,
            current分母 = current分母,
            exceptResult = exceptResult,
            printlnSum = if (needPrintln) printlnSum - 1 else printlnSum,
            speed = speed
          )
      }
    } else {
      println("== finished ==")
    }
  }

  def count(num: () => ghdmzsk, except: BigDecimal, printlnSum: Int, speed: Long = 8000000): Unit =
    countImpl(num = num, current分子 = 1, current分母 = 1, exceptResult = except, printlnSum = printlnSum, speed = speed)

  def main(arr: Array[String]): Unit = {
    /*locally {
      val num1: ghdmzsk = build(5, 10)
      count(num = () => num1, except = BigDecimal(5) / BigDecimal(10), printlnSum = 15)
    }
    locally {
      val num1: ghdmzsk = build(12, 6)
      count(num = () => num1, except = BigDecimal(12) / BigDecimal(6), printlnSum = 15)
    }*/

    /*locally {
      val 分子: Int = 12
      val 分母: Int = 3

      count(num = () => 乘除1.num6, except = BigDecimal(分母) / BigDecimal(分子), printlnSum = 10, speed = 20000)
    }*/

    println("== finished 1 ==")
  }

}
