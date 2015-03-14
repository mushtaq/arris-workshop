object PersonFactory {

  var counter = 0

}

PersonFactory: AnyRef
PersonFactory: PersonFactory.type

PersonFactory.counter
PersonFactory.counter += 100
PersonFactory.counter



class Person(var name: String, val age: Int) {
  private var time = 10
  def greeting = {
    println("greeting")
    time += 9
    s"Hello $name"
  }
  val dd = greeting1
  val greeting1 = {
    println("greeting1")
    time += 9
    s"Hello $name"
  }
  lazy val greeting2 = {
    println("greeting2")
    time += 9
    s"Hello $name"
  }
}
val p = new Person("sunil", 33)
p.greeting
p.greeting

p.name = "abc"
p.greeting1
p.greeting2
p.greeting2
p.name = "xyz"
p.greeting
p.greeting1
p.greeting2

p.dd

