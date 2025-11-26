package net.scalax.simple.adt.text.v4

class NatAppender7SupportCodegen(val index: Int) {

  extension (list: Seq[String]) {
    def mkString(c: Char): String = list.mkString(c.toString)
  }

  class TraitBody(val index: Int) {

    val typeParam1: Seq[String]  = for (_ <- 1 to index) yield s"_"
    val typeParam3: Seq[String]  = for (i1 <- 1 to index) yield s"HLLike$i1"
    val typeParam6: Seq[String]  = for (i1 <- 1 to index) yield s"APRHLLike$i1"
    val typeParam7: Seq[String]  = for (i1 <- 1 to index) yield s"HCollection$i1 <: HLLike$i1"
    val typeParam8: Seq[String]  = for (i1 <- 1 to index) yield s"HCollection$i1"
    val typeParam9: Seq[String]  = for (i1 <- 1 to index) yield s"APRHLLike$i1[U, HCollection$i1]"
    val typeParam15: Seq[String] = for (i1 <- 1 to index) yield s"APRHLLike$i1[_, _ <: HLLike$i1] <: HLLike$i1"

    val text: String = s"""
      trait Support$index[
        M[${typeParam1.mkString(',')}],
        ${typeParam3.mkString(',')},
        ${typeParam15.mkString(',')},
        ${typeParam7.mkString(',')}
      ] {
        def current: M[${typeParam8.mkString(',')}]

        def next[U]: Support$index[
          M,
          ${typeParam3.mkString(',')},
          ${typeParam6.mkString(',')},
          ${typeParam9.mkString(',')}
        ]
      }
    """

  }

  val preTextContent: Seq[String] = for (i <- 1 to index) yield new TraitBody(i).text

  val text: String = s"""
    package net.scalax.simple.adt
    package nat
    package support

    object NatNext1 {
      ${preTextContent.mkString('\n')}
    }
  """

}
