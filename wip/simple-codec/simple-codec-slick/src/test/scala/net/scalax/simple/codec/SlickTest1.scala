package net.scalax.simple.codec
package aa

import net.scalax.simple.codec.to_list_generic.{FillIdentity, ModelLink}
import slick.ast.{ColumnOption, TypedType}
import slick.jdbc.JdbcProfile
import slick.lifted.{FlatShapeLevel, Rep, Shape}

case class UserAbs[F[_], U[_]](id: F[U[Int]], first: F[String], last: F[String], age: F[Long])

object UserAbs {
  class SCtx[U[_]] {
    type FModel[X[_]] = UserAbs[X, U]
  }

  type Id[T]          = T
  type StrAny[T]      = String
  type ShapeF[T]      = Shape[_ <: FlatShapeLevel, Rep[T], T, _]
  type OptsFromCol[T] = Seq[ColumnOption[T]]

  implicit def appender[U[_]]: ModelLink.F[SCtx[U]#FModel] = ModelLink.F[SCtx[U]#FModel].derived

  abstract class UserAbsTable[U[_]](implicit typedType: TypedType[U[Int]], tt12: ShapeF[U[Int]]) extends SlickF[SCtx[U]#FModel] {
    type FModel[X[_]] = UserAbs[X, U]

    override val slickProfile: JdbcProfile

    import slickProfile.api._

    implicit def userTypedTypeGeneric: UserAbs[TypedType, U] =
      FillIdentity.F[TypedType, FModel].derived
    implicit def userShapeGeneric: UserAbs[ShapeF, U] = FillIdentity.F[ShapeF, FModel].derived

    implicit def slickLabelled: SlickLabelled.F[FModel] =
      SlickLabelled.F[FModel].derived.update(_.copy[StrAny, U](first = "first_name", last = "last_name"))

    class CommonT(tag: Tag) extends CommonTable(tag) {
      override def columnOption: FModel[OptsFromCol] = colOpt.copy[OptsFromCol, U](id = Seq(O.AutoInc, O.PrimaryKey))
    }

    def CommonTq: TableQuery[CommonT] = TableQuery(cons => new CommonT(cons))
  }

}

object Runner1 {
  type Id[T] = T

  def main(arr: Array[String]): Unit = {
    val p = slick.jdbc.MySQLProfile

    import p.api._

    object newTB extends UserAbs.UserAbsTable[Id] {
      override val slickProfile = slick.jdbc.MySQLProfile
    }
    object newOpt extends UserAbs.UserAbsTable[Option] {
      override val slickProfile = slick.jdbc.MySQLProfile
    }

    val db: Database = Database.forURL(url = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", user = "sa", password = "", driver = "org.h2.Driver")
    val sql1         = newTB.CommonTq.schema.create
    val sql2         = newOpt.CommonTq += UserAbs[Id, Option](id = None, first = "first_name1", last = "last_name1", age = 5201314)
    val sql3         = newOpt.CommonTq += UserAbs[Id, Option](id = None, first = "first_name2", last = "last_name2", age = 114514)
    val sql4         = newOpt.CommonTq += UserAbs[Id, Option](id = None, first = "first_name3", last = "last_name3", age = 314159)

    val action1 = DBIO.seq(sql1, sql2, sql3, sql4)
    val action2 = newTB.CommonTq.result
    val action3 = newTB.CommonTq.filter(_.last endsWith "3").filter(_.first endsWith "3").result

    import scala.concurrent.ExecutionContext.Implicits.global

    val futureAction = for {
      _     <- action1
      list1 <- action2
      list2 <- action3
    } yield {
      println(list1)
      println(list2)
    }

    scala.concurrent.Await.result(db.run(futureAction), scala.concurrent.duration.Duration.Inf)

    println(newOpt.CommonTq.result.statements)
    println(newTB.CommonTq.result.statements)
  }

}
