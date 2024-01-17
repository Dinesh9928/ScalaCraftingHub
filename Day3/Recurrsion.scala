package Day3

import scala.annotation.tailrec

object Recurrsion {
  
  def main(args: Array[String]): Unit = {
    println(factorial(4))
  }
  
  def factorial(a: Int): Int ={
    
    @tailrec
    def fact(n: Int, f: Int = 1): Int = {
      
      if ( n<=1 )  f
      else fact(n-1, f*n)
  }
    fact(a, 1)
  }
  
 
}