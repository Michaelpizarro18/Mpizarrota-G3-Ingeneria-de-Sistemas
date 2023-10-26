/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.prueba01.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class ConexionBd {

    public ConexionBd() {
    }
    
     public static Connection getConexion() throws SQLException {
        Connection cn = null;
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String urlDB = "jdbc:sqlserver://localhost:1433;databaseName=P_Sales_System;encrypt=true;TrustServerCertificate=true;";
        String user = "sa";
        String pass = "sql";
        try {
            // Paso 1: Cargar el driver a memoria 
            Class.forName(driver).getDeclaredConstructor().newInstance();
            // Paso 2: Obtener el objeto Connection 
            cn = DriverManager.getConnection(urlDB, user, pass);
        } catch (SQLException e) {
            throw e; // propagar la excepcion
        } catch (ClassNotFoundException e) {
            throw new SQLException("No se encontro el driver de la base de datos.");
        } catch (Exception e) {
            throw new SQLException("No se puede establecer la conexion con la BD.");
        }
        return cn;
    }
   
}
