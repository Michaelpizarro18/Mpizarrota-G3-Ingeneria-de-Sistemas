/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.prueba01.model;

import pe.edu.ucv.prueba01.Catalogoparte1;
import pe.edu.ucv.prueba01.Catologoparte2;


public class Servicedelview {

    public Servicedelview() {
    }
    
   public void Catalogoparte1(int x) {
     Catalogoparte1  p = new Catalogoparte1 (null, true);
     p.setTabIndex(x); // Cambia al índice 2
     p.setVisible(true);
 }
    public void Catalogoparte2(int x) {
     Catologoparte2  z = new Catologoparte2 (null, true);
     z.setTabIndex(x); // Cambia al índice 2
     z.setVisible(true);
    }
}
