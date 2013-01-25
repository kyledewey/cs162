def myFlatMap[T, U](items: Seq[T], func: T => Seq[U]) =
  items.map(func).reduceLeft(_ ++ _)

val items1 = Seq(1, 2, 3).flatMap( (i: Int) => Seq(i-1,i,i+1) )
val items2 = myFlatMap(Seq(1, 2, 3), (i: Int) => Seq(i-1, i, i+1))
// returns List(0, 1, 2, 1, 2, 3, 2, 3, 4)
