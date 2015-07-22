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
@Table(name = "telefone")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telefone.findAll", query = "SELECT t FROM Telefone t"),
    @NamedQuery(name = "Telefone.findByCodtelefone", query = "SELECT t FROM Telefone t WHERE t.codtelefone = :codtelefone"),
    @NamedQuery(name = "Telefone.findByPaciente", query = "SELECT t FROM Telefone t WHERE t.codpaciente = :codpaciente"),
    @NamedQuery(name = "Telefone.findByNumero", query = "SELECT t FROM Telefone t WHERE t.numero = :numero")})
public class Telefone implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODTELEFONE")
    private Integer codtelefone;
    @Column(name = "NUMERO",unique = true,nullable = false)
    private String numero;
    @JoinColumn(name = "CODPACIENTE", referencedColumnName = "CODPACIENTE")
    @ManyToOne
    private Paciente codpaciente;
    @JoinColumn(name = "CODFORNECEDOR", referencedColumnName = "CODFORNECEDOR")
    @ManyToOne
    private Fornecedor codfornecedor;
    @JoinColumn(name = "CODTIPO_TELEFONE", referencedColumnName = "CODTIPO_TELEFONE")
    @ManyToOne(optional = false)
    private TipoTelefone codtipoTelefone;

    public Telefone() {
    }

    public Telefone(Integer codtelefone) {
        this.codtelefone = codtelefone;
    }

    public Telefone(Integer codtelefone, String numero) {
        this.codtelefone = codtelefone;
        this.numero = numero;
    }

    public Integer getCodtelefone() {
        return codtelefone;
    }

    public void setCodtelefone(Integer codtelefone) {
        this.codtelefone = codtelefone;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Paciente getCodpaciente() {
        return codpaciente;
    }

    public void setCodpaciente(Paciente codpaciente) {
        this.codpaciente = codpaciente;
    }

    public Fornecedor getCodfornecedor() {
        return codfornecedor;
    }

    public void setCodfornecedor(Fornecedor codfornecedor) {
        this.codfornecedor = codfornecedor;
    }

    public TipoTelefone getCodtipoTelefone() {
        return codtipoTelefone;
    }

    public void setCodtipoTelefone(TipoTelefone codtipoTelefone) {
        this.codtipoTelefone = codtipoTelefone;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codtelefone != null ? codtelefone.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefone)) {
            return false;
        }
        Telefone other = (Telefone) object;
        if ((this.codtelefone == null && other.codtelefone != null) || (this.codtelefone != null && !this.codtelefone.equals(other.codtelefone))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Telefone[ codtelefone=" + codtelefone + " ]";
    }
    
}
