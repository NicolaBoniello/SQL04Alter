package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Students {
    static final String DB_URL = "jdbc:mysql://localhost:3306/newdb";
    static final String USER = "developer";
    static final String PASSWORD = "Milanista1997";

    public void alterTable() throws SQLException {
        Connection conn = null;

        conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        Statement statement = conn.createStatement();

        String alterQuery = "ALTER TABLE students ADD country VARCHAR(30)";

        statement.executeUpdate(alterQuery);

        statement.executeUpdate("UPDATE  students SET country = 'Italy' where last_name = 'boniello'");
        statement.executeUpdate("UPDATE  students SET country = 'Italy' where last_name = 'De luca'");
        statement.executeUpdate("UPDATE  students SET country = 'Germany' where last_name = 'Maggi'");
        statement.executeUpdate("UPDATE  students SET country = 'Germany' where last_name = 'De paola'");

        System.out.println("La tabella è stata modificata!");

    }
}
