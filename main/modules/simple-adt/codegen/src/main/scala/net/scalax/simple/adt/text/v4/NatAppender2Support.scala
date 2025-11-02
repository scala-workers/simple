package net.scalax.simple.adt.text.v4

class NatAppender2SupportCodegen(val index: Int) {

  extension (list: Seq[String]) {
    def mkString(c: Char): String = list.mkString(c.toString)
  }

  class Param1Def(val index: Int) {

    val typeParam1: Seq[String] = for (i1 <- 1 to index) yield s"T$i1"

    val text: String = s"M[${typeParam1.mkString(',')}]"

  }

  class Param2Def(val index: Int) {

    val typeParam1: Seq[String] = for (i1 <- 1 to index) yield s"HCollection$i1"

    val text: String = s"M[${typeParam1.mkString(',')}]"

  }

  class TypeParamDef(val index: Int) {

    val typeParam2: Seq[String] = for (i1 <- 1 to index) yield s"T$i1"
    val typeParam3: Seq[String] = for (i1 <- 1 to index) yield s"HCollection$i1 <: HLLike$i1"

    val text: String = s"${typeParam2.mkString(',')}, ${typeParam3.mkString(',')}"

  }

  class ReturnTypeDef(val index: Int) {

    val typeParam5: Seq[String] = for (i1 <- 1 to index) yield s"APRHLLike$i1[T$i1, HCollection$i1]"

    val text: String = s"M[${typeParam5.mkString(',')}]"

  }

  class TraitBody(val index: Int) {

    val param1Def: Param1Def         = new Param1Def(index)
    val param2Def: Param2Def         = new Param2Def(index)
    val typeParamDef: TypeParamDef   = new TypeParamDef(index)
    val returnTypeDef: ReturnTypeDef = new ReturnTypeDef(index)

    val typeParam1: Seq[String] = for (_ <- 1 to index) yield s"_"
    val typeParam3: Seq[String] = for (i1 <- 1 to index) yield s"HLLike$i1"
    val typeParam4: Seq[String] = for (i1 <- 1 to index) yield s"APRHLLike$i1[_, _ <: HLLike$i1] <: HLLike$i1"
    val typeParam5: Seq[String] = for (index <- 1 to index) yield s"T$index"
    val typeParam6: Seq[String] = for (i1 <- 1 to index) yield s"APRHLLike$i1"
    val typeParam7: Seq[String] = for (i1 <- 1 to index) yield s"HCollection$i1 <: HLLike$i1"
    val typeParam8: Seq[String] = for (i1 <- 1 to index) yield s"HCollection$i1"

    val text: String = s"""
      trait Support$index[M[${typeParam1.mkString(',')}],
        HLLikeDefalut, APRHLLikeDefault[_, _ <: HLLikeDefalut] <: HLLikeDefalut,
        ${typeParam3.mkString(',')}, ${typeParam4.mkString(',')}]
      {
        SupportSelf =>

        def law: NatAppender1.Support${index + 1}[
          ({ type AUB[A, ${typeParam5.mkString(',')}] = A => M[${typeParam5.mkString(',')}] })#AUB,
          HLLikeDefalut, ${typeParam3.mkString(',')}, APRHLLikeDefault, ${typeParam6.mkString(',')}
        ] /* = new NatAppender1.Support${index + 1}[
          ({ type AUB[A, ${typeParam5.mkString(',')}] = A => M[${typeParam5.mkString(',')}] })#AUB,
          HLLikeDefalut, ${typeParam3.mkString(',')}, APRHLLikeDefault, ${typeParam6.mkString(',')}
        ] {
          override def append[IU, ${typeParam5.mkString(',')}, HCDefault <: HLLikeDefalut, ${typeParam7.mkString(',')}](p2: HCDefault => ${param2Def.text}): APRHLLikeDefault[IU, HCDefault] => ${returnTypeDef.text} = ???
        } */

        def append[HCDefault <: HLLikeDefalut, ${typeParamDef.text}](p2: HCDefault => ${param2Def.text}): APRHLLikeDefault[${param1Def.text}, HCDefault] => ${returnTypeDef.text} = SupportSelf.law.append[M[${typeParam5.mkString(',')}], ${typeParam5.mkString(',')}, HCDefault, ${typeParam8.mkString(',')}](p2)
      }
    """

  }

  val preTextContent: Seq[String] = for (i <- 1 to index) yield new TraitBody(i).text

  val text: String = s"""
    package net.scalax.simple.adt
    package nat
    package support

    object NatAppender2 {
      ${preTextContent.mkString('\n')}
    }
  """

}
