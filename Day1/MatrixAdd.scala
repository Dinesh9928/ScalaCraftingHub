package Day1

object MatrixAdd {
  def main(args: Array[String]): Unit = {
    
    val mat1: Array[Array[Int]] = Array.ofDim[Int](3,3)
    val mat2: Array[Array[Int]] = Array.ofDim[Int](3,3)
    
    mat1(0) = Array(1, 2, 3)
    mat1(1) = Array(4, 5, 6)
    mat1(2) = Array(7, 8, 9)
    
    mat2(0) = Array(9, 8, 7)
    mat2(1) = Array(6, 5, 4)
    mat2(2) = Array(3, 2, 1)
    
    AddMatrix(mat1, mat2)
  }
  
  def AddMatrix(mat1: Array[Array[Int]], mat2: Array[Array[Int]] ): Unit = {
    val rows = mat1.length
    val cols = mat1(0).length
    val res: Array[Array[Int]] = Array.ofDim[Int](3,3)
    
    for(i <- 0 until rows; j <- 0 until cols){
      
      res(i)(j) = mat1(i)(j) + mat2(i)(j)
    }
    
    for(i <- 0 until rows){
      for(j <- 0 until cols){ 
        print(" " + res(i)(j))
      }
      println()
    }
  }
}