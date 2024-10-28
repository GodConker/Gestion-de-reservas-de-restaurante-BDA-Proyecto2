/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIs;
 
/**
 *
 * @author Dell
 */
public class frmReportes extends javax.swing.JFrame {

    /**
     * Creates new form frmReportes
     */
    public frmReportes() {
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
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CBXFiltroArea = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        CBXTipoMesa = new javax.swing.JComboBox<>();
        BtnExportarPDF = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCostoMultaCancelar = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        TxtfPagina = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TxtfFechaGen = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableReporte = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        DPFechaDesde = new com.github.lgooddatepicker.components.DatePicker();
        DPFechaHasta = new com.github.lgooddatepicker.components.DatePicker();
        TxtfNombreRestaurante = new javax.swing.JTextField();
        BtnGenerarReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));

        jLabel2.setText("Módulo de Reportes");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(BtnRegresar)
                .addGap(140, 140, 140)
                .addComponent(jLabel2)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 650, 70));

        jLabel16.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Página:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 70, -1));

        jLabel10.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("De:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 30, 20));

        jLabel11.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Hasta:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 50, 20));

        jLabel13.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Filtro por Área:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 130, 20));

        CBXFiltroArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "General", "Ventana", "Terraza" }));
        jPanel1.add(CBXFiltroArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 130, -1));

        jLabel15.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tipo de Mesa:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, 20));

        CBXTipoMesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Pequeña", "Mediana", "Grande" }));
        jPanel1.add(CBXTipoMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 120, -1));

        BtnExportarPDF.setText("Exportar a PDF");
        jPanel1.add(BtnExportarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 140, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 650, 10));

        TableCostoMultaCancelar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Fecha Cancelación", "Cliente", "Monto de Multa"
            }
        ));
        jScrollPane1.setViewportView(TableCostoMultaCancelar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 630, 90));

        jLabel17.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Rango de Fechas:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 210, -1));

        TxtfPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtfPaginaActionPerformed(evt);
            }
        });
        jPanel1.add(TxtfPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 50, -1));

        jLabel18.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Nombre del Restaurante:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 200, -1));

        jLabel19.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Costos y Multas por Cancelación:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 290, -1));

        TxtfFechaGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtfFechaGenActionPerformed(evt);
            }
        });
        jPanel1.add(TxtfFechaGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 170, -1));

        TableReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha Reserva", "Hora", "Cliente", "Personas", "Tipo", "Ubicación", "Costo Reserva"
            }
        ));
        jScrollPane2.setViewportView(TableReporte);
        if (TableReporte.getColumnModel().getColumnCount() > 0) {
            TableReporte.getColumnModel().getColumn(3).setHeaderValue("Personas");
            TableReporte.getColumnModel().getColumn(4).setHeaderValue("Tipo");
            TableReporte.getColumnModel().getColumn(5).setHeaderValue("Ubicación");
            TableReporte.getColumnModel().getColumn(6).setHeaderValue("Costo Reserva");
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 630, 90));

        jLabel20.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Fecha de Generación:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 180, -1));
        jPanel1.add(DPFechaDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 190, -1));
        jPanel1.add(DPFechaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));
        jPanel1.add(TxtfNombreRestaurante, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 160, -1));

        BtnGenerarReporte.setText("Generar Reporte");
        jPanel1.add(BtnGenerarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        frmMenu menuFrame = new frmMenu();
        menuFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void TxtfPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtfPaginaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtfPaginaActionPerformed

    private void TxtfFechaGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtfFechaGenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtfFechaGenActionPerformed

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
            java.util.logging.Logger.getLogger(frmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExportarPDF;
    private javax.swing.JButton BtnGenerarReporte;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JComboBox<String> CBXFiltroArea;
    private javax.swing.JComboBox<String> CBXTipoMesa;
    private com.github.lgooddatepicker.components.DatePicker DPFechaDesde;
    private com.github.lgooddatepicker.components.DatePicker DPFechaHasta;
    private javax.swing.JTable TableCostoMultaCancelar;
    private javax.swing.JTable TableReporte;
    private javax.swing.JTextField TxtfFechaGen;
    private javax.swing.JTextField TxtfNombreRestaurante;
    private javax.swing.JTextField TxtfPagina;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}