package net.scalax.simple.codec
package to_list_generic

import shapeless.DefaultSymbolicLabelling
import net.scalax.simple.adt.nat.support.SimpleProductContextX

trait ModelLinkCommonF[F[_[_]]] extends ModelLink[F, F[({ type U1[X] = X })#U1]] {
  modelLinkCommonFSelf =>

  override def toIdentity(t: F[({ type U1[X] = X })#U1]): F[({ type U1[X] = X })#U1]   = t
  override def fromIdentity(t: F[({ type U1[X] = X })#U1]): F[({ type U1[X] = X })#U1] = t

  override def basedInstalled: SimpleProductContextX[F] = {
    val fromFunc: GenericAuxFrom[F] = new GenericAuxFrom[F] {
      override def fromModel[X[_]](collection: Any): F[X] = modelLinkCommonFSelf.FFromInstance(collection)
    }
    val toFunc: GenericAuxTo[F] = new GenericAuxTo[F] {
      override def toModel[X[_]](model: F[X]): Any = modelLinkCommonFSelf.FToInstance(model)
    }

    SimpleProductX[F].derived(fromFunc, toFunc, modelLinkCommonFSelf.size)
  }

  override def labelled: ModelLabelled[F] =
    ModelLabelled[F].derived(modelLinkCommonFSelf.compatLabelled, modelLinkCommonFSelf.fromListByTheSameTypeGeneric)
  override def size: ModelSize[F] = ModelSize[F].derived(modelLinkCommonFSelf.compatLabelled)

  protected def compatLabelled: CompatLabelled[F] = CompatLabelled[F].instance(modelLinkCommonFSelf.compatNamed)
  protected def compatNamed: Any
  protected def FToInstance[T[_]](x: F[T]): Any
  protected def FFromInstance[T[_]](x: Any): F[T]
}

object ModelLinkCommonF {

  class Builder[F[_[_]]] {
    def derived(implicit
      compatNamed: DefaultSymbolicLabelling.Aux[F[({ type U1[X] = X })#U1], _ <: shapeless.HList],
      g: shapeless.Generic.Aux[F[({ type U1[_] = Any })#U1], _ <: shapeless.HList]
    ): ModelLinkCommonF[F] = {
      val namedModel = compatNamed.apply()

      new ModelLinkCommonF[F] {
        override val compatNamed: Any                  = namedModel
        override def FToInstance[T[_]](x: F[T]): Any   = g.to(x.asInstanceOf[F[({ type U1[_] = Any })#U1]])
        override def FFromInstance[T[_]](x: Any): F[T] = g.from(x.asInstanceOf[g.Repr]).asInstanceOf[F[T]]
      }
    }
  }

  def apply[F[_[_]]]: Builder[F] = new Builder[F]

}
