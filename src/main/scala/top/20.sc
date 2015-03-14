
Option(9).filter(_ > 10)
Option(9).filter(_ < 10)

val xs = Option(9)
val ys = Option.empty[Int]

xs.flatMap(x ⇒ ys.map(y ⇒ x + y))

xs ++ ys

val m = Map(1 → "a", 2 → "b")

val dd: Option[String] = m.get(1)
m.get(2)

for {
  a ← m.get(10)
  b ← m.get(2)
} yield a + b





