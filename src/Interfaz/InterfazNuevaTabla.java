/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.TableColumn;

/**
 *
 * @author pimie
 */
public class InterfazNuevaTabla extends javax.swing.JFrame {

    /**
     * Creates new form InterfazNuevaTabla
     */
    Interfaz principal = new Interfaz();
    ArrayList<String> titulosColumnas = new ArrayList<>();

    public InterfazNuevaTabla() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
        JLabelColum1.setEnabled(false);
        JLabelColum2.setEnabled(false);
        JLabelColum3.setEnabled(false);
        JLabelColum4.setEnabled(false);
        JLabelColum5.setEnabled(false);
        btnBorrar1.setEnabled(false);
        btnBorrar2.setEnabled(false);
        btnBorrar3.setEnabled(false);
        btnBorrar4.setEnabled(false);
        btnBorrar5.setEnabled(false);
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
        btnListo = new javax.swing.JButton();
        txtNombreTablaCreada = new javax.swing.JTextField();
        btnNuevaColumna = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        JLabelColum1 = new javax.swing.JLabel();
        JLabelColum2 = new javax.swing.JLabel();
        JLabelColum3 = new javax.swing.JLabel();
        JLabelColum4 = new javax.swing.JLabel();
        JLabelColum5 = new javax.swing.JLabel();
        btnBorrar1 = new javax.swing.JButton();
        btnBorrar2 = new javax.swing.JButton();
        btnBorrar3 = new javax.swing.JButton();
        btnBorrar4 = new javax.swing.JButton();
        btnBorrar5 = new javax.swing.JButton();

        setTitle("Creacion Columnas");

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

        btnListo.setText("Listo");
        btnListo.setPreferredSize(new java.awt.Dimension(40, 30));
        btnListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoActionPerformed(evt);
            }
        });
        jPanel1.add(btnListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 80, -1));

        txtNombreTablaCreada.setEditable(false);
        txtNombreTablaCreada.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreTablaCreada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreTablaCreada.setText("Nombre de la Tabla");
        txtNombreTablaCreada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreTablaCreadaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreTablaCreadaFocusLost(evt);
            }
        });
        txtNombreTablaCreada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreTablaCreadaActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreTablaCreada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 30));

        btnNuevaColumna.setText("Nueva Columna");
        btnNuevaColumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaColumnaActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevaColumna, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        JLabelColum1.setBackground(new java.awt.Color(255, 255, 255));
        JLabelColum1.setToolTipText("Nombre Columna 1");

        JLabelColum2.setBackground(new java.awt.Color(255, 255, 255));
        JLabelColum2.setToolTipText("Nombre Columna 1");

        JLabelColum3.setBackground(new java.awt.Color(255, 255, 255));
        JLabelColum3.setToolTipText("Nombre Columna 1");

        JLabelColum4.setBackground(new java.awt.Color(255, 255, 255));
        JLabelColum4.setToolTipText("Nombre Columna 1");

        JLabelColum5.setBackground(new java.awt.Color(255, 255, 255));
        JLabelColum5.setToolTipText("Nombre Columna 1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelColum1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLabelColum2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(JLabelColum5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(JLabelColum3, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                    .addComponent(JLabelColum4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(JLabelColum1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLabelColum2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLabelColum3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabelColum4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLabelColum5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, 210));

        btnBorrar1.setText("X");
        btnBorrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        btnBorrar2.setText("X");
        btnBorrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        btnBorrar3.setText("X");
        btnBorrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        btnBorrar4.setText("X");
        btnBorrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        btnBorrar5.setText("X");
        btnBorrar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreColumnaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreColumnaFocusGained

        if (txtNombreColumna.getText().equals("Nombre Columna")) {
            txtNombreColumna.setText("");
            txtNombreColumna.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtNombreColumnaFocusGained

    private void txtNombreColumnaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreColumnaFocusLost

        if (txtNombreColumna.getText().equals("")) {
            txtNombreColumna.setText("Nombre Columna");
            txtNombreColumna.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtNombreColumnaFocusLost

    private void txtNombreColumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreColumnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreColumnaActionPerformed

    //CONDICIONAR LA ENTRADA DE TEXTO SOLO A LETRA MAYUSCULA (SE VEN MEJOR LOS NOMBRES DE LAS TABLAS CON ESTE TIPO DE LETRA) 
    private void btnNuevaColumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaColumnaActionPerformed
        String nombreColumna = txtNombreColumna.getText();
        titulosColumnas.add(nombreColumna);
        txtNombreColumna.setText("");
        System.out.println("**Se agrego una columna**");
        
        //ESTO SE PUEDE ELIMINAR? 
        //Esto no esta funcionando bien aun no logro levantar el jTextField que despliegue el nombre!
        TextField mostrarColumnas = new TextField(txtNombreColumna.getText(), 20);
        mostrarColumnas.setVisible(true);
        jPanel2.add(mostrarColumnas, FlowLayout.CENTER, -1);
        //jPanel1.add(mostrarColumnas, -1, getComponentCount()-1);

        //JButton botonEliminar = new JButton("X");
        // this.jPanel2.add(botonEliminar);
        switch (titulosColumnas.size()) {
            case 1:
                JLabelColum1.setText(titulosColumnas.get(0));
                JLabelColum1.setEnabled(true);
                btnBorrar1.setEnabled(true);
                break;

            case 2:
                JLabelColum2.setText(titulosColumnas.get(1));
                JLabelColum2.setEnabled(true);
                btnBorrar2.setEnabled(true);
                break;

            case 3:
                JLabelColum3.setText(titulosColumnas.get(2));
                JLabelColum3.setEnabled(true);
                btnBorrar3.setEnabled(true);
                break;
            case 4:
                JLabelColum4.setText(titulosColumnas.get(3));
                JLabelColum4.setEnabled(true);
                btnBorrar4.setEnabled(true);
                break;
            case 5:
                JLabelColum5.setText(titulosColumnas.get(4));
                JLabelColum5.setEnabled(true);
                btnBorrar5.setEnabled(true);
                break;
        }

        for (int i = 0; i < titulosColumnas.size(); i++) {
            System.out.println(titulosColumnas.get(i));
        }
        
        System.out.println(titulosColumnas.size());
    }//GEN-LAST:event_btnNuevaColumnaActionPerformed

    //NO SERA MEJOR CAMBIARLO POR UN JLABEL, QUE VAYA CAMBIANDO DE ACUERDO A LA ELECCION DEL USUARIO EN EL JBOX DE NOMBRE DE TABLAS?
    private void txtNombreTablaCreadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreTablaCreadaActionPerformed
        // = principal.tablas.get(principal.tablas.size());
        //txtNombreTablaCreada.setText(principal.tablas.get(principal.tablas.size()).toString());
    }//GEN-LAST:event_txtNombreTablaCreadaActionPerformed

    private void txtNombreTablaCreadaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreTablaCreadaFocusLost

        if (txtNombreTablaCreada.getText().equals("")) {
            txtNombreTablaCreada.setText("Ingrese el nombre de la Tabla");
            txtNombreTablaCreada.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtNombreTablaCreadaFocusLost

    private void txtNombreTablaCreadaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreTablaCreadaFocusGained

        if (txtNombreTablaCreada.getText().equals("Ingrese el nombre de la Tabla")) {
            txtNombreTablaCreada.setText("");
            txtNombreTablaCreada.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtNombreTablaCreadaFocusGained

    private void btnBorrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar1ActionPerformed
        JLabelColum1.setText(null);
        btnBorrar1.setEnabled(false);
        titulosColumnas.remove(0);
        System.out.println("Se elimino una columnas");

    }//GEN-LAST:event_btnBorrar1ActionPerformed

    private void btnBorrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar2ActionPerformed
        JLabelColum2.setText(null);
        btnBorrar2.setEnabled(false);
        titulosColumnas.remove(1);
        System.out.println("Se elimino una columnas");
    }//GEN-LAST:event_btnBorrar2ActionPerformed

    private void btnBorrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar3ActionPerformed
        JLabelColum3.setText(null);
        btnBorrar3.setEnabled(false);
        titulosColumnas.remove(2);
        System.out.println("Se elimino una columnas");
    }//GEN-LAST:event_btnBorrar3ActionPerformed

    private void btnBorrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar4ActionPerformed
        JLabelColum4.setText(null);
        btnBorrar4.setEnabled(false);
        titulosColumnas.remove(3);
        System.out.println("Se elimino una columnas");
    }//GEN-LAST:event_btnBorrar4ActionPerformed

    private void btnBorrar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar5ActionPerformed
        JLabelColum5.setText(null);
        btnBorrar5.setEnabled(false);
        titulosColumnas.remove(4);
        System.out.println("Se elimino una columnas");
    }//GEN-LAST:event_btnBorrar5ActionPerformed
    
    //NO TOCAR!!
    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
        principal.crearColumnas(titulosColumnas);
        //this.setVisible(false);

    }//GEN-LAST:event_btnListoActionPerformed

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
    private javax.swing.JLabel JLabelColum1;
    private javax.swing.JLabel JLabelColum2;
    private javax.swing.JLabel JLabelColum3;
    private javax.swing.JLabel JLabelColum4;
    private javax.swing.JLabel JLabelColum5;
    private javax.swing.JButton btnBorrar1;
    private javax.swing.JButton btnBorrar2;
    private javax.swing.JButton btnBorrar3;
    private javax.swing.JButton btnBorrar4;
    private javax.swing.JButton btnBorrar5;
    private javax.swing.JButton btnListo;
    private javax.swing.JButton btnNuevaColumna;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtNombreColumna;
    private javax.swing.JTextField txtNombreTablaCreada;
    // End of variables declaration//GEN-END:variables
}
