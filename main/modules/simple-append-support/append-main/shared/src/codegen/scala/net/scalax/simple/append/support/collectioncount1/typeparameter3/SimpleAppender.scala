package nat.scalax.simple.append.support
package collectioncount3
package typeparameter1

trait SimpleAppender[
  M3[_, _, _],
  Col1,
  Col2,
  Col3,
  App1[_, _ <: Col1] <: Col1,
  App2[_, _ <: Col2] <: Col2,
  App3[_, _ <: Col3] <: Col3,
  ColIns1 <: Col1,
  ColIns2 <: Col2,
  ColIns3 <: Col3
] {
  def current: M3[ColIns1, ColIns2, ColIns3]
  def next[T1]: SimpleAppender[
    M3,
    Col1,
    Col2,
    Col3,
    App1,
    App2,
    App3,
    App1[T1, ColIns1],
    App2[T1, ColIns2],
    App3[T1, ColIns3]
  ]
}
