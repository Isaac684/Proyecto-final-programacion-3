/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Aizaac
 */
@Entity
@Table(name = "tbl_especialidad", catalog = "bd_proyecto", schema = "public")
@NamedQueries({
    @NamedQuery(name = "TblEspecialidad.findAll", query = "SELECT t FROM TblEspecialidad t")})
public class TblEspecialidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigocarrera", nullable = false, length = 6)
    private String codigocarrera;
    @Column(name = "nombrecarrera", length = 100)
    private String nombrecarrera;
    @OneToMany(mappedBy = "codigocarrera")
    private Collection<TblEstudiantes> tblEstudiantesCollection;

    public TblEspecialidad() {
    }

    public TblEspecialidad(String codigocarrera) {
        this.codigocarrera = codigocarrera;
    }

    public String getCodigocarrera() {
        return codigocarrera;
    }

    public void setCodigocarrera(String codigocarrera) {
        this.codigocarrera = codigocarrera;
    }

    public String getNombrecarrera() {
        return nombrecarrera;
    }

    public void setNombrecarrera(String nombrecarrera) {
        this.nombrecarrera = nombrecarrera;
    }

    public Collection<TblEstudiantes> getTblEstudiantesCollection() {
        return tblEstudiantesCollection;
    }

    public void setTblEstudiantesCollection(Collection<TblEstudiantes> tblEstudiantesCollection) {
        this.tblEstudiantesCollection = tblEstudiantesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigocarrera != null ? codigocarrera.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEspecialidad)) {
            return false;
        }
        TblEspecialidad other = (TblEspecialidad) object;
        if ((this.codigocarrera == null && other.codigocarrera != null) || (this.codigocarrera != null && !this.codigocarrera.equals(other.codigocarrera))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelos.TblEspecialidad[ codigocarrera=" + codigocarrera + " ]";
    }
    
}
