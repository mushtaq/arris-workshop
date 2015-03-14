
val m = Map(1 → "a", 2 → "b")

m(1)
m(2)
//m(3)

val x = m.get(1)
m.get(2)
val y = m.get(3)


if(x.isDefined) x.get else ""
if(y.isDefined) x.get else ""

x.getOrElse("")
y.getOrElse("")

if(x.isDefined) Some(s"Hello, ${x.get}!") else None
if(y.isDefined) Some(s"Hello, ${x.get}!") else None


def hello(a: Option[String]) = a match {
  case Some(aaaaaa) ⇒ Some(s"Hello, $aaaaaa!")
  case None        ⇒ None
}

def concat(s1: Option[String], s2: Option[String]) = (s1, s2) match {
  case (Some(v1), Some(v2)) ⇒ Some(v1 + v2)
  case (_, None) ⇒ s1
}










