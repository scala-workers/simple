package net.scalax.simple.adt
package instance
package support

object AppendTail {
  AppendTailSelf =>

  trait AppendContent1[Content[_ <: AdtCoProduct] <: AdtCoProduct] {
    AppendContent1Self =>

    def appendTail[Head, Zero](
      co: AdtCoProduct.UsePositive[Head, Content[AdtCoProduct.UseOne[Zero]]]
    ): Content[AdtCoProduct.UsePositive[Zero, AdtCoProduct.UseOne[Head]]]

    def appendWithFunction[Head, Zero, Target](
      co: AdtCoProduct.UsePositive[Head, Content[AdtCoProduct.UseOne[Zero]]],
      func: Head => Target
    ): Content[AdtCoProduct.UsePositive[Zero, AdtCoProduct.UseOne[Target]]] = {
      val newCo: AdtCoProduct.UsePositive[Target, Content[AdtCoProduct.UseOne[Zero]]] =
        co.fold[AdtCoProduct.UsePositive[Target, Content[AdtCoProduct.UseOne[Zero]]]](
          (head: Head) => AdtCoProduct.UsePositive.left[Target, Content[AdtCoProduct.UseOne[Zero]]](func(head)),
          (t: Content[AdtCoProduct.UseOne[Zero]]) => AdtCoProduct.UsePositive.right[Target, Content[AdtCoProduct.UseOne[Zero]]](t)
        )

      AppendContent1Self.appendTail[Target, Zero](newCo)
    }

    def append[H1]: AppendContent1[({ type C1[U1 <: AdtCoProduct] = AdtCoProduct.UsePositive[H1, Content[U1]] })#C1] =
      AppendTailSelf.append[H1, Content](AppendContent1Self)
  }

  def append[H1, Content[_ <: AdtCoProduct] <: AdtCoProduct](
    content: AppendContent1[Content]
  ): AppendContent1[({ type C1[U1 <: AdtCoProduct] = AdtCoProduct.UsePositive[H1, Content[U1]] })#C1] =
    new AppendContent1[({ type C1[U1 <: AdtCoProduct] = AdtCoProduct.UsePositive[H1, Content[U1]] })#C1] {
      override def appendTail[Head, Zero](
        co: AdtCoProduct.UsePositive[Head, AdtCoProduct.UsePositive[H1, Content[AdtCoProduct.UseOne[Zero]]]]
      ): AdtCoProduct.UsePositive[H1, Content[AdtCoProduct.UsePositive[Zero, AdtCoProduct.UseOne[Head]]]] = {
        val newCo: AdtCoProduct.UsePositive[H1, AdtCoProduct.UsePositive[Head, Content[AdtCoProduct.UseOne[Zero]]]] =
          co.fold[AdtCoProduct.UsePositive[H1, AdtCoProduct.UsePositive[Head, Content[AdtCoProduct.UseOne[Zero]]]]](
            (head: Head) =>
              AdtCoProduct.UsePositive.right[H1, AdtCoProduct.UsePositive[Head, Content[AdtCoProduct.UseOne[Zero]]]](
                AdtCoProduct.UsePositive.left[Head, Content[AdtCoProduct.UseOne[Zero]]](head)
              ),
            (c: AdtCoProduct.UsePositive[H1, Content[AdtCoProduct.UseOne[Zero]]]) =>
              c.fold[AdtCoProduct.UsePositive[H1, AdtCoProduct.UsePositive[Head, Content[AdtCoProduct.UseOne[Zero]]]]](
                (h1: H1) => AdtCoProduct.UsePositive.left[H1, AdtCoProduct.UsePositive[Head, Content[AdtCoProduct.UseOne[Zero]]]](h1),
                (aitem: Content[AdtCoProduct.UseOne[Zero]]) =>
                  AdtCoProduct.UsePositive.right[H1, AdtCoProduct.UsePositive[Head, Content[AdtCoProduct.UseOne[Zero]]]](
                    AdtCoProduct.UsePositive.right[Head, Content[AdtCoProduct.UseOne[Zero]]](aitem)
                  )
              )
          )

        newCo.fold[AdtCoProduct.UsePositive[H1, Content[AdtCoProduct.UsePositive[Zero, AdtCoProduct.UseOne[Head]]]]](
          (h1: H1) => AdtCoProduct.UsePositive.left[H1, Content[AdtCoProduct.UsePositive[Zero, AdtCoProduct.UseOne[Head]]]](h1),
          (c: AdtCoProduct.UsePositive[Head, Content[AdtCoProduct.UseOne[Zero]]]) =>
            AdtCoProduct.UsePositive
              .right[H1, Content[AdtCoProduct.UsePositive[Zero, AdtCoProduct.UseOne[Head]]]](content.appendTail[Head, Zero](c))
        )
      }
    }

  val zero: AppendContent1[({ type X1[U <: AdtCoProduct] = U })#X1] = new AppendContent1[({ type X1[U <: AdtCoProduct] = U })#X1] {
    override def appendTail[Head, Zero](
      co: AdtCoProduct.UsePositive[Head, AdtCoProduct.UseOne[Zero]]
    ): AdtCoProduct.UsePositive[Zero, AdtCoProduct.UseOne[Head]] = co.fold[AdtCoProduct.UsePositive[Zero, AdtCoProduct.UseOne[Head]]](
      (head: Head) => AdtCoProduct.UsePositive.right[Zero, AdtCoProduct.UseOne[Head]](new AdtCoProduct.UseOne(head)),
      (zero: AdtCoProduct.UseOne[Zero]) => AdtCoProduct.UsePositive.left[Zero, AdtCoProduct.UseOne[Head]](zero.value)
    )
  }

}
