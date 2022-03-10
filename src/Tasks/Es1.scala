package Tasks

object Es1 extends App:
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
