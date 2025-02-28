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

      type TakeHead[Col <: ColType] = Col match {
        case AppendColType[t, tail] => t
      }
      type TakeTail[Col <: ColType] <: ColType = Col match {
        case AppendColType[t, tail] => tail
      }
    }

    // ===
    /*trait GetSet[Item, HL <: ColType, FT <: NotHList.FType]
        extends NotHList.Mapper[
          NotHList.ZipInputType[NotHList.ItemInputType[Item, FT], NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, HL], FT]],
          NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, AppendColType[Item, HL]], FT]
        ] {
      type type1 = NotHList.ZipInputType[NotHList.ItemInputType[Item, FT], NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, HL], FT]]
      type type2 = NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, AppendColType[Item, HL]], FT]
      type head1 = NotHList.InputType.TakeHead[type1]
      type head2 = NotHList.InputType.TakeHead[type2]
      type tail1 = NotHList.InputType.TakeTail[type1]
      type tail2 = NotHList.InputType.TakeTail[type2]

      override def map(n: head1): head2        = append(n.asInstanceOf).asInstanceOf
      override def reverseMap(n: head2): head1 = unappend(n.asInstanceOf).asInstanceOf
    }*/

    /*object GetSet {
      @inline private val getsetModel: GetSet[Any, ColType, NotHList.FType] = new GetSet[Any, ColType, NotHList.FType] {
        GetSetImplSelf =>
        @inline override lazy val nextMapper = GetSetImplSelf.asInstanceOf
      }

      locally {
        getsetModel.nextMapper
      }

      @inline def value[Item, HL <: ColType, FT <: NotHList.FType]: GetSet[Item, HL, FT] =
        getsetModel.asInstanceOf[GetSet[Item, HL, FT]]
    }*/

    /*trait ZeroUnitMapper[FT <: NotHList.FType]
        extends NotHList.Mapper[NotHList.ZeroInputType, NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, ZeroColType], FT]] {
      type type1 = NotHList.ZeroInputType
      type type2 = NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, ZeroColType], FT]
      type head1 = NotHList.InputType.TakeHead[type1]
      type head2 = NotHList.InputType.TakeHead[type2]
      type tail1 = NotHList.InputType.TakeTail[type1]
      type tail2 = NotHList.InputType.TakeTail[type2]

      override def map(ia: head1)        = AppendContextSelf.zero.asInstanceOf
      override def reverseMap(ib: head2) = SimpleZero.value.asInstanceOf
    }*/

    /*object ZeroUnitMapper {
      @inline private val zeroUnitMapperProductImplImpl: ZeroUnitMapper[NotHList.FType] = new ZeroUnitMapper[NotHList.FType] {
        thisSelf =>
        @inline override lazy val nextMapper = thisSelf.asInstanceOf
      }

      locally {
        zeroUnitMapperProductImplImpl.nextMapper
      }

      @inline def zeroAppender[FT <: NotHList.FType]: ZeroUnitMapper[FT] = zeroUnitMapperProductImplImpl.asInstanceOf
    }*/

    // =============================================================================

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

      def tailHListLikeAppender: HListLikeAppender[ColType.TakeTail[X]]
    }

    trait PositiveHListLikeAppender[A, X <: ColType] extends HListLikeAppender[AppendColType[A, X]] {
      override def toHList[M[_ <: NotHList.InputType], FT <: NotHList.FType](monad: NotHList.AppendMonad[M])(
        func: NotHList.TypeGen[M, FT]
      ): M[NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, AppendColType[A, X]], FT]] = {
        val tailModel: M[NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, ColType.TakeTail[AppendColType[A, X]]], FT]] =
          tailHListLikeAppender.toHList[M, FT](monad)(func)
        positiveAppender[M, X, FT, A](monad, func, tailModel)
      }

      override def tailHListLikeAppender: HListLikeAppender[ColType.TakeTail[AppendColType[A, X]]]
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
    private def genZeroInputInstance[FT <: NotHList.FType]: ZeroInputInstance[FT] = ZeroInputInstanceImpl.asInstanceOf

    trait ZeroHListLikeAppender extends HListLikeAppender[ZeroColType] {
      SelfZeroHListLikeAppender =>
      override def toHList[M[_ <: NotHList.InputType], FT <: NotHList.FType](monad: NotHList.AppendMonad[M])(
        func: NotHList.TypeGen[M, FT]
      ): M[NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, ZeroColType], FT]]

      override def tailHListLikeAppender = SelfZeroHListLikeAppender.asInstanceOf
    }

    object ZeroHListLikeAppender {
      @inline val value: ZeroHListLikeAppender = new ZeroHListLikeAppender {
        ZeroHListLikeAppenderSelf =>
        override def toHList[M[_ <: NotHList.InputType], FT <: NotHList.FType](monad: NotHList.AppendMonad[M])(
          func: NotHList.TypeGen[M, FT]
        ): M[NotHList.FGenericInputType[[x[_]] =>> ColType.toM[x, ZeroColType], FT]] = monad.zero(genZeroInputInstance[FT])

        @annotation.threadUnsafe
        @inline
        override lazy val tailHListLikeAppender = super.tailHListLikeAppender
      }

      locally {
        value.tailHListLikeAppender
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

    /*type ZipInputType[In1 <: InputType, In2 <: InputType] <: InputType = (In1, In2) match {
      case (PositiveInputType[item1, tail1], PositiveInputType[item2, tail2]) =>
        PositiveInputType[AppendFunc[item1, item2], ZipInputType[tail1, tail2]]
      case (ZeroInputType, ZeroInputType) => ZeroInputType
    }*/

    type FGenericInputType[F[_[_]], FT <: FType] <: InputType = FT match {
      case PositiveFType[u, tail] => PositiveInputType[F[u], FGenericInputType[F, tail]]
      case ZeroFType              => ZeroInputType
    }

    // ===
    /*trait Mapper[InputA <: InputType, InputB <: InputType] {
      def map(ia: InputType.TakeHead[InputA]): InputType.TakeHead[InputB]
      def reverseMap(ib: InputType.TakeHead[InputB]): InputType.TakeHead[InputA]

      def nextMapper: Mapper[InputType.TakeTail[InputA], InputType.TakeTail[InputB]]
    }

    object Mapper {
      /*val unitInputType: Mapper[ZeroInputType, ZeroInputType] = new Mapper[ZeroInputType, ZeroInputType] {
        SelfUnitInputType =>
        override def map(ia: Unit): Unit        = ia
        override def reverseMap(ib: Unit): Unit = ib
        override lazy val nextMapper: Mapper[InputType.TakeTail[ZeroInputType], InputType.TakeTail[ZeroInputType]] =
          SelfUnitInputType.asInstanceOf
      }

      locally {
        unitInputType.nextMapper
      }*/
    }*/

    trait ConvertF[A1 <: InputType, B1 <: InputType, C1 <: InputType] {
      SelfConvertF =>

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

    /*trait FromOtherAppender[F[_[_]], G[_[_]]] extends Appender[G] {
      def fromModel[X[_]](f: F[X]): G[X]
      def toModel[X[_]](g: G[X]): F[X]
      def appenderF: Appender[F]

      private class InnerMapperHelper[FT <: FType] extends Mapper[FGenericInputType[F, FT], FGenericInputType[G, FT]] {
        SelfInnerMapperHelper =>
        type type1 = FGenericInputType[F, FT]
        type type2 = FGenericInputType[G, FT]
        type head1 = NotHList.InputType.TakeHead[type1]
        type head2 = NotHList.InputType.TakeHead[type2]
        type tail1 = NotHList.InputType.TakeTail[type1]
        type tail2 = NotHList.InputType.TakeTail[type2]

        override def map(ia: head1)        = fromModel(ia.asInstanceOf).asInstanceOf
        override def reverseMap(ib: head2) = toModel(ib.asInstanceOf).asInstanceOf
        override def nextMapper            = SelfInnerMapperHelper.asInstanceOf
      }

      private val value1 = new InnerMapperHelper[FType]

      override def toHList[M[_ <: InputType], FT <: FType](
        monad: AppendMonad[M]
      )(func: TypeGen[M, FT]): M[FGenericInputType[G, FT]] = {
        val mModel: M[FGenericInputType[F, FT]]                                 = appenderF.toHList[M, FT](monad)(func)
        val mapperA: Mapper[FGenericInputType[F, FT], FGenericInputType[G, FT]] = value1.asInstanceOf
        monad.to[FGenericInputType[F, FT], FGenericInputType[G, FT]](mModel)(mapperA)
      }
    }*/
  }

}

object SimpleProductXImpl2 extends SimpleProductXImpl2
