
object S3ReadWrite {
  def main(args: Array[String]) {

  }
}

/*
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object S3ReadWrite {
  def main(args: Array[String]) {
    // create Spark context with Spark configuration
    val sc = new SparkContext(new SparkConf().setAppName("Spark Count"))

    val myrdd = sc.textFile("s3n://sre-wps-omega-poc/Spark_s3_fs/SourceFiles/input_txt_file")
               myrdd.collect().foreach(println)
               myrdd.saveAsTextFile("s3n://sre-wps-omega-poc/Spark_s3_fs/TargetFiles/output_files.txt")

  }
}
*/