package net.scalax.simple.codec
package aa

import net.scalax.simple.codec.to_list_generic.{FillIdentity, ModelLink}
import slick.ast.{ColumnOption, TypedType}
import slick.jdbc.JdbcProfile

case class User2Cat[U[_]](id: U[Int], first: String, last: String, nickName: String, age: Long)
object User2Cat {
  implicit def appender[U[_]]: ModelLink.Pojo[User2Cat[U]] = ModelLink.Pojo[User2Cat[U]].derived
}

class User2CatModel(val slickProfile: JdbcProfile) {
  class SCtx[U[_]] {
    type FModel[X[_]] = FillIdentity.Pojo[X, User2Cat[U]]
  }

  import slickProfile.api._

  def utils[U[_]]: SlickUtils[SCtx[U]#FModel, User2Cat[U], slickProfile.type] =
    SlickUtils.Pojo[User2Cat[U]].build(slickProfile)

  def addElem[T](seq: Seq[T], t: T*): Seq[T] = t ++: seq
  def colN[T](
    name: String,
    func: OptsFromCol[T],
    tt: TypedType[T]
  ): Table[_] => Rep[T] = { tb =>
    val colsFunc = for (n <- func) yield n(tb.O)
    tb.column(name, colsFunc: _*)(tt)
  }

  type Id[T]           = T
  type StrAny[T]       = String
  type ShapeF[T]       = Shape[_ <: FlatShapeLevel, Rep[T], T, _]
  type RepFromTable[T] = slickProfile.Table[_] => Rep[T]
  type OptsFromCol[T]  = Seq[slickProfile.SqlColumnOptions => ColumnOption[T]]

  implicit def userTypedTypeGeneric[U[_]](implicit tt12: TypedType[U[Int]]): FillIdentity.Pojo[TypedType, User2Cat[U]] =
    FillIdentity.Pojo[TypedType, User2Cat[U]].derived
  implicit def userShapeGeneric[U[_]](implicit tt12: ShapeF[U[Int]]): FillIdentity.Pojo[ShapeF, User2Cat[U]] =
    FillIdentity.Pojo[ShapeF, User2Cat[U]].derived

  def userOptImpl[U[_]]: FillIdentity.Pojo[OptsFromCol, User2Cat[U]] = utils.userOptImpl

  def userOpt[U[_]]: FillIdentity.Pojo[OptsFromCol, User2Cat[U]] = {
    val impl                      = userOptImpl[U]
    val list: OptsFromCol[U[Int]] = addElem(impl(_.id), _.AutoInc, _.PrimaryKey)
    impl.copy(_.id)(list)
  }

  val utils1 = utils[Option]
  val utils2 = utils[Id]

  implicit def slickLabelled[U[_]]: SlickLabelled.Pojo[User2Cat[U]] =
    SlickLabelled.Pojo[User2Cat[U]].derived.update((_.copy(_.first)("first_name").copy(_.last)("last_name").copy(_.nickName)("nick_name")))

  object Query1 extends TableQuery(cons => new utils2.CommonTable(cons)(opt = userOpt)) {
    object forInsert extends TableQuery(cons => new utils1.CommonTable(cons)(opt = userOpt))
  }

  println("// ===")
  println(utils1.getIndexByName1("age"))
  println("// ===")

}

object Runner2 {
  type Id[T] = T

  def main(arr: Array[String]): Unit = {
    val p = slick.jdbc.MySQLProfile

    val newOpt: User2CatModel = new User2CatModel(p)
    val Query1                = newOpt.Query1

    import p.api._

    val db: Database = Database.forURL(url = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", user = "sa", password = "", driver = "org.h2.Driver")
    val sql1         = Query1.schema.create
    val sql2 =
      Query1.forInsert += User2Cat[Option](id = None, first = "first_name1", last = "last_name1", nickName = "nick_name1", age = 5201314)
    val sql3 =
      Query1.forInsert += User2Cat[Option](id = None, first = "first_name2", last = "last_name2", nickName = "nick_name2", age = 114514)
    val sql4 =
      Query1.forInsert += User2Cat[Option](id = None, first = "first_name3", last = "last_name3", nickName = "nick_name3", age = 314159)

    val action1 = DBIO.seq(sql1, sql2, sql3, sql4)
    val action2 = Query1.forInsert.result
    val action3 = Query1.forInsert.filter(s => s(_.last) endsWith "3").filter(s => s(_.first) endsWith "3").result

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

    println(Query1.forInsert.result.statements)
    println(Query1.result.statements)
  }

}
