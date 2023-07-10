object profit{

  def revenue(n:Int,p:Int):Int =(n*p)

  def cost(att:Int):Int= 500 + att*3

  def prof(a:Int, b:Int):Int = a-b

  def max(p1: Int, p2: Int, p3: Int): Int = {
    if (p1 < p2) {
      if (p2 < p3) 10
      else 20
    }
    else {
      if (p1 > p3) 15
      else 10
    }
  }


  def main(args: Array[String]): Unit = {

    val p1 = prof(revenue(120,15),cost(120))
    val p2 = prof(revenue(100,20),cost(100))
    val p3 = prof(revenue(140,10),cost(140))

    println("Best ticket Price: " + max(p1,p2,p3))
  }
}