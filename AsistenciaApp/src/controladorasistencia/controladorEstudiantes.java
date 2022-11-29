/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorasistencia;

import conexion.conexion;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
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
    
      public void insertarEstudiantes(TblEstudiantes estu) {
        entity.getTransaction().begin();
        entity.persist(estu);
        entity.getTransaction().commit();
        entity.close();
    }
    
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
     

     public List<TblEstudiantes> buscarEstudiantes(String nombres){
     TblEstudiantes es;
     EntityManager em= entityManager();
     Query qy= em.createQuery("SELECT p FROM TblEstudiantes p WHERE p.nombreestudiante like :nombres  ");
     qy.setParameter("nombres",nombres+"%");
     List<TblEstudiantes> lista= qy.getResultList();
        
     return lista;
     }
     
     
}
