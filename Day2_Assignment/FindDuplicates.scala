package Day2_Assignment

object FindDuplicates {
  
  def main(args: Array[String]): Unit ={
    
    val str = "Scala Programming"
    
    findDuplicates(str)
    
  }
  
  def findDuplicates(str: String): Unit = {
//    val charcou1 = str.groupBy(identity)
//    println(charcount)
    val charcount = str.groupBy(identity).mapValues(_.length)
    
    charcount.filter{case (_, count) => count > 1 }.foreach { case (char, count) =>
      println(s"$char  :  $count")}
    
    
  }
}