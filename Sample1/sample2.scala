package Sample1
import Array._

object sample2 {
  def main(args: Array[String]): Unit = { 
    var a: Array[Int] = Array(3, 4) 
    var b = Array(7, 8, 9) 
    var c = range(115, 125, 2) 
    println("Size of c = " + c.length) 
    println(c(0)) 
    println(c(1)) 
    println(c(2)) 
    println(c(3)) 
    println(c(4)) 
    }
}