package net.scalax.simple.codec
package aa

import net.scalax.simple.codec.to_list_generic.{BasedInstalled, PojoInstance}
import slick.ast.TypedType
import slick.jdbc.JdbcProfile

trait SlickUtils[F[_[_]], Model] {
  val slickProfile: JdbcProfile

  import slickProfile.api._

  abstract class CommonTable(_tableTag: Tag, _schemaName: Option[String], _tableName: String)(implicit
    typedType: F[TypedType],
    userShapeGeneric: F[({ type ShapeF[T] = Shape[_ <: FlatShapeLevel, Rep[T], T, Rep[T]] })#ShapeF],
    classTag: scala.reflect.ClassTag[Model],
    modelGet: ModelGet[F, Model],
    modelSet: ModelSet[F, Model],
    basedInstalled: BasedInstalled[F]
  ) extends Table[Model](_tableTag = _tableTag, _schemaName = _schemaName, _tableName = _tableName) {
    CommonTableSelf =>

    def this(_tableTag: Tag, _tableName: String)(implicit
      typedType: F[TypedType],
      userShapeGeneric: F[({ type ShapeF[T] = Shape[_ <: FlatShapeLevel, Rep[T], T, Rep[T]] })#ShapeF],
      classTag: scala.reflect.ClassTag[Model],
      modelGet: ModelGet[F, Model],
      modelSet: ModelSet[F, Model],
      basedInstalled: BasedInstalled[F]
    ) = this(_tableTag = _tableTag, _schemaName = None, _tableName = _tableName)

    type ColOpt = F[ColumnOpt]

    private def colOpt: F[ColumnOpt] = SimpleFill[F]
      .derived(basedInstalled.basedInstalled.simpleProduct1)
      .fill[ColumnOpt](new SimpleFill.FillI[ColumnOpt] {
        override def fill[T]: ColumnOpt[T] = ColumnOpt.default[T]
      })

    def columnOption: ColOpt => ColOpt

    private val utilsWrap: UtilsWrap[F, Model, slickProfile.type] =
      new UtilsWrap[F, Model, slickProfile.type](slickProfile, basedInstalled) {
        override val tb: Table[Model] = CommonTableSelf
      }

    private val repModel: F[Rep]         = utilsWrap.userRep(basedInstalled, columnOption(colOpt), typedType)
    private def __tableInnserRep: F[Rep] = repModel

    override def * : slick.lifted.ProvenShape[Model] = utilsWrap.mapShape(userShapeGeneric, __tableInnserRep, classTag, modelGet, modelSet)
  }

  object CommonTable {
    import scala.language.implicitConversions
    implicit def TableUserAbsTableImpl(tb: CommonTable): F[Rep] = tb.__tableInnserRep
  }

}

trait SlickF[FMM[_[_]]] extends SlickUtils[FMM, FMM[({ type IDF[T] = T })#IDF]]

trait SlickPojo[Model] extends SlickUtils[({ type PIns[U[_]] = PojoInstance[U, Model] })#PIns, Model]
