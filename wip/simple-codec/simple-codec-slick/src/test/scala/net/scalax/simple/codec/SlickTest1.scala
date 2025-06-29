package net.scalax.simple.codec
package aa

import net.scalax.simple.codec.to_list_generic.{FillIdentity, ModelLink}
import slick.ast.{ColumnOption, TypedType}
import slick.jdbc.JdbcProfile

case class UserAbs[F[_], U[_]](id: F[U[Int]], first: F[String], last: F[String], age: F[Long])

class Model2(val slickProfile: JdbcProfile) {
  class SCtx[U[_]] {
    type FModel[X[_]] = UserAbs[X, U]
  }

  import slickProfile.api._

  implicit def appender[U[_]]: ModelLink.F[SCtx[U]#FModel] = ModelLink.F[SCtx[U]#FModel].derived
  def utils[U[_]]: SlickUtils[SCtx[U]#FModel, UserAbs[({ type Id1[XV] = XV })#Id1, U], slickProfile.type] =
    SlickUtils.F[SCtx[U]#FModel].build(slickProfile)

  def addElem[T](seq: Seq[T], t: T*): Seq[T] = t ++: seq
  def colN[T](
    name: String,
    func: OptsFromCol[T],
    tt: TypedType[T]
  ): Table[_] => Rep[T] = { tb =>
    val colsFunc = for (n <- func) yield n(tb.O)
    tb.column(name, colsFunc: _*)(tt)
  }

  type Id[T]          = T
  type StrAny[T]      = String
  type ShapeF[T]      = Shape[_ <: FlatShapeLevel, Rep[T], T, _]
  type OptsFromCol[T] = Seq[slickProfile.SqlColumnOptions => ColumnOption[T]]

  implicit def userTypedTypeGeneric[U[_]](implicit tt12: TypedType[U[Int]]): UserAbs[TypedType, U] =
    FillIdentity.F[TypedType, SCtx[U]#FModel].derived
  implicit def userShapeGeneric[U[_]](implicit tt12: ShapeF[U[Int]]): UserAbs[ShapeF, U] = FillIdentity.F[ShapeF, SCtx[U]#FModel].derived

  def userOptImpl[U[_]]: UserAbs[OptsFromCol, U] = utils.userOptImpl

  def userOpt[U[_]]: UserAbs[OptsFromCol, U] = {
    val impl                      = userOptImpl
    val list: OptsFromCol[U[Int]] = addElem(impl.id, _.AutoInc, _.PrimaryKey)
    impl.copy[OptsFromCol, U](id = list)
  }

  val utils1 = utils[Option]
  val utils2 = utils[Id]

  implicit def slickLabelled[U[_]]: SlickLabelled.F[SCtx[U]#FModel] =
    SlickLabelled
      .F[SCtx[U]#FModel]
      .derived
      .update(_.copy[({ type FModel[_] = String })#FModel, U](first = "first_name", last = "last_name"))

  object Query1 extends TableQuery(cons => new utils2.CommonTable(cons)(opt = userOpt[Id])) {
    object forInsert extends TableQuery(cons => new utils1.CommonTable(cons)(opt = userOpt[Option]))
  }

  println("// ===")
  println(utils1.getIndexByName1("age"))
  println("// ===")

}

object Runner1 {
  type Id[T] = T

  def main(arr: Array[String]): Unit = {
    val p = slick.jdbc.MySQLProfile

    val newOpt: Model2 = new Model2(p)
    val Query1         = newOpt.Query1

    import p.api._

    val db: Database = Database.forURL(url = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", user = "sa", password = "", driver = "org.h2.Driver")
    val sql1         = Query1.schema.create
    val sql2         = Query1.forInsert += UserAbs[Id, Option](id = None, first = "first_name1", last = "last_name1", age = 5201314)
    val sql3         = Query1.forInsert += UserAbs[Id, Option](id = None, first = "first_name2", last = "last_name2", age = 114514)
    val sql4         = Query1.forInsert += UserAbs[Id, Option](id = None, first = "first_name3", last = "last_name3", age = 314159)

    val action1 = DBIO.seq(sql1, sql2, sql3, sql4)
    val action2 = Query1.result
    val action3 = Query1.filter(_.last endsWith "3").filter(_.first endsWith "3").result

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

    println(Query1.forInsert.result.statements)
    println(Query1.result.statements)
  }

}
