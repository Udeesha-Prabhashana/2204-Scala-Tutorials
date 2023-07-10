object salary{

  def salary(hour: Double, ohour: Double): Double = ((250*hour) + (ohour*85))*0.88

  def main(args: Array[String]): Unit = {
    var x = salary(40, 30);
    println("Salary =" + x)
  }
}