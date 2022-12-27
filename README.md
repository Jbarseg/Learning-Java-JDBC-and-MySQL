# Learning JDBC and MySQL - Java

The first step you have to do is download MySQL at the following link: [MySQL Installer](https://dev.mysql.com/downloads/windows/installer/8.0.html).

When installing MySQL, you must choose your preferred MySQL server version and MySQL Workbench version.

When we already install MySQL, we proceed to create a new database, you can ask for all the steps to create a new database on [ChatGPT](https://chat.openai.com/chat).

SQL is Structured Query Language

## What we can do to create a new database is to click on Database and follow the next steps:

Important: A database schema defines how data is organized within a relational database

1. Click Connect to Database

![This is an image](https://myoctocat.com/assets/images/base-octocat.svg)

2. You can then choose the hostname and port of your server and also the username and password of the person who manages the database.
3. On the left you can find Administration and Schemas.
4. To create a new schema, we can use the right mouse button to choose Create schema and choose the name of our new Schema.
5. Then we can find on the left all the things we can do or edit with our new database. We can also ask ChatGPT if it doesn't find a setting you want to edit.

## MySQL Workbench Tables

If you want to organize all your data in our new database, what you can do is create a table in MySQL Workbench
A table is used to organize data in the form of rows and columns and used for both storing and displaying records in the structure format.
EXAMPLE: If we create a person name table and want the table to organize a number of people or users, we might like to add some variables to our new table such as user id, first name, last name, email , etc. So when we create the table we can create these variables and then we can choose some characteristics for these new variables

## Table Variables Characteristics or available Types of Data:

 PK (Belongs to primary key): A primary key in a MySQL table is a field or set of fields that uniquely identifies each row in the table. It is used to ensure the integrity of the data and to establish relationships between tables in the database. The primary key must contain a unique value for each row and cannot contain NULL values. It is specified using the PRIMARY KEY constraint when creating the table.
 NN (Not Null): The NOT NULL constraint in MySQL is used to specify that a particular column in a table cannot contain a NULL value. This means that every row in the table must have a non-NULL value for that column. The NOT NULL constraint is often used in conjunction with the PRIMARY KEY constraint to ensure that the primary key column always has a unique, non-NULL value. It helps to ensure the integrity of the data in the table and can be specified when creating the table using the NOT NULL keyword.
 UQ (Unique index): The UNIQUE constraint in MySQL is used to ensure that the values in a particular column (or set of columns) are unique across all rows in the table. This means that no two rows can have the same value for the specified column (or set of columns). The UNIQUE constraint is similar to the PRIMARY KEY constraint, but it allows for NULL values and does not automatically create an index for the column (or set of columns). It is often used to enforce business rules or to prevent data inconsistencies, and it can be specified when creating a table using the UNIQUE keyword.
 B (Is binary column): In MySQL, the BINARY data type is used to store fixed-length binary strings. It is similar to the CHAR data type, but it stores binary data rather than character data. The BINARY data type is often used to store data that is not human-readable, such as cryptographic hashes or images. It is defined with a specific length, such as BINARY(60), which specifies that it can store a binary string up to 60 bytes in size. The BINARY data type is often used in conjunction with other data types, such as VARBINARY, which is a variable-length binary string data type.
 UN (Unsigned data type): In MySQL, the UNSIGNED attribute is used to specify that an integer data type should only contain positive values. It is often used with the INT or BIGINT data types to ensure that the column only contains positive integers. The UNSIGNED attribute is specified when creating the table, and it ensures that the column does not contain negative values. It can only be used with integer data types and cannot be used with floating-point or decimal data types.
 AI (Auto Incremental): In MySQL, the AUTO_INCREMENT attribute is used to specify that an integer column should automatically increment its value whenever a new row is inserted into the table. It is often used to create a unique identifier for each row, such as a customer ID or order number. The AUTO_INCREMENT attribute can only be used with integer data types and the column must also be marked as the primary key of the table. It is specified when creating the table using the AUTO_INCREMENT keyword. When a new row is inserted, the AUTO_INCREMENT column is automatically assigned a unique value that is one higher than the previous highest value.
 G (Generated Column): In MySQL, a generated column is a virtual column that is not physically stored on disk and does not consume any storage space. It is derived from the values of other columns in the table and is automatically updated whenever the values of the underlying columns change. Generated columns can be either STORED or VIRTUAL. A STORED generated column is computed when the row is inserted or updated, and its value is stored on disk in the table. A VIRTUAL generated column is not stored on disk and is computed on-the-fly whenever it is queried. Generated columns can be useful for storing computed values that are frequently used in queries, as they can improve query performance by avoiding the need to recalculate the values each time they are needed. They are specified when creating the table using the AS keyword.

 This information was provided by an AI language model trained by OpenAI.

## DML Sentences

## Some of the DML Sentences that are available are:

Important: DML is Data Manipulation Language

- SELECT: We can select a specific table or variable of a table to filter data.
  SELECT * FROM SchemaName.TableName; or SELECT * FROM SchemaName.TableName WHERE usernameid = 1;
- INSERT: We can insert some values to our Table variables
  INSERT INTO TableName(DataNames) VALUES(value to each variable separated by commas);
  Example: INSERT INTO test.person(lastname, name, email, phonenumber) VALUES ('Doe', 'John', 'johndoe33@gmail.com', +50689960119);
  In this example we are going to insert some values to our variables lastname, name, email and phone-number
- UPDATE: We can update or change a value of a Table Variable
  UPDATE 'SchemaName'.'TableName' SET 'DataNameThatYouWantToChange' = 'Value' WHERE ('usernameid' = '1');
  Example: UPDATE 'test'.'person' SET 'email' = 'johndoe33@doe.com' WHERE ('usernameid' = '1');
  In this example we are going to update the email value that we had before and were going to change that value for another one.
- DELETE: We can delete a specific variable of our table or all our table data.
  DELETE FROM 'TableName' WHERE usernameid = 1;