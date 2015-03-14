package top

trait Monoid[T] {
  def zero: T
  def add(a: T, b: T): T
}


object Monoid {

  implicit val intMonoid = new Monoid[Int] {
    def zero = 0
    def add(a: Int, b: Int) = a + b
  }

  implicit val strMonoid = new Monoid[String] {
    def zero = ""
    def add(a: String, b: String) = a + b
  }

  implicit def optMonoid[T](implicit tMonoid: Monoid[T]) = new Monoid[Option[T]] {
    def zero = None

    def add(a: Option[T], b: Option[T]) = (a, b) match {
      case (Some(v1), Some(v2)) ⇒ Some(tMonoid.add(v1, v2))
      case (None, _)            ⇒ b
      case (_, None)            ⇒ a
    }
  }

  implicit def pairMonoid[T1, T2](implicit t1Monoid: Monoid[T1], t2Monoid: Monoid[T2]) = new Monoid[(T1, T2)] {
    def zero = (t1Monoid.zero, t2Monoid.zero)
    def add(a: (T1, T2), b: (T1, T2)) = (t1Monoid.add(a._1, b._1), t2Monoid.add(a._2, b._2))
  }

}
