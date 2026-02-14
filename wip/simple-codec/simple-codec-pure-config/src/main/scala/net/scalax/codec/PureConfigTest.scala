package net.scalax.simple.codec.pureconfig

import net.scalax.simple.codec.to_list_generic.{FillIdentity, ModelLinkPojo, PojoInstance}
import pureconfig._

case class SampleConf(foo: Int, bar: String, optValue: Option[SampleConf])

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

}

object Runner {
  import PureConfigUtils._

  def main(arr: Array[String]): Unit = {
    println(ConfigSource.string("{ FOO: 2, BAR: two, NEXTVALUE: null }").load[SampleConf])
  }
}
