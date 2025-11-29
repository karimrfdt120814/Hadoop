package Spark

import org.apache.spark.sql.SparkSession

object substractExample {

  def main(args:Array[String]):Unit ={

    val spark = SparkSession.builder().appName("Subtract").master("local[*]").getOrCreate()

    val sc = spark.sparkContext


  }

}
