package Tasks

import Tasks.ShapeModules.Shape
import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import org.junit.jupiter.api.Test

import java.lang.Math.{PI, pow}

class TestShapeModules {

  @Test def testRectanglePerimeter(): Unit = {
    val base: Int = 2
    val height: Int = 4
    val formulaResult: Double = (base + height) * 2
    val rectangle: Shape = Shape.Rectangle(base, height)

    assertEquals(Shape.perimeter(rectangle), (formulaResult))
  }

  @Test def testCirclePerimeter(): Unit = {
    val ray: Int = 2
    val formulaResult: Double = 2 * PI * ray
    val circle: Shape = Shape.Circle(ray)

    assertEquals(Shape.perimeter(circle), formulaResult)
  }

  @Test def testSqurePerimeter(): Unit = {
    val side: Int = 3
    val formulaResult: Double = 4 * side
    val square: Shape = Shape.Square(side)

    assertEquals(Shape.perimeter(square), formulaResult)
  }

  @Test def testRectangleArea(): Unit = {
    val base: Int = 2
    val height: Int = 4
    val formulaResult: Double = base * height
    val rectangle: Shape = Shape.Rectangle(base, height)

    assertEquals(Shape.area(rectangle), formulaResult)
  }

  @Test def testCircleArea(): Unit = {
    val ray: Int = 3
    val formulaResult: Double = PI * pow(ray, 2)
    val circle: Shape = Shape.Circle(ray)

    assertEquals(Shape.area(circle), formulaResult)
  }

  @Test def testSqureArea(): Unit = {
    val side: Int = 3
    val formulaResult: Double = pow(side,2)
    val square: Shape = Shape.Square(side)

    assertEquals(Shape.area(square), formulaResult)
  }

}
