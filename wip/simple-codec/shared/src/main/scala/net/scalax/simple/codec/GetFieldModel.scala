package net.scalax.simple.codec

import net.scalax.simple.adt.nat.support.v5.AppenderSupport1
import net.scalax.simple.adt.nat.support.ABCFunc

trait GetFieldModel[F[_[_]]] {
  def getFieldModel[I[_]]: F[({ type XI[t] = F[I] => I[t] })#XI]
}

object GetFieldModel {

  class TestGenericHelper[Sum] {
    type Func[Temp, Item] = (Sum => Temp) => Item
  }

  def appender[Sum, X1[_]]: AppenderSupport1.Simple2.Appender[TestGenericHelper[Sum]#Func, X1, ({ type NU2[T] = Sum => X1[T] })#NU2] =
    new AppenderSupport1.Simple2.Appender[
      TestGenericHelper[Sum]#Func,
      X1,
      ({ type NU2[T] = Sum => X1[T] })#NU2
    ] {
      override def append[T, B1, B2, C1, C2](
        abc1: ABCFunc[X1[T], B1, C1],
        abc2: ABCFunc[Sum => X1[T], B2, C2],
        ma: (Sum => B1) => B2
      ): (Sum => C1) => C2 = (sumFunc: Sum => C1) => {
        val f1: Sum => X1[T] = sumFunc.andThen(abc1.takeHead)
        val f2: Sum => B1    = sumFunc.andThen(abc1.takeTail)
        val b2: B2           = ma(f2)
        abc2.append(f1, b2)
      }
    }

  def zero[Sum]: AppenderSupport1.Simple2.Zero[TestGenericHelper[Sum]#Func] =
    new AppenderSupport1.Simple2.Zero[TestGenericHelper[Sum]#Func] {
      override def zero[B1, B2](b1: B1, b2: B2): (Sum => B1) => B2 = (f: (Sum => B1)) => b2
    }

  class Builder[F[_[_]]] {
    def derived(o1: AppenderSupport1.Simple2.Runner[F]): GetFieldModel[F] = new GetFieldModel[F] {
      override def getFieldModel[UX[_]]: F[({ type S1[T] = F[UX] => UX[T] })#S1] = {
        val func: (F[UX] => F[UX]) => F[({ type NU2[T] = F[UX] => UX[T] })#NU2] =
          o1.append[TestGenericHelper[F[UX]]#Func, UX, ({ type NU2[T] = F[UX] => UX[T] })#NU2](
            appender = appender[F[UX], UX],
            zero = zero[F[UX]]
          )

        func(identity[F[UX]])
      }
    }
  }

  def apply[F[_[_]]]: Builder[F] = new Builder[F]

}
