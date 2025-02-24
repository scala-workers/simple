package net.scalax.simple.codec
package to_list_generic

object AppenderFromSize {

  def tran[F[_[_]]](from: GenericAuxFrom[F], to: GenericAuxTo[F], modelSize: ModelSize[F]): SimpleProductX[F] = new SimpleProductX[F] {
    override val model: SimpleProductXImpl.NotHList.Appender[F] = new SimpleProductXImpl.NotHList.FromOtherAppender[GetAppender.F1, F] {
      override def fromModel[X[_]](f: GetAppender.F1[X]): F[X] = from.fromModel(f).asInstanceOf[F[X]]
      override def toModel[X[_]](g: F[X]): GetAppender.F1[X] =
        to.toModel(g.asInstanceOf[F[({ type FX[_] = Any })#FX]]).asInstanceOf[GetAppender.F1[X]]
      override def appenderF: SimpleProductXImpl.NotHList.Appender[GetAppender.F1] = GetAppender.get(modelSize.modelSize)
    }
  }

  val appender: SimpleProductXImpl.AppendContext[Tuple, EmptyTuple, ({ type Ad[Head, TU <: Tuple] = Head *: TU })#Ad] =
    new SimpleProductXImpl.AppendContext[Tuple, EmptyTuple, ({ type Ad[Head, TU <: Tuple] = Head *: TU })#Ad] {
      override def append[Head, Tail <: Tuple](h: (Head, Tail)): Head *: Tail          = h._1 *: h._2
      override def unappend[Head, Tail <: Tuple](dataList: Head *: Tail): (Head, Tail) = (dataList.head, dataList.tail)
      override val zero: EmptyTuple                                                    = EmptyTuple
    }

  object GetAppender {
    type F1[_[_]] = Tuple

    def get(i: Int): SimpleProductXImpl.NotHList.Appender[F1] = {
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

              appenderList = newItem.asInstanceOf[SimpleProductXImpl.NotHList.Appender[F1]] :: appenderList
            } else {
              appenderList = List(appender.ZeroHListLikeAppender.value.asInstanceOf[SimpleProductXImpl.NotHList.Appender[F1]])
            }
          }

          appenderArray = appenderList.reverse.to(Array)
        }
      }

      appenderArray(i)
    }

    private var appenderList: List[SimpleProductXImpl.NotHList.Appender[F1]]   = List.empty
    private var appenderArray: Array[SimpleProductXImpl.NotHList.Appender[F1]] = Array.empty
  }

}
