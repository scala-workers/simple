package nat.scalax.simple.append.support
package collectioncount8
package typeparameter5

trait SimpleAppender[
  M8[_, _, _, _, _, _, _, _],
  Col1,
  Col2,
  Col3,
  Col4,
  Col5,
  Col6,
  Col7,
  Col8,
  App1[_, _, _, _, _, _ <: Col1] <: Col1,
  App2[_, _, _, _, _, _ <: Col2] <: Col2,
  App3[_, _, _, _, _, _ <: Col3] <: Col3,
  App4[_, _, _, _, _, _ <: Col4] <: Col4,
  App5[_, _, _, _, _, _ <: Col5] <: Col5,
  App6[_, _, _, _, _, _ <: Col6] <: Col6,
  App7[_, _, _, _, _, _ <: Col7] <: Col7,
  App8[_, _, _, _, _, _ <: Col8] <: Col8,
  ColIns1 <: Col1,
  ColIns2 <: Col2,
  ColIns3 <: Col3,
  ColIns4 <: Col4,
  ColIns5 <: Col5,
  ColIns6 <: Col6,
  ColIns7 <: Col7,
  ColIns8 <: Col8
] {
  def current: M8[ColIns1, ColIns2, ColIns3, ColIns4, ColIns5, ColIns6, ColIns7, ColIns8]
  def next[T1, T2, T3, T4, T5]: SimpleAppender[
    M8,
    Col1,
    Col2,
    Col3,
    Col4,
    Col5,
    Col6,
    Col7,
    Col8,
    App1,
    App2,
    App3,
    App4,
    App5,
    App6,
    App7,
    App8,
    App1[T1, T2, T3, T4, T5, ColIns1],
    App2[T1, T2, T3, T4, T5, ColIns2],
    App3[T1, T2, T3, T4, T5, ColIns3],
    App4[T1, T2, T3, T4, T5, ColIns4],
    App5[T1, T2, T3, T4, T5, ColIns5],
    App6[T1, T2, T3, T4, T5, ColIns6],
    App7[T1, T2, T3, T4, T5, ColIns7],
    App8[T1, T2, T3, T4, T5, ColIns8]
  ]
}
