case class Person(name: String, age: Int)

val p = Person("mushtaq", 39)
val Person(name1, age1) = p


class Address(val street: String, val pin: Int)

object AddressFactory {
  def apply(street: String, pin: Int): Address =
    new Address(street, pin)

  def unapply(a: Address): Option[(String, Int)] =
    Some((a.street, a.pin))
}
val a = AddressFactory("baner", 21)
val AddressFactory(s1, p1) = a

p match {
  case AddressFactory(s2, p2) ⇒ p2
  case _ ⇒ p
}






