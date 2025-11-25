object scalaProg {

  def main(args: Array[String]): Unit = {

    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val result=
   for {
      a <- numList
      if a != 3
      if a < 8
    } yield a

    println(result)

    val factor = 10

    val multiplier = (x:Int) =>x*10

    println(multiplier(5))




  }
}

