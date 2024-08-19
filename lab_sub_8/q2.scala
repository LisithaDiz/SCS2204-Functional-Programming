object q2 {

  val categorizeNumber: Int => String = {
    case n if n % 3 == 0 && n % 5 == 0 => "Multiple of Both Three and Five"
    case n if n % 3 == 0 => "Multiple of Three"
    case n if n % 5 == 0 => "Multiple of Five"
    case _ => "Not a Multiple of Three or Five"
  }

  def main(args: Array[String]): Unit = {
    if (args.length > 0 || args[0].toInt) {
      val inputNumber = args(0).toInt
      val result = categorizeNumber(inputNumber)
      println(result)
    } else {
      println("Please provide an integer as a command-line argument.")
    }
  }
}
