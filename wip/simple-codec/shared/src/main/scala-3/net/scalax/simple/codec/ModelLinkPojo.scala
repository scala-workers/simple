package net.scalax.simple.codec
package to_list_generic

import net.scalax.simple.adt.nat.support.SimpleProductContextX

trait ModelLinkPojo[Model] extends ModelLink[({ type F[X[_]] = PojoInstance[X, Model] })#F, Model] {
  modelLinkCommonFSelf =>

  override def toIdentity(t: Model): PojoInstance[({ type U1[X] = X })#U1, Model] =
    PojoInstance.instance[({ type U1[X] = X })#U1, Model](genericTo(t))
  override def fromIdentity(t: PojoInstance[({ type U1[X] = X })#U1, Model]): Model = genericFrom(t.instance)

  override def basedInstalled: SimpleProductContextX[({ type F[X[_]] = PojoInstance[X, Model] })#F] = {
    val fromFunc: GenericAuxFrom[({ type F[X[_]] = PojoInstance[X, Model] })#F] =
      new GenericAuxFrom[({ type F[X[_]] = PojoInstance[X, Model] })#F] {
        override def fromModel[X[_]](collection: Any): PojoInstance[X, Model] = new PojoInstance[X, Model] {
          override def instance: Any = collection
        }
      }
    val toFunc: GenericAuxTo[({ type F[X[_]] = PojoInstance[X, Model] })#F] =
      new GenericAuxTo[({ type F[X[_]] = PojoInstance[X, Model] })#F] {
        override def toModel[X[_]](model: PojoInstance[X, Model]): Any = model.instance
      }

    SimpleProductX[({ type F[X[_]] = PojoInstance[X, Model] })#F].derived(fromFunc, toFunc, modelLinkCommonFSelf.size)
  }

  override def labelled: ModelLabelled[({ type F[X[_]] = PojoInstance[X, Model] })#F] =
    ModelLabelled[({ type F[X[_]] = PojoInstance[X, Model] })#F].instance(
      PojoInstance.instance[({ type Str[_] = String })#Str, Model](modelLinkCommonFSelf.compatLabelled.compatLabelled)
    )

  override def size: ModelSize[({ type F[X[_]] = PojoInstance[X, Model] })#F] =
    ModelSize[({ type F[X[_]] = PojoInstance[X, Model] })#F].derived(modelLinkCommonFSelf.compatLabelled)

  protected def compatLabelled: CompatLabelled[({ type F[X[_]] = PojoInstance[X, Model] })#F] =
    CompatLabelled[({ type F[X[_]] = PojoInstance[X, Model] })#F].instance(modelLinkCommonFSelf.compatNamed)
  protected def compatNamed: Any
  protected def genericFrom(t: Any): Model
  protected def genericTo(t: Model): Any
}

object ModelLinkPojo {
  import scala.deriving.Mirror

  def buildUtilImpl[Model <: Product](cNamed: Any, fromTuple: Any => Model): ModelLinkPojo[Model] = new ModelLinkPojo[Model] {
    override val compatNamed: Any           = cNamed
    override def genericTo(x: Model): Any   = Tuple.fromProduct(x.asInstanceOf)
    override def genericFrom(x: Any): Model = fromTuple(x.asInstanceOf[Tuple]).asInstanceOf[Model]
  }

  class Builder[Model <: Product] {
    inline def derived(using g: Mirror.ProductOf[Model]): ModelLinkPojo[Model] = {
      val namedModel = scala.compiletime.constValueTuple[g.MirroredElemLabels]
      buildUtilImpl(namedModel, g.fromTuple.asInstanceOf[Any => Model])
    }
  }

  def apply[Model <: Product]: Builder[Model] = new Builder[Model]

}
