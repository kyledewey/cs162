class AsNonCase(val x: Int) {
  override def hashCode() = x
  override def equals(other: Any): Boolean =
    other.isInstanceOf[AsNonCase] && other.asInstanceOf[AsNonCase].x == x
  def copy(x: Int = this.x) =
    new AsNonCase(x)
  // plus more methods
  def myCustomMethod(y: Double): Double =
    x + y
}

object AsNonCase {
  def apply(x: Int) =
    new AsNonCase(x)
  def unapply(a: AsNonCase): Option[Int] =
    Some(a.x)
}

case class AsCase(x: Int) {
  def myCustomMethod(y: Double): Double =
    x + y
}

// note that we can also combine case classes and case objects,
// like so:
case object MySingleObject

