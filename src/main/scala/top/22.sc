def isDivisibleByXs(xs: Seq[Int])(n: Int) =
  xs.exists(divisor ⇒ n % divisor == 0)

(1 until 10)
  .filter(isDivisibleByXs(Seq(3, 5)))
  .sum


(1 until 10).foldLeft(0) { (acc, elm) ⇒
  if(isDivisibleByXs(Seq(3, 5))(elm)) acc + elm else acc
}


def fib(a: Int, b: Int): Stream[Int] = a #:: fib(b, a+b)

def isEven(x: Int) = x % 2 == 0

fib(1, 2)
  .filter(isEven)
  .takeWhile(_ < 4000000)
  .sum
