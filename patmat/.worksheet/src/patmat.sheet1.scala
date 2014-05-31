package patmat

import Huffman._

object sheet1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(140); 
  
 val leaflist = List(Leaf('x', 4), Fork(Leaf('e', 1), Leaf('t', 2), List('e', 't'), 3));System.out.println("""leaflist  : List[Product with Serializable with patmat.Huffman.CodeTree] = """ + $show(leaflist ));$skip(21); val res$0 = 
 
 combine(leaflist);System.out.println("""res0: List[patmat.Huffman.CodeTree] = """ + $show(res$0))}
  
 
}
