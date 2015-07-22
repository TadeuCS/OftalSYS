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
@Table(name = "status_atendimento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StatusAtendimento.findAll", query = "SELECT s FROM StatusAtendimento s"),
    @NamedQuery(name = "StatusAtendimento.findByCodstatusAtendimento", query = "SELECT s FROM StatusAtendimento s WHERE s.codstatusAtendimento = :codstatusAtendimento"),
    @NamedQuery(name = "StatusAtendimento.findByDescricao", query = "SELECT s FROM StatusAtendimento s WHERE s.descricao = :descricao")})
public class StatusAtendimento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODSTATUS_ATENDIMENTO")
    private Integer codstatusAtendimento;
    @Column(name = "DESCRICAO",unique = true,length = 150)
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codstatusAtendimento")
    private List<Atendimento> atendimentoList;

    public StatusAtendimento() {
    }

    public StatusAtendimento(Integer codstatusAtendimento) {
        this.codstatusAtendimento = codstatusAtendimento;
    }

    public StatusAtendimento(Integer codstatusAtendimento, String descricao) {
        this.codstatusAtendimento = codstatusAtendimento;
        this.descricao = descricao;
    }

    public Integer getCodstatusAtendimento() {
        return codstatusAtendimento;
    }

    public void setCodstatusAtendimento(Integer codstatusAtendimento) {
        this.codstatusAtendimento = codstatusAtendimento;
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
        hash += (codstatusAtendimento != null ? codstatusAtendimento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StatusAtendimento)) {
            return false;
        }
        StatusAtendimento other = (StatusAtendimento) object;
        if ((this.codstatusAtendimento == null && other.codstatusAtendimento != null) || (this.codstatusAtendimento != null && !this.codstatusAtendimento.equals(other.codstatusAtendimento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.StatusAtendimento[ codstatusAtendimento=" + codstatusAtendimento + " ]";
    }
    
}
