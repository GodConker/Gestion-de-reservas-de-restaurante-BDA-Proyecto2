/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIs;

/** 
 *
 * @author Dell
 */
public class frmConsultas extends javax.swing.JFrame {

    /**
     * Creates new form frmConsultas
     */
    public frmConsultas() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BtnRegresar = new javax.swing.JButton();
        BtnHistorial = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableModuloConsultas = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CBXTipoMesa = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        CBXFiltroArea = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        DPFechaReservadaHasta = new com.github.lgooddatepicker.components.DatePicker();
        jLabel15 = new javax.swing.JLabel();
        DPFechaReservadaDesde = new com.github.lgooddatepicker.components.DatePicker();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        BtnLimpiar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        TxtfBuscarNombreCliente = new javax.swing.JTextField();
        TxtfNumTelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));

        jLabel2.setText("Módulo de Consultas");
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
                .addGap(129, 129, 129)
                .addComponent(jLabel2)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 640, 70));

        BtnHistorial.setBackground(new java.awt.Color(0, 0, 0));
        BtnHistorial.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        BtnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        BtnHistorial.setText("Historial");
        BtnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHistorialActionPerformed(evt);
            }
        });
        jPanel1.add(BtnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 100, -1));

        BtnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        BtnCancelar.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        BtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelar.setText("Limpiar Tabla");
        jPanel1.add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 110, -1));

        jLabel11.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Resultados de la Búsqueda:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 240, -1));

        TableModuloConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "Fecha", "Hora", "Ubicación"
            }
        ));
        jScrollPane1.setViewportView(TableModuloConsultas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 600, 180));

        jLabel10.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Hasta:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 160, 50, 20));

        jLabel12.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nombre del Cliente:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        CBXTipoMesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Pequeña", "Mediana", "Grande" }));
        jPanel1.add(CBXTipoMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 110, -1));

        jLabel13.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Filtro por Área:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, 20));

        CBXFiltroArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "General", "Ventana", "Terraza" }));
        jPanel1.add(CBXFiltroArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 110, -1));

        jLabel14.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Número de Teléfono:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 170, -1));
        jPanel1.add(DPFechaReservadaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 180, 20));

        jLabel15.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tipo de Mesa:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, 20));
        jPanel1.add(DPFechaReservadaDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 180, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 640, 20));

        jLabel16.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Fecha Reservada desde:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 210, -1));

        BtnLimpiar.setText("Limpiar");
        jPanel1.add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 120, -1));

        BtnBuscar.setText("Buscar");
        jPanel1.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 120, -1));
        jPanel1.add(TxtfBuscarNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 210, -1));
        jPanel1.add(TxtfNumTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, Short.MAX_VALUE)
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
        frmMesasHistorial historialFrame = new frmMesasHistorial();

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
            java.util.logging.Logger.getLogger(frmConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnHistorial;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JComboBox<String> CBXFiltroArea;
    private javax.swing.JComboBox<String> CBXTipoMesa;
    private com.github.lgooddatepicker.components.DatePicker DPFechaReservadaDesde;
    private com.github.lgooddatepicker.components.DatePicker DPFechaReservadaHasta;
    private javax.swing.JTable TableModuloConsultas;
    private javax.swing.JTextField TxtfBuscarNombreCliente;
    private javax.swing.JTextField TxtfNumTelefono;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
