package Day4

object ExtractDemo {
  def unapply(n: Int): Int = {
    n / 2
  }
  def apply(n: Int): Int = {
    n * 2
  }
}