package Day4

abstract class ClassA(empId: Int, empName: String) {
  
  def this(empId: Int) {
    this(empId, "XYZ")
  }
  def this() {
    this(1234)
  }
  def work()
  def display() {
    println(s"Id = $empId, Name = $empName")
  } 
  
}