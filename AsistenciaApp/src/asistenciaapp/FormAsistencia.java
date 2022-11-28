/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package asistenciaapp;

import controladorasistencia.controladorEstudiantes;
import controladorasistencia.controladorasistencia;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import modelos.TblAsistencia;
import modelos.TblEspecialidad;
import modelos.TblEstudiantes;

/**
 *
 * @author ulqui
 */
public class FormAsistencia extends javax.swing.JFrame {

    /**
     * Creates new form FormAsistencia
     */
     public DefaultTableModel m;
     FormEstudiante abrirFormEstudiante = new FormEstudiante();
    public FormAsistencia() {
        initComponents();
        cargardatos();
        cargardatosEstu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSeleccion = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        dtasistencia = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnbuscar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtBusquedaEstudiante = new javax.swing.JTextField();
        txtagregarestudiante = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtBusquedaAsistencia = new javax.swing.JTextField();
        jButtonAsistio = new javax.swing.JRadioButton();
        jRadioAusente = new javax.swing.JRadioButton();
        btnGuardarAsistencia = new javax.swing.JToggleButton();
        btnBuscarAsistencia = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        dtasistencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        dtasistencia.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        dtasistencia.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        dtasistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dtasistenciaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dtasistencia);

        jLabel1.setText("Logo");

        jLabel2.setText("TABLA DE ASISTENCIAS - SEMANA DE SISTEMAS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        btnbuscar.setText("Buscar");

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");

        jLabel8.setText("Busqueda de estudiante");

        txtBusquedaEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaEstudianteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaEstudianteKeyTyped(evt);
            }
        });

        txtagregarestudiante.setText("Agregar Estudiante");
        txtagregarestudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtagregarestudianteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(360, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnbuscar)
                        .addGap(58, 58, 58)
                        .addComponent(btnactualizar)
                        .addGap(74, 74, 74)
                        .addComponent(btneliminar))
                    .addComponent(txtBusquedaEstudiante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtagregarestudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusquedaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtagregarestudiante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar)
                    .addComponent(btnactualizar)
                    .addComponent(btneliminar))
                .addContainerGap())
        );

        jLabel9.setText("Busqueda de asistencia");

        txtBusquedaAsistencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaAsistenciaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaAsistenciaKeyTyped(evt);
            }
        });

        grupoSeleccion.add(jButtonAsistio);
        jButtonAsistio.setText("Asistio");

        grupoSeleccion.add(jRadioAusente);
        jRadioAusente.setText("Ausente");

        btnGuardarAsistencia.setText("Guardar asistencia");

        btnBuscarAsistencia.setText("Buscar");
        btnBuscarAsistencia.setMaximumSize(new java.awt.Dimension(124, 22));
        btnBuscarAsistencia.setMinimumSize(new java.awt.Dimension(124, 22));
        btnBuscarAsistencia.setPreferredSize(new java.awt.Dimension(124, 22));
        btnBuscarAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAsistenciaActionPerformed(evt);
            }
        });

        jLabel10.setText("Dia que asistio");

        txtFecha.setText("Fecha//////");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGuardarAsistencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBusquedaAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButtonAsistio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jRadioAusente, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusquedaAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarAsistencia)
                    .addComponent(btnBuscarAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAsistio)
                    .addComponent(jRadioAusente))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBusquedaAsistenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaAsistenciaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaAsistenciaKeyTyped

    private void btnBuscarAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAsistenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarAsistenciaActionPerformed

    private void txtagregarestudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtagregarestudianteActionPerformed
        // TODO add your handling code here:
        
        abrirFormEstudiante.setVisible(true);
        abrirFormEstudiante.setLocationRelativeTo(null);
        m=abrirFormEstudiante.mo;
    }//GEN-LAST:event_txtagregarestudianteActionPerformed

    private void txtBusquedaEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaEstudianteKeyTyped
        // TODO add your handling code here:
        //char c= evt.getKeyChar();
        //if ((c<'a' || c>'z') && (c<'A' || c>'Z')) evt.consume();
    }//GEN-LAST:event_txtBusquedaEstudianteKeyTyped

    private void dtasistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dtasistenciaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_dtasistenciaMouseClicked

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        cargardatosEstu();
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtBusquedaEstudianteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaEstudianteKeyReleased
       
        buscar(txtBusquedaEstudiante.getText());
        
    }//GEN-LAST:event_txtBusquedaEstudianteKeyReleased

    private void txtBusquedaAsistenciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaAsistenciaKeyReleased
        buscarasistencia(txtBusquedaAsistencia.getText());
    }//GEN-LAST:event_txtBusquedaAsistenciaKeyReleased

    
     public void buscar(String nombres){
    
    controladorEstudiantes cr= new  controladorEstudiantes();
    
    cr.listar(jTable1, nombres);
    
    }
      public void buscarasistencia(String carnet){
    
    controladorasistencia cr= new  controladorasistencia();
    
    cr.listarasistencia(dtasistencia, carnet);
    
    }
    
    
    public void cargardatos(){
    
    DefaultTableModel modelo= new DefaultTableModel();
    
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    modelo.addColumn("ID");
    modelo.addColumn("Carnet");
    modelo.addColumn("Fecha");
    modelo.addColumn("Asistio");
    modelo.addColumn("Dia");
    dtasistencia.setModel(modelo);
    controladorasistencia ca=new controladorasistencia();
    List<TblAsistencia> list = ca.getListAsistencia();
    String asistencia[] = new String[5];
    
    for(TblAsistencia item : list){
        String AsitioString;
        String fecha;
        fecha = format.format(item.getFechaasistencia());
        TblEstudiantes itemAsis = item.getCarnetestudiante();
        TblEspecialidad itemes = itemAsis.getCodigocarrera();
        if(item.getAsistio()){
            AsitioString = "Si";
        } else {
            AsitioString = "No";
        }
        asistencia[0]= item.getIdasistencia().toString();
        asistencia[1]= itemAsis.getCarnetestudiante();
        asistencia[2]= fecha;
        asistencia[3] = AsitioString;
        asistencia[4] = item.getDiasemana();
        modelo.addRow(asistencia);
    }
    dtasistencia.setModel(modelo);
    }
    public void cargardatosEstu(){
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("Carnet");
    modelo.addColumn("Nombre");
    modelo.addColumn("Carrera");

    controladorEstudiantes ca=new controladorEstudiantes();
    List<TblEstudiantes> list = ca.getListEstudiantes();
    String estudi[] = new String[3];
    for(TblEstudiantes item : list){
        TblEspecialidad itemes = item.getCodigocarrera();
        estudi[0] = item.getCarnetestudiante();
        estudi[1]= item.getNombreestudiante();
        estudi[2] = itemes.getNombrecarrera();
        modelo.addRow(estudi);
    }
    
    if(m!= null){
    
    jTable1.setModel(m);
    }else{
    
     jTable1.setModel(modelo);
    }
    

    }
    

    
    
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
            java.util.logging.Logger.getLogger(FormAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAsistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBuscarAsistencia;
    private javax.swing.JToggleButton btnGuardarAsistencia;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JTable dtasistencia;
    private javax.swing.ButtonGroup grupoSeleccion;
    private javax.swing.JRadioButton jButtonAsistio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioAusente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBusquedaAsistencia;
    private javax.swing.JTextField txtBusquedaEstudiante;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JButton txtagregarestudiante;
    // End of variables declaration//GEN-END:variables
}
