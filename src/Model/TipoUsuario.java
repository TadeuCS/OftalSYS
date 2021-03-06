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
@Table(name = "tipo_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoUsuario.findAll", query = "SELECT t FROM TipoUsuario t"),
    @NamedQuery(name = "TipoUsuario.findByCodtipoUsuario", query = "SELECT t FROM TipoUsuario t WHERE t.codtipoUsuario = :codtipoUsuario"),
    @NamedQuery(name = "TipoUsuario.findByDescricao", query = "SELECT t FROM TipoUsuario t WHERE t.descricao = :descricao")})
public class TipoUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODTIPO_USUARIO")
    private Integer codtipoUsuario;
    @Column(name = "DESCRICAO",unique = true,length = 100)
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codtipoUsuario")
    private List<Usuario> usuarioList;

    public TipoUsuario() {
    }

    public TipoUsuario(Integer codtipoUsuario) {
        this.codtipoUsuario = codtipoUsuario;
    }

    public TipoUsuario(Integer codtipoUsuario, String descricao) {
        this.codtipoUsuario = codtipoUsuario;
        this.descricao = descricao;
    }

    public Integer getCodtipoUsuario() {
        return codtipoUsuario;
    }

    public void setCodtipoUsuario(Integer codtipoUsuario) {
        this.codtipoUsuario = codtipoUsuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codtipoUsuario != null ? codtipoUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoUsuario)) {
            return false;
        }
        TipoUsuario other = (TipoUsuario) object;
        if ((this.codtipoUsuario == null && other.codtipoUsuario != null) || (this.codtipoUsuario != null && !this.codtipoUsuario.equals(other.codtipoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.TipoUsuario[ codtipoUsuario=" + codtipoUsuario + " ]";
    }
    
}
