package week7

object water {
  
  val problem = new Pouring(Vector(4, 9))         //> problem  : week7.Pouring = week7.Pouring@44eefb4
  
  problem.solutions(6)                            //> res0: Stream[week7.water.problem.Path] = Stream(Fill(1) Pour(1,0) Empty(0) P
                                                  //| our(1,0) Empty(0) Pour(1,0) Fill(1) Pour(1,0)--> Vector(4, 6), ?)
  
}