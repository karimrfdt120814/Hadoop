object Lists {

  def main(args:Array[String]):Unit={

    val emptyList = List(1,2,"karim",5.23,'N',false)

    println("The first element in the emptyList is:"+emptyList.head)
    println("The result of tail: " + emptyList.tail)
    println("Size of empty list is: "+emptyList.size)
    println("The length is:" +emptyList.length)
    println("The reverse order is: "+emptyList.reverse)
    println(emptyList.updated(0,4))

    val nums = List(1,2,3,4,5,6)

    println(nums drop 2 take 2)

    def secondLargest(nums: List[Int]): Int = {
      val sorted = nums.distinct.sorted
      sorted(sorted.length - 2)
    }
    
    println(secondLargest(nums))


  }

}
