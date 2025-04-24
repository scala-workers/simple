package net.scalax.simple.codec

import io.circe._
import io.circe.syntax._
import net.scalax.simple.codec.to_list_generic.{FoldFGenerc, ModelLinkPojo, PojoInstance, SimpleProduct1, ToListByTheSameTypeGeneric}

case class CatNameTest3(id3: Int, str3: Option[String], uClass3: Option[Long], name113: String, friends: List[CatNameTest3])

object CatNameTest3 {
  implicit val deco2_1: ModelLinkPojo[CatNameTest3] = ModelLinkPojo[CatNameTest3].derived

  import CirceGeneric2._

  implicit val modelEncoder: PojoInstance[Encoder, CatNameTest3] = PojoInstance.derived
  implicit val modelDecoder: PojoInstance[Decoder, CatNameTest3] = PojoInstance.derived

  def names(model: PojoInstance[({ type M1[_] = String })#M1, CatNameTest3]): List[String] = {
    val ge = ToListByTheSameTypeGeneric[({ type U1[X[_]] = PojoInstance[X, CatNameTest3] })#U1].derived(
      FoldFGenerc[({ type U1[X[_]] = PojoInstance[X, CatNameTest3] })#U1].derived(
        SimpleProduct1[({ type U1[X[_]] = PojoInstance[X, CatNameTest3] })#U1]
          .derived(implicitly[ModelLinkPojo[CatNameTest3]].basedInstalled)
      )
    )

    ge.toListByTheSameType[String, List[String]](List.empty, (t1, t2) => t2 :: t1)(model)
  }
}

object CatNameTest3TestCase {

  import CirceGeneric2._

  val cat1: CatNameTest3 = CatNameTest3(
    id3 = 1257,
    str3 = Option("cat-b"),
    uClass3 = Option(3256),
    name113 = "HardCoreTest0032",
    friends = List.empty
  )

  val modelInstance: CatNameTest3 = CatNameTest3(
    id3 = 8594,
    str3 = Option("aaTest3"),
    uClass3 = Option.empty,
    name113 = "xxiwerwjkl",
    friends = List(cat1)
  )

  final def main(args: Array[String]): Unit = {
    println(modelInstance.asJson.spaces2)
    println(parser.parse(modelInstance.asJson.spaces2).flatMap(_.as[CatNameTest3]))

    val labelled1 = implicitly[ModelLinkPojo[CatNameTest3]].labelled.modelLabelled
    val labelled2 = labelled1.copy(_.name113)("name224")
    println(CatNameTest3.names(labelled1))
    println(CatNameTest3.names(labelled2))
    println(labelled1(_.name113))
    println(labelled2(_.name113))
    println(labelled1(_.id3))
    println(labelled2(_.id3))
    println(labelled1(_.friends))
    println(labelled2(_.friends))
  }

}
