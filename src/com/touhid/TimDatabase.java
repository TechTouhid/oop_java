package com.touhid;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TimDatabase {
    public static void main(String[] args) {
// Automatic close the connections and statements
//        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
//             Statement statement = conn.createStatement()) {
//            statement.execute("CREATE TABLE contacts (name varchar(20), phone INTEGER(20), email varchar(20) )");

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts" +
                                  " (name varchar(20), phone INTEGER(20), email varchar(20) )");

            // Closing the connections and the statements
            // Important note is that statements need to close first
            statement.close();
            conn.close();

            // This will show if have any error in the connection
        } catch (SQLException e) {
            System.out.println("Something went wrong" + e.getMessage());
        }
    }
}
