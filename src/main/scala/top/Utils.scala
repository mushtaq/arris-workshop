package top

import scala.annotation.tailrec
import scala.collection.mutable

object Utils {

  def map1(xs: Seq[Int], f: Int ⇒ Int): Seq[Int] = {

    val result = mutable.Buffer.empty[Int]
    val it = xs.iterator

    while (it.hasNext) {
      result += f(it.next())
    }

    result
  }

  def map2(xs: Seq[Int], f: Int ⇒ Int): Seq[Int] = {

    var result = Seq.empty[Int]
    val it = xs.iterator

    while (it.hasNext) {
      result = result :+ f(it.next())
    }

    result

  }

  def map3(xs: Seq[Int], f: Int ⇒ Int): Seq[Int] = {
    if(xs.isEmpty) xs else f(xs.head) +: map3(xs.tail, f)
  }

  def map(xs: Seq[Int], f: Int ⇒ Int): Seq[Int] = {

    def loop(remaining: Seq[Int], acc: Seq[Int]): Seq[Int] = {
      if(remaining.isEmpty) acc else loop(remaining.tail,  acc :+ f(remaining.head))
    }

    loop(xs, Seq.empty)
  }
}
