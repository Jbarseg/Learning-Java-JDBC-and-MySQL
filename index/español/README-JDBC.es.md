  ## Select your language of preference / Selecciona el lenguaje de tu preferencia

- ## [English](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/blob/master/README.en.md)

- ## [Español](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/blob/master/README.es.md)

  JDBC = Java Database Connectivity

  ## Creating a Java JDBC Project

  1. Create a Maven or Gradle project
  2. Add the dependency of MySQL, to find the steps to add the dependency to Maven or Gradle you can ask [ChatGPT](https://chat.openai.com/chat)
  3. Add the connection string to the main Java Class (each database has one different connection string) you can ask to [ChatGPT](https://chat.openai.com/chat), search in [Google](google.com) or find the specific connection string for MySQL in the classes of this repository
  4. After connecting our Database with Java we are available to do whatever we want to do with our database.

  To find how to do some DML Sentences or other actions with our database you can enter to [IntroductionJDBC](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/blob/master/jdbcintroduction/src/main/java/com/jbarseg/jdbc/JDBCIntroduction.java)

  The class who is going to be in charge of the DML Sentences is called DAO (Data Access Object) which is a Design Pattern