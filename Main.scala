object Main {

  def Interest(depositAmt: Double): Double = {
    val interestRate =
      if (depositAmt <= 20000) 0.02
      else if (depositAmt <= 200000) 0.04
      else if (depositAmt <= 2000000) 0.035
      else 0.065

    depositAmt * interestRate
  }


  def main(args: Array[String]): Unit = {
    val depositAmt = 150000.0
    val interest = Interest(depositAmt)
    println(s"The interest earned on a deposit of Rs. $depositAmt is Rs. $interest")

  }
}