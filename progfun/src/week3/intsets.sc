package week3

object intsets {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val s1 = new NonEmpty(3, Empty, Empty)          //> s1  : week3.NonEmpty = {.3.}
  val s2 = s1 incl 5                              //> s2  : week3.IntSet = {.3{.5.}}
  val s3 = s2 incl 2                              //> s3  : week3.IntSet = {{.2.}3{.5.}}
  
  val s4 = new NonEmpty(12, Empty, Empty)         //> s4  : week3.NonEmpty = {.12.}
  
  s3 union s4                                     //> res0: week3.IntSet = {{.2{{.3.}5.}}12.}
  
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