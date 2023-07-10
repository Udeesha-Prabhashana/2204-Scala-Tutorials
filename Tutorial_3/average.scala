object average {
  def avge(num1: Int, num2: Int): Float = (num1.toFloat + num2.toFloat) / 2

  def main(args: Array[String]) = {
    var num1 = 40;
    var num2 = 67;
    var avera = avge(num1, num2)
    var av = "%.2f".format(avera).toDouble
    println(s"$av")
  }
}
