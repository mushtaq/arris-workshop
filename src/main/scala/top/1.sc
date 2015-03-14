class GujStrat extends (Int ⇒ Boolean) {
  def apply(age: Int) = false
}
class BloreStrat extends Function1[Int, Boolean] {
  def apply(age: Int) = age > 14
}
val dd: Int ⇒ Boolean = new Function1[Int, Boolean] {
  def apply(age: Int) = age > 14
}
val bloreStrat: Int ⇒ Boolean = age ⇒ age > 14

class Person(age: Int = 39, isFemale: Boolean = true) {
  def isWise =
    if (isFemale) age > 18 else age > 21
  def canMarry(canDrink: Int ⇒ Boolean) =
    canDrink(age) && isWise



}


new Person()
new Person(19)
val p = new Person(34, true)
p.isWise
p.canMarry(new GujStrat)
val gujStrat = new GujStrat
p.canMarry(gujStrat)
p.canMarry(bloreStrat)
p.canMarry(new (Int ⇒ Boolean) {
  def apply(age: Int) = age > 14
})
p.canMarry(age ⇒ age > 14)
p.canMarry { age ⇒
  "asdasdas"
  "asdasdas"
  "asdasdas"
  age > 14
}

p.canMarry(_ > 14)
p.canMarry(x ⇒ x > 14)
p.canMarry { x ⇒
  x > 14
}
p.canMarry { x: Int ⇒
  x > 14
}
p.canMarry({ x: Int ⇒
  x > 14
})
p.canMarry(new (Int ⇒ Boolean) {
  def apply(x: Int) = x > 14
})
p.canMarry(new Function1[Int, Boolean] {
  def apply(x: Int) = x > 14
})

val fStrategy = { x: Int ⇒
  x > 14
}

def mStrategy(x: Int) = {
  x > 14
}

fStrategy.apply(10)

fStrategy(10)
mStrategy(10)




p.canMarry(fStrategy)
p.canMarry(x ⇒ fStrategy(x))
p.canMarry(mStrategy)
p.canMarry(mStrategy)
p.canMarry(x ⇒ mStrategy(x))

val dd1: Int ⇒ Boolean = mStrategy
val dd2 = mStrategy _




















