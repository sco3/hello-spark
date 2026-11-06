#!/usr/bin/env -S uv run

from pyspark.sql import SparkSession


def main():
    print("Hello from hello-spark!")

    spark = (
        SparkSession.builder.appName("MyApp")
        .master("local[*]")  # local mode all cores
        .getOrCreate()
    )

    df = spark.createDataFrame(
        [
            (1, "Alice", 30),
            (2, "Bob", 25),
            (3, "Cara", 35),
        ],
        ["id", "name", "age"],
    )

    df.show()
    df.filter(df.age > 28).select("name").show()

    spark.stop()


if __name__ == "__main__":
    main()
