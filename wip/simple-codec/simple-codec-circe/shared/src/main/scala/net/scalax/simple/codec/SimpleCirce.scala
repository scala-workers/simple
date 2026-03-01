package net.scalax.simple
package codec

import io.circe.generic.extras.JsonKey
import net.scalax.simple.adt.nat.support.{SimpleProduct2, SimpleProduct3, SimpleProductContextX}
import net.scalax.simple.codec.to_list_generic.{BasedInstalledSimpleProduct, PojoInstance}

trait SimpleJsonLabelled[F[_[_]]] {
  SimpleJsonEncodeLabelledSelf =>

  def annotationsLabelled(implicit ann: ModelAnnotations[F, JsonKey]): SimpleJsonLabelled[F]
  def labelledValueFunc: F[({ type Str[_] = String })#Str] => F[({ type Str[_] = String })#Str]
  def defaultValue: Option[F[({ type OptF[U1] = Option[() => U1] })#OptF]]
  def useDefaultValue(initFunc: F[({ type OptF[U1] = Option[() => U1] })#OptF] => F[({ type OptF[U1] = Option[() => U1] })#OptF])(implicit
    defaultValue: DefaultValue[F]
  ): SimpleJsonLabelled[F]
  def mapLabelled(func: F[({ type Str[_] = String })#Str] => F[({ type Str[_] = String })#Str]): SimpleJsonLabelled[F]
}

object SimpleJsonLabelled { SimpleJsonLabelledSelf =>
  class Impl[F[_[_]]: SimpleProduct2.ProductAdapter: SimpleProduct3.ProductAdapter](
    override val labelledValueFunc: F[({ type Str[_] = String })#Str] => F[({ type Str[_] = String })#Str],
    override val defaultValue: Option[F[({ type OptF[U1] = Option[() => U1] })#OptF]]
  ) extends SimpleJsonLabelled[F] { ImplSelf =>
    override def annotationsLabelled(implicit ann: ModelAnnotations[F, JsonKey]): SimpleJsonLabelled[F] = {
      val zipGeneric: ZipGeneric[F] = ZipGeneric[F].derived(implicitly[SimpleProduct3.ProductAdapter[F]])
      val mapGenerc: MapGenerc[F]   = MapGenerc[F].derived(implicitly[SimpleProduct2.ProductAdapter[F]])

      type Type1[T] = String
      type Type2[T] = Option[JsonKey]
      type Type3[T] = (String, Option[JsonKey])

      ImplSelf.mapLabelled((m1: F[Type1]) => {
        val zipModel: F[Type3] = zipGeneric.zip[Type1, Type2](m1, ann.annInstance)

        val mapIns: MapGenerc.MapFunction[Type3, Type1] = new MapGenerc.MapFunction[Type3, Type1] {
          override def map[X1](in: (String, Option[JsonKey])): Type1[X1] = {
            val (oldName, annNameOpt) = in
            annNameOpt.fold[String](oldName)(t => t.value)
          }
        }

        mapGenerc.map[Type3, Type1](mapIns)(zipModel)
      })
    }

    override def useDefaultValue(
      initFunc: F[({ type OptF[U1] = Option[() => U1] })#OptF] => F[({ type OptF[U1] = Option[() => U1] })#OptF]
    )(implicit
      defaultValue: DefaultValue[F]
    ): SimpleJsonLabelled[F] = new SimpleJsonLabelled.Impl[F](
      labelledValueFunc = ImplSelf.labelledValueFunc,
      defaultValue = Some(initFunc(defaultValue.defaultValueFunction1))
    )

    override def mapLabelled(func: F[({ type Str[_] = String })#Str] => F[({ type Str[_] = String })#Str]): SimpleJsonLabelled[F] =
      new SimpleJsonLabelled.Impl[F](
        labelledValueFunc = (in: F[({ type Str[_] = String })#Str]) => func(ImplSelf.labelledValueFunc(in)),
        defaultValue = ImplSelf.defaultValue
      )
  }

  type F[U1[_[_]]] = SimpleJsonLabelled[U1]
  def F[U1[_[_]]](implicit spx: BasedInstalledSimpleProduct[U1]): SimpleJsonLabelled[U1] = {
    implicit def sp3: SimpleProduct3.ProductAdapter[U1] = spx.basedInstalled.simpleProduct3
    implicit def sp2: SimpleProduct2.ProductAdapter[U1] = spx.basedInstalled.simpleProduct2

    new SimpleJsonLabelledSelf.Impl[U1](labelledValueFunc = identity[U1[({ type Str[_] = String })#Str]], defaultValue = Option.empty)
  }

  type Pojo[Model] = SimpleJsonLabelled[({ type U1[Xu[_]] = PojoInstance[Xu, Model] })#U1]
  def pojo[Model](implicit
    spx: BasedInstalledSimpleProduct[({ type U1[Xu[_]] = PojoInstance[Xu, Model] })#U1]
  ): SimpleJsonLabelled[({ type U1[Xu[_]] = PojoInstance[Xu, Model] })#U1] =
    SimpleJsonLabelledSelf.F[({ type U1[Xu[_]] = PojoInstance[Xu, Model] })#U1]
}

/*trait SimpleJsonDecodeLabelled[F[_[_]]] {
  SimpleJsonDecodeLabelledSelf =>

  def jsonDecodeLabelled: F[({ type NamedF[_] = String })#NamedF]

  def decode: SimpleJsonCodecLabelled.Updater[F[({ type NamedF[_] = String })#NamedF], SimpleJsonDecodeLabelled[F]] =
    new SimpleJsonCodecLabelled.Updater[F[({ type NamedF[_] = String })#NamedF], SimpleJsonDecodeLabelled[F]] {
      override def update(
        m: F[({ type NamedF[_] = String })#NamedF] => F[({ type NamedF[_] = String })#NamedF]
      ): SimpleJsonDecodeLabelled[F] = new SimpleJsonDecodeLabelled[F] {
        override def jsonDecodeLabelled: F[({ type NamedF[_] = String })#NamedF] = m(SimpleJsonDecodeLabelledSelf.jsonDecodeLabelled)
      }
    }
}

trait SimpleJsonCodecLabelled[F[_[_]]] extends SimpleJsonEncodeLabelled[F] with SimpleJsonDecodeLabelled[F] {
  SimpleJsonCodecLabelledSelf =>

  override def jsonEncodeLabelled: F[({ type NamedF[_] = String })#NamedF]
  override def jsonDecodeLabelled: F[({ type NamedF[_] = String })#NamedF]

  override def encode: SimpleJsonCodecLabelled.Updater[F[({ type NamedF[_] = String })#NamedF], SimpleJsonCodecLabelled[F]] =
    new SimpleJsonCodecLabelled.Updater[F[({ type NamedF[_] = String })#NamedF], SimpleJsonCodecLabelled[F]] {
      override def update(
        m: F[({ type NamedF[_] = String })#NamedF] => F[({ type NamedF[_] = String })#NamedF]
      ): SimpleJsonCodecLabelled[F] = new SimpleJsonCodecLabelled[F] {
        override def jsonEncodeLabelled: F[({ type NamedF[_] = String })#NamedF] = m(SimpleJsonCodecLabelledSelf.jsonEncodeLabelled)
        override def jsonDecodeLabelled: F[({ type NamedF[_] = String })#NamedF] = SimpleJsonCodecLabelledSelf.jsonDecodeLabelled
      }
    }

  override def decode: SimpleJsonCodecLabelled.Updater[F[({ type NamedF[_] = String })#NamedF], SimpleJsonCodecLabelled[F]] =
    new SimpleJsonCodecLabelled.Updater[F[({ type NamedF[_] = String })#NamedF], SimpleJsonCodecLabelled[F]] {
      override def update(
        m: F[({ type NamedF[_] = String })#NamedF] => F[({ type NamedF[_] = String })#NamedF]
      ): SimpleJsonCodecLabelled[F] = new SimpleJsonCodecLabelled[F] {
        override def jsonEncodeLabelled: F[({ type NamedF[_] = String })#NamedF] = m(SimpleJsonCodecLabelledSelf.jsonEncodeLabelled)
        override def jsonDecodeLabelled: F[({ type NamedF[_] = String })#NamedF] = SimpleJsonCodecLabelledSelf.jsonDecodeLabelled
      }
    }

  def codec: SimpleJsonCodecLabelled.Updater[F[({ type NamedF[_] = String })#NamedF], SimpleJsonCodecLabelled[F]] =
    new SimpleJsonCodecLabelled.Updater[F[({ type NamedF[_] = String })#NamedF], SimpleJsonCodecLabelled[F]] {
      override def update(
        m: F[({ type NamedF[_] = String })#NamedF] => F[({ type NamedF[_] = String })#NamedF]
      ): SimpleJsonCodecLabelled[F] = new SimpleJsonCodecLabelled[F] {
        override def jsonEncodeLabelled: F[({ type NamedF[_] = String })#NamedF] = m(SimpleJsonCodecLabelledSelf.jsonEncodeLabelled)
        override def jsonDecodeLabelled: F[({ type NamedF[_] = String })#NamedF] = m(SimpleJsonCodecLabelledSelf.jsonDecodeLabelled)
      }
    }
}

object SimpleJsonCodecLabelled {

  trait Updater[T, +U] {
    def update(m: T => T): U
  }

  class Builder[F[_[_]]] {
    type Target = SimpleJsonCodecLabelled[F]

    def derived(implicit bi: BasedInstalledLabelled[F]): SimpleJsonCodecLabelled[F] = new SimpleJsonCodecLabelled[F] {
      override def jsonEncodeLabelled: F[({ type NamedF[_] = String })#NamedF] = bi.labelled.stringLabelled
      override def jsonDecodeLabelled: F[({ type NamedF[_] = String })#NamedF] = bi.labelled.stringLabelled
    }

    def implicitly(implicit nModel: F[({ type NamedF[_] = String })#NamedF]): SimpleJsonCodecLabelled[F] = new SimpleJsonCodecLabelled[F] {
      override def jsonEncodeLabelled: F[({ type NamedF[_] = String })#NamedF] = nModel
      override def jsonDecodeLabelled: F[({ type NamedF[_] = String })#NamedF] = nModel
    }
  }

  type F[F[_[_]]] = SimpleJsonCodecLabelled[F]

  object F {
    def apply[ModelF[_[_]]]: Builder[ModelF] = new Builder[ModelF]
  }

}

trait SimpleJsonCodecLabelledPojo[Model] extends SimpleJsonCodecLabelled[({ type TR[UMF[_]] = PojoInstance[UMF, Model] })#TR] {
  PojoSelf =>

  override def encode
    : SimpleJsonCodecLabelled.Updater[PojoInstance[({ type NamedF[_] = String })#NamedF, Model], SimpleJsonCodecLabelledPojo[
      Model
    ]] =
    new SimpleJsonCodecLabelled.Updater[PojoInstance[({ type NamedF[_] = String })#NamedF, Model], SimpleJsonCodecLabelledPojo[Model]] {
      override def update(
        m: PojoInstance[({ type NamedF[_] = String })#NamedF, Model] => PojoInstance[({ type NamedF[_] = String })#NamedF, Model]
      ): SimpleJsonCodecLabelledPojo[Model] = new SimpleJsonCodecLabelledPojo[Model] {
        override def jsonEncodeLabelled: PojoInstance[({ type NamedF[_] = String })#NamedF, Model] = m(PojoSelf.jsonEncodeLabelled)
        override def jsonDecodeLabelled: PojoInstance[({ type NamedF[_] = String })#NamedF, Model] = PojoSelf.jsonDecodeLabelled
      }
    }

  override def decode
    : SimpleJsonCodecLabelled.Updater[PojoInstance[({ type NamedF[_] = String })#NamedF, Model], SimpleJsonCodecLabelledPojo[
      Model
    ]] =
    new SimpleJsonCodecLabelled.Updater[PojoInstance[({ type NamedF[_] = String })#NamedF, Model], SimpleJsonCodecLabelledPojo[Model]] {
      override def update(
        m: PojoInstance[({ type NamedF[_] = String })#NamedF, Model] => PojoInstance[({ type NamedF[_] = String })#NamedF, Model]
      ): SimpleJsonCodecLabelledPojo[Model] = new SimpleJsonCodecLabelledPojo[Model] {
        override def jsonEncodeLabelled: PojoInstance[({ type NamedF[_] = String })#NamedF, Model] = m(PojoSelf.jsonEncodeLabelled)
        override def jsonDecodeLabelled: PojoInstance[({ type NamedF[_] = String })#NamedF, Model] = PojoSelf.jsonDecodeLabelled
      }
    }

  override def codec
    : SimpleJsonCodecLabelled.Updater[PojoInstance[({ type NamedF[_] = String })#NamedF, Model], SimpleJsonCodecLabelledPojo[Model]] =
    new SimpleJsonCodecLabelled.Updater[PojoInstance[({ type NamedF[_] = String })#NamedF, Model], SimpleJsonCodecLabelledPojo[Model]] {
      override def update(
        m: PojoInstance[({ type NamedF[_] = String })#NamedF, Model] => PojoInstance[({ type NamedF[_] = String })#NamedF, Model]
      ): SimpleJsonCodecLabelledPojo[Model] = new SimpleJsonCodecLabelledPojo[Model] {
        override def jsonEncodeLabelled: PojoInstance[({ type NamedF[_] = String })#NamedF, Model] = m(PojoSelf.jsonEncodeLabelled)
        override def jsonDecodeLabelled: PojoInstance[({ type NamedF[_] = String })#NamedF, Model] = m(PojoSelf.jsonDecodeLabelled)
      }
    }
}

object SimpleJsonCodecLabelledPojo {
  def derived[Model](implicit
    blabelled: BasedInstalledLabelled[({ type TR[UMF[_]] = PojoInstance[UMF, Model] })#TR]
  ): SimpleJsonCodecLabelledPojo[Model] =
    new SimpleJsonCodecLabelledPojo[Model] {
      override def jsonEncodeLabelled: PojoInstance[({ type NamedF[_] = String })#NamedF, Model] = blabelled.labelled.stringLabelled
      override def jsonDecodeLabelled: PojoInstance[({ type NamedF[_] = String })#NamedF, Model] = blabelled.labelled.stringLabelled
    }
}*/
