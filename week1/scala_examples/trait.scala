trait MyTrait {
  def something(): String
  def or() =
    something + " or "
  override def toString() =
    or + " other"
}
