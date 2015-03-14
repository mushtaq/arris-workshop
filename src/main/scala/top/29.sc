object A {
  class MyRichSeq[T](xs: Seq[T]) {
    def myCount = xs.length
  }

  implicit def toRichSeq[T](xs: Seq[T]) = new MyRichSeq(xs)

  implicit def string2Int(s: String) = s.length
}

{

  import A._

  Seq(1, 2, 3).myCount

  def square(a: Int) = a * a

  square("asdasdasd")
  val x: Int = "asdasdasd"

}


def count[T](xs: Seq[T]) = xs.length

count(Seq(1))
count(Array(1, 2, 3))
count("asdasdasd")

val x: Long = 1L
val x1: Long = 1

Seq(1) + "asdasd"



















