##Spark




#Run

Create and query data frame


```
uv run create.py
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