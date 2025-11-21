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
    // val typeParam11: Seq[String] = for (i1 <- index to (1, -1)) yield s".append[T$i1]"
    val typeParam12: Seq[String] = for (i1 <- 1 to index) yield s".headMapTo(param$i1).tail"
    val typeParam13: Seq[String] = for (i1 <- 1 to index) yield s"_ <: T"

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
            CoProduct${TraitBodySelf.index}.unsafeRun[TargetOther1](v1)
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

        def headOption: Option[T1] = AppendTail3.headOption(foldImpl)

        def headMapTo[U1](func: T1 => U1): CoProduct$index[U1, ${typeParam1.drop(1).mkString(',')}] = {
          val valueR = AppendTail3.mapHead(foldImpl)(func)
          new CoProduct$index[U1, ${typeParam1.drop(1).mkString(',')}](valueR)
        }

        def tail: CoProduct$index[${typeParam1.drop(1).mkString(',')}, T1] = {
          val valueR = AppendTail2.AppenderAdt.appendByDefault(foldImpl)
          new CoProduct$index[${typeParam1.drop(1).mkString(',')}, T1](valueR)
        }

        def fold[${typeParam2.mkString(',')}](${typeParam3.mkString(',')}): Target$index = {
          val v1 = FoldApplySelf${typeParam12.mkString("")}
          CoProduct$index.unsafeRun[Target$index](v1)
        }

        def fold$index[TargetOther${index}](param1: T1 => TargetOther${index}):
          ADTFoldApplyImpl${index - 1}[${typeParam4.mkString(',')}] = $typeParam6

      }

      object CoProduct$index {
        def unsafeRun[T](m: CoProduct$index[${typeParam13.mkString(',')}]): T = ADTBuilderHelperImplicit.NeedCoProduct[T].input(m.foldImpl)
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

      def headOption: Option[T1] = Some(foldImpl.value)

      def headMapTo[U1](func: T1 => U1): CoProduct1[U1] = {
        val valueR = new AdtCoProduct.UseOne[U1] {
          override val value: U1 = func(foldImpl.value)
        }
        new CoProduct1[U1](valueR)
      }

      def tail: CoProduct1[T1] = FoldApplySelf

      def fold[TargetOther0](param1: T1 => TargetOther0): TargetOther0 = {
        val v1 = FoldApplySelf.headMapTo(param1)
        CoProduct1.unsafeRun[TargetOther0](v1)
      }

      def fold1[TargetOther0](param1: T1 => TargetOther0): TargetOther0 = FoldApplySelf.fold(param1)

    }

    object CoProduct1 {
      def unsafeRun[T](m: CoProduct1[_ <: T]): T = ADTBuilderHelperImplicit.NeedCoProduct[T].input(m.foldImpl)
    }

    ${preTextContent.mkString('\n')}
  """

}
