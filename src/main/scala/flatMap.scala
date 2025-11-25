import org.apache.spark.sql.SparkSession

object flatMap {

  def main(args:Array[String]): Unit = {

    val spark = SparkSession.builder().appName("flatMap").master("local[4]").getOrCreate()

    val inputFile = spark.sparkContext.textFile("C:\\Users\\Asus\\Desktop\\input.txt")

    val flatmapData = inputFile.flatMap(x=>x.split(" "))

    val mapData = inputFile.map(x=>x.split(" "))

    mapData.collect.foreach(println)

    flatmapData.collect.foreach(println)
  }

}
