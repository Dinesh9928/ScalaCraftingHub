package Day4

trait TraitClassA {
  var empId: Int = _
  var empName: String = _
  var designation: String  // abstract
  def work()
  def display() {
    println(s"Id = $empId, Name = $empName, Designation = $designation")
  }
}