package Tasks

object Es3 extends App:

  def compose(f: Int => Int, g: Int => Int): Int => Int = x=> f(g(x))
