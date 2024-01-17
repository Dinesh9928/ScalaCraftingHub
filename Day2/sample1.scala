package Day2

object sample1 {
    def main(args: Array[String]): Unit = {
    var pattern = "Hello".r 
    var a = "Hello! How are you?"; 
    var b = "How are you?"; 
    println(pattern.findFirstIn(a)) 
    // Some(Hello) println(pattern.findFirstIn(b)) 
    // None println(pattern.replaceFirstIn(a, "Hey"))
    // Hey! How are you? println(pattern.replaceFirstIn(b, "Hey")) 
    // println(pattern.replaceFirstIn(a, "Hey")) } }
  }

}