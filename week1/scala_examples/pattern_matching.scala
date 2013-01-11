// with "sealed", we say that everything that overrides this class
// is defined in the same file.  This is important for pattern matching
sealed abstract class MyClass
case class FirstCase(x: Int) extends MyClass
case class SecondCase(y: Double, z: Int) extends MyClass
case class NestedCase(f: FirstCase, s: SecondCase) extends MyClass
case object EmptyCase extends MyClass

def foo(obj: MyClass): Int =
  obj match {
    case FirstCase(x) => x
    case SecondCase(x, y) => (x + y).asInstanceOf[Int]
    case NestedCase(FirstCase(12), _) =>
      // underscore in this context means we don't care about what's
      // there.  In this case, it means ignore the SecondCase object
      128
    case NestedCase(_, SecondCase(_, 2)) => 5
    case NestedCase(f@FirstCase(_), SecondCase(_, 5)) => 
      // use the @ to refer to the whole thing being matched
      foo(f)
    case n@NestedCase(_, _) => 22
    case EmptyCase => 
      // case objects don't have (), since they take no parameters
      -1
  }

// now without sealed
abstract class NotSealed
case class Foo(x: Int) extends NotSealed
case class Bar(y: Int, z: String) extends NotSealed 

def bar(obj: NotSealed): Int =
  obj match {
    case Foo(5) => 22
    case f@Foo(_) => 
      // here we could have simply done Foo(x) => x, but this
      // is just for illustration
      f.x
    case Bar(_, "baz") => 
      3
    case _ => 
      // underscore is again used to signify we don't care.
      // this will match everything.  In this case, if we
      // didn't have a _ case, then the compiler would issue a
      // warning that the match weren't exhaustive
      42
  }


// you can also pattern match on anything, though you don't get all the
// super cool features
def unknown(x: Any): Int =
  x match {
    case i: Int => i
    case d: Double => d.asInstanceOf[Int]
    case b: Bar => 55
    case _ => -1
  }
