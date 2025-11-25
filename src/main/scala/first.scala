import org.apache.spark
import org.apache.spark.sql.{SQLContext, SparkSession}
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.functions


object first {

  def main(Args: Array[String]): Unit = {
    // Create SparkSession
    val spark = SparkSession.builder()
      .appName("MySparkApp") // Application name
      .master("local[*]") // Run locally with all available cores
      .getOrCreate()

    // Print Spark version
    println("Spark Version: " + spark.version)





    //.toDF("emp_id", "name", "salary")

    // --- Second DataFrame: Departments ---
  }

}
