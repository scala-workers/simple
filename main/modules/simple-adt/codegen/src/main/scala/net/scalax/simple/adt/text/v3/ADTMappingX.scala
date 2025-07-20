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
      if (index > 0) s"AdtHList.UsePositive[T$index => N$index, ${typeParam3Impl(index - 1)}]" else "AdtHList"
    val typeParam3: String = typeParam3Impl(TraitBodySelf.index)

    def typeParam4Impl(index: Int): String =
      if (index > 0) s"AdtCoProduct.UsePositive[T$index, ${typeParam4Impl(index - 1)}]" else "AdtCoProduct"
    val typeParam4: String = typeParam4Impl(TraitBodySelf.index)

    def typeParam5Impl(index: Int): String =
      if (index > 0) s"AdtCoProduct.UsePositive[N$index, ${typeParam5Impl(index - 1)}]" else "AdtCoProduct"
    val typeParam5: String = typeParam5Impl(TraitBodySelf.index)

    val typeParam6Impl1: Seq[String] = for (i1 <- 1 until index) yield s"T$i1"
    val typeParam6Impl2: Seq[String] = for (i1 <- 1 until index) yield s"N$i1"
    val typeParam6Impl: Seq[String]  = typeParam6Impl1 ++: typeParam6Impl2
    val typeParam6: String           = if (typeParam6Impl.isEmpty) "" else typeParam6Impl.mkString('[', ',', ']')

    def typeParam7Impl(index: Int): String =
      if (index > 0)
        s"AdtInstanceFunc.appendSimpleAdt.next[T$index, N$index, ${typeParam4Impl(index - 1)}, ${typeParam3Impl(index - 1)}, ${typeParam5Impl(index - 1)}](AdtFunctionSupportSelf.inputHList${index - 1}$typeParam6)"
      else "(a1: AdtCoProduct, b1: AdtHList) => (a1: AdtCoProduct)"
    val typeParam7: String = typeParam7Impl(TraitBodySelf.index)

    val text: String = s"""
      def inputHList$index[${typeParam1.mkString(',')}, ${typeParam2.mkString(',')}]: ($typeParam4, $typeParam3) => $typeParam5 = {
        $typeParam7
      }
    """

  }

  val preTextContent: Seq[String] = for (i <- 1 to index) yield new TraitBody(i).text

  val text: String = s"""
    package net.scalax.simple.adt
    package instance
    package support

    object AdtFunctionSupport {
      AdtFunctionSupportSelf =>

      val inputHList0: (AdtCoProduct, AdtHList) => AdtCoProduct = (a1: AdtCoProduct, b1: AdtHList) => (a1: AdtCoProduct)

      ${preTextContent.mkString('\n')}

    }
  """

}
