

object @@ {
  def unapply(s: String): Option[(String, String)] = s.split('@') match {
    case Array(name, domain) ⇒ Some((name, domain))
    case _                   ⇒ None
  }
}

"mushtaq1@tw.com" match {
  case "mushtaq" @@ domain ⇒ domain
  case name @@ domain      ⇒ name
  case _                   ⇒ "error"
}

