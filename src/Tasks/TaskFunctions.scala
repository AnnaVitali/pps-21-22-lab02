package Tasks

object TaskFunctions extends App:

  val parityAsFunctionLiteral: (Int) => String = _ match
    case i if i % 2 == 0 => "even"
    case _ => "odd"

  def parityAsMethod (x: Int): String = x match
    case i if i % 2 == 0 => "even"
    case _ => "odd"

  println(parityAsFunctionLiteral(3))
  println(parityAsMethod(2))

  val negAsFunctionLiteral: (String => Boolean) => String => Boolean = p => s => !p(s)
  def negAsMethod (p: String => Boolean): String => Boolean = s => !p(s)
  def neg[X](p: X => Boolean): X => Boolean = s => !p(s)

  val empty: String => Boolean = _ == "" // predicate on strings

  val p1: Int => Int => Int => Boolean =  x => y => z => x <= y && y <= z
  val p2: (Int, Int, Int) => Boolean = (x, y, z) => x <= y && y <= z

  def p3(x: Int)(y: Int)(z: Int): Boolean = x <= y && y <= z
  def p4(x: Int, y: Int, z: Int): Boolean = x <= y && y <= z










