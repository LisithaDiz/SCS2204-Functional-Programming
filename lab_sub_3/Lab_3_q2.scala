import scala.io.StdIn._
// You can use array buffer method to

object L3Q2 {

    def main(args : Array[String]) : Unit = {
        printf("How many strings you will enter : ")
        val nStr = readLine()
        val n = nStr.toInt

        val stringList = new Array[String](n)

        for (i <- 0 until n){
            printf(s"Enter string ${i + 1}  : " )
            val input = readLine()
            stringList(i) = input
        }

        println("Strings that the langth is grearter than 5 ")
        for (j <- 0 until stringList.length){
            if(stringList(j).length >= 5 ){
                println(stringList(j))
            }
        }
    }


    
}