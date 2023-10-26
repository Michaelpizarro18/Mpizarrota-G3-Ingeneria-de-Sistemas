/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.prueba01.model;

import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class CajasdeTextoModel {
    
    
    
     public void DesactivarCajas(JTextField... cajas) {
        for (JTextField caja : cajas) {
            caja.setEnabled(false);
        }
}
}