package Day2

import scala.util.matching.Regex

object sample2 {
  
  def main(args: Array[String]): Unit = {
    var pattern = new Regex ("\\w\\d(3)")
    
    var str = "k498"
    
    println(pattern.findAllIn(str).mkString)
//    println(pattern.findAllIn(str))
  }
}