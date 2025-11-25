object Higher_order_functions {

  /***
   **** Higher order function is a function which takes another function as an argument***
   ***/
def main(args:Array[String]): Unit = {

}
//  def applyFuntion(i:Int,func:Int => Int):Int={
//    func(i)
//  }
//
//  def square(x:Int):Int={
//    x*x
//  }
//
//  println(applyFuntion(5,square))

  //map
//
  val numList = List(1,2,3,4,5,6)

//   def squares(x:Int):Int  = x*x
//
//  val squares_res1 = numList.map(squares)
//
//  val squares_res = numList.map(x=>x*x)
//
//  println("The squares are...: "+squares_res1)
//
//
//  val evens = numList.filter(x=>x%2==0)
//  println("the evens are...: "+evens)
//
//  //Here, filter is a function and it took another function x%2=0 as an argument. so it is higher order function.
//
//
  val numbers = List(1,2)
   val result =  numbers.flatMap(x=>List(x,x*10))

 // List((1,10,2,20)


  println("The flatMap results are...:" +result)

  /***
   *  Here, flatMap is a function and it took another function x=>List(x,x*10)
   *  as an argument. so it is a higher order function.
   */
//



}
