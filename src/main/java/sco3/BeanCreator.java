package sco3;

import static org.apache.spark.sql.Encoders.bean;

import java.util.Arrays;
import java.util.List;

import org.apache.spark.api.java.function.FilterFunction;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.SparkSession;

public class BeanCreator {
	public static void main(String[] args) {
		System.out.println("Hello from hello-spark!");

		SparkSession spark = SparkSession.builder().appName("MyApp")
				.master("local[*]").getOrCreate();

		List<Person> rows = Arrays.asList( //
				new Person(1, "Alice", 30), //
				new Person(2, "Bob", 25), //
				new Person(3, "Cara", 35)//
		);

		Dataset<Person> df = spark.createDataset(rows, bean(Person.class));

		df.write() //
				.mode("overwrite") //
				.option("compression", "gzip") //
				.partitionBy("age") //
				.parquet("data/users.parquet");

		df.show();

		df.filter((FilterFunction<Person>) p -> p.getAge() > 28).show();

		spark.stop();
	}
}