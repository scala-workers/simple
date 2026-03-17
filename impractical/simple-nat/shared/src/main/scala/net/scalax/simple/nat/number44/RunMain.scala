package net.scalax.simple
package nat
package number44

import scala.annotation.tailrec
import ghdmzsk.ghdmzsk

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
    def countIns(a1: Long, a2: Long, a3: Long, a4: Long, b1: Long, b2: Long, b3: Long, b4: Long): Unit = {

      val num1: ghdmzsk = build(current1 = a1, current2 = a2, current3 = a3, current4 = a4)
      val num2: ghdmzsk = build(current1 = b1, current2 = b2, current3 = b3, current4 = b4)

      val num3_1: ghdmzsk = num1.inputGHDMZSK(() => Num44.Append1.tail3Num)
      val num3_2: ghdmzsk = num2.inputGHDMZSK(() => Num44.Append1.tail4Num)

      val num3: ghdmzsk = num3_1.inputGHDMZSK(() => num3_2)

      count(
        () => num3,
        printlnSum = 5,
        speed = 10000000,
        dealResult = (x1, x2, x3, x4) => {
          locally {
            val aResult: BigDecimal = BigDecimal(a3) / (BigDecimal(a2) + BigDecimal(a4))
            val bResult: BigDecimal = BigDecimal(b3) / (BigDecimal(b2) + BigDecimal(b4))
            val cResult: BigDecimal = BigDecimal(x3) / BigDecimal(x4)

            println(s"result1: ${aResult / bResult},  current1: $cResult")
          }

          locally {
            val aResult: BigDecimal = BigDecimal(a1) / (BigDecimal(a2) + BigDecimal(a4))
            val bResult: BigDecimal = BigDecimal(b1) / (BigDecimal(b2) + BigDecimal(b4))
            val cResult: BigDecimal = BigDecimal(x1) / BigDecimal(x2)
            val dResult: BigDecimal = aResult / bResult
            val eResult: BigDecimal = dResult / BigDecimal(a2) * BigDecimal(b2)

            println(s"result2: ${eResult},  current2: ${cResult}")
          }
        }
      )

    }

    countIns(a1 = 17, a2 = 87, a3 = 48, a4 = 85, b1 = 79, b2 = 42, b3 = 8, b4 = 6)
    println("=== finished 1 ===")
    countIns(a1 = 123, a2 = 23, a3 = 98, a4 = 8, b1 = 12, b2 = 3, b3 = 7, b4 = 687)
    println("=== finished 2 ===")
  }

}
