object StringFormatter {
  def toUpper(input: String): String = input.toUpperCase()

  def toLower(input: String): String = input.toLowerCase()

  def formatNames(name: String)(formatFunction: String => String): String = formatFunction(name)

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    // Test cases
    println(formatNames(names(0))(toUpper))     
    println(formatNames(names(1)) { name =>
      val formattedName = name.substring(0, 2).toUpperCase + name.substring(2).toLowerCase
      formattedName
    })                                         
    println(formatNames(names(2))(toLower))       
    println(formatNames(names(3)) { name =>
      val formattedName = name.substring(0, name.length - 1).toLowerCase + name.last.toUpper
      formattedName
    })                                          
  }
}
