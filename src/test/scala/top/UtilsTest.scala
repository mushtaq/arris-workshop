package top

import org.scalatest.{MustMatchers, FunSuite}

class UtilsTest extends FunSuite with MustMatchers {


  test("map") {
    Utils.map(Seq(1, 2, 3), x ⇒ x * x) mustEqual Seq(1, 4, 9)
    Utils.map(Seq(1, 2, 3), x ⇒ x + 1) mustEqual Seq(2, 3, 4)
    Utils.map(Seq(1, 2, 3), x ⇒ x - 1) mustEqual Seq(0, 1, 2)
  }

  test("map-big") {
    Utils.map(1 to 10000, x ⇒ x + 1) mustEqual (2 to 10001)
  }

}
