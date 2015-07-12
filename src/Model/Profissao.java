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
@Table(name = "profissao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profissao.findAll", query = "SELECT p FROM Profissao p"),
    @NamedQuery(name = "Profissao.findByCodprofissao", query = "SELECT p FROM Profissao p WHERE p.codprofissao = :codprofissao"),
    @NamedQuery(name = "Profissao.findByDescricao", query = "SELECT p FROM Profissao p WHERE p.descricao = :descricao")})
public class Profissao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODPROFISSAO")
    private Integer codprofissao;
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;
    @OneToMany(mappedBy = "codprofissao")
    private List<Paciente> pacienteList;

    public Profissao() {
    }

    public Profissao(Integer codprofissao) {
        this.codprofissao = codprofissao;
    }

    public Profissao(Integer codprofissao, String descricao) {
        this.codprofissao = codprofissao;
        this.descricao = descricao;
    }

    public Integer getCodprofissao() {
        return codprofissao;
    }

    public void setCodprofissao(Integer codprofissao) {
        this.codprofissao = codprofissao;
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
        hash += (codprofissao != null ? codprofissao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profissao)) {
            return false;
        }
        Profissao other = (Profissao) object;
        if ((this.codprofissao == null && other.codprofissao != null) || (this.codprofissao != null && !this.codprofissao.equals(other.codprofissao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Profissao[ codprofissao=" + codprofissao + " ]";
    }
    
}
