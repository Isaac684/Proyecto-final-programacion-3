/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorasistencia;

import conexion.conexion;
import java.util.List;
import javax.persistence.EntityManager;
import modelos.TblAsistencia;
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
    
    
    public List<TblEstudiantes> getListEstudiantes()
    {
    entity.getTransaction().begin();
    return entity.createQuery("SELECT P FROM TblEstudiantes P").getResultList();
    }
}
