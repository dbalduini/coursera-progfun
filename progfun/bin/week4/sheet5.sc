object sheet5 {

  def isort(xs: List[Int]): List[Int] = xs match {
    case Nil => Nil
    case head :: tail => insert(head, isort(tail))
  }                                               //> isort: (xs: List[Int])List[Int]

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case Nil => List(x)
    case head :: tail => if (x <= head) x :: xs else head :: insert(x, tail)
  }                                               //> insert: (x: Int, xs: List[Int])List[Int]

  isort(2 :: 3 :: 1 :: 5 :: 9 :: 6 :: 8 :: Nil)   //> res0: List[Int] = List(1, 2, 3, 5, 6, 8, 9)

}