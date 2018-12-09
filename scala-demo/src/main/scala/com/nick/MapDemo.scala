package com.nick

import org.apache.spark.{SparkConf, SparkContext}

object MapDemo {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("scalaTest").setMaster("local[*]")
    val sc = SparkContext.getOrCreate(conf)
    val rdd = sc.parallelize(1 to 6)
    rdd.map(_*100).foreach(println)
  }
}
