package Day4

class CustomercompanianObject(empName: String) {
  val empId: Int = CustomercompanianObject.increment()
  def display() {
    println(s"Id = $empId, Name = $empName")
  }
}

object CustomercompanianObject{
  
  var temp = 1000
  
  def increment():Int ={
    temp = temp + 1
    temp
  }
}
