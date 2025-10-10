package net.scalax.simple.adt.text.v3

class ADTTraitBuilder(val index: Int) {

  extension (list: Seq[String]) {
    def mkString(c: Char): String                      = list.mkString(c.toString)
    def mkString(c1: Char, c2: Char, c3: Char): String = list.mkString(c1.toString, c2.toString, c3.toString)
  }

  class TraitBody(val index: Int) {
    TraitBodySelf =>

    val typeParam1: Seq[String]  = for (i1 <- 1 to index) yield s"T$i1"
    val typeParam2: Seq[String]  = "Target1" +: (for (i1 <- 2 to index) yield s"Target$i1 >: Target${i1 - 1}")
    val typeParam3: Seq[String]  = for (i1 <- 1 to index) yield s"param$i1: T$i1 => Target$i1"
    val typeParam4: Seq[String]  = s"TargetOther$index" +: (for (i1 <- 2 to index) yield s"T$i1")
    val typeParam5: Seq[String]  = for (i1 <- 1 to index) yield s"apply(param$i1)"
    val typeParam9: Seq[String]  = for (i1 <- 1 to index) yield s"param$i1"
    val typeParam10: Seq[String] = for (i1 <- 1 to index) yield s"implicit val paramImpl$i1 = param$i1"
    val typeParam11: Seq[String] = for (i1 <- index to (1, -1)) yield s".append[T$i1]"
    val typeParam12: Seq[String] = for (i1 <- 1 to index) yield s".foldLeft(param$i1)"

    def typeParam6Impl(index: Int): String = if (index > 1) {
      val typeParam7: Seq[String] =
        s"TargetOther${index + 1}" +: (for (i1 <- (TraitBodySelf.index - index) + 1 to TraitBodySelf.index) yield s"T$i1")
      val typeParam8: Seq[String] =
        s"TargetOther$index" +: (for i1 <- (TraitBodySelf.index - index) + 2 to TraitBodySelf.index yield s"T$i1")

      s"""
        new ADTFoldApplyImpl$index[${typeParam7.mkString(',')}] {
          override def fold$index[TargetOther$index >: TargetOther${index + 1}](param${(TraitBodySelf.index - index) + 1}: T${(TraitBodySelf.index - index) + 1} => TargetOther$index): ADTFoldApplyImpl${index - 1}[${typeParam8
          .mkString(',')}] = ${typeParam6Impl(index - 1)}
        }
      """
    } else {
      s"""
        new ADTFoldApplyImpl1[TargetOther2, T${TraitBodySelf.index}] {
          override def fold1[TargetOther1 >: TargetOther2](param${TraitBodySelf.index}: T${TraitBodySelf.index} => TargetOther1): TargetOther1 = {
            val v1 = FoldApplySelf${typeParam12.mkString("")}
            ADTBuilderHelperImplicit.NeedCoProduct[TargetOther1].input(v1.foldImpl)
          }
        }
      """
    }

    val typeParam6: String = typeParam6Impl(index - 1)

    def typeParam7Impl(index: Int): String = if (index < TraitBodySelf.index) {
      s"""AdtCoProduct.UsePositive[T$index, ${typeParam7Impl(index + 1)}]"""
    } else {
      s"""AdtCoProduct.UseOne[T$index]"""
    }

    val typeParam7: String = typeParam7Impl(1)

    val text: String = s"""
      trait ADTFoldApplyImpl$index[
        Target0,
        ${typeParam1.mkString(',')}
      ] {
        FoldApplySelf =>

        def fold$index[TargetOther$index >: Target0](param1: T1 => TargetOther$index):
          ADTFoldApplyImpl${index - 1}[${typeParam4.mkString(',')}]
      }

      class CoProduct$index[${typeParam1.mkString(',')}](private val foldImpl: $typeParam7) {
        FoldApplySelf =>

        def foldLeft[TargetOther0](param: T1 => TargetOther0): CoProduct$index[${typeParam1.drop(1).mkString(',')}, TargetOther0] = {
          val appendSupport = AppendTail.zero${typeParam11.drop(1).dropRight(1).mkString("")}
          val valueR = appendSupport.appendWithFunction[T1, T$index, TargetOther0](foldImpl, param)
          new CoProduct$index[${typeParam1.drop(1).mkString(',')}, TargetOther0](valueR)
        }

        def fold[${typeParam2.mkString(',')}](${typeParam3.mkString(',')}): Target$index = {
          val v1 = FoldApplySelf${typeParam12.mkString("")}
          ADTBuilderHelperImplicit.NeedCoProduct[Target$index].input(v1.foldImpl)
        }

        def fold$index[TargetOther${index}](param1: T1 => TargetOther${index}):
          ADTFoldApplyImpl${index - 1}[${typeParam4.mkString(',')}] = $typeParam6
      }
    """

  }

  val preTextContent: Seq[String] = for (i <- 2 to index) yield new TraitBody(i).text

  val text: String = s"""
    package net.scalax.simple.adt
    package instance
    package support

    trait ADTFoldApplyImpl1[Target0, T1] {
      FoldApplySelf =>

      def fold1[TargetOther0 >: Target0](param1: T1 => TargetOther0): TargetOther0
    }

    class CoProduct1[T1](private val foldImpl: AdtCoProduct.UseOne[T1]) {
      FoldApplySelf =>

      def foldLeft[TargetOther0](param1: T1 => TargetOther0): CoProduct1[TargetOther0] = {
        new CoProduct1[TargetOther0](new AdtCoProduct.UseOne(param1(foldImpl.value)))
      }

      def fold[TargetOther0](param1: T1 => TargetOther0): TargetOther0 = {
        implicit val paramImpl1 = param1
        ADTBuilderHelperImplicit.ForFetch[TargetOther0].inputHList(foldImpl)
      }

      def fold1[TargetOther0](param1: T1 => TargetOther0): TargetOther0 = {
        fold(param1)
      }

    }

    ${preTextContent.mkString('\n')}
  """

}
