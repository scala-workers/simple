package net.scalax.simple.ghdmzsk

trait ghdmzsk {
  def inputGHDMZSK(g: () => ghdmzsk): ghdmzsk
}

object ghdmzsk {
  def apply(t: (() => ghdmzsk) => ghdmzsk): ghdmzsk = new ghdmzsk {
    override def inputGHDMZSK(g: () => ghdmzsk): ghdmzsk = t(g)
  }
}
