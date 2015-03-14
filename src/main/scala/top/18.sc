
import top.Data._

books.flatMap { book ⇒
  book.title.map { char ⇒
    char
  }
}


books.flatMap(b ⇒ b.title.map(ch ⇒ ch))


val xs = List(1, 2, 3)
val ys = List("a", "b", "c")

xs.map(x ⇒ ys.map(y ⇒ (x, y))).flatten
xs.flatMap(x ⇒ ys.map(y ⇒ (x, y)))



