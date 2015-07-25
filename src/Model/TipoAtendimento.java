/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.List;
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
@Table(name = "tipo_atendimento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoAtendimento.findAll", query = "SELECT t FROM TipoAtendimento t"),
    @NamedQuery(name = "TipoAtendimento.findByCodtipoAtendimento", query = "SELECT t FROM TipoAtendimento t WHERE t.codtipoAtendimento = :codtipoAtendimento"),
    @NamedQuery(name = "TipoAtendimento.findByDescricao", query = "SELECT t FROM TipoAtendimento t WHERE t.descricao = :descricao")})
public class TipoAtendimento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODTIPO_ATENDIMENTO")
    private Integer codtipoAtendimento;
    @Column(name = "DESCRICAO",nullable = false,unique = true,length = 100)
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codtipoAtendimento")
    private List<Atendimento> atendimentoList;
        
    public TipoAtendimento() {
    }

    public TipoAtendimento(Integer codtipoAtendimento) {
        this.codtipoAtendimento = codtipoAtendimento;
    }

    public TipoAtendimento(Integer codtipoAtendimento, String descricao) {
        this.codtipoAtendimento = codtipoAtendimento;
        this.descricao = descricao;
    }

    public Integer getCodtipoAtendimento() {
        return codtipoAtendimento;
    }

    public void setCodtipoAtendimento(Integer codtipoAtendimento) {
        this.codtipoAtendimento = codtipoAtendimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public List<Atendimento> getAtendimentoList() {
        return atendimentoList;
    }

    public void setAtendimentoList(List<Atendimento> atendimentoList) {
        this.atendimentoList = atendimentoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codtipoAtendimento != null ? codtipoAtendimento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoAtendimento)) {
            return false;
        }
        TipoAtendimento other = (TipoAtendimento) object;
        if ((this.codtipoAtendimento == null && other.codtipoAtendimento != null) || (this.codtipoAtendimento != null && !this.codtipoAtendimento.equals(other.codtipoAtendimento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.TipoAtendimento[ codtipoAtendimento=" + codtipoAtendimento + " ]";
    }
    
}
