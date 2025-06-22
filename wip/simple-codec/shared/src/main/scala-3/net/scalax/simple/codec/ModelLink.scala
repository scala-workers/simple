package net.scalax.simple.codec
package to_list_generic

import net.scalax.simple.adt.nat.support.SimpleProductContextX

trait ModelLink[F[_[_]], Model] extends BasedInstalled[F] with ModelGetSet[F, Model] {
  override def toIdentity(t: Model): F[({ type U1[X] = X })#U1]
  override def fromIdentity(t: F[({ type U1[X] = X })#U1]): Model

  override def basedInstalled: SimpleProductContextX[F]
  override def labelled: ModelLabelled[F]
  override def size: ModelSize[F]
}

object ModelLink {

  import scala.deriving.Mirror

  def buildUtilImplCommonF[FMM[_[_]]](cNamed: Any, fromTuple: Any => FMM[[_] =>> Any]): ModelLinkCommonF[FMM] = new ModelLinkCommonF[FMM] {
    override val compatNamed: Any                    = cNamed
    override def FToInstance[T[_]](x: FMM[T]): Any   = Tuple.fromProduct(x.asInstanceOf)
    override def FFromInstance[T[_]](x: Any): FMM[T] = fromTuple(x).asInstanceOf[FMM[T]]
  }

  class BuilderCommonF[FMM[_[_]]] {
    inline def implicitly(using x: ModelLink[FMM, FMM[({ type IDF[T] = T })#IDF]]): ModelLink[FMM, FMM[({ type IDF[T] = T })#IDF]] = x

    inline def derived(using g: Mirror.ProductOf[FMM[({ type U1[_] = Any })#U1]]): ModelLink.F[FMM] = {
      val namedModel = scala.compiletime.constValueTuple[g.MirroredElemLabels]
      buildUtilImplCommonF(namedModel, g.fromTuple.asInstanceOf[Any => FMM[[_] =>> Any]])
    }
  }

  import scala.deriving.Mirror

  def buildUtilImplPojo[Model <: Product](cNamed: Any, fromTuple: Any => Model): ModelLinkPojo[Model] = new ModelLinkPojo[Model] {
    override val compatNamed: Any           = cNamed
    override def genericTo(x: Model): Any   = Tuple.fromProduct(x.asInstanceOf)
    override def genericFrom(x: Any): Model = fromTuple(x.asInstanceOf[Tuple]).asInstanceOf[Model]
  }

  class BuilderPojo[Model <: Product] {
    inline def derived(using g: Mirror.ProductOf[Model]): ModelLink.Pojo[Model] = {
      val namedModel = scala.compiletime.constValueTuple[g.MirroredElemLabels]
      buildUtilImplPojo(namedModel, g.fromTuple.asInstanceOf[Any => Model])
    }
  }

  object F {
    def apply[FMM[_[_]]]: BuilderCommonF[FMM] = new BuilderCommonF[FMM]
  }
  type F[FModel[_[_]]] = ModelLink[FModel, FModel[({ type IDF[T] = T })#IDF]]

  object Pojo {
    def apply[Model <: Product]: BuilderPojo[Model] = new BuilderPojo[Model]
  }
  type Pojo[Model] = ModelLink[({ type FMM[X[_]] = PojoInstance[X, Model] })#FMM, Model]

}
