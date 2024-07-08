object InventoryManagement {
  var itemNames: Array[String] = Array("Apples", "Bananas", "Oranges")
  var itemquantities: Array[Int] = Array(10, 5, 8)

  
  def displayinven(): Unit = {
    println("Inventory:")
    for (i <- itemNames.indices) {
      println(s"${itemNames(i)}: ${itemquantities(i)}")
    }
  }

  // Function to restock an item
  def restockItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index != -1) {
      itemQuantities(index) += quantity
      println(s"Restocked $quantity $itemName(s). New quantity: ${itemquantities(index)}")
    } else {
      println(s"""Item "$itemName" not found in inventory.""")
    }
  }

  // Function to sell an item
  def sellItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index != -1) {
      if (itemquantities(index) >= quantity) {
        itemquantities(index) -= quantity
        println(s"Sold $quantity $itemName(s). Remaining quantity: ${itemquantities(index)}")
      } else {
        println(s"Not enough $itemName in inventory to sell. Available quantity: ${itemQuantities(index)}")
      }
    } else {
      println(s"""Item "$itemName" not found in inventory.""")
    }
  }

  def main(args: Array[String]): Unit = {
    displayinven()
    restockItem("Bananas", 10)
    sellItem("Oranges", 5)
    displayinven()
    sellItem("Grapes", 3)
    restockItem("Grapes", 20)
    displayinven()
  }
}
