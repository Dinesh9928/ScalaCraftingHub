package Day4

object ExtractMain {
  def main(args: Array[String]): Unit = {
    var x = ExtractDemo.apply(10)
    println(x)
    var y = ExtractDemo.unapply(x)
    println(y)
  }
}