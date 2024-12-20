/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIs;
// holaaaaaaaaaaaaaaaaaaaaa

import business.objects.ReservaBO;
import dtos.ReservaDTO;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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

    private ReservaDTO reservaSeleccionada;

    private void llenarTablaConReserva(ReservaDTO reservaDTO) {
        DefaultTableModel model = (DefaultTableModel) TableReservacionCancelar.getModel();
        model.setRowCount(0); // Limpiar filas anteriores

        // Agregar una nueva fila con la información de la reserva
        Object[] rowData = {
            reservaDTO.getIdReserva(), // ID de reserva
            reservaDTO.getNombreCliente(), // Nombre del cliente
            reservaDTO.getFechaReserva(), // Fecha de reserva
            reservaDTO.getEstadoReserva() // Estado de la reserva
        };
        model.addRow(rowData);
    }
    
    private void llenarTablaConReservas(List<ReservaDTO> reservasDTO) {
    // Limpiar la tabla antes de llenarla con nuevos datos
    DefaultTableModel model = (DefaultTableModel) TableReservacionCancelar.getModel();
    model.setRowCount(0); // Elimina todas las filas actuales en la tabla

    // Iterar sobre la lista de reservasDTO y añadir cada reserva como una fila en la tabla
    for (ReservaDTO reserva : reservasDTO) {
        Object[] row = {
            reserva.getIdReserva(),
            reserva.getFechaReserva(),
            reserva.getHoraReserva(),
            reserva.getNumPersonas(),
            reserva.getCosto(),
            reserva.getEstadoReserva(),
            reserva.getMulta(),
            reserva.getIdCliente(),
            reserva.getNombreCliente(), // Asumiendo que tienes un getter para el nombre del cliente
            reserva.getIdMesa()
        };

        // Agregar la fila al modelo de la tabla
        model.addRow(row);
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
                .addGap(115, 115, 115)
                .addComponent(jLabel2)
                .addContainerGap(229, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 710, 70));

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
        jPanel1.add(BtnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 100, -1));

        BtnConfirmar.setText("Confirmar");
        BtnConfirmar.setBackground(new java.awt.Color(0, 0, 0));
        BtnConfirmar.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        BtnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        BtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 100, -1));

        jLabel11.setText("Multa Calculada:");
        jLabel11.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        BtnBuscarReservacion1.setText("Buscar");
        BtnBuscarReservacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarReservacion1ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBuscarReservacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 80, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 490, 110));
        jPanel1.add(TxtfMulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 90, -1));

        jLabel9.setText("Buscar Reserva por ID:");
        jLabel9.setFont(new java.awt.Font("Champagne & Limousines", 1, 19)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, 20));

        BtnBuscarReservacion.setText("Buscar");
        BtnBuscarReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarReservacionActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBuscarReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 80, -1));
        jPanel1.add(TxtfBuscarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 310, 30));
        jPanel1.add(DPBuscarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 330, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void BtnBuscarReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarReservacionActionPerformed
        // TODO add your handling code here:
        String reservaIdStr = TxtfBuscarReserva.getText().trim();

        // Validar que el ID de la reserva no esté vacío
        if (reservaIdStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID de reserva", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si el ID es vacío
        }

        // Convertir el ID a int (suponiendo que idReserva es de tipo int)
        int reservaId;
        try {
            reservaId = Integer.parseInt(reservaIdStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ID de reserva debe ser un número válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Asumir que tienes una instancia de ReservaBO en algún lugar de tu clase
        ReservaBO reservaBO = new ReservaBO();

        try {
            // Buscar la reserva por su ID usando la capa de negocio
            ReservaDTO reservaDTO = reservaBO.buscarReservaPorId(reservaId);

            if (reservaDTO != null) {
                // Llenar la tabla con la información de la reserva
                llenarTablaConReserva(reservaDTO); // Método que implementas para llenar la tabla

                // Guarda la reserva seleccionada en un atributo de clase para usarla más adelante
                this.reservaSeleccionada = reservaDTO; // O ajusta según tus necesidades
            } else {
                // Manejar el caso en que no se encuentra la reserva
                JOptionPane.showMessageDialog(this, "Reserva no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            // Manejar cualquier excepción que pueda surgir al buscar la reserva
            JOptionPane.showMessageDialog(this, "Error al buscar la reserva: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnBuscarReservacionActionPerformed

    private void BtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmarActionPerformed
        // TODO add your handling code here:
        // Obtener la reserva seleccionada de la tabla
        int selectedRow = TableReservacionCancelar.getSelectedRow();
        if (selectedRow != -1) {
            // Obtener el ID de la reserva seleccionada
            int idReserva = (Integer) TableReservacionCancelar.getValueAt(selectedRow, 0); // Cambia el índice según la columna de ID

            Date fechaCancelacion = new Date(); // O la fecha que desees usar para la cancelación

            // Crear instancia de ReservaBO
            ReservaBO reservaBO = new ReservaBO();

            try {
                // Llama al método de cancelación en la clase BO
                double multa = reservaBO.cancelarReserva(idReserva, fechaCancelacion);
                JOptionPane.showMessageDialog(this, "Reserva cancelada exitosamente. Multa: " + multa);
                // Actualiza la tabla o realiza otras acciones necesarias
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al cancelar la reserva: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una reserva.");
        }
    }//GEN-LAST:event_BtnConfirmarActionPerformed

    private void BtnBuscarReservacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarReservacion1ActionPerformed
        // TODO add your handling code here:
        // Obtener la fecha seleccionada del DatePicker
        LocalDate fechaSeleccionada = DPBuscarFecha.getDate();

        // Validar que se haya seleccionado una fecha
        if (fechaSeleccionada == null) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fecha", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si la fecha es nula
        }

        // Asumir que tienes una instancia de ReservaBO en algún lugar de tu clase
        ReservaBO reservaBO = new ReservaBO();

        try {
            // Buscar las reservas por la fecha usando la capa de negocio
            List<ReservaDTO> reservasDTO = reservaBO.buscarReservasPorFecha(fechaSeleccionada);

            if (reservasDTO != null && !reservasDTO.isEmpty()) {
                // Llenar la tabla con la información de las reservas
                llenarTablaConReservas(reservasDTO); // Método que implementas para llenar la tabla
            } else {
                // Manejar el caso en que no se encuentran reservas
                JOptionPane.showMessageDialog(this, "No se encontraron reservas para la fecha seleccionada", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            // Manejar cualquier excepción que pueda surgir al buscar las reservas
            JOptionPane.showMessageDialog(this, "Error al buscar las reservas: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnBuscarReservacion1ActionPerformed

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
