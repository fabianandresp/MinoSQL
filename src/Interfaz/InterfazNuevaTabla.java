/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author pimie
 */
public class InterfazNuevaTabla extends javax.swing.JFrame {

    /**
     * Creates new form InterfazNuevaTabla
     */
    
    //NO TOMAR EN CUENTA ESTA INSTANCIA TODAVIA
    //Interfaz principal = new Interfaz();
    
    public InterfazNuevaTabla() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
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
        txtNombreColumna = new javax.swing.JTextField();
        btnNuevaColumna = new javax.swing.JButton();
        btnListo = new javax.swing.JButton();
        txtNombreTabla = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreColumna.setText("Nombre Columna");
        txtNombreColumna.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreColumnaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreColumnaFocusLost(evt);
            }
        });
        txtNombreColumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreColumnaActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreColumna, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 128, 30));

        btnNuevaColumna.setText("Nueva Columna");
        btnNuevaColumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaColumnaActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevaColumna, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        btnListo.setText("Listo");
        jPanel1.add(btnListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        txtNombreTabla.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreTabla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreTabla.setText("Ingrese el nombre de la Tabla");
        txtNombreTabla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreTablaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreTablaFocusLost(evt);
            }
        });
        txtNombreTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreTablaActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreTablaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreTablaFocusGained

        if (txtNombreTabla.getText().equals("Ingrese el nombre de la Tabla")) {
            txtNombreTabla.setText("");
            txtNombreTabla.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtNombreTablaFocusGained

    private void txtNombreTablaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreTablaFocusLost
       
        if (txtNombreTabla.getText().equals("")) {
            txtNombreTabla.setText("Ingrese el nombre de la Tabla");
            txtNombreTabla.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtNombreTablaFocusLost

    private void txtNombreTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreTablaActionPerformed
        // TODO add your handling code here:
        txtNombreTabla.getText();
    }//GEN-LAST:event_txtNombreTablaActionPerformed

    private void txtNombreColumnaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreColumnaFocusGained
        
        if(txtNombreColumna.getText().equals("Nombre Columna")) {
            txtNombreColumna.setText("");
            txtNombreColumna.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtNombreColumnaFocusGained

    private void txtNombreColumnaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreColumnaFocusLost
        
        if(txtNombreColumna.getText().equals("")){
            txtNombreColumna.setText("Nombre Columna");
            txtNombreColumna.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtNombreColumnaFocusLost

    private void txtNombreColumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreColumnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreColumnaActionPerformed

    private void btnNuevaColumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaColumnaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnNuevaColumnaActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazNuevaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazNuevaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazNuevaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazNuevaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazNuevaTabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListo;
    private javax.swing.JButton btnNuevaColumna;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombreColumna;
    private javax.swing.JTextField txtNombreTabla;
    // End of variables declaration//GEN-END:variables
}
