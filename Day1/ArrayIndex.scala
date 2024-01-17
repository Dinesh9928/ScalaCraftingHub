package Day1

object ArrayIndex {
  def main (args: Array[String]): Unit = {
    val array = Array(10, 20, 30, 40, 50, 60)
    val value = 30
    findIdx(array, value)
  }
  
  def findIdx(array: Array[Int], value: Int): Unit = {
    var flag = true
    for(i <- 0 until array.length){
      
      if(array(i) == value){
        print("Index is: " + i);
        flag = false
      }
    }
    if(flag)
      print("value not found")
  }
  
}