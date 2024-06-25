object Comxyz {
    val perHour = 250f
    val perOTHour = 85f
    val taxRate = 0.12f // tax = 12 / 100

    def grossSalary(normalHours: Float, otHours: Float): Float = perHour * normalHours + otHours * perOTHour

    def taxCal(grossSalary: Float): Float = taxRate * grossSalary

    def homeSalary(grossSalary: Float): Float = grossSalary - taxCal(grossSalary)

    def main(args: Array[String]): Unit = {
        val works = 40f
        val ot = 30f
        val gross = grossSalary(works, ot)
        val netSalary = homeSalary(gross)
        println(s"Take-home salary: Rs.$netSalary")
    }
}
