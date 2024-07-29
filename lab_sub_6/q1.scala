object q1 {
  
  case class Product(id: Int, name: String, quantity: Int, price: Double)

  def main(args: Array[String]): Unit = {
    val inventory1: Map[Int, Product] = Map(
      101 -> Product(101, "ProductA", 10, 20.0),
      102 -> Product(102, "ProductB", 5, 30.0),
      103 -> Product(103, "ProductC", 8, 25.0)
    )

    val inventory2: Map[Int, Product] = Map(
      102 -> Product(102, "ProductB", 3, 35.0),
      104 -> Product(104, "ProductD", 7, 40.0)
    )

    // I. Retrieve all product names from inventory1
    val productNames = inventory1.values.map(_.name).toList
    println("Product Names in Inventory1: " + productNames.mkString(", "))

    // II. Calculate the total value of all products in inventory1
    val totalValue = inventory1.values.map(p => p.quantity * p.price).sum
    println("Total Value of Inventory1: $" + totalValue)

    // III. Check if inventory1 is empty
    val isEmpty = inventory1.isEmpty
    println("Is Inventory1 Empty: " + isEmpty)

    // IV. Merge inventory1 and inventory2, updating quantities and retaining the highest price
    val mergedInventory = (inventory1.toSeq ++ inventory2.toSeq)
      .groupBy(_._1)
      .map { case (id, products) =>
        val mergedProduct = products.map(_._2).reduce((p1, p2) =>
          Product(id, p1.name, p1.quantity + p2.quantity, p1.price max p2.price)
        )
        id -> mergedProduct
      }
    println("Merged Inventory: " + mergedInventory)

    // V. Check if a product with a specific ID (e.g., 102) exists and print its details
    val productId = 102
    mergedInventory.get(productId) match {
      case Some(product) =>
        println(s"Product ID $productId exists: $product")
      case None =>
        println(s"Product ID $productId does not exist")
    }
  }
}
