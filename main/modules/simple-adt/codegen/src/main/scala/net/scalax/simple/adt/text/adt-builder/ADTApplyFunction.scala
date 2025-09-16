package net.scalax.simple.adt.text.v3

class ADTApplyFunction(val index: Int) {

  extension (list: Seq[String]) {
    def mkString(c: Char): String                      = list.mkString(c.toString)
    def mkString(c1: Char, c2: Char, c3: Char): String = list.mkString(c1.toString, c2.toString, c3.toString)
  }

  class TraitBody(val index: Int) {
    TraitBodySelf =>

    val typeParam1: Seq[String] = for (i1 <- 1 to index) yield s"T$i1"
    val typeParam2: Seq[String] = "Target1 >: Nothing" +: (for (i1 <- 2 to index) yield s"Target$i1 >: Target${i1 - 1}")
    val typeParam3: Seq[String] = for (i1 <- 1 to index) yield s"param$i1: T$i1 => Target$i1"
    val typeParam4: Seq[String] = s"TargetOther${index - 1}" +: (for (i1 <- 2 to index) yield s"T$i1")
    val typeParam5: Seq[String] = for (i1 <- 1 to index) yield s"apply(param$i1)"
    val typeParam9: Seq[String] = for (i1 <- 1 to index) yield s"param$i1"

    def typeParam6Impl(index: Int): String = if (index < TraitBodySelf.index) {
      s"""AdtCoProduct.UsePositive[T$index, ${typeParam6Impl(index + 1)}]"""
    } else {
      s"""AdtCoProduct.UseOne[T$index]"""
    }

    val typeParam6: String = typeParam6Impl(1)

    val typeParam10: Seq[String] = for (i1 <- 1 to index) yield s"implicit val paramImpl$i1 = param$i1"

    val text: String = s"""
      def adtApply$index[
        ${typeParam1.mkString(',')}
      ](param: $typeParam6): CoProduct$index[${typeParam1.mkString(',')}] =
        new CoProduct$index(fold = new ADTFoldApplyImpl$index[Nothing,  ${typeParam1.mkString(',')}] {

          override def value[${typeParam2.mkString(',')}](${typeParam3.mkString(',')}): Target$index = {
            ${typeParam10.mkString('\n')}
            ADTBuilderHelperImplicit.ForFetch[Target$index].inputHList(param)
          }
        }

      )
    """

  }

  val preTextContent: Seq[String] = for (i <- 1 to index) yield new TraitBody(i).text

  val text: String = s"""
    package net.scalax.simple.adt
    package instance
    package support

    object ADTApplyFunction {
      ${preTextContent.mkString('\n')}
    }
  """

}
