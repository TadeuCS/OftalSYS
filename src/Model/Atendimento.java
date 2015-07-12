/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tadeu
 */
@Entity
@Table(name = "atendimento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Atendimento.findAll", query = "SELECT a FROM Atendimento a"),
    @NamedQuery(name = "Atendimento.findByCodatendimento", query = "SELECT a FROM Atendimento a WHERE a.codatendimento = :codatendimento"),
    @NamedQuery(name = "Atendimento.findByDtAtendimento", query = "SELECT a FROM Atendimento a WHERE a.dtAtendimento = :dtAtendimento"),
    @NamedQuery(name = "Atendimento.findByDtRetorno", query = "SELECT a FROM Atendimento a WHERE a.dtRetorno = :dtRetorno"),
    @NamedQuery(name = "Atendimento.findByQueixa", query = "SELECT a FROM Atendimento a WHERE a.queixa = :queixa")})
public class Atendimento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODATENDIMENTO")
    private Integer codatendimento;
    @Basic(optional = false)
    @Column(name = "DT_ATENDIMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAtendimento;
    @Column(name = "DT_RETORNO")
    @Temporal(TemporalType.DATE)
    private Date dtRetorno;
    @Column(name = "QUEIXA")
    private String queixa;
    @JoinColumn(name = "CODRECEITA_OCULOS", referencedColumnName = "CODRECEITA_OCULOS")
    @ManyToOne
    private ReceitaOculos codreceitaOculos;
    @JoinColumn(name = "CODPACIENTE", referencedColumnName = "CODPACIENTE")
    @ManyToOne(optional = false)
    private Paciente codpaciente;
    @JoinColumn(name = "CODMEDICO", referencedColumnName = "CODUSUARIO")
    @ManyToOne(optional = false)
    private Usuario codmedico;
    @JoinColumn(name = "CODTIPO_ATENDIMENTO", referencedColumnName = "CODTIPO_ATENDIMENTO")
    @ManyToOne(optional = false)
    private TipoAtendimento codtipoAtendimento;
    @JoinColumn(name = "CODSTATUS_ATENDIMENTO", referencedColumnName = "CODSTATUS_ATENDIMENTO")
    @ManyToOne(optional = false)
    private StatusAtendimento codstatusAtendimento;

    public Atendimento() {
    }

    public Atendimento(Integer codatendimento) {
        this.codatendimento = codatendimento;
    }

    public Atendimento(Integer codatendimento, Date dtAtendimento) {
        this.codatendimento = codatendimento;
        this.dtAtendimento = dtAtendimento;
    }

    public Integer getCodatendimento() {
        return codatendimento;
    }

    public void setCodatendimento(Integer codatendimento) {
        this.codatendimento = codatendimento;
    }

    public Date getDtAtendimento() {
        return dtAtendimento;
    }

    public void setDtAtendimento(Date dtAtendimento) {
        this.dtAtendimento = dtAtendimento;
    }

    public Date getDtRetorno() {
        return dtRetorno;
    }

    public void setDtRetorno(Date dtRetorno) {
        this.dtRetorno = dtRetorno;
    }

    public String getQueixa() {
        return queixa;
    }

    public void setQueixa(String queixa) {
        this.queixa = queixa;
    }

    public ReceitaOculos getCodreceitaOculos() {
        return codreceitaOculos;
    }

    public void setCodreceitaOculos(ReceitaOculos codreceitaOculos) {
        this.codreceitaOculos = codreceitaOculos;
    }

    public Paciente getCodpaciente() {
        return codpaciente;
    }

    public void setCodpaciente(Paciente codpaciente) {
        this.codpaciente = codpaciente;
    }

    public Usuario getCodmedico() {
        return codmedico;
    }

    public void setCodmedico(Usuario codmedico) {
        this.codmedico = codmedico;
    }

    public TipoAtendimento getCodtipoAtendimento() {
        return codtipoAtendimento;
    }

    public void setCodtipoAtendimento(TipoAtendimento codtipoAtendimento) {
        this.codtipoAtendimento = codtipoAtendimento;
    }

    public StatusAtendimento getCodstatusAtendimento() {
        return codstatusAtendimento;
    }

    public void setCodstatusAtendimento(StatusAtendimento codstatusAtendimento) {
        this.codstatusAtendimento = codstatusAtendimento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codatendimento != null ? codatendimento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Atendimento)) {
            return false;
        }
        Atendimento other = (Atendimento) object;
        if ((this.codatendimento == null && other.codatendimento != null) || (this.codatendimento != null && !this.codatendimento.equals(other.codatendimento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Atendimento[ codatendimento=" + codatendimento + " ]";
    }
    
}
