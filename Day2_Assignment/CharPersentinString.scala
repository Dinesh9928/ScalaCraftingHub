package Day2_Assignment

object CharPersentinString {
  
  def main(args: Array[String]): Unit = {
    val ch = 'a'
    val str = "aabhiadaddvds"
    
    val charcount = str.count(_ == ch)
    
    if( charcount >=2 && charcount <= 4)
      println(s"The character '$ch' is persent in string $charcount times")
      
    else if(charcount < 2 )
      println(s"The char is less than 2 times i.e $charcount ")
      
    else
      println(s"The char is more than 4 times i.e $charcount ")
  }
}