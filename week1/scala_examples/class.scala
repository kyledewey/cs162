class MyBasicClass

class WithAConstructor {
  println("I've been constructed")
  println("No, seriously, I exist")

  def foo() {
    println("bar")
  }
}

class WithAnArgument(x: Int) {
  println("My argument: " + x)
  def bar() {
    println("bar")
  }
}

// there is no body, so the brackets can be ommitted
class WithSavedArgument(val x: Int)

class WithSavedMutableArgument(var y: Int) {
  println("I'm mutable, so no one likes me.")
}
