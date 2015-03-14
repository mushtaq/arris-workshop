
val xs = Seq("asdasd", "a", "b", "c")

xs(0)
xs.apply(0)

xs: Seq[String]
xs: Int ⇒ String

val ys = Set("a", "b")

xs.filter(ys)


ys("a")
ys("aa")

ys: String ⇒ Boolean

val map = Map(1 → "a", 2 → "r")

map(1)

map: Int ⇒ String

val seq = Seq(1, 2)

seq.map(x ⇒ map(x))
seq map map





