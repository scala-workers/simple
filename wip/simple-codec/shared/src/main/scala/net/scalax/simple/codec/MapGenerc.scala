package net.scalax.simple.codec

import net.scalax.simple.codec.to_list_generic.SimpleProduct2

trait MapGenerc[F[_[_]]] {
  def map[S[_], T[_]](input: MapGenerc.MapFunction[S, T]): F[S] => F[T]
}

object MapGenerc {

  trait MapFunction[S[_], T[_]] {
    def map[X1](in: S[X1]): T[X1]
  }

  @inline private val anyToAnyImplImpl: Any => Any = identity[Any]
  @inline private def anyToAnyImpl[T]: T => T      = anyToAnyImplImpl.asInstanceOf[T => T]

  class Builder[F[_[_]]] {
    def derived(generic3: SimpleProduct2.Appender[F]): MapGenerc[F] = new MapGenerc[F] {
      override def map[S[_], T[_]](input: MapFunction[S, T]): F[S] => F[T] = {
        type MA[H, HH] = H => HH
        val m: SimpleProduct2.AppendMonad[MA] = new SimpleProduct2.AppendMonad[MA] {
          override def zip[A, B, S, T](ma: A => B, ms: S => T): ((A, S)) => (B, T)                            = a => (ma(a._1), ms(a._2))
          override def to[A, B, S, T](m1: A => B)(in1: A => S, in2: B => T)(in3: S => A, in4: T => B): S => T = s => in2(m1(in3(s)))
          override val zero: SimpleZero => SimpleZero                                                         = anyToAnyImpl[SimpleZero]
        }
        val funcImpl: SimpleProduct2.TypeGen[MA, S, T] = new SimpleProduct2.TypeGen[MA, S, T] {
          override def apply[X1]: S[X1] => T[X1] = sx => input.map(sx)
        }
        generic3.toHList[MA, S, T](m)(funcImpl)
      }
    }
  }

  def apply[F[_[_]]]: Builder[F] = new Builder[F]

}
