package week4

object sheet {
  
  def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])
                                                  //> singleton: [T](elem: T)week4.Cons[T]
  
  def nth[T](n: Int, xs: List[T]): T = {
  	if(xs.isEmpty) throw new IndexOutOfBoundsException
  	else if( n== 0) xs.head
  	else nth(n - 1, xs.tail)
  }                                               //> nth: [T](n: Int, xs: week4.List[T])T
  
  singleton("Text")                               //> res0: week4.Cons[String] = Text
  singleton(1)                                    //> res1: week4.Cons[Int] = 1
  singleton[Int](2)                               //> res2: week4.Cons[Int] = 2
  
  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
                                                  //> list  : week4.Cons[Int] = 1
  
  nth(2, list)                                    //> res3: Int = 3
  nth(-1, list)                                   //> java.lang.IndexOutOfBoundsException
                                                  //| 	at week4.sheet$$anonfun$main$1.nth$1(week4.sheet.scala:8)
                                                  //| 	at week4.sheet$$anonfun$main$1.apply$mcV$sp(week4.sheet.scala:20)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week4.sheet$.main(week4.sheet.scala:3)
                                                  //| 	at week4.sheet.main(week4.sheet.scala)
 	nth(4, list)
}