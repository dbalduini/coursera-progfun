package funsets

object Main extends App {
  import FunSets._
  val s1 = singletonSet(1)
  val s2 = singletonSet(2)
  val s3 = singletonSet(3)
  val s4 = singletonSet(4)
  println(contains(s1, 1))
  val even = union(union(union(singletonSet(6), singletonSet(4)), singletonSet(8)), singletonSet(2))
  val s = union(union(union(singletonSet(-1), singletonSet(-2)), singletonSet(1)), singletonSet(2))
  val bigUnion = union(union(union(union(union(s1, s3), s4), singletonSet(5)), singletonSet(7)), singletonSet(1000))

  val p1 = (x: Int) => x < 5
  val p2 = (x: Int) => x % 2 == 0

  val in = intersect(bigUnion, p1)

  printSet(in)

  
  def exists2(s: Set, p: Int => Boolean): Boolean = {
    def iter(a: Int): Boolean = {
      if (a > bound) false
      else if (contains(intersect(s, p), a) && p(a)) true
      else iter(a + 1)
    }
    iter(-bound)
  }


  printSet(bigUnion)

  println(exists2(bigUnion, _ == 999))

  println(exists2(bigUnion, _ == 5))
  println(exists2(bigUnion, _ > 5))

}
