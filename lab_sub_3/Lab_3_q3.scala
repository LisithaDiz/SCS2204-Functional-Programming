import scala.io.StdIn._

object L3Q3 {
    def avg(num1: Double, num2: Double): Double = {
        val avg = (num1 + num2)/2
        avg
    }

    def main(args: Array[String]): Unit ={

        printf("Enter number 1 : ")
        val num1Str = readLine()
        val num1 = num1Str.toDouble

        printf("Enter number 2 : ")
        val num2Str = readLine()
        val num2 = num2Str.toDouble
        val mean = avg(num1, num2)

        println(f"Average is ${mean}%.2f\n")

    }

    
}