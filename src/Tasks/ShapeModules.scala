package Tasks

import java.awt.Rectangle
import java.lang.Math.*

object ShapeModules extends App:

  enum Shape:
    case Rectangle(base: Int, height: Int)
    case Circle(ray: Int)
    case Square(side: Int)

  object Shape:
    def perimeter(shape: Shape): Double = shape match
      case Rectangle(b, h) => (b + h) * 2
      case Circle(r) => 2 * PI * r
      case Square(s) => 4 * s

    def area(shape: Shape): Double = shape match
      case Rectangle(b, h) => b * h
      case Circle(r) => PI * pow(r, 2)
      case Square(s) => pow(s, 2)
