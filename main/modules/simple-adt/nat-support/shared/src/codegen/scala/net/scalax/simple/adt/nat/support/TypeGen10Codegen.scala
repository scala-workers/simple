package net.scalax.simple.adt
package nat
package support

trait Type10Gen1[M[_], N1[_, _, _, _, _, _, _, _, _, _]] {
  def gen10[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10]
    : M[N1[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10]]
}

trait Type10Gen2[M[_, _], N1[_, _, _, _, _, _, _, _, _, _], N2[_, _, _, _, _, _, _, _, _, _]] {
  def gen10[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10]: M[
    N1[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10],
    N2[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10]
  ]
}

trait Type10Gen3[M[_, _, _], N1[_, _, _, _, _, _, _, _, _, _], N2[_, _, _, _, _, _, _, _, _, _], N3[_, _, _, _, _, _, _, _, _, _]] {
  def gen10[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10]: M[
    N1[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10],
    N2[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10],
    N3[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10]
  ]
}

trait Type10Gen4[
  M[_, _, _, _],
  N1[_, _, _, _, _, _, _, _, _, _],
  N2[_, _, _, _, _, _, _, _, _, _],
  N3[_, _, _, _, _, _, _, _, _, _],
  N4[_, _, _, _, _, _, _, _, _, _]
] {
  def gen10[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10]: M[
    N1[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10],
    N2[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10],
    N3[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10],
    N4[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10]
  ]
}

trait Type10Gen5[
  M[_, _, _, _, _],
  N1[_, _, _, _, _, _, _, _, _, _],
  N2[_, _, _, _, _, _, _, _, _, _],
  N3[_, _, _, _, _, _, _, _, _, _],
  N4[_, _, _, _, _, _, _, _, _, _],
  N5[_, _, _, _, _, _, _, _, _, _]
] {
  def gen10[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10]: M[
    N1[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10],
    N2[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10],
    N3[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10],
    N4[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10],
    N5[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10]
  ]
}

trait Type10Gen6[
  M[_, _, _, _, _, _],
  N1[_, _, _, _, _, _, _, _, _, _],
  N2[_, _, _, _, _, _, _, _, _, _],
  N3[_, _, _, _, _, _, _, _, _, _],
  N4[_, _, _, _, _, _, _, _, _, _],
  N5[_, _, _, _, _, _, _, _, _, _],
  N6[_, _, _, _, _, _, _, _, _, _]
] {
  def gen10[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10]: M[
    N1[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10],
    N2[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10],
    N3[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10],
    N4[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10],
    N5[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10],
    N6[Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10]
  ]
}
