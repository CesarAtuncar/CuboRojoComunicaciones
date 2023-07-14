/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author user
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PaginaPrincipal
     */
    public PaginaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbtnRegistrarCliente = new javax.swing.JButton();
        jbtnRegistrarColaborador = new javax.swing.JButton();
        jbtnRegistrarPresupuesto = new javax.swing.JButton();
        jbtnHistorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("pagina_uno");
        setName("pagina_principal02"); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\OneDrive - 國立清華大學 National Tsing Hua University\\Documentos\\Universidad Tecnologica Del Perú\\UTP 2023\\2 Programacion Orientada a Obgetos (POO)\\Trabajo Final\\Cubo Rojo.jpeg")); // NOI18N

        jbtnRegistrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnRegistrarCliente.setText("Registrar Cliente");
        jbtnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarClienteActionPerformed(evt);
            }
        });

        jbtnRegistrarColaborador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnRegistrarColaborador.setText("Crear Presupuesto");
        jbtnRegistrarColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarColaboradorActionPerformed(evt);
            }
        });

        jbtnRegistrarPresupuesto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnRegistrarPresupuesto.setText("Requerimientos");
        jbtnRegistrarPresupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarPresupuestoActionPerformed(evt);
            }
        });

        jbtnHistorial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnHistorial.setText("Historial");
        jbtnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jbtnRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1)
                        .addContainerGap(357, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jbtnRegistrarColaborador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnRegistrarPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jbtnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRegistrarColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRegistrarPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarClienteActionPerformed
        // TODO add your handling code here:
            RegistroCliente registrocliente = new RegistroCliente();
            registrocliente.setVisible(true);
            dispose();
    }//GEN-LAST:event_jbtnRegistrarClienteActionPerformed

    private void jbtnRegistrarColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarColaboradorActionPerformed
        // TODO add your handling code here:
            CrearPresupuesto crearpresupuesto = new CrearPresupuesto();
            crearpresupuesto.setVisible(true);
            dispose();
    }//GEN-LAST:event_jbtnRegistrarColaboradorActionPerformed

    private void jbtnRegistrarPresupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarPresupuestoActionPerformed
        // TODO add your handling code here:
            Requerimientos requerimientos = new Requerimientos();
            requerimientos.setVisible(true);
            dispose();     
    }//GEN-LAST:event_jbtnRegistrarPresupuestoActionPerformed

    private void jbtnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHistorialActionPerformed
        // TODO add your handling code here:
            Historial historial = new Historial();
            historial.setVisible(true);
            dispose(); 
    }//GEN-LAST:event_jbtnHistorialActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtnHistorial;
    private javax.swing.JButton jbtnRegistrarCliente;
    private javax.swing.JButton jbtnRegistrarColaborador;
    private javax.swing.JButton jbtnRegistrarPresupuesto;
    // End of variables declaration//GEN-END:variables
}
