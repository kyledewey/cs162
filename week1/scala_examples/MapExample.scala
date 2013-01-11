def addAmount1(list: Seq[Int], amount: Int) =
  list.map(i => i + amount)

// in this context, _ acts as the parameter for a function
def addAmount2(list: Seq[Int], amount: Int) =
  list.map(_ + amount)
