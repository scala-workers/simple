package net.scalax.simple
package test

class TailSame[T](val head: T, val tail: () => T)

class LeftRound[L, R](val left: L, val tail: () => RightRound[L, R]) {
  def liftToLeft[L1, R1](l1: TailSame[L1]): LiftLeft[L1, R1]
}
class RightRound[L, R](val right: R, val tail: () => LeftRound[L, R])

trait Lift
class LiftLeft[L, R](val left: L, val tail: () => LiftRight[L, R]) {
  def other(r: LiftRight[L, R]): LeftRound[L, R] = new LeftRound[L, R](left = left, tail = () => r.other(tail()))
}
class LiftRight[L, R](val right: R, val tail: () => LiftLeft[L, R]) {
  def other(r: LiftRight[L, R]): RightRound[L, R] = new RightRound[L, R](right = right, tail = () => tail().other(r))
}
class LiftLeftMid[L,R](val tail:()=>LiftLeft[L,R])