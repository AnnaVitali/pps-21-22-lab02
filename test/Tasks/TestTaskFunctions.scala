package Tasks

import Tasks.TaskFunctions.{empty, neg, negAsFunctionLiteral, negAsMethod, p1, p2, p4, parityAsFunctionLiteral, parityAsMethod}
import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import org.junit.jupiter.api.Test
import u02.BTrees.Tree.{Branch, Leaf, count, find, size}

class TestTaskFunctions {

  @Test def testParityAsFunctionLiteral(): Unit = {
    val oddNumber: Int = 3
    assertEquals(parityAsFunctionLiteral(oddNumber), "odd")
  }

  @Test def testParityAsMethod(): Unit = {
    val oddNumber: Int = 3
    assertEquals(parityAsMethod(oddNumber), "odd")
  }

  @Test def testNegAsFunctionLiteral(): Unit = {
    val notEmpty = negAsFunctionLiteral(empty) // which type of notEmpty?
    assertTrue(notEmpty("foo")) // true
    assertFalse(notEmpty("")) // false
    assertTrue((notEmpty("foo") && !notEmpty(""))) //true
  }

  @Test def testNegAsMethod(): Unit = {
    val notEmpty = negAsMethod(empty) // which type of notEmpty?
    assertTrue(notEmpty("foo")) // true
    assertFalse(notEmpty("")) // false
    assertTrue((notEmpty("foo") && !notEmpty(""))) //true
  }

  @Test def testGenericNeg(): Unit = {
    val notEmpty = neg[String](empty) // which type of notEmpty?
    assertTrue(notEmpty("foo")) // true
    assertFalse(notEmpty("")) // false
    assertTrue((notEmpty("foo") && !notEmpty(""))) //true
  }

  @Test def testNotCurringFunctionLiteral(): Unit = {
    val firstElement: Int = 1
    val secondElement: Int = 2
    val thirdElement: Int = 3
    assertTrue(p2(firstElement, secondElement, thirdElement))
  }

  @Test def testCurringFunctionLiteral(): Unit = {
    val firstElement: Int = 1
    val secondElement: Int = 2
    val thirdElement: Int = 3
    assertTrue(p1(firstElement)(secondElement)(thirdElement))
  }

  @Test def testNotCurringMethod(): Unit = {
    val firstElement: Int = 1
    val secondElement: Int = 2
    val thirdElement: Int = 3
    assertTrue(p4(firstElement, secondElement, thirdElement))
  }

  @Test def testCurringMethod(): Unit = {
    val firstElement: Int = 1
    val secondElement: Int = 2
    val thirdElement: Int = 3
    assertTrue(p1(firstElement)(secondElement)(thirdElement))
  }


}
