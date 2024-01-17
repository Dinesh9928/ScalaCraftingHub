package ScalaExercises
import scala.collection.mutable.ArrayBuffer;
import scala.util.Random
import scala.io.StdIn

case  class Employee(name: String, employeeID: Int, assmentScore: Int)

object ArrayAndArraybuffers {
  def main(args: Array[String]): Unit= {
  val staff = Array(
      Employee("John", 101, 80),
      Employee("Cena", 102, 55),
      Employee("Big show", 103,70)
      )
  val highscore = filterHighScorers(staff)
  highscore.foreach(emp => println(s"Name: ${emp.name}, ID: ${emp.employeeID}, Score: ${emp.assmentScore}"))
  }

def filterHighScorers(staff: Array[Employee]): Array[Employee] = {
  var highscore = Array[Employee]()
  for(employee <- staff){
    if(employee.assmentScore > 60){
      highscore :+= employee
    }
  }
  highscore
}
}