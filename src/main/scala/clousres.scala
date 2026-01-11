object clousres {

  def main(args: Array[String]): Unit = {

    /** **
     * scala closure is a function whose return value
     * depends on the one or more variables declared out side of the function...
     */

    //example1:

    val factor = 10

        val multiplication = (x:Int)=>x*factor

        println(multiplication(5)) //prints 50


//example2:

    val first_name = "Karimulla"

        val full_name = (x:String) => x + " " + first_name

        println("The full Name is:" +full_name("Shaik"))


      //example3:


        val number = 100

        val sum = (x:Int) => x+number
        sum(2)
        println(sum(2))


//example4:

    def counterFunction(): () => Int = {
      var count = 0
      () => {
        count += 1
        count
      }
    }

    val countNow = counterFunction()

    println(countNow())
    println(countNow())
    println(countNow())

      /**
      ****example 5
       */

    def makeLogger(prefix:String):String=>Unit={
      (msg:String)=>println(s"[$prefix  $msg")
    }

    val errorLog = makeLogger("Error: ")
    val infoLog = makeLogger("Info: ")

    println(errorLog("Something went wrong.... please check the flow"))
    println(infoLog("Application has started...."))

    /**
     * example:6
     */

    def bankAccount(InitialBalance:Double):(Double=>Unit,Double=>Unit, ()=>Double)={
      var balance = InitialBalance
      val deposit = (amount: Double) => balance += amount
      val withDraw=(amount:Double)=> balance -=amount
      val getBalance=()=> balance

      (deposit, withDraw,getBalance)
    }

    val (deposit,withDraw,balance)=bankAccount(100)
    deposit(50)
    withDraw(20)
    println("remaining balance is: " +balance())

  }

  def makeAccumulator( number:Int):Unit={
    var number=0
    (addition:Int) => number +=addition

  }

  val acc = makeAccumulator()

  println(add5)


}
