import scala.math.Pi

object area{
  def main(args: Array[String]):Unit = {
    def calculateDiskArea(radius: Double): Double = Pi * radius * radius

    val radius = 5.0
    val area = calculateDiskArea(radius)
    println("area of a disk with radius 5 = " + area)
  }
}