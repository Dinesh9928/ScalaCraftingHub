package Day1

//Input: 
//[ [ 1, 2, 3 ]
//  [ 4, 5, 6 ]
//  [ 7, 8, 9 ] ]
//Output: 
//[ [ 1, 4, 7]
//  [ 2, 5, 8]
//  [ 3, 6, 9] ]
object Transpose {
  
  def main(args: Array[String]): Unit = {
    val mat: Array[Array[Int]] = Array.ofDim[Int](3,3)
    
    mat(0) = Array(1, 2, 3)
    mat(1) = Array(4, 5, 6)
    mat(2) = Array(7, 8, 9)
    
    MatrixTans(mat);
  }
  
  def MatrixTans(mat: Array[Array[Int]]): Unit ={
    val rows = mat.length
    val cols = mat(0).length
    
    for(i <- 0 until rows){
      for(j <-i until cols){
        val temp = mat(i)(j)
        mat(i)(j) = mat(j)(i)
        mat(j)(i) = temp
      }
    }
    
    for(i <- 0 until rows){
      for(j <-0 until cols){
        print(" "+ mat(i)(j))
      }
      println()
    }
  }
  
}