object newlist {
  def filterS(list: List[String]): List[String] = {
    list.filter(_.length > 5)
  }

  def main(args: Array[String]):Unit = {
    val list= List("Grandfather", "cat", "animals", "rabbit", "Dog", "elephant")
    println("Strings: " + filterS(list))
  }
}
