package com.jbarseg.jdbc;

import java.util.*;
import java.sql.SQLException;

public class MainHandlingJDBC {
    public static void main (String[]args) throws SQLException {
        
        DAOPerson daoPerson = new DAOPerson();

        Person person2 = new Person(2, "Johnny", "Doe", "johnnydoe@gmail.com", "87634568");
        daoPerson.update(person2);

        List<Person> persons = daoPerson.select();
        for (Person person: persons){
            System.out.println("Person: " + person);
        }


    }
    
}
