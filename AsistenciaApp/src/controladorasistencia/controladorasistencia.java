/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorasistencia;

import conexion.conexion;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.TblAsistencia;
import modelos.TblEspecialidad;
import modelos.TblEstudiantes;
/**
 *
 * @author angel
 */
public class controladorasistencia 
{
    private EntityManager entity;
    public controladorasistencia(){
    entity = entityManager();
    }
    
    private EntityManager entityManager(){
    return conexion.getInstancia().getFabrica().createEntityManager();
    }
    
    
    public List<TblAsistencia> getListAsistencia()
    {
    entity.getTransaction().begin();
    return entity.createQuery("SELECT P FROM TblAsistencia P").getResultList();
    }
    
     public void listarasistencia(JTable tabla, String carnet){
     
         DefaultTableModel model;
         String []columnas={"ID","Carnet","Fecha","Asistio","Dia"};
         model= new DefaultTableModel(null,columnas);
         
         List<TblAsistencia> dt= buscarAsistencia(carnet);
         String [] datos= new String[5];
         for(TblAsistencia te: dt){
        TblEstudiantes it= te.getCarnetestudiante();
        datos[0]= te.getIdasistencia()+""; 
        datos[1]= it.getCarnetestudiante()+"";
        datos[2]= te.getFechaasistencia()+"";
        datos[3]=te.getAsistio()+"";
        datos[4]=te.getDiasemana()+"";
         
         model.addRow(datos);
         
         } 
         
         tabla.setModel(model);
     }
     public List<TblAsistencia> buscarAsistencia(String carnet){
     TblAsistencia as;
     EntityManager em= entityManager();
     Query q= em.createQuery("SELECT p FROM TblAsistencia p WHERE p.carnetestudiante like :carnet ");
     q.setParameter("carnet",carnet+"%");
     List<TblAsistencia> lista= q.getResultList();
        
     return lista;
     }
    
}
