object q2 {

  class Rational(val numerator: Int, val denominator: Int) {
    require(denominator != 0, "Denominator cannot be zero")

    def neg: Rational = new Rational(-numerator, denominator)

    def sub(that: Rational): Rational = {
      val newNumerator =
        this.numerator * that.denominator - this.denominator * that.numerator
      val newDenominator = this.denominator * that.denominator
      new Rational(newNumerator, newDenominator)
    }

    override def toString: String = s"$numerator/$denominator"
  }

  def main(args: Array[String]): Unit = {
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    println(
      s"Original Rational Number y: $y"
    )
    println(
      s"Original Rational Number z: $z"
    )

    val x = y.sub(z)
    println(s"Result of x = y - z: $x")
  }
}