package net.scalax.simple
package codec
package func_circe_test

import io.circe._
import io.circe.syntax._
import net.scalax.simple.adt.nat.support.ABCFunc
import net.scalax.simple.codec.to_list_generic.ModelLink

case class FuncCirceTest[T, F[_]](id1: F[Int], str1: F[T], uClass1: F[Option[Long]], name1: F[String], namexu1: F[String])
case class FuncCirceTestImpl1[T, F[_]](str1: F[T])
case class FuncCirceTestImpl2[F[_]](id1: F[Int], uClass1: F[Option[Long]], name1: F[String], namexu1: F[String])

case class FuncCirceTest2[F[_]](id1: F[Int], str1: F[String], uClass1: F[Option[Long]], name1: F[String], namexu1: F[String])
case class FuncCirceTestImpl12[F[_]](str1: F[String])
case class FuncCirceTestImpl22[F[_]](id1: F[Int], uClass1: F[Option[Long]], name1: F[String], namexu1: F[String])

object FuncCirceTest {
  type Named[_] = String

  def abcFromTo[T, F[_]]: ABCFunc[FuncCirceTestImpl1[T, F], FuncCirceTestImpl2[F], FuncCirceTest[T, F]] =
    new ABCFunc[FuncCirceTestImpl1[T, F], FuncCirceTestImpl2[F], FuncCirceTest[T, F]] {
      override def takeHead(m: FuncCirceTest[T, F]): FuncCirceTestImpl1[T, F] = FuncCirceTestImpl1[T, F](str1 = m.str1)
      override def takeTail(m: FuncCirceTest[T, F]): FuncCirceTestImpl2[F] =
        FuncCirceTestImpl2[F](id1 = m.id1, uClass1 = m.uClass1, name1 = m.name1, namexu1 = m.namexu1)
      override def append(h: FuncCirceTestImpl1[T, F], t: FuncCirceTestImpl2[F]): FuncCirceTest[T, F] =
        FuncCirceTest[T, F](id1 = t.id1, str1 = h.str1, uClass1 = t.uClass1, name1 = t.name1, namexu1 = t.namexu1)
    }

  implicit def deco2_1[T]: ModelLink.F[({ type U[X[_]] = FuncCirceTest[T, X] })#U] =
    ModelLink.F[({ type U[X[_]] = FuncCirceTest[T, X] })#U].derived
  implicit def deco2_2[T]: ModelLink.F[({ type U[X[_]] = FuncCirceTestImpl1[T, X] })#U] =
    ModelLink.F[({ type U[X[_]] = FuncCirceTestImpl1[T, X] })#U].derived
  implicit val deco2_3: ModelLink.F[FuncCirceTestImpl2] = ModelLink.F[FuncCirceTestImpl2].derived

}

object FuncCirceTest1 {

  import CirceGen.F._

  final def main(args: Array[String]): Unit = {
    11
  }

}
