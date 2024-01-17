package Day2_Assignment

object countSubstring {
  
  def main(args: Array[String]): Unit ={
    
    val str = "The tiger was ti#ed"
    val res = countsubs(str)
    print(s" Total substring are: $res")
    
  }
  
  def countsubs(str: String): Int = {
    val len = 4 
    val st = "ti"
    val end = "e"

    str.sliding(len).count{ 
      subs => subs.startsWith(st) && subs.endsWith(end) 
      }
    
    
  }
}