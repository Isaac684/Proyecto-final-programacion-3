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
    
    
    
    //PARA SELECCIONAR LOS DATOS DE LA ASISTENCIA
    public List<TblAsistencia> getListAsistencia()
    {
    entity.getTransaction().begin();
    return entity.createQuery("SELECT P FROM TblAsistencia P").getResultList();
    }
    
    
    //LISTAMOS LOS DATOS DE ASISTENCIA
    
   
     
     
     
     
     //CREAMOS UN LA LISTA PARA BUSCAR LA ASISTENCIA
   
     
     public List<TblAsistencia> buscarPorAsistencia(String busqueda)
     {
         //SELECT c.capital FROM Country AS c WHERE c.name = :name
         EntityManager em= entityManager();
        Query query = em.createQuery("SELECT c FROM TblAsistencia AS c WHERE c.carnetestudiante LIKE :busqueda");
        query.setParameter("busqueda",busqueda);
        List<TblAsistencia> results = query.getResultList();
        return results;
     }
     
     
     public void insertarAsistencia(TblAsistencia asis){
         entity.getTransaction().begin();
        entity.persist(asis);
        entity.getTransaction().commit();
        entity.close();
     }
    
}
