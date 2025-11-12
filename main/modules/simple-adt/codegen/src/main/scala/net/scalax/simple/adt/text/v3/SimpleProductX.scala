package net.scalax.simple.adt.text.v3

class SimpleProductX(val index: Int) {

  extension (list: Seq[String]) {
    def mkString(c: Char): String = list.mkString(c.toString)
  }

  class TypeGenTraitDef(val index: Int) {

    val typeParam1: Seq[String] = for (i1 <- 1 to index) yield s"N$i1[_]"
    val typeParam2: Seq[String] = for (_ <- 1 to index) yield s"_"
    val typeParam3: Seq[String] = for (i1 <- 1 to index) yield s"N$i1"

    val text: String = s"""
      trait TypeGen[M[${typeParam2.mkString(',')}], ${typeParam1.mkString(',')}] extends TypeGen$index[M, ${typeParam3.mkString(',')}]
    """

  }

  class SimpleAppender(val index: Int) {

    val typeParam1: Seq[String] = for (i1 <- 1 to index) yield s"N$i1[T]"
    val typeParam2: Seq[String] = for (_ <- 1 to index) yield s"_"
    val typeParam3: Seq[String] = for (i1 <- 1 to index) yield s"N$i1"

    val text: String = s"""
      trait SimpleAppender[M[${typeParam2.mkString(',')}]] extends SimpleAppender${index}Positive[M] with SimpleAppender${index}Zero[M]
    """

  }

  class AppenderTrait(val index: Int) {

    val typeParam1: Seq[String] = for (i1 <- 1 to index) yield s"N$i1[T]"
    val typeParam2: Seq[String] = for (_ <- 1 to index) yield s"_"
    val typeParam3: Seq[String] = for (i1 <- 1 to index) yield s"N$i1"
    val typeParam4: Seq[String] = for (i1 <- 1 to index) yield s"N$i1[_]"
    val typeParam5: Seq[String] = for (i1 <- 1 to index) yield s"F[N$i1]"

    val text: String = s"""
      trait ProductAdapter[F[_[_]]] {
        def append[M[${typeParam2.mkString(',')}], ${typeParam4.mkString(',')}]
          (typeGen: SimpleProduct$index.TypeGen[M, ${typeParam3.mkString(',')}], sAppender: SimpleProduct$index.SimpleAppender[M])
          : M[${typeParam5.mkString(',')}]
      }
    """

  }

  class TraitBody(val index: Int) {

    val typeGenTraitDef: TypeGenTraitDef = new TypeGenTraitDef(index)
    val simpleAppender: SimpleAppender   = new SimpleAppender(index)
    val appenderTrait: AppenderTrait     = new AppenderTrait(index)

    val typeParam1: Seq[String] = for (_ <- 1 to index) yield s"_"
    val typeParam2: Seq[String] = for (i1 <- 1 to index) yield s"N$i1[_]"
    val typeParam3: Seq[String] = for (i1 <- 1 to index) yield s"({ type TypeX[M1, _, _, _, _, _, _, _, _, _] = N$i1[M1] })#TypeX"

    val text: String = s"""
      object SimpleProduct$index {
        SimpleProduct${index}Self =>

        ${typeGenTraitDef.text}
        ${simpleAppender.text}
        ${appenderTrait.text}
      }
    """

  }

  val preTextContent: Seq[String] = for (i <- 1 to index) yield new TraitBody(i).text

  val text: String = s"""
    package net.scalax.simple.adt
    package nat
    package support

    ${preTextContent.mkString('\n')}
  """

}
