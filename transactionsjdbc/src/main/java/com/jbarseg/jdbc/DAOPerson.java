package com.jbarseg.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOPerson {
    private final static String SQL_SELECT = "SELECT usernameid, name, lastname, email, phonenumber FROM person";
    private final static String SQL_INSERT = "INSERT INTO person(name, lastname, email, phonenumber) VALUES(?, ?, ?, ?)";
    private final static String SQL_UPDATE = "UPDATE person SET name = ?, lastname = ?, email = ?, phonenumber = ? WHERE usernameid = ?";
    private final static String SQL_DELETE = "DELETE FROM person WHERE usernameid = ?";
    private Connection transaConnection;

    public DAOPerson(){

    }

    public DAOPerson (Connection transaConnection){
        this.transaConnection = transaConnection;
    }

    //Sentence DML - Select
    public List <Person> select() throws SQLException{
        Connection conn = null;
        PreparedStatement prepState = null;
        ResultSet rs = null;
        Person person = null;
        List<Person> persons = new ArrayList<>();
        //If the transactional connection object is not null then we use transactional connection, otherwise we get a new connection
        conn = this.transaConnection != null ? this.transaConnection : ConnectionJDBC.getConnection();
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
        if (this.transaConnection == null){
            ConnectionJDBC.close(conn);
        }

        return persons;
    }
    //Sentence DML - Insert
    public int insert (Person person) throws SQLException{
        Connection conn = null;
        PreparedStatement prepState = null;
        int registros = 0;
        //If the transactional connection object is not null then we use transactional connection, otherwise we get a new connection
        conn = this.transaConnection != null ? this.transaConnection : ConnectionJDBC.getConnection();
        prepState = conn.prepareStatement(SQL_INSERT);
        prepState.setString(1, person.getName());
        prepState.setString(2, person.getLastname());
        prepState.setString(3, person.getEmail());
        prepState.setString(4, person.getPhonenumber());
        registros = prepState.executeUpdate();

        ConnectionJDBC.close(prepState);
        if (this.transaConnection == null){
            ConnectionJDBC.close(conn);
        }
        return registros;
    }
    //Sentence DML - Delete
    public int delete (Person person) throws SQLException{
        Connection conn = null;
        PreparedStatement prepState = null;
        int registros = 0;

        //If the transactional connection object is not null then we use transactional connection, otherwise we get a new connection
        conn = this.transaConnection != null ? this.transaConnection : ConnectionJDBC.getConnection();
        prepState = conn.prepareStatement(SQL_DELETE);
        prepState.setInt(1, person.getUsernameid());
        registros = prepState.executeUpdate();

        ConnectionJDBC.close(prepState);
        if (this.transaConnection == null){
            ConnectionJDBC.close(conn);
        }

        return registros;
    }
    //Sentence DML - Update
    public int update (Person person) throws SQLException{
        Connection conn = null;
        PreparedStatement prepState = null;
        int registros = 0;

        //If the transactional connection object is not null then we use transactional connection, otherwise we get a new connection
        conn = this.transaConnection != null ? this.transaConnection : ConnectionJDBC.getConnection();
        prepState = conn.prepareStatement(SQL_UPDATE);
        prepState.setString(1, person.getName());
        prepState.setString(2, person.getLastname());
        prepState.setString(3, person.getEmail());
        prepState.setString(4, person.getPhonenumber());
        prepState.setInt(5, person.getUsernameid());
        registros = prepState.executeUpdate();

        ConnectionJDBC.close(prepState);
        if (this.transaConnection == null){
            ConnectionJDBC.close(conn);
        }

        return registros;
    }

}
