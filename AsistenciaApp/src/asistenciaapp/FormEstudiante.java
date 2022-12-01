/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package asistenciaapp;

import com.sun.jdi.connect.spi.Connection;
import conexion.conexion;
import controladorasistencia.controladorEspecialidad;
import controladorasistencia.controladorEstudiantes;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.TblEspecialidad;
import modelos.TblEstudiantes;



/**
 *
 * @author ulqui
 */
public class FormEstudiante extends javax.swing.JFrame {

    /**
     * Creates new form FormEstudiante
     */
    public String carnet;
    public TblEspecialidad array[];
    public DefaultTableModel mo;
    public FormEstudiante() {
        initComponents();
         Cargarestudiantes();
         cargardatosEstu();
        /*cboespecialidades.addItem("Ing. en Sistemas");
        cboespecialidades.addItem("Arquitectura");
        cboespecialidades.addItem("Ing. Civil");
        cboespecialidades.addItem("Ing. Industrial");
        cboespecialidades.addItem("Ing. Mecanica");
        cboespecialidades.addItem("Ing. Electrica");
        cboespecialidades.addItem("Ing. Quimica");
        cboespecialidades.addItem("Ing. en Alimentos");*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboespecialidades = new javax.swing.JComboBox<>();
        txtcarnet = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaestu = new javax.swing.JTable();
        btnagregar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        jcAnio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista Estudiantes");

        cboespecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboespecialidadesActionPerformed(evt);
            }
        });

        txtcarnet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcarnetKeyTyped(evt);
            }
        });

        jLabel4.setText("Nombre");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        jLabel6.setText("Carnet");

        jLabel7.setText("Especialidad");

        tablaestu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaestu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaestuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaestu);

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        jcAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1° Año", "2° Año", "3° Año", "4° Año", "5° Año" }));

        jLabel1.setText("Año de curso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboespecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jcAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addComponent(btnagregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnactualizar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboespecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnactualizar)
                    .addComponent(btnagregar)
                    .addComponent(jcAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboespecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboespecialidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboespecialidadesActionPerformed

    private void txtcarnetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcarnetKeyTyped
        // TODO add your handling code here:
        //char c= evt.getKeyChar();
        //if (c<'0' || c>'9') evt.consume();
        //else if ((c<'a' || c>'z') && !(c<'A' || c>'Z')) evt.consume();
    }//GEN-LAST:event_txtcarnetKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        // TODO add your handling code here:
//        char c= evt.getKeyChar();
//        if ((c<'a' || c>'z') && (c<'A' || c>'Z')) evt.consume();
    }//GEN-LAST:event_txtnombreKeyTyped

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
     
        if (!"".equals(txtnombre.getText()) && !"".equals(txtcarnet.getText())) {
            String anio = jcAnio.getSelectedItem().toString();
        FormAsistencia formAsistencia = new FormAsistencia();
        TblEstudiantes es = new TblEstudiantes();
        es.setNombreestudiante(txtnombre.getText());
        es.setCarnetestudiante(txtcarnet.getText());
        es.setAnio_carrera(anio);
        es.setCodigocarrera(array[cboespecialidades.getSelectedIndex()]);
        
        
//       es.setCodigocarrera((TblEspecialidad)cboespecialidades.getSelectedItem());
        
        
//        productoInsert.setIdproveedor((TblProveedor)jCmbProveedor.getSelectedItem());
        
       controladorEstudiantes cr = new controladorEstudiantes();
        cr.insertarEstudiantes(es);
        mo=cargardatosEstu();
        formAsistencia.cargardatos();
        formAsistencia.cargardatosEstu();   
        }else
        {
            JOptionPane.showMessageDialog(null, "Llene todos los campos!");
        }        
    }//GEN-LAST:event_btnagregarActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        cargardatosEstu();
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void tablaestuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaestuMouseClicked
        // TODO add your handling code here:
        carnet = tablaestu.getValueAt(tablaestu.getSelectedRow(), tablaestu.getSelectedColumn()).toString();
    }//GEN-LAST:event_tablaestuMouseClicked

   
  
   //METODO PARA CARGAR ESPECIALIDADES EN  UN CBOX
    
     public void Cargarestudiantes(){
         int i = 0;
        controladorEspecialidad controlador = new controladorEspecialidad();
        List<TblEspecialidad> lista = controlador.getListEspecialidad();
        array = new TblEspecialidad[lista.size()];
       for (TblEspecialidad item : lista){
            cboespecialidades.addItem(item.getNombrecarrera());
            array[i] = item;
            i++;
    }
        }
     
     
     //METODO PARA CARGAR ESTUDIANTES
    public DefaultTableModel cargardatosEstu(){
    
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("Nombre");
    modelo.addColumn("Carnet");
    modelo.addColumn("Carrera");
    modelo.addColumn("Año carrera");
    tablaestu.setModel(modelo);
    controladorEstudiantes ca=new controladorEstudiantes();
    List<TblEstudiantes> list = ca.getListEstudiantes();
    String estudiantes[] = new String[4];
    
    for(TblEstudiantes item : list){
        TblEspecialidad itemes = item.getCodigocarrera();
        estudiantes[0] = item.getNombreestudiante();
        estudiantes[1] = item.getCarnetestudiante();
        estudiantes[2] = itemes.getNombrecarrera();
        estudiantes[3] = item.getAnio_carrera();
        modelo.addRow(estudiantes);
    }
   
    tablaestu.setModel(modelo);
    
    return modelo;
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
            java.util.logging.Logger.getLogger(FormEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JComboBox<String> cboespecialidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcAnio;
    private javax.swing.JTable tablaestu;
    private javax.swing.JTextField txtcarnet;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
