def summation(list: Seq[Int]) =
  list.foldLeft(0)(_ + _)

def myFilter(list: Seq[Int], predicate: Int => Boolean): Seq[Int] =
  list.foldLeft(List[Int]())(
    (retval, current) =>
      if (predicate(current)) current :: retval else retval).reverse

def myMap[T](list: Seq[Int], mapper: Int => T): Seq[T] =
  list.foldLeft(List[T]())(
    (retval, current) =>
      mapper(current) :: retval).reverse
