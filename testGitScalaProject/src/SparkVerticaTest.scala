
object SparkVerticaTest {
  def main(args: Array[String]) {

  }
}
/*
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import com.vertica.jdbc.Driver

object SparkVerticaTest {
  def main(args: Array[String]) {
    // create Spark context with Spark configuration
    val spark = new SparkContext(new SparkConf().setAppName("Spark Count"))

    val jdbcDF = spark.read
                  .format("jdbc")
                  .option("url", "com.vertica.jdbc.Driver")
                  .option("dbtable", "schema.tablename")
                  .option("user", "username")
                  .option("password", "password")
                  .load()

  }
}
*/