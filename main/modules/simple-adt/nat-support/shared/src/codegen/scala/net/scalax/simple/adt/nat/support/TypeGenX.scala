package net.scalax.simple.adt
package nat
package support

trait TypeGen1[M[_], N1[_]] extends Type10Gen1[M, ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N1[M1] })#TypeX] {
  TypeGen1Self =>
  def gen[T]: M[N1[T]]
  override final def gen10[T, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10]: M[N1[T]] = TypeGen1Self.gen[T]
}

trait TypeGen2[M[_, _], N1[_], N2[_]]
    extends Type10Gen2[
      M,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N1[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N2[M1] })#TypeX
    ] {
  TypeGen2Self =>
  def gen[T]: M[N1[T], N2[T]]
  override final def gen10[T, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10]: M[N1[T], N2[T]] = TypeGen2Self.gen[T]
}

trait TypeGen3[M[_, _, _], N1[_], N2[_], N3[_]]
    extends Type10Gen3[
      M,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N1[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N2[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N3[M1] })#TypeX
    ] {
  TypeGen3Self =>
  def gen[T]: M[N1[T], N2[T], N3[T]]
  override final def gen10[T, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10]: M[N1[T], N2[T], N3[T]] = TypeGen3Self.gen[T]
}

trait TypeGen4[M[_, _, _, _], N1[_], N2[_], N3[_], N4[_]]
    extends Type10Gen4[
      M,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N1[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N2[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N3[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N4[M1] })#TypeX
    ] {
  TypeGen4Self =>
  def gen[T]: M[N1[T], N2[T], N3[T], N4[T]]
  override final def gen10[T, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10]: M[N1[T], N2[T], N3[T], N4[T]] =
    TypeGen4Self.gen[T]
}

trait TypeGen5[M[_, _, _, _, _], N1[_], N2[_], N3[_], N4[_], N5[_]]
    extends Type10Gen5[
      M,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N1[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N2[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N3[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N4[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N5[M1] })#TypeX
    ] {
  TypeGen5Self =>
  def gen[T]: M[N1[T], N2[T], N3[T], N4[T], N5[T]]
  override final def gen10[T, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10]: M[N1[T], N2[T], N3[T], N4[T], N5[T]] =
    TypeGen5Self.gen[T]
}

trait TypeGen6[M[_, _, _, _, _, _], N1[_], N2[_], N3[_], N4[_], N5[_], N6[_]]
    extends Type10Gen6[
      M,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N1[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N2[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N3[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N4[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N5[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N6[M1] })#TypeX
    ] {
  TypeGen6Self =>
  def gen[T]: M[N1[T], N2[T], N3[T], N4[T], N5[T], N6[T]]
  override final def gen10[T, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10]: M[N1[T], N2[T], N3[T], N4[T], N5[T], N6[T]] =
    TypeGen6Self.gen[T]
}

trait TypeGen7[M[_, _, _, _, _, _, _], N1[_], N2[_], N3[_], N4[_], N5[_], N6[_], N7[_]]
    extends Type10Gen7[
      M,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N1[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N2[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N3[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N4[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N5[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N6[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N7[M1] })#TypeX
    ] {
  TypeGen7Self =>
  def gen[T]: M[N1[T], N2[T], N3[T], N4[T], N5[T], N6[T], N7[T]]
  override final def gen10[T, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10]
    : M[N1[T], N2[T], N3[T], N4[T], N5[T], N6[T], N7[T]] = TypeGen7Self.gen[T]
}

trait TypeGen8[M[_, _, _, _, _, _, _, _], N1[_], N2[_], N3[_], N4[_], N5[_], N6[_], N7[_], N8[_]]
    extends Type10Gen8[
      M,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N1[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N2[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N3[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N4[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N5[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N6[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N7[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N8[M1] })#TypeX
    ] {
  TypeGen8Self =>
  def gen[T]: M[N1[T], N2[T], N3[T], N4[T], N5[T], N6[T], N7[T], N8[T]]
  override final def gen10[T, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10]
    : M[N1[T], N2[T], N3[T], N4[T], N5[T], N6[T], N7[T], N8[T]] = TypeGen8Self.gen[T]
}

trait TypeGen9[M[_, _, _, _, _, _, _, _, _], N1[_], N2[_], N3[_], N4[_], N5[_], N6[_], N7[_], N8[_], N9[_]]
    extends Type10Gen9[
      M,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N1[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N2[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N3[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N4[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N5[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N6[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N7[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N8[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N9[M1] })#TypeX
    ] {
  TypeGen9Self =>
  def gen[T]: M[N1[T], N2[T], N3[T], N4[T], N5[T], N6[T], N7[T], N8[T], N9[T]]
  override final def gen10[T, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10]
    : M[N1[T], N2[T], N3[T], N4[T], N5[T], N6[T], N7[T], N8[T], N9[T]] = TypeGen9Self.gen[T]
}

trait TypeGen10[M[_, _, _, _, _, _, _, _, _, _], N1[_], N2[_], N3[_], N4[_], N5[_], N6[_], N7[_], N8[_], N9[_], N10[_]]
    extends Type10Gen10[
      M,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N1[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N2[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N3[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N4[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N5[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N6[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N7[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N8[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N9[M1] })#TypeX,
      ({ type TypeX[M1, M2, M3, M4, M5, M6, M7, M8, M9, M10] = N10[M1] })#TypeX
    ] {
  TypeGen10Self =>
  def gen[T]: M[N1[T], N2[T], N3[T], N4[T], N5[T], N6[T], N7[T], N8[T], N9[T], N10[T]]
  override final def gen10[T, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9, Item10]
    : M[N1[T], N2[T], N3[T], N4[T], N5[T], N6[T], N7[T], N8[T], N9[T], N10[T]] = TypeGen10Self.gen[T]
}
