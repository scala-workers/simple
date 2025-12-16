package nat.scalax.simple.append.support
package collectioncount1
package typeparameter2

trait SimpleAppender[
  M1[_],
  Col1,
  App1[_, _, _ <: Col1] <: Col1,
  ColIns1 <: Col1
] {
  def current: M1[ColIns1]
  def next[T1, T2]: SimpleAppender[
    M1,
    Col1,
    App1,
    App1[T1, T2, ColIns1]
  ]
}
