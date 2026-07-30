package net.scalax.simple.codec

import io.circe._
import io.circe.syntax._
import net.scalax.simple.codec.CirceGen.Pojo._
import net.scalax.simple.codec.to_list_generic.SingletonMap

object JsonObjectTest {

  object Value1 {
    implicit def in1: SingletonMap[Value1.type] = SingletonMap.instance(Value1)
  }

  def main(str: Array[String]): Unit = {
    println(Value1.asJson)
  }

}
