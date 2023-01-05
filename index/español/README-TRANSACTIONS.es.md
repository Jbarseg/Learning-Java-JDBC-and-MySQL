## Select your language of preference / Selecciona el lenguaje de tu preferencia

- ## [English](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/blob/master/index/english/README-TRANSACTIONS.en.md)

- ## [Español](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/blob/master/index/espa%C3%B1ol/README-TRANSACTIONS.es.md)

# Transacciones

  Para usar transacciones como confirmación o reversión, no podemos tener conexiones diferentes a las que tenemos en [ManejandoJDBC-DAOPerson](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/blob/master/handlingjdbc/src/main/java/com/jbarseg/jdbc/DAOPerson.java). Como puede ver si ingresa al enlace, tenemos diferentes conexiones a nuestra base de datos en cada método para cada Sentencia DML. Esto es lo que tenemos que cambiar cuando estamos trabajando con [Transacciones de JDBC](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/tree/master/transactionsjdbc).

  ## Algunos tipos de transacciones son:

- **_START TRANSACTION:_** Esta sentencia inicia una transacción en MySQL. Una transacción es un conjunto de operaciones que se ejecutan como si fueran una sola, de manera que si alguna de ellas falla, se deshacen todas las operaciones realizadas.
- **_COMMIT:_** Esta sentencia se utiliza para confirmar una transacción en MySQL y hacer permanentes todas las operaciones realizadas en la transacción.
- **_ROLLBACK:_** Esta sentencia se utiliza para deshacer una transacción en MySQL y revertir todas las operaciones realizadas en la transacción.

_Para ver como se pone estas transacciones en practica: **[Transacciones de JDBC](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/tree/master/transactionsjdbc).**_