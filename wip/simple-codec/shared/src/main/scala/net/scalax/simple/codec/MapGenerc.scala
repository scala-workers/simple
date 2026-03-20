package net.scalax.simple.codec

import net.scalax.simple.adt.nat.support.v5.AppenderSupport1
import net.scalax.simple.adt.nat.support.{ABCFunc, SimpleProduct2, SimpleProductContextX}

trait MapGenerc[F[_[_]]] {
  def map[S[_], T[_]](input: MapGenerc.MapFunction[S, T]): F[S] => F[T]
}

object MapGenerc {

  trait MapFunction[S[_], T[_]] {
    def map[X1](in: S[X1]): T[X1]
  }

  class Builder[F[_[_]]] {
    def derived(generic3: AppenderSupport1.Simple2.Runner[F]): MapGenerc[F] = new MapGenerc[F] {
      override def map[S[_], T[_]](input: MapFunction[S, T]): F[S] => F[T] = {
        type MA[H, HH] = H => HH
        val appender: AppenderSupport1.Simple2.Appender[MA, S, T] = new AppenderSupport1.Simple2.Appender[MA, S, T] {
          override def append[MX1, B1, B2, C1, C2](abc1: ABCFunc[S[MX1], B1, C1], abc2: ABCFunc[T[MX1], B2, C2], ma: B1 => B2): C1 => C2 =
            (c1: C1) => {
              val sm1: S[MX1] = abc1.takeHead(c1)
              val b1: B1      = abc1.takeTail(c1)
              abc2.append(input.map[MX1](sm1), ma(b1))
            }
        }
        val zero: AppenderSupport1.Simple2.Zero[MA] = new AppenderSupport1.Simple2.Zero[MA] {
          override def zero[B1, B2](b1: B1, b2: B2): B1 => B2 = (b1: B1) => b2
        }
        generic3.append[MA, S, T](appender = appender, zero = zero)
      }
    }
  }

  def apply[F[_[_]]]: Builder[F] = new Builder[F]

}
