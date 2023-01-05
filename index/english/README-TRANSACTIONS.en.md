## Select your language of preference / Selecciona el lenguaje de tu preferencia

- ## [English](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/blob/master/index/english/README-TRANSACTIONS.en.md)

- ## [Español](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/blob/master/index/espa%C3%B1ol/README-TRANSACTIONS.es.md)

- ## [Comeback/Regresar](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL)

# Transactions

  To use transactions like commit or rollback we cannot have different connections as we have in [HandlingJDBC-DAOPerson](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/blob/master/handlingjdbc/src/main/java/com/jbarseg/jdbc/DAOPerson.java). As you can see if you enter to the link we have different connections to our database in each method for a DML Sentence. This is what we have to change when we are working with [TransactionsJDBC](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/tree/master/transactionsjdbc).

  ## Some types of transactions are:

- **_START TRANSACTION:_** This sentence starts a transaction in MySQL. A transaction is a set of operations that are executed as if they were one, so that if any of them fails, all the operations carried out are undone.
- **_COMMIT:_** This sentence is used to commit a transaction in MySQL and make all operations performed in the transaction permanent.
- **_ROLLBACK:_** This sentence is used to roll back a transaction in MySQL and revert all operations performed in the transaction.

_To see how these transactions are put into practice: **[JDBC Transactions](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/tree/master/transactionsjdbc).**_