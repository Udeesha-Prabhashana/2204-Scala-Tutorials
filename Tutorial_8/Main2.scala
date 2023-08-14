object two {
  val classifyNumber: (Int) => Unit = (num) => num match {
    case x if num <= 0 => println("Input is Negative/Zero")
    case x if num % 2 == 0 => println("Input is Even")
    case _ => println("Input is Odd")
  }

  def main(args: Array[String]): Unit = {

    val input = args(0).toInt
    classifyNumber(input)

  }
}