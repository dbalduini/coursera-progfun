package week5

object sheet2 {
  
  
  def isPrime(n: Int): Boolean = (2 until n) forall (d => n % d != 0)
                                                  //> isPrime: (n: Int)Boolean
  
  isPrime(4)                                      //> res0: Boolean = false
  isPrime(5)                                      //> res1: Boolean = true
  isPrime(12)                                     //> res2: Boolean = false
  isPrime(11)                                     //> res3: Boolean = true
  isPrime(33)                                     //> res4: Boolean = false
  isPrime(37)                                     //> res5: Boolean = true
}