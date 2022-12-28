package com.jbarseg.jdbc;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public final class HandlingJDBC {
    public static void main(String[] args) throws SQLException {
        //Connection String
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        Connection connection = DriverManager.getConnection(url, "root", "admin");
        //Execute a MySQL DML Sentence
        Statement statement = connection.createStatement();
        String sql = "SELECT usernameid, name, lastname, email, phonenumber FROM person";
        ResultSet result = statement.executeQuery(sql);
        while (result.next()){
            System.out.println("Usernameid: " + result.getInt("usernameid") + ". " + result.getString("name"));
        }
        //We close all our objects
        result.close();
        statement.close();
        connection.close();
    }
}
