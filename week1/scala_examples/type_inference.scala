def plus1(x: Int, y: Int): Int = x + y

def plus2(x: Int, y: Int) = x + y

def something1(x: Int): Double = {
  val y: Double = x * 1.5
  val z: Int = x / 2
  x + y + z
}

def something2(x: Int) = {
  val y = x * 1.5
  val z = x / 2
  x + y + z
}

val bigType: List[List[List[Int]]] = List()

def blah1(item: List[List[List[Int]]]): List[List[List[Int]]] = {
  val inner: List[List[Int]] = item.head
  println(inner)
  item
}

def blah2(item: List[List[List[Int]]]) = {
 val inner = item.head
  println(inner)
  item
} 
