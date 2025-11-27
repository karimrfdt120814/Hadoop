import org.apache.spark.sql.SparkSession

object filter {

  def main(args:Array[String]): Unit = {

    val spark = SparkSession.builder().appName("FilerExamples").master("local[*]").getOrCreate()

    val readFile = spark.sparkContext.textFile("C:\\Users\\Asus\\Desktop\\input.txt")

    val filteredData = readFile.filter(x=>x.length <= 30)

  //  filteredData.collect.foreach(println)

    val readFile2 = spark.sparkContext.textFile("D:\\Practice\\filter.txt")

    val filteredData2 = readFile2.filter(x=>x.contains("Karimulla"))

    val startsWithKarimulla = readFile2.filter(x=>x.startsWith("Karimulla"))

    val endsWithKarimulla = readFile2.filter(x=>x.endsWith("Karimulla"))

    //endsWithKarimulla.collect.foreach(println)

    filteredData.repartition(1).saveAsTextFile("D:\\Practice\\filteredData")

    startsWithKarimulla.repartition(1).saveAsTextFile("D:\\Practice\\StartsWithData")

    endsWithKarimulla.repartition(1).saveAsTextFile("D:\\Practice\\endsWithData")

    filteredData2.count()



    val inputRdd=spark.sparkContext.parallelize(List(("hadoop",100),("Spark",200),("scala",300),("mapreduce",40),("Kafka",70)))

val contaisArdd=inputRdd.filter(x=>(x._1.contains("a")))

    contaisArdd.collect.foreach(println)

  }

}
