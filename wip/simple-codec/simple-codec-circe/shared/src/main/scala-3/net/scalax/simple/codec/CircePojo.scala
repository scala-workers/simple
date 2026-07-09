package net.scalax.simple.codec
package simplecirce

import net.scalax.simple.codec.to_list_generic.{FillIdentity, PojoInstance}
import io.circe.Encoder

object CircePojo {

  import shapeless3.deriving.*

  type SimpleEncoder[T] = PojoInstance[Encoder, T]
  object SimpleEncoder {
    def derived[Model](using
      g: scala.deriving.Mirror.ProductOf[Model],
      inst: K0.ProductInstances[FillIdentity, Tuple.Map[g.MirroredElemTypes, Encoder]]
    ): SimpleEncoder[Model] = FillIdentity.Pojo[Encoder, Model].derived
  }

}
