package com.nick;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import java.util.Arrays;
import java.util.List;


public class MapDemo {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("javaTest").setMaster("local[*]");
        JavaSparkContext jsc = new JavaSparkContext(conf);
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6);
        JavaRDD<Integer> rdd = jsc.parallelize(ints);
        JavaRDD<Integer> rdd1 = rdd.map(i -> i * 100); // 每个元素乘以一百倍
        rdd1.foreach(i -> System.out.println("i = " + i));
    }
}
