object Practical1 {
  
  def Diskarea(r:Int): Double = {
    math.Pi * r * r
  }
  
  def CtoF(c: Int): Double = {
    c * 1.800 + 32
  }
  
  def volsphere(r: Int): Double = {
    (4.0 / 3.0) * math.Pi * r * r * r
  }
  
  def totalcost(x: Int): Double = {
      (x*24.95*(1-0.4))+ (x*3+(x-50)*0.75)
  }
  
  def trtime(easyd:Double,tempod:Double): Double = {
   (easyd * 8) + (tempod * 7)
  }
  
  def main(args: Array[String]): Unit = {
    val area = Diskarea(5)
    println(s"The area of a disk:$area")
    
    val F = CtoF(35)
    println(s"35°C is equal to $F°F")
    
    val volume = volsphere(5)
    println(s"The volume of a sphere with radius 5 is $volume")
    
    val totalCost = totalcost(60)
    println(s"The total wholesale cost for 60 copies is Rs. $totalCost")
    
    val totalrtime = trtime(4,3)
    println(s"The total running time is $totalrtime minutes")
  }
}
