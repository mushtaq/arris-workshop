
case class Address(street: Option[String], pin: Int)
case class Person(name: String, address: Option[Address])

val p = Person("mushtaq1", Some(Address(Some("baner"), 21)))

p match {
  case Person("mushtaq", Some(Address(Some(s1), pin)))        ⇒ s1
  case Person(name, Some(Address(Some(s1), pin))) if pin > 10 ⇒ pin
  case Person(name, Some(Address(Some(s1), pin)))             ⇒ name
  case 1 ⇒
  case "asdasd" ⇒
  case (a, v) ⇒
  case Seq(1, e) ⇒ e
  case head :: tail ⇒ tail.length
  case h1 :: h2 :: h3 :: h4 :: tail ⇒ tail.length
}



