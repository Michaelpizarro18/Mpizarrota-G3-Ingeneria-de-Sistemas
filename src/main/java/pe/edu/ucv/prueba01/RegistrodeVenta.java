
package pe.edu.ucv.prueba01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import pe.edu.ucv.BD.Conexion;
import pe.edu.ucv.prueba01.model.CajasdeTextoModel;
import pe.edu.ucv.prueba01.model.ConexionBd;
import pe.edu.ucv.prueba01.model.ModelTabla;

/**
 *
 * @author User
 */
public class RegistrodeVenta extends javax.swing.JPanel {

    ModelTabla model = new ModelTabla();
    private DefaultTableModel modelito;
      CajasdeTextoModel cajasdetexto = new CajasdeTextoModel();
    public RegistrodeVenta() {
        initComponents();
        modelito = new DefaultTableModel();
       model.inicializarModelo(modelito);        
        cajasdetexto.DesactivarCajas(txtIDCompra, txtFactura, 
                txtIDProveedor, txtIDProducto, txtPrecio,
                txtSubtotal, txtTotal, txtTotalFinal, txtImpuesto);

        tblDatos.setModel(modelito);
        PonerDatosCBX();
        PonerProveedores();
         txtCantidad.getDocument().addDocumentListener(new MyDocumentListener());
        txtPrecio.getDocument().addDocumentListener(new MyDocumentListener());
        txtDescuento.getDocument().addDocumentListener(new MyDocumentListener());
    }

   public void PonerDatosCBX() {
    String consultaSql = "SELECT nombre FROM Producto";
    Connection con = null; // Declarar la conexión

    try {
        // Obtener la conexión a la base de datos (Asumiendo que 'AccesoBD' es la clase que gestiona la conexión)
        con = ConexionBd.getConexion();

        if (con != null) {
            try (PreparedStatement statement = con.prepareStatement(consultaSql);
                 ResultSet resultSet = statement.executeQuery()) {
                // Limpia el ComboBox antes de agregar nuevos elementos
                cbxproducto.removeAllItems();

                // Agrega los nombres de los productos al ComboBox
                while (resultSet.next()) {
                    String nombreProducto = resultSet.getString("nombre");
                    cbxproducto.addItem(nombreProducto);
                }
            }
        } else {
            System.err.println("No se pudo obtener la conexión a la base de datos.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Cierra la conexión si se abrió correctamente
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
     public void PonerProveedores() {
    String consultaSql = "SELECT pronombre FROM Proveedor";
    Connection con = null; // Declarar la conexión

    try {
        // Obtener la conexión a la base de datos
        con = Conexion.getConexion();

        try (PreparedStatement statement = con.prepareStatement(consultaSql);
             ResultSet resultSet = statement.executeQuery()) {
            // Limpia el ComboBox antes de agregar nuevos elementos
            cbxproveedores.removeAllItems();

            // Agrega los nombres de los proveedores al ComboBox
            while (resultSet.next()) {
                String nombreProveedor = resultSet.getString("pronombre");
                cbxproveedores.addItem(nombreProveedor);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Cierra la conexión si se abrió correctamente
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
       public class MyDocumentListener implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            calcularResultado();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            calcularResultado();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            calcularResultado();
        }

        private void calcularResultado() {
            try {
                int num1 = (txtCantidad.getText().isEmpty()) ? 1 : Integer.parseInt(txtCantidad.getText());
                double num2 = (txtPrecio.getText().isEmpty()) ? 1 : Double.parseDouble(txtPrecio.getText());
                double num3 = (txtDescuento.getText().isEmpty() || txtDescuento.getText().equals("0")) ? 1 : Double.parseDouble(txtDescuento.getText());

                double resultado = num1 * num2 * num3;
                txtSubtotal.setText(String.valueOf(resultado));
                txtTotal.setText(String.valueOf(resultado));
            } catch (NumberFormatException ex) {
                txtSubtotal.setText("Error");
                txtTotal.setText("Error");
            }
        }

    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelFondo = new javax.swing.JPanel();
        PanelUp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jbtnGuardar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txtIDCompra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtIDProveedor = new javax.swing.JTextField();
        txtIDProducto = new javax.swing.JTextField();
        cbxproducto = new javax.swing.JComboBox<>();
        txtFecha = new javax.swing.JTextField();
        cbxproveedores = new javax.swing.JComboBox<>();
        txtFactura = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        txtImpuesto = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnAgregarATabla = new javax.swing.JButton();
        PanelDown = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtTotalFinal = new javax.swing.JTextField();
        btnQuitarDeTabla = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelFondo.setBackground(new java.awt.Color(204, 204, 204));
        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelUp.setBackground(new java.awt.Color(153, 0, 255));
        PanelUp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE COMPRAS");
        PanelUp.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        PanelFondo.add(PanelUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 80));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("5");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 70, 40));

        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 40));

        jButton3.setText("2");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 70, 40));

        jButton4.setText("4");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 70, 40));

        jButton6.setText("3");
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 70, 40));

        txtIDCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtIDCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 30, 90, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("ID COMPRA:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, -1));

        PanelFondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1160, 80));

        jPanel3.setBackground(new java.awt.Color(153, 102, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Proveedor:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Total:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Factura:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("IDProveedor:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Cod. Producto:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Producto:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Cantidad:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Precio:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Descuento:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Subtotal:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Impuesto:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, -1, -1));

        txtIDProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtIDProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 110, 40));

        txtIDProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtIDProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, 40));

        cbxproducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----Seleccione----" }));
        jPanel3.add(cbxproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 160, 40));

        txtFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, 40));

        cbxproveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----Seleccione----" }));
        jPanel3.add(cbxproveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 290, 40));

        txtFactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 70, 40));

        txtCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 90, 40));

        txtPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 100, 40));

        txtDescuento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 100, 40));

        txtSubtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 110, 40));

        txtImpuesto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtImpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, 110, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Fecha:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, 130, 40));

        btnAgregarATabla.setText("+");
        btnAgregarATabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarATablaActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarATabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 140, 50, 40));

        PanelFondo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1160, 200));

        PanelDown.setBackground(new java.awt.Color(255, 204, 255));
        PanelDown.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT", "CANTIDAD", "PRECIO", "DESCUENTO", "SUBTOTAL", "IMPUESTO", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        PanelDown.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 1010, 250));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("TOTAL");
        PanelDown.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 300, -1, -1));

        txtTotalFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelDown.add(txtTotalFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 290, 150, 40));

        btnQuitarDeTabla.setText("-");
        btnQuitarDeTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarDeTablaActionPerformed(evt);
            }
        });
        PanelDown.add(btnQuitarDeTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 50, 50, 40));

        PanelFondo.add(PanelDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 1160, 350));

        jPanel1.add(PanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        for (int i = 0; i < modelito.getRowCount(); i++) {
            String Datos[] = new String[7];
            Datos[0] = tblDatos.getValueAt(i, 0).toString();
            Datos[1] = tblDatos.getValueAt(i, 1).toString();
            Datos[2] = tblDatos.getValueAt(i, 2).toString();
            Datos[3] = tblDatos.getValueAt(i, 3).toString();
            Datos[4] = tblDatos.getValueAt(i, 4).toString();
            Datos[5] = tblDatos.getValueAt(i, 5).toString();
            Datos[6] = tblDatos.getValueAt(i, 6).toString();
            
            try{
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("Insert into PROBANDO values(?,?,?,?,?,?,?)");
                ps.setString(1, Datos[0]);
                ps.setString(2, Datos[1]);
                ps.setString(3, Datos[2]);
                ps.setString(4, Datos[3]);
                ps.setString(5, Datos[4]);
                ps.setString(6, Datos[5]);
                ps.setString(7, Datos[6]);
                ps.executeUpdate();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void btnAgregarATablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarATablaActionPerformed
      String producto = (String) cbxproducto.getSelectedItem();
        String cantidad = txtCantidad.getText();
        String precio = txtPrecio.getText();
        String descuento = txtDescuento.getText();
        String subtotal = txtSubtotal.getText();
        String impuesto = txtImpuesto.getText();
        String total = txtTotal.getText();

        Object[] fila = {producto, cantidad, precio, descuento, subtotal, impuesto, total};
        modelito.addRow(fila);
    }//GEN-LAST:event_btnAgregarATablaActionPerformed

    private void btnQuitarDeTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarDeTablaActionPerformed
     int com;

        com = tblDatos.getSelectedRow();
        if (com == -1) {
            JOptionPane.showMessageDialog(null, "Seleccionar el producto a eliminar");
        } else {
            modelito.removeRow(com);
        }

    }//GEN-LAST:event_btnQuitarDeTablaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDown;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel PanelUp;
    private javax.swing.JButton btnAgregarATabla;
    private javax.swing.JButton btnQuitarDeTabla;
    private javax.swing.JComboBox<String> cbxproducto;
    private javax.swing.JComboBox<String> cbxproveedores;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtFactura;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIDCompra;
    private javax.swing.JTextField txtIDProducto;
    private javax.swing.JTextField txtIDProveedor;
    private javax.swing.JTextField txtImpuesto;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalFinal;
    // End of variables declaration//GEN-END:variables
}
