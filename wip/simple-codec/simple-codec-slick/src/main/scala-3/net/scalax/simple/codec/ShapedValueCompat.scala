package net.scalax.simple.codec

import slick.lifted.{MappedProjection, ShapedValue, ToTuple}

import scala.reflect.ClassTag

object ShapedValueCompat {
  def mapToPro[T, U, Model: ClassTag](sv: ShapedValue[T, U], from: Model => U, to: U => Model): MappedProjection[Model] = {
    sv.<>[Model, Some[U]](f = to, g = from.andThen(Some.apply))
  }
}
