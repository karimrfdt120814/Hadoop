package com.scalaSpark.practice

object Lists {

  def main(args:Array[String])= {

    val ranks = List(12, 13, 14, 12, 12, 12, 44, 66)

    // println(ranks)

    val profits = List(23.4, 56.3, 77.8F, 32.9, 4)

    // println(profits)

    val file = List(1000, 'G', "GK", false, 55.78, 23.7)

    // println(file)

    val numList = List(1, 2, 3, 4, 5, 6, 8, 'K', "GK", true, 34.56, 44, 5)

    for (a <- numList) {
      //println(s"value of a is: $a")
    }


    //guard

    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 12, 33, 44, 55, 8)
    for (a <- numbers if a != 3; if a < 8) {
      //  println("the value of a is: "+a)
    }

    /** *yield
     * To store a return value of a for loop into a variable we will use yield
     */

    val numbers2 = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val returnValue = for (i <- numbers2) yield i * 2

    for ((value, index) <- returnValue.zipWithIndex) {
      // println("The value at index " +index+ " is " +value )
    }

    val guardYield = for (n <- numbers; if n % 2 == 0) yield n * 2

    for (i <- guardYield) {
      println(i)
    }


    val letters = List("A", "B", "C")
    val nums = List(1)

    val combos = for {
      l <- letters
      i <- nums
    } yield s"$l$i"

    for (c <- combos) {
      //println(c)

    }

    case class user(id:Int,Name:String,age:Int)

    val users=List(
      user(1,"Alice",20),
      user(2,"Bob",22),
      user(3,"Charlie",30)
    )

    val userData = for(u <- users if u.age >22) yield u.Name
   // userData.foreach(println)

    val files = List("data1.json", "data2.csv", "data3.json")

    val jsonData =for(data <- files; if data.endsWith(".json")) yield data.toUpperCase()

   // jsonData.foreach(println)

    val csvData = for(data <- files; if data.endsWith(".csv")) yield data.toUpperCase()

    csvData.foreach(println)




  }


  }


