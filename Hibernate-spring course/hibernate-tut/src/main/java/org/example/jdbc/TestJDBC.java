package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/world?allowPublicKeyRetrieval=true&useSSL=false";
         String user="root";
        String password="root";
        try{
            System.out.println("Connecting..." + jdbcUrl);
            Connection connection = DriverManager.getConnection(jdbcUrl,user,password);
            System.out.println("SUCCESS");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
