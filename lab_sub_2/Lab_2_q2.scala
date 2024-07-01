object Convert {
    // Variable declarations and initializations
    var a= 2
    var b= 3
    var c = 4
    var d= 5
    var k = 4.3f
    var g= 4.0f

    def main(args: Array[String]): Unit = {
        println(s"${ -(-b) * a + c * d - (-1) }") 

        
        println(s"$a") // Print current value of a . Scala has no inceremet operator like a++
        a += 1          // post-increment behavior

        println(s"${ -2 * (g - k) + c }")

        println(s"$c") 
        c += 1         

        c += 1          // Pre-increment c
        println(s"${ c * a }") 
        a += 1          // Post-increment a
    }
}
