object revers {

  def reverseString(str: String): String = {
    if (str.isEmpty) ""
    else reverseString(str.tail) + str.head
  }

  def main(args: Array[String]): Unit = {
    val name = "Udeesha Prabhashana"
    val reversedString = reverseString(name)
    println(reversedString)
  }
}