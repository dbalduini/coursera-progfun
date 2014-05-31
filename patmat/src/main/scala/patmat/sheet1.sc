package patmat

import Huffman._

object sheet1 {
  
 val leaflist = List(Leaf('x', 4), Fork(Leaf('e', 1), Leaf('t', 2), List('e', 't'), 3))
                                                  //> leaflist  : List[Product with Serializable with patmat.Huffman.CodeTree] = L
                                                  //| ist(Leaf(x,4), Fork(Leaf(e,1),Leaf(t,2),List(e, t),3))
 
 combine(leaflist)                                //> res0: List[patmat.Huffman.CodeTree] = List(Fork(Leaf(x,4),Fork(Leaf(e,1),Lea
                                                  //| f(t,2),List(e, t),3),List(x, e, t),7))
  
 
}