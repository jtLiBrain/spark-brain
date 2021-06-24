import org.apache.spark.sql.functions._
import org.apache.spark.sql.SparkSession

case class MeEvent(date: String, eventId: String)

object Test {
  def main(args: Array[String]): Unit = {
    val sparkSession = SparkSession
      .builder()
      .master("local[*]")
      .appName("Test SQL")
      .getOrCreate()
    import sparkSession.implicits._

    Seq(
      MeEvent("2021-06-23", "1"),
      MeEvent("2021-06-23", "1"),
      MeEvent("2021-06-23", "1")
    ).to


    /*data1.toDF()

    // Create table in the metastore using DataFrame's schema and write data to it
    df.write.format("delta").saveAsTable("events")

    // Create table with path using DataFrame's schema and write data to it
    df.write.format("delta").mode("overwrite").save("/delta/events")*/


    sparkSession.stop()
  }
}
