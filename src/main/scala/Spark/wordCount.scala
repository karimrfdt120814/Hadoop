package Spark

import org.apache.spark.sql.SparkSession

object wordCount {
  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder().appName("union").master("local[*]").getOrCreate()

    val inputFile = spark.sparkContext.textFile("D:\\Practice\\filter.txt")

    //val flatFile = inputFile.flatMap(x=>x.split("\\"))



  }



}
