class Person1(age: Int, isFemale: Boolean, religion: String) {
  def isWise =
    if (isFemale) age > 18 else age > 21
  def canMarry(canDrink: (Int, String) ⇒ Boolean) =
    canDrink(age, religion) && isWise
}

val p = new Person1(34, true, "christian")

p.canMarry(_ > 14 && _ != "muslim")

p.canMarry { (age, religion) ⇒
  age > 14 && religion != "muslim"
}

val dd = { (age: Int, religion: String) ⇒
  age > 14 && religion != "muslim"
}

val dd1 = new ((Int, String) ⇒ Boolean) {
  def apply(age: Int, religion: String) =
    age > 14 && religion != "muslim"
}

val dd12 = new Function2[Int, String, Boolean] {
  def apply(age: Int, religion: String) =
    age > 14 && religion != "muslim"
}

