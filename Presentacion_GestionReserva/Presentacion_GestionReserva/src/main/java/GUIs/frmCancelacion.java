/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIs;
// holaaaaaaaaaaaaaaaaaaaaa
/**
 * 
 * @author Dell
 */
public class frmCancelacion extends javax.swing.JFrame {

    /**
     * Creates new form frmCancelacion
     */
    public frmCancelacion() {
        initComponents();
        setLocationRelativeTo(null); // Esto centra la ventana
        
        // ejemplo para guardar, así?

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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BtnRegresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        BtnHistorial = new javax.swing.JButton();
        BtnConfirmar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        BtnBuscarReservacion1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableReservacionCancelar = new javax.swing.JTable();
        TxtfMulta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        BtnBuscarReservacion = new javax.swing.JButton();
        TxtfBuscarReserva = new javax.swing.JTextField();
        DPBuscarFecha = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));

        jLabel2.setText("Módulo de Cancelación");
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
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addContainerGap(196, Short.MAX_VALUE))
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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 590, 70));

        jLabel8.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Buscar Por Fecha:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 20));

        BtnHistorial.setText("Historial");
        BtnHistorial.setBackground(new java.awt.Color(0, 0, 0));
        BtnHistorial.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        BtnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        BtnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHistorialActionPerformed(evt);
            }
        });
        jPanel1.add(BtnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 100, -1));

        BtnConfirmar.setText("Confirmar");
        BtnConfirmar.setBackground(new java.awt.Color(0, 0, 0));
        BtnConfirmar.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        BtnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(BtnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 100, -1));

        jLabel11.setText("Multa Calculada:");
        jLabel11.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        BtnBuscarReservacion1.setText("Buscar");
        jPanel1.add(BtnBuscarReservacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 80, -1));

        TableReservacionCancelar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Teléfono", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(TableReservacionCancelar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 490, 110));
        jPanel1.add(TxtfMulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 90, -1));

        jLabel9.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Buscar Reserva:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 20));

        BtnBuscarReservacion.setText("Buscar");
        jPanel1.add(BtnBuscarReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 80, -1));
        jPanel1.add(TxtfBuscarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 220, -1));
        jPanel1.add(DPBuscarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 220, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        frmMenu menuFrame = new frmMenu();
        menuFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHistorialActionPerformed
        // Crear una nueva instancia de frmMesasHistorial
        frmCancelacionHistorial historialFrame = new frmCancelacionHistorial();

        // Hacer visible el nuevo frame
        historialFrame.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_BtnHistorialActionPerformed

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
            java.util.logging.Logger.getLogger(frmCancelacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCancelacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCancelacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCancelacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCancelacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarReservacion;
    private javax.swing.JButton BtnBuscarReservacion1;
    private javax.swing.JButton BtnConfirmar;
    private javax.swing.JButton BtnHistorial;
    private javax.swing.JButton BtnRegresar;
    private com.github.lgooddatepicker.components.DatePicker DPBuscarFecha;
    private javax.swing.JTable TableReservacionCancelar;
    private javax.swing.JTextField TxtfBuscarReserva;
    private javax.swing.JTextField TxtfMulta;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
