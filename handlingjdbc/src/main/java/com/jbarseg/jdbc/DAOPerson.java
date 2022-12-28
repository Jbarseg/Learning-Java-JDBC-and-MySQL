package com.jbarseg.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOPerson {
    private final static String SQL_SELECT = "SELECT usernameid, name, lastname, email, phonenumber FROM person";
    public List <Person> select() throws SQLException{
        Connection conn = null;
        PreparedStatement prepState = null;
        Statement stat = null;
        ResultSet rs = null;
        Person person = null;
        List<Person> persons = new ArrayList<>();

        conn = ConnectionJDBC.getConnection();
        prepState = conn.prepareStatement(SQL_SELECT);
        rs = prepState.executeQuery();
        while(rs.next()){
            int usernameid = rs.getInt("usernameid");
            String name = rs.getString("name");
            String lastname = rs.getString("lastname");
            String email = rs.getString("email");
            String phonenumber = rs.getString("phonenumber");
            person = new Person(usernameid, name, lastname, email, phonenumber);
            persons.add(person);
        }
        
        ConnectionJDBC.close(rs);
        ConnectionJDBC.close(prepState);
        ConnectionJDBC.close(conn);

        return persons;

    } 
    
}
