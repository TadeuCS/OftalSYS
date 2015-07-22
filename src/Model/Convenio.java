/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "convenio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Convenio.findAll", query = "SELECT c FROM Convenio c"),
    @NamedQuery(name = "Convenio.findByCodconvenio", query = "SELECT c FROM Convenio c WHERE c.codconvenio = :codconvenio"),
    @NamedQuery(name = "Convenio.findByDescricao", query = "SELECT c FROM Convenio c WHERE c.descricao = :descricao")})
public class Convenio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODCONVENIO")
    private Integer codconvenio;
    @Column(name = "DESCRICAO",unique = true,nullable = false,length = 255)
    private String descricao;
    @OneToMany(mappedBy = "codconvenio")
    private List<Paciente> pacienteList;

    public Convenio() {
    }

    public Convenio(Integer codconvenio) {
        this.codconvenio = codconvenio;
    }

    public Convenio(Integer codconvenio, String descricao) {
        this.codconvenio = codconvenio;
        this.descricao = descricao;
    }

    public Integer getCodconvenio() {
        return codconvenio;
    }

    public void setCodconvenio(Integer codconvenio) {
        this.codconvenio = codconvenio;
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
        hash += (codconvenio != null ? codconvenio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Convenio)) {
            return false;
        }
        Convenio other = (Convenio) object;
        if ((this.codconvenio == null && other.codconvenio != null) || (this.codconvenio != null && !this.codconvenio.equals(other.codconvenio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Convenio[ codconvenio=" + codconvenio + " ]";
    }
    
}
