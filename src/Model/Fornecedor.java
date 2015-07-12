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
@Table(name = "fornecedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fornecedor.findAll", query = "SELECT f FROM Fornecedor f"),
    @NamedQuery(name = "Fornecedor.findByCodfornecedor", query = "SELECT f FROM Fornecedor f WHERE f.codfornecedor = :codfornecedor"),
    @NamedQuery(name = "Fornecedor.findByNome", query = "SELECT f FROM Fornecedor f WHERE f.nome = :nome"),
    @NamedQuery(name = "Fornecedor.findByCpfCnpj", query = "SELECT f FROM Fornecedor f WHERE f.cpfCnpj = :cpfCnpj")})
public class Fornecedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODFORNECEDOR")
    private Integer codfornecedor;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @Column(name = "CPF_CNPJ")
    private String cpfCnpj;
    @OneToMany(mappedBy = "codfornecedor")
    private List<Telefone> telefoneList;
    @OneToMany(mappedBy = "codfornecedor")
    private List<Endereco> enderecoList;

    public Fornecedor() {
    }

    public Fornecedor(Integer codfornecedor) {
        this.codfornecedor = codfornecedor;
    }

    public Fornecedor(Integer codfornecedor, String nome) {
        this.codfornecedor = codfornecedor;
        this.nome = nome;
    }

    public Integer getCodfornecedor() {
        return codfornecedor;
    }

    public void setCodfornecedor(Integer codfornecedor) {
        this.codfornecedor = codfornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    @XmlTransient
    public List<Telefone> getTelefoneList() {
        return telefoneList;
    }

    public void setTelefoneList(List<Telefone> telefoneList) {
        this.telefoneList = telefoneList;
    }

    @XmlTransient
    public List<Endereco> getEnderecoList() {
        return enderecoList;
    }

    public void setEnderecoList(List<Endereco> enderecoList) {
        this.enderecoList = enderecoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codfornecedor != null ? codfornecedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
        if ((this.codfornecedor == null && other.codfornecedor != null) || (this.codfornecedor != null && !this.codfornecedor.equals(other.codfornecedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Fornecedor[ codfornecedor=" + codfornecedor + " ]";
    }
    
}
