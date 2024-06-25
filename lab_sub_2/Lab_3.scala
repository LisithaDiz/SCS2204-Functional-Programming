object Lab_1 {

  // Q1: Area of a Circle
  def area(radius: Double): Double = Math.PI * radius * radius

  // Q2: Celsius to Fahrenheit Conversion
  def celToFahre(c: Double): Double = c * 1.8 + 32.0

  // Q3: Volume of a Sphere
  def volume(radius: Double): Double = (4.0 / 3.0) * Math.PI * radius * radius * radius

  // Q4: Wholesale Cost Calculation
  def saleCost(coverPrice: Double, discount: Double, baseShipping: Double, shippingPerExtra: Double, numCopies: Int): Double = {
    val discountedPrice = coverPrice * (1 - discount) 
    val extraCopies = Math.max(0, numCopies - 50)    
    val shippingCost = baseShipping + (extraCopies * shippingPerExtra) 
    val totalCost = (discountedPrice * numCopies) + shippingCost  
    totalCost
  }

  // Q5: Total Running Time
  def runningTime(easyPace: Int, tempoPace: Int, easyDistance: Int, tempoDistance: Int): Int = {
    val totalEasyTime = easyPace * easyDistance * 2  
    val totalTempoTime = tempoPace * tempoDistance
    totalEasyTime + totalTempoTime
    }

  def main(args: Array[String]): Unit = {
    val radius = 5.0
    val tempCelsius = 35.0

    val bookCoverPrice = 24.95
    val bookDiscount = 0.40
    val bookBaseShipping = 3.0
    val bookShippingPerExtra = 0.75
    val numBookCopies = 60

    val easyPace = 8
    val tempoPace = 7
    val easyDistance = 2 + 2 
    val tempoDistance = 3

    println(s"\nQ1: Area of circle with radius $radius: ${area(radius)}")
    println(s"\nQ2: $tempCelsius°C = ${celToFahre(tempCelsius)}°F")
    println(s"\nQ3: Volume of sphere with radius $radius: ${volume(radius)}")
    println(s"\nQ4: Total wholesale cost for $numBookCopies books: Rs. ${saleCost(bookCoverPrice, bookDiscount, bookBaseShipping, bookShippingPerExtra, numBookCopies)}")
    println(s"\nQ5: Total running time: ${runningTime(easyPace, tempoPace, easyDistance, tempoDistance)} minutes\n")
  }
}
