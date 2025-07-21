package net.scalax.simple.adt
package instance
package support

import net.scalax.simple.adt.nat.support.AppendSimpleAdt

trait AdtFunctionSupportAbs[CoProduct1, APCoProduct1[_, _ <: CoProduct1] <: CoProduct1, Product2, APProduct2[
  _,
  _ <: Product2
] <: Product2, CoProduct3, APCoProduct3[_, _ <: CoProduct3] <: CoProduct3] {
  AdtFunctionSupportAbsSelf =>

  def appendSimpleAdt: AppendSimpleAdt[CoProduct1, APCoProduct1, Product2, APProduct2, CoProduct3, APCoProduct3]

  def inputHList0: (CoProduct1, Product2) => CoProduct3
  def inputHList1[T1, N1]: (APCoProduct1[T1, CoProduct1], APProduct2[T1 => N1, Product2]) => APCoProduct3[N1, CoProduct3] = {
    appendSimpleAdt.next[T1, N1, CoProduct1, Product2, CoProduct3](AdtFunctionSupportAbsSelf.inputHList0)
  }

}
