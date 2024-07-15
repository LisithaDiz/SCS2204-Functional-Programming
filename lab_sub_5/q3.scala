import scala.io.StdIn._

object Fibonacci {
  def fibo(n: Int): Int = {
    if (n <= 1) n
    else fibo(n - 1) + fibo(n - 2)
  }

  def main(args: Array[String]): Unit = {
    println("How many Fibonacci numbers do you need? ")
    
    val n = readInt()
    println(s"First $n Fibonacci numbers are: ")
    for (i <- 0 until n) {
      println(fibo(i))
    }
  }
}
