package net.scalax.simple.adt.text.v3

class FAppenderCodengen(val index: Int) {

  extension (list: Seq[String]) {
    def mkString(c: Char): String = list.mkString(c.toString)
  }

  class TraitDef(val index: Int) {

    val typeParam1: Seq[String] = for (i1 <- 1 to index) yield s"HCollection$i1"

    val text: String = s"def current: M[${typeParam1.mkString(',')}]"

  }

  class TraitNextDef(val index: Int) {

    val typeParam2: Seq[String] = for (i1 <- 1 to index) yield s"T$i1"
    val typeParam3: Seq[String] = for (i1 <- 1 to index) yield s"HLLike$i1"
    val typeParam4: Seq[String] = for (i1 <- 1 to index) yield s"APRHLLike$i1"
    val typeParam5: Seq[String] = for (i1 <- 1 to index) yield s"APRHLLike$i1[T$i1, HCollection$i1]"

    val text: String =
      s"def next[${typeParam2.mkString(',')}](p: M[${typeParam2.mkString(',')}]): AppenderNatSupport$index[M, ${typeParam3.mkString(',')}, ${typeParam4.mkString(',')}, ${typeParam5.mkString(',')}]"

  }

  class TraitBody(val index: Int) {

    val traitDef: TraitDef         = new TraitDef(index)
    val traitNextDef: TraitNextDef = new TraitNextDef(index)

    val typeParam1: Seq[String] = for (_ <- 1 to index) yield s"_"
    val typeParam3: Seq[String] = for (i1 <- 1 to index) yield s"HLLike$i1"
    val typeParam4: Seq[String] = for (i1 <- 1 to index) yield s"APRHLLike$i1[_, _ <: HLLike$i1] <: HLLike$i1"
    val typeParam5: Seq[String] = for (i1 <- 1 to index) yield s"HCollection$i1 <: HLLike$i1"

    val text: String =
      s"""trait AppenderNatSupport$index[M[${typeParam1.mkString(',')}], ${typeParam3.mkString(
          ','
        )}, ${typeParam4.mkString(',')}, ${typeParam5.mkString(',')}] {
      ${traitDef.text}
      ${traitNextDef.text}
    }"""

  }

  val preTextContent: Seq[String] = for (i <- 1 to index) yield new TraitBody(i).text

  val text: String = s"""
    package net.scalax.simple.adt
    package nat
    package support

    ${preTextContent.mkString('\n')}
  """

}
