package Day3

object CloserFunction {
   def main(args: Array[String]): Unit = {

     var res = sum(4)(5)
    println(res)
   

  }
  
    var c = 100
   def sum(a: Int) = (b: Int) => a + b + c
   
   
}