package recfun

object session {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val phrase = "I told him (that itss not (yet) done). (But he wasnt listening)"
                                                  //> phrase  : String = I told him (that itss not (yet) done). (But he wasnt list
                                                  //| ening)

  import Main._

  pascal(0, 0)                                    //> res0: Int = 1
  pascal(0, 2)                                    //> res1: Int = 1
  pascal(1, 2)                                    //> res2: Int = 2
  pascal(1, 3)                                    //> res3: Int = 3
  // Row 4
  pascal(4, 4)                                    //> res4: Int = 1
  pascal(3, 4)                                    //> res5: Int = 4
  pascal(2, 4)                                    //> res6: Int = 6
  pascal(1, 4)                                    //> res7: Int = 4
  pascal(0, 4)                                    //> res8: Int = 1

  balance("(if (zero? x) max (/ 1 x))".toList)    //> res9: Boolean = true
  balance(phrase.toList)                          //> res10: Boolean = true
  balance("())(".toList)                          //> res11: Boolean = false
  balance(":-)".toList)                           //> res12: Boolean = false

  countChange(4, List(1, 2))                      //> res13: Int = 3
}