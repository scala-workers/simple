package net.scalax.simple.codec.pureconfig

import com.typesafe.config.ConfigValue
import net.scalax.simple.codec.{ModelGet, ModelSet}
import net.scalax.simple.codec.to_list_generic.{BasedInstalledLabelled, BasedInstalledSimpleProduct, PojoInstance}
import net.scalax.simple.codec.utils.ByNameImplicit
import pureconfig.ConfigReader.Result
import pureconfig._

object PureConfigUtils {

  implicit def getCirceDecoderPojo[Model](implicit
    g1: ModelSet[({ type F[X[_]] = PojoInstance[X, Model] })#F, Model],
    modelLabelled: BasedInstalledLabelled[({ type F[X[_]] = PojoInstance[X, Model] })#F],
    basedInstalled: BasedInstalledSimpleProduct[({ type F[X[_]] = PojoInstance[X, Model] })#F],
    g3: ByNameImplicit[PojoInstance[ConfigReader, Model]],
    sg: PureConfigLabelled[({ type F[X[_]] = PojoInstance[X, Model] })#F]
  ): ConfigReader[Model] = {
    val labelledIns: PojoInstance[({ type Str1[_] = String })#Str1, Model] = sg.labelledValueFunc(modelLabelled.labelled.stringLabelled)

    val de1: ConfigReader[PojoInstance[({ type IDF[T] = T })#IDF, Model]] =
      DecodeHelperUtils.scalaM[({ type F[X[_]] = PojoInstance[X, Model] })#F](basedInstalled, labelledIns, () => g3.value, sg.defaultValue)

    for (model <- de1) yield g1.fromIdentity(model)
  }

  implicit def getPureConfigWriterPojo[Model](implicit
    g1: ModelGet[({ type F[X[_]] = PojoInstance[X, Model] })#F, Model],
    modelLabelled: BasedInstalledLabelled[({ type F[X[_]] = PojoInstance[X, Model] })#F],
    basedInstalled: BasedInstalledSimpleProduct[({ type F[X[_]] = PojoInstance[X, Model] })#F],
    g3: ByNameImplicit[PojoInstance[ConfigWriter, Model]],
    sg: PureConfigLabelled[({ type F[X[_]] = PojoInstance[X, Model] })#F]
  ): ConfigWriter[Model] = {
    val labelledIns: PojoInstance[({ type Str1[_] = String })#Str1, Model] = sg.labelledValueFunc(modelLabelled.labelled.stringLabelled)

    val de1: PojoInstance[({ type IDF[T] = T })#IDF, Model] => ConfigValue =
      EncodeHelperUtils.encodeImpl[({ type F[X[_]] = PojoInstance[X, Model] })#F](
        basedInstalled.basedInstalled.simpleProduct3,
        labelledIns,
        () => g3.value
      )

    ConfigWriter.fromFunction[Model](de1.compose(g1.toIdentity))
  }

}
