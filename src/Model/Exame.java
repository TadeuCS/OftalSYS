/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "exame")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Exame.findAll", query = "SELECT c FROM Exame c"),
    @NamedQuery(name = "Exame.findByCodExame", query = "SELECT c FROM Exame c WHERE c.codExame = :codexame"),
    @NamedQuery(name = "Exame.findByDescricao", query = "SELECT c FROM Exame c WHERE c.descricao = :descricao")})
public class Exame implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODEXAME")
    private Integer codExame;
    @Column(name = "DESCRICAO",unique = true,nullable = false,length = 200)
    private String descricao;

    public Integer getCodExame() {
        return codExame;
    }

    public void setCodExame(Integer codExame) {
        this.codExame = codExame;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getId() {
        return codExame;
    }

    public void setId(Integer id) {
        this.codExame = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codExame != null ? codExame.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the codExame fields are not set
        if (!(object instanceof Exame)) {
            return false;
        }
        Exame other = (Exame) object;
        if ((this.codExame == null && other.codExame != null) || (this.codExame != null && !this.codExame.equals(other.codExame))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.TipoExame[ id=" + codExame + " ]";
    }
    
}
