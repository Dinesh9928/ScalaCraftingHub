package Day4

object CaseClass extends App {
  var supplied = new Supply(101, "Pencil")
  supplied match {
    case Supply(202, "Pen")    => print("Pen")
    case Supply(303, "Book")   => println("book")
    case Supply(101, "Pencil") => println("Pencil")
    case _                     => println("Invalid")
 }
 }
 
  case class Supply(id: Int, name: String)