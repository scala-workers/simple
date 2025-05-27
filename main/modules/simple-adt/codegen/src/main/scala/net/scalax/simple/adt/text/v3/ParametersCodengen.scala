package net.scalax.simple.adt.codegen

class ParametersCodengen(val index: Int) {

  extension (list: Seq[String]) {
    def mkString(c: Char): String = list.mkString(c.toString)
  }

  class TraitDef(val index: Int) {

    val typeParam1: Seq[String] = for (i1 <- 1 to index) yield s"N$i1[Item$i1]"
    val typeParam2: Seq[String] = for (i1 <- 1 to index) yield s"HCollection$i1"
    val typeParam3: Seq[String] = for (i1 <- 1 to index) yield s"APRHLLike$i1[N$i1[Item$i1], HCollection$i1]"

    val text: String = s"""
      override def append(param: M[${typeParam2.mkString(',')}] => M[${typeParam2.mkString(',')}])
        : M[${typeParam3.mkString(',')}] => M[${typeParam3.mkString(',')}]
    """

  }

  class TraitBody(val index: Int) {

    val traitDef: TraitDef = new TraitDef(index)

    val typeParam1: Seq[String] = for (_ <- 1 to index) yield s"_"
    val typeParam2: Seq[String] = for (i1 <- 1 to index) yield s"Item$i1"
    val typeParam3: Seq[String] = for (i1 <- 1 to index) yield s"N$i1[_]"

    val typeParam4: Seq[String] = for (i1 <- 1 to index) yield s"HLLike$i1"
    val typeParam5: Seq[String] = for (i1 <- 1 to index) yield s"APRHLLike$i1"
    val typeParam6: Seq[String] = for (i1 <- 1 to index) yield s"APRHLLike$i1[T$i1, _ <: HLLike$i1] <: HLLike$i1"

    val typeParam7: Seq[String] = for (i1 <- 1 to index) yield s"N$i1[Item$i1]"
    val typeParam8: Seq[String] = for (i1 <- 1 to index) yield s"HCollection$i1"
    val typeParam9: Seq[String] = for (i1 <- 1 to index) yield s"HCollection$i1 <: HLLike$i1"

    val typeParam10: Seq[String] = for (i1 <- 1 to (index * 2)) yield s"XU$i1"
    val typeParam11: Seq[String] = for (i1 <- 1 to index) yield s"XU$i1"
    val typeParam12: Seq[String] = for (i1 <- (index + 1) to (index * 2)) yield s"XU$i1"

    val text: String = s"""
      trait ParameterNatSupport$index[
        M[${typeParam1.mkString(',')}],
        ${typeParam2.mkString(',')},
        ${typeParam3.mkString(',')},
        ${typeParam4.mkString(',')},
        ${typeParam6.mkString(',')},
        ${typeParam9.mkString(',')}]
          extends AppenderNatSupport${index * 2}[
            ({ type MU[${typeParam10.mkString(',')}] = M[${typeParam11.mkString(',')}] => M[${typeParam12.mkString(',')}] })#MU,
            ${typeParam7.mkString(',')},
            ${typeParam7.mkString(',')},
            ${typeParam4.mkString(',')},
            ${typeParam4.mkString(',')},
            ${typeParam5.mkString(',')},
            ${typeParam5.mkString(',')},
            ${typeParam8.mkString(',')},
            ${typeParam8.mkString(',')}] {
      ${traitDef.text}
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
