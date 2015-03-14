package top

case class Book(
  author: String,
  title: String,
  basePrice: Double,
  isImported: Boolean
  )

object Book {

  val bookOrd1: Ordering[Book] = {
    Ordering.by{b: Book ⇒ (-b.basePrice, b.title)}
//    Ordering.fromLessThan[Book]((x, y) ⇒ y.basePrice < x.basePrice)
  }

  val bookOrd: Ordering[Book] = new Ordering[Book] {
    def compare(x: Book, y: Book): Int = (y.basePrice - x.basePrice).toInt
  }
}

object Data {

  val books = Seq(
    Book("odersky", "scala prog", 100, false),
    Book("odersky", "apple", 100, false),
    Book("odersky", "complexity", 400, false),
    Book("misky", "ocaml prog", 1000, true),
    Book("misky", "sml", 88, false),
    Book("hickey", "clojure prog", 500, true)
  )
}
