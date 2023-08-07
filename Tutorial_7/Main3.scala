object Main3 {

  def isprime(number: Int): Boolean = {
    if (number <= 1) {
      return false
    }
    for (i <- 2 until number) {
      if (number % i == 0) {
        return false
      }
    }
    return true
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(num => isprime(num))
  }


  def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    val primeList = filterPrime(input)
    println(primeList)
  }
}
