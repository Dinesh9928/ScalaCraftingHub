package Day2

object functions {
  
  def main(args: Array[String]): Unit = {
    try {
    find(6, 0)
    }catch{
      case t: Exception => println("handle")
    }
  }
  
  def find(a: Int, b: Int){
//    
//    try{
//      println(a/b)
//    }
////    catch{ss
////      case e: ArithmeticException => println(e.getMessage)
////      case _: Exception => println("Not / by zero")
////    } 
//    finally{
//      println("bye")
//    }
    
//    if (b == 0 ){
//      throw new ArithmeticException
//    }
    var res = if (b == 0 ) true else false
    
  }
}