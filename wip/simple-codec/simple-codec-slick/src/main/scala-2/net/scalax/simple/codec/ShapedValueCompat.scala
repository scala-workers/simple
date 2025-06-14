package net.scalax.simple.codec

import slick.lifted.{MappedProjection, ShapedValue}

import scala.reflect.ClassTag

object ShapedValueCompat {
  def mapToPro[T, U, Model: ClassTag](sv: ShapedValue[T, U], from: Model => U, to: U => Model): MappedProjection[Model] = {
    sv.<>[Model](f = to, g = from.andThen(Some.apply))
  }
}
