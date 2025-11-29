package Spark

import org.apache.spark.sql.SparkSession

object intersectionExample {

  def main(args:Array[String]):Unit={
    val spark = SparkSession.builder().appName("Intersection").master("local[*]").getOrCreate()

    val sc = spark.sparkContext

    val file1 = sc.textFile("D:\\Practice\\file1.txt")

    file1.collect.foreach(println)

    val file2 = sc.textFile("D:\\Practice\\file2.txt")

    file2.collect.foreach(println)

    println("File1 count: "+file1.count())
    println("File2 count: "+file2.count())


    val intersection = file1.intersection(file2)

    intersection.collect.foreach(println)


    println("Intersection data count: "+intersection.count())



  }

}
