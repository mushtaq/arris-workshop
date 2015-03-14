trait Common {
  def a: Int = 400
}

trait A extends Common {
  override def a = 1 + super.a
  def b: String
}

trait B extends Common {
  override def a: Int = 100
  def b = "x"
}

(new A with B).a
(new B with A).a


