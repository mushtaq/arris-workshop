
trait Monoid[T] {
  def zero: T
  def add(other: T): T
}

def sum[T <: Monoid[T]](xs: Seq[T]): T =
  xs.foldLeft(xs.head.zero)(_ add _)

case class Person(age: Int) extends Monoid[Person]  {
  def zero = ???

  def add(other: Person) = ???
}


sum(Seq(Person(1), Person(2)))
