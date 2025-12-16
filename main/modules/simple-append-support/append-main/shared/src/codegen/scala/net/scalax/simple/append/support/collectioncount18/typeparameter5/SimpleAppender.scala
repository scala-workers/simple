package nat.scalax.simple.append.support
package collectioncount5
package typeparameter18

trait SimpleAppender[
  M5[_, _, _, _, _],
  Col1,
  Col2,
  Col3,
  Col4,
  Col5,
  App1[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _ <: Col1] <: Col1,
  App2[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _ <: Col2] <: Col2,
  App3[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _ <: Col3] <: Col3,
  App4[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _ <: Col4] <: Col4,
  App5[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _ <: Col5] <: Col5,
  ColIns1 <: Col1,
  ColIns2 <: Col2,
  ColIns3 <: Col3,
  ColIns4 <: Col4,
  ColIns5 <: Col5
] {
  def current: M5[ColIns1, ColIns2, ColIns3, ColIns4, ColIns5]
  def next[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]: SimpleAppender[
    M5,
    Col1,
    Col2,
    Col3,
    Col4,
    Col5,
    App1,
    App2,
    App3,
    App4,
    App5,
    App1[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, ColIns1],
    App2[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, ColIns2],
    App3[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, ColIns3],
    App4[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, ColIns4],
    App5[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, ColIns5]
  ]
}
