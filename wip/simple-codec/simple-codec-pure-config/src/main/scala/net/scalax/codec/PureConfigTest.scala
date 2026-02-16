package net.scalax.simple.codec.pureconfig

import net.scalax.simple.codec.DefaultValue
import net.scalax.simple.codec.to_list_generic.{FillIdentity, ModelLinkPojo, PojoInstance}
import pureconfig._

case class SampleConf(foo: Int = 22, bar: String = "333", optValue: Option[SampleConf])

object SampleConf {

  implicit val modelLinkPojo: ModelLinkPojo[SampleConf] = ModelLinkPojo.derived

  import PureConfigUtils._
  implicit val pureConfigNamed: PureConfigLabelled.Pojo[SampleConf] =
    PureConfigLabelled
      .pojo[SampleConf]
      .default
      .map(_.copy(_.optValue)("nextValue"))
      .mapWithConfigFieldMapping(new ConfigFieldMapping {
        override def apply(fieldName: String): String = fieldName.toUpperCase
      })
  implicit def encoderInstance: PojoInstance[ConfigReader, SampleConf] = FillIdentity.Pojo[ConfigReader, SampleConf].derived

  implicit val defaultValueInstance: DefaultValue[SampleConf] = DefaultValue[SampleConf].derives

}

object Runner {
  import PureConfigUtils._

  def main(arr: Array[String]): Unit = {
    println(ConfigSource.string("{ FOO: 2, BAR: two, NEXTVALUE: null }").load[SampleConf])

    val ins = implicitly[DefaultValue[SampleConf]].defaultValue
    println("=== DefaultValue Start ===")
    println(ins(_.foo))
    println(ins(_.bar))
    println(ins(_.optValue))
    println("=== DefaultValue Start ===")
  }
}
