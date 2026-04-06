package net.scalax.simple
package test

class TailSame[T](val head: T, val tail: () => TailSame[T])

class LeftRound[L, R](val left: L, val tail: () => RightRound[L, R]) {
  def liftToLeft[L1, R1](l1: TailSame[L1]): LiftLeft[L1, R1] =
    new LiftLeft[L1, R1](left = l1.head, tail = () => tail().liftToLeft[L1, R1](l1.tail()))
  def liftToRight[L1, R1](l1: TailSame[R1]): LiftRight[L1, R1] =
    new LiftRight[L1, R1](right = l1.head, tail = () => tail().liftToRight[L1, R1](l1.tail()))
}
class RightRound[L, R](val right: R, val tail: () => LeftRound[L, R]) {
  def liftToLeft[L1, R1](l1: TailSame[L1]): LiftLeftMid[L1, R1]   = new LiftLeftMid[L1, R1](tail = () => tail().liftToLeft[L1, R1](l1))
  def liftToRight[L1, R1](l1: TailSame[R1]): LiftRightMid[L1, R1] = new LiftRightMid[L1, R1](tail = () => tail().liftToRight[L1, R1](l1))
}

class LiftLeft[L, R](val left: L, val tail: () => LiftLeftMid[L, R]) {
  def other1(r: LiftRight[L, R]): LeftRound[L, R] = new LeftRound[L, R](left = left, tail = () => tail().other2(r))
}
class LiftLeftMid[L, R](val tail: () => LiftLeft[L, R]) {
  def other2(r: LiftRight[L, R]): RightRound[L, R] = r.other3(tail())
}

class LiftRight[L, R](val right: R, val tail: () => LiftRightMid[L, R]) {
  def other3(r: LiftLeft[L, R]): RightRound[L, R] = new RightRound[L, R](right = right, tail = () => tail().other4(r))
}
class LiftRightMid[L, R](val tail: () => LiftRight[L, R]) {
  def other4(r: LiftLeft[L, R]): LeftRound[L, R] = r.other1(tail())
}
