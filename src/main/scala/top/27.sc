import play.api.libs.json._

case class Address(street: String, pin: Int)

object Address {
  implicit val reader = Json.reads[Address]
}

case class Person(name: String, addresses: Seq[Address])

object Person {
  implicit val reader = Json.reads[Person]
}

val addressJson: JsValue = Json.obj("pin" → 21, "street" → "baner", "asasd" → 34)
val personJson = Json.obj("name" → "sunil", "addresses" → Seq(addressJson, addressJson))

personJson.validate[Person]

