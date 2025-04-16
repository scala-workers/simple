package net.scalax.simple.codec
package aa

import net.scalax.simple.codec.to_list_generic.{BasedInstalled, FillIdentity, ModelLink, ModelLinkCommonF}
import slick.ast.{ColumnOption, TypedType}
import slick.jdbc.JdbcProfile

case class UserAbs[F[_], U[_]](id: F[U[Int]], first: F[String], last: F[String], age: F[Long])

class Model2(val slickProfile: JdbcProfile) {

  import slickProfile.api._

  implicit def appender[U[_]]: ModelLink[({ type FModel[X[_]] = UserAbs[X, U] })#FModel, UserAbs[({ type U1[T] = T })#U1, U]] =
    ModelLinkCommonF[({ type FModel[X[_]] = UserAbs[X, U] })#FModel].derived
  val commonAlias: SlickCompatAlias[slickProfile.type] = SlickCompatAlias.build(slickProfile)
  def utils[U[_]]: SlickUtils[({ type FModel[X[_]] = UserAbs[X, U] })#FModel, slickProfile.type] =
    SlickUtils[({ type FModel[X[_]] = UserAbs[X, U] })#FModel](appender).build(slickProfile)

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
  type OptsFromCol[T]  = Seq[commonAlias.SqlColumnOptions => ColumnOption[T]]

  def userTypedTypeGeneric[U[_]](implicit tt12: TypedType[U[Int]]): UserAbs[TypedType, U] = FillIdentity[UserAbs[TypedType, U]].derived
  def userShapeGeneric[U[_]](implicit tt12: ShapeF[U[Int]]): UserAbs[ShapeF, U]           = FillIdentity[UserAbs[ShapeF, U]].derived

  def userOptImpl[U[_]]: UserAbs[OptsFromCol, U] = utils.userOptImpl

  def userOpt[U[_]]: UserAbs[OptsFromCol, U] = {
    val impl                      = userOptImpl
    val list: OptsFromCol[U[Int]] = addElem(impl.id, _.AutoInc, _.PrimaryKey)
    impl.copy[OptsFromCol, U](id = list)
  }

  val utils1 = utils[Option]
  val utils2 = utils[Id]

  object Query1
      extends TableQuery(cons =>
        new utils2.CommonTable(cons)(
          labelled = appender[Id].labelled,
          opt = userOpt,
          typedType = userTypedTypeGeneric,
          userShapeGeneric = userShapeGeneric
        )
      ) {
    object forInsert
        extends TableQuery(cons =>
          new utils1.CommonTable(cons)(
            labelled = appender.labelled,
            opt = userOpt,
            typedType = userTypedTypeGeneric,
            userShapeGeneric = userShapeGeneric
          )
        )
  }

  val replace1: ReplaceByIndex[({ type F1[H1[_]] = UserAbs[H1, Id] })#F1] =
    ReplaceByIndex[({ type F1[H1[_]] = UserAbs[H1, Id] })#F1].derived(utils2.appender1)

  val replace2: ReplaceByIndex[({ type F1[H1[_]] = UserAbs[H1, Option] })#F1] =
    ReplaceByIndex[({ type F1[H1[_]] = UserAbs[H1, Option] })#F1].derived(utils1.appender1)

  val replace3: ReplaceByPropertyName[({ type F1[H1[_]] = UserAbs[H1, Id] })#F1] =
    ReplaceByPropertyName[({ type F1[H1[_]] = UserAbs[H1, Id] })#F1]
      .derived(implicitly[BasedInstalled[({ type F1[H1[_]] = UserAbs[H1, Id] })#F1]])

  val replace4: ReplaceByPropertyName[({ type F1[H1[_]] = UserAbs[H1, Option] })#F1] =
    ReplaceByPropertyName[({ type F1[H1[_]] = UserAbs[H1, Option] })#F1]
      .derived(implicitly[BasedInstalled[({ type F1[H1[_]] = UserAbs[H1, Option] })#F1]])

  println("// ===")
  println(utils1.getIndexByName("age"))
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
      println("33".repeat(10))
      println(list1.map(x1 => newOpt.replace1.replace[Id](1, "new_new_name")(x1)).map(x1 => newOpt.replace1.replace[Id](3, 2121213)(x1)))
      println(
        list1.map(x1 => newOpt.replace3.replace[Id]("last", "new_new_name")(x1)).map(x1 => newOpt.replace3.replace[Id]("age", 114514)(x1))
      )
    }

    scala.concurrent.Await.result(db.run(futureAction), scala.concurrent.duration.Duration.Inf)

    println(Query1.forInsert.result.statements)
    println(Query1.result.statements)
  }

}
