object NumberPatternMatching {
  def main(args: Array[String]): Unit = {
    // Check if an input is provided
    if (args.length != 1) {
      println("Please provide a single integer input.")
    } else {
      // Convert the input string to an integer
      val input = args(0).toInt

      // Use pattern matching to determine the output
      input match {
        case x if x <= 0 => println("Negative/Zero is input")
        case x if x % 2 == 0 => println("Even number is given")
        case _ => println("Odd number is given")
      }
    }
  }
}
