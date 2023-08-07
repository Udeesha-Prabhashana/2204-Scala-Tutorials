object Main {

  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter((x:Int) => (x % 2 == 0))   //lambda function
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(11, 21, 12, 4, 5, 7, 8, 9, 10)
    val outputList = filterEvenNumbers(inputList)

    println(outputList)

  }
}