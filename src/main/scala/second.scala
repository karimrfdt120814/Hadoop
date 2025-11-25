import org.apache.spark.sql.SparkSession

object second {

  def main(args:Array[String]):Unit={

    val spark = SparkSession.builder()
      .appName("MySparkApp") // Application name
      .master("local[*]") // Run locally with all available cores
      .getOrCreate()
/***
   val file = spark.sparkContext.textFile("C:\\Users\\Asus\\Desktop\\input.txt")

    val mapFile = file.map(x=>("Hello" + " " + x))

    mapFile.collect.foreach(println)

    //lazy evaluation
***/

    val data = spark.sparkContext
      .parallelize(List(("hadoop",50),("MapReduce",40),("Hive",60),("spark",70),("Scala",80),("sql",90)))

    val incrRdd = data.map(x=>(x._1,(x._2+100)))

    incrRdd.collect.foreach(println)

    println(data.count())
    println(incrRdd.count())

   // incrRdd.saveAsTextFile("C:\\\\Users\\\\Asus\\\\Desktop\\\\mapOut.txt")

    println("the partitoins are:  "+incrRdd.getNumPartitions)


  }

}
