import top.Monoid

case class Person(age: Int)

object Person extends (Int ⇒ Person) {
  implicit val pMonoid = new Monoid[Person] {
    def zero = new Person(0)
    def add(a: Person, b: Person) = new Person(a.age + b.age)
  }
}
def sum[T](xs: T*)(implicit monoid: Monoid[T]): T =
  xs.foldLeft(monoid.zero)(monoid.add)

def sum1[T : Monoid](xs: T*): T = {
  val monoid = implicitly[Monoid[T]]
  xs.foldLeft(monoid.zero)(monoid.add)
}
sum(1, 2, 3, 4)
sum("a", "b")
sum(Option("a"), Option("b"), None)
sum(Option(1), Option(2), None)

sum((1, "a"), (2, "b"))

{
  implicit val strMonoid = new Monoid[String] {
    def zero = ""
    def add(a: String, b: String) = a + "-" + b
  }

  sum((1, Option("a")), (2, Option("c")))
}

sum(Person(100), Person(67))


