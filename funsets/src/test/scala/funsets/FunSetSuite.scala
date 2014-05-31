package funsets

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * This class is a test suite for the methods in object FunSets. To run
 * the test suite, you can either:
 *  - run the "test" command in the SBT console
 *  - right-click the file in eclipse and chose "Run As" - "JUnit Test"
 */
@RunWith(classOf[JUnitRunner])
class FunSetSuite extends FunSuite {

  /**
   * Link to the scaladoc - very clear and detailed tutorial of FunSuite
   *
   * http://doc.scalatest.org/1.9.1/index.html#org.scalatest.FunSuite
   *
   * Operators
   *  - test
   *  - ignore
   *  - pending
   */

  /**
   * Tests are written using the "test" operator and the "assert" method.
   */
  test("string take") {
    val message = "hello, world"
    assert(message.take(5) == "hello")
  }

  /**
   * For ScalaTest tests, there exists a special equality operator "===" that
   * can be used inside "assert". If the assertion fails, the two values will
   * be printed in the error message. Otherwise, when using "==", the test
   * error message will only say "assertion failed", without showing the values.
   *
   * Try it out! Change the values so that the assertion fails, and look at the
   * error message.
   */
  test("adding ints") {
    assert(1 + 2 === 3)
  }

  import FunSets._

  test("contains is implemented") {
    assert(contains(x => true, 100))
  }

  /**
   * When writing tests, one would often like to re-use certain values for multiple
   * tests. For instance, we would like to create an Int-set and have multiple test
   * about it.
   *
   * Instead of copy-pasting the code for creating the set into every test, we can
   * store it in the test class using a val:
   *
   *   val s1 = singletonSet(1)
   *
   * However, what happens if the method "singletonSet" has a bug and crashes? Then
   * the test methods are not even executed, because creating an instance of the
   * test class fails!
   *
   * Therefore, we put the shared values into a separate trait (traits are like
   * abstract classes), and create an instance inside each test method.
   *
   */

  trait TestSets {
    val s1 = singletonSet(1)
    val s2 = singletonSet(2)
    val s3 = singletonSet(3)
    val s4 = singletonSet(4)
    val even = union(union(union(singletonSet(6), singletonSet(4)), singletonSet(8)), s2)
    val u1 = union(union(union(singletonSet(-1), singletonSet(-2)), s1), s2)
    val bigUnion = union(union(union(union(union(s1, s3), s4), singletonSet(5)), singletonSet(7)), singletonSet(1000))
  }

  /**
   * This test is currently disabled (by using "ignore") because the method
   * "singletonSet" is not yet implemented and the test would fail.
   *
   * Once you finish your implementation of "singletonSet", exchange the
   * function "ignore" by "test".
   */
  test("singletonSet(1) contains 1") {

    /**
     * We create a new instance of the "TestSets" trait, this gives us access
     * to the values "s1" to "s3".
     */
    new TestSets {
      /**
       * The string argument of "assert" is a message that is printed in case
       * the test fails. This helps identifying which assertion failed.
       */
      assert(contains(s1, 1), "Singleton")
    }
  }

  test("singletonSet(1) does not contains 2") {
    new TestSets {
      assert(!contains(s1, 2), "Singleton")
    }
  }

  test("union contains all elements") {
    new TestSets {
      val s = union(s1, s2)
      assert(contains(s, 1), "Union 1")
      assert(contains(s, 2), "Union 2")
      assert(!contains(s, 3), "Union 3")
    }
  }

  test("interset contains all elements") {
    new TestSets {
      val s = intersect(union(s1, s2), union(s2, s3))
      assert(contains(s, 2), "Intersect 2")
      assert(!contains(s, 1), "Intersect 1")
      assert(!contains(s, 3), "Intersect 3")
    }
  }

  test("diff contains all elements") {
    new TestSets {
      val us2 = union(union(union(s1, singletonSet(2)), s3), s4)
      val s = diff(bigUnion, us2)
      assert(!contains(s, 1), "Diff 1")
      assert(!contains(s, 3), "Diff 3")
      assert(!contains(s, 4), "Diff 4")
      assert(contains(s, 5), "Diff 5")
      assert(contains(s, 7), "Diff 7")
      assert(contains(s, 1000), "Diff 1000")
    }
  }

  test("filter all negative elements") {
    new TestSets {
      val s = filter(u1, _ < 0)
      assert(!contains(s, 1), "Filter 1")
      assert(!contains(s, 2), "Filter 2")
      assert(!contains(s, 0), "Filter 2")
      assert(contains(s, -1), "Filter -1")
      assert(contains(s, -2), "Filter -2")
    }
  }

  test("forall satisfy all elements") {
    new TestSets {
      assert(!forall(bigUnion, _ < 5), "Forall False")
      assert(forall(bigUnion, _ > 0), "Forall True")
      assert(!forall(bigUnion, _ == 0), "Forall False")
      assert(forall(even, _ % 2 == 0), "Forall True")
      assert(forall(emptySet, _ % 2 == 0), "Forall True")
    }
  }

  test("exists satisfy one element") {
    new TestSets {
      assert(exists(even, _ % 2 == 0), "Exists True")
      assert(exists(even, _ == 4), "Exists True")
      assert(exists(even, _ == 6), "Exists True")
      assert(exists(even, _ == 8), "Exists True")
      assert(!exists(even, _ == 5), "Exists False")
      assert(!exists(even, _ == 10), "Exists False")
      assert(!exists(even, _ % 2 != 0), "Exists False")
    }
  }

  test("map all elements") {
    new TestSets {
      val square = map(even, x => x * x)
      assert(contains(square, 4), "Map True")
      assert(contains(square, 16), "Map True")
      assert(contains(square, 36), "Map True")
      assert(contains(square, 64), "Map True")
      assert(!contains(square, 2), "Map False")
    }
  }

}
