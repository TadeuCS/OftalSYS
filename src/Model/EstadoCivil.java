/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Tadeu
 */
@Entity
@Table(name = "estado_civil")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoCivil.findAll", query = "SELECT e FROM EstadoCivil e"),
    @NamedQuery(name = "EstadoCivil.findByCodestadoCivil", query = "SELECT e FROM EstadoCivil e WHERE e.codestadoCivil = :codestadoCivil"),
    @NamedQuery(name = "EstadoCivil.findByDescricao", query = "SELECT e FROM EstadoCivil e WHERE e.descricao = :descricao")})
public class EstadoCivil implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODESTADO_CIVIL")
    private Integer codestadoCivil;
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codestadoCivil")
    private List<Paciente> pacienteList;

    public EstadoCivil() {
    }

    public EstadoCivil(Integer codestadoCivil) {
        this.codestadoCivil = codestadoCivil;
    }

    public EstadoCivil(Integer codestadoCivil, String descricao) {
        this.codestadoCivil = codestadoCivil;
        this.descricao = descricao;
    }

    public Integer getCodestadoCivil() {
        return codestadoCivil;
    }

    public void setCodestadoCivil(Integer codestadoCivil) {
        this.codestadoCivil = codestadoCivil;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public List<Paciente> getPacienteList() {
        return pacienteList;
    }

    public void setPacienteList(List<Paciente> pacienteList) {
        this.pacienteList = pacienteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codestadoCivil != null ? codestadoCivil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoCivil)) {
            return false;
        }
        EstadoCivil other = (EstadoCivil) object;
        if ((this.codestadoCivil == null && other.codestadoCivil != null) || (this.codestadoCivil != null && !this.codestadoCivil.equals(other.codestadoCivil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.EstadoCivil[ codestadoCivil=" + codestadoCivil + " ]";
    }
    
}
