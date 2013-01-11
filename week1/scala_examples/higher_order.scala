// a function that takes an integer "x" and returns a function that
// will take an integer "y" and ultimately add "x" and "y"
def plusX(x: Int): Int => Int =
  (y: Int) => x + y

// a function with a missing behavior: the capability to safely
// handle null
def breaksOnNull(obj: Object): Int =
  obj.hashCode

// returns a new function that will instrument an existing function
// to safely handle null
def makeNullSafe(func: Object => Int): Object => Int =
  (obj: Object) =>
    if (obj == null) -1 else func(obj)

val wontBreakOnNull = makeNullSafe(breaksOnNull)

