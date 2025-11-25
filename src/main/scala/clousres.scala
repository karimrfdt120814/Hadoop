object clousres {

  def main(args:Array[String]):Unit={

    /****
     * scala closure is a function whose return value
     * depends on the one or more variables declared out side of the function...
     */

//    val factor = 10
//
//    val multiplication = (x:Int)=>x*factor
//
//    println(multiplication(5)) //prints 50
//
//
//
//    val first_name = "Karimulla"
//
//    val full_name = (x:String) => x + " " + first_name
//
//    println("The full Name is:" +full_name("Shaik"))


    val number = 100

    val sum = (x:Int,y:Int) => x+y

    val res= sum(1,4)
    println(res)

  }

}
