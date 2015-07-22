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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByCodusuario", query = "SELECT u FROM Usuario u WHERE u.codusuario = :codusuario"),
    @NamedQuery(name = "Usuario.findByCodTipoUsuario", query = "SELECT u FROM Usuario u WHERE u.codtipoUsuario = :codtipousuario"),
    @NamedQuery(name = "Usuario.findByUsuario", query = "SELECT u FROM Usuario u WHERE u.usuario = :usuario"),
    @NamedQuery(name = "Usuario.findBySenha", query = "SELECT u FROM Usuario u WHERE u.senha = :senha")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODUSUARIO")
    private Integer codusuario;
    @Column(name = "USUARIO", unique = true, nullable = false, length = 20)
    private String usuario;
    @Column(name = "SENHA", nullable = false)
    private String senha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codmedico")
    private List<Atendimento> atendimentoList;
    @JoinColumn(name = "CODSTATUS_USUARIO", referencedColumnName = "CODSTATUS_USUARIO")
    @ManyToOne(optional = false)
    private StatusUsuario codstatusUsuario;
    @JoinColumn(name = "CODTIPO_USUARIO", referencedColumnName = "CODTIPO_USUARIO")
    @ManyToOne(optional = false)
    private TipoUsuario codtipoUsuario;

    public Usuario() {
    }

    public Usuario(Integer codusuario) {
        this.codusuario = codusuario;
    }

    public Usuario(Integer codusuario, String usuario, String senha) {
        this.codusuario = codusuario;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Integer getCodusuario() {
        return codusuario;
    }

    public void setCodusuario(Integer codusuario) {
        this.codusuario = codusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @XmlTransient
    public List<Atendimento> getAtendimentoList() {
        return atendimentoList;
    }

    public void setAtendimentoList(List<Atendimento> atendimentoList) {
        this.atendimentoList = atendimentoList;
    }

    public StatusUsuario getCodstatusUsuario() {
        return codstatusUsuario;
    }

    public void setCodstatusUsuario(StatusUsuario codstatusUsuario) {
        this.codstatusUsuario = codstatusUsuario;
    }

    public TipoUsuario getCodtipoUsuario() {
        return codtipoUsuario;
    }

    public void setCodtipoUsuario(TipoUsuario codtipoUsuario) {
        this.codtipoUsuario = codtipoUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codusuario != null ? codusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.codusuario == null && other.codusuario != null) || (this.codusuario != null && !this.codusuario.equals(other.codusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Usuario[ codusuario=" + codusuario + " ]";
    }

}
