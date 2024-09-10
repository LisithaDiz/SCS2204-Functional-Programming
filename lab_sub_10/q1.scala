object q1 {

  class Rational(val numerator: Int, val denominator: Int) {
    require(denominator != 0, "Denominator cannot be zero")

    def neg: Rational = new Rational(-numerator, denominator)

    override def toString: String = s"$numerator/$denominator"
  }

  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)
    println(s"Original Rational Number: $x")

    val negX = x.neg
    println(s"Negated Rational Number: $negX")
  }
}