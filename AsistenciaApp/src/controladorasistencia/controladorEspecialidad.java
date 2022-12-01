/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorasistencia;

import conexion.conexion;
import java.util.List;
import javax.persistence.EntityManager;
import modelos.TblEspecialidad;

/**
 *
 * @author angel
 */
public class controladorEspecialidad {
    
     private EntityManager entity;

    public controladorEspecialidad(){
        entity = entityManager();
    }
     private EntityManager entityManager() {       
        return conexion.getInstancia().getFabrica().createEntityManager();        
    }
     
    
        public void insertarEspecialidad(TblEspecialidad espe) {
        EntityManager en = entityManager();
        en.getTransaction().begin();
        en.persist(espe);
        en.getTransaction().commit();
        en.close();
    }
//    
//    public void editarProveedor(TblProveedor proveedor) {
//        EntityManager en = entityManager();
//        en.getTransaction().begin();
//        TblProveedor proveedor2 = en.find(TblProveedor.class, proveedor.getIdproveedor());
//        proveedor2.setNombreproveedor(proveedor.getNombreproveedor());
//        en.getTransaction().commit();
//        en.close();
//    }
//    
//    public void eliminarProveedor(int idProveedor) {      
//        EntityManager en = entityManager();
//        en.getTransaction().begin();
//        TblProveedor proveedor = en.find(TblProveedor.class, idProveedor);
//        en.remove(en.merge(proveedor));
//        en.getTransaction().commit();
//        en.close();       
//    }
    
    public List<TblEspecialidad> getListEspecialidad() {       
        EntityManager en = entityManager();
        en.getTransaction().begin();
        return en.createQuery("SELECT pro FROM TblEspecialidad pro").getResultList();      
    }
    
    
}
