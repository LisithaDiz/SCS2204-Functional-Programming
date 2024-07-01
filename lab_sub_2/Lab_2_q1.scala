object Variables {
    // Separate initialization of variables
    var k = 2
    var i = 2
    var j = 2
    var m = 5
    var n = 5
    var f = 12.0f  
    var g = 4.0f   
    var c = "X"

    def main(args: Array[String]): Unit = {
        // Use of println in a method, typically main for standalone application
        println(s"${k + 12 * m}")  // Output = 62 
        println(s"${m/j}") // Output = 2 but(2.5)
        println(s"${n%j}") // Output = 1 
        println(s"${m/j*j}") // Output = 4 but ...
        println(s"${f+10*5+g}") // Output = 66.0
        // println(s"${++i * n}")    //  end of statement expected but identifier found 
                i += 1    // indentation doesnt matter in scala.
        println(s"${++i * n}") // Output = 15

    }
}
