/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.Columna;
import BackEnd.Controlador;
import BackEnd.Esquema;
import BackEnd.Tabla;
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
public class NuevaTabla extends javax.swing.JFrame {

    /**
     * Creates new form NuevaTabla
     */
    public ArrayList<Columna> titulosColumnas = new ArrayList<>();
    Controlador controlador;
    
    public NuevaTabla(Controlador controlador) {
        this.controlador = controlador;
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
    
    public NuevaTabla() {
        //To change body of generated methods, choose Tools | Templates.
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
        jLabelNombreTabla = new javax.swing.JLabel();

        setTitle("Creacion Columnas");

        jPanel1.setBackground(new java.awt.Color(1, 22, 39));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreColumna.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreColumna.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        txtNombreColumna.setForeground(new java.awt.Color(1, 22, 39));
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

        btnListo.setBackground(new java.awt.Color(193, 240, 249));
        btnListo.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btnListo.setForeground(new java.awt.Color(1, 22, 39));
        btnListo.setText("Listo");
        btnListo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 12), new java.awt.Color(1, 22, 39))); // NOI18N
        btnListo.setPreferredSize(new java.awt.Dimension(40, 30));
        btnListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoActionPerformed(evt);
            }
        });
        jPanel1.add(btnListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 80, -1));

        btnNuevaColumna.setBackground(new java.awt.Color(193, 240, 249));
        btnNuevaColumna.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btnNuevaColumna.setForeground(new java.awt.Color(1, 22, 39));
        btnNuevaColumna.setText("Nueva Columna");
        btnNuevaColumna.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 12), new java.awt.Color(1, 22, 39))); // NOI18N
        btnNuevaColumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaColumnaActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevaColumna, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 110, 30));

        jPanel2.setBackground(new java.awt.Color(1, 22, 39));

        JLabelColum1.setBackground(new java.awt.Color(255, 255, 255));
        JLabelColum1.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        JLabelColum1.setForeground(new java.awt.Color(255, 255, 255));
        JLabelColum1.setToolTipText("Nombre Columna 1");

        JLabelColum2.setBackground(new java.awt.Color(255, 255, 255));
        JLabelColum2.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        JLabelColum2.setForeground(new java.awt.Color(255, 255, 255));
        JLabelColum2.setToolTipText("Nombre Columna 1");

        JLabelColum3.setBackground(new java.awt.Color(255, 255, 255));
        JLabelColum3.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        JLabelColum3.setForeground(new java.awt.Color(255, 255, 255));
        JLabelColum3.setToolTipText("Nombre Columna 1");

        JLabelColum4.setBackground(new java.awt.Color(255, 255, 255));
        JLabelColum4.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        JLabelColum4.setForeground(new java.awt.Color(255, 255, 255));
        JLabelColum4.setToolTipText("Nombre Columna 1");

        JLabelColum5.setBackground(new java.awt.Color(255, 255, 255));
        JLabelColum5.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        JLabelColum5.setForeground(new java.awt.Color(255, 255, 255));
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
                    .addComponent(JLabelColum4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLabelColum3, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
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
                .addGap(12, 12, 12)
                .addComponent(JLabelColum5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, 210));

        btnBorrar1.setBackground(new java.awt.Color(193, 240, 249));
        btnBorrar1.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btnBorrar1.setForeground(new java.awt.Color(1, 22, 39));
        btnBorrar1.setText("X");
        btnBorrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        btnBorrar2.setBackground(new java.awt.Color(193, 240, 249));
        btnBorrar2.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btnBorrar2.setForeground(new java.awt.Color(1, 22, 39));
        btnBorrar2.setText("X");
        btnBorrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        btnBorrar3.setBackground(new java.awt.Color(193, 240, 249));
        btnBorrar3.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btnBorrar3.setForeground(new java.awt.Color(1, 22, 39));
        btnBorrar3.setText("X");
        btnBorrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        btnBorrar4.setBackground(new java.awt.Color(193, 240, 249));
        btnBorrar4.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btnBorrar4.setForeground(new java.awt.Color(1, 22, 39));
        btnBorrar4.setText("X");
        btnBorrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        btnBorrar5.setBackground(new java.awt.Color(193, 240, 249));
        btnBorrar5.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btnBorrar5.setForeground(new java.awt.Color(1, 22, 39));
        btnBorrar5.setText("X");
        btnBorrar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, 30));

        jLabelNombreTabla.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelNombreTabla.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabelNombreTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 16, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
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
    // SE DEBEN CARGAR LOS NOMBRES DE LAS COLUMNAS AL ARRAYLIST QUE ESTA EN LA CLASE TABLA
    // PARA CONDICIONAR DOND SE CREAN HAY QUE ESCOGER PRIMERO EL ESQUEMA DONDE SE CREARAN, ESTO SE HACE LLAMANDO AL CONTROLADOR.GETESQUEMAS().GET(BOXESQUEMAS.GETSELECTIONINDEX()
    // LUEGO SE DEBE OBTENER LA TABLA DEL ARRAYLIST DE MANERA SIMILAR, EL ID DE LAS TABLAS SE SACA DEL MISMO BOX
    // EL ID DE LAS COLUMNAS SE SACA DEL BOX DE LAS TABLAS MAINWINDOW.BOXTABLAS.GETSELECTIONINDEX()
    // SE PUEDE UTILIZAR EL ARRAYLIST TEMPORAL Y ENVIARLO CLONADO AL ARRAYLIST DE LA CLASE TABLA.
    // FIJARSE EN LOS PARAMETROS
    // PORFA CAMBIAR LOS COLORES DE LOS BOX! PORFA PORFA JAJA 
    private void btnNuevaColumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaColumnaActionPerformed
        
        String nombreColumna = txtNombreColumna.getText();
        int idColumna = MainWindow.boxTablas.getSelectedIndex();
        Columna columna = new Columna(nombreColumna, idColumna);
     //   System.out.println(controlador.getEsquemas().get(MainWindow.boxEsquemas.getSelectedIndex()).getTablas().get(MainWindow.boxTablas.getSelectedIndex()).getColumnas().size());
        titulosColumnas.add(columna);
        txtNombreColumna.setText("");
        System.out.println("**Se agrego una columna**");

        //ELIMINAR 
        //Esto no esta funcionando bien aun no logro levantar el jTextField que despliegue el nombre!
        //TextField mostrarColumnas = new TextField(txtNombreColumna.getText(), 20);
        //mostrarColumnas.setVisible(true);
        //jPanel2.add(mostrarColumnas, FlowLayout.CENTER, -1);
        //jPanel1.add(mostrarColumnas, -1, getComponentCount()-1);
        //JButton botonEliminar = new JButton("X");
        // this.jPanel2.add(botonEliminar);
        switch (titulosColumnas.size()) {
            case 1:
                JLabelColum1.setText(titulosColumnas.get(0).getNombre());
                JLabelColum1.setEnabled(true);
                btnBorrar1.setEnabled(true);
                break;
            
            case 2:
                JLabelColum2.setText(titulosColumnas.get(1).getNombre());
                JLabelColum2.setEnabled(true);
                btnBorrar2.setEnabled(true);
                break;
            
            case 3:
                JLabelColum3.setText(titulosColumnas.get(2).getNombre());
                JLabelColum3.setEnabled(true);
                btnBorrar3.setEnabled(true);
                break;
            case 4:
                JLabelColum4.setText(titulosColumnas.get(3).getNombre());
                JLabelColum4.setEnabled(true);
                btnBorrar4.setEnabled(true);
                break;
            case 5:
                JLabelColum5.setText(titulosColumnas.get(4).getNombre());
                JLabelColum5.setEnabled(true);
                btnBorrar5.setEnabled(true);
                break;
        }
        
        for (int i = 0; i < titulosColumnas.size(); i++) {
            System.out.println(titulosColumnas.get(i));
        }
        
        System.out.println(titulosColumnas.size());

    }//GEN-LAST:event_btnNuevaColumnaActionPerformed

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

    //REVISAR COMENTARIOS!!!
    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
//        MainWindow setColumnas = new MainWindow();
//        ArrayList obtenerColumnas = controlador.getTablas().getColumnas();
//        obtenerColumnas = (ArrayList)titulosColumnas.clone(); //Aca CLONAMOS el Array!
//        controlador.getTablas().setColumnas(obtenerColumnas); //Aca lo SETTIAMOS al arraylist de columnas en clase Tabla
//        //System.out.println("CLONE: " + obtenerColumnas.size()); //Descomenta esta linea y la de abajo
//        //System.out.println("CLONE: " + controlador.getTablas().getColumnas().size()); //Y asi corroboramos que ambos valores son IGUALES
//        setColumnas.establecerColumnas(obtenerColumnas); //LLAMAMOS AL METODO!
//        titulosColumnas.clear(); //Limpiamos Array Temporal
//        System.out.println("ArrayReseteado: " + titulosColumnas.size());
//        System.out.println("CLONE: " + controlador.getTablas().getColumnas().size()); //Corroboramos el Clone sigue funcionando!
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
            java.util.logging.Logger.getLogger(NuevaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaTabla().setVisible(true);
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
    public static javax.swing.JLabel jLabelNombreTabla;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtNombreColumna;
    // End of variables declaration//GEN-END:variables
}
