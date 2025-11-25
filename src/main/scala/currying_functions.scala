object currying_functions {

  /***
   *
   */

  def main(args:Array[String]):Unit={

//    def add(x:Int,y:Int):Int={
//      x+y
//    } //normal function
//
//    println(add(2,3))
//
//    def addCurr(x:Int)(y:Int):Int={
//      x+y
//    }
//
//    println(addCurr(2)(3))


    def partFun(a: Int)(b: Int)(c:Int) = a+b+c

    val partFun1 = partFun(2)(_:Int)(4)

    println(partFun1(5))

  }



}


