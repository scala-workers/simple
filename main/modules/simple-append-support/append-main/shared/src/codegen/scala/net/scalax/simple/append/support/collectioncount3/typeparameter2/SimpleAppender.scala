package nat.scalax.simple.append.support
package collectioncount2
package typeparameter3

trait SimpleAppender[
  M2[_, _],
  Col1,
  Col2,
  App1[_, _, _, _ <: Col1] <: Col1,
  App2[_, _, _, _ <: Col2] <: Col2,
  ColIns1 <: Col1,
  ColIns2 <: Col2
] {
  def current: M2[ColIns1, ColIns2]
  def next[T1, T2, T3]: SimpleAppender[
    M2,
    Col1,
    Col2,
    App1,
    App2,
    App1[T1, T2, T3, ColIns1],
    App2[T1, T2, T3, ColIns2]
  ]
}
