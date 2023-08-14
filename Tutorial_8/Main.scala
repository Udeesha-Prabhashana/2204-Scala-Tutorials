object Main1 {
  val interestFunction: (Int) => Double = (deposit) => deposit match {
    case amount if amount <= 20000 => amount * 0.02
    case amount if amount <= 200000 => amount * 0.04
    case amount if amount <= 2000000 => amount * 0.035
    case _ => deposit * 0.065
  }

  def main(args: Array[String]): Unit = {

    println(" deposit: Rs." + interestFunction(15000))
    println(" deposit: Rs." + interestFunction(100000))
    println(" deposit: Rs." + interestFunction(500000))
    println(" deposit: Rs." + interestFunction(2500000))

  }
}