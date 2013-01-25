def patternMatchTwoThings(x: Int, y: Int ) {
  (x, y) match { // create a new tuple and immediately match against it
    case (42, 57) => println("Special case!")
    case _ => () // refer to Unit as an object
  }
}
