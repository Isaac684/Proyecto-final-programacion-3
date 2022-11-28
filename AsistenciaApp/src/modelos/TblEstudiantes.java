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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author angel
 */
@Entity
@Table(name = "tbl_estudiantes", catalog = "bd_proyecto", schema = "public")
@NamedQueries({
    @NamedQuery(name = "TblEstudiantes.findAll", query = "SELECT t FROM TblEstudiantes t")})
public class TblEstudiantes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "carnetestudiante", nullable = false, length = 7)
    private String carnetestudiante;
    @Column(name = "nombreestudiante", length = 100)
    private String nombreestudiante;
    @JoinColumn(name = "codigocarrera", referencedColumnName = "codigocarrera")
    @ManyToOne
    private TblEspecialidad codigocarrera;
    @OneToMany(mappedBy = "carnetestudiante")
    private Collection<TblAsistencia> tblAsistenciaCollection;

    public TblEstudiantes() {
    }

    public TblEstudiantes(String carnetestudiante) {
        this.carnetestudiante = carnetestudiante;
    }

    public String getCarnetestudiante() {
        return carnetestudiante;
    }

    public void setCarnetestudiante(String carnetestudiante) {
        this.carnetestudiante = carnetestudiante;
    }

    public String getNombreestudiante() {
        return nombreestudiante;
    }

    public void setNombreestudiante(String nombreestudiante) {
        this.nombreestudiante = nombreestudiante;
    }

    public TblEspecialidad getCodigocarrera() {
        return codigocarrera;
    }

    public void setCodigocarrera(TblEspecialidad codigocarrera) {
        this.codigocarrera = codigocarrera;
    }

    public Collection<TblAsistencia> getTblAsistenciaCollection() {
        return tblAsistenciaCollection;
    }

    public void setTblAsistenciaCollection(Collection<TblAsistencia> tblAsistenciaCollection) {
        this.tblAsistenciaCollection = tblAsistenciaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (carnetestudiante != null ? carnetestudiante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEstudiantes)) {
            return false;
        }
        TblEstudiantes other = (TblEstudiantes) object;
        if ((this.carnetestudiante == null && other.carnetestudiante != null) || (this.carnetestudiante != null && !this.carnetestudiante.equals(other.carnetestudiante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelos.TblEstudiantes[ carnetestudiante=" + carnetestudiante + " ]";
    }
    
}
