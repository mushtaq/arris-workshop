Seq(9).map(x ⇒ x * x)
Seq.empty[Int].map(x ⇒ x * x)

Option(9).map(x ⇒ x * x)
Option.empty[Int].map(x ⇒ x * x)

Option(9) match {
  case Some(x) ⇒ Some(x * x)
  case None    ⇒ None
}

Option(9).map(x ⇒ x * x)

Option(9) match {
  case Some(x) ⇒ x * x
  case None    ⇒ 0
}

Option(9)
  .map(x ⇒ x * x)
  .getOrElse(0)



