import top.Monoid

def sum[T](xs: T*)(monoid: Monoid[T]): T =
  xs.foldLeft(monoid.zero)(monoid.add)

sum(1, 2, 3, 4)(Monoid.intMonoid)
sum("a", "b")(Monoid.strMonoid)
sum(Option("a"), Option("b"), None)(
  Monoid.optMonoid(Monoid.strMonoid)
)
sum(Option(1), Option(2), None)(
  Monoid.optMonoid(Monoid.intMonoid)
)

sum((1, "a"), (2, "b"))(
  Monoid.pairMonoid(Monoid.intMonoid, Monoid.strMonoid)
)

sum((1, Option("a")), (2, None))(
  Monoid.pairMonoid(Monoid.intMonoid, Monoid.optMonoid(Monoid.strMonoid))
)


