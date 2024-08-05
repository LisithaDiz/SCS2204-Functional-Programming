import scala.io.StdIn.readLine
object q3 {

    def isPrime(n: Int): Boolean = {
        if (n <= 1) false
        else if (n == 2) true
        else !(2 until n).exists(i => n % i == 0)
    }

    def filterPrime(numbers: List[Int]): List[Int] = {numbers.filter(isPrime)}

    def main(args: Array[String]): Unit = {
        println("Enter a list of integers separated by commas:")
        val input3 = readLine().split(",").map(_.trim.toInt).toList
        val output3 = filterPrime(input3)
        println(s"Prime numbers: $output3")
    }
}