object NumberCategorizer {

  // Lambda functions for each case
  val multipleOfThree: Int => Boolean = _ % 3 == 0
  val multipleOfFive: Int => Boolean = _ % 5 == 0
  val multipleOfBoth: Int => Boolean = n => multipleOfThree(n) && multipleOfFive(n)

  // Function to categorize the number using pattern matching
  def categorizeNumber(n: Int): String = n match {
    case _ if multipleOfBoth(n) => "Multiple of Both Three and Five"
    case _ if multipleOfThree(n) => "Multiple of Three"
    case _ if multipleOfFive(n) => "Multiple of Five"
    case _ => "Not a Multiple of Three or Five"
  }

  // Main method to take input and print the result
  def main(args: Array[String]): Unit = {
    try {
      val input = args.head.toInt
      println(categorizeNumber(input))
    } catch {
      case _: NumberFormatException => println("Invalid input. Please enter a valid integer.")
      case _: NoSuchElementException => println("No input provided. Please enter an integer.")
    }
  }
}
