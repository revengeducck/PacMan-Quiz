package com.amg.pacquiz.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
    private String url = "jdbc:mysql://localhost:3306/nombreDeTuBaseDeDatos";
    private String user = "root";
    private String pwd = "root";

    public Connection connect() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, pwd);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
