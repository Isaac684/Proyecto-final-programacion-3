/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorasistencia;

import conexion.conexion;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.TblAsistencia;
import modelos.TblEspecialidad;
import modelos.TblEstudiantes;

/**
 *
 * @author Diego
 */
public class controladorEstudiantes {
    private EntityManager entity;
    public controladorEstudiantes(){
    entity = entityManager();
    }
    
    private EntityManager entityManager(){
    return conexion.getInstancia().getFabrica().createEntityManager();
    }
    
    
    //METODO PARA INSERTAR DATOS
      public void insertarEstudiantes(TblEstudiantes estu) {
        entity.getTransaction().begin();
        entity.persist(estu);
        entity.getTransaction().commit();
        entity.close();
    }
    
      //CREAMOS LISTA PARA ESTUDIANTES
    public List<TblEstudiantes> getListEstudiantes()
    {
    entity.getTransaction().begin();
    return entity.createQuery("SELECT P FROM TblEstudiantes P").getResultList();
    }
     public TblEstudiantes getEstudiantes(int id){
        entity.getTransaction().begin();
        TblEstudiantes pro = entity.find(TblEstudiantes.class, id);
        entity.close();
        
        return pro;
}
     
//CREAMOS UNA LISTA PARA BUSCAR ESTUDIANTES
     public List<TblEstudiantes> buscarEstudiantes(String nombres){
     TblEstudiantes es;
     EntityManager em= entityManager();
     Query qy= em.createQuery("SELECT p FROM TblEstudiantes p WHERE p.nombreestudiante like :nombres  ");
     qy.setParameter("nombres",nombres+"%");
     List<TblEstudiantes> lista= qy.getResultList();
        
     return lista;
     }
     
     
     
     //METODO PUBLICO PARA ELIMINAR UN ESTUDIANTE
     public void eliminarDato(String carnet)
     {
         if (carnet != null) {
          
             try{
             
               EntityManager em = entityManager();
            em.getTransaction().begin();
            Query qy= em.createQuery("DELETE FROM TblEstudiantes p WHERE p.carnetestudiante = :carnet");
            qy.setParameter("carnet",carnet);
            int rowsDeleted = qy.executeUpdate();
            em.getTransaction().commit();
            em.close();
            if (rowsDeleted != 0) {
               JOptionPane.showMessageDialog(null, "Se elimino el registro seleccionado");
            }else
            {
               JOptionPane.showMessageDialog(null, "Seleccione la columna correcta");
            }
             
             }catch(Exception e){
             
             JOptionPane.showMessageDialog(null, "No se puede eliminar ya que el estudiante esta registrado que asistio a un Evento");
             
             }
         }
}
}
