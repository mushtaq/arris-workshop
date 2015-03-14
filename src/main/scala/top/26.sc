
import top.Data.books

books foreach println
books.sortBy(b ⇒ (b.basePrice, b.title)) foreach println
Seq(10, 2, 3).sorted
books.sorted foreach println
