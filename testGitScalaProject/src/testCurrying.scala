

object testCurrying {
   
   //def foldLeft[B](z: B)(op: (B, A) => B): B
   
   def main(args: Array[String]): Unit = {
      val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

      println(numbers.foldLeft(0)((m, n) => m + n))
      println(numbers.foldLeft(0)(_ + _))
      println((0 /: numbers)(_ + _))

      println(numbers.foldRight(0)((m, n) => m + n))
      println(numbers.foldRight(0)(_ + _))
      println((numbers :\ 0)(_ + _))
      
      println(numbers.foldLeft(1)(_ * _))
      println(numbers.foldRight(1)(_ * _))
   }
  
}