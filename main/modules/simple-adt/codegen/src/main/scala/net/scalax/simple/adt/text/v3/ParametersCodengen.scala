package net.scalax.simple.adt.codegen

class ParametersCodengen(val index: Int) {
  ParametersCodengenSelf =>

  class TraitDef(val index: Int) {
    TraitDefSelf =>

    val typeParam = for (i1 <- 1 to index) yield s"T$i1"

    val text: String = s"def item$index[${typeParam.mkString(','.toString)}]: M[${typeParam.mkString(','.toString)}]"
  }

  class TraitBody(val index: Int) {
    TraitBodySelf =>

    val traitDef: TraitDef = new TraitDef(index)

    val typeParam = for (i1 <- 1 to index) yield s"_"

    val text: String = s"""trait ParameterNatSupport$index[M[${typeParam.mkString(','.toString)}]] {
      ${traitDef.text}
    }"""
  }

  val preTextContent = for (i <- 1 to index) yield new TraitBody(i).text

  val text: String = s"""
    package net.scalax.simple.adt
    package nat
    package support

    ${preTextContent.mkString('\n'.toString)}
  """

}
