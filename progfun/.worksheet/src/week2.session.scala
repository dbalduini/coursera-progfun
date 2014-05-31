package week2

import scala.annotation.tailrec

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(319); 
  //def factorial(n: Int): Int =
  //	if(n == 0) 1 else n * factorial(n-1)
  	
  	def factorial(n: Int)= {
  		@tailrec
  		def factorialIter(acc:Int, n:Int): Int =
  			if(n == 0) acc
  			else factorialIter(acc*n, n-1)
  		
  		factorialIter(1, n)
  	};System.out.println("""factorial: (n: Int)Int""");$skip(20); val res$0 = 
  	
  	factorial(4);System.out.println("""res0: Int = """ + $show(res$0));$skip(16); val res$1 = 
  	factorial(5);System.out.println("""res1: Int = """ + $show(res$1))}
  
  
  
}
