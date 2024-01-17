package Day2_Assignment
import scala.util.control.Breaks._

object Sqrt {
  
  def main(args: Array[String]): Unit ={
    
    print("Enter n: ")
    
    var n = scala.io.StdIn.readInt()
    
    findsqrt(n)
  }
  
  def findsqrt(n: Int): Unit ={
    
    var x = n % 10
    var flag = true
    if (x == 2 || x ==3 || x == 7 || x == 8){
      print("Not Perfect Squre")
      return
    }
    
    for( i <- 0 to n/2){
      if( i*i == n){
        print("Perfect Squre")
        flag = false
      }
    }
    if (flag) print("Not perfect Squre")
  }
}