/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codi;

import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class FinestraConversio extends javax.swing.JFrame {

    /**
     * Creates new form FinestraConversio
     */
    public FinestraConversio() {
        initComponents();
        txtCelsius.setText("");
        txtKelvin.setText("");
        this.setLocationRelativeTo(null);
        txtCelsius.requestFocus();
        lblCelcius.setFont(new Font("Arial", 0, 14));
        lblKelvin.setFont(new Font("Arial", 0, 14));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCelcius = new javax.swing.JLabel();
        lblKelvin = new javax.swing.JLabel();
        botoNetejar = new javax.swing.JButton();
        txtCelsius = new javax.swing.JTextField();
        txtKelvin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        lblCelcius.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCelcius.setText("Graus Celsius");

        lblKelvin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblKelvin.setText("Graus Kelvin");

        botoNetejar.setText("Netejar");
        botoNetejar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoNetejarActionPerformed(evt);
            }
        });

        txtCelsius.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCelsiusKeyPressed(evt);
            }
        });

        txtKelvin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKelvinKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCelcius)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                                .addComponent(txtCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblKelvin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botoNetejar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCelcius))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKelvin))
                .addGap(18, 18, 18)
                .addComponent(botoNetejar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botoNetejarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoNetejarActionPerformed
        // TODO add your handling code here:
        txtCelsius.setText("");
        txtKelvin.setText("");
    }//GEN-LAST:event_botoNetejarActionPerformed

    private void txtCelsiusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelsiusKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(txtKelvin.getText().equals("") && txtCelsius.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Els dos estan buits!!!");
            } else {
                try {
                    double c = Double.parseDouble(txtCelsius.getText());
                    double k = Convertir.celAKel(c);
            
                    txtKelvin.setText(String.valueOf(k));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "El NÚMERO NO ÉS CORRECTE");
                }
            }
        }
    }//GEN-LAST:event_txtCelsiusKeyPressed

    private void txtKelvinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKelvinKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(txtKelvin.getText().equals("") && txtCelsius.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Els dos estan buits!!!");
            } else {
                try { 
                    double k = Double.parseDouble(txtKelvin.getText());
                    double c = Convertir.kelACel(k);
            
                    txtCelsius.setText(String.valueOf(c));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "EL NÚMERO NO ÉS CORRECTE");
                }
            }
        }
    }//GEN-LAST:event_txtKelvinKeyPressed

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
            java.util.logging.Logger.getLogger(FinestraConversio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinestraConversio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinestraConversio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinestraConversio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinestraConversio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoNetejar;
    private javax.swing.JLabel lblCelcius;
    private javax.swing.JLabel lblKelvin;
    private javax.swing.JTextField txtCelsius;
    private javax.swing.JTextField txtKelvin;
    // End of variables declaration//GEN-END:variables
}
