object sheet5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(142); 

  def isort(xs: List[Int]): List[Int] = xs match {
    case Nil => Nil
    case head :: tail => insert(head, isort(tail))
  };System.out.println("""isort: (xs: List[Int])List[Int]""");$skip(166); 

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case Nil => List(x)
    case head :: tail => if (x <= head) x :: xs else head :: insert(x, tail)
  };System.out.println("""insert: (x: Int, xs: List[Int])List[Int]""");$skip(49); val res$0 = 

  isort(2 :: 3 :: 1 :: 5 :: 9 :: 6 :: 8 :: Nil);System.out.println("""res0: List[Int] = """ + $show(res$0))}

}
