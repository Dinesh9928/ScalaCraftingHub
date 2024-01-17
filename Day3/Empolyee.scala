package Day3
// in auxillay constructor it is mendetory to call another call constructor
class Empolyee (empId: Int, var empName: String){
//  var empId: Int = _ // type is require here _ may contain any values 
//  var empName: String = _
  def this(empId: Int){
    this(empId, "Syz")
  }
//  
//  def this(){
//    this(0, "abc")
//  }
  def this(){
    this(0)
  }
  
  def work(){
    println("Wroking")
  }
  def display(){
    println(s"Id = $empId, Name = $empName")
  }
}