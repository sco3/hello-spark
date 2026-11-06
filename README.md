# Spark




## Run

Create and query data frame


```
time uv run create.py
```

Output
```
+---+-----+---+
| id| name|age|
+---+-----+---+
|  1|Alice| 30|
|  2|  Bob| 25|
|  3| Cara| 35|
+---+-----+---+

+-----+
| name|
+-----+
|Alice|
| Cara|
+-----+

real	0m10.232s
user	0m0.175s
sys	0m0.037s

```

And sparkless (rust based alternative):


```
time uv run create-sparkless.py 
```

Output:

```

Hello from hello-spark!
shape: (3, 3)
┌─────┬───────┬─────┐
│ id  ┆ name  ┆ age │
│ --- ┆ ---   ┆ --- │
│ i64 ┆ str   ┆ i64 │
╞═════╪═══════╪═════╡
│ 1   ┆ Alice ┆ 30  │
│ 2   ┆ Bob   ┆ 25  │
│ 3   ┆ Cara  ┆ 35  │
└─────┴───────┴─────┘
shape: (2, 1)
┌───────┐
│ name  │
│ ---   │
│ str   │
╞═══════╡
│ Alice │
│ Cara  │
└───────┘

real	0m0.046s
user	0m0.026s
sys	0m0.021s

```



Java version:
```
JAVA_HOME=<java 21 home dir> gradle run

```

Output:
```
...
Finished processing stats for write job 89d06d16-b693-4694-8f79-ec8443421cc4.
[main] INFO org.apache.spark.sql.catalyst.expressions.codegen.CodeGenerator - Code generated in 6.881178 ms
[main] INFO org.apache.spark.sql.catalyst.expressions.codegen.CodeGenerator - Code generated in 6.97379 ms
+---+-----+---+
| id| name|age|
+---+-----+---+
|  1|Alice| 30|
|  2|  Bob| 25|
|  3| Cara| 35|
+---+-----+---+

[main] INFO org.apache.spark.sql.catalyst.expressions.codegen.CodeGenerator - Code generated in 3.28008 ms
[main] INFO org.apache.spark.sql.catalyst.expressions.codegen.CodeGenerator - Code generated in 5.041892 ms
[main] INFO org.apache.spark.sql.catalyst.expressions.codegen.CodeGenerator - Code generated in 5.594982 ms
+-----+
| name|
+-----+
|Alice|
| Cara|
+-----+

[main] INFO org.apache.spark.SparkContext - SparkContext is stopping with exitCode 0 from stop at Creator.java:46.
...

```






Data files:
```
find data 
data
data/users.parquet
data/users.parquet/part-00005-82878583-1948-4873-ac2f-5a7207029948-c000.gz.parquet
data/users.parquet/.part-00005-82878583-1948-4873-ac2f-5a7207029948-c000.gz.parquet.crc
data/users.parquet/part-00000-82878583-1948-4873-ac2f-5a7207029948-c000.gz.parquet
data/users.parquet/.part-00000-82878583-1948-4873-ac2f-5a7207029948-c000.gz.parquet.crc
data/users.parquet/part-00001-82878583-1948-4873-ac2f-5a7207029948-c000.gz.parquet
data/users.parquet/.part-00001-82878583-1948-4873-ac2f-5a7207029948-c000.gz.parquet.crc
data/users.parquet/part-00003-82878583-1948-4873-ac2f-5a7207029948-c000.gz.parquet
data/users.parquet/.part-00003-82878583-1948-4873-ac2f-5a7207029948-c000.gz.parquet.crc
data/users.parquet/_SUCCESS
data/users.parquet/._SUCCESS.crc
```



