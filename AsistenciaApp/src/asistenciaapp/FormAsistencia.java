/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package asistenciaapp;

import controladorasistencia.controladorEstudiantes;
import controladorasistencia.controladorasistencia;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import javax.swing.JTable;
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
    public TblEstudiantes ais2[];
     public DefaultTableModel m;
     FormEstudiante abrirFormEstudiante = new FormEstudiante();
     public Date fecha = new Date();
     public String carnet;
     public int id;
     public DefaultTableModel modelosP;
    public FormAsistencia() {
        initComponents();
        txtFecha.setText("Fecha: "+ new SimpleDateFormat("dd-MM-yyyy").format(fecha));
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
        txtBusquedaEstudiante = new javax.swing.JTextField();
        txtagregarestudiante = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtBusquedaAsistencia = new javax.swing.JTextField();
        jButtonAsistio = new javax.swing.JRadioButton();
        jRadioAusente = new javax.swing.JRadioButton();
        btnGuardarAsistencia = new javax.swing.JToggleButton();
        btnBuscarAsistencia = new javax.swing.JToggleButton();
        txtFecha = new javax.swing.JLabel();
        jcEvento = new javax.swing.JComboBox<>();

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asistenciaapp/resources/imgs/Logo (1).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
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

        btnbuscar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asistenciaapp/resources/imgs/iconmonstr-magnifier-lined-240.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.setPreferredSize(new java.awt.Dimension(140, 55));

        btnactualizar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        btnactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asistenciaapp/resources/imgs/iconmonstr-restore-lined-240.png"))); // NOI18N
        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btneliminar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asistenciaapp/resources/imgs/iconmonstr-trash-can-filled-240.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.setMaximumSize(new java.awt.Dimension(140, 55));
        btneliminar.setPreferredSize(new java.awt.Dimension(140, 55));

        txtBusquedaEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaEstudianteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaEstudianteKeyTyped(evt);
            }
        });

        txtagregarestudiante.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtagregarestudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asistenciaapp/resources/imgs/iconmonstr-friend-1-240.png"))); // NOI18N
        txtagregarestudiante.setText("Agregar Estudiante");
        txtagregarestudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtagregarestudiante.setFocusPainted(false);
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
                .addComponent(txtBusquedaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtagregarestudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnactualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusquedaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtagregarestudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

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

        btnGuardarAsistencia.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        btnGuardarAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asistenciaapp/resources/imgs/iconmonstr-window-plus-filled-240.png"))); // NOI18N
        btnGuardarAsistencia.setText("Guardar asistencia");
        btnGuardarAsistencia.setPreferredSize(new java.awt.Dimension(140, 55));
        btnGuardarAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAsistenciaActionPerformed(evt);
            }
        });

        btnBuscarAsistencia.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        btnBuscarAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asistenciaapp/resources/imgs/iconmonstr-magnifier-lined-240.png"))); // NOI18N
        btnBuscarAsistencia.setText("Buscar");
        btnBuscarAsistencia.setMaximumSize(new java.awt.Dimension(124, 22));
        btnBuscarAsistencia.setMinimumSize(new java.awt.Dimension(124, 22));
        btnBuscarAsistencia.setPreferredSize(new java.awt.Dimension(140, 55));
        btnBuscarAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAsistenciaActionPerformed(evt);
            }
        });

        txtFecha.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtFecha.setText("Fecha");

        jcEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Taller", "Ponencia" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGuardarAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtBusquedaAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonAsistio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jRadioAusente, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtFecha)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusquedaAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
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
        id = dtasistencia.getRowCount()-1;
        carnet = jTable1.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn()).toString();  
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtBusquedaEstudianteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaEstudianteKeyReleased
       
        buscar(txtBusquedaEstudiante.getText());
        
    }//GEN-LAST:event_txtBusquedaEstudianteKeyReleased

    private void txtBusquedaAsistenciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaAsistenciaKeyReleased
        buscarasistencia(txtBusquedaAsistencia.getText());
    }//GEN-LAST:event_txtBusquedaAsistenciaKeyReleased

    private void btnGuardarAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAsistenciaActionPerformed
        // TODO add your handling code here:
        boolean asistioa = true;
        if(jButtonAsistio.isSelected()){
            asistioa = true;
            jcEvento.setEnabled(asistioa);
        }else if(jRadioAusente.isSelected()){
            asistioa = false;
            jcEvento.setEnabled(asistioa);
        }
        TblAsistencia asis = new TblAsistencia();
        asis.setIdasistencia(id);
        
        asis.setCarnetestudiante(ais2[jTable1.getSelectedRow()]);
       
        asis.setFechaasistencia(fecha);
        asis.setAsistio(asistioa);
        asis.setEvento(jcEvento.getSelectedItem().toString());
        
        Calendar calendario = Calendar.getInstance();
        int dia  = calendario.get(Calendar.DAY_OF_WEEK);
        asis.setDiasemana(diaSemana(dia));
        controladorasistencia cn = new controladorasistencia();
        cn.insertarAsistencia(asis);
        cargardatos();
    }//GEN-LAST:event_btnGuardarAsistenciaActionPerformed

    
     public void buscar(String nombres){
    
         listar(nombres);
        
        
        
    
    }
          public void listar(String nombres){
     
         DefaultTableModel model;
         controladorEstudiantes cn = new controladorEstudiantes();
         String []columnas={"Carnet","Nombre","Especialidad"};
         model= new DefaultTableModel(null,columnas);
         
         List<TblEstudiantes> dt= cn.buscarEstudiantes(nombres);
         String [] datos= new String[3];
         for(TblEstudiantes te: dt){
         
        TblEspecialidad itemes = te.getCodigocarrera();
        datos[1]= te.getNombreestudiante()+""; 
        datos[0]= te.getCarnetestudiante()+"";
        datos[2]= itemes.getNombrecarrera()+"";
         
         model.addRow(datos);
         
         } 
         
         jTable1.setModel(model);
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
    modelo.addColumn("Evento");
    dtasistencia.setModel(modelo);
    controladorasistencia ca=new controladorasistencia();
    List<TblAsistencia> list = ca.getListAsistencia();
    String asistencia[] = new String[6];
    
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
        asistencia[5] = item.getEvento();
        modelo.addRow(asistencia);
    }
    dtasistencia.setModel(modelo);
    }
    public void cargardatosEstu(){
    DefaultTableModel modelo= new DefaultTableModel();
    int i = 0;
    modelo.addColumn("Carnet");
    modelo.addColumn("Nombre");
    modelo.addColumn("Carrera");

    controladorEstudiantes ca=new controladorEstudiantes();
    List<TblEstudiantes> list = ca.getListEstudiantes();
    ais2 = new TblEstudiantes[list.size()];
    String estudi[] = new String[3];
    for(TblEstudiantes item : list){
        TblEspecialidad itemes = item.getCodigocarrera();
        estudi[0] = item.getCarnetestudiante();
        estudi[1]= item.getNombreestudiante();
        estudi[2] = itemes.getNombrecarrera();
        ais2[i] = item;
        i++;
        modelo.addRow(estudi);
    }
    
    if(m!= null){
    
    jTable1.setModel(m);
    }else{
    
     jTable1.setModel(modelo);
    }
    

    }
    public String diaSemana(int dia){
        if(dia == 5){
           return "Jueves"; 
        }else if(dia ==6){
            return "Viernes"; 
        }else if(dia==7){
            return "Sabado"; 
        }else if(dia == 1){
            return "Domingo"; 
        }else if(dia == 2){
            return "Lunes"; 
        }else if(dia == 3){
            return "Martes"; 
        }else if(dia == 4){
            return "Miercoles"; 
        }
        return ""; 
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioAusente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcEvento;
    private javax.swing.JTextField txtBusquedaAsistencia;
    private javax.swing.JTextField txtBusquedaEstudiante;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JButton txtagregarestudiante;
    // End of variables declaration//GEN-END:variables
}
