package week3

object intsets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(42); 

  val s1 = new NonEmpty(3, Empty, Empty);System.out.println("""s1  : week3.NonEmpty = """ + $show(s1 ));$skip(21); 
  val s2 = s1 incl 5;System.out.println("""s2  : week3.IntSet = """ + $show(s2 ));$skip(21); 
  val s3 = s2 incl 2;System.out.println("""s3  : week3.IntSet = """ + $show(s3 ));$skip(45); 
  
  val s4 = new NonEmpty(12, Empty, Empty);System.out.println("""s4  : week3.NonEmpty = """ + $show(s4 ));$skip(17); val res$0 = 
  
  s3 union s4;System.out.println("""res0: week3.IntSet = """ + $show(res$0))}
  
}

abstract class IntSet {
  def contains(x: Int): Boolean
  def incl(x: Int): IntSet
  def union(other: IntSet): IntSet
}

object Empty extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)
  override def toString = "."
  def union(other: IntSet) = other
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def incl(x: Int): IntSet =
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this

  override def toString = "{" + left + elem + right + "}"
  
  def union(other: IntSet) = ((left union right) union other) incl elem
}
