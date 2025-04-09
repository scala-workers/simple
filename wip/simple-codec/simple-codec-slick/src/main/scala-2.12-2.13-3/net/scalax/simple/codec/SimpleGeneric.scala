package net.scalax.simple.codec

import slick.jdbc.JdbcProfile

class SlickCompatAlias[V <: JdbcProfile](val profile: V) {
  type SqlColumnOptions = profile.SqlColumnOptions
}

object SlickCompatAlias {
  def build[T <: JdbcProfile](implicit p: T): SlickCompatAlias[p.type] = new SlickCompatAlias(profile = p)
}
