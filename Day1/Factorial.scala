package Day1

object Factorial {
  def main(args: Array[String]): Unit = {
    val n = 5
    val res = fact(n)
    print("Factorial: " + res)
  }
  
  def fact(n: Int): Int = {
    if (n==0 || n ==1){
      1
    } 
    else {
    n * fact(n-1)
    }
}
}