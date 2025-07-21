package net.scalax.simple.adt.text.v3

class ADTMappingX(val index: Int) {

  extension (list: Seq[String]) {
    def mkString(c: Char): String                      = list.mkString(c.toString)
    def mkString(c1: Char, c2: Char, c3: Char): String = list.mkString(c1.toString, c2.toString, c3.toString)
  }

  class TraitBody(val index: Int) {
    TraitBodySelf =>

    val typeParam1: Seq[String] = for (i1 <- 1 to index) yield s"T$i1"
    val typeParam2: Seq[String] = for (i1 <- 1 to index) yield s"N$i1"

    def typeParam3Impl(index: Int): String =
      if (index <= TraitBodySelf.index) s"APProduct2[T$index => N$index, ${typeParam3Impl(index + 1)}]" else "Product2"
    val typeParam3: String = typeParam3Impl(1)

    def typeParam4Impl(index: Int): String =
      if (index <= TraitBodySelf.index) s"APCoProduct1[T$index, ${typeParam4Impl(index + 1)}]" else "CoProduct1"
    val typeParam4: String = typeParam4Impl(1)

    def typeParam5Impl(index: Int): String =
      if (index <= TraitBodySelf.index) s"APCoProduct3[N$index, ${typeParam5Impl(index + 1)}]" else "CoProduct3"
    val typeParam5: String = typeParam5Impl(1)

    val typeParam7: Seq[String] = for (i1 <- 2 to index) yield s"T$i1"
    val typeParam8: Seq[String] = for (i1 <- 2 to index) yield s"N$i1"

    val typeParam9: String = s"""
      AdtFunctionSupportSelf.appendSimpleAdt.next[T1, N1, ${typeParam4Impl(2)}, ${typeParam3Impl(2)}, ${typeParam5Impl(2)}](
        AdtFunctionSupportSelf.inputHList${index - 1}[${typeParam7.mkString(',')}, ${typeParam8.mkString(',')}]
      )
    """

    val text: String = s"""
      def inputHList$index[${typeParam1.mkString(',')}, ${typeParam2.mkString(',')}]: ($typeParam4, $typeParam3) => $typeParam5 = {
        $typeParam9
      }
    """

  }

  val preTextContent: Seq[String] = for (i <- 2 to index) yield new TraitBody(i).text

  val text: String = s"""
    package net.scalax.simple.adt
    package instance
    package support

    trait AdtFunctionSupport[
      CoProduct1, APCoProduct1[_, _ <: CoProduct1] <: CoProduct1,
      Product2, APProduct2[_, _ <: Product2] <: Product2,
      CoProduct3, APCoProduct3[_, _ <: CoProduct3] <: CoProduct3
    ] extends AdtFunctionSupportAbs[CoProduct1, APCoProduct1, Product2, APProduct2, CoProduct3, APCoProduct3] {
      AdtFunctionSupportSelf =>

      ${preTextContent.mkString('\n')}

    }
  """

}
