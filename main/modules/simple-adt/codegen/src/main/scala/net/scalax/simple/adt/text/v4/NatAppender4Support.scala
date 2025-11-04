package net.scalax.simple.adt.text.v4

class NatAppender4SupportCodegen(val index: Int) {

  extension (list: Seq[String]) {
    def mkString(c: Char): String = list.mkString(c.toString)
  }

  class TraitBody(val index: Int) {

    val typeParam1: Seq[String]  = for (_ <- 1 to index) yield s"_"
    val typeParam3: Seq[String]  = for (i1 <- 1 to index) yield s"HLLike1"
    val typeParam4: Seq[String]  = for (i1 <- 1 to index) yield s"APRHLLike1[_, _ <: HLLike1] <: HLLike1"
    val typeParam5: Seq[String]  = for (index <- 1 to index) yield s"T$index"
    val typeParam6: Seq[String]  = for (i1 <- 1 to index) yield s"APRHLLike1"
    val typeParam7: Seq[String]  = for (i1 <- 1 to index) yield s"HCollection1 <: HLLike1"
    val typeParam8: Seq[String]  = for (i1 <- 1 to index) yield s"HCollection1"
    val typeParam9: Seq[String]  = for (i1 <- 1 to index) yield s"APRHLLike1[T$i1, HCollection1]"
    val typeParam11: Seq[String] = for (i1 <- 2 to index) yield s"abcFunc$i1"
    val typeParam12: Seq[String] =
      for (i1 <- 2 to index) yield s"override def hlistFunnc$i1: HListFunc[HLLike1, APRHLLike1] = SupportSelf.hlistFunnc1"

    val text: String = s"""
      trait Support$index[
        M[${typeParam1.mkString(',')}],
        ${typeParam5.mkString(',')},
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender3.Support$index[
        M,
        ${typeParam5.mkString(',')},
        ${typeParam3.mkString(',')},
        ${typeParam6.mkString(',')}
      ] {
        SupportSelf =>

        override def sAppender: SimpleAppender${index}Positive[M]
        ${typeParam12.mkString('\n')}
        def headPlus: M[${typeParam5.mkString(',')}]
      }
    """

  }

  val preTextContent: Seq[String] = for (i <- 1 to index) yield new TraitBody(i).text

  val text: String = s"""
    package net.scalax.simple.adt
    package nat
    package support

    object NatAppender4 {
      ${preTextContent.mkString('\n')}
    }
  """

}
