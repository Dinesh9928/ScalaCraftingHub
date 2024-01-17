package Day3
// function taking another function and returning another function

object HigerOrderFunction {
  
  def main(args: Array[String]): Unit= {
//    greet()("James")
//     greet()
    var res = greet()
    res("anni")
  }
  
  def greet(): String => Unit = {
    (name: String) => println(s"Hello $name!")
  }
}