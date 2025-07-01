package net.scalax.simple.codec
package aa

import net.scalax.simple.codec.to_list_generic.{BasedInstalled, PojoInstance}
import slick.ast.{ColumnOption, TypedType}
import slick.jdbc.JdbcProfile

trait SlickUtils[F[_[_]], Model] {
  val slickProfile: JdbcProfile

  import slickProfile.api._

  type OptsFromCol[T] = Seq[ColumnOption[T]]

  abstract class CommonTable(tag: Tag)(implicit
    typedType: F[TypedType],
    userShapeGeneric: F[({ type ShapeF[T] = Shape[_ <: FlatShapeLevel, Rep[T], T, Rep[T]] })#ShapeF],
    labelled: SlickLabelled[F],
    classTag: scala.reflect.ClassTag[Model],
    modelGet: ModelGet[F, Model],
    modelSet: ModelSet[F, Model],
    basedInstalled: BasedInstalled[F]
  ) extends Table[Model](tag, "users") {
    CommonTableSelf =>

    def colOpt: F[({ type PIns[T] = Seq[ColumnOption[T]] })#PIns] = SimpleFill[F]
      .derived(basedInstalled.basedInstalled.simpleProduct1)
      .fill[OptsFromCol](new SimpleFill.FillI[OptsFromCol] {
        override def fill[T]: Seq[ColumnOption[T]] = Seq.empty
      })

    def columnOption: F[({ type PIns[T] = Seq[ColumnOption[T]] })#PIns]

    private val utilsWrap: UtilsWrap[F, Model, slickProfile.type] =
      new UtilsWrap[F, Model, slickProfile.type](slickProfile, basedInstalled) {
        override val tb: Table[Model] = CommonTableSelf
      }

    private val repModel: F[Rep]         = utilsWrap.userRep(labelled, columnOption, typedType)
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
