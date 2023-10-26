/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.prueba01.model;


import java.sql.Connection;

/**
 *
 * @author User
 */
public class PruebaBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     try {
            Connection cn = ConexionBd.getConexion();
            System.out.println("Conexion ok.");
            cn.close(); // Cierra la conexion
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
