package net.scalax.simple.adt.text.v4

class NatAppender7SupportCodegen(val index: Int) {

  extension (list: Seq[String]) {
    def mkString(c: Char): String = list.mkString(c.toString)
  }

  class TraitBody(val index: Int) {

    val typeParam1: Seq[String]  = for (_ <- 1 to index) yield s"_"
    val typeParam3: Seq[String]  = for (i1 <- 1 to index) yield s"HLLike1"
    val typeParam5: Seq[String]  = for (index <- 1 to index) yield s"T$index[_]"
    val typeParam6: Seq[String]  = for (i1 <- 1 to index) yield s"APRHLLike1"
    val typeParam7: Seq[String]  = for (i1 <- 1 to index) yield s"HCollection$i1 <: HLLike1"
    val typeParam8: Seq[String]  = for (i1 <- 1 to index) yield s"HCollection$i1"
    val typeParam9: Seq[String]  = for (i1 <- 1 to index) yield s"APRHLLike1[T$i1[U], HCollection1]"
    val typeParam13: Seq[String] = for (i1 <- 1 to index) yield s"T$i1[U]"
    val typeParam14: Seq[String] = for (index <- 1 to index) yield s"T$index"

    val text: String = s"""
      trait Support$index[
        M[${typeParam1.mkString(',')}],
        U,
        ${typeParam5.mkString(',')},
        HLLike1,
        APRHLLike1[_, _ <: HLLike1] <: HLLike1
      ] extends NatAppender6.Support$index[
        M,
        U,
        ${typeParam14.mkString(',')},
        ${typeParam3.mkString(',')},
        ${typeParam6.mkString(',')}
      ] with NatAppender4.Support$index[
        M,
        ${typeParam13.mkString(',')},
        HLLike1,
        APRHLLike1
      ]
    """

  }

  val preTextContent: Seq[String] = for (i <- 1 to index) yield new TraitBody(i).text

  val text: String = s"""
    package net.scalax.simple.adt
    package nat
    package support

    object NatAppender7 {
      ${preTextContent.mkString('\n')}
    }
  """

}
