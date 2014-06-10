package forcomp

object sheet {

  Anagrams.wordOccurrences("Inconstitucionalissimamente")
                                                  //> res0: forcomp.Anagrams.Occurrences = List((a,2), (c,2), (e,2), (i,5), (l,1), 
                                                  //| (m,2), (n,4), (o,2), (s,3), (t,3), (u,1))

  //Anagrams.sentenceOccurrences(List("i", "love", "you"))

  Anagrams.wordAnagrams("linux")                  //> res1: List[forcomp.Anagrams.Word] = List(Linux)

  //Anagrams.combinations(Nil)
      
  //Anagrams.combinations(List(('a', 2), ('b', 2))) mkString "\n"
 

	//Anagrams.subtract(List(('r', 3)), List(('r', 1)))

       
	Anagrams.sentenceAnagrams(List("Yes", "Man")) mkString "\n"
                                                  //> res2: String = List(my, en, as)
                                                  //| List(my, as, en)
                                                  //| List(my, sane)
                                                  //| List(my, Sean)
                                                  //| List(yes, man)
                                                  //| List(en, my, as)
                                                  //| List(en, as, my)
                                                  //| List(men, say)
                                                  //| List(as, my, en)
                                                  //| List(as, en, my)
                                                  //| List(say, men)
                                                  //| List(man, yes)
                                                  //| List(sane, my)
                                                  //| List(Sean, my)
  
}