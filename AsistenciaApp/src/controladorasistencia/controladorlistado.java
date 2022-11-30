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
import modelos.TblEstudiantes;

/**
 *
 * @author angel
 */
public class controladorlistado 
{
    
    private EntityManager entity;
    public controladorlistado(){
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
  public List<TblAsistencia> buscarPorParametro(String seleccion)
     {
         //SELECT c.capital FROM Country AS c WHERE c.name = :name
         EntityManager em= entityManager();
        Query query = em.createQuery("SELECT c FROM TblAsistencia AS c WHERE c.evento = :seleccion");
        query.setParameter("seleccion",seleccion);
        List<TblAsistencia> results = query.getResultList();
        return results;
     }
    
    
}
