/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Back.Esquema;
import Back.Tablas;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author pimie
 */
public class Interfaz extends javax.swing.JFrame {
    
    InterfazNuevaTabla creacionJTable = new InterfazNuevaTabla();

    public Interfaz() {
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
        boxEsquemas = new javax.swing.JComboBox<>();
        txtNombreEsquema = new javax.swing.JTextField();
        BtnNuevoEsquema = new javax.swing.JButton();
        BtnBorrarEsquema = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePrincipal = new javax.swing.JTable();
        BoxColumnas = new javax.swing.JComboBox<>();
        txtDatoBuscar = new javax.swing.JTextField();
        BtnBuscarDato = new javax.swing.JButton();
        BtnBorrarDato = new javax.swing.JButton();
        BtnCargarDatos = new javax.swing.JButton();
        txtBusquedaSql = new javax.swing.JTextField();
        BtnBuscarSql = new javax.swing.JButton();
        boxTablas = new javax.swing.JComboBox<>();
        txtNombreTabla = new javax.swing.JTextField();
        BtnNuevaTabla = new javax.swing.JButton();
        BtnBorrarTabla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        boxEsquemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEsquemasActionPerformed(evt);
            }
        });

        txtNombreEsquema.setText("Ingresa nombre del esquema");
        txtNombreEsquema.setToolTipText("Ingresa nombre del esquema");
        txtNombreEsquema.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombreEsquema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreEsquemaMouseClicked(evt);
            }
        });
        txtNombreEsquema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEsquemaActionPerformed(evt);
            }
        });

        BtnNuevoEsquema.setText("Nuevo Esquema");
        BtnNuevoEsquema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoEsquemaActionPerformed(evt);
            }
        });

        BtnBorrarEsquema.setText("Borrar Esquema");
        BtnBorrarEsquema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarEsquemaActionPerformed(evt);
            }
        });

        jTablePrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePrincipal.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTablePrincipal);
        jTablePrincipal.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        BoxColumnas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        BoxColumnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxColumnasActionPerformed(evt);
            }
        });

        txtDatoBuscar.setText("Ingrese Dato a Buscar");
        txtDatoBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDatoBuscarMouseClicked(evt);
            }
        });

        BtnBuscarDato.setText("Buscar");
        BtnBuscarDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarDatoActionPerformed(evt);
            }
        });

        BtnBorrarDato.setText("Borrar");

        BtnCargarDatos.setText("Cargar Datos");

        txtBusquedaSql.setText("Busqueda SQL");
        txtBusquedaSql.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBusquedaSqlMouseClicked(evt);
            }
        });

        BtnBuscarSql.setText("Buscar");

        boxTablas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boxTablasMouseClicked(evt);
            }
        });
        boxTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTablasActionPerformed(evt);
            }
        });

        txtNombreTabla.setText("Ingresa Nombre de la Tabla");
        txtNombreTabla.setToolTipText("Ingresa Nombre de la Tabla");
        txtNombreTabla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreTablaFocusGained(evt);
            }
        });
        txtNombreTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreTablaMouseClicked(evt);
            }
        });
        txtNombreTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreTablaActionPerformed(evt);
            }
        });

        BtnNuevaTabla.setText("Nueva Tabla");
        BtnNuevaTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevaTablaActionPerformed(evt);
            }
        });

        BtnBorrarTabla.setText("Borrar Tabla");
        BtnBorrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boxEsquemas, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreEsquema, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnNuevoEsquema)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnBorrarEsquema)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBusquedaSql)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BoxColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDatoBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnBuscarDato)
                                .addGap(18, 18, 18)
                                .addComponent(BtnBorrarDato)
                                .addGap(18, 18, 18)
                                .addComponent(BtnCargarDatos))
                            .addComponent(BtnBuscarSql))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(boxTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombreTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnNuevaTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnBorrarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxEsquemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreEsquema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnNuevoEsquema)
                    .addComponent(BtnBorrarEsquema))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnNuevaTabla)
                    .addComponent(BtnBorrarTabla))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoxColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscarDato)
                    .addComponent(BtnBorrarDato)
                    .addComponent(BtnCargarDatos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusquedaSql, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscarSql))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreEsquemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreEsquemaMouseClicked
        txtNombreEsquema.setText(" ");
    }//GEN-LAST:event_txtNombreEsquemaMouseClicked

    private void txtDatoBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDatoBuscarMouseClicked
        txtDatoBuscar.setText(null);
    }//GEN-LAST:event_txtDatoBuscarMouseClicked

    private void txtBusquedaSqlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBusquedaSqlMouseClicked
        txtBusquedaSql.setText(null);
    }//GEN-LAST:event_txtBusquedaSqlMouseClicked

    private void BtnNuevoEsquemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoEsquemaActionPerformed
        if (!" ".equals(txtNombreEsquema.getText())) {
            agregarEsquema();

        } else {
            JOptionPane.showMessageDialog(this, "Por favor digite un nombre");
        }


    }//GEN-LAST:event_BtnNuevoEsquemaActionPerformed

    private void boxEsquemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEsquemasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEsquemasActionPerformed

    private void BtnBorrarEsquemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarEsquemaActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(this, "Seguro desea eliminar un esquema");
        if (JOptionPane.YES_OPTION == confirmacion) {
            borrarEsquema();
            JOptionPane.showMessageDialog(this, " Se ha eliminado el esquema ");
        } else {
            JOptionPane.showMessageDialog(this, " No se ha elimnado nada ");
        }

    }//GEN-LAST:event_BtnBorrarEsquemaActionPerformed

    private void txtNombreTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreTablaMouseClicked
        txtNombreTabla.setText(" ");
    }//GEN-LAST:event_txtNombreTablaMouseClicked

    private void boxTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTablasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTablasActionPerformed

    private void txtNombreEsquemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEsquemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEsquemaActionPerformed

    private void BtnNuevaTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevaTablaActionPerformed
        
        if(!txtNombreTabla.equals("")) {
            agregarTabla();
            creacionJTable.setVisible(true);
        
        } else {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un nombre.");
        }
    }//GEN-LAST:event_BtnNuevaTablaActionPerformed

    private void txtNombreTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreTablaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreTablaActionPerformed

    private void boxTablasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxTablasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTablasMouseClicked

    private void BtnBorrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarTablaActionPerformed
        int mensajeConfirmacion = JOptionPane.showConfirmDialog(this, "Seguro que desea borrar está tabla?");
        if(JOptionPane.YES_OPTION == mensajeConfirmacion) {
            borrarTabla();
            JOptionPane.showMessageDialog(this, "La tabla se ha eliminado correctamente!");
        } 
    }//GEN-LAST:event_BtnBorrarTablaActionPerformed

    private void txtNombreTablaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreTablaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreTablaFocusGained

    private void BoxColumnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxColumnasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxColumnasActionPerformed

    private void BtnBuscarDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarDatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarDatoActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxColumnas;
    private javax.swing.JButton BtnBorrarDato;
    private javax.swing.JButton BtnBorrarEsquema;
    private javax.swing.JButton BtnBorrarTabla;
    private javax.swing.JButton BtnBuscarDato;
    private javax.swing.JButton BtnBuscarSql;
    private javax.swing.JButton BtnCargarDatos;
    private javax.swing.JButton BtnNuevaTabla;
    private javax.swing.JButton BtnNuevoEsquema;
    private javax.swing.JComboBox<String> boxEsquemas;
    private javax.swing.JComboBox<String> boxTablas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePrincipal;
    private javax.swing.JTextField txtBusquedaSql;
    private javax.swing.JTextField txtDatoBuscar;
    private javax.swing.JTextField txtNombreEsquema;
    private javax.swing.JTextField txtNombreTabla;
    // End of variables declaration//GEN-END:variables

    ArrayList<String> esquema = new ArrayList<>();
    ArrayList<Tablas> tablas = new ArrayList<>();
    
    public void agregarEsquema() {
        String name = txtNombreEsquema.getText();

        esquema.add(name);
        boxEsquemas.addItem(name);
        txtNombreEsquema.setText(" ");
        System.out.println(" Se ha guardado el esquema con exito ");

        for (int i = 0; i < esquema.size(); i++) {
            System.out.println(" NOMBRES DE ESQUEMAS CREADO " + esquema.get((i)));

        }

    }

    public void borrarEsquema() {

        esquema.remove(esquema.size() - 1);
        boxEsquemas.removeItemAt(esquema.size());

    }
    
    //Metodos jTable
    public void agregarTabla() {
        
        Tablas tablaX = new Tablas();
        tablaX.setNombre(txtNombreTabla.getText());
        tablas.add(tablaX); 
        boxTablas.addItem(tablaX.getNombre());
        txtNombreTabla.setText("");
        System.out.println("Tabla guardada con exito!");
        
    }
    
    public void borrarTabla() {
        
        tablas.remove(tablas.size() -1);
        boxTablas.removeItemAt(tablas.size());
    }
    
    public void insertarColumnas() {
        
        for(int i = 0; i < creacionJTable.titulosColumnas.size(); i++) {
            //jTablePrincipal.addColumn();
        }
    }
}
