package com.jbarseg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class ConnectionJDBC {
    //We define the String Connection as a constant
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";

    //We create a method to access to our Database 
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }

    public static void close (ResultSet rs) throws SQLException{
        rs.close();
    }

    public static void close (Statement st) throws SQLException{
        st.close();
    }

    public static void close (PreparedStatement sm) throws SQLException{
        sm.close();
    }

    public static void close (Connection cn) throws SQLException{
        cn.close();
    }

    
}
