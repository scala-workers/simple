package nat.scalax.simple.append.support
package collectioncount3
package typeparameter0

trait SimpleAppender[
  M3[_, _, _],
  Col1,
  Col2,
  Col3,
  App1[_ <: Col1] <: Col1,
  App2[_ <: Col2] <: Col2,
  App3[_ <: Col3] <: Col3,
  ColIns1 <: Col1,
  ColIns2 <: Col2,
  ColIns3 <: Col3
] {
  def current: M3[ColIns1, ColIns2, ColIns3]
  def next: SimpleAppender[
    M3,
    Col1,
    Col2,
    Col3,
    App1,
    App2,
    App3,
    App1[ColIns1],
    App2[ColIns2],
    App3[ColIns3]
  ]
}
