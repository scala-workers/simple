package nat.scalax.simple.append.support
package collectioncount4
package typeparameter2

trait SimpleAppender[
  M4[_, _, _, _],
  Col1,
  Col2,
  Col3,
  Col4,
  App1[_, _, _ <: Col1] <: Col1,
  App2[_, _, _ <: Col2] <: Col2,
  App3[_, _, _ <: Col3] <: Col3,
  App4[_, _, _ <: Col4] <: Col4,
  ColIns1 <: Col1,
  ColIns2 <: Col2,
  ColIns3 <: Col3,
  ColIns4 <: Col4
] {
  def current: M4[ColIns1, ColIns2, ColIns3, ColIns4]
  def next[T1, T2]: SimpleAppender[
    M4,
    Col1,
    Col2,
    Col3,
    Col4,
    App1,
    App2,
    App3,
    App4,
    App1[T1, T2, ColIns1],
    App2[T1, T2, ColIns2],
    App3[T1, T2, ColIns3],
    App4[T1, T2, ColIns4]
  ]
}
