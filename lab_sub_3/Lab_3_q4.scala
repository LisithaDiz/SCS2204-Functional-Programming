import scala.io.StdIn._

object L3Q4 {

    def main(args : Array[String]) : Unit = {
        printf("How many integers you will enter : ")
        val nStr = readLine()
        val n = nStr.toInt

        val intList = new Array[Int](n)

        for (i <- 0 until n){
            printf(s"Enter integer ${i + 1}  : " )
            val input = readLine()
            intList(i) = input.toInt
        }

        println("Even integers: ")
        for (j <- 0 until intList.length){
            if(intList(j)%2 == 0 ){
                println(intList(j))
            }
        }
    }


    
}