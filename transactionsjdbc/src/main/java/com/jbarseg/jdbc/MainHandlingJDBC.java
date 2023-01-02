package com.jbarseg.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class MainHandlingJDBC {
    public static void main (String[]args) throws SQLException {

        Connection connection = null;

        try {
            connection = ConnectionJDBC.getConnection();
            //To not do an automatic commit and wait to do the commit if there is no rollback
            if (connection.getAutoCommit()){
                connection.setAutoCommit(false);
                DAOPerson daoPerson = new DAOPerson(connection);
                Person personChange = new Person();
                personChange.setUsernameid(2);
                personChange.setName("Johnny");
                personChange.setLastname("Doewin");
                personChange.setEmail("johnnydoe@gmail.com");
                personChange.setPhonenumber("87634568");
                daoPerson.update(personChange);
                Person newPerson = new Person();
                newPerson.setName("Danny");
                newPerson.setLastname("Doe");
                daoPerson.insert(newPerson);
                //To save all our changes made with the DML Statements in our database
                connection.commit();
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            //In order not to save all the changes made with the DML statements in our database
            System.out.println("Rollback");
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace();
            }

        }



    }
}
