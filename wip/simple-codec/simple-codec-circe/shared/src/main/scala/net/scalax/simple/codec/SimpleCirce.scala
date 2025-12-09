package net.scalax.simple
package codec

import io.circe.Decoder.Result
import io.circe._
import io.circe.syntax._
import net.scalax.simple.adt.nat.support.{SimpleProduct3, SimpleProductContextX}
import net.scalax.simple.codec.to_list_generic.{BasedInstalledLabelled, PojoInstance}

trait SimpleJsonEncodeLabelled[F[_[_]]] {
  SimpleJsonEncodeLabelledSelf =>

  def jsonEncodeLabelled: F[({ type NamedF[_] = String })#NamedF]

  def encode: SimpleJsonCodecLabelled.Updater[F[({ type NamedF[_] = String })#NamedF], SimpleJsonEncodeLabelled[F]] =
    new SimpleJsonCodecLabelled.Updater[F[({ type NamedF[_] = String })#NamedF], SimpleJsonEncodeLabelled[F]] {
      override def update(
        m: F[({ type NamedF[_] = String })#NamedF] => F[({ type NamedF[_] = String })#NamedF]
      ): SimpleJsonEncodeLabelled[F] = new SimpleJsonEncodeLabelled[F] {
        override def jsonEncodeLabelled: F[({ type NamedF[_] = String })#NamedF] = m(SimpleJsonEncodeLabelledSelf.jsonEncodeLabelled)
      }
    }
}

trait SimpleJsonDecodeLabelled[F[_[_]]] {
  SimpleJsonDecodeLabelledSelf =>

  def jsonDecodeLabelled: F[({ type NamedF[_] = String })#NamedF]

  def decode: SimpleJsonCodecLabelled.Updater[F[({ type NamedF[_] = String })#NamedF], SimpleJsonDecodeLabelled[F]] =
    new SimpleJsonCodecLabelled.Updater[F[({ type NamedF[_] = String })#NamedF], SimpleJsonDecodeLabelled[F]] {
      override def update(
        m: F[({ type NamedF[_] = String })#NamedF] => F[({ type NamedF[_] = String })#NamedF]
      ): SimpleJsonDecodeLabelled[F] = new SimpleJsonDecodeLabelled[F] {
        override def jsonDecodeLabelled: F[({ type NamedF[_] = String })#NamedF] = m(SimpleJsonDecodeLabelledSelf.jsonDecodeLabelled)
      }
    }
}

trait SimpleJsonCodecLabelled[F[_[_]]] extends SimpleJsonEncodeLabelled[F] with SimpleJsonDecodeLabelled[F] {
  SimpleJsonCodecLabelledSelf =>

  override def jsonEncodeLabelled: F[({ type NamedF[_] = String })#NamedF]
  override def jsonDecodeLabelled: F[({ type NamedF[_] = String })#NamedF]

  override def encode: SimpleJsonCodecLabelled.Updater[F[({ type NamedF[_] = String })#NamedF], SimpleJsonCodecLabelled[F]] =
    new SimpleJsonCodecLabelled.Updater[F[({ type NamedF[_] = String })#NamedF], SimpleJsonCodecLabelled[F]] {
      override def update(
        m: F[({ type NamedF[_] = String })#NamedF] => F[({ type NamedF[_] = String })#NamedF]
      ): SimpleJsonCodecLabelled[F] = new SimpleJsonCodecLabelled[F] {
        override def jsonEncodeLabelled: F[({ type NamedF[_] = String })#NamedF] = m(SimpleJsonCodecLabelledSelf.jsonEncodeLabelled)
        override def jsonDecodeLabelled: F[({ type NamedF[_] = String })#NamedF] = SimpleJsonCodecLabelledSelf.jsonDecodeLabelled
      }
    }

  override def decode: SimpleJsonCodecLabelled.Updater[F[({ type NamedF[_] = String })#NamedF], SimpleJsonCodecLabelled[F]] =
    new SimpleJsonCodecLabelled.Updater[F[({ type NamedF[_] = String })#NamedF], SimpleJsonCodecLabelled[F]] {
      override def update(
        m: F[({ type NamedF[_] = String })#NamedF] => F[({ type NamedF[_] = String })#NamedF]
      ): SimpleJsonCodecLabelled[F] = new SimpleJsonCodecLabelled[F] {
        override def jsonEncodeLabelled: F[({ type NamedF[_] = String })#NamedF] = m(SimpleJsonCodecLabelledSelf.jsonEncodeLabelled)
        override def jsonDecodeLabelled: F[({ type NamedF[_] = String })#NamedF] = SimpleJsonCodecLabelledSelf.jsonDecodeLabelled
      }
    }

  def codec: SimpleJsonCodecLabelled.Updater[F[({ type NamedF[_] = String })#NamedF], SimpleJsonCodecLabelled[F]] =
    new SimpleJsonCodecLabelled.Updater[F[({ type NamedF[_] = String })#NamedF], SimpleJsonCodecLabelled[F]] {
      override def update(
        m: F[({ type NamedF[_] = String })#NamedF] => F[({ type NamedF[_] = String })#NamedF]
      ): SimpleJsonCodecLabelled[F] = new SimpleJsonCodecLabelled[F] {
        override def jsonEncodeLabelled: F[({ type NamedF[_] = String })#NamedF] = m(SimpleJsonCodecLabelledSelf.jsonEncodeLabelled)
        override def jsonDecodeLabelled: F[({ type NamedF[_] = String })#NamedF] = m(SimpleJsonCodecLabelledSelf.jsonDecodeLabelled)
      }
    }
}

object SimpleJsonCodecLabelled {

  trait Updater[T, +U] {
    def update(m: T => T): U
  }

  class Builder[F[_[_]]] {
    type Target = SimpleJsonCodecLabelled[F]

    def derived(implicit bi: BasedInstalledLabelled[F]): SimpleJsonCodecLabelled[F] = new SimpleJsonCodecLabelled[F] {
      override def jsonEncodeLabelled: F[({ type NamedF[_] = String })#NamedF] = bi.labelled.modelLabelled
      override def jsonDecodeLabelled: F[({ type NamedF[_] = String })#NamedF] = bi.labelled.modelLabelled
    }

    def fromInstance(nModel: F[({ type NamedF[_] = String })#NamedF]): SimpleJsonCodecLabelled[F] = new SimpleJsonCodecLabelled[F] {
      override def jsonEncodeLabelled: F[({ type NamedF[_] = String })#NamedF] = nModel
      override def jsonDecodeLabelled: F[({ type NamedF[_] = String })#NamedF] = nModel
    }
  }

  type F[F[_[_]]] = SimpleJsonCodecLabelled[F]

  object F {
    def apply[ModelF[_[_]]]: Builder[ModelF] = new Builder[ModelF]
  }

  type Pojo[Model] = SimpleJsonCodecLabelled[({ type TR[UMF[_]] = PojoInstance[UMF, Model] })#TR]

  object Pojo {
    def apply[Model]: Builder[({ type TR[UMF[_]] = PojoInstance[UMF, Model] })#TR] =
      new Builder[({ type TR[UMF[_]] = PojoInstance[UMF, Model] })#TR]
  }

}
