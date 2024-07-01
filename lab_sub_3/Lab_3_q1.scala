import scala.io.StdIn._

object L3Q1 {

    def reverse(yourString: String): String = {
        
        if (yourString.length == 0) {
            ""
        } else {
            reverse(yourString.tail) + yourString.head
        }
    }

    def main(args: Array[String]): Unit = {
        printf("Enter your text line: ")
        val yourString = readLine()
        val reversedString = reverse(yourString)
        println("Reverse " + reversedString)
    }

}
