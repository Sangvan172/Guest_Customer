/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dang
 */
public class DatabaseUtil {
    private static final String URL = "jdbc:sqlserver://LAPTOP-I6RU0JII:1433;databaseName=Pro_SWP";
    private static final String USER = "sa"; // Replace with your DB username
    private static final String PASSWORD = "12345"; // Replace with your DB password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
