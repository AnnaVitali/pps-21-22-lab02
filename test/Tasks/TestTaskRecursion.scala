package Tasks

import Tasks.TaskRecursion.fib
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}

class TestTaskRecursion {

  @Test def testFibonacciNumber(): Unit = {
    val n: Int = 4
    val result: Int = 3
    assertEquals(fib(n), result)
  }

}
