package Day2

object Loops {
  
  def main(args: Array[String]): Unit= {
  var arr = Array(2, 3, 4, 5, 6, 8, 9)
  var sum =0
    
//  for(i <- arr if i % 2 == 0 && i % 3 !=0){
//    // if (i % 2 ==0)
//    println(i)
//  }
//  
//  for(i <- arr if i % 2 == 0; if i % 3 !=0){
//    // if (i % 2 ==0)
//    println(i)
//  }
  
  var result = for(i <- arr if i % 2 == 0; if i % 3 !=0) yield i
    println(result.sum)
  
 }
}