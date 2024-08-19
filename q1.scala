import scala.io.StdIn._

object InterestCalculator extends App {

  val calculateInterest: Double => Double = depositAmount => depositAmount match {
    case amount if amount <= 20000   => amount * 0.02
    case amount if amount <= 200000  => amount * 0.04
    case amount if amount <= 2000000 => amount * 0.035
    case amount if amount > 2000000  => amount * 0.065
  }

  println("Enter the deposit amount (in Rs.): ")
  val depositAmount = readDouble()

  val interest = calculateInterest(depositAmount)

  println(s"Interest for a deposit of Rs. $depositAmount is Rs. $interest")
}
