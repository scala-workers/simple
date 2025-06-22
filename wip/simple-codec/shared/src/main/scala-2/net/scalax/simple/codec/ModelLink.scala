package net.scalax.simple.codec
package to_list_generic

import net.scalax.simple.adt.nat.support.SimpleProductContextX
import shapeless.DefaultSymbolicLabelling

trait ModelLink[F[_[_]], Model] extends BasedInstalled[F] with ModelGetSet[F, Model] {
  override def toIdentity(t: Model): F[({ type U1[X] = X })#U1]
  override def fromIdentity(t: F[({ type U1[X] = X })#U1]): Model

  override def basedInstalled: SimpleProductContextX[F]
  override def labelled: ModelLabelled[F]
  override def size: ModelSize[F]
}

object ModelLink {
  ModelLinkSelf =>

  class BuilderCommonF[FMM[_[_]]] {
    def derived(implicit
      compatNamed: DefaultSymbolicLabelling.Aux[FMM[({ type U1[X] = X })#U1], _ <: shapeless.HList],
      g: shapeless.Generic.Aux[FMM[({ type U1[_] = Any })#U1], _ <: shapeless.HList]
    ): ModelLinkSelf.F[FMM] = {
      val namedModel = compatNamed.apply()

      new ModelLinkCommonF[FMM] {
        override val compatNamed: Any                    = namedModel
        override def FToInstance[T[_]](x: FMM[T]): Any   = g.to(x.asInstanceOf[FMM[({ type U1[_] = Any })#U1]])
        override def FFromInstance[T[_]](x: Any): FMM[T] = g.from(x.asInstanceOf[g.Repr]).asInstanceOf[FMM[T]]
      }
    }

    def implicitly(implicit u: ModelLinkSelf.F[FMM]): ModelLinkSelf.F[FMM] = u
  }

  class BuilderPojo[Model] {
    def derived(implicit
      g: shapeless.Generic.Aux[Model, _ <: shapeless.HList],
      c: DefaultSymbolicLabelling.Aux[Model, _ <: shapeless.HList]
    ): ModelLinkSelf.Pojo[Model] = {
      val namedModel = c.apply()

      new ModelLinkPojo[Model] {
        override val compatNamed: Any           = namedModel
        override def genericFrom(x: Any): Model = g.from(x.asInstanceOf[g.Repr])
        override def genericTo(x: Model): Any   = g.to(x)
      }
    }

    def implicitly(implicit u: ModelLinkSelf.Pojo[Model]): ModelLinkSelf.Pojo[Model] = u
  }

  object F {
    def apply[F[_[_]]]: BuilderCommonF[F] = new BuilderCommonF[F]
  }
  type F[FModel[_[_]]] = ModelLink[FModel, FModel[({ type IDF[T] = T })#IDF]]

  object Pojo {
    def apply[Model]: BuilderPojo[Model] = new BuilderPojo[Model]
  }
  type Pojo[Model] = ModelLink[({ type FMM[X[_]] = PojoInstance[X, Model] })#FMM, Model]

}
