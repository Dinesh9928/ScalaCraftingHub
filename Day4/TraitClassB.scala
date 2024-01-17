package Day4

class TraitClassB extends TraitClassA with TraitClassC {
  var designation = "Manager"
  def applyWFH() {
    println("WFH applied")
  }
  def work() {
    println("Working from office")
  }
  def manage() {
    println("Managing a team of 10")
  }
}