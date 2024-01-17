package Day3

object functions {
  def main(args: Array[String]): Unit = {

//    var res = sum(_: Int, _: Int, _: Int)
    var res = sum _
    println(res)
   
//      var finalres = res(2,3, _:Int)
    var finalres = res()(2,3, _:Int)
      println(finalres)
      var fi = finalres(5)
      println(fi)
  }
  
  var sum = (a: Int, b: Int, c: Int) => a + b + c
}