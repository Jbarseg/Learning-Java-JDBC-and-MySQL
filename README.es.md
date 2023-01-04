# Aprendiendo JDBC y MySQL - Java

# Select your language of preference / Selecciona el lenguaje de tu preferencia

- ## [English](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/blob/master/README.en.md)

- ## [Español](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/blob/master/README.es.md)

# Descargando, instalando y creando nuestra primera base de datos en MySQL

1. Lo que tienes que hacer es descargar MySQL en el siguiente enlace: [Instalador MySQL](https://dev.mysql.com/downloads/windows/installer/8.0.html).

2. Al instalar MySQL, debe elegir la versión del servidor MySQL y la versión de MySQL Workbench que prefiera.

3. Configure la instalación segun lo que usted necesite e instale MySQL Workbench

**_ Cuando ya instalamos MySQL, procedemos a crear una nueva base de datos, puedes consultar todos los pasos para crear una nueva base de datos en [ChatGPT](https://chat.openai.com/chat) o seguir leyendo este archivo. _**

# Aprendiendo como usar MySQL Workbench

## Creando una nueva base de datos:

**_ Importante: un esquema de base de datos define cómo se organizan los datos dentro de una base de datos relacional _**

1. Haga click en Connect to Database

![Connect to Database](https://www.mysqltutorial.org/wp-content/uploads/2019/09/connect-to-mysql-mysql-workbench-step-1.png)

2. Luego puede elegir el nombre de host y el puerto de su servidor y también el nombre de usuario y la contraseña de la persona que administra la base de datos.

![Database Config](https://learn.microsoft.com/en-us/azure/mysql/single-server/media/connect-workbench/2-setup-new-connection.png)

3. A la izquierda puede encontrar Administración y Esquemas. Para crear un nuevo esquema, podemos usar el botón derecho del mouse para elegir Crear esquema y elegir el nombre de nuestro nuevo Esquema.

![Database Schemas](https://itknowledgeexchange.techtarget.com/coffee-talk/files/2020/06/create-mysql-schema.png)

**_ 4. Luego podemos encontrar a la izquierda todas las cosas que podemos hacer o editar con nuestra nueva base de datos. También podemos preguntarle a [ChatGPT](https://chat.openai.com/chat) si no encontramos una configuración que deseemos editar. _**

## Entendiendo MySQL Workbench Tables

**_ Si quieres organizar todos tus datos en nuestra nueva base de datos, lo que puedes hacer es crear una tabla en MySQL Workbench. _** Una tabla se usa para organizar datos en forma de filas y columnas y se usa tanto para almacenar como para mostrar registros en el formato de estructura.

_ EJEMPLO: Si creamos una tabla de nombres de personas y queremos que la tabla organice una cantidad de personas o usuarios, es posible que deseemos agregar algunas variables a nuestra nueva tabla, como identificación de usuario, nombre, apellido, correo electrónico, etc. Entonces, cuando creamos la tabla podemos crear estas variables y luego podemos elegir algunas características para estas nuevas variables. _

## Table Variables Characteristics or available Types of Data:

- **_ PK (Belongs to primary key): _** Una clave principal en una tabla MySQL es un campo o conjunto de campos que identifica de forma única cada fila de la tabla. Se utiliza para asegurar la integridad de los datos y establecer relaciones entre las tablas de la base de datos. La clave principal debe contener un valor único para cada fila y no puede contener valores NULL. Se especifica mediante la restricción PRIMARY KEY al crear la tabla.

- **_ NN (Not Null): _** La restricción NOT NULL en MySQL se usa para especificar que una columna en particular en una tabla no puede contener un valor NULL. Esto significa que cada fila de la tabla debe tener un valor no NULL para esa columna. La restricción NOT NULL se usa a menudo junto con la restricción PRIMARY KEY para garantizar que la columna de clave principal siempre tenga un valor único, no NULL. Ayuda a garantizar la integridad de los datos de la tabla y se puede especificar al crear la tabla con la palabra clave NOT NULL.

- **_ UQ (Unique index): _** La restricción ÚNICA en MySQL se usa para garantizar que los valores en una columna particular (o conjunto de columnas) sean únicos en todas las filas de la tabla. Esto significa que dos filas no pueden tener el mismo valor para la columna especificada (o conjunto de columnas). La restricción UNIQUE es similar a la restricción PRIMARY KEY, pero permite valores NULL y no crea automáticamente un índice para la columna (o conjunto de columnas). A menudo se usa para hacer cumplir las reglas comerciales o para evitar inconsistencias en los datos, y se puede especificar al crear una tabla con la palabra clave UNIQUE.

- **_ B (Is binary column): _** En MySQL, el tipo de datos BINARY se usa para almacenar cadenas binarias de longitud fija. Es similar al tipo de datos CHAR, pero almacena datos binarios en lugar de datos de caracteres. El tipo de datos BINARY se usa a menudo para almacenar datos que no son legibles por humanos, como hashes criptográficos o imágenes. Se define con una longitud específica, como BINARY(60), que especifica que puede almacenar una cadena binaria de hasta 60 bytes de tamaño. El tipo de datos BINARY se usa a menudo junto con otros tipos de datos, como VARBINARY, que es un tipo de datos de cadena binaria de longitud variable.

- **_ UN (Unsigned data type): _** En MySQL, el atributo UNSIGNED se usa para especificar que un tipo de datos entero solo debe contener valores positivos. A menudo se usa con los tipos de datos INT o BIGINT para garantizar que la columna solo contenga números enteros positivos. El atributo UNSIGNED se especifica al crear la tabla y garantiza que la columna no contenga valores negativos. Solo se puede usar con tipos de datos enteros y no se puede usar con tipos de datos decimales o de coma flotante.

- **_ AI (Auto incremental): _** En MySQL, el atributo AUTO_INCREMENT se usa para especificar que una columna de enteros debe incrementar automáticamente su valor cada vez que se inserta una nueva fila en la tabla. A menudo se usa para crear un identificador único para cada fila, como una identificación de cliente o un número de pedido. El atributo AUTO_INCREMENT solo se puede usar con tipos de datos enteros y la columna también debe marcarse como la clave principal de la tabla. Se especifica al crear la tabla usando la palabra clave AUTO_INCREMENT. Cuando se inserta una nueva fila, a la columna AUTO_INCREMENT se le asigna automáticamente un valor único que es uno más alto que el valor más alto anterior.

- **_ G (Generated Column): _** En MySQL, una columna generada es una columna virtual que no se almacena físicamente en el disco y no consume espacio de almacenamiento. Se deriva de los valores de otras columnas de la tabla y se actualiza automáticamente cada vez que cambian los valores de las columnas subyacentes. Las columnas generadas pueden ser ALMACENADAS o VIRTUAL. Una columna generada ALMACENADA se calcula cuando la fila se inserta o actualiza, y su valor se almacena en el disco en la tabla. Una columna generada VIRTUAL no se almacena en el disco y se calcula sobre la marcha cada vez que se consulta. Las columnas generadas pueden ser útiles para almacenar valores calculados que se usan con frecuencia en las consultas, ya que pueden mejorar el rendimiento de las consultas al evitar la necesidad de volver a calcular los valores cada vez que se necesitan. Se especifican al crear la tabla usando la palabra clave AS.

**_ Esta información fue proporcionada por un modelo de lenguaje de IA entrenado por OpenAI. _**

## Sentencias DML

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

  # Learning how to use JDBC

  JDBC = Java Database Connectivity

  ## Creating a Java JDBC Project

  1. Create a Maven or Gradle project
  2. Add the dependency of MySQL, to find the steps to add the dependency to Maven or Gradle you can ask [ChatGPT](https://chat.openai.com/chat)
  3. Add the connection string to the main Java Class (each database has one different connection string) you can ask to [ChatGPT](https://chat.openai.com/chat), search in [Google](google.com) or find the specific connection string for MySQL in the classes of this repository
  4. After connecting our Database with Java we are available to do whatever we want to do with our database.

  To find how to do some DML Sentences or other actions with our database you can enter to [IntroductionJDBC](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/blob/master/jdbcintroduction/src/main/java/com/jbarseg/jdbc/JDBCIntroduction.java)

  The class who is going to be in charge of the DML Sentences is called DAO (Data Access Object) which is a Design Pattern

 ## Transactions

  To use transactions like commit or rollback we cannot have different connections as we have in [HandlingJDBC-DAOPerson](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/blob/master/handlingjdbc/src/main/java/com/jbarseg/jdbc/DAOPerson.java). As you can see if you enter to the link we have different connections to our database in each method for a DML Sentence. This is what we have to change when we are working with [TransactionsJDBC](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/tree/master/transactionsjdbc).