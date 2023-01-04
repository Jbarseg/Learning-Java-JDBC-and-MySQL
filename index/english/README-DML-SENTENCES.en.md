## Select your language of preference / Selecciona el lenguaje de tu preferencia

- ## [English](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/blob/master/README.en.md)

- ## [Español](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/blob/master/README.es.md)

# DML Sentences

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