
object A {

  implicit class MyRichSeq[T](xs: Seq[T]) {
    def myCount = xs.length

  }

}

{

  import A.MyRichSeq

  Seq(1, 2, 3).myCount

}


