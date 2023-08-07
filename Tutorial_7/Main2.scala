object Main2 {

  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(number => number * number)   //lambda function get parameter as number and map method is used to transform each element of a list by applying a function to each element and collecting the results into a new list
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5)
    val outputList = calculateSquare(inputList)

    println(outputList)

  }
}