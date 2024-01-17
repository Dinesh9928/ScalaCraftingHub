package Sample1

object scala {
  def main(args: Array[String]): Unit = { 
    val m:Int = 34 
    var n = "Hello" 
    var a = 2
    var b = 4
    println("n = " + add(a, b))
    
    }
  
  def add(a: Int, b:  Int): Int = {
    a + b
  }
}