/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientews;

import clases.GestionTXT;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author JuanJo
 */
public class Dialog_cambiarIP extends java.awt.Dialog {
    
    GestionTXT gestionIP = new GestionTXT();
    
    /**
     * Creates new form Dialog_cambiarIP
     */
    public Dialog_cambiarIP(java.awt.Frame parent, boolean modal) throws IOException {
        super(parent, modal);
        initComponents();
        gestionIP.leerIP(jTextField_direccionIP);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField_direccionIP = new javax.swing.JTextField();
        jLabel_direccionIP = new javax.swing.JLabel();
        jButton_generarIP = new javax.swing.JButton();
        jButton_cancelar = new javax.swing.JButton();
        jLabel_instrucciones = new javax.swing.JLabel();
        jButton_aceptar = new javax.swing.JButton();

        setResizable(false);
        setTitle("Cambiar dirección IP");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_direccionIP.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel_direccionIP.setText("Dirección IP:");
        jLabel_direccionIP.setToolTipText("");

        jButton_generarIP.setBackground(new java.awt.Color(102, 102, 255));
        jButton_generarIP.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton_generarIP.setForeground(new java.awt.Color(255, 255, 255));
        jButton_generarIP.setText("Generar IP");
        jButton_generarIP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_generarIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_generarIPActionPerformed(evt);
            }
        });

        jButton_cancelar.setBackground(new java.awt.Color(102, 102, 255));
        jButton_cancelar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_cancelar.setText("Cancelar");
        jButton_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelarActionPerformed(evt);
            }
        });

        jLabel_instrucciones.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel_instrucciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_instrucciones.setText("<html><body><p align=\"center\">Introduzca la dirección IP del equipo, o bien asígnela automáticamente</p></html></body>");
        jLabel_instrucciones.setToolTipText("");
        jLabel_instrucciones.setAutoscrolls(true);
        jLabel_instrucciones.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jButton_aceptar.setBackground(new java.awt.Color(102, 102, 255));
        jButton_aceptar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton_aceptar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_aceptar.setText("Aceptar");
        jButton_aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel_instrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_direccionIP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_direccionIP, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_aceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_generarIP, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel_instrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_direccionIP)
                    .addComponent(jTextField_direccionIP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_generarIP)
                .addGap(9, 9, 9)
                .addComponent(jButton_aceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_cancelar)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        dispose();
    }//GEN-LAST:event_closeDialog

    private void jButton_generarIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_generarIPActionPerformed
        try {
            // TODO add your handling code here:
            String thisIp = InetAddress.getLocalHost().getHostAddress();
            jTextField_direccionIP.setText(thisIp);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Dialog_cambiarIP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton_generarIPActionPerformed

    private void jButton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_cancelarActionPerformed

    private void jButton_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_aceptarActionPerformed
        try {
            // TODO add your handling code here:
            gestionIP.escribirIP(jTextField_direccionIP.getText());
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(Dialog_cambiarIP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton_aceptarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton_aceptar;
    public javax.swing.JButton jButton_cancelar;
    public javax.swing.JButton jButton_generarIP;
    private javax.swing.JLabel jLabel_direccionIP;
    private javax.swing.JLabel jLabel_instrucciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_direccionIP;
    // End of variables declaration//GEN-END:variables

}
