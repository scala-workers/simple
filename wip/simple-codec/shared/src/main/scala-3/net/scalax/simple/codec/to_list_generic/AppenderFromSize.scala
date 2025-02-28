package net.scalax.simple.codec
package to_list_generic

object AppenderFromSize {

  def tran[F[_[_]]](from: GenericAuxFrom[F], to: GenericAuxTo[F], modelSize: ModelSize[F]): SimpleProductX[F] = new SimpleProductX[F] {
    override val model: SimpleProductXImpl2.NotHList.Appender[F] = {
      val mImpl = new appender.LastMapHListLikeAppender[F, Any, appender.ColType] {

        override def append1In[M[_]](a1: M[Any], a2: appender.ColType.toM[M, appender.ColType]): F[M] =
          from.fromModel(appender.append[M[Any], appender.ColType.toM[M, appender.ColType]](a1, a2))

        override def takeHead1In[M[_]](a1: F[M]): M[Any] = appender.unappendHead[M[Any], Tuple](to.toModel(a1).asInstanceOf)

        override def takeTail1In[M[_]](a1: F[M]): appender.ColType.toM[M, appender.ColType] =
          appender.unappendTail[Any, appender.ColType.toM[M, appender.ColType]](to.toModel(a1).asInstanceOf)

        override def tailHListLikeAppender: appender.HListLikeAppender[appender.ColType] =
          GetAppender.get(modelSize.modelSize - 1).asInstanceOf[appender.HListLikeAppender[appender.ColType]]
      }

      mImpl.asInstanceOf[SimpleProductXImpl2.NotHList.Appender[F]]
    }
  }

  val appender: SimpleProductXImpl2.AppendContext[Tuple, EmptyTuple, ({ type Ad[Head, TU <: Tuple] = Head *: TU })#Ad] =
    new SimpleProductXImpl2.AppendContext[Tuple, EmptyTuple, ({ type Ad[Head, TU <: Tuple] = Head *: TU })#Ad] {
      override def append[H, T <: Tuple](h: H, t: T): H *: T = h *: t
      override def unappendHead[H, T <: Tuple](a: H *: T): H = a.head
      override def unappendTail[H, T <: Tuple](a: H *: T): T = a.tail
      override def zero: EmptyTuple                          = EmptyTuple
    }

  object GetAppender {
    type F1[_[_]] = Tuple

    def get(i: Int): SimpleProductXImpl2.NotHList.Appender[F1] = {
      if (i >= appenderList.size) {
        this.synchronized {
          while (i >= appenderList.size) {
            if (appenderList.headOption.isDefined) {
              val cutHead = appenderList.head
                .asInstanceOf[appender.HListLikeAppender[appender.ColType.TakeTail[appender.AppendColType[Any, appender.ColType]]]]

              val newItem = new appender.PositiveHListLikeAppender[Any, appender.ColType] {
                override val tailHListLikeAppender
                  : appender.HListLikeAppender[appender.ColType.TakeTail[appender.AppendColType[Any, appender.ColType]]] = cutHead
              }

              appenderList = newItem.asInstanceOf[SimpleProductXImpl2.NotHList.Appender[F1]] :: appenderList
            } else {
              appenderList = List(appender.ZeroHListLikeAppender.value.asInstanceOf[SimpleProductXImpl2.NotHList.Appender[F1]])
            }
          }

          appenderArray = appenderList.reverse.to(Array)
        }
      }

      appenderArray(i)
    }

    private var appenderList: List[SimpleProductXImpl2.NotHList.Appender[F1]]   = List.empty
    private var appenderArray: Array[SimpleProductXImpl2.NotHList.Appender[F1]] = Array.empty
  }

}
