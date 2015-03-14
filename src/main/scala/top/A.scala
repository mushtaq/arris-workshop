package top

object A {
  implicit class MyRichSeq[T](val xs: Seq[T]) extends AnyVal {
    def myCount = xs.length
  }
}
