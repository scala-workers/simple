package net.scalax.simple.codec
package aa

import net.scalax.simple.codec.to_list_generic.{FillIdentity, ModelLink}
import slick.ast.{ColumnOption, TypedType}
import slick.jdbc.JdbcProfile
import slick.lifted.{FlatShapeLevel, Rep, Shape}

case class User2Cat[U[_]](id: U[Int], first: String, last: String, nickName: String, age: Long)
object User2Cat {
  class SCtx[U[_]] {
    type FModel[X[_]] = FillIdentity.Pojo[X, User2Cat[U]]
  }
  implicit def appender[U[_]]: ModelLink.Pojo[User2Cat[U]] = ModelLink.Pojo[User2Cat[U]].derived

  type Id[T]          = T
  type StrAny[T]      = String
  type ShapeF[T]      = Shape[_ <: FlatShapeLevel, Rep[T], T, Rep[T]]
  type OptsFromCol[T] = Seq[ColumnOption[T]]

  abstract class User2CatTable[U[_]](implicit typedType: TypedType[U[Int]], tt12: ShapeF[U[Int]]) extends SlickPojo[User2Cat[U]] {
    type FModel[X[_]] = FillIdentity.Pojo[X, User2Cat[U]]

    override val slickProfile: JdbcProfile

    import slickProfile.api._

    implicit def userTypedTypeGeneric: FillIdentity.Pojo[TypedType, User2Cat[U]] = FillIdentity.Pojo[TypedType, User2Cat[U]].derived
    implicit def userShapeGeneric: FillIdentity.Pojo[ShapeF, User2Cat[U]]        = FillIdentity.Pojo[ShapeF, User2Cat[U]].derived

    implicit def slickLabelled: SlickLabelled.Pojo[User2Cat[U]] =
      SlickLabelled.Pojo[User2Cat[U]].derived.update(_.copy(_.first)("first_name").copy(_.last)("last_name"))

    class CommonT(tag: Tag) extends CommonTable(tag) {
      override def columnOption: FillIdentity.Pojo[OptsFromCol, User2Cat[U]] = colOpt.copy(_.id)(Seq(O.AutoInc, O.PrimaryKey))
    }

    def CommonTq: TableQuery[CommonT] = TableQuery(cons => new CommonT(cons))
  }
}

object Runner2 {
  type Id[T] = T

  def main(arr: Array[String]): Unit = {
    val p = slick.jdbc.MySQLProfile

    import p.api._

    object newTB extends User2Cat.User2CatTable[Id] {
      override val slickProfile = slick.jdbc.MySQLProfile
    }
    object newOpt extends User2Cat.User2CatTable[Option] {
      override val slickProfile = slick.jdbc.MySQLProfile
    }

    val db: Database = Database.forURL(url = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", user = "sa", password = "", driver = "org.h2.Driver")
    val sql1         = newTB.CommonTq.schema.create
    val sql2 =
      newOpt.CommonTq += User2Cat[Option](id = None, first = "first_name1", last = "last_name1", nickName = "nick_name1", age = 5201314)
    val sql3 =
      newOpt.CommonTq += User2Cat[Option](id = None, first = "first_name2", last = "last_name2", nickName = "nick_name2", age = 114514)
    val sql4 =
      newOpt.CommonTq += User2Cat[Option](id = None, first = "first_name3", last = "last_name3", nickName = "nick_name3", age = 314159)

    val action1 = DBIO.seq(sql1, sql2, sql3, sql4)
    val action2 = newOpt.CommonTq.result
    val action3 = newOpt.CommonTq.filter(s => s(_.last) endsWith "3").filter(s => s(_.first) endsWith "3").result

    import scala.concurrent.ExecutionContext.Implicits.global

    val futureAction = for {
      _     <- action1
      list1 <- action2
      list2 <- action3
    } yield {
      println(list1)
      println(list2)
      println("33".repeat(10))
      println(list1.map(x1 => x1.copy(first = "new_new_name")).map(x1 => x1.copy(age = 2121213)))
      println(list1.map(x1 => x1.copy(last = "new_new_name")).map(x1 => x1.copy(age = 114514)))
    }

    scala.concurrent.Await.result(db.run(futureAction), scala.concurrent.duration.Duration.Inf)

    println(newOpt.CommonTq.result.statements)
    println(newTB.CommonTq.result.statements)
  }

}
