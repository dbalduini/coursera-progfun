package week5

object sheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(200); 

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case y :: ys =>
    	val (first, rest) = xs span(x => x == y)
    	first :: pack(rest)
  };System.out.println("""pack: [T](xs: List[T])List[List[T]]""");$skip(92); 
  
  def encode[T](xs: List[T]): List[(T, Int)] = pack(xs) map (ys => (ys.head, ys.length));System.out.println("""encode: [T](xs: List[T])List[(T, Int)]""");$skip(53); 

	val data = List("a", "a", "a", "b", "c", "c", "a");System.out.println("""data  : List[String] = """ + $show(data ));$skip(13); val res$0 = 

	pack(data);System.out.println("""res0: List[List[String]] = """ + $show(res$0));$skip(14); val res$1 = 
	encode(data);System.out.println("""res1: List[(String, Int)] = """ + $show(res$1))}


}
