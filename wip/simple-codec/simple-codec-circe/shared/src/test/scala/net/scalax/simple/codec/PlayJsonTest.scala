package net.scalax.simple.codec

import play.api.libs.json._
import net.scalax.simple.codec.to_list_generic.{FillIdentity, ModelLink, PojoInstance}

case class CatNameTest5(
  id5: Int,
  str5: Option[String],
  uClass5: Option[Long],
  name115: String,
  friends: List[CatNameTest5]
)

object CatNameTest5 {

  implicit val modelLinkPojo: ModelLink.Pojo[CatNameTest5] = ModelLink.Pojo[CatNameTest5].derived

  implicit val jsonLabelled: SimpleJsonCodecLabelled.Pojo[CatNameTest5] = SimpleJsonCodecLabelled.Pojo[CatNameTest5].derived

  import PlayJsonGeneric.Pojo._
  implicit val modelWrites: FillIdentity.Pojo[Writes, CatNameTest5] = FillIdentity.Pojo[Writes, CatNameTest5].derived

}

object PlayJsonTest {

  import PlayJsonGeneric.Pojo._

  val friend2: CatNameTest5 = CatNameTest5(
    id5 = 8594,
    str5 = Option("aaTest3"),
    uClass5 = Option.empty,
    name115 = "xxiwerwjkl",
    friends = List.empty
  )
  val friend1: CatNameTest5 = CatNameTest5(
    id5 = 8594,
    str5 = Option("aaTest3"),
    uClass5 = Option.empty,
    name115 = "xxiwerwjkl",
    friends = List(friend2)
  )
  val modelInstance: CatNameTest5 = CatNameTest5(
    id5 = 8594,
    str5 = Option("aaTest3"),
    uClass5 = Option.empty,
    name115 = "xxiwerwjkl",
    friends = List(friend1, friend2)
  )

  final def main(args: Array[String]): Unit = {
    println(Json.toJson(modelInstance))
  }

}
