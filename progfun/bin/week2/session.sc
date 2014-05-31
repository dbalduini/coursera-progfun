package week2

import scala.annotation.tailrec

object session {
  //def factorial(n: Int): Int =
  //	if(n == 0) 1 else n * factorial(n-1)
  	
  	def factorial(n: Int)= {
  		@tailrec
  		def factorialIter(acc:Int, n:Int): Int =
  			if(n == 0) acc
  			else factorialIter(acc*n, n-1)
  		
  		factorialIter(1, n)
  	}                                         //> factorial: (n: Int)Int
  	
  	factorial(4)                              //> res0: Int = 24
  	factorial(5)                              //> res1: Int = 120
  
  
  
}