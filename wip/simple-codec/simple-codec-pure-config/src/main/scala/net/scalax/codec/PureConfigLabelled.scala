package net.scalax.simple.codec.pureconfig

import net.scalax.simple.codec.{DefaultValue, MapGenerc}
import net.scalax.simple.codec.to_list_generic.{BasedInstalledSimpleProduct, PojoInstance}
import pureconfig._

trait PureConfigLabelled[F[_[_]]] {
  PureConfigLabelledSelf =>

  def labelledValueFunc: F[({ type Str[_] = String })#Str] => F[({ type Str[_] = String })#Str]
  def defaultValue: Option[F[({ type OptF[U1] = Option[() => U1] })#OptF]]
  def useDefaultValue(initFunc: F[({ type OptF[U1] = Option[() => U1] })#OptF] => F[({ type OptF[U1] = Option[() => U1] })#OptF])(implicit
    defaultValue: DefaultValue[F]
  ): PureConfigLabelled[F]
  def mapLabelled(func: F[({ type Str[_] = String })#Str] => F[({ type Str[_] = String })#Str]): PureConfigLabelled[F]
  def mapWithConfigFieldMapping(c: ConfigFieldMapping): PureConfigLabelled[F]
}

object PureConfigLabelled { PureConfigLabelledSelf =>
  class Impl[F[_[_]]](
    override val labelledValueFunc: F[({ type Str[_] = String })#Str] => F[({ type Str[_] = String })#Str],
    mapGeneric: MapGenerc[F],
    override val defaultValue: Option[F[({ type OptF[U1] = Option[() => U1] })#OptF]]
  ) extends PureConfigLabelled[F] { ImplSelf =>
    def useDefaultValue(initFunc: F[({ type OptF[U1] = Option[() => U1] })#OptF] => F[({ type OptF[U1] = Option[() => U1] })#OptF])(implicit
      defaultValue: DefaultValue[F]
    ): PureConfigLabelled[F] = new PureConfigLabelledSelf.Impl[F](
      labelledValueFunc = ImplSelf.labelledValueFunc,
      mapGeneric = mapGeneric,
      defaultValue = Some(initFunc(defaultValue.defaultValueFunction1))
    )

    def mapLabelled(func: F[({ type Str[_] = String })#Str] => F[({ type Str[_] = String })#Str]): PureConfigLabelled[F] =
      new PureConfigLabelledSelf.Impl[F](
        labelledValueFunc = in => func(ImplSelf.labelledValueFunc(in)),
        mapGeneric = mapGeneric,
        defaultValue = ImplSelf.defaultValue
      )

    def mapWithConfigFieldMapping(c: ConfigFieldMapping): PureConfigLabelled[F] = {
      val mapping = new MapGenerc.MapFunction[({ type Str[_] = String })#Str, ({ type Str[_] = String })#Str] {
        override def map[X1](in: String): String = c(in)
      }
      ImplSelf.mapLabelled(mapGeneric.map[({ type Str[_] = String })#Str, ({ type Str[_] = String })#Str](mapping))
    }
  }

  trait Apply[F[_[_]]] {
    def default(implicit sp: BasedInstalledSimpleProduct[F]): PureConfigLabelled[F] = new PureConfigLabelledSelf.Impl[F](
      labelledValueFunc = identity[F[({ type Str[_] = String })#Str]],
      mapGeneric = MapGenerc[F].derived(sp.basedInstalled.simpleProduct2),
      defaultValue = Option.empty
    )
  }

  def build[F[_[_]]]: PureConfigLabelledSelf.Apply[F] = new PureConfigLabelledSelf.Apply[F] {
    //
  }

  type Pojo[Model] = PureConfigLabelled[({ type U1[X1[_]] = PojoInstance[X1, Model] })#U1]
  def pojo[Model]: PureConfigLabelledSelf.Apply[({ type U1[X1[_]] = PojoInstance[X1, Model] })#U1] =
    PureConfigLabelledSelf.build[({ type U1[X1[_]] = PojoInstance[X1, Model] })#U1]

}
