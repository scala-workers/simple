package net.scalax.simple.codec

import io.circe._
import io.circe.syntax._
import net.scalax.simple.codec.to_list_generic.{FillIdentity, ModelLink, PojoInstance}

trait CusType
case class CatNameTest6(id3: Int, str3: Option[String], uClass3: Option[CusType], name113: String, friends: List[CusType])

object CatNameTest6 {

  import CirceGen.Pojo._
  import EncoderGetter._

  type X1[T] = EncoderGetter[Encoder[T]]

  implicit val modelLinkPojo: ModelLink.Pojo[CatNameTest6] = ModelLink.Pojo[CatNameTest6].derived

  implicit def encoderInstance: PojoInstance[X1, CatNameTest6] = FillIdentity.Pojo[X1, CatNameTest6].derived

  def typeClassOpt: TypeClassOpt[CatNameTest6, Encoder] = TypeClassOpt.Pojo[CatNameTest6, Encoder].derived

  // implicit def codec1: Codec[CatNameTest6] = ???

}

object CatNameTes6EncoderInstance {

  final def main(args: Array[String]): Unit = {
    println(CatNameTest6.typeClassOpt)
    println(CatNameTest6.typeClassOpt.info.succeed)
    println(CatNameTest6.typeClassOpt.info.failed)
  }

}
