object Q2 {

  val checkNumber: Int => String = (n: Int) => n match {
    case n if n <= 0     => "Negative/Zero is input"
    case n if n % 2 == 0 => "Even number is given"
    case _               => "Odd number is given"
  }

  def main(args: Array[String]): Unit = {
    if (args.length > 0) {
      val input = args(0).toInt
      println(checkNumber(input))
    } else {
      println("No input provided.")
    }
  }
}
