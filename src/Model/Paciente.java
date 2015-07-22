/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Tadeu
 */
@Entity
@Table(name = "paciente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p ORDER BY p.nome"),
    @NamedQuery(name = "Paciente.findByCodpaciente", query = "SELECT p FROM Paciente p WHERE p.codpaciente = :codpaciente"),
    @NamedQuery(name = "Paciente.findByNome", query = "SELECT p FROM Paciente p WHERE p.nome = :nome"),
    @NamedQuery(name = "Paciente.findByDtNascimento", query = "SELECT p FROM Paciente p WHERE p.dtNascimento = :dtNascimento"),
    @NamedQuery(name = "Paciente.findByCpf", query = "SELECT p FROM Paciente p WHERE p.cpf = :cpf"),
    @NamedQuery(name = "Paciente.findByRg", query = "SELECT p FROM Paciente p WHERE p.rg = :rg"),
    @NamedQuery(name = "Paciente.findBySexo", query = "SELECT p FROM Paciente p WHERE p.sexo = :sexo"),
    @NamedQuery(name = "Paciente.findByEmail", query = "SELECT p FROM Paciente p WHERE p.email = :email"),
    @NamedQuery(name = "Paciente.findByNaturalidade", query = "SELECT p FROM Paciente p WHERE p.naturalidade = :naturalidade"),
    @NamedQuery(name = "Paciente.findByPlano", query = "SELECT p FROM Paciente p WHERE p.plano = :plano"),
    @NamedQuery(name = "Paciente.findByNumCarteira", query = "SELECT p FROM Paciente p WHERE p.numCarteira = :numCarteira"),
    @NamedQuery(name = "Paciente.findByObservacao", query = "SELECT p FROM Paciente p WHERE p.observacao = :observacao"),
    @NamedQuery(name = "Paciente.findByAtivo", query = "SELECT p FROM Paciente p WHERE p.ativo = :ativo")})
public class Paciente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODPACIENTE")
    private Integer codpaciente;
    @Column(name = "NOME",nullable = false)
    private String nome;
    @Column(name = "DT_NASCIMENTO",nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtNascimento;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "RG",nullable = false)
    private String rg;
    @Column(name = "SEXO",nullable = true)
    private Character sexo;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "NATURALIDADE")
    private String naturalidade;
    @Column(name = "PLANO")
    private String plano;
    @Column(name = "NUM_CARTEIRA")
    private Integer numCarteira;
    @Column(name = "OBSERVACAO")
    private String observacao;
    @Column(name = "ATIVO",nullable = false)
    private Character ativo;
    @JoinColumn(name = "CODCONVENIO", referencedColumnName = "CODCONVENIO")
    @ManyToOne
    private Convenio codconvenio;
    @JoinColumn(name = "CODCOR", referencedColumnName = "CODCOR")
    @ManyToOne
    private Cor codcor;
    @JoinColumn(name = "CODPROFISSAO", referencedColumnName = "CODPROFISSAO")
    @ManyToOne
    private Profissao codprofissao;
    @JoinColumn(name = "CODESTADO_CIVIL", referencedColumnName = "CODESTADO_CIVIL")
    @ManyToOne(optional = false)
    private EstadoCivil codestadoCivil;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codpaciente")
    private List<Atendimento> atendimentoList=new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codpaciente")
    private List<Endereco> enderecoList=new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codpaciente")
    private List<Telefone> telefoneList=new ArrayList<>();

    public Paciente() {
    }

    public Paciente(Integer codpaciente) {
        this.codpaciente = codpaciente;
    }

    public Paciente(Integer codpaciente, String nome, Date dtNascimento, Character sexo, Character ativo) {
        this.codpaciente = codpaciente;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
        this.ativo = ativo;
    }

    public List<Endereco> getEnderecoList() {
        return enderecoList;
    }

    public void setEnderecoList(List<Endereco> enderecoList) {
        this.enderecoList = enderecoList;
    }

    public List<Telefone> getTelefoneList() {
        return telefoneList;
    }

    public void setTelefoneList(List<Telefone> telefoneList) {
        this.telefoneList = telefoneList;
    }

    public Integer getCodpaciente() {
        return codpaciente;
    }

    public void setCodpaciente(Integer codpaciente) {
        this.codpaciente = codpaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public Integer getNumCarteira() {
        return numCarteira;
    }

    public void setNumCarteira(Integer numCarteira) {
        this.numCarteira = numCarteira;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Character getAtivo() {
        return ativo;
    }

    public void setAtivo(Character ativo) {
        this.ativo = ativo;
    }

    public Convenio getCodconvenio() {
        return codconvenio;
    }

    public void setCodconvenio(Convenio codconvenio) {
        this.codconvenio = codconvenio;
    }

    public Cor getCodcor() {
        return codcor;
    }

    public void setCodcor(Cor codcor) {
        this.codcor = codcor;
    }

    public Profissao getCodprofissao() {
        return codprofissao;
    }

    public void setCodprofissao(Profissao codprofissao) {
        this.codprofissao = codprofissao;
    }

    public EstadoCivil getCodestadoCivil() {
        return codestadoCivil;
    }

    public void setCodestadoCivil(EstadoCivil codestadoCivil) {
        this.codestadoCivil = codestadoCivil;
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
        hash += (codpaciente != null ? codpaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.codpaciente == null && other.codpaciente != null) || (this.codpaciente != null && !this.codpaciente.equals(other.codpaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Paciente[ codpaciente=" + codpaciente + " ]";
    }
    
}
