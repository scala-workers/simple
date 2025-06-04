package net.scalax.simple.adt.text.v3

class TypeGenCodegen(val index: Int) {

  extension (list: Seq[String]) {
    def mkString(c: Char): String = list.mkString(c.toString)
  }

  class Param1Def(val index: Int) {

    val typeParam1: Seq[String] = for (i1 <- 1 to index) yield s"N$i1[T]"

    val text: String = s"M[${typeParam1.mkString(',')}]"

  }

  class TraitBody(val index: Int) {

    val param1Def: Param1Def = new Param1Def(index)

    val typeParam1: Seq[String] = for (_ <- 1 to index) yield s"_"
    val typeParam2: Seq[String] = for (i1 <- 1 to index) yield s"N$i1[_]"

    val text: String = s"""
      trait TypeGen$index[M[${typeParam1.mkString(',')}], ${typeParam2.mkString(',')}] {
        def gen[T]: ${param1Def.text}
      }
    """

  }

  val preTextContent: Seq[String] = for (i <- 1 to index) yield new TraitBody(i).text

  val text: String = s"""
    package net.scalax.simple.adt
    package nat
    package support

    ${preTextContent.mkString('\n')}
  """

}
