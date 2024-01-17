package CollectionFrameWork

object SetFramework extends App{
  var num: Set[Int] = Set(6, 3, 7, 9, 2, 5, 4, 8)
  var sum = Set(1, 2, 3, 4)
  println(num) // Set(5, 6, 9, 2, 7, 3, 8, 4)
  println(num + 10)  // Set(5, 10, 6, 9, 2, 7, 3, 8, 4)
  println(num - 7)  // Set(5, 6, 9, 2, 3, 8, 4)
  println(num.isEmpty) // false
  println(num.size) // 8
  println(num.head) // 5
  println(num.tail) //Set(6, 9, 2, 7, 3, 8, 4)
  println(num.last) // 4
  println(num ++ sum) // Set(5, 1, 6, 9, 2, 7, 3, 8, 4)
  println(List.concat(num, sum)) // List(5, 6, 9, 2, 7, 3, 8, 4, 1, 2, 3, 4)
  var remove = num.filter(p => p != 3)
  println(remove) // Set(5, 6, 9, 2, 7, 8, 4)
  /*  var num: Set[Int] = Set(6, 3, 7, 9, 2, 5, 4, 8)
  var sum = Set(1, 2, 3, 4)*/
  println(num.intersect(sum)) // Set(2, 3, 4)
  println(num.union(sum)) // Set(5, 1, 6, 9, 2, 7, 3, 8, 4)
  println(num.contains(17)) //false
  println(num.drop(4)) // Set(7, 3, 8, 4)
  println(num.dropRight(4)) // Set(5, 6, 9, 2)

}