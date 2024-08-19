object NumberClassifier {

  def main(args: Array[String]): Unit = {
    // Lambda function to classify the numbers
    val classifyNumber: Int => String = {
      case n if n <= 0 => "Negative/Zero is input"
      case n if n % 2 == 0 => "Even number is given"
      case n if n % 2 != 0 => "Odd number is given"
    }
    
    if (args.isEmpty) {
      println("Please provide an integer input.")
    } else {
      
      val inputNumber = args(0).toInt

      val result = classifyNumber(inputNumber)

      println(result)
    }
  }
}
