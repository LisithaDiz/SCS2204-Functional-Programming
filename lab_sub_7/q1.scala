import scala.io.StdIn.readLine
object q1 {

    def filterEvenNumbers(numbers: List[Int]): List[Int] = {
        numbers.filter(n => n % 2 == 0)
    }

    def main(args: Array[String]): Unit = {
        println("Enter a list of integers:")
        val input1 = readLine().split(",").map(_.trim.toInt).toList
        val output1 = filterEvenNumbers(input1)
        println(s"Even numbers: $output1")

    }
}