
Seq(1, 2, 3)

val ys: Seq[Int] = Seq.apply(1, 2, 3)


Seq.apply(1, 2, 3)

def m(xs: Seq[Int]) = xs

m(Seq(1, 2, 3))

def m1(xs: Int*) = xs
m1(1, 2, 3, 4, 5)

m(ys)
m1(Seq(1, 2): _*)

Set(1, 2, 3, 4)

Map(
  1 → "a",
  2 → "b"
)
Map.apply(1.→("a"), 2.→("b"))
Map.apply((1, "a"), (2, "b"))


Seq[Int]()
Seq.empty[Int]















