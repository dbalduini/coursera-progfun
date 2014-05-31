package week4

object sheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(92); 
  
  def singleton[T](elem: T) = new Cons[T](elem, new Nil[T]);System.out.println("""singleton: [T](elem: T)week4.Cons[T]""");$skip(157); 
  
  def nth[T](n: Int, xs: List[T]): T = {
  	if(xs.isEmpty) throw new IndexOutOfBoundsException
  	else if( n== 0) xs.head
  	else nth(n - 1, xs.tail)
  };System.out.println("""nth: [T](n: Int, xs: week4.List[T])T""");$skip(23); val res$0 = 
  
  singleton("Text");System.out.println("""res0: week4.Cons[String] = """ + $show(res$0));$skip(15); val res$1 = 
  singleton(1);System.out.println("""res1: week4.Cons[Int] = """ + $show(res$1));$skip(20); val res$2 = 
  singleton[Int](2);System.out.println("""res2: week4.Cons[Int] = """ + $show(res$2));$skip(63); 
  
  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)));System.out.println("""list  : week4.Cons[Int] = """ + $show(list ));$skip(18); val res$3 = 
  
  nth(2, list);System.out.println("""res3: Int = """ + $show(res$3));$skip(16); val res$4 = 
  nth(-1, list);System.out.println("""res4: Int = """ + $show(res$4));$skip(15); val res$5 = 
 	nth(4, list);System.out.println("""res5: Int = """ + $show(res$5))}
}
