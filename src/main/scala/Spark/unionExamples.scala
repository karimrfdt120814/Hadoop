package Spark

import org.apache.spark.sql.SparkSession

object unionExamples {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder().appName("union").master("local[*]").getOrCreate()

    val inputFile = spark.sparkContext.textFile("D:\\Practice\\filter.txt")
    println("Input file count: " + inputFile.count())

    val inputFile1 = spark.sparkContext.textFile("C:\\Users\\Asus\\Desktop\\input.txt")
    println("Input file1 count: " + inputFile1.count())

    val unionData = inputFile.union(inputFile1)
    println("Union count: " + unionData.count())

  }

}
