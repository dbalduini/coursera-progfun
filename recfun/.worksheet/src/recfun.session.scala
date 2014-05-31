package recfun

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  println("Welcome to the Scala worksheet");$skip(82); 

  val phrase = "I told him (that itss not (yet) done). (But he wasnt listening)"

  import Main._;System.out.println("""phrase  : String = """ + $show(phrase ));$skip(33); val res$0 = 

  pascal(0, 0);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); val res$1 = 
  pascal(0, 2);System.out.println("""res1: Int = """ + $show(res$1));$skip(15); val res$2 = 
  pascal(1, 2);System.out.println("""res2: Int = """ + $show(res$2));$skip(15); val res$3 = 
  pascal(1, 3);System.out.println("""res3: Int = """ + $show(res$3));$skip(26); val res$4 = 
  // Row 4
  pascal(4, 4);System.out.println("""res4: Int = """ + $show(res$4));$skip(15); val res$5 = 
  pascal(3, 4);System.out.println("""res5: Int = """ + $show(res$5));$skip(15); val res$6 = 
  pascal(2, 4);System.out.println("""res6: Int = """ + $show(res$6));$skip(15); val res$7 = 
  pascal(1, 4);System.out.println("""res7: Int = """ + $show(res$7));$skip(15); val res$8 = 
  pascal(0, 4);System.out.println("""res8: Int = """ + $show(res$8));$skip(48); val res$9 = 

  balance("(if (zero? x) max (/ 1 x))".toList);System.out.println("""res9: Boolean = """ + $show(res$9));$skip(25); val res$10 = 
  balance(phrase.toList);System.out.println("""res10: Boolean = """ + $show(res$10));$skip(25); val res$11 = 
  balance("())(".toList);System.out.println("""res11: Boolean = """ + $show(res$11));$skip(24); val res$12 = 
  balance(":-)".toList);System.out.println("""res12: Boolean = """ + $show(res$12));$skip(30); val res$13 = 

  countChange(4, List(1, 2));System.out.println("""res13: Int = """ + $show(res$13))}
}
