
case class Address(street: String, pin: Int)

case class Person(name: String, age: Int, address: Address)

object DefaultPerson extends Person("name", 0, Address("street", 0)) {
  def withPin(pin: Int) = copy(address = address.copy(pin = pin))
}


DefaultPerson.copy(age = 45)
DefaultPerson.withPin(100)




val address = Address("baner", 21)
val address2 = Address("baner", 21)

address == address2

address.hashCode()
address2.hashCode()

address.street
address.pin

val p = Person("sunil", 33, Address("baner", 21))

p.address.pin
p.address.street

val p2 = Person(p.name, 50, p.address)

p.copy(age = 50)

p.copy(address = p.address.copy(pin = 300))

p.age









