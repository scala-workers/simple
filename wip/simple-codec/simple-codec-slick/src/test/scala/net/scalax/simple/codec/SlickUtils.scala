package net.scalax.simple.codec
package aa

import net.scalax.simple.codec.to_list_generic.{BasedInstalled, Fold1FGenerc, ModelLink, PojoInstance, ToListByTheSameTypeGeneric}
import slick.ast.{ColumnOption, TypedType}
import slick.jdbc.JdbcProfile
import slick.lifted.ShapedValue

class SlickUtils[F[_[_]], Model, V <: JdbcProfile](
  val slickProfile: V,
  appenderIn: ModelGetSet[F, Model],
  basedInstalled: BasedInstalled[F]
)(implicit classTag: scala.reflect.ClassTag[Model]) {
  import slickProfile.api._

  val commonAlias: SlickCompatAlias[slickProfile.type] = SlickCompatAlias.build(slickProfile)

  val zip3Generic: Zip3Generic[F]                  = Zip3Generic[F].derived(basedInstalled.basedInstalled.simpleProduct4)
  val mapGeneric: MapGenerc[F]                     = MapGenerc[F].derived(basedInstalled.basedInstalled.simpleProduct2)
  val folderGeneric: Fold1FGenerc[F]               = Fold1FGenerc[F].derived(basedInstalled.basedInstalled.simpleProduct1)
  val toListGeneric: ToListByTheSameTypeGeneric[F] = ToListByTheSameTypeGeneric[F].derived(folderGeneric)
  val fromListByTheSameTypeGeneric: FromListByTheSameTypeGeneric[F] =
    FromListByTheSameTypeGeneric[F].derived(basedInstalled.basedInstalled.simpleProduct1)
  val indexOfPropertyName: IndexOfPropertyName[F] = IndexOfPropertyName[F].derived(basedInstalled.basedInstalled.simpleProduct1)

  type ShapeF[T] = Shape[_ <: FlatShapeLevel, Rep[T], T, _]

  def getIndexByName1(n: String): Int = indexOfPropertyName.ofName(n, basedInstalled.labelled.modelLabelled)

  private val helperUtil: helperUtils[slickProfile.type, F] = new helperUtils[slickProfile.type, F](
    slickProfile = slickProfile
  )(
    toListGeneric = toListGeneric,
    fromListByTheSameTypeGeneric = fromListByTheSameTypeGeneric
  )

  def mapShape(shapeModel: F[ShapeF], repModel: F[Rep]): slick.lifted.MappedProjection[Model] = {
    import slick.collection.heterogeneous.{HList => SlickHList}
    val shapedValue: ShapedValue[SlickHList, SlickHList] =
      anyToShapedValue(helperUtil.toRep(repModel))(helperUtil.toShape(shapeModel))

    val from1: F[({ type IDF[T] = T })#IDF] => SlickHList = helperUtil.fromModel
    val to1: SlickHList => F[({ type IDF[T] = T })#IDF]   = helperUtil.toModel

    ShapedValueCompat.mapToPro[SlickHList, SlickHList, Model](
      shapedValue,
      from1.compose(appenderIn.toIdentity),
      to1.andThen(appenderIn.fromIdentity),
      csTag = classTag
    )
  }

  def colN[T](name: String, func: OptsFromCol[T], tt: TypedType[T]): Table[_] => Rep[T] = { tb =>
    val colsFunc = for (n <- func) yield n(tb.O)
    tb.column(name, colsFunc: _*)(tt)
  }

  type OptsFromCol[T] = Seq[commonAlias.SqlColumnOptions => ColumnOption[T]]

  def userOptImpl: F[OptsFromCol] = SimpleFill[F]
    .derived(basedInstalled.basedInstalled.simpleProduct1)
    .fill[OptsFromCol](new SimpleFill.FillI[OptsFromCol] {
      override def fill[T]: Seq[commonAlias.SqlColumnOptions => ColumnOption[T]] = Seq.empty
    })

  def userRep(labelled: SlickLabelled[F], opt: F[OptsFromCol], typedType: F[TypedType]): slickProfile.Table[_] => F[Rep] = { tb =>
    val l1 = labelled.labelled
    val l2 = opt
    val l3 = typedType

    val zipResult1 = zip3Generic.zip[({ type M1[_] = String })#M1, OptsFromCol, TypedType](l1, l2, l3)

    val mapFunction: MapGenerc.MapFunction[({ type F1[T] = (String, OptsFromCol[T], TypedType[T]) })#F1, Rep] =
      new MapGenerc.MapFunction[({ type F1[T] = (String, OptsFromCol[T], TypedType[T]) })#F1, Rep] {
        override def map[X1](t: (String, OptsFromCol[X1], TypedType[X1])): Rep[X1] = colN(t._1, t._2, t._3)(tb)
      }

    val mapResult = mapGeneric.map[({ type F1[T] = (String, OptsFromCol[T], TypedType[T]) })#F1, Rep](mapFunction)

    mapResult(zipResult1)
  }

  class CommonTable(tag: Tag)(opt: F[OptsFromCol])(implicit
    typedType: F[TypedType],
    userShapeGeneric: F[ShapeF],
    labelled: SlickLabelled[F]
  ) extends slickProfile.Table[Model](tag, "users") {
    self =>
    private val repModel: slickProfile.Table[_] => F[Rep] = userRep(labelled, opt, typedType)
    private def __tableInnserRep: F[Rep]                  = repModel(self)

    override def * : slick.lifted.ProvenShape[Model] = mapShape(userShapeGeneric, __tableInnserRep)
  }

  object CommonTable {
    import scala.language.implicitConversions
    implicit def TableUserAbsTableImpl(tb: CommonTable): F[Rep] = tb.__tableInnserRep
  }

}

object SlickUtils {

  def withPojo[M](appender: ModelLink.Pojo[M])(implicit
    classTag: scala.reflect.ClassTag[M]
  ): SlickUtilsApply[({ type U1[XM[_]] = PojoInstance[XM, M] })#U1, M] =
    new SlickUtilsApply[({ type U1[XM[_]] = PojoInstance[XM, M] })#U1, M](appender, appender)(classTag)

  def apply[F[_[_]]](appender: ModelLink[F, F[({ type U1[T] = T })#U1]])(implicit
    classTag: scala.reflect.ClassTag[F[({ type U1[T] = T })#U1]]
  ): SlickUtilsApply[F, F[({ type U1[T] = T })#U1]] = new SlickUtilsApplyImpl1[F](appender, appender)(classTag)

  class SlickUtilsApplyImpl1[F[_[_]]](appender: ModelGetSet[F, F[({ type U1[T] = T })#U1]], basedInstalled: BasedInstalled[F])(implicit
    classTag: scala.reflect.ClassTag[F[({ type U1[T] = T })#U1]]
  ) extends SlickUtilsApply[F, F[({ type U1[T] = T })#U1]](appender, basedInstalled) {
    override def build[V <: JdbcProfile](slickProfile: V): SlickUtils[F, F[({ type U1[T] = T })#U1], slickProfile.type] =
      new SlickUtils[F, F[({ type U1[T] = T })#U1], slickProfile.type](slickProfile, appender, basedInstalled)(classTag)
  }

  class SlickUtilsApply[F[_[_]], Model](appender: ModelGetSet[F, Model], basedInstalled: BasedInstalled[F])(implicit
    classTag: scala.reflect.ClassTag[Model]
  ) {
    def build[V <: JdbcProfile](slickProfile: V): SlickUtils[F, Model, slickProfile.type] =
      new SlickUtils[F, Model, slickProfile.type](slickProfile, appender, basedInstalled)(classTag)
  }
}

import slick.collection.heterogeneous.{HCons => SlickHCons, HList => SlickHList, HNil => SlickHNil}
import SlickHList.{HListShape => SlickHListShape}

private class helperUtils[V <: JdbcProfile, ModelF[_[_]]](val slickProfile: V)(
  toListGeneric: ToListByTheSameTypeGeneric[ModelF],
  fromListByTheSameTypeGeneric: FromListByTheSameTypeGeneric[ModelF]
) {
  import slickProfile.api._

  type ShapeF[T] = Shape[_ <: FlatShapeLevel, Rep[T], T, _]

  def toShape(t1: ModelF[ShapeF]): SlickHListShape[FlatShapeLevel, SlickHList, SlickHList, SlickHList] = {
    val toListFunc = toListGeneric.toListByTheSameType[Shape[FlatShapeLevel, Any, Any, Any], SlickHListShape[
      FlatShapeLevel,
      SlickHList,
      SlickHList,
      SlickHList
    ]](
      SlickHList.hnilShape.asInstanceOf[SlickHListShape[
        FlatShapeLevel,
        SlickHList,
        SlickHList,
        SlickHList
      ]],
      (sum, each) =>
        SlickHList
          .hconsShape(each, sum)
          .asInstanceOf[SlickHListShape[
            FlatShapeLevel,
            SlickHList,
            SlickHList,
            SlickHList
          ]]
    )

    val model2: ModelF[({ type X1[_] = Shape[FlatShapeLevel, Any, Any, Any] })#X1] =
      t1.asInstanceOf[ModelF[({ type X1[_] = Shape[FlatShapeLevel, Any, Any, Any] })#X1]]

    toListFunc(model2)
  }

  def toRep(t1: ModelF[Rep]): SlickHList = {
    val toListFunc = toListGeneric.toListByTheSameType[Rep[Any], SlickHList](
      SlickHNil,
      (sum, each) => each :: sum
    )

    val model2: ModelF[({ type X1[_] = Rep[Any] })#X1] = t1.asInstanceOf[ModelF[({ type X1[_] = Rep[Any] })#X1]]

    toListFunc(model2)
  }

  def fromModel(m: ModelF[({ type IdImpl[T] = T })#IdImpl]): SlickHList = {
    val toListFunc = toListGeneric.toListByTheSameType[Any, SlickHList](
      SlickHNil,
      (sum, each) => each :: sum
    )

    val model2: ModelF[({ type X1[_] = Any })#X1] = m.asInstanceOf[ModelF[({ type X1[_] = Any })#X1]]
    toListFunc(model2)
  }

  def toModel(m: SlickHList): ModelF[({ type IdImpl[T] = T })#IdImpl] = {
    val fromListFunc = fromListByTheSameTypeGeneric.fromListByTheSameType[Any, SlickHList](
      t => t.asInstanceOf[SlickHCons[Any, SlickHList]].head,
      t => t.asInstanceOf[SlickHCons[Any, SlickHList]].tail
    )

    fromListFunc(m).asInstanceOf[ModelF[({ type IdImpl[T] = T })#IdImpl]]
  }
}
