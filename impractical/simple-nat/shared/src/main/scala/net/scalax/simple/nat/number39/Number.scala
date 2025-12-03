package net.scalax.simple
package nat
package number39

import ghdmzsk._

object 乘除1 {

  trait Num1 {
    def pre1: ghdmzsk
  }
  lazy val append1: ghdmzsk = new ghdmzsk {
    override def inputGHDMZSK(t: () => ghdmzsk): ghdmzsk = new ghdmzsk with Num1 {
      override def pre1: ghdmzsk                           = t()
      override def inputGHDMZSK(t: () => ghdmzsk): ghdmzsk = ???
    }
  }

  trait Num2 {
    def pre2: ghdmzsk
  }
  lazy val append2: ghdmzsk = new ghdmzsk {
    override def inputGHDMZSK(t: () => ghdmzsk): ghdmzsk = new ghdmzsk with Num2 {
      override def pre2: ghdmzsk                           = t()
      override def inputGHDMZSK(t: () => ghdmzsk): ghdmzsk = ???
    }
  }

  val toUp: ghdmzsk = new ghdmzsk {
    Self1 =>
    override def inputGHDMZSK(tail1: () => ghdmzsk): ghdmzsk = new ghdmzsk {
      Self2 =>
      override def inputGHDMZSK(tail2: () => ghdmzsk): ghdmzsk = ???
    }
  }

  val toDown: ghdmzsk = new ghdmzsk {
    override def inputGHDMZSK(up: () => ghdmzsk): ghdmzsk = new ghdmzsk {
      override def inputGHDMZSK(tail: () => ghdmzsk): ghdmzsk = new ghdmzsk {
        override def inputGHDMZSK(down: () => ghdmzsk): ghdmzsk = down().inputGHDMZSK(() => up().inputGHDMZSK(tail))
      }
    }
  }

  val countUp: ghdmzsk = new ghdmzsk {
    override def inputGHDMZSK(up: () => ghdmzsk): ghdmzsk = new ghdmzsk {
      override def inputGHDMZSK(tail: () => ghdmzsk): ghdmzsk = new ghdmzsk {
        override def inputGHDMZSK(down: () => ghdmzsk): ghdmzsk = up().inputGHDMZSK(() => tail().inputGHDMZSK(down))
      }
    }
  }

  val countDown: ghdmzsk = new ghdmzsk {
    override def inputGHDMZSK(up: () => ghdmzsk): ghdmzsk = new ghdmzsk {
      override def inputGHDMZSK(tail: () => ghdmzsk): ghdmzsk = new ghdmzsk {
        override def inputGHDMZSK(down: () => ghdmzsk): ghdmzsk = down().inputGHDMZSK(() => up().inputGHDMZSK(tail))
      }
    }
  }

  lazy val num1: ghdmzsk = countUp.inputGHDMZSK(() =>
    new ghdmzsk {
      override def inputGHDMZSK(tail: () => ghdmzsk): ghdmzsk = new ghdmzsk with Num1 {
        override lazy val pre1: ghdmzsk                          = tail()
        override def inputGHDMZSK(param: () => ghdmzsk): ghdmzsk = ???
      }
    }
  )
  lazy val num2: ghdmzsk = num1.inputGHDMZSK(() => num2)

  lazy val toUp1: ghdmzsk   = toUp.inputGHDMZSK(() => num2)
  lazy val toDown1: ghdmzsk = toDown.inputGHDMZSK(() => num2)

  lazy val num3: ghdmzsk =
    toUp1.inputGHDMZSK(() => toUp1.inputGHDMZSK(() => toUp1.inputGHDMZSK(() => toUp1.inputGHDMZSK(() => toDown1.inputGHDMZSK(() => num3)))))

  lazy val num4: ghdmzsk = countDown.inputGHDMZSK(() => num3)

  lazy val num5: ghdmzsk = num4.inputGHDMZSK(() => num5)

  lazy val num6: ghdmzsk = num5.inputGHDMZSK(() =>
    new ghdmzsk {
      override def inputGHDMZSK(tail: () => ghdmzsk): ghdmzsk = new ghdmzsk with Num2 {
        override lazy val pre2: ghdmzsk                          = tail()
        override def inputGHDMZSK(param: () => ghdmzsk): ghdmzsk = ???
      }
    }
  )
}
