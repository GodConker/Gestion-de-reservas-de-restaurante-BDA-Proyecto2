/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIs;
 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Dell
 */
public class frmReserva extends javax.swing.JFrame {

    /**
     * Creates new form frmReserva
     */
    public frmReserva() {
        initComponents();
        this.setLocationRelativeTo(null); // Centra el frame en la pantalla
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BtnRegresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TxtfBuscarCliente = new javax.swing.JTextField();
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        TxtfNombreCompleto = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));

        jLabel2.setText("Módulo de Reservas");
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
                .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(122, 122, 122))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 450, 70));

        jLabel3.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Crear Reservación:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        TxtfBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtfBuscarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(TxtfBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 300, -1));

        jLabel4.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Teléfono:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, 20));

        TxtfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtfTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(TxtfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 190, -1));

        jLabel5.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha y Hora:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 110, 20));
        jPanel1.add(DTPFechaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 310, -1));

        jLabel6.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Número de Personas:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        CBXNumPersonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        CBXNumPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXNumPersonasActionPerformed(evt);
            }
        });
        jPanel1.add(CBXNumPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 110, -1));

        jLabel7.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo de Mesa:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, 20));

        TxtfTipoMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtfTipoMesaActionPerformed(evt);
            }
        });
        jPanel1.add(TxtfTipoMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 110, -1));

        jLabel8.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ubicación:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, -1));

        CBXUbicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Ventana", "Terraza" }));
        CBXUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXUbicacionActionPerformed(evt);
            }
        });
        jPanel1.add(CBXUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 110, -1));

        jLabel9.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Costo Total:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, 20));

        TxtfCostoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtfCostoTotalActionPerformed(evt);
            }
        });
        jPanel1.add(TxtfCostoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 100, -1));

        BtnCancelar.setText("Cancelar");
        BtnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        BtnCancelar.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        BtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 90, 30));

        BtnConfirmar.setText("Confirmar");
        BtnConfirmar.setBackground(new java.awt.Color(0, 0, 0));
        BtnConfirmar.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        BtnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        BtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 90, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 450, 10));

        jLabel10.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre Completo:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        TxtfNombreCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtfNombreCompletoActionPerformed(evt);
            }
        });
        jPanel1.add(TxtfNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 190, -1));

        BtnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        BtnBuscar.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        BtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 90, 30));

        jLabel11.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Buscar Cliente Registrado:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBXNumPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXNumPersonasActionPerformed
// Obtener el número de personas seleccionadas
        int numPersonas = Integer.parseInt(CBXNumPersonas.getSelectedItem().toString());

        // Variables para almacenar el tipo de mesa y el costo
        String tipoMesa = "";
        int costoReserva = 0;

        // Determinar el tipo de mesa y costo dependiendo del número de personas
        if (numPersonas >= 1 && numPersonas <= 2) {
            tipoMesa = "Mesa pequeña";
            costoReserva = 300;
        } else if (numPersonas >= 3 && numPersonas <= 4) {
            tipoMesa = "Mesa mediana";
            costoReserva = 500;
        } else if (numPersonas >= 5 && numPersonas <= 8) {
            tipoMesa = "Mesa grande";
            costoReserva = 700;
        }

        // Actualizar los campos de tipo de mesa y costo total
        TxtfTipoMesa.setText(tipoMesa);
        TxtfCostoTotal.setText(String.valueOf(costoReserva));

    }//GEN-LAST:event_CBXNumPersonasActionPerformed

    private void TxtfTipoMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtfTipoMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtfTipoMesaActionPerformed

    private void CBXUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXUbicacionActionPerformed

    }//GEN-LAST:event_CBXUbicacionActionPerformed

    private void TxtfCostoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtfCostoTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtfCostoTotalActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
// Verificar si todos los campos están vacíos
    if (TxtfNombreCompleto.getText().isEmpty() &&
        TxtfTelefono.getText().isEmpty() &&
        CBXNumPersonas.getSelectedItem().toString().equals("0") &&
        TxtfTipoMesa.getText().isEmpty() &&
        TxtfCostoTotal.getText().isEmpty() &&
        DTPFechaHora.getDateTimeStrict() == null) {
        
        // Mostrar mensaje si todos los campos están vacíos
        javax.swing.JOptionPane.showMessageDialog(this,
                "Por favor, llena al menos un campo antes de cancelar.",
                "Advertencia",
                javax.swing.JOptionPane.WARNING_MESSAGE);
    } else {
        // Mostrar un cuadro de diálogo de confirmación
        int respuesta = javax.swing.JOptionPane.showConfirmDialog(this,
                "¿Estás seguro de que deseas cancelar?",
                "Confirmar Cancelación",
                javax.swing.JOptionPane.YES_NO_OPTION);
        
        // Si el usuario selecciona 'Sí'
        if (respuesta == javax.swing.JOptionPane.YES_OPTION) {
            // Limpiar todos los campos
            TxtfNombreCompleto.setText("");
            TxtfTelefono.setText("");
            
            // Limpiar los campos de tipo de mesa y costo total
            TxtfTipoMesa.setText(""); // Limpiar tipo de mesa
            TxtfCostoTotal.setText(""); // Limpiar costo total
            
            // Cambiar a editable para poder limpiar los campos no editables
            TxtfTipoMesa.setEditable(true);
            TxtfCostoTotal.setEditable(true);
            
            // Restablecer a la opción por defecto
            CBXNumPersonas.setSelectedIndex(0);
            CBXUbicacion.setSelectedIndex(0);
            
            // Limpiar el DateTimePicker
            DTPFechaHora.setDateTimeStrict(null);
            
            // Volver a establecer como no editable si es necesario
            TxtfTipoMesa.setEditable(false);
            TxtfCostoTotal.setEditable(false);
        }
    }
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmarActionPerformed
// Verificar si los campos están llenos
    if (TxtfNombreCompleto.getText().isEmpty() ||
        TxtfTelefono.getText().isEmpty() ||
        CBXNumPersonas.getSelectedItem().toString().equals("0") ||
        TxtfTipoMesa.getText().isEmpty() ||
        TxtfCostoTotal.getText().isEmpty() ||
        DTPFechaHora.getDateTimeStrict() == null) {
        
        // Mostrar mensaje si hay campos vacíos
        javax.swing.JOptionPane.showMessageDialog(this,
                "Por favor, llena todos los campos requeridos.",
                "Advertencia",
                javax.swing.JOptionPane.WARNING_MESSAGE);
        return; // Salir del método
    }

    // Obtener los datos de la reservación
    String nombre = TxtfNombreCompleto.getText();
    String telefono = TxtfTelefono.getText();
    String numPersonas = CBXNumPersonas.getSelectedItem().toString();
    String tipoMesa = TxtfTipoMesa.getText();
    String ubicacion = CBXUbicacion.getSelectedItem().toString();
    String costoTotal = TxtfCostoTotal.getText();

    // Obtener la fecha y hora seleccionadas
    LocalDateTime fechaHora = DTPFechaHora.getDateTimeStrict(); // Obtener el objeto LocalDateTime
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Definir el formato deseado
    String fechaHoraString = fechaHora.format(formatter); // Formatear a String

    // Crear el ticket de reservación
    String ticket = "----- RESERVA ----\n"
            + "Nombre Completo: " + nombre + "\n"
            + "Teléfono: " + telefono + "\n"
            + "Número de Personas: " + numPersonas + "\n"
            + "Tipo de Mesa: " + tipoMesa + "\n"
            + "Ubicación: " + ubicacion + "\n"
            + "Costo Total: $" + costoTotal + "\n"
            + "Fecha y Hora: " + fechaHoraString + "\n" // Agregar la fecha y hora formateadas al ticket
            + "--------------------\n"
            + "¿Estás de acuerdo con la reservación?";

    // Mostrar un cuadro de diálogo con el ticket y preguntar si está de acuerdo
    int respuesta = javax.swing.JOptionPane.showConfirmDialog(this, ticket, "Confirmar Reservación", javax.swing.JOptionPane.YES_NO_OPTION);

    // Si el usuario confirma (Opción 'Sí')
    if (respuesta == javax.swing.JOptionPane.YES_OPTION) {
        // Mostrar mensaje de confirmación
        javax.swing.JOptionPane.showMessageDialog(this, "Reservación confirmada con éxito");

        // Regresar al menú
        frmMenu menuFrame = new frmMenu();
        menuFrame.setVisible(true);
        this.dispose(); // Cerrar el frame de reservación
    }
    }//GEN-LAST:event_BtnConfirmarActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        frmMenu menuFrame = new frmMenu();
        menuFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void TxtfNombreCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtfNombreCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtfNombreCompletoActionPerformed

    private void TxtfBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtfBuscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtfBuscarClienteActionPerformed

    private void TxtfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtfTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtfTelefonoActionPerformed

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
            java.util.logging.Logger.getLogger(frmReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnConfirmar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JComboBox<String> CBXNumPersonas;
    private javax.swing.JComboBox<String> CBXUbicacion;
    private com.github.lgooddatepicker.components.DateTimePicker DTPFechaHora;
    private javax.swing.JTextField TxtfBuscarCliente;
    private javax.swing.JTextField TxtfCostoTotal;
    private javax.swing.JTextField TxtfNombreCompleto;
    private javax.swing.JTextField TxtfTelefono;
    private javax.swing.JTextField TxtfTipoMesa;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}