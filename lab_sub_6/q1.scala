object q1 {
    // ID, (name, quantity, price)
    val inv1: Map[Int, (String, Int, Double)] = Map(
        200 -> ("Apple", 10, 20.0),
        201 -> ("Banana", 20, 15.5),
        202 -> ("Orange", 15, 100.25)
    )

    val inv2: Map[Int, (String, Int, Double)] = Map(
        300 -> ("Pen", 10, 10.5),
        301 -> ("Pencil", 20, 5.2),
        302 -> ("Book", 15, 150.50),
        303 -> ("Eraser", 15, 3.5),
        304 -> ("Ruler", 15, 88.5)
    )

    def productnames(inv: Map[Int, (String, Int, Double)]): Unit = {
        inv.values.foreach { case (name, _, _) => println(name) }
    }

    def total(inv: Map[Int, (String, Int, Double)]): Double = {
        inv.values.map { case (_, quantity, price) => quantity * price }.sum
    }

    def is_empty(inv: Map[Int, (String, Int, Double)]): Boolean = {
        inv.isEmpty
    }

    def mergeMap(inv1: Map[Int, (String, Int, Double)], inv2: Map[Int, (String, Int, Double)]): Map[Int, (String, Int, Double)] = {
        inv2.foldLeft(inv1) { (acc, kv) =>
            val id = kv._1
            val name = kv._2._1
            val qty = kv._2._2
            val price = kv._2._3
            acc.get(id) match {
                case Some(existingTuple) =>
                    val existingQty = existingTuple._2
                    val existingPrice = existingTuple._3
                    acc + (id -> (name, existingQty + qty, existingPrice max price))
                case None =>
                    acc + (id -> (name, qty, price))
            }
        }
    }

    def checkID(inv: Map[Int, (String, Int, Double)], id: Int): Unit = {
        inv.get(id) match {
            case Some((name, qty, price)) => println(s"Product ID: $id, Name: $name, Quantity: $qty, Price: $price")
            case None => println(s"Product with ID $id does not exist")
        }
    }

    def main(args: Array[String]): Unit = {
        // 1.
        println("Product names in inventory 1:")
        productnames(inv1)

        // 2.
        println(s"\nTotal value of products in inventory 1: ${total(inv1)}")

        // 3.
        println(s"\nIs inventory 1 empty? ${is_empty(inv1)}")

        // 4.
        val mergedInv = mergeMap(inv1, inv2)
        println("\nMerged inventory:")
        mergedInv.foreach { case (id, (name, qty, price)) => println(s"ID: $id, Name: $name, Quantity: $qty, Price: $price") }

        // 5.
        println("\nChecking if product with ID 102 exists in inventory 1:")
        checkID(inv1, 202)
    }
}
