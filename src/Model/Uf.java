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
@Table(name = "uf")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Uf.findAll", query = "SELECT u FROM Uf u"),
    @NamedQuery(name = "Uf.findByCodestado", query = "SELECT u FROM Uf u WHERE u.codestado = :codestado"),
    @NamedQuery(name = "Uf.findBySigla", query = "SELECT u FROM Uf u WHERE u.sigla = :sigla")})
public class Uf implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODESTADO")
    private Integer codestado;
    @Column(name = "SIGLA",unique = true,length = 2)
    private String sigla;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codestado")
    private List<Cidade> cidadeList;

    public Uf() {
    }

    public Uf(Integer codestado) {
        this.codestado = codestado;
    }

    public Uf(Integer codestado, String sigla) {
        this.codestado = codestado;
        this.sigla = sigla;
    }

    public Integer getCodestado() {
        return codestado;
    }

    public void setCodestado(Integer codestado) {
        this.codestado = codestado;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @XmlTransient
    public List<Cidade> getCidadeList() {
        return cidadeList;
    }

    public void setCidadeList(List<Cidade> cidadeList) {
        this.cidadeList = cidadeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codestado != null ? codestado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Uf)) {
            return false;
        }
        Uf other = (Uf) object;
        if ((this.codestado == null && other.codestado != null) || (this.codestado != null && !this.codestado.equals(other.codestado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Uf[ codestado=" + codestado + " ]";
    }
    
}
