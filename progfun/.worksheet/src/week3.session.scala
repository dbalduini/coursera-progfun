package week3

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(30); 

  val x = new Rational(1, 3);System.out.println("""x  : week3.Rational = """ + $show(x ));$skip(29); 
  val y = new Rational(5, 7);System.out.println("""y  : week3.Rational = """ + $show(y ));$skip(29); 
  val z = new Rational(3, 2);System.out.println("""z  : week3.Rational = """ + $show(z ));$skip(19); val res$0 = 

  x.sub(y).sub(z);System.out.println("""res0: week3.Rational = """ + $show(res$0));$skip(10); val res$1 = 
  y add y;System.out.println("""res1: week3.Rational = """ + $show(res$1));$skip(11); val res$2 = 
  x less y;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(10); val res$3 = 
  x max y;System.out.println("""res3: week3.Rational = """ + $show(res$3));$skip(21); val res$4 = 
  
  new Rational(2);System.out.println("""res4: week3.Rational = """ + $show(res$4))}
}

class Rational(x: Int, y: Int) {
	require(y != 0, "denominator must be positive")
	
	def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)

  val numer = x / g
  val denom = y / g

	def less(that: Rational) = numer * that.denom < that.numer * denom
	
	def max(that: Rational) = if(this.less(that)) that else this

  def add(that: Rational) =
    new Rational(numer * that.denom + that.numer * denom,
      denom * that.denom)

  def neg = new Rational(-numer, denom)

  def sub(that: Rational) = add(that.neg)

  override def toString = numer + "/" + denom

}
