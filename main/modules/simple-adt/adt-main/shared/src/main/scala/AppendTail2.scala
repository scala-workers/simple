package net.scalax.simple.adt
package instance
package support

object AppendTail2 {
  AppendTailSelf =>

  trait AppenderAdtAbs[Zero, Adt1, Adt2] {
    def inputAbsAbs(p: Either[Zero, Adt1]): Adt2
  }

  trait AppenderAdt[Zero, Adt1 <: AdtCoProduct, Adt2 <: AdtCoProduct] extends AppenderAdtAbs[Zero, Adt1, Adt2] {
    AppenderAdtSelf =>

    def inputAbs(param: AdtCoProduct.UsePositive[Zero, Adt1]): Adt2 = {
      val coP: Either[Zero, Adt1] = param.fold[Either[Zero, Adt1]]((z1: Zero) => Left(z1), (z1: Adt1) => Right(z1))
      AppenderAdtSelf.inputAbsAbs(coP)
    }

    def append[Item]: AppenderAdt[Zero, AdtCoProduct.UsePositive[Item, Adt1], AdtCoProduct.UsePositive[Item, Adt2]] =
      new AppenderAdt[Zero, AdtCoProduct.UsePositive[Item, Adt1], AdtCoProduct.UsePositive[Item, Adt2]] {
        override def inputAbsAbs(iparam: Either[Zero, AdtCoProduct.UsePositive[Item, Adt1]]): AdtCoProduct.UsePositive[Item, Adt2] = {
          val i1: Either[Item, Either[Zero, Adt1]] = iparam.fold[Either[Item, Either[Zero, Adt1]]](
            (a1: Zero) => Right(Left(a1)),
            (a1: AdtCoProduct.UsePositive[Item, Adt1]) =>
              a1.fold[Either[Item, Either[Zero, Adt1]]]((a2: Item) => Left(a2), (a2: Adt1) => Right(Right(a2)))
          )

          val i2: Either[Item, Adt2] = for (t1 <- i1) yield AppenderAdtSelf.inputAbsAbs(t1)

          i2.fold[AdtCoProduct.UsePositive[Item, Adt2]](
            (a1: Item) => AdtCoProduct.UsePositive.left[Item, Adt2](a1),
            (a1: Adt2) => AdtCoProduct.UsePositive.right[Item, Adt2](a1)
          )
        }
      }

  }

  object AppenderAdt extends AppendTail4.AppendAdtHelper

}
