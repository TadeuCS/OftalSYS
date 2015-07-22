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
@Table(name = "status_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StatusUsuario.findAll", query = "SELECT s FROM StatusUsuario s"),
    @NamedQuery(name = "StatusUsuario.findByCodstatusUsuario", query = "SELECT s FROM StatusUsuario s WHERE s.codstatusUsuario = :codstatusUsuario"),
    @NamedQuery(name = "StatusUsuario.findByDescricao", query = "SELECT s FROM StatusUsuario s WHERE s.descricao = :descricao")})
public class StatusUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODSTATUS_USUARIO")
    private Integer codstatusUsuario;
    @Column(name = "DESCRICAO",unique = true,length = 20)
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codstatusUsuario")
    private List<Usuario> usuarioList;

    public StatusUsuario() {
    }

    public StatusUsuario(Integer codstatusUsuario) {
        this.codstatusUsuario = codstatusUsuario;
    }

    public StatusUsuario(Integer codstatusUsuario, String descricao) {
        this.codstatusUsuario = codstatusUsuario;
        this.descricao = descricao;
    }

    public Integer getCodstatusUsuario() {
        return codstatusUsuario;
    }

    public void setCodstatusUsuario(Integer codstatusUsuario) {
        this.codstatusUsuario = codstatusUsuario;
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
        hash += (codstatusUsuario != null ? codstatusUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StatusUsuario)) {
            return false;
        }
        StatusUsuario other = (StatusUsuario) object;
        if ((this.codstatusUsuario == null && other.codstatusUsuario != null) || (this.codstatusUsuario != null && !this.codstatusUsuario.equals(other.codstatusUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.StatusUsuario[ codstatusUsuario=" + codstatusUsuario + " ]";
    }
    
}
