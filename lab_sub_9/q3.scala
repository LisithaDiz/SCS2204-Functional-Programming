object Q3 {

  def toUpper(str: String): String = str.toUpperCase

  def toLower(str: String): String = str.toLowerCase

  def formatNames(name: String, format: String => String): String = {
    format(name)
  }

  def main(args: Array[String]): Unit = {
    println(formatNames("Benny", toUpper))         // Output: BENNY
    println(formatNames("Niroshan", name => name.substring(0, 2).toUpperCase + name.substring(2).toLowerCase)) // Output: NIroshan
    println(formatNames("Saman", toLower))         // Output: saman
    println(formatNames("Kumara", name => name.substring(0, 1).toUpperCase + name.substring(1, 5).toLowerCase + name.substring(5).toUpperCase)) // Output: KumarA
  }
}
