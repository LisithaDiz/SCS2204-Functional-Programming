object Q1 {
  def calculateInterest(deposit: Double): Double = deposit match {
    case d if d <= 20000     => d * 0.02
    case d if d <= 200000    => d * 0.04
    case d if d <= 2000000   => d * 0.035
    case d if d > 2000000    => d * 0.065
  }

  def main(args: Array[String]): Unit = {
    println(calculateInterest(15000))   
    println(calculateInterest(50000))    
    println(calculateInterest(500000))   
    println(calculateInterest(3000000))  
  }
}
