package net.scalax.simple.adt.codegen

class ParametersCodengen(val index: Int) {

  extension (list: Seq[String]) {
    def mkString(c: Char): String = list.mkString(c.toString)
  }

  class TraitDef(val index: Int) {

    val typeParam = for (i1 <- 1 to index) yield s"T$i1"

    val text: String = s"def item$index[${typeParam.mkString(',')}]: M[${typeParam.mkString(',')}]"

  }

  class TraitBody(val index: Int) {

    val traitDef: TraitDef = new TraitDef(index)

    val typeParam = for (_ <- 1 to index) yield s"_"

    val text: String = s"""trait ParameterNatSupport$index[M[${typeParam.mkString(',')}]] {
      ${traitDef.text}
    }"""

  }

  val preTextContent: Seq[String] = for (i <- 1 to index) yield new TraitBody(i).text

  val text: String = s"""
    package net.scalax.simple.adt
    package nat
    package support

    trait ParameterNatSupport0[M] {
      def item0: M
    }
    ${preTextContent.mkString('\n')}
  """

}
