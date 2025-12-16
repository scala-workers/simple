package nat.scalax.simple.append.support
package collectioncount1
package typeparameter21

trait SimpleAppender[
  M1[_],
  Col1,
  App1[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _ <: Col1] <: Col1,
  ColIns1 <: Col1
] {
  def current: M1[ColIns1]
  def next[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]: SimpleAppender[
    M1,
    Col1,
    App1,
    App1[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, ColIns1]
  ]
}
