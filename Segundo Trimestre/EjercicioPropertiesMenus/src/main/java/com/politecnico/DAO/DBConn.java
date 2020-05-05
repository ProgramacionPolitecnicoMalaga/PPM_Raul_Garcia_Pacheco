package com.politecnico.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConn {
    private final static String url = "jdbc:mysql://80.211.157.69:3306/EjercicioProgramacionMenus";
    private final static String usuario = "root";
    private final static String password = "541971Raul";
    private Connection conn;


    public DBConn() throws SQLException {
        conn = DriverManager.getConnection(url, usuario, password);
    }

    public Connection getConn(){
        return conn;
    }

    public ResultSet read(String consulta) throws SQLException {
        return conn.prepareStatement(consulta).executeQuery();
    }

    public int create(String consulta) throws SQLException {
        return conn.prepareStatement(consulta).executeUpdate();
    }

    public int delete(String consulta) throws SQLException {
        return conn.prepareStatement(consulta).executeUpdate();
    }

    public int update(String consulta) throws SQLException {
        return conn.prepareStatement(consulta).executeUpdate();
    }
}
