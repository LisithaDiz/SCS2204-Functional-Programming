object StringFormatter {
  def toUpper(input: String): String = {
    input.toUpperCase()
  }

  def toLower(input: String): String = {
    input.toLowerCase()
  }

  def formatNames(name: String)(formatFunction: String => String): String = {
    formatFunction(name)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    // Applying formats to each name
    val formattedNames = names.map {
      case "Benny" => formatNames("Benny")(toUpper)
      case "Niroshan" => formatNames("Niroshan")(name => {
        val upper = name.substring(0, 2).toUpperCase()
        val lower = name.substring(2).toLowerCase()
        upper + lower
      })
      case "Saman" => formatNames("Saman")(toLower)
      case "Kumara" => formatNames("Kumara")(name => {
        val upper = name.substring(0, 1).toUpperCase()
        val lower = name.substring(1, 5).toLowerCase()
        val upperEnd = name.substring(5).toUpperCase()
        upper + lower + upperEnd
      })
      case other => other // default case, just in case there are other names
    }

    // Print the formatted names
    formattedNames.foreach(println)
  }
}
