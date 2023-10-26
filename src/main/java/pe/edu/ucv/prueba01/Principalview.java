/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.prueba01;

import pe.edu.ucv.prueba01.model.PruebadelCodigoframe;

/**
 *
 * @author User
 */
public class Principalview extends javax.swing.JFrame {
Principalview claseprincipal;
    RegistrodeVenta venta = new RegistrodeVenta();
    
    PruebadelCodigoframe Controller = new PruebadelCodigoframe();
    CatalogoPrincipal  catalogo = new  CatalogoPrincipal ();
    public Principalview() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelBanner = new javax.swing.JPanel();
        lblPastelito1 = new javax.swing.JLabel();
        lblPastelito2 = new javax.swing.JLabel();
        lblPastelito3 = new javax.swing.JLabel();
        lblPastelito4 = new javax.swing.JLabel();
        lblPastelito5 = new javax.swing.JLabel();
        lblPastelito6 = new javax.swing.JLabel();
        lblPastelito7 = new javax.swing.JLabel();
        lblPastelito8 = new javax.swing.JLabel();
        lblPastelito9 = new javax.swing.JLabel();
        lblPastelito10 = new javax.swing.JLabel();
        lblPastelito13 = new javax.swing.JLabel();
        lblPastelito14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jbtnVenta = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jbtnCatalogo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Contenedor = new javax.swing.JPanel();
        lblTituloEntrada = new javax.swing.JLabel();
        PanelDelMensaje = new javax.swing.JPanel();
        lblLinea5 = new javax.swing.JLabel();
        lblLinea1 = new javax.swing.JLabel();
        lblLinea2 = new javax.swing.JLabel();
        lblLinea3 = new javax.swing.JLabel();
        lblLinea4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelBanner.setBackground(new java.awt.Color(255, 165, 227));
        PanelBanner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPastelito1.setText("Imagen");
        PanelBanner.add(lblPastelito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 70, 70));

        lblPastelito2.setText("Imagen");
        PanelBanner.add(lblPastelito2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 70, 70));

        lblPastelito3.setText("Imagen");
        PanelBanner.add(lblPastelito3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 70, 70));

        lblPastelito4.setText("Imagen");
        PanelBanner.add(lblPastelito4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 70, 70));

        lblPastelito5.setText("Imagen");
        PanelBanner.add(lblPastelito5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 70, 70));

        lblPastelito6.setText("Imagen");
        PanelBanner.add(lblPastelito6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 70, 70));

        lblPastelito7.setText("Imagen");
        PanelBanner.add(lblPastelito7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 70, 70));

        lblPastelito8.setText("Imagen");
        PanelBanner.add(lblPastelito8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 70, 70));

        lblPastelito9.setText("Imagen");
        PanelBanner.add(lblPastelito9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 70, 70));

        lblPastelito10.setText("Imagen");
        PanelBanner.add(lblPastelito10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 70, 70));

        lblPastelito13.setText("Imagen");
        PanelBanner.add(lblPastelito13, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 70, 70));

        lblPastelito14.setText("Imagen");
        PanelBanner.add(lblPastelito14, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 70, 70));

        jPanel1.add(PanelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1150, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.setFocusCycleRoot(true);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/DulcesPaula.jpg"))); // NOI18N
        lblLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 110, 140));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton2.setText("                  Cerrar Sesion");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 200, 90));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton3.setText("                       Principal");
        jButton3.setContentAreaFilled(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 200, 60));

        jbtnVenta.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jbtnVenta.setText("                         Venta");
        jbtnVenta.setContentAreaFilled(false);
        jbtnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVentaActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 60));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton5.setText("                    Proveedor");
        jButton5.setContentAreaFilled(false);
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 200, 60));

        jbtnCatalogo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jbtnCatalogo.setText("                  Producto");
        jbtnCatalogo.setContentAreaFilled(false);
        jbtnCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCatalogoActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 200, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 690));

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloEntrada.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        lblTituloEntrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloEntrada.setText("¡Bienvenido al sistema, Jefe!");
        Contenedor.add(lblTituloEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 430, 60));

        PanelDelMensaje.setBackground(new java.awt.Color(255, 255, 255));
        PanelDelMensaje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        PanelDelMensaje.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLinea5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblLinea5.setText("negocio de repostería de manera eficienta y deliciosa!");
        PanelDelMensaje.add(lblLinea5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 550, 20));

        lblLinea1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblLinea1.setText("Estamos encantados de que estes aquí. Desde esta plataforma, puedes");
        PanelDelMensaje.add(lblLinea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 550, 20));

        lblLinea2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblLinea2.setText("supervisar y gestionar todos los aspectos de nuestra repostería. Si tienes");
        PanelDelMensaje.add(lblLinea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 560, 20));

        lblLinea3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblLinea3.setText("alguna solicitud especial o necesitas asistencia, estamos a tu");
        PanelDelMensaje.add(lblLinea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 550, 20));

        lblLinea4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblLinea4.setText("disposición. ¡Gracias por confiar en nosotros para llevar a cabo tu");
        PanelDelMensaje.add(lblLinea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 540, -1));

        Contenedor.add(PanelDelMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 600, 130));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 1150, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jbtnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVentaActionPerformed
 Controller.PanelesControllerVerdadero(Contenedor, venta);
    }//GEN-LAST:event_jbtnVentaActionPerformed

    private void jbtnCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCatalogoActionPerformed
     Controller.PanelesControllerVerdadero(Contenedor, catalogo);
    }//GEN-LAST:event_jbtnCatalogoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principalview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principalview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principalview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principalview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principalview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JPanel PanelBanner;
    private javax.swing.JPanel PanelDelMensaje;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbtnCatalogo;
    private javax.swing.JButton jbtnVenta;
    private javax.swing.JLabel lblLinea1;
    private javax.swing.JLabel lblLinea2;
    private javax.swing.JLabel lblLinea3;
    private javax.swing.JLabel lblLinea4;
    private javax.swing.JLabel lblLinea5;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPastelito1;
    private javax.swing.JLabel lblPastelito10;
    private javax.swing.JLabel lblPastelito13;
    private javax.swing.JLabel lblPastelito14;
    private javax.swing.JLabel lblPastelito2;
    private javax.swing.JLabel lblPastelito3;
    private javax.swing.JLabel lblPastelito4;
    private javax.swing.JLabel lblPastelito5;
    private javax.swing.JLabel lblPastelito6;
    private javax.swing.JLabel lblPastelito7;
    private javax.swing.JLabel lblPastelito8;
    private javax.swing.JLabel lblPastelito9;
    private javax.swing.JLabel lblTituloEntrada;
    // End of variables declaration//GEN-END:variables
}
