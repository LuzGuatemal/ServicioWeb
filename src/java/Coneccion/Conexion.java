/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coneccion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class Conexion {
    
    
    private String jdbcURL= "jdbc:mysql://localhost:3306/basebiblioteca?zeroDateTimeBehavior=convertToNull";// este atributo juarda la cadena de conexion a la base de datos
    private String jdbcUSERName= "root";//el nombre para la conexion a la BD "root"
    private String jdbcPassword= "admin";// Contrasenia acceso a la BD
    private Connection jdbcConnection;//informacion drive de conexion
    public Conexion(String jdbcURL, String jdbcUSERName, String jdbcPassword) {
        this.jdbcURL = jdbcURL;
        this.jdbcUSERName = jdbcUSERName;
        this.jdbcPassword = jdbcPassword;
    }

    // Connection con;
    public Conexion() {
        try {
            if (jdbcConnection == null || jdbcConnection.isClosed()) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    System.out.println("conexion exito");
                } catch (ClassNotFoundException e) {
                    System.out.println(" ERROR conexion exito");
                    throw new SQLException(e);
                }
                Class.forName("com.mysql.jdbc.Driver");
                //con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectotendencias?zeroDateTimeBehavior=convertToNull","root","12345678");
                jdbcConnection = (Connection) DriverManager.getConnection(jdbcURL, jdbcUSERName, jdbcPassword);
            }
        } catch (Exception e) {

        }
    }

    public java.sql.Connection getConnection() {
        return jdbcConnection;
    }
    public Connection getConnection1() {
        return jdbcConnection;
    }

    public void discconet() throws SQLException {
        if (jdbcConnection != null && !jdbcConnection.isClosed()) {
            jdbcConnection.close();
        }
    }
}
