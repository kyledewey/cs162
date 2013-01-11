def foo(x: Int): Option[Int] =
  if (x < 0) {
    // anything less than zero should be null
    // to use null with Option, use the special "None"
    None
  } else {
    // A non-null value
    // to use a non-null value with Option, use the special "Some()"
    Some(x)
  }


// to use option, use .isDefined or .isEmpty
// there are other, better ways as well, but this is sufficient for now
val opt = foo(-1)
if (opt.isDefined) {
  println("Opt is defined; it's essentially a non-null object")
} else {
  assert(opt.isEmpty)
  println("Opt is not defined; it's essentially null")
}

// fun fact: Option is implemented much like the following:
abstract class MyOption[T]
case class MyNone[T]() extends MyOption[T]
case class MySome[T](item: T) extends MyOption[T]

// ...which, in turn, means that we can use it with pattern matching
def matchOption(opt: Option[Object]) =
  opt match {
    case Some(x) => println("Got object: " + x)
    case None => println("Null value")
  }
