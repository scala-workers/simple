package net.scalax.simple.adt.text.v5

class NatAppender5Support(val index: Int) {

  extension (list: Seq[String]) {
    def mkString(c: Char): String = list.mkString(c.toString)
  }

  class TypeGenTrait(val index: Int) {

    val typeParam1: Seq[String] = for (i1 <- 1 to index) yield s"N$i1"

    val text: String = s"""
      def typeGen: Type10Gen$index[M, ${typeParam1.mkString(',')}]
    """

  }

  class TraitDef(val index: Int) {

    val typeParam2: Seq[String] = for (i1 <- 1 to index) yield s"HCollection$i1"
    val typeParam3: Seq[String] =
      for (i1 <- 1 to index)
        yield s"APRHLLike$i1[N$i1[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], HCollection$i1]"
    val typeParam8: Seq[String] = for (i1 <- 1 to index) yield s"HCollection$i1 <: HLLike$i1"

    val text: String = s"""
      def append10[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10, ${typeParam8.mkString(',')}](
        p1: M[${typeParam2.mkString(',')}]): M[${typeParam3.mkString(',')}] =
        Parameter10NatSupport${index}Self.content.append(Parameter10NatSupport${index}Self.typeGen.gen10[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10], p1)
    """

  }

  class TraitContentDef(val index: Int) {

    val typeParam1: Seq[String] = for (i1 <- 1 to index) yield s"HLLike$i1"
    val typeParam4: Seq[String] = for (i1 <- 1 to index) yield s"APRHLLike$i1"

    val text: String = s"""
      def content: AppenderNatSupport$index[M, ${typeParam1.mkString(',')}, ${typeParam4.mkString(',')}]
    """

  }

  class SimpleProductXBody(val index: Int) {

    val traitDef: TraitDef               = new TraitDef(index)
    val traitContentDef: TraitContentDef = new TraitContentDef(index)
    val typeGenTrait: TypeGenTrait       = new TypeGenTrait(index)

    val typeParam1: Seq[String]  = for (_ <- 1 to index) yield s"_"
    val typeParam3: Seq[String]  = for (i1 <- 1 to index) yield s"N$i1[_]"
    val typeParam4: Seq[String]  = for (i1 <- 1 to index) yield s"N$i1"
    val typeParam5: Seq[String]  = for (i1 <- 1 to index) yield s"N$i1[T]"
    val typeParam6: Seq[String]  = for (i1 <- 1 to index) yield s"({ type NXX[_] = N$i1[T] })#NXX"
    val typeParam7: Seq[String]  = for (i1 <- 1 to index) yield s"TPF[({ type NXX[_] = N$i1[T] })#NXX]"
    val typeParam8: Seq[String]  = for (i1 <- 1 to index) yield s"abc$i1: net.scalax.simple.adt.nat.support.ABCFunc[N$i1[T], B$i1, C$i1]"
    val typeParam9: Seq[String]  = for (i1 <- 1 to index) yield s"B$i1"
    val typeParam10: Seq[String] = for (i1 <- 1 to index) yield s"C$i1"
    val typeParam11: Seq[String] = for (i1 <- 1 to index) yield s"abc$i1"

    val text: String = s"""
      override def simpleRunner$index: AppenderSupport1.Simple$index.Runner[TPF] = new AppenderSupport1.Simple$index.Runner[TPF] {
        override def append[M[${typeParam1.mkString(',')}], ${typeParam3.mkString(',')}]
          (
            sAppender: AppenderSupport1.Simple$index.Appender[M, ${typeParam4.mkString(',')}],
            sZero: AppenderSupport1.Simple$index.Zero[M])
          : M[${typeParam7.mkString(',')}] =
            spc.simpleRunner$index.append[M, ${typeParam6.mkString(',')}](
              new AppenderSupport1.Simple$index.Appender[M, ${typeParam6.mkString(',')}] {
                override def append[
                  U1,
                  ${typeParam9.mkString(',')},
                  ${typeParam10.mkString(',')}
                ](
                  ${typeParam8.mkString(',')},
                  ma: M[${typeParam9.mkString(',')}]
                ): M[${typeParam10.mkString(',')}] = sAppender.append[
                  T,
                  ${typeParam9.mkString(',')},
                  ${typeParam10.mkString(',')}
                ](${typeParam11.mkString(',')}, ma)
              },
              sZero
            )
      }
    """

  }

  val preTextContent: Seq[String] = for (i <- 1 to index) yield new SimpleProductXBody(i).text

  val text: String = s"""
    package net.scalax.simple.adt
    package nat
    package support
    package v5

    object SimpleRunnerIt10Codengen {
      SimpleRunnerIt10Codengen =>

      def toItera[F[_[_]], T](spc: AppenderSupport4[F]): AppenderSupport4[({ type TPF[MXX[_]] = F[({ type XUU[_] = MXX[T] })#XUU] })#TPF] = {
        type TPF[MXX[_]] = F[({ type XUU[_] = MXX[T] })#XUU]
        new AppenderSupport4[TPF] {
          ${preTextContent.mkString('\n')}
        }
      }

    }
  """

}
