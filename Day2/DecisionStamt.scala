package Day2

object DecisionStamt {
  
  def main(args: Array[String]): Unit = {
    
    var a = 9;
    
    a match {
      case 2 => print("two")
      case 3 => print("three")
      case 8 => print("eight")
      case _ => print("Invalid value")
    }
  }
}