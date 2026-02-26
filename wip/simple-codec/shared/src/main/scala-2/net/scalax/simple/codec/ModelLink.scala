package net.scalax.simple.codec
package to_list_generic

import shapeless.DefaultSymbolicLabelling

trait ModelLink[F[_[_]], Model]
    extends BasedInstalledSimpleProduct[F]
    with BasedInstalledLabelled[F]
    with BasedInstalledModelSized[F]
    with ModelGet[F, Model]
    with ModelSet[F, Model]
    with FModelGet[F]
    with FModelSet[F]

object ModelLink {
  ModelLinkSelf =>

  class BuilderCommonF[FMM[_[_]]] {
    def derived(implicit
      compatNamed1: DefaultSymbolicLabelling.Aux[FMM[({ type U1[X] = X })#U1], _ <: shapeless.HList],
      g: shapeless.Generic.Aux[FMM[({ type U1[_] = Any })#U1], _ <: shapeless.HList]
    ): ModelLinkSelf.F[FMM] = {
      val namedModel = compatNamed1.apply()

      new ModelLinkCommonF[FMM] { ModelLinkCommonFSelf =>
        override def labelled: CompatLabelled[FMM] = new CompatLabelledImplHelper.Impl[FMM] {
          override def symbolLabelled: FMM[({ type T1[_] = Symbol })#T1] =
            ModelLinkCommonFSelf.FFromHList[({ type T1[_] = Symbol })#T1](namedModel)
          override def mapGenerc: MapGenerc[FMM] = MapGenerc[FMM].derived(ModelLinkCommonFSelf.basedInstalled.simpleProduct2)
        }
        override def FToHList[T[_]](x: FMM[T]): Any   = g.to(x.asInstanceOf[FMM[({ type U1[_] = Any })#U1]])
        override def FFromHList[T[_]](x: Any): FMM[T] = g.from(x.asInstanceOf[g.Repr]).asInstanceOf[FMM[T]]
        override def size: ModelSize[FMM]             = ModelSize[FMM].derived(namedModel)
      }
    }

    def implicitly(implicit u: ModelLinkSelf.F[FMM]): ModelLinkSelf.F[FMM] = u
  }

  object F {
    def apply[F[_[_]]]: BuilderCommonF[F] = new BuilderCommonF[F]
  }
  type F[FModel[_[_]]] = ModelLink[FModel, FModel[({ type IDF[T] = T })#IDF]]

}
