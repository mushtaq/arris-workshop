

val xs = Seq(4, 1, 2, 0, 9, 2, 4, 6, 8, 2, 5, 3, 9, 6, 5, 7)
xs.take(4)
xs.drop(4)
val (left, right) = xs.splitAt(4)
left ++ right

xs.filter(_ > 5)
xs.filterNot(_ > 5)
xs.partition(_ > 5)
import top.Data._

books foreach println

books.partition(_.author == "odersky")

xs.takeWhile(_ != 0)
xs.dropWhile(_ != 0)
xs.span(_ != 0)


xs.map(_ + 1).filter(_ > 4).takeWhile(_ > 4)








