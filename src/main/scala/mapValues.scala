import org.apache.spark.sql.SparkSession

object mapValues {

  /***
   * mapValues are used when we want to apply the transformations only to the values on the paired RDD
   ***/

  def main(args: Array[String]) {

    val spark = SparkSession.builder()
      .appName("MySparkApp") // Application name
      .master("local[*]") // Run locally with all available cores
      .getOrCreate()

    val data = spark.sparkContext
      .parallelize(List(("hadoop", 50), ("MapReduce", 40), ("Hive", 60), ("spark", 70), ("Scala", 80), ("sql", 90)))

    val mapValueData = data.mapValues(x=>x+1)

   // mapValueData = data.mapValues(_+1) // gives same output

    mapValueData.collect.foreach(println)

    val prices = spark.sparkContext.parallelize(List(("item1", 100.0), ("item2", 200.0)))

    val discounted = prices.mapValues(price => price * 0.90) // 10% discount

    discounted.collect.foreach(println)

    val reviews = spark.sparkContext.parallelize(List(("User1", "  Good "),("User2","  BAD ")))

    val trimmedData = reviews.mapValues(x=>x.trim.toLowerCase)

    println("printing reviews: " )
    reviews.collect.foreach(println)

    println("printing trimmed reviews: " )
    trimmedData.collect.foreach(println)

    val mapdata = data.map(x=> (x._1.reverse,x._2+100))

    mapdata.collect.foreach(println)

  }


}
