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
      .mapLabelled(_.copy(_.optValue)("nextValue"))
      .mapWithConfigFieldMapping(new ConfigFieldMapping {
        override def apply(fieldName: String): String = fieldName.toUpperCase
      })

  implicit def readerInstance: PojoInstance[ConfigReader, SampleConf] = FillIdentity.Pojo[ConfigReader, SampleConf].derived
  implicit def writerInstance: PojoInstance[ConfigWriter, SampleConf] = FillIdentity.Pojo[ConfigWriter, SampleConf].derived

  implicit val defaultValueInstance: DefaultValue.Pojo[SampleConf] = DefaultValue.pojo[SampleConf].derives

}

object Runner {
  import PureConfigUtils._

  def main(arr: Array[String]): Unit = {
    val value1: ConfigReader.Result[SampleConf] = ConfigSource.string("{ FOO: 2, BAR: two, NEXTVALUE: null }").load[SampleConf]
    println("=== Reader Start ===")
    println(value1)
    println("=== Reader End ===")
    println("=== Writer Start ===")
    println(for (t <- value1) yield ConfigWriter[SampleConf].to(t))
    println(for (t <- value1) yield ConfigWriter[SampleConf].to(t).render())
    println("=== Writer End ===")

    val ins = implicitly[DefaultValue.Pojo[SampleConf]].defaultValue
    println("=== DefaultValue Start ===")
    println(ins(_.foo))
    println(ins(_.bar))
    println(ins(_.optValue))
    println("=== DefaultValue End ===")

  }
}
