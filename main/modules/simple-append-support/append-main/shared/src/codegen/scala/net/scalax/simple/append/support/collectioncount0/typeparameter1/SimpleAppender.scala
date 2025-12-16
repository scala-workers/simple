package nat.scalax.simple.append.support
package collectioncount1
package typeparameter0

trait SimpleAppender[
  M1[_],
  Col1,
  App1[_ <: Col1] <: Col1,
  ColIns1 <: Col1
] {
  def current: M1[ColIns1]
  def next: SimpleAppender[
    M1,
    Col1,
    App1,
    App1[ColIns1]
  ]
}
