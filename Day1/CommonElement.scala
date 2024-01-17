package Day1

object CommonElement {
  def main(args: Array[String]): Unit = {
    val array1 = Array(10, 20, 30, 40, 50, 60)
    val array2 = Array(70, 50, 30, 10, 90, 80, 100)
    FindCommon(array1, array2)
  }
    
    def FindCommon(array1: Array[Int], array2: Array[Int]): Unit = {
      
      for(i <- 0 until array1.length){
        for(j <- 0 until array2.length){
          
          if(array1(i) == array2(j)){
            print(" " + array1(i))
          }
        }
      }
  }

}