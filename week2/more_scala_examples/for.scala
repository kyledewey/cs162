def evensUntil(x: Int) =
  for (i <- (1 until x);
       if i % 2 == 0) yield i
// internally:
// (1 until x).filter( i => i % 2 == 0 )

def allPairs[T, U](ts: Seq[T], us: Seq[U]): Seq[(T, U)] =
  for {
    t <- ts
    u <- us
  } yield (t, u)
// internally:
// ts.flatMap( t =>
//   us.map( u =>
//     (t, u)))

def evenPairs(ts: Seq[Int], us: Seq[Int]): Seq[(Int, Int)] =
  for {
    t <- ts
    u <- us
    if t % 2 == 0 && u % 2 == 0
  } yield (t, u)
// internally...odd

def printItems[T](items: Seq[T]) {
  for (item <- items)
    println(item)
}
// internally:
// items.foreach( item => println(item) )

def verbosePrintItems[T](items: Seq[T]) {
  for (item <- items) {
    print("Item: ")
    println(item)
  }
}
// internally:
// items.foreach( item => {
//   print("Item: ")
//   println(item)
// })
