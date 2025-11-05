package net.scalax.simple.adt.text.v4

class NatAppender6SupportCodegen(val index: Int) {

  extension (list: Seq[String]) {
    def mkString(c: Char): String = list.mkString(c.toString)
  }

  class TraitBody(val index: Int) {

    val typeParam1: Seq[String]  = for (_ <- 1 to index) yield s"_"
    val typeParam3: Seq[String]  = for (i1 <- 1 to index) yield s"HLLike$i1"
    val typeParam4: Seq[String]  = for (i1 <- 1 to index) yield s"APRHLLike$i1[_, _ <: HLLike$i1] <: HLLike$i1"
    val typeParam5: Seq[String]  = for (index <- 1 to index) yield s"T$index[_]"
    val typeParam6: Seq[String]  = for (i1 <- 1 to index) yield s"APRHLLike$i1"
    val typeParam7: Seq[String]  = for (i1 <- 1 to index) yield s"HCollection$i1 <: HLLike$i1"
    val typeParam8: Seq[String]  = for (i1 <- 1 to index) yield s"HCollection$i1"
    val typeParam9: Seq[String]  = for (i1 <- 1 to index) yield s"APRHLLike$i1[T$i1[U], HCollection$i1]"
    val typeParam13: Seq[String] = for (i1 <- 1 to index) yield s"T$i1[U]"
    val typeParam14: Seq[String] = for (index <- 1 to index) yield s"T$index"

    val text: String = s"""
      trait Support$index[
        M[${typeParam1.mkString(',')}],
        U,
        ${typeParam5.mkString(',')},
        ${typeParam3.mkString(',')},
        ${typeParam4.mkString(',')}
      ] extends NatAppender2.Support$index[
        M,
        ${typeParam13.mkString(',')},
        ${typeParam3.mkString(',')},
        ${typeParam6.mkString(',')}
      ] with NatAppender5.Support$index[
        M,
        U,
        ${typeParam14.mkString(',')},
        ${typeParam3.mkString(',')},
        ${typeParam6.mkString(',')}
      ] {
        SupportSelf =>

        def typeGen: TypeGen$index[M, ${typeParam14.mkString(',')}]
        override def headPlus: M[${typeParam13.mkString(',')}] = SupportSelf.typeGen.gen[U]
      }
    """

  }

  val preTextContent: Seq[String] = for (i <- 1 to index) yield new TraitBody(i).text

  val text: String = s"""
    package net.scalax.simple.adt
    package nat
    package support

    object NatAppender6 {
      ${preTextContent.mkString('\n')}
    }
  """

}
