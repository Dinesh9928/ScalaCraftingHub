package Day4

object TraitMain {
  def main(args: Array[String]): Unit = {
    var emp1 = new TraitClassB;
    emp1.display()
    emp1.work()
    emp1.applyWFH()
    emp1.manage()
  }
}