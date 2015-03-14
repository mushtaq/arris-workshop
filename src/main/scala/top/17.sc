

import top.Data._

val dd: Unit = for (book ← books) {
  println(book)
}

(books).foreach { case book ⇒ {
  println(book)
}
}

books.foreach { book ⇒
  println(book)
}

for {
  book ← books
  if book.author == "odersky"
  if book.basePrice < 1000
  char ← book.title
} {
  println(char)
}

books
  .filter(book ⇒ book.author == "odersky")
  .filter(book ⇒ book.basePrice < 1000)
  .foreach(book ⇒ book.title.foreach(println))
