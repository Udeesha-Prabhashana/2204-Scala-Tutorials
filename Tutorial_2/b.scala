object x{
  def main(args: Array[String]): Unit = {
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    val k = 4.3

    b -= 1
    println(b * a + c *d) //println(--b * a + c *d--)
    d -= 1;
    println(a); //println(a++)
    a += 1;
//    println(-2*(g-k) + c) g is not declare as a variable
    println(c) //println(c=c++)
    c += 1;

    c +=1;
    println(c*a) //println(c=++c*a++)
    a +=1;
  }
}
