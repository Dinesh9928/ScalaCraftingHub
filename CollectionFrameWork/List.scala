package CollectionFrameWork
// function take input and does not modify the list is called pure function
object ListFramework extends App{
//  var num: List[Int] = Nil // List()
  
//  var num: List[Int] = 6 :: (2 :: (4:: Nil)) // appending elements 
  var num: List[Int] = List(4, 6, 6, 7, 3,7, 9)
  var sum = List(11, 12, 13, 14)
  // contacting 
//  println(num ++ sum) // concating the lists 
//  println(List.concat(num, sum))
//  println(num ::: sum)
//  println(num :: sum) // appending list
  
  // removing elements 
//  println(num.filter(p => p !=3))
//
//  
//  println(num.reverse)
//  println(num.contains(17))
//  println(num.distinct)
  
//  println(num.head) // 4 
//  println(num.tail) //List(6, 6, 7, 3, 9)
//  println(num.last) // 9
//  println(num.isEmpty) // false
//  println(num.size) //6
//  print(num)
//  println(num.drop(4)) // 3, 9
//  println(num.dropRight(4)) // 4,6
//  println(num.exists(p => p %2 == 0)) // ture 
//  println(num.forall(p => p %2 == 0)) // false
//  
//  println(num.map(f => f*f)) // List(16, 36, 36, 49, 9, 81)
//  println(num.indexOf(7)) // 3 
//  println(num.init) // List(4, 6, 6, 7, 3, 7)
//  println(num.length) //7 
//  println(num.max) // 9
//  println(num.sum) // 42
//  println(num.min) // 3 
//  println(num.mkString) // 4667379
//  println(num.mkString(" , ")) // 4 , 6 , 6 , 7 , 3 , 7 , 9
//  println(num.sorted) //List(3, 4, 6, 6, 7, 7, 9)
//  println(num.sorted.reverse)//List(9, 7, 7, 6, 6, 4, 3)
//  
//  println(num.filter(p => p % 2 == 0 )) // List(4, 6, 6)
  
//  println(num.groupBy(f => f%2 == 0 )) // Map(false -> List(7, 3, 7, 9), true -> List(4, 6, 6))
//  println(num.partition(p=> p % 2 ==0)) // (List(4, 6, 6),List(7, 3, 7, 9))
//  //List(4, 6, 6, 7, 3, 7, 9)
//  println(num.scan(0)((a,b) => a+ b)) //List(0, 4, 10, 16, 23, 26, 33, 42)
//  println(num.scanLeft(0)((a, b)=> a+b)) // List(0, 4, 10, 16, 23, 26, 33, 42)
//  println(num.scanRight(0)((a, b)=> a+b)) // List(42, 38, 32, 26, 19, 16, 9, 0)
  
  //List(4, 6, 6, 7, 3, 7, 9)
//  println(num.fold(0)((a,b) => a+b))
//  println(num.foldLeft(0)((a,b) => a+b))
//  println(num.foldRight(0)((a,b) => a+b))
  
//  println(num.slice(3, 5)) // List(7, 3)
//  println(num.splitAt(2))
  var a = List(2,3,4,5)
  var b = List(200, 300, 400)
  var c = List(2, 3)
  
//  println(a.zipAll(b, 100, 500)) //List((2,200), (3,300), (4,400), (5,500))
//  println(c.zipAll(b, 100, 500)) //List((2,200), (3,300), (100,400))
//  
  // replacing variable 
  println(a.filter(_ % 2 == 0)) // List(2, 4)
  println(a.fold(0)(_ + _ )) // 14
  
  var s = List("Hello", "Hi")
  
  println(s.map(_.toUpperCase()).mkString(" , ")) // HELLO , HI
  println(s.flatMap(_.toUpperCase())) // List(H, E, L, L, O, H, I)
  
  
}
