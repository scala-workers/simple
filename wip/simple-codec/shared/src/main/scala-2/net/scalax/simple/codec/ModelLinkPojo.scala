package net.scalax.simple.codec
package to_list_generic

import net.scalax.simple.adt.nat.support.SimpleProductContextX

trait ModelLinkPojo[Model] extends ModelLink[({ type F[X[_]] = PojoInstance[X, Model] })#F, Model] {
  modelLinkCommonFSelf =>

  override def toIdentity(t: Model): PojoInstance[({ type U1[X] = X })#U1, Model] =
    modelLinkCommonFSelf.FFromHList[({ type U1[X] = X })#U1](modelLinkCommonFSelf.genericTo(t))
  override def fromIdentity(t: PojoInstance[({ type U1[X] = X })#U1, Model]): Model =
    modelLinkCommonFSelf.genericFrom(modelLinkCommonFSelf.FToHList[({ type U1[X] = X })#U1](t))

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

  protected def genericFrom(t: Any): Model
  protected def genericTo(t: Model): Any
}

object ModelLinkPojo {

  import shapeless.DefaultSymbolicLabelling
  def derived[Model](implicit
    g: shapeless.Generic[Model],
    c: DefaultSymbolicLabelling[Model]
  ): ModelLinkPojo[Model] = {
    val namedModel = c.apply()
    new ModelLinkPojo[Model] { ModelLinkPojoSelf =>
      override def labelled: CompatLabelled[({ type FX[U1[_]] = PojoInstance[U1, Model] })#FX] =
        new CompatLabelledImplHelper.Impl[({ type FX[U1[_]] = PojoInstance[U1, Model] })#FX] {
          override def symbolLabelled: PojoInstance[({ type T1[_] = Symbol })#T1, Model] =
            ModelLinkPojoSelf.FFromHList[({ type T1[_] = Symbol })#T1](namedModel)
          override def mapGenerc: MapGenerc[({ type FX[U1[_]] = PojoInstance[U1, Model] })#FX] =
            MapGenerc[({ type FX[U1[_]] = PojoInstance[U1, Model] })#FX].derived(ModelLinkPojoSelf.basedInstalled.simpleProduct2)
        }
      override def genericFrom(x: Any): Model = g.from(x.asInstanceOf[g.Repr])
      override def genericTo(x: Model): Any   = g.to(x)
      override def FFromHList[U[_]](t: Any): PojoInstance[U, Model] = new PojoInstance[U, Model] {
        override def instance: Any = t
      }
      override def FToHList[U[_]](t: PojoInstance[U, Model]): Any = t.instance
      override def size: ModelSize[({ type FX[U1[_]] = PojoInstance[U1, Model] })#FX] =
        ModelSize[({ type FX[U1[_]] = PojoInstance[U1, Model] })#FX].derived(namedModel)
    }
  }

}
