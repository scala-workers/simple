package net.scalax.simple.codec

import slick.lifted.{MappedProjection, ShapedValue, ToTuple}

object ShapedValueCompat {
  def mapToPro[T, U, Model](
    sv: ShapedValue[T, U],
    from: Model => U,
    to: U => Model,
    csTag: scala.reflect.ClassTag[Model]
  ): MappedProjection[Model] = {
    sv.<>[Model, Some[U]](f = to, g = from.andThen(Some.apply))(using csTag)
  }
}
