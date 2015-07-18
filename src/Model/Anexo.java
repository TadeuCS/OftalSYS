/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tadeu
 */
@Entity
@Table(name = "anexo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Anexo.findAll", query = "SELECT a FROM Anexo a"),
    @NamedQuery(name = "Anexo.findByCodanexo", query = "SELECT a FROM Anexo a WHERE a.codanexo = :codanexo"),
    @NamedQuery(name = "Anexo.findByDescricao", query = "SELECT a FROM Anexo a WHERE a.descricao = :descricao")})
public class Anexo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODANEXO")
    private Integer codanexo;
    @Column(name = "DESCRICAO")
    private String descricao;
    @JoinColumn(name = "CODATENDIMENTO", referencedColumnName = "CODATENDIMENTO")
    @ManyToOne(optional = false)
    private Atendimento codatendimento;

    public Anexo() {
    }

    public Anexo(Integer codanexo) {
        this.codanexo = codanexo;
    }

    public Integer getCodanexo() {
        return codanexo;
    }

    public void setCodanexo(Integer codanexo) {
        this.codanexo = codanexo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Atendimento getCodatendimento() {
        return codatendimento;
    }

    public void setCodatendimento(Atendimento codatendimento) {
        this.codatendimento = codatendimento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codanexo != null ? codanexo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anexo)) {
            return false;
        }
        Anexo other = (Anexo) object;
        if ((this.codanexo == null && other.codanexo != null) || (this.codanexo != null && !this.codanexo.equals(other.codanexo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Anexo[ codanexo=" + codanexo + " ]";
    }
    
}
