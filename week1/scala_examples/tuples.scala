def takeTuple(tup: (Int, Double, Int)): Int =
  tup._3

def returnTuple(x: Int, y: String): (Int, String) =
  (x, y)


// SIDE NOTE: when we don't use = { for defining a function,
// this means the function doesn't return anything.
def patternMatchTuple(tup: (Int, Int)) {
  tup match {
    case (1, 2) => println("Buckle my shoe")
    case (3, 4) => println("Shut the door")
    case (5, 6) => println("Pick up sticks")
    case (7, 8) => println("Lay them straight")
    case (9, 10) => println("A big fat hen")
    case _ => println("I guess you don't like nursery rhymes.")
  }
}

// total tangent
def anotherNoReturn(x: Int): Unit =
  println(x)
