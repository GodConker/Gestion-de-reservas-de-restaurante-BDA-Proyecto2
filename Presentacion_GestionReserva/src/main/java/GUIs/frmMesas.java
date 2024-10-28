/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIs;
 
/**
 *
 * @author Dell
 */
public class frmMesas extends javax.swing.JFrame {

    /**
     * Creates new form frmMesas
     */
    public frmMesas() {
        initComponents();
        setLocationRelativeTo(null); // Esto centra la ventana

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BtnRegresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CBXUbiMesas = new javax.swing.JComboBox<>();
        BtnMesasHistorial = new javax.swing.JButton();
        BtnGuardarMesas = new javax.swing.JButton();
        CBXTipoMesas = new javax.swing.JComboBox<>();
        TxtfCantidadMesas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CBXHorario1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        CBXHorario = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        TxtfCambiarNombreRest = new javax.swing.JTextField();
        BtnCambiarNombre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));

        jLabel2.setText("Módulo de Mesas");
        jLabel2.setFont(new java.awt.Font("Champagne & Limousines", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        BtnRegresar.setText("Regresar");
        BtnRegresar.setBackground(new java.awt.Color(0, 0, 0));
        BtnRegresar.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        BtnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(BtnRegresar)
                .addGap(81, 81, 81)
                .addComponent(jLabel2)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 510, 70));

        jLabel6.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("a");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo de Mesa:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, 20));

        jLabel8.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre del Restaurante:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        CBXUbiMesas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Ventana", "Terraza" }));
        CBXUbiMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXUbiMesasActionPerformed(evt);
            }
        });
        jPanel1.add(CBXUbiMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 110, -1));

        BtnMesasHistorial.setText("Ver Historial");
        BtnMesasHistorial.setBackground(new java.awt.Color(0, 0, 0));
        BtnMesasHistorial.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        BtnMesasHistorial.setForeground(new java.awt.Color(255, 255, 255));
        BtnMesasHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMesasHistorialActionPerformed(evt);
            }
        });
        jPanel1.add(BtnMesasHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 110, -1));

        BtnGuardarMesas.setText("Guardar");
        BtnGuardarMesas.setBackground(new java.awt.Color(0, 0, 0));
        BtnGuardarMesas.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        BtnGuardarMesas.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(BtnGuardarMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 110, -1));

        CBXTipoMesas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeña", "Mediana", "Grande" }));
        jPanel1.add(CBXTipoMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 110, -1));
        jPanel1.add(TxtfCantidadMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 110, -1));

        jLabel10.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cantidad de Mesas:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        CBXHorario1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(CBXHorario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 90, -1));

        jLabel11.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Horario de Atención:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        CBXHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(CBXHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 90, -1));

        jLabel9.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ubicación de Mesas:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));
        jPanel1.add(TxtfCambiarNombreRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 150, -1));

        BtnCambiarNombre.setText("Cambiar Nombre");
        jPanel1.add(BtnCambiarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBXUbiMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXUbiMesasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBXUbiMesasActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        frmMenu menuFrame = new frmMenu();
        menuFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnMesasHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMesasHistorialActionPerformed
        // Crear una nueva instancia de frmMesasHistorial
        frmMesasHistorial historialFrame = new frmMesasHistorial();

        // Hacer visible el nuevo frame
        historialFrame.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_BtnMesasHistorialActionPerformed

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
            java.util.logging.Logger.getLogger(frmMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCambiarNombre;
    private javax.swing.JButton BtnGuardarMesas;
    private javax.swing.JButton BtnMesasHistorial;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JComboBox<String> CBXHorario;
    private javax.swing.JComboBox<String> CBXHorario1;
    private javax.swing.JComboBox<String> CBXTipoMesas;
    private javax.swing.JComboBox<String> CBXUbiMesas;
    private javax.swing.JTextField TxtfCambiarNombreRest;
    private javax.swing.JTextField TxtfCantidadMesas;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}