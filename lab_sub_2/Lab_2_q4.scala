object TheaterProfit {
    val costPerEvent: Float = 500.0f
    val costPerAttendee: Float = 3.0f

    def attendance(ticketPrice: Float): Float = {
        val basePrice = 15.0f
        val baseAtt = 120.0f
        val priceDiff = (basePrice - ticketPrice) / 5.0f
        (baseAtt + (priceDiff * 20.0f))
    }

    def revenue(ticketPrice: Float): Float = {
        val attend = attendance(ticketPrice)
        ticketPrice * attend
    }

    def cost(ticketPrice: Float): Float = {
        val attend = attendance(ticketPrice)
        costPerEvent + (attend * costPerAttendee)
    }

    def profit(ticketPrice: Float): Float = {
        revenue(ticketPrice) - cost(ticketPrice)
    }

    def main(args: Array[String]): Unit = {
        var bestPrice = 0.0f
        var bestProfit = 0.0f

        for (ticketPrice <- 10 to 50 by 5) {
            val currentProfit = profit(ticketPrice.toFloat)
            println(f"Ticket Price: Rs.$ticketPrice%.2f\t Revenue: Rs.${revenue(ticketPrice.toFloat)}%.2f\t Cost: Rs.${cost(ticketPrice.toFloat)}%.2f\t Profit: Rs.$currentProfit%.2f")
            if (currentProfit > bestProfit) {
                bestProfit = currentProfit
                bestPrice = ticketPrice.toFloat
            }
        }
        
        println(f"Best Price: Rs.$bestPrice%.2f\t Best Profit: Rs.$bestProfit%.2f")
    }
}
