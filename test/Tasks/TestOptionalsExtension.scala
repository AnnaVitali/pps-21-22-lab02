package Tasks

import Tasks.OptionalsExtension.Option
import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import org.junit.jupiter.api.Test

class TestOptionalsExtension {

  @Test def testFilterSome: Unit = {
    val optional: Option[Int] = Option.Some(5)

    assertEquals(Option.filter(optional)(_ > 2), Option.Some(5))
  }

  @Test def testFilterNone: Unit = {
    val optional: Option[Int] = Option.Some(5)

    assertEquals(Option.filter(optional)(_ > 8) , Option.None())
  }

  @Test def testFilterEmpty: Unit = {
    val optional: Option[Int] = Option.None()

    assertEquals(Option.filter(optional)(_ > 2) , Option.None())
  }

  @Test def testMapSome: Unit = {
    val optional: Option[Int] = Option.Some(5)

    assertEquals(Option.map(optional)(_ > 2), Option.Some(true))
  }

  @Test def testMapEmpty: Unit = {
    val optional: Option[Int] = Option.None()

    assertEquals(Option.map(optional)(_ > 2) , Option.None())
  }

  @Test def testMap2Some: Unit = {
    val optional1: Option[Int] = Option.Some(5)
    val optional2: Option[Boolean] = Option.Some(true)

    assertEquals(Option.map2(optional1, optional2), Option.Some(Tuple2(5, true)))
  }


}
