package net.scalax.simple.adt.text.v4

class NatAppender5SupportCodegen(val index: Int) {

  extension (list: Seq[String]) {
    def mkString(c: Char): String = list.mkString(c.toString)
  }

  class TraitBody(val index: Int) {

    val typeParam1: Seq[String]  = for (_ <- 1 to index) yield s"_"
    val typeParam3: Seq[String]  = for (i1 <- 1 to index) yield s"HListLike"
    val typeParam5: Seq[String]  = for (i1 <- 1 to index) yield s"T$i1[_]"
    val typeParam6: Seq[String]  = for (i1 <- 1 to index) yield s"AppendLike"
    val typeParam7: Seq[String]  = for (i1 <- 1 to index) yield s"HCollection$i1 <: HListLike"
    val typeParam8: Seq[String]  = for (i1 <- 1 to index) yield s"HCollection$i1"
    val typeParam9: Seq[String]  = for (i1 <- 1 to index) yield s"AppendLike[T$i1[U], HCollection$i1]"
    val typeParam13: Seq[String] = for (i1 <- 1 to index) yield s"T$i1[U]"
    val typeParam14: Seq[String] = for (i1 <- 1 to index) yield s"T$i1"

    val text: String = s"""
      def Support$index[
        M[${typeParam1.mkString(',')}],
        ${typeParam5.mkString(',')},
        ${typeParam7.mkString(',')}
      ](
        current: M[${typeParam8.mkString(',')}],
        simpleAppender: SimpleAppender${index}Positive[M],
        typeGen: SimpleProduct$index.TypeGen[M, ${typeParam14.mkString(',')}]
      ): NatNext1.Support$index[
        M,
        ${typeParam14.mkString(',')},
        ${typeParam3.mkString(',')},
        ${typeParam6.mkString(',')},
        ${typeParam8.mkString(',')}
      ] = {
        val current1 = current
        new NatNext1.Support$index[
          M,
          ${typeParam14.mkString(',')},
          ${typeParam3.mkString(',')},
          ${typeParam6.mkString(',')},
          ${typeParam8.mkString(',')}
        ] {
          SupportSelf =>

          override def current = current1

          override def next[U]: NatNext1.Support$index[
            M,
            ${typeParam14.mkString(',')},
            ${typeParam3.mkString(',')},
            ${typeParam6.mkString(',')},
            ${typeParam9.mkString(',')}
          ] = NatNext3Self.Impl1.Support$index[
            M,
            ${typeParam14.mkString(',')},
            ${typeParam9.mkString(',')}
          ](
            current = NatNext3Self.natNext2Helper.append$index[M, ${typeParam13.mkString(',')}, ${typeParam8.mkString(',')}](
              simpleAppender
            )(
              typeGen.gen[U],
              current1
            ),
            simpleAppender = simpleAppender,
            typeGen = typeGen
          )
        }
      }
    """

  }

  val preTextContent: Seq[String] = for (i <- 1 to index) yield new TraitBody(i).text

  val text: String = s"""
    package net.scalax.simple.adt
    package nat
    package support

    trait NatNext3[HListLike, AppendLike[_, _ <: HListLike] <: HListLike] {
      NatNext3Self =>

      def natNext2Helper: NatNext2Helper[HListLike, AppendLike]

      object Impl1 {
        ${preTextContent.mkString('\n')}
      }
    }
  """

}
