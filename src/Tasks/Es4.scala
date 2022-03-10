package Tasks

object Es4 extends App:

  def fib(n: Int): Int =
    def _fib(n: Int): Int = n match
      case 0 => 0
      case 1 => 1
      case _ => _fib(n-1) + _fib(n-2)
    _fib(n)
