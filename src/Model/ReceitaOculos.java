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
@Table(name = "receita_oculos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReceitaOculos.findAll", query = "SELECT r FROM ReceitaOculos r"),
    @NamedQuery(name = "ReceitaOculos.findByCodreceitaOculos", query = "SELECT r FROM ReceitaOculos r WHERE r.codreceitaOculos = :codreceitaOculos"),
    @NamedQuery(name = "ReceitaOculos.findByObservacao", query = "SELECT r FROM ReceitaOculos r WHERE r.observacao = :observacao")})
public class ReceitaOculos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODRECEITA_OCULOS")
    private Integer codreceitaOculos;
    @Column(name = "OBSERVACAO")
    private String observacao;
    @OneToMany(mappedBy = "codreceitaOculos")
    private List<Atendimento> atendimentoList;

    public ReceitaOculos() {
    }

    public ReceitaOculos(Integer codreceitaOculos) {
        this.codreceitaOculos = codreceitaOculos;
    }

    public Integer getCodreceitaOculos() {
        return codreceitaOculos;
    }

    public void setCodreceitaOculos(Integer codreceitaOculos) {
        this.codreceitaOculos = codreceitaOculos;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
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
        hash += (codreceitaOculos != null ? codreceitaOculos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReceitaOculos)) {
            return false;
        }
        ReceitaOculos other = (ReceitaOculos) object;
        if ((this.codreceitaOculos == null && other.codreceitaOculos != null) || (this.codreceitaOculos != null && !this.codreceitaOculos.equals(other.codreceitaOculos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.ReceitaOculos[ codreceitaOculos=" + codreceitaOculos + " ]";
    }
    
}
