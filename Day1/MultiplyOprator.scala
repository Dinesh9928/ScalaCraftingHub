package Day1

object MultiplyOprator {
  def main(args: Array[String]): Unit = {
    
    val a = 5
    val b = 7
    val res =  multiply(a, b)
    println("Poduct: " + res)
  }
  
  def multiply(a: Int, b: Int): Int = {
    var res = 0
    var multip = if(b < 0) -b else b
    
    for (i <- 1 to multip){
      res +=a
    }
    if (b<0) - res else res
  }
}