package net.scalax.simple.adt.codegen

class ParametersCodengen(val index: Int) {

  extension (list: Seq[String]) {
    def mkString(c: Char): String = list.mkString(c.toString)
  }

  class TraitDef(val index: Int) {

    val typeParam2: Seq[String] = for (i1 <- 1 to index) yield s"HCollection$i1"
    val typeParam3: Seq[String] = for (i1 <- 1 to index) yield s"APRHLLike$i1[N$i1[Item], HCollection$i1]"
    val typeParam4: Seq[String] = for (i1 <- 1 to index) yield s"N$i1"
    val typeParam5: Seq[String] = for (i1 <- 1 to index) yield s"HLLike$i1"
    val typeParam6: Seq[String] = for (i1 <- 1 to index) yield s"APRHLLike$i1"
    val typeParam7: Seq[String] = for (i1 <- 1 to index) yield s"N$i1[Item]"

    val appenderH: Seq[String] =
      for (i1 <- 1 to index) yield s"override def apH$i1: HListFunc[HLLike$i1, APRHLLike$i1] = ParameterNatSupport${index}Self.apH$i1"

    val text: String = s"""
      def append[Item](p: M[${typeParam7.mkString(',')}]): ParameterNatSupport$index[M, ${typeParam4.mkString(',')}, ${typeParam5.mkString(
        ','
      )}, ${typeParam6.mkString(
        ','
      )}, ${typeParam3.mkString(',')}] = new ParameterNatSupport$index[M, ${typeParam4.mkString(',')}, ${typeParam5.mkString(
        ','
      )}, ${typeParam6.mkString(
        ','
      )}, ${typeParam3.mkString(',')}] {
        override def content: AppenderNatSupport$index[M, ${typeParam5.mkString(',')}, ${typeParam6.mkString(',')}, ${typeParam3.mkString(
        ','
      )}] = ParameterNatSupport${index}Self.content.next[${typeParam7.mkString(',')}](p)
        ${appenderH.mkString('\n')}
      }
    """

  }

  class TraitCurrnetDef(val index: Int) {

    val typeParam2: Seq[String] = for (i1 <- 1 to index) yield s"HCollection$i1"

    val text: String = s"""
      def now: M[${typeParam2.mkString(',')}] = content.current
    """

  }

  class TraitContentDef(val index: Int) {

    val typeParam1: Seq[String] = for (i1 <- 1 to index) yield s"HLLike$i1"
    val typeParam2: Seq[String] = for (i1 <- 1 to index) yield s"HCollection$i1"
    val typeParam3: Seq[String] = for (i1 <- 1 to index) yield s"APRHLLike$i1[N$i1[Item$i1], HCollection$i1]"
    val typeParam4: Seq[String] = for (i1 <- 1 to index) yield s"APRHLLike$i1"

    val text: String =
      s"""
        def content: AppenderNatSupport$index[M, ${typeParam1.mkString(',')}, ${typeParam4.mkString(
          ','
        )}, ${typeParam2.mkString(',')}]
      """

  }

  class TraitBody(val index: Int) {

    val traitCurrnetDef: TraitCurrnetDef = new TraitCurrnetDef(index)
    val traitDef: TraitDef               = new TraitDef(index)
    val traitContentDef: TraitContentDef = new TraitContentDef(index)

    val appenderH: Seq[String] = for (i1 <- 1 to index) yield s"def apH$i1: HListFunc[HLLike$i1, APRHLLike$i1]"

    val typeParam1: Seq[String] = for (_ <- 1 to index) yield s"_"
    val typeParam3: Seq[String] = for (i1 <- 1 to index) yield s"N$i1[_]"

    val typeParam4: Seq[String] = for (i1 <- 1 to index) yield s"HLLike$i1"
    val typeParam5: Seq[String] = for (i1 <- 1 to index) yield s"APRHLLike$i1"
    val typeParam6: Seq[String] = for (i1 <- 1 to index) yield s"APRHLLike$i1[_, _ <: HLLike$i1] <: HLLike$i1"

    val typeParam7: Seq[String] = for (i1 <- 1 to index) yield s"N$i1[Item]"
    val typeParam8: Seq[String] = for (i1 <- 1 to index) yield s"HCollection$i1"
    val typeParam9: Seq[String] = for (i1 <- 1 to index) yield s"HCollection$i1 <: HLLike$i1"

    val typeParam10: Seq[String] = for (i1 <- 1 to (index * 2)) yield s"XU$i1"
    val typeParam11: Seq[String] = for (i1 <- 1 to index) yield s"XU$i1"
    val typeParam12: Seq[String] = for (i1 <- (index + 1) to (index * 2)) yield s"XU$i1"

    val text: String = s"""
      trait ParameterNatSupport$index[
        M[${typeParam1.mkString(',')}],
        ${typeParam3.mkString(',')},
        ${typeParam4.mkString(',')},
        ${typeParam6.mkString(',')},
        ${typeParam9.mkString(',')}
      ] {
        ParameterNatSupport${index}Self=>

        ${traitCurrnetDef.text}
        ${traitDef.text}
        ${traitContentDef.text}

        ${appenderH.mkString('\n')}
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
