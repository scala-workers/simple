package nat.scalax.simple.append.support
package collectioncount6
package typeparameter11

trait SimpleAppender[
  M6[_, _, _, _, _, _],
  Col1,
  Col2,
  Col3,
  Col4,
  Col5,
  Col6,
  App1[_, _, _, _, _, _, _, _, _, _, _, _ <: Col1] <: Col1,
  App2[_, _, _, _, _, _, _, _, _, _, _, _ <: Col2] <: Col2,
  App3[_, _, _, _, _, _, _, _, _, _, _, _ <: Col3] <: Col3,
  App4[_, _, _, _, _, _, _, _, _, _, _, _ <: Col4] <: Col4,
  App5[_, _, _, _, _, _, _, _, _, _, _, _ <: Col5] <: Col5,
  App6[_, _, _, _, _, _, _, _, _, _, _, _ <: Col6] <: Col6,
  ColIns1 <: Col1,
  ColIns2 <: Col2,
  ColIns3 <: Col3,
  ColIns4 <: Col4,
  ColIns5 <: Col5,
  ColIns6 <: Col6
] {
  def current: M6[ColIns1, ColIns2, ColIns3, ColIns4, ColIns5, ColIns6]
  def next[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]: SimpleAppender[
    M6,
    Col1,
    Col2,
    Col3,
    Col4,
    Col5,
    Col6,
    App1,
    App2,
    App3,
    App4,
    App5,
    App6,
    App1[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, ColIns1],
    App2[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, ColIns2],
    App3[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, ColIns3],
    App4[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, ColIns4],
    App5[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, ColIns5],
    App6[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, ColIns6]
  ]
}
