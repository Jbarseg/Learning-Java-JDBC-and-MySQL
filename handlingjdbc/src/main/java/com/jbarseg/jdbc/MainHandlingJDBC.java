package com.jbarseg.jdbc;

import java.sql.SQLException;
import java.util.List;

public class MainHandlingJDBC {
    public static void main (String[]args) throws SQLException {
        DAOPerson daoPerson = new DAOPerson();
        List<Person> persons = daoPerson.select();
        for (Person person: persons){
            System.out.println("Person: " + person);
        }
    }
    
}
