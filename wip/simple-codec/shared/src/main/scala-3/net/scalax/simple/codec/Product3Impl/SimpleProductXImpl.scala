package net.scalax.simple.codec
package to_list_generic

class SimpleProductXImpl2 {
  SimpleProduct3Self =>

  trait AppendContext[HListLike, ZeroType <: HListLike, AppendType[_, _ <: HListLike] <: HListLike] {
    AppendContextSelf =>

    def zero: ZeroType
    def append[H, T <: HListLike](h: H, t: T): AppendType[H, T]
    def unappendHead[H, T <: HListLike](a: AppendType[H, T]): H
    def unappendTail[H, T <: HListLike](a: AppendType[H, T]): T

    trait ColType
    trait AppendColType[T, TailType <: ColType] extends ColType
    trait ZeroColType                           extends ColType

    object ColType {
      type toM[M[_], Col <: ColType] <: HListLike = Col match {
        case ZeroColType            => ZeroType
        case AppendColType[t, tail] => AppendType[M[t], toM[M, tail]]
      }
    }

    class InSetImpl1[X1, FT1X <: NotHList.FType, CT1X <: ColType]
        extends NotHList.ConvertF[
          NotHList.ItemInputType[X1, FT1X],
          NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, CT1X], FT1X],
          NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, AppendColType[X1, CT1X]], FT1X]
        ] {
      SelfInSetImpl1 =>
      override def from(
        a: NotHList.InputType.TakeHead[NotHList.ItemInputType[X1, FT1X]],
        b: NotHList.InputType.TakeHead[NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, CT1X], FT1X]]
      ): NotHList.InputType.TakeHead[NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, AppendColType[X1, CT1X]], FT1X]] =
        append(a, b.asInstanceOf).asInstanceOf

      override def takeHead(
        c: NotHList.InputType.TakeHead[NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, AppendColType[X1, CT1X]], FT1X]]
      ): NotHList.InputType.TakeHead[NotHList.ItemInputType[X1, FT1X]] = unappendHead(c.asInstanceOf).asInstanceOf

      override def takeTail(
        c: NotHList.InputType.TakeHead[NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, AppendColType[X1, CT1X]], FT1X]]
      ): NotHList.InputType.TakeHead[NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, CT1X], FT1X]] = unappendTail(
        c.asInstanceOf
      ).asInstanceOf

      override def next = SelfInSetImpl1.asInstanceOf
    }

    val InSetImpl1: InSetImpl1[Any, NotHList.FType, ColType] = new InSetImpl1[Any, NotHList.FType, ColType] {
      @annotation.threadUnsafe
      @inline
      override lazy val next = super.next
    }

    locally {
      InSetImpl1.next
    }

    def InSet[X1, FT1X <: NotHList.FType, CT1X <: ColType]: InSetImpl1[X1, FT1X, CT1X] = InSetImpl1.asInstanceOf

    def positiveAppender[M1[_ <: NotHList.InputType], C <: ColType, FT <: NotHList.FType, T](
      appendMonad: NotHList.AppendMonad[M1],
      typeGen: NotHList.TypeGen[M1, FT],
      m: M1[NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, C], FT]]
    ): M1[NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, AppendColType[T, C]], FT]] = appendMonad.zip(InSet[T, FT, C], typeGen[T], m)

    // ===
    trait HListLikeAppender[X <: ColType] extends NotHList.Appender[[x[_]] =>> ColType.toM[x, X]] {
      override def toHList[M[_ <: NotHList.InputType], FT <: NotHList.FType](monad: NotHList.AppendMonad[M])(
        func: NotHList.TypeGen[M, FT]
      ): M[NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, X], FT]]
    }

    trait PositiveHListLikeAppender[A, X <: ColType] extends HListLikeAppender[AppendColType[A, X]] {
      override def toHList[M[_ <: NotHList.InputType], FT <: NotHList.FType](monad: NotHList.AppendMonad[M])(
        func: NotHList.TypeGen[M, FT]
      ): M[NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, AppendColType[A, X]], FT]] = {
        val tailModel: M[NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, X], FT]] =
          tailHListLikeAppender.toHList[M, FT](monad)(func)
        positiveAppender[M, X, FT, A](monad, func, tailModel)
      }

      def tailHListLikeAppender: HListLikeAppender[X]
    }

    private class ZeroInputInstance[FT <: NotHList.FType]
        extends NotHList.InputInstance[NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, ZeroColType], FT]] {
      SelfZeroInputInstance =>
      override val item: NotHList.InputType.TakeHead[NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, ZeroColType], FT]] =
        AppendContextSelf.zero.asInstanceOf
      override def andThen = SelfZeroInputInstance.asInstanceOf
    }
    private val ZeroInputInstanceImpl: ZeroInputInstance[NotHList.FType] = new ZeroInputInstance[NotHList.FType] {
      @annotation.threadUnsafe
      @inline
      override lazy val andThen = super.andThen
    }
    locally {
      ZeroInputInstanceImpl.andThen
    }
    private def genZeroInputInstance[FT <: NotHList.FType]: ZeroInputInstance[FT] = ZeroInputInstanceImpl.asInstanceOf

    object ZeroHListLikeAppender {
      @inline val value: HListLikeAppender[ZeroColType] = new HListLikeAppender[ZeroColType] {
        @inline override def toHList[M[_ <: NotHList.InputType], FT <: NotHList.FType](monad: NotHList.AppendMonad[M])(
          func: NotHList.TypeGen[M, FT]
        ): M[NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, ZeroColType], FT]] = monad.zero(genZeroInputInstance[FT])
      }
    }

    trait LastMapHListLikeAppender[U[_[_]], A, X <: ColType] extends NotHList.Appender[U] {
      override def toHList[M[_ <: NotHList.InputType], FT <: NotHList.FType](monad: NotHList.AppendMonad[M])(
        func: NotHList.TypeGen[M, FT]
      ): M[NotHList.FGenericInputType[U, FT]] = {
        val tailModel: M[NotHList.FGenericInputType[[x1[_]] =>> ColType.toM[x1, X], FT]] = tailHListLikeAppender.toHList(monad)(func)

        class AB[FT111 <: NotHList.FType]
            extends NotHList.ConvertF[
              NotHList.ItemInputType[A, FT111],
              NotHList.FGenericInputType[[x1[_]] =>> ColType.toM[x1, X], FT111],
              NotHList.FGenericInputType[U, FT111]
            ] {
          SelfABInstance =>

          override def from(
            a: NotHList.InputType.TakeHead[NotHList.ItemInputType[A, FT111]],
            b: NotHList.InputType.TakeHead[NotHList.FGenericInputType[[x1[_]] =>> ColType.toM[x1, X], FT111]]
          ): NotHList.InputType.TakeHead[NotHList.FGenericInputType[U, FT111]] =
            append1In[[_] =>> Any](a.asInstanceOf, b.asInstanceOf).asInstanceOf

          override def takeHead(
            c: NotHList.InputType.TakeHead[NotHList.FGenericInputType[U, FT111]]
          ): NotHList.InputType.TakeHead[NotHList.ItemInputType[A, FT111]] = takeHead1In[[_] =>> Any](c.asInstanceOf).asInstanceOf

          override def takeTail(
            c: NotHList.InputType.TakeHead[NotHList.FGenericInputType[U, FT111]]
          ): NotHList.InputType.TakeHead[NotHList.FGenericInputType[[x1[_]] =>> ColType.toM[x1, X], FT111]] = takeTail1In[[_] =>> Any](
            c.asInstanceOf
          ).asInstanceOf

          override def next = SelfABInstance.asInstanceOf
        }

        val abInstance: AB[FT] = new AB[FT]

        monad.zip(abInstance, func[A], tailModel)
      }

      def append1In[M[_]](a1: M[A], a2: ColType.toM[M, X]): U[M]
      def takeHead1In[M[_]](a1: U[M]): M[A]
      def takeTail1In[M[_]](a1: U[M]): ColType.toM[M, X]

      def tailHListLikeAppender: HListLikeAppender[X]
    }

  }

  object NotHList {
    NotHListSelf =>

    // ===
    trait FType
    trait PositiveFType[toF[_], Next <: FType] extends FType
    trait ZeroFType                            extends FType

    // ===
    trait InputType
    trait PositiveInputType[Item, AndThen <: InputType] extends InputType
    trait ZeroInputType                                 extends InputType
    object InputType {
      type TakeHead[t <: InputType] <: Any = t match {
        case PositiveInputType[i, u] => i
      }
      type TakeTail[t <: InputType] <: InputType = t match {
        case PositiveInputType[i, u] => u
      }
    }

    type ItemInputType[T, FT <: FType] <: InputType = FT match {
      case PositiveFType[u, n] => PositiveInputType[u[T], ItemInputType[T, n]]
      case ZeroFType           => ZeroInputType
    }

    type FGenericInputType[F[_[_]], FT <: FType] <: InputType = FT match {
      case PositiveFType[u, tail] => PositiveInputType[F[u], FGenericInputType[F, tail]]
      case ZeroFType              => ZeroInputType
    }

    trait ConvertF[A1 <: InputType, B1 <: InputType, C1 <: InputType] {
      def from(a: InputType.TakeHead[A1], b: InputType.TakeHead[B1]): InputType.TakeHead[C1]
      def takeHead(c: InputType.TakeHead[C1]): InputType.TakeHead[A1]
      def takeTail(c: InputType.TakeHead[C1]): InputType.TakeHead[B1]

      def next: ConvertF[InputType.TakeTail[A1], InputType.TakeTail[B1], InputType.TakeTail[C1]]
    }

    trait InputInstance[I <: InputType] {
      def item: InputType.TakeHead[I]
      def andThen: InputInstance[InputType.TakeTail[I]]
    }

    // ===
    trait AppendMonad[M[_ <: InputType]] {
      def zip[A <: InputType, B <: InputType, C <: InputType](convert: ConvertF[A, B, C], ma: M[A], mb: M[B]): M[C]
      def zero[N <: InputType](t: InputInstance[N]): M[N]
    }

    // ===
    trait TypeGen[M2[_ <: InputType], FT <: FType] {
      def apply[T]: M2[ItemInputType[T, FT]]
    }

    // ===
    trait Appender[F[_[_]]] {
      def toHList[M[_ <: InputType], FT <: FType](monad: AppendMonad[M])(func: TypeGen[M, FT]): M[FGenericInputType[F, FT]]
    }
  }

}

object SimpleProductXImpl2 extends SimpleProductXImpl2
