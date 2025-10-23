package net.scalax.simple.adt
package instance
package support

object AppendTail {
  AppendTailSelf =>

  trait AppenderAdtAbsAbs[Zero, Adt1, Adt2] {
    def inputAbsAbs: Either[Zero, Adt1] => Adt2
  }

  trait AppenderAdtAbs[Zero, Adt1, Adt2] extends AppenderAdtAbsAbs[Zero, Adt1, Adt2] {
    AppenderAdtAbsSelf =>
    override def inputAbsAbs: Either[Zero, Adt1] => Adt2 = AppenderAdtAbsSelf.inputAbs[Zero](identity[Zero])
    def inputAbs[U1](func: U1 => Zero): Either[U1, Adt1] => Adt2 = (param: Either[U1, Adt1]) => {
      val i1 = for (t1 <- param.left) yield func(t1)
      inputAbsAbs(i1)
    }
  }

  trait AppenderAdt[Zero, Adt1 <: AdtCoProduct, Adt2 <: AdtCoProduct] extends AppenderAdtAbs[Zero, Adt1, Adt2] {
    AppenderAdtSelf =>

    override def inputAbs[U1](func: U1 => Zero): Either[U1, Adt1] => Adt2 = (param: Either[U1, Adt1]) => {
      val outFunc: AdtCoProduct.UsePositive[U1, Adt1] => Adt2 = AppenderAdtSelf.input[U1](func)
      val m: AdtCoProduct.UsePositive[U1, Adt1] = param.fold[AdtCoProduct.UsePositive[U1, Adt1]](
        (a1: U1) => AdtCoProduct.UsePositive.left[U1, Adt1](a1),
        (a1: Adt1) => AdtCoProduct.UsePositive.right[U1, Adt1](a1)
      )
      outFunc(m)
    }

    def input[S1](func: S1 => Zero): AdtCoProduct.UsePositive[S1, Adt1] => Adt2 = (param: AdtCoProduct.UsePositive[S1, Adt1]) => {
      val outFunc: Either[S1, Adt1] => Adt2 = AppenderAdtSelf.inputAbs[S1](func)
      val m: Either[S1, Adt1]               = param.fold[Either[S1, Adt1]]((a1: S1) => Left(a1), (a1: Adt1) => Right(a1))
      outFunc(m)
    }

    def append[Item]: AppenderAdt[Zero, AdtCoProduct.UsePositive[Item, Adt1], AdtCoProduct.UsePositive[Item, Adt2]] =
      new AppenderAdt[Zero, AdtCoProduct.UsePositive[Item, Adt1], AdtCoProduct.UsePositive[Item, Adt2]] {
        override def inputAbsAbs: Either[Zero, AdtCoProduct.UsePositive[Item, Adt1]] => AdtCoProduct.UsePositive[Item, Adt2] = {
          (iparam: Either[Zero, AdtCoProduct.UsePositive[Item, Adt1]]) =>
            {
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
  }

  def zeroAppender[Zero, Item1]: AppenderAdt[Zero, AdtCoProduct.UseOne[Item1], AdtCoProduct.UsePositive[Item1, AdtCoProduct.UseOne[Zero]]] =
    new AppenderAdt[Zero, AdtCoProduct.UseOne[Item1], AdtCoProduct.UsePositive[Item1, AdtCoProduct.UseOne[Zero]]] {
      override def inputAbsAbs: Either[Zero, AdtCoProduct.UseOne[Item1]] => AdtCoProduct.UsePositive[Item1, AdtCoProduct.UseOne[Zero]] =
        (param: Either[Zero, AdtCoProduct.UseOne[Item1]]) => {
          param.fold[AdtCoProduct.UsePositive[Item1, AdtCoProduct.UseOne[Zero]]](
            (a1: Zero) => AdtCoProduct.UsePositive.right[Item1, AdtCoProduct.UseOne[Zero]](new AdtCoProduct.UseOne[Zero](a1)),
            (a1: AdtCoProduct.UseOne[Item1]) => AdtCoProduct.UsePositive.left[Item1, AdtCoProduct.UseOne[Zero]](a1.value)
          )
        }
    }

}
