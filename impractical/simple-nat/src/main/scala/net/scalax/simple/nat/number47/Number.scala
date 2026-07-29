package net.scalax.simple
package nat
package number47

import ghdmzsk._

object Num47 { NumSelf =>

  trait Num1 {
    def name: String
  }

  def buildNum1(str: String) = new ghdmzsk {
    override def inputGHDMZSK(t1: () => ghdmzsk): ghdmzsk = new ghdmzsk with Num1 {
      override def name: String                             = str
      override def inputGHDMZSK(t2: () => ghdmzsk): ghdmzsk = t1()
    }
  }

  object Append1 {
    def tail1Num: ghdmzsk = new ghdmzsk {
      override def inputGHDMZSK(tail1: () => ghdmzsk): ghdmzsk = new ghdmzsk {
        override def inputGHDMZSK(tail2: () => ghdmzsk): ghdmzsk = new ghdmzsk {
          override def inputGHDMZSK(tail3: () => ghdmzsk): ghdmzsk = new ghdmzsk {
            override def inputGHDMZSK(tail4: () => ghdmzsk): ghdmzsk = new ghdmzsk {
              override def inputGHDMZSK(tail5: () => ghdmzsk): ghdmzsk = new ghdmzsk {
                override def inputGHDMZSK(tail6: () => ghdmzsk): ghdmzsk = new ghdmzsk {
                  override def inputGHDMZSK(tail7: () => ghdmzsk): ghdmzsk = new ghdmzsk {
                    override def inputGHDMZSK(tail8: () => ghdmzsk): ghdmzsk =
                      tail8()
                        .inputGHDMZSK(tail1)
                        .inputGHDMZSK(tail2)
                        .inputGHDMZSK(tail3)
                        .inputGHDMZSK(tail4)
                        .inputGHDMZSK(tail5)
                        .inputGHDMZSK(tail6)
                        .inputGHDMZSK(tail7)
                  }
                }
              }
            }
          }
        }
      }
    }

    def tail2Num(name: String): ghdmzsk = new ghdmzsk {
      override def inputGHDMZSK(tail1: () => ghdmzsk): ghdmzsk = new ghdmzsk {
        override def inputGHDMZSK(tail2: () => ghdmzsk): ghdmzsk = new ghdmzsk {
          override def inputGHDMZSK(tail3: () => ghdmzsk): ghdmzsk = new ghdmzsk {
            override def inputGHDMZSK(tail4: () => ghdmzsk): ghdmzsk = new ghdmzsk {
              override def inputGHDMZSK(tail5: () => ghdmzsk): ghdmzsk = new ghdmzsk {
                override def inputGHDMZSK(tail6: () => ghdmzsk): ghdmzsk = new ghdmzsk {
                  override def inputGHDMZSK(tail7: () => ghdmzsk): ghdmzsk = new ghdmzsk {
                    override def inputGHDMZSK(tail8: () => ghdmzsk): ghdmzsk =
                      buildNum1(name).inputGHDMZSK(() =>
                        tail2()
                          .inputGHDMZSK(tail3)
                          .inputGHDMZSK(tail4)
                          .inputGHDMZSK(tail5)
                          .inputGHDMZSK(tail6)
                          .inputGHDMZSK(tail7)
                          .inputGHDMZSK(tail8)
                          .inputGHDMZSK(tail1)
                      )
                  }
                }
              }
            }
          }
        }
      }
    }
  }

}
