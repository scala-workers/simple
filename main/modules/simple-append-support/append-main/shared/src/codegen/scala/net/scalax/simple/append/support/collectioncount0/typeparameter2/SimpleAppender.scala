package nat.scalax.simple.append.support
package collectioncount2
package typeparameter0

trait SimpleAppender[
  M2[_, _],
  Col1,
  Col2,
  App1[_ <: Col1] <: Col1,
  App2[_ <: Col2] <: Col2,
  ColIns1 <: Col1,
  ColIns2 <: Col2
] {
  def current: M2[ColIns1, ColIns2]
  def next: SimpleAppender[
    M2,
    Col1,
    Col2,
    App1,
    App2,
    App1[ColIns1],
    App2[ColIns2]
  ]
}
