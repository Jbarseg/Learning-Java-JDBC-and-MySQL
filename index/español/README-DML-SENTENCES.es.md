## Select your language of preference / Selecciona el lenguaje de tu preferencia

- ## [English](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/blob/master/index/english/README-DML-SENTENCES.en.md)

- ## [Español](https://github.com/Jbarseg/Learning-Java-JDBC-and-MySQL/blob/master/index/espa%C3%B1ol/README-DML-SENTENCES.es.md)

# Sentencias DML

## Algunas de las Sentencias DML que están disponibles son:

**Importante: DML es un lenguaje de manipulación de datos**

- **_SELECT:_** **Podemos seleccionar una tabla específica o variable de una tabla para filtrar datos.**

  - *SELECT * FROM SchemaName.TableName; or SELECT * FROM SchemaName.TableName WHERE usernameid = ?;*

- **_INSERT:_** **Podemos insertar algunos valores en nuestras variables de tabla.**

  - *INSERT INTO TableName(DataNames) VALUES(value to each variable separated by commas);*

  *Example: INSERT INTO test.person(lastname, name, email, phonenumber) VALUES ('Doe', 'John', 'johndoe33@gmail.com', +50689960119);*

- **_UPDATE:_** **Podemos actualizar o cambiar un valor de una variable de tabla**

  - UPDATE 'SchemaName'.'TableName' SET 'DataNameThatYouWantToChange' = 'Value' WHERE ('usernameid' = '?');

  *Example: UPDATE 'test'.'person' SET 'email' = 'johndoe33@doe.com' WHERE ('usernameid' = '1');*

- **_DELETE:_** **Podemos eliminar una variable específica de nuestra tabla o todos los datos de nuestra tabla.**

  - DELETE FROM 'TableName' WHERE usernameid = ?;