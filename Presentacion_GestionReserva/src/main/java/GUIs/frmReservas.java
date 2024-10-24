package GUIs;

import com.github.lgooddatepicker.components.DateTimePicker;
import com.github.lgooddatepicker.components.TimePickerSettings;
import java.time.LocalTime;
import javax.swing.JOptionPane;

public class frmReservas extends javax.swing.JFrame {

    // Variables
    private DateTimePicker dateTimePicker;

    public frmReservas() {
        initComponents();
        setLocationRelativeTo(null); // Centrar la ventana
        configurarTimePicker(); // Configura DateTimePicker con el rango de horas
        TxtfTipoMesa.setEditable(false); // No editable
        TxtfCostoTotal.setEditable(false); // No editable
    }

    private void configurarTimePicker() {
        // Crea las configuraciones del TimePicker
        TimePickerSettings timeSettings = new TimePickerSettings();
        timeSettings.initialTime = LocalTime.of(10, 0); // Hora inicial: 10:00 AM

        // Crea el DateTimePicker con las configuraciones
        dateTimePicker = new DateTimePicker(null, timeSettings);

        // Ahora establece la política de veto después de crear el DateTimePicker
        timeSettings.setVetoPolicy((LocalTime time) -> {
            LocalTime minTime = LocalTime.of(10, 0); // Hora mínima: 10:00 AM
            LocalTime maxTime = LocalTime.of(22, 0); // Hora máxima: 10:00 PM
            return time.isBefore(minTime) || time.isAfter(maxTime); // Restringir fuera del rango
        });

        add(dateTimePicker); // Añadir el DateTimePicker al frame
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
        jLabel3 = new javax.swing.JLabel();
        TxtfNombreCompleto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtfTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        DTPFechaHora = new com.github.lgooddatepicker.components.DateTimePicker();
        jLabel6 = new javax.swing.JLabel();
        CBXNumPersonas = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        TxtfTipoMesa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CBXUbicacion = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        TxtfCostoTotal = new javax.swing.JTextField();
        BtnCancelar = new javax.swing.JButton();
        BtnConfirmar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));

        jLabel2.setText("Módulo de Reservas");
        jLabel2.setFont(new java.awt.Font("Champagne & Limousines", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(114, 114, 114))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 450, 70));

        jLabel3.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre Completo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));
        jPanel1.add(TxtfNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 190, -1));

        jLabel4.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Teléfono:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, 20));
        jPanel1.add(TxtfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 190, -1));

        jLabel5.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha y Hora:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 110, 20));
        jPanel1.add(DTPFechaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 370, -1));

        jLabel6.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Número de Personas:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        CBXNumPersonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[1, 2]", "[3, 4]", "[5, 8]" }));
        jPanel1.add(CBXNumPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 110, -1));

        jLabel7.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo de Mesa:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, 20));

        TxtfTipoMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtfTipoMesaActionPerformed(evt);
            }
        });
        jPanel1.add(TxtfTipoMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 110, -1));

        jLabel8.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ubicación:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        CBXUbicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Ventana", "Terraza" }));
        CBXUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXUbicacionActionPerformed(evt);
            }
        });
        jPanel1.add(CBXUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 110, -1));

        jLabel9.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Costo Total:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 20));

        TxtfCostoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtfCostoTotalActionPerformed(evt);
            }
        });
        jPanel1.add(TxtfCostoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 100, -1));

        BtnCancelar.setText("Cancelar");
        BtnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        BtnCancelar.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        BtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 90, -1));

        BtnConfirmar.setText("Confirmar");
        BtnConfirmar.setBackground(new java.awt.Color(0, 0, 0));
        BtnConfirmar.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        BtnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        BtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 90, -1));

        BtnRegresar.setText("Regresar");
        BtnRegresar.setBackground(new java.awt.Color(0, 0, 0));
        BtnRegresar.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        BtnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 90, 29));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtfCostoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtfCostoTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtfCostoTotalActionPerformed

    private void CBXUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXUbicacionActionPerformed
        int numPersonas = Integer.parseInt(CBXNumPersonas.getSelectedItem().toString());
        String tipoMesa;
        int costo = 0;

        // Asignar tipo de mesa y costo según la cantidad de personas
        if (numPersonas >= 1 && numPersonas <= 2) {
            tipoMesa = "Mesa pequeña";
            costo = 300;
        } else if (numPersonas >= 3 && numPersonas <= 4) {
            tipoMesa = "Mesa mediana";
            costo = 500;
        } else if (numPersonas >= 5 && numPersonas <= 8) {
            tipoMesa = "Mesa grande";
            costo = 700;
        } else {
            tipoMesa = "N/A";
        }

        TxtfTipoMesa.setText(tipoMesa); // Mostrar tipo de mesa
        TxtfCostoTotal.setText(String.valueOf(costo)); // Mostrar el costo total
    }//GEN-LAST:event_CBXUbicacionActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        frmMenu menuFrame = new frmMenu();
        menuFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void TxtfTipoMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtfTipoMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtfTipoMesaActionPerformed

    private void BtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmarActionPerformed
        // Validar si todos los campos están llenos
        if (TxtfTipoMesa.getText().isEmpty() || TxtfCostoTotal.getText().isEmpty() || CBXNumPersonas.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Por favor, llene todos los campos.");
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "¿Está seguro de confirmar la reserva?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                // Mostrar ticket de confirmación
                String ticket = "Reserva Confirmada\n"
                        + "Cantidad de Personas: " + CBXNumPersonas.getSelectedItem() + "\n"
                        + "Tipo de Mesa: " + TxtfTipoMesa.getText() + "\n"
                        + "Costo Total: $" + TxtfCostoTotal.getText();
                JOptionPane.showMessageDialog(this, ticket);

                // Regresar al menú
                frmMenu menuFrame = new frmMenu();
                menuFrame.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_BtnConfirmarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        int cancel = JOptionPane.showConfirmDialog(this, "¿Está seguro de cancelar la reserva?", "Cancelar", JOptionPane.YES_NO_OPTION);
        if (cancel == JOptionPane.YES_OPTION) {
            // Borrar todos los campos
            TxtfTipoMesa.setText("");
            TxtfCostoTotal.setText("");
            CBXNumPersonas.setSelectedIndex(0); // Reiniciar selección
            dateTimePicker.clear(); // Reiniciar el datetimepicker
        }

    }//GEN-LAST:event_BtnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(frmReservas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmReservas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmReservas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmReservas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmReservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnConfirmar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JComboBox<String> CBXNumPersonas;
    private javax.swing.JComboBox<String> CBXUbicacion;
    private com.github.lgooddatepicker.components.DateTimePicker DTPFechaHora;
    private javax.swing.JTextField TxtfCostoTotal;
    private javax.swing.JTextField TxtfNombreCompleto;
    private javax.swing.JTextField TxtfTelefono;
    private javax.swing.JTextField TxtfTipoMesa;
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
    // End of variables declaration//GEN-END:variables
}
