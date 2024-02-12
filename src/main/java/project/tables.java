/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class tables {
    private Connection con;

    public tables() {
        // Use the connection provider to get a connection
        con = ConnectionProvider.getCon();
    }

    public void createTable() {
        try {
            // Create a statement
            Statement statement = con.createStatement();

            // SQL query for creating the table
            String createTableQuery = "CREATE TABLE IF NOT EXISTS users ("
                    + "id INT PRIMARY KEY AUTO_INCREMENT,"
                    + "name VARCHAR(255),"
                    + "email VARCHAR(255), "
                    + "password VARCHAR(255),"
                    + "adresse VARCHAR(255) )";
            statement.executeUpdate("create table room(roomNo varchar(10),roomType varchar(200),bed varchar(200), price int,status varchar(20))");
           statement.executeUpdate(" create table customer(id int,name varchar(200),mobileNumber varchar(20),nationality varchar(200),gender varchar(50),email varchar(200),idProof varchar(200),address varchar(500),checkIn varchar(50),rommNo varchar(10),bed varchar(200),roomType varchar(200),princePerDay int(10),numberOfDaysStay int(10),totalAmount varchar(200),Checkout varchar(50))");
           
            // Log the SQL query
            System.out.println("SQL Query: " + createTableQuery);

            // Execute the SQL query
            statement.executeUpdate(createTableQuery);

            // Close the statement when done
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        tables tables = new tables();
        tables.createTable();
    }
}