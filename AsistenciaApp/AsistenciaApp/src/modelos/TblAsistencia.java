/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author angel
 */
@Entity
@Table(name = "tbl_asistencia", catalog = "bd_proyecto", schema = "public")
@NamedQueries({
    @NamedQuery(name = "TblAsistencia.findAll", query = "SELECT t FROM TblAsistencia t")})
public class TblAsistencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idasistencia", nullable = false)
    private Integer idasistencia;
    @Column(name = "fechaasistencia")
    @Temporal(TemporalType.DATE)
    private Date fechaasistencia;
    @Column(name = "asistio")
    private Boolean asistio;
    @Column(name = "diasemana", length = 10)
    private String diasemana;
    @JoinColumn(name = "carnetestudiante", referencedColumnName = "carnetestudiante")
    @ManyToOne
    private TblEstudiantes carnetestudiante;

    public TblAsistencia() {
    }

    public TblAsistencia(Integer idasistencia) {
        this.idasistencia = idasistencia;
    }

    public Integer getIdasistencia() {
        return idasistencia;
    }

    public void setIdasistencia(Integer idasistencia) {
        this.idasistencia = idasistencia;
    }

    public Date getFechaasistencia() {
        return fechaasistencia;
    }

    public void setFechaasistencia(Date fechaasistencia) {
        this.fechaasistencia = fechaasistencia;
    }

    public Boolean getAsistio() {
        return asistio;
    }

    public void setAsistio(Boolean asistio) {
        this.asistio = asistio;
    }

    public String getDiasemana() {
        return diasemana;
    }

    public void setDiasemana(String diasemana) {
        this.diasemana = diasemana;
    }

    public TblEstudiantes getCarnetestudiante() {
        return carnetestudiante;
    }

    public void setCarnetestudiante(TblEstudiantes carnetestudiante) {
        this.carnetestudiante = carnetestudiante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idasistencia != null ? idasistencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblAsistencia)) {
            return false;
        }
        TblAsistencia other = (TblAsistencia) object;
        if ((this.idasistencia == null && other.idasistencia != null) || (this.idasistencia != null && !this.idasistencia.equals(other.idasistencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelos.TblAsistencia[ idasistencia=" + idasistencia + " ]";
    }
    
}
