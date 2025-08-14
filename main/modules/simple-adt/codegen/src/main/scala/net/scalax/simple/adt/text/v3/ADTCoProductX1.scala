package net.scalax.simple.adt.text.v3

class ADTCoProductX1(val index: Int) {

  extension (list: Seq[String]) {
    def mkString(c: Char): String                      = list.mkString(c.toString)
    def mkString(c1: Char, c2: Char, c3: Char): String = list.mkString(c1.toString, c2.toString, c3.toString)
  }

  class TraitBody(val index: Int) {
    TraitBodySelf =>

    val typeParam1: Seq[String] = for (i1 <- 1 to index) yield s"T$i1"
    val typeParam2: Seq[String] = "Target" +: (for (i1 <- 2 to index) yield s"T$i1")

    def typeParam3Impl(index: Int): String =
      if (index <= TraitBodySelf.index) s"APCoProduct2[T$index, ${typeParam3Impl(index + 1)}]" else "CoZero2"
    val typeParam3: String = typeParam3Impl(1)

    def typeParam4Impl(index: Int): String =
      if (index <= TraitBodySelf.index) s"APProduct1[T$index => Target, ${typeParam4Impl(index + 1)}]" else "ProZero1"
    val typeParam4: String = typeParam4Impl(1)

    val typeParam5: String = typeParam3Impl(2)

    val typeParam6: String = typeParam4Impl(2)

    val text: String = s"""
      def inputHList$index[
        Target,
        ${typeParam1.mkString(',')}
      ]: $typeParam4 => $typeParam3 => Option[Target] = {
        ADTCoProductX1Self.util.appendSupport[Target, T1, $typeParam6, $typeParam5](ADTCoProductX1Self.inputHList${index - 1}[${typeParam2
        .mkString(',')}])
      }
    """

  }

  val preTextContent: Seq[String] = for (i <- 1 to index) yield new TraitBody(i).text

  val text: String = s"""
    package net.scalax.simple.adt
    package instance
    package support

    trait ADTCoProductX1[
      Product1, APProduct1[_, _ <: Product1] <: Product1, ProZero1 <: Product1,
      CoProduct2, APCoProduct2[_, _ <: CoProduct2] <: CoProduct2, CoZero2 <: CoProduct2
    ] extends ADTCoProductX1Helper[
      Product1, APProduct1,
      CoProduct2, APCoProduct2
    ] { ADTCoProductX1Self =>

      def inputHList0[Target]: ProZero1 => CoZero2 => Option[Target] = (a1: ProZero1) => (b1: CoZero2) => None

      ${preTextContent.mkString('\n')}

    }
  """

}
