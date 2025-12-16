package nat.scalax.simple.append.support
package collectioncount4
package typeparameter0

trait SimpleAppender[
  M4[_, _, _, _],
  Col1,
  Col2,
  Col3,
  Col4,
  App1[_ <: Col1] <: Col1,
  App2[_ <: Col2] <: Col2,
  App3[_ <: Col3] <: Col3,
  App4[_ <: Col4] <: Col4,
  ColIns1 <: Col1,
  ColIns2 <: Col2,
  ColIns3 <: Col3,
  ColIns4 <: Col4
] {
  def current: M4[ColIns1, ColIns2, ColIns3, ColIns4]
  def next: SimpleAppender[
    M4,
    Col1,
    Col2,
    Col3,
    Col4,
    App1,
    App2,
    App3,
    App4,
    App1[ColIns1],
    App2[ColIns2],
    App3[ColIns3],
    App4[ColIns4]
  ]
}
