package net.scalax.simple.codec.pureconfig

import net.scalax.simple.codec.MapGenerc
import net.scalax.simple.codec.to_list_generic.{BasedInstalledLabelled, BasedInstalledSimpleProduct, PojoInstance}
import pureconfig._

trait PureConfigLabelled[F[_[_]]] {
  PureConfigLabelledSelf =>

  def labelledValue: F[({ type Str[_] = String })#Str]
  def mapGeneric: MapGenerc[F]

  def map(func: F[({ type Str[_] = String })#Str] => F[({ type Str[_] = String })#Str]): PureConfigLabelled[F] = new PureConfigLabelled[F] {
    override def labelledValue: F[({ type Str[_] = String })#Str] = func(PureConfigLabelledSelf.labelledValue)
    override def mapGeneric: MapGenerc[F]                         = PureConfigLabelledSelf.mapGeneric
  }
  def flatMap(func: F[({ type Str[_] = String })#Str] => PureConfigLabelled[F]): PureConfigLabelled[F] = func(
    PureConfigLabelledSelf.labelledValue
  )

  def mapWithConfigFieldMapping(c: ConfigFieldMapping): PureConfigLabelled[F] = {
    val mapping = new MapGenerc.MapFunction[({ type Str[_] = String })#Str, ({ type Str[_] = String })#Str] {
      override def map[X1](in: String): String = c(in)
    }
    PureConfigLabelledSelf.map(mapGeneric.map[({ type Str[_] = String })#Str, ({ type Str[_] = String })#Str](mapping))
  }
}

object PureConfigLabelled { PureConfigLabelledSelf =>
  trait Apply[F[_[_]]] {
    def default(implicit labe: BasedInstalledLabelled[F], sp: BasedInstalledSimpleProduct[F]): PureConfigLabelled[F] =
      new PureConfigLabelled[F] {
        override def labelledValue: F[({ type Str[_] = String })#Str] = labe.labelled.modelLabelled
        override def mapGeneric: MapGenerc[F]                         = MapGenerc[F].derived(sp.basedInstalled.simpleProduct2)
      }
  }

  def build[F[_[_]]]: PureConfigLabelledSelf.Apply[F] = new PureConfigLabelledSelf.Apply[F] {
    //
  }

  type Pojo[Model] = PureConfigLabelled[({ type U1[X1[_]] = PojoInstance[X1, Model] })#U1]
  def pojo[Model]: PureConfigLabelledSelf.Apply[({ type U1[X1[_]] = PojoInstance[X1, Model] })#U1] =
    PureConfigLabelledSelf.build[({ type U1[X1[_]] = PojoInstance[X1, Model] })#U1]
}
