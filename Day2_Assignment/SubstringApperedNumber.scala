package Day2_Assignment

object SubstringApperedNumber {
  def main(args: Array[String]): Unit ={
    
    val str = "Thisisthethesis"
    val sub1 = "is"
    val sub2 = "h"
    val res = countsubs(str, sub1, sub2)
    print(s"Output : $res")
    
  }
  
  def countsubs(str: String, sub1: String, sub2: String): Boolean = {

    val count_sub1 = str.sliding(sub1.length).count(_.equals(sub1))
    
    val count_sub2 = str.sliding(sub2.length).count(_.equals(sub2))
    
    count_sub1 == count_sub2
    
    
  }
}