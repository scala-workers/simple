package net.scalax.simple.codec

import net.scalax.simple.codec.to_list_generic.{BasedInstalled, PojoInstance}
import slick.ast.ColumnOption

trait ColumnOpt[T] extends (ColumnOpt.Opt[T] => ColumnOpt[T]) {
  def name: Option[String]
  def opts: Seq[ColumnOption[T]]

  def apply(opt: ColumnOpt.Opt[T]): ColumnOpt[T]
}

object ColumnOpt {
  ColumnOptSelf =>

  trait Opt[T] {
    def rawColumn(name: Option[String], opts: ColumnOption[T]*): ColumnOpt[T] = {
      val name1 = name
      val opts1 = opts
      new ColumnOpt[T] {
        override def name: Option[String]       = name1
        override def opts: Seq[ColumnOption[T]] = opts1
      }
    }
    def column(ssdfsdf: Int): String
  }
  object Opt {
    def value[T]: ColumnOptSelf.Opt[T] = new ColumnOptSelf.Opt[T] {
      //
    }
  }

}
