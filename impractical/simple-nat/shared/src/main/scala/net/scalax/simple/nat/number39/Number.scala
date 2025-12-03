package net.scalax.simple
package nat
package number39

import ghdmzsk._

object Num39 {

  trait Num1 {
    def pre1: ghdmzsk
  }

  trait Num2 {
    def pre2: ghdmzsk
  }

  val n1: ghdmzsk = new ghdmzsk {
    override def inputGHDMZSK(a: () => ghdmzsk): ghdmzsk = new ghdmzsk with Num1 {
      override def pre1: ghdmzsk = a()

      override def inputGHDMZSK(b: () => ghdmzsk): ghdmzsk = a().inputGHDMZSK(b)
    }
  }

  val n2: ghdmzsk = new ghdmzsk {
    override def inputGHDMZSK(a: () => ghdmzsk): ghdmzsk = new ghdmzsk with Num2 {
      override def pre2: ghdmzsk = a()

      override def inputGHDMZSK(b: () => ghdmzsk): ghdmzsk = b().inputGHDMZSK(a)
    }
  }

}
