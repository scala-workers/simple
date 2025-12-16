package nat.scalax.simple.append.support
package collectioncount8
package typeparameter0

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
  App1[_ <: Col1] <: Col1,
  App2[_ <: Col2] <: Col2,
  App3[_ <: Col3] <: Col3,
  App4[_ <: Col4] <: Col4,
  App5[_ <: Col5] <: Col5,
  App6[_ <: Col6] <: Col6,
  App7[_ <: Col7] <: Col7,
  App8[_ <: Col8] <: Col8,
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
  def next: SimpleAppender[
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
    App1[ColIns1],
    App2[ColIns2],
    App3[ColIns3],
    App4[ColIns4],
    App5[ColIns5],
    App6[ColIns6],
    App7[ColIns7],
    App8[ColIns8]
  ]
}
