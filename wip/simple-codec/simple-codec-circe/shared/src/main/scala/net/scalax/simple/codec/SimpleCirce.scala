package net.scalax.simple
package codec

import io.circe.generic.extras.JsonKey
import net.scalax.simple.adt.nat.support.v5.AppenderSupport1
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
  class Impl[F[_[_]]: AppenderSupport1.Simple2.Runner: SimpleProduct3.ProductAdapter](
    override val labelledValueFunc: F[({ type Str[_] = String })#Str] => F[({ type Str[_] = String })#Str],
    override val defaultValue: Option[F[({ type OptF[U1] = Option[() => U1] })#OptF]]
  ) extends SimpleJsonLabelled[F] { ImplSelf =>
    override def annotationsLabelled(implicit ann: ModelAnnotations[F, JsonKey]): SimpleJsonLabelled[F] = {
      val zipGeneric: ZipGeneric[F] = ZipGeneric[F].derived(implicitly[SimpleProduct3.ProductAdapter[F]])
      val mapGenerc: MapGenerc[F]   = MapGenerc[F].derived(implicitly[AppenderSupport1.Simple2.Runner[F]])

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
    implicit def sp3: SimpleProduct3.ProductAdapter[U1]   = spx.basedInstalled.simpleProduct3
    implicit def sp2: AppenderSupport1.Simple2.Runner[U1] = spx.simpleRunner.simpleRunner2

    new SimpleJsonLabelledSelf.Impl[U1](labelledValueFunc = identity[U1[({ type Str[_] = String })#Str]], defaultValue = Option.empty)
  }

  type Pojo[Model] = SimpleJsonLabelled[({ type U1[Xu[_]] = PojoInstance[Xu, Model] })#U1]
  def pojo[Model](implicit
    spx: BasedInstalledSimpleProduct[({ type U1[Xu[_]] = PojoInstance[Xu, Model] })#U1]
  ): SimpleJsonLabelled[({ type U1[Xu[_]] = PojoInstance[Xu, Model] })#U1] =
    SimpleJsonLabelledSelf.F[({ type U1[Xu[_]] = PojoInstance[Xu, Model] })#U1]
}
