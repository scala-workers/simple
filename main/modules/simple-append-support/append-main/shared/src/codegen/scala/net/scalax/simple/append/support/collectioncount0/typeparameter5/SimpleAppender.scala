package nat.scalax.simple.append.support
package collectioncount5
package typeparameter0

trait SimpleAppender[
  M5[_, _, _, _, _],
  Col1,
  Col2,
  Col3,
  Col4,
  Col5,
  App1[_ <: Col1] <: Col1,
  App2[_ <: Col2] <: Col2,
  App3[_ <: Col3] <: Col3,
  App4[_ <: Col4] <: Col4,
  App5[_ <: Col5] <: Col5,
  ColIns1 <: Col1,
  ColIns2 <: Col2,
  ColIns3 <: Col3,
  ColIns4 <: Col4,
  ColIns5 <: Col5
] {
  def current: M5[ColIns1, ColIns2, ColIns3, ColIns4, ColIns5]
  def next: SimpleAppender[
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
    App1[ColIns1],
    App2[ColIns2],
    App3[ColIns3],
    App4[ColIns4],
    App5[ColIns5]
  ]
}
