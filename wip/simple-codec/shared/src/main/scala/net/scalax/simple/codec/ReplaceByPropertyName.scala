package net.scalax.simple.codec

import net.scalax.simple.codec.to_list_generic.{BasedInstalled, SimpleProduct1}

trait ReplaceByPropertyName[F[_[_]]] {
  def replace[T[_]](proName: String, proValue: Any): F[T] => F[T]
}

object ReplaceByPropertyName {

  class Builder[F[_[_]]] {
    def derivedImpl(
      indexOfPropertyName: IndexOfPropertyName[F],
      replaceByIndex: ReplaceByIndex[F],
      labelled: ModelLabelled[F]
    ): ReplaceByPropertyName[F] =
      new ReplaceByPropertyName[F] {
        override def replace[T[_]](proName: String, proValue: Any): F[T] => F[T] = {
          val indexInt = indexOfPropertyName.ofName(proName, labelled.modelLabelled)
          replaceByIndex.replace(indexInt, proValue)
        }
      }

    def derived(
      basedInstalled: BasedInstalled[F]
    ): ReplaceByPropertyName[F] = {
      val appender1 = SimpleProduct1[F].derived(basedInstalled.basedInstalled)
      derivedImpl(IndexOfPropertyName[F].derived(appender1), ReplaceByIndex[F].derived(appender1), basedInstalled.labelled)
    }
  }

  def apply[F[_[_]]]: Builder[F] = new Builder[F]

}
