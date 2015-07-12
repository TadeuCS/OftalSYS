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
@Table(name = "cor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cor.findAll", query = "SELECT c FROM Cor c"),
    @NamedQuery(name = "Cor.findByCodcor", query = "SELECT c FROM Cor c WHERE c.codcor = :codcor"),
    @NamedQuery(name = "Cor.findByDescricao", query = "SELECT c FROM Cor c WHERE c.descricao = :descricao")})
public class Cor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODCOR")
    private Integer codcor;
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codcor")
    private List<Paciente> pacienteList;

    public Cor() {
    }

    public Cor(Integer codcor) {
        this.codcor = codcor;
    }

    public Cor(Integer codcor, String descricao) {
        this.codcor = codcor;
        this.descricao = descricao;
    }

    public Integer getCodcor() {
        return codcor;
    }

    public void setCodcor(Integer codcor) {
        this.codcor = codcor;
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
        hash += (codcor != null ? codcor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cor)) {
            return false;
        }
        Cor other = (Cor) object;
        if ((this.codcor == null && other.codcor != null) || (this.codcor != null && !this.codcor.equals(other.codcor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Cor[ codcor=" + codcor + " ]";
    }
    
}
