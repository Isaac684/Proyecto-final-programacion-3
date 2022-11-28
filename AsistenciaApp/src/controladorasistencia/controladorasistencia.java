/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorasistencia;

import conexion.conexion;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import modelos.TblAsistencia;
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
    
}
