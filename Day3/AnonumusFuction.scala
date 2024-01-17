package Day3

object AnonumusFuction {
  
  def main(args: Array[String]): Unit = {
//    var res = sum(1,2, _:Int)
    var res = sum _
    println(res)
    
//    var finalres = res(4)
      var finalres = res()(2,3, _:Int)
      println(finalres)
      var fi = finalres(5)
      println(fi)
  }
  
  var sum = (a: Int, b: Int, c: Int) => a + b + c
}