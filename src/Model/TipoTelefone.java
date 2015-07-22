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
@Table(name = "tipo_telefone")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoTelefone.findAll", query = "SELECT t FROM TipoTelefone t"),
    @NamedQuery(name = "TipoTelefone.findByCodtipoTelefone", query = "SELECT t FROM TipoTelefone t WHERE t.codtipoTelefone = :codtipoTelefone"),
    @NamedQuery(name = "TipoTelefone.findByDescricao", query = "SELECT t FROM TipoTelefone t WHERE t.descricao = :descricao")})
public class TipoTelefone implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODTIPO_TELEFONE")
    private Integer codtipoTelefone;
    @Column(name = "DESCRICAO",nullable = false,unique = true,length = 100)
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codtipoTelefone")
    private List<Telefone> telefoneList;

    public TipoTelefone() {
    }

    public TipoTelefone(Integer codtipoTelefone) {
        this.codtipoTelefone = codtipoTelefone;
    }

    public TipoTelefone(Integer codtipoTelefone, String descricao) {
        this.codtipoTelefone = codtipoTelefone;
        this.descricao = descricao;
    }

    public Integer getCodtipoTelefone() {
        return codtipoTelefone;
    }

    public void setCodtipoTelefone(Integer codtipoTelefone) {
        this.codtipoTelefone = codtipoTelefone;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public List<Telefone> getTelefoneList() {
        return telefoneList;
    }

    public void setTelefoneList(List<Telefone> telefoneList) {
        this.telefoneList = telefoneList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codtipoTelefone != null ? codtipoTelefone.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoTelefone)) {
            return false;
        }
        TipoTelefone other = (TipoTelefone) object;
        if ((this.codtipoTelefone == null && other.codtipoTelefone != null) || (this.codtipoTelefone != null && !this.codtipoTelefone.equals(other.codtipoTelefone))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.TipoTelefone[ codtipoTelefone=" + codtipoTelefone + " ]";
    }
    
}
