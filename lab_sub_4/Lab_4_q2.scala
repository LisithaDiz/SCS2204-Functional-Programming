object PatternMatchingExample {
  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide exactly one integer input.")
      return
    }

    val input = try {
      args(0).toInt
    } catch {
      case _: NumberFormatException =>
        println("Invalid input. Please provide a valid integer.")
        return
    }

    input match {
      case n if n <= 0 => println("Negative/Zero is input")
      case n if n % 2 == 0 => println("Even number is given")
      case _ => println("Odd number is given")
    }
  }
}
