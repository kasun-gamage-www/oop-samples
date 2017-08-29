/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kasun Gamage
 *
 * Download and add the connector library for mysql
 * https://dev.mysql.com/downloads/connector/j/5.1.html
 */
public class DBConnection {

    private static final String DATABASE_HOST = "localhost";
    private static final String DATABASE_PORT = "3306";
    private static final String DATABASE_NAME = "sms";

    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "";

    private static Connection conn;
    private static Statement statement;

    public static void closeConnection() throws SQLException {
        if (null != statement) {
            statement.close();
        }
        if (null != conn) {
            conn.close();
        }
    }

    public static int executeUpdate(String sql) throws ClassNotFoundException, SQLException {
        if (null == conn) {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://" + DATABASE_HOST + ":" + DATABASE_PORT + "/" + DATABASE_NAME, DATABASE_USERNAME, DATABASE_PASSWORD);
        }
        if (null == statement) {
            statement = conn.createStatement();
        }
        return statement.executeUpdate(sql);
    }

    public static ResultSet executeQuery(String sql) throws ClassNotFoundException, SQLException {
        if (null == conn) {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://" + DATABASE_HOST + ":" + DATABASE_PORT + "/" + DATABASE_NAME, DATABASE_USERNAME, DATABASE_PASSWORD);
        }
        if (null == statement) {
            statement = conn.createStatement();
        }
        ResultSet rs = statement.executeQuery(sql);
        return rs;
    }
}
