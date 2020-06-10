package tech.logic.edu.hub.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object practice {
  def main(args: Array[String]){
    
    val conf = new SparkConf().setAppName("First Spark Test Program!").setMaster("local")
    val sc = new SparkContext(conf)
    
    val rdd1 = sc.parallelize(
        Seq(("maths",52),("english",75),("science",82), ("computer",65),("maths",85))
        )
        
    rdd1.foreach(println)
    
    val sortedRdd = rdd1.sortByKey()
    sortedRdd.foreach(println)
    
    
  }
}