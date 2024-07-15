import scala.io.StdIn.readLine

object InventoryManagement {

  def getProductList(): List[String] = {
    var products = List[String]()
    var input = ""

    while (input != "done") {
      input = readLine("Enter a product name (type 'done' to finish): ")
      if (input != "done") {
        products = products :+ input 
      }
    }
    products
  }

  def printProductList(products: List[String]): Unit = {
    println("\nProduct List:")
    products.zipWithIndex.foreach {
      case (product, index) => println(s"${index + 1}. $product")
    }
  }

  def getTotalProducts(products: List[String]): Int = {
    products.length
  }

  def main(args: Array[String]): Unit = {
    val productList = getProductList()
    printProductList(productList)
    println(s"\nTotal number of products: ${getTotalProducts(productList)}")
  }
}
