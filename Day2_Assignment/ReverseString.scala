package Day2_Assignment

object ReverseString {
  
  def main(args: Array[String]): Unit ={
    println("Enter String: ")
    val str = scala.io.StdIn.readLine()
    val res = reverse(str)
    
    println(s"Input String: $str")
    println(s"Output String: $res")
    
    
  }
  
  def reverse(str: String): String={
    str.split(" ").map(_.reverse).mkString(" ")
  }
  
}