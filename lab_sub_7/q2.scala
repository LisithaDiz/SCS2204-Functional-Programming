import scala.io.StdIn.readLine

object q2 {

    def calculateSquare(numbers: List[Int]): List[Int] = {
        numbers.map(n => n * n)
    }

    def main(args: Array[String]): Unit = {
        println("Enter a list of integers separated by commas:")
        val input2 = readLine().split(",").map(_.trim.toInt).toList
        val output2 = calculateSquare(input2)
        println(s"Squares of the numbers: $output2")
    }
}
