## Select your language of preference / Selecciona el lenguaje de tu preferencia

- ## [English](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/blob/master/README.en.md)

- ## [Español](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/blob/master/README.es.md)

# Transacciones

  To use transactions like commit or rollback we cannot have different connections as we have in [HandlingJDBC-DAOPerson](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/blob/master/handlingjdbc/src/main/java/com/jbarseg/jdbc/DAOPerson.java). As you can see if you enter to the link we have different connections to our database in each method for a DML Sentence. This is what we have to change when we are working with [TransactionsJDBC](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/tree/master/transactionsjdbc).