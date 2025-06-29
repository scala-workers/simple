package net.scalax.simple.codec
package aa

import net.scalax.simple.codec.to_list_generic.{BasedInstalled, PojoInstance}
import slick.ast.{ColumnOption, TypedType}
import slick.jdbc.JdbcProfile

class SlickUtils[F[_[_]], Model, V <: JdbcProfile](
  val slickProfile: V
) {
  import slickProfile.api._

  private def indexOfPropertyName(bi: BasedInstalled[F]): IndexOfPropertyName[F] =
    IndexOfPropertyName[F].derived(bi.basedInstalled.simpleProduct1)

  def getIndexByName1(n: String)(implicit bi: BasedInstalled[F]): Int = indexOfPropertyName(bi).ofName(n, bi.labelled.modelLabelled)

  type OptsFromCol[T] = Seq[slickProfile.SqlColumnOptions => ColumnOption[T]]

  def userOptImpl(implicit bi: BasedInstalled[F]): F[OptsFromCol] = SimpleFill[F]
    .derived(bi.basedInstalled.simpleProduct1)
    .fill[OptsFromCol](new SimpleFill.FillI[OptsFromCol] {
      override def fill[T]: Seq[slickProfile.SqlColumnOptions => ColumnOption[T]] = Seq.empty
    })

  class CommonTable(tag: Tag)(opt: F[OptsFromCol])(implicit
    typedType: F[TypedType],
    userShapeGeneric: F[({ type ShapeF[T] = Shape[_ <: FlatShapeLevel, Rep[T], T, _] })#ShapeF],
    labelled: SlickLabelled[F],
    classTag: scala.reflect.ClassTag[Model],
    modelGet: ModelGet[F, Model],
    modelSet: ModelSet[F, Model],
    basedInstalled: BasedInstalled[F]
  ) extends slickProfile.Table[Model](tag, "users") {
    CommonTableSelf =>

    val utilsWrap: UtilsWrap[F, Model, slickProfile.type] =
      new UtilsWrap[F, Model, slickProfile.type](slickProfile, basedInstalled) {
        override val tb: Table[Model] = CommonTableSelf
      }

    private val repModel: F[Rep]         = utilsWrap.userRep(labelled, opt, typedType)
    private def __tableInnserRep: F[Rep] = repModel

    override def * : slick.lifted.ProvenShape[Model] = utilsWrap.mapShape(userShapeGeneric, __tableInnserRep, classTag, modelGet, modelSet)
  }

  object CommonTable {
    import scala.language.implicitConversions
    implicit def TableUserAbsTableImpl(tb: CommonTable): F[Rep] = tb.__tableInnserRep
  }

}

object SlickUtils {

  object Pojo {
    def apply[M]: SlickUtilsApply[({ type U1[XM[_]] = PojoInstance[XM, M] })#U1, M] =
      new SlickUtilsApply[({ type U1[XM[_]] = PojoInstance[XM, M] })#U1, M]
  }

  object F {
    def apply[FMM[_[_]]]: SlickUtilsApply[FMM, FMM[({ type U1[T] = T })#U1]] = new SlickUtilsApplyImpl1[FMM]
  }

  class SlickUtilsApplyImpl1[FMM[_[_]]] extends SlickUtilsApply[FMM, FMM[({ type U1[T] = T })#U1]] {
    override def build[V <: JdbcProfile](slickProfile: V): SlickUtils[FMM, FMM[({ type U1[T] = T })#U1], slickProfile.type] =
      new SlickUtils[FMM, FMM[({ type U1[T] = T })#U1], slickProfile.type](slickProfile)
  }

  class SlickUtilsApply[FMM[_[_]], Model] {
    def build[V <: JdbcProfile](slickProfile: V): SlickUtils[FMM, Model, slickProfile.type] =
      new SlickUtils[FMM, Model, slickProfile.type](slickProfile)
  }

}
