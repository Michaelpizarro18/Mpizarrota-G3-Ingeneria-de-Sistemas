/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebadelDashboard;

import pe.edu.ucv.prueba01.model.PruebadelCodigoframe;

/**
 *
 * @author User
 */
public class Dashboard extends javax.swing.JFrame {
  
    Catalogo catalogo = new Catalogo();
    RegistrarVenta venta = new RegistrarVenta();
    PruebadelCodigoframe service = new PruebadelCodigoframe();
    public Dashboard() {
        initComponents();    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnRegistroventa = new javax.swing.JButton();
        jbtninicio = new javax.swing.JButton();
        jbtncatalogo1 = new javax.swing.JButton();
        content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnRegistroventa.setText("Registro de Venta");
        jbtnRegistroventa.setContentAreaFilled(false);
        jbtnRegistroventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistroventaActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegistroventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 160, 70));

        jbtninicio.setText("Catalogo");
        jbtninicio.setContentAreaFilled(false);
        jbtninicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtninicioActionPerformed(evt);
            }
        });
        jPanel1.add(jbtninicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 60));

        jbtncatalogo1.setText("Catalogo");
        jbtncatalogo1.setContentAreaFilled(false);
        jbtncatalogo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncatalogo1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtncatalogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 150, 60));

        jLabel1.setText("Bienvenido ctmr");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel1)
                .addContainerGap(452, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtninicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtninicioActionPerformed
   service.PanelesControllerVerdadero(content,catalogo);
    }//GEN-LAST:event_jbtninicioActionPerformed

    private void jbtnRegistroventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistroventaActionPerformed
service.PanelesControllerVerdadero(content,venta);
    }//GEN-LAST:event_jbtnRegistroventaActionPerformed

    private void jbtncatalogo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncatalogo1ActionPerformed
    
    }//GEN-LAST:event_jbtncatalogo1ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnRegistroventa;
    private javax.swing.JButton jbtncatalogo1;
    private javax.swing.JButton jbtninicio;
    // End of variables declaration//GEN-END:variables
}
