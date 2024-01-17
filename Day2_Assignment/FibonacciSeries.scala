package Day2_Assignment

object FibonacciSeries {
   def main(args: Array[String]): Unit = {
     
     println("Enter n: ")
     val n = scala.io.StdIn.readInt()
     var first = 0
     var second = 1 
 
     print(s"Fiboncci No: $first $second")
     for(k <- 3 to n){ 
       var next = first + second
       first = second
       second = next
       print(s" $next")    
     }
    
   }
}