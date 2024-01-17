package Day2



object functionProgramming {
  
  def main(args: Array[String]): Unit = {
    // call by value 
//    display(square())
    // call by name 
//    display1(square())
    // Named Arrguments
//    add(b = 9, a = 3)
    // default b is set to 0 by default
//    add(5)
    // both a and b set to 0 by default 
//    sum()
    // sum of n elements
    
    var arr = Array(2, 3, 4, 5)
//    sumn(arr)
//    sumn(2,3,4, 6)
    sumn1(2)
    
  }
  
  def sumn(args: Int*) {
    println(args.sum)
  }
  def sumn1(a: Int, args: Int*) {
    println(a)
    println(args.sum)
  }
  
  
  def sum(a: Int = 0, b: Int = 0){
    
    println(a + b)
  }
  
  def add(a: Int, b: Int = 0){
    
    println(a + b)
  }
  
  def square (): Int = {
    println("In Square")
    4 * 5
  }
  def display(n: Int){
    println("In display")
    println(n)
    println(n+n)
  }
   def display1(n: => Int){
    println("In display")
    println(n)
    println(n+n)
  }
}