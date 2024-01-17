package Day3
//Carens:  converting function taking multiple input to the chain of funtion taking single input
object Functions1 {
   def main(args: Array[String]): Unit = {


//    var res = sum(4)(5)
     var res = sum(4)(5, 7)
    println(res)
   

  }
  
//  def sum(a: Int)(b: Int) = a + b
//   def sum(a: Int) = {(b: Int) => a + b
//   def sum(a: Int) = {
//     (b: Int) => a + b
//   }
   def sum(a: Int) = {
     (b: Int, c: Int) => a + b + c
   }
   
   }
