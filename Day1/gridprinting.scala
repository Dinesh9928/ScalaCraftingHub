package Day1

//1.) Write a program to print the following grid.
//
//Expected Output :
//
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -
object gridprinting {
  
  def main(args: Array[String]): Unit = {
  val size = 10; 
  printSq(size);
}
  def printSq(size: Int): Unit = {
    for(i <-1 to size){
      for(i <-1 to size){
        print(" -")
      }
      println()
    }
    
  }
}