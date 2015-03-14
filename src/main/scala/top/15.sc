
val xs = (1 to 10 by 3).to[List]

val ys = ('a' to 'z').toList

val pairs = xs zip ys

pairs.toMap

xs.indices

ys.zipWithIndex.toMap


xs.map(x ⇒ x * 4)
xs.filter(_ > 3)

xs.foreach(println)
xs.sum
xs.product
xs.foldLeft(0)(_ + _)
xs.foldLeft(0)((acc, elm) ⇒ acc + elm)
def add(acc: Int, elm: Int): Int = acc + elm
xs.foldLeft(0)(add)
xs.foldLeft("")(_ + _)
xs.reduceLeft(_ + _)
xs

xs.foldLeft(List.empty[Int])((acc, elm) ⇒ elm :: acc)















