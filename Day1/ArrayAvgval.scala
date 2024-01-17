package Day1

object ArrayAvgval {
  def main(args: Array[String]): Unit = {
    val array = Array(10, 20, 30, 40, 50, 60)
    
    val avg = array.sum / array.length
    println("Avg: " + avg)
    for(i <- 0 until array.length){
      
      if(array(i) > avg)
        print(" " + array(i))
    }
  }
}