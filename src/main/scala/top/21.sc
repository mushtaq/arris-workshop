

import top.Data.books

val groups = books
  .groupBy(_.author)

groups.mapValues(_.length)

groups.map(t ⇒ t._1 → t._2.length)
groups.map { case (auth, bs) ⇒ auth -> bs.length }
groups.map { case (auth, bs) ⇒ bs.length -> auth }
groups.map { case (auth, bs) ⇒ auth }







